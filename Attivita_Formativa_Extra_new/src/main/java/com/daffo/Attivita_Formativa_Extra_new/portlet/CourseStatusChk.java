package com.daffo.Attivita_Formativa_Extra_new.portlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.StringTokenizer;

import javax.portlet.PortletException;

import com.daffo.suilupposervice.model.suiluppo_course;
import com.daffo.suilupposervice.model.suiluppo_room_allocation;
import com.daffo.suilupposervice.model.suiluppo_room_allocation_archive;
import com.daffo.suilupposervice.service.suiluppo_courseLocalServiceUtil;
import com.daffo.suilupposervice.service.suiluppo_room_allocationLocalServiceUtil;
import com.daffo.suilupposervice.service.suiluppo_room_allocation_archiveLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.roomservice.model.BookedEquipment;
import com.roomservice.service.BookedEquipmentLocalServiceUtil;
import com.roomservice.service.EquipmentLocalServiceUtil;


public class CourseStatusChk {

	private Log logger=LogFactoryUtil.getLog("Course Status Check");
	
	public boolean checkValid(long courseId) throws PortalException{
	suiluppo_course sc=suiluppo_courseLocalServiceUtil.getsuiluppo_course(courseId);
	String cDate="";
	String newDate="";
	if(sc.getBloccato().equalsIgnoreCase("true")){
		return true;
	}
	else if(sc.getVisibile().equalsIgnoreCase("false")){
		return true;
	}
	else if(sc.getBloccato().equalsIgnoreCase("false")&&sc.getVisibile().equalsIgnoreCase("true")){
		Date c_date=null;
		Date new_date=null;
		try{
		cDate=sc.getData_Fine();
		newDate=new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date());
		c_date=new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(cDate);
		new_date=new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(newDate);
//		System.out.println(cDate);
//		System.out.println(newDate);
//		System.out.println(c_date);
//		System.out.println(new_date);
		}catch (Exception e) {
			logger.error(e.getMessage());
			return true;
		}
		if(c_date.after(new_date)){
			return false;
		}
		else{
			return true;
		}
	}
	return false;
}
	public boolean UpdateRoomAllocation(long roomalloID) throws PortalException {
		
		suiluppo_room_allocation su=suiluppo_room_allocationLocalServiceUtil.getsuiluppo_room_allocation(roomalloID);
		suiluppo_room_allocation_archive sm=suiluppo_room_allocation_archiveLocalServiceUtil.createsuiluppo_room_allocation_archive(CounterLocalServiceUtil.increment());
		sm.setCourse_id(su.getCourse_id());
		sm.setRoomID(su.getRoomID());
		sm.setRoom_allocat_date(su.getRoom_allocat_date());
		sm.setRoom_allocat_start(su.getRoom_allocat_start());
		sm.setRoom_allocat_startTime(su.getRoom_allocat_startTime());
		sm.setRoom_allocat_endTime(su.getRoom_allocat_endTime());
		sm.setRoom_allocat_status("Now This Room free and Booking Invalidate");
		sm.setRoom_allocat_end(su.getRoom_allocat_end());
		sm.setRoom_archive_date(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()).toString());
		suiluppo_room_allocation_archiveLocalServiceUtil.updatesuiluppo_room_allocation_archive(sm);
		suiluppo_room_allocationLocalServiceUtil.deletesuiluppo_room_allocation(roomalloID);
		updateEquipmentAllocation(su.getCourse_id());
		return true;
	}
	
	public boolean updateEquipmentAllocation(long CourseId) throws PortalException{
	  
		DynamicQuery bookequ=BookedEquipmentLocalServiceUtil.dynamicQuery();
		bookequ.add(RestrictionsFactoryUtil.eq("course_id", CourseId));
		List<BookedEquipment> bk=BookedEquipmentLocalServiceUtil.dynamicQuery(bookequ);
		for(BookedEquipment b:bk){
			BookedEquipmentLocalServiceUtil.deleteBookedEquipment(b.getBooked_equip_id());
		}
		return true;
	}
	
	public boolean checkAlreadBooked(long cid,long rid){	
		DynamicQuery userQuery = suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
		userQuery.add(RestrictionsFactoryUtil.eq("room_allocat_status", "Booked"));
		userQuery.add(RestrictionsFactoryUtil.eq("roomID", rid));
		userQuery.add(RestrictionsFactoryUtil.eq("course_id", cid));
		List<suiluppo_room_allocation> sur= suiluppo_room_allocationLocalServiceUtil.dynamicQuery(userQuery);
		if(sur.size()>0){
			return true;
		}
		return false;
	}
	public boolean checkAlreadBooked(long rid){
		
		DynamicQuery userQuery = suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
		userQuery.add(RestrictionsFactoryUtil.eq("room_allocat_status", "Booked"));
		userQuery.add(RestrictionsFactoryUtil.eq("roomID",rid));
		List<suiluppo_room_allocation> sur= suiluppo_room_allocationLocalServiceUtil.dynamicQuery(userQuery);
		if(sur.size()>0){
			return true;
		}
		return false;
	}
public boolean checkAlreadCourseBooked(long cid){
		
		DynamicQuery userQuery = suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
		userQuery.add(RestrictionsFactoryUtil.eq("room_allocat_status", "Booked"));
		userQuery.add(RestrictionsFactoryUtil.eq("course_id", cid));
		List<suiluppo_room_allocation> sur= suiluppo_room_allocationLocalServiceUtil.dynamicQuery(userQuery);
		if(sur.size()>0){
			return true;
		
		}
		return false;
	}
		
}

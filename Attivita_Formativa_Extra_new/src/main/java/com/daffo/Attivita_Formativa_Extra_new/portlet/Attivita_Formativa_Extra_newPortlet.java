package com.daffo.Attivita_Formativa_Extra_new.portlet;


import com.daffo.suilupposervice.model.suiluppo_application;
import com.daffo.suilupposervice.model.suiluppo_course;
import com.daffo.suilupposervice.model.suiluppo_room;
import com.daffo.suilupposervice.model.suiluppo_room_allocation;
import com.daffo.suilupposervice.service.suiluppo_applicationLocalServiceUtil;
import com.daffo.suilupposervice.service.suiluppo_courseLocalServiceUtil;
import com.daffo.suilupposervice.service.suiluppo_roomLocalServiceUtil;
import com.daffo.suilupposervice.service.suiluppo_room_allocationLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.roomservice.model.BookedEquipment;
import com.roomservice.model.Equipment;
import com.roomservice.service.BookedEquipmentLocalServiceUtil;
import com.roomservice.service.EquipmentLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Administrator
 */
@Component(
	immediate = true,
	property = {
			"com.liferay.portlet.display-category=Naveen Apps-UnitaOperative",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Attivita_Formativa_Extra_new Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class Attivita_Formativa_Extra_newPortlet extends MVCPortlet {
	private final static Log log=LogFactoryUtil.getLog(Attivita_Formativa_Extra_newPortlet.class);
	
	private FileUpload_ServiceClass fus=new FileUpload_ServiceClass();
	@ProcessAction(name="newRoom")
	 public void newRoom(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException {
		String txt_room=ParamUtil.getString(actionRequest, "txt-room");
		String txt_des=ParamUtil.getString(actionRequest, "txt-des");
		suiluppo_room sr=suiluppo_roomLocalServiceUtil.createsuiluppo_room(CounterLocalServiceUtil.increment());
		sr.setRoom_name(txt_room);
		sr.setRoom_description(txt_des);
		suiluppo_roomLocalServiceUtil.updatesuiluppo_room(sr);
		SessionMessages.add(actionRequest, "success");
	}
	
	
	@ProcessAction(name="editRoom")
	 public void editRoom(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException {
		long roomId=ParamUtil.getLong(actionRequest, "roomId");
		String txt_room=ParamUtil.getString(actionRequest, "txt-room");
		String txt_des=ParamUtil.getString(actionRequest, "txt-des");
		suiluppo_room sr=suiluppo_roomLocalServiceUtil.getsuiluppo_room(roomId);
		sr.setRoom_name(txt_room);
		sr.setRoom_description(txt_des);
		suiluppo_roomLocalServiceUtil.updatesuiluppo_room(sr);
		SessionMessages.add(actionRequest, "success");
		actionResponse.setRenderParameter("roomId", ParamUtil.getString(actionRequest, "roomId"));
		
	}
	
	public void EquipmentSubmit(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		int quantity = ParamUtil.getInteger(request, "quantity");
		String equipment_name = ParamUtil.getString(request, "equipment_name");
		String equipDesc = ParamUtil.getString(request, "equipDesc");
		try {
			Equipment equip= EquipmentLocalServiceUtil.createEquipment(CounterLocalServiceUtil.increment());
			equip.setEquip_quantity(quantity);
			equip.setEquipment_name(equipment_name);
			equip.setEquip_description(equipDesc);
			EquipmentLocalServiceUtil.addEquipment(equip);
			SessionMessages.add(request, "success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void EquipmentEdit(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		long equipId=ParamUtil.getLong(request, "equipId");
		int quantity = ParamUtil.getInteger(request, "quantity");
		String equipment_name = ParamUtil.getString(request, "equipment_name");
		String equipDesc = ParamUtil.getString(request, "equipDesc");
		try {
			Equipment equip= EquipmentLocalServiceUtil.getEquipment(equipId);
			equip.setEquip_quantity(quantity);
			equip.setEquipment_name(equipment_name);
			equip.setEquip_description(equipDesc);
			EquipmentLocalServiceUtil.updateEquipment(equip);
			response.setRenderParameter("equipId", ParamUtil.getString(request, "equipId"));
			SessionMessages.add(request, "success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	@ProcessAction(name="equipDelete")
	public void equipDelete(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		long equipId = ParamUtil.getLong(request, "equipId");
		try {
			EquipmentLocalServiceUtil.deleteEquipment(equipId);
			log.info("Equipment Deleted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@ProcessAction(name="roomDelete")
	public void roomDelete(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		long roomID = ParamUtil.getLong(request, "roomID");
		try {
			suiluppo_roomLocalServiceUtil.deletesuiluppo_room(roomID);
			log.info("Room Deleted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@ProcessAction(name="formSubmit")
	 public void formSubmit(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		fus.createFolder(actionRequest, themeDisplay);
		String fileName=fus.fileUpload(themeDisplay, actionRequest,"Dispensa_corso");
		if(!fileName.isEmpty())
		{
			if(fileName.equalsIgnoreCase("blank")){
			log.error("File Name is Blank{"+fileName+"}");
				return;
			}else if(fileName.equalsIgnoreCase("No Extension")){
			log.error("File format is Missing..{"+fileName+"}");
				return;
			}
			log.info("Created File {"+fileName+"}");
			String downLink=fus.getFileLink(themeDisplay, fileName).get( fileName);
			log.info("Download Link {"+downLink+"}");	
			log.info("Now table is Updating.....");
			suiluppo_course cs=suiluppo_courseLocalServiceUtil.createsuiluppo_course(CounterLocalServiceUtil.increment());
			System.out.println(cs.getCourse_id());
			cs.setDocente(ParamUtil.getString(actionRequest, "Docente"));
			cs.setEvento_Progetto(ParamUtil.getString(actionRequest, "Evento_Progetto"));
			cs.setTitolo(ParamUtil.getString(actionRequest, "Titolo"));
			cs.setDescrizione(ParamUtil.getString(actionRequest, "Descrizione"));
			cs.setFigure_Professionali_Coinvolte(ParamUtil.getString(actionRequest, "Figure_Professionali_Coinvolte"));
			cs.setNr_Edizione(ParamUtil.getString(actionRequest, "Nr_Edizione"));
			cs.setSede(ParamUtil.getString(actionRequest, "Sede"));
			cs.setAbstract(ParamUtil.getString(actionRequest, "Abstract"));
			cs.setData_Inizio(ParamUtil.getString(actionRequest, "Data_Inizio-date")+" "+ParamUtil.getString(actionRequest, "Data_Inizio-time"));
			cs.setData_Fine(ParamUtil.getString(actionRequest, "Data_Fine-date")+" "+ParamUtil.getString(actionRequest, "Data_Fine-time"));
			cs.setTot_Ore(ParamUtil.getString(actionRequest, "Tot_Ore"));
			cs.setScadenza_Iscrizioni(ParamUtil.getString(actionRequest, "Scadenza_Iscrizioni-date")+" "+ParamUtil.getString(actionRequest, "Scadenza_Iscrizioni-time"));
			cs.setAmmessi_al_corso(new Long(ParamUtil.getString(actionRequest, "Ammessi_al_corso")).longValue());
			cs.setBloccato(ParamUtil.getString(actionRequest, "Bloccato_data"));
			cs.setVisibile(ParamUtil.getString(actionRequest, "Visibile_data"));
			cs.setDispensa_corso(downLink);
			suiluppo_courseLocalServiceUtil.addsuiluppo_course(cs);
			SessionMessages.add(actionRequest, "success");
			log.info("Now table is Updated.....");
		}
		else{
			log.error("File Is Exists");
		}
		
	}
	@ProcessAction(name="updateSubmit")
	 public void updateSubmit(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException {
		log.info("Record Updating ............");
		suiluppo_course cs=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(ParamUtil.getString(actionRequest, "courseId")).longValue());
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String file_Name=uploadPortletRequest.getFileName("Dispensa_corso");
		System.out.println("File Name:"+file_Name);
		if(!file_Name.equalsIgnoreCase("")){
			log.info("FIle is Updating");
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			fus.createFolder(actionRequest, themeDisplay);
			/*
			 There are three parameter
			 1. themeDisplay
			 2. actionRequest
			 3. Name of type=file control name
			 */
			String fileName=fus.fileUpload(themeDisplay, actionRequest,"Dispensa_corso");
			if(!fileName.isEmpty())
			{
				if(fileName.equalsIgnoreCase("blank")){
				log.error("File Name is Blank{"+fileName+"}");
					return;
				}else if(fileName.equalsIgnoreCase("No Extension")){
				log.error("File format is Missing..{"+fileName+"}");
					return;
				}
				log.info("Created File {"+fileName+"}");
				String downLink=fus.getFileLink(themeDisplay, fileName).get( fileName);
				log.info("Download Link {"+downLink+"}");	
				cs.setDispensa_corso(downLink);
				log.info("Now table is Updating.....");
			}
			else{
				log.error("File Is Exists");
			}
		}
		else{
			log.info("There is no file");
			log.info("Now table is Updating.....");
		}
		
			cs.setDocente(ParamUtil.getString(actionRequest, "Docente"));
			cs.setEvento_Progetto(ParamUtil.getString(actionRequest, "Evento_Progetto"));
			cs.setTitolo(ParamUtil.getString(actionRequest, "Titolo"));
			cs.setDescrizione(ParamUtil.getString(actionRequest, "Descrizione"));
			cs.setFigure_Professionali_Coinvolte(ParamUtil.getString(actionRequest, "Figure_Professionali_Coinvolte"));
			cs.setNr_Edizione(ParamUtil.getString(actionRequest, "Nr_Edizione"));
			cs.setSede(ParamUtil.getString(actionRequest, "Sede"));
			cs.setAbstract(ParamUtil.getString(actionRequest, "Abstract"));
			cs.setData_Inizio(ParamUtil.getString(actionRequest, "Data_Inizio-date")+" "+ParamUtil.getString(actionRequest, "Data_Inizio-time"));
			cs.setData_Fine(ParamUtil.getString(actionRequest, "Data_Fine-date")+" "+ParamUtil.getString(actionRequest, "Data_Fine-time"));
			cs.setTot_Ore(ParamUtil.getString(actionRequest, "Tot_Ore"));
			cs.setScadenza_Iscrizioni(ParamUtil.getString(actionRequest, "Scadenza_Iscrizioni-date")+" "+ParamUtil.getString(actionRequest, "Scadenza_Iscrizioni-time"));
			cs.setAmmessi_al_corso(new Long(ParamUtil.getString(actionRequest, "Ammessi_al_corso")).longValue());
			cs.setBloccato(ParamUtil.getString(actionRequest, "Bloccato_data"));
			cs.setVisibile(ParamUtil.getString(actionRequest, "Visibile_data"));
			suiluppo_courseLocalServiceUtil.updatesuiluppo_course(cs);
			log.info("Now table is Updated");
		
		actionRequest.setAttribute("courseId",ParamUtil.getString(actionRequest, "courseId"));
		SessionMessages.add(actionRequest, "success");
	}
	
	
	@ProcessAction(name="addApplicant")
	 public void addApplicant(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException {
		log.info("New Applicant Adding ............");
		suiluppo_application su=suiluppo_applicationLocalServiceUtil.createsuiluppo_application(CounterLocalServiceUtil.increment());
		su.setApplicat_name(ParamUtil.getString(actionRequest, "Applicant_Name"));
		su.setApplicat_phone(ParamUtil.getString(actionRequest, "phone"));
		su.setCourse_id(new Long(ParamUtil.getString(actionRequest, "courseId")).longValue());
		su.setApplicat_email(ParamUtil.getString(actionRequest, "email"));
		suiluppo_applicationLocalServiceUtil.addsuiluppo_application(su);
		log.info("New Applicant Added");
		SessionMessages.add(actionRequest, "successApply");
	}
	@ProcessAction(name="addConfirmApplicant")
	 public void addConfirmApplicant(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException {
		
		log.info("Applicant Confirimg ............");
		System.out.println("ApplicantId-"+ParamUtil.getString(actionRequest, "appId"));
		suiluppo_application suap=suiluppo_applicationLocalServiceUtil.getsuiluppo_application(new Long(ParamUtil.getString(actionRequest, "appId")).longValue());
		if(suap.getApplicat_confirm().equalsIgnoreCase("yes")){
			suap.setApplicat_confirm("no");
		}
		else{
			suap.setApplicat_confirm("yes");
		}
		suiluppo_applicationLocalServiceUtil.updatesuiluppo_application(suap);
		actionResponse.setRenderParameter("courseId", ParamUtil.getString(actionRequest, "courseId"));
		log.info("Applicant Confirimed");
		
	}
	private CourseStatusChk ch=new CourseStatusChk();
	@Override
	public void serveResource(ResourceRequest resourceRequest,ResourceResponse resourceResponse)throws  IOException, PortletException {
	//Updating table
	update_room_allocationTable();
	//Update Table
	String resID=resourceRequest.getResourceID();
	System.out.println(resID);
	switch(resID){
	case "checkCourseRoomBookInfo":
		log.info("Room Confirimg ............");
		String id=resourceRequest.getParameter("courseId");
		JSONObject obj=JSONFactoryUtil.createJSONObject();
		if(ch.checkAlreadCourseBooked(new Long(id).longValue())){
			obj.put("flag","ar");
			resourceResponse.getWriter().println(obj.toJSONString());
			
		} else
			try {
				if(ch.checkValid(new Long(id).longValue())){
					obj.put("flag","cv");
					resourceResponse.getWriter().println(obj.toJSONString());
				}
			} catch (NumberFormatException | PortalException e) {
				
				e.printStackTrace();
			}
		log.info("Room Confirimed");
		break;
	case "updateRoomBookInfo":
		log.info("Room Confirimg ............");
		try {
			if(ch.checkValid(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue())){
				resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "nv").toJSONString());
				log.info("Course Is Not valid");
				return;
			}
		} catch (NumberFormatException | PortalException e) {
			
			e.printStackTrace();
		}
		if(ch.checkAlreadBooked(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue(), new Long(ParamUtil.getString(resourceRequest, "roomID")).longValue()))
		{
			resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "src").toJSONString());
			log.info("Room Already Booked On same Course");
			return;
		}
		if(ch.checkAlreadBooked(new Long(ParamUtil.getString(resourceRequest, "roomID")).longValue())){
			resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "oc").toJSONString());
			log.info("Room Already Booked On Other Course");
			return;
		}
		if(ch.checkAlreadCourseBooked(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue())){
			resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "orc").toJSONString());
			log.info("Room Already Booked for this Course");
			return;
		}
		suiluppo_room_allocation su=suiluppo_room_allocationLocalServiceUtil.createsuiluppo_room_allocation(CounterLocalServiceUtil.increment());
		su.setRoom_allocat_status("Booked");
		Calendar nowcal=GregorianCalendar.getInstance();
		String now=(nowcal.get(Calendar.DATE)<10?"0"+nowcal.get(Calendar.DATE):nowcal.get(Calendar.DATE))+"/"+(nowcal.get(Calendar.MONTH)+1<10?"0"+(nowcal.get(Calendar.MONTH)+1):(nowcal.get(Calendar.MONTH)+1))+"/"+nowcal.get(Calendar.YEAR)+" "+nowcal.get(Calendar.HOUR_OF_DAY)+":"+nowcal.get(Calendar.MINUTE);
		su.setRoom_allocat_date(now);
		su.setCourse_id(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue());
		try {
			log.info("Data Reading from Couse Table");
			suiluppo_course sc=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(ParamUtil.getString(resourceRequest, "courseId")).longValue());
			su.setRoom_allocat_start(sc.getData_Inizio());
			su.setRoom_allocat_end(sc.getData_Fine());
			log.info("Data Readed");
		
		} catch (NumberFormatException | PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		su.setRoomID(new Long(ParamUtil.getString(resourceRequest, "roomID")).longValue());
		suiluppo_room_allocationLocalServiceUtil.updatesuiluppo_room_allocation(su);
		resourceRequest.setAttribute("courseId",ParamUtil.getString(resourceRequest, "courseId"));
		resourceResponse.getWriter().print(JSONFactoryUtil.createJSONObject().put("flag", "suc").toJSONString());
		log.info("Room Confirimed");
	break;	
	}
	
	}
	public void update_room_allocationTable(){
		DynamicQuery userQuery =suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
		userQuery.add(RestrictionsFactoryUtil.eq("room_allocat_status", "Booked"));
		List<suiluppo_room_allocation> sur=suiluppo_room_allocationLocalServiceUtil.dynamicQuery(userQuery);
		if(sur.size()>0){
			for(suiluppo_room_allocation st:sur){
			log.info(st);
		try {
				if(ch.checkValid(st.getCourse_id())){
					log.info("Finding Blank Rooms......");
					if(ch.UpdateRoomAllocation(st.getRoom_allocat_id())){
						log.info("Room Updated");
					}
					
				}else{
					log.warn("room will remain booked");
				}
			} catch (PortalException e) {
				e.printStackTrace();
			}
			}
		}
		else{
			log.info("No Room Booked");
		}
		
		//Updating Course Allocation Table
	}
	
//Manish Code
	public void BookedEquipmentSubmit(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		response.setRenderParameter("courseId", ParamUtil.getLong(request, "course_Id")+"");
		List<Equipment> equipList = EquipmentLocalServiceUtil.getEquipments(-1, -1);
		for(Equipment eq : equipList){
				int equip_quantit = ParamUtil.getInteger(request, eq.getEquipment_name());
				if(equip_quantit!=0){
				int equip_quantity = ParamUtil.getInteger(request, eq.getEquipment_name());
				long equip_id = eq.getEquip_id();
				long course_id= ParamUtil.getLong(request, "course_Id");
				
				try {
					BookedEquipment equip= BookedEquipmentLocalServiceUtil.createBookedEquipment(CounterLocalServiceUtil.increment());
					equip.setEquip_id(equip_id);
					equip.setEquip_quantity(equip_quantity);
					equip.setCourse_id(course_id);
					equip.setBooked_equip_date(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()));
					BookedEquipmentLocalServiceUtil.addBookedEquipment(equip);
					System.out.println("Success!!");
				} catch (Exception e) {
					e.printStackTrace();
				}
		
			
			}		
			
		}
		
		//System.out.println("quantity= " + quantity +"equipment_name= "+equipment_name);
	}
}
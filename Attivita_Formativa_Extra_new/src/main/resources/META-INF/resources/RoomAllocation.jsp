<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.daffo.Attivita_Formativa_Extra_new.portlet.CourseStatusChk"%>
<%@page import="com.daffo.suilupposervice.model.suiluppo_room_allocation"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_roomLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.model.suiluppo_room"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_room_allocationLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<%
String courseId="";
courseId=request.getParameter("courseId");
if(courseId==null){
	System.out.println("getting value from Attribute");
	courseId=request.getAttribute("courseId").toString();
}
System.out.println("RoomAllocation.jsp:"+courseId);
%>

    <style>
    .rowdiv {
        border: 1px solid;
        padding:1 1 1 1;
        border-radius: 10px;
      }
    .cliente {
    text-align:center;
 
    border: #cdcdcd medium solid;
    border-radius: 10px;
    -moz-border-radius: 10px;
    -webkit-border-radius: 10px;
    cursor:pointer;
}
.btn-submit{
background-color: #008CBA;
color:white
}
.btn-submit:hover{
background-color:#024961;
color:white;
}
    </style>
<%! private Log log=LogFactoryUtil.getLog("RoomAllocation"); %>
<%
CourseStatusChk  chk=new CourseStatusChk();
DynamicQuery userQuery = suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
userQuery.add(RestrictionsFactoryUtil.eq("room_allocat_status", "Booked"));
List<suiluppo_room_allocation> sur=suiluppo_room_allocationLocalServiceUtil.dynamicQuery(userQuery);
if(sur.size()>0){
	for(suiluppo_room_allocation st:sur){
	log.info(st);
	if(chk.checkValid(st.getCourse_id())){
		log.info("Finding Blank Rooms......");
		if(chk.UpdateRoomAllocation(st.getRoom_allocat_id())){
			log.info("Room Updated");
		}
		
	}else{
		log.warn("room will remain booked");
	}
	}
}
else{
	log.info("No Room Booked");
}
%>
<%
List<suiluppo_room> sr=suiluppo_roomLocalServiceUtil.getsuiluppo_rooms(-1,-1);
%>
<div class="container-fluid-1280">
<div class="row  rowdiv">
<div  class="row">
<div class="col-xs-12">
<h1 class="pull-left"><liferay-ui:message key="RoomsDetails"/></h1>
</div>
</div>
<br/>
<div id="div-roombook" class="row">
<table style="width:100%">
<tbody>
<tr>
<td>
<b><liferay-ui:message key="AvailableRooms"/></b>
</td>
<td width="50%">
<select id="sel-roomId" class="form-control">
<option value="-1"><liferay-ui:message key="SelectRoom"/></option>
<%
for(suiluppo_room st:sr){
	if(chk.checkAlreadBooked(new Long(courseId).longValue(),st.getRoomID())){
		%>
	<script>
  	 $(function () {
	   $('#sel-roomId').html('');
       $("#div-roombooked").show();
       $('#div-roombook').hide();
       $('#txt-bookedRoomId').val('<%=st.getRoomID()%>');
       $('#btn-booked')[0].innerHTML='<%=st.getRoom_name()%>'
       $('#roomDes')[0].innerHTML='<%=st.getRoom_description()%>'
   });
	</script>
		<%
		break;
	}
	else if(chk.checkAlreadBooked(st.getRoomID())){} 
	else{
%>
<option value="<%=st.getRoomID()%>"><%=st.getRoom_name()%></option>
<%
}
}
%>
</select>
</td>
<td class="text-center">
<span class="btn btn-submit" id="btn-submit"><liferay-ui:message key="RequestForRoom"/></span>
</td>
</tr>
</tbody>
</table>
</div>
<div id="div-roombooked" style="display:none" class="row">
<table style="width:100%">
<thead>
<tr style="height:30px">
<td width="250" class="text-center">
<b><u><liferay-ui:message key="BookedRoomName"/></u></b>
</td>
<td>
<b><u><liferay-ui:message key="EqDescription"/></u></b>
</td>
</tr>
</thead>
<tbody>
<tr>
<td class="text-center">
<br/>
<div id="roomInfo">
<input type="hidden" id="txt-bookedRoomId">
<span class="btn  btn-submit" id="btn-booked"></span>
</div>
</td>
<td>
<br/>
<span id="roomDes"></span>
</td>
</tr>
</tbody>
</table>
</div>
<br/>
</div>
<div class="row">
<br/>
</div>
<div  class="row  rowdiv">
<div class="col-xs-12">
<h1><liferay-ui:message key="EquipmentDetails"/>
</h1>
<jsp:include page="/viewEquip.jsp">
<jsp:param value="<%=courseId%>" name="courseId"/>
</jsp:include>
</div>
<br/>
</div>
</div>


<portlet:resourceURL var="updateRoomBookInfo" id="updateRoomBookInfo">
</portlet:resourceURL>
<script>
$("#btn-submit").click(function(){
	var roomId=$("#sel-roomId").val();
	if(roomId==-1){
		alert('<liferay-ui:message key="msgRoomAll"/>');
		return; 
	}
	var courseId='<%=courseId%>';
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=updateRoomBookInfo%>',{
  		dataType: 'json',
  		method: 'POST',
  		data:{'<portlet:namespace/>roomID':roomId,'<portlet:namespace/>courseId':courseId},
  		on: {
   			 success: function() {
   			var data=this.get('responseData');
   			if(data!=null){
   				if(data.flag=='nv'){
   					alert('<liferay-ui:message key="CourseIsnotvalid"/>');
   				}else if(data.flag=='src'){
   					alert('<liferay-ui:message key="Roombookedonsamecourse"/>');
   				}else if(data.flag=='oc'){
   					alert('<liferay-ui:message key="RoombookedonOthercourse"/>');
   				}else if(data.flag=='orc'){
   					alert('<liferay-ui:message key="SomeOtherroombookforthisCourse"/>');
   				}else if(data.flag=='suc'){
   					alert('<liferay-ui:message key="SuccessfullyBooked"/>');
   					
   				}
   			}
   			location.reload();
    		}
  		}
		});
		});
});

$('#btn-booked').click(function(){
	var roomId=$('#txt-bookedRoomId').val();
	var courseId='<%=courseId%>';
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
    portletURL.setParameter('roomId', roomId);  
    portletURL.setParameter('courseId', courseId);  
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/bookedRoomInfo.jsp');
    YUI().ready(function(A) {
        YUI().use('aui-base','liferay-util-window', function(A) {
            Liferay.Util.Window.getWindow({
                title :'<liferay-ui:message key="AllocatedRoomInformation"/>',
                uri: portletURL,
                id:'<portlet:namespace/>Room Information',
                dialog: {
                	centered: true,
                	constrain2view: true,
                    destroyOnHide: true,
                    resizable: false,
                    cache: false,
                    modal: true,
                    width: 700,
                    height:300
                }
            }).after('destroy', function(event) {
            	//It will refresh
            	//location.reload();
            });
        });
    });
return;
});
</script>
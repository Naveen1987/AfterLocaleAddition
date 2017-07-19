<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Projection"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_applicationLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.model.suiluppo_application"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="java.util.List"%>
<%@page import="com.daffo.suilupposervice.model.suiluppo_course"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_courseLocalServiceUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
<%--Message area --%>
<liferay-ui:success key="success" message="successkey" />

<style>
.results tr[visible='false'],
.no-result{
  display:none;
}

.results tr[visible='true']{
  display:table-row;
}

.counter{
  padding:8px; 
  color:#ccc;
}
</style>

<script>
$(document).ready(function() {
	  $(".search").keyup(function () {
	    var searchTerm = $(".search").val();
	    var listItem = $('.results tbody').children('tr');
	    var searchSplit = searchTerm.replace(/ /g, "'):containsi('")
	    
	  $.extend($.expr[':'], {'containsi': function(elem, i, match, array){
	        return (elem.textContent || elem.innerText || '').toLowerCase().indexOf((match[3] || "").toLowerCase()) >= 0;
	    }
	  });
	    
	  $(".results tbody tr").not(":containsi('" + searchSplit + "')").each(function(e){
	    $(this).attr('visible','false');
	  });

	  $(".results tbody tr:containsi('" + searchSplit + "')").each(function(e){
	    $(this).attr('visible','true');
	  });

	  var jobCount = $('.results tbody tr[visible="true"]').length;
	    $('.counter').text(jobCount + ' item');

	  if(jobCount == '0') {$('.no-result').show();}
	    else {$('.no-result').hide();}
			  });
	});
</script>

<div class="container-fluid-1280">
<div class="row">
<div class="col-md-12">
<div class="pull-right">
    <table>
    <tbody>
    <tr>
    <!-- <td> <a href="#" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-refresh"></span> Refresh
        </a></td> -->
    <td style="padding: 10px;"><span id="btnNew" class="btn btn-warning"><liferay-ui:message key="NewCourse"/></span></td>
    <td style="padding: 10px;"><span id="btnOther" class="btn btn-warning"><liferay-ui:message key="CourseforApply"/></span></td>
<%
for(Role r:user.getRoles()){
if(r.getName().equalsIgnoreCase("Administrator")||r.getName().equalsIgnoreCase("Power User"))
{
%>
<td style="padding: 10px;"><span id="btnNewRoom" class="btn btn-warning"><liferay-ui:message key="ManageRoom"/></span></td>
<td style="padding: 10px;"><span id="btnNewEquip" class="btn btn-warning"><liferay-ui:message key="ManageEquipment"/></span></td>
<%
break;
}
}
%>
     </tr>
    </tbody>
    </table>
</div>
</div>
</div>
<div class="row">
<div class="col-md-12">
<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
     <%--<th><b>#</b></th> --%>
    <th><b>Evento Progetto</b></th>
    <th><b>Titolo</b></th>
    <th><b>Data Inizio</b></th>
    <th><b>Data Fine</b></th>
    <th><b>Tot Ore</b></th>
    <th><b>Visibile</b></th>
    <th><b>Bloccato</b></th>
    <th><b><liferay-ui:message key="action"/></b></th>
    <th><b><liferay-ui:message key="Application"/></b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="10"><i class="fa fa-warning"></i> <liferay-ui:message key="no_result"/></td>
    </tr>
   </thead>
    <tbody>
    <%    
    
    List<suiluppo_course> suil=suiluppo_courseLocalServiceUtil.getCourseUnderDocente(user.getFullName());
    for(suiluppo_course su:suil)
    {%>
     <tr>
    <%-- <td><%=su.getCourse_id() %></td> --%>
    <td><%=su.getEvento_Progetto()%></td>
    <td><%=su.getTitolo()%></td>
    <td><%=su.getData_Inizio()%></td>
    <td><%=su.getData_Fine()%></td>
    <td><%
    String duration[]=su.getTot_Ore().split(",");
    String sh=duration[0].substring(0,duration[0].length()-1);
    String sm=duration[1].substring(0,duration[1].length()-1);
    String ss=duration[2].substring(0,duration[2].length()-1);
    %>
    <%=sh+":"+sm+":"+ss+"  Hrs"%>
    </td>
    <td><%=su.getVisibile()%></td>
    <td><%=su.getBloccato()%></td>
    <td>
    <table>
    <tbody>
    <tr>
    <td style="padding: 5px;"><span onclick="getCourseViewId('<%=su.getCourse_id() +""%>')" class="btn btn-primary btnview"><liferay-ui:message key="View"/></span></td>
    <td style="padding: 5px;"><span onclick="getCourseEditId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnedit"><liferay-ui:message key="cEdit"/></span></td>
    <td style="padding: 5px;"><span onclick="getRoomAllowId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnroow"><liferay-ui:message key="roomAll"/></span></td>
  <%--   <td style="padding: 5px;"><span onclick="getEquipAllowId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnroow">Equipment Allocation</span></td> --%>
    </tr>
    </tbody>
    </table>
    </td>
    <td><span onclick="getCourseApplicants('<%=su.getCourse_id() +""%>')" class="btn btn-success btnlistOfApp"><%=
    		suiluppo_applicationLocalServiceUtil.getApplicantUnderCourse(su.getCourse_id()).size()+""
    %></span></td>
    </tr>
    <%}%>
    </tbody>
    </table>
</div>
</div>
</div>

<script type="text/javascript">
/*$(document).ready(function () {
$("#listApply").hide();
});
$("#btnOwn").click(function(){
	$("#listApply").hide();
	$("#listOwn").show();
});
$("#btnOther").click(function(){
	$("#listApply").show();
	$("#listOwn").hide();
});*/

$("#btnNewEquip").click(function(){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/ListEquip.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="EquipmentManagement"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Equipment_management',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width:1600,
	                   
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });

	
});

$("#btnNewRoom").click(function(){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/ListRoom.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="RoomManagement"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Room_manage',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width:1600,
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });

	
});


$("#btnOther").click(function(){
	
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/courseForApply.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="CourseforApply"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Course_for_Apply',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 1200,
	                    height:900
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
});
function getCourseViewId(courseId)
{
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('courseId', courseId);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/ViewCourse.jsp');
	
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="CourseView"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Course_View',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 950,
	                    height:800
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
			
}
function getCourseEditId(courseId)
{
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('courseId', courseId);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/editCourse.jsp');
	
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="CourseEdit"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Course_Edit',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 950
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
}
</script>

<script type="text/javascript">
$("#btnNew").click(function(){
	//alert('Hello New');
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/AddCourse.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="AddNewCourse"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>AddCourse',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 950
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
});
</script>
<script>
function getCourseApplicants(courseId){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('courseId', courseId);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/listOfApplicants.jsp');
	 
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="ListOfApplicants"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>ListOfApplicants',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 950
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
	}
</script>

<portlet:resourceURL var="updaContentURL" id="checkCourseRoomBookInfo">
</portlet:resourceURL>
<script>
function getRoomAllowId(courseId){
	
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=updaContentURL%>',{
  		dataType: 'json',
  		method: 'POST',
  		data:{'<portlet:namespace/>courseId':courseId},
  		on: {
   			 success: function() {
   			 var data=this.get('responseData');
   			 if(data!=null){
   				 if(data.flag=='ar'){
   					 alert('<liferay-ui:message key="Alreadyroombookedforthiscourse"/>');
   				 }
   				 else if(data.flag=='cv'){
   					 alert('<liferay-ui:message key="ThiscourseisinvalidPleaseCheckCourse"/> { Bloccato/Visibile/Data Fine }');
   					//location.reload();
   					 return;
   				 }
   			 }  			
   			 	var portletURL = Liferay.PortletURL.createRenderURL();
   			 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
   			    portletURL.setParameter('courseId', courseId);    
   			    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
   			    portletURL.setParameter('mvcPath', '/RoomAllocation.jsp');
   			    YUI().ready(function(A) {
   			        YUI().use('aui-base','liferay-util-window', function(A) {
   			            Liferay.Util.Window.getWindow({
   			                title :'<liferay-ui:message key="RoomAllocation"/>',
   			                uri: portletURL,
   			                id:'<portlet:namespace/>RoomAllowcation',
   			                dialog: {
   			                	centered: true,
   			                	constrain2view: true,
   			                    destroyOnHide: true,
   			                    resizable: false,
   			                    cache: false,
   			                    modal: true,
   			                    width: 950
   			                }
   			            }).after('destroy', function(event) {
   			            	//It will refresh
   			            	location.reload();
   			            });
   			        });
   			    });
   			 }
   		
    		
  		}
		});
		});

	}
</script>




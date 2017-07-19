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
<div id="listApply" class="row">
<div class="col-md-12">
<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>#</b></th>
    <th><b>Docente</b></th>
    <th><b>Evento Progetto</b></th>
    <th><b>Titolo</b></th>
    <th><b>Data Inizio</b></th>
    <th><b>Data Fine</b></th>
    <th><b>Tot Ore</b></th>
    <th><b>Visibile</b></th>
    <th><b>Bloccato</b></th>
     <th><b><liferay-ui:message key="action"/></b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="10"><i class="fa fa-warning"></i> <liferay-ui:message key="no_result"/></td>
    </tr>
  </thead>
    <tbody>
   <% 
    List<suiluppo_course> suil1=suiluppo_courseLocalServiceUtil.getCourseNotUnderDocente(user.getFullName());
    for(suiluppo_course su:suil1)
    {
    if(su.getBloccato().equalsIgnoreCase("false")&&su.getVisibile().equalsIgnoreCase("true"))
    {
    	if(su.getAmmessi_al_corso()>suiluppo_applicationLocalServiceUtil.getApplicantUnderCourse(su.getCourse_id()).size())
    	{
    	%>
        <tr>
        <td><%=su.getCourse_id() %></td> 
        <td><%=su.getDocente() %></td> 
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
       <%
       if(suiluppo_applicationLocalServiceUtil.checkApplicantUnderCourse(su.getCourse_id(), user.getFullName())){
       	%>
       <td style="padding: 5px;"><span id="<%="btn_"+su.getCourse_id()%>"  onclick="getCourseApplyId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnedit"><liferay-ui:message key="Applied"/></span></td>	
           <%
       }
       else{
       	%>
       <td style="padding: 5px;"><span id="<%="btn_"+su.getCourse_id()%>"  onclick="getCourseApplyId('<%=su.getCourse_id() +""%>','<%=user.getFullName()%>')" class="btn btn-warning btnedit"><liferay-ui:message key="Apply"/></span></td>	
       <%
       }
       %>      
       </tr>
       </tbody>
       </table>
       </td>
       </tr>
       <%
    }
    	
	else if(su.getAmmessi_al_corso()==suiluppo_applicationLocalServiceUtil.getApplicantUnderCourse(su.getCourse_id()).size())
    	{
    	if(suiluppo_applicationLocalServiceUtil.checkApplicantUnderCourse(su.getCourse_id(), user.getFullName())){
    	%>
       <tr>
       <td><%=su.getCourse_id() %></td> 
       <td><%=su.getDocente() %></td> 
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
       <td style="padding: 5px;"><span id="<%="btn_"+su.getCourse_id()%>"  onclick="getCourseApplyId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnedit"><liferay-ui:message key="Applied"/></span></td>	
       </tr>
       </tbody>
       </table>
        </td>
   		</tr>  
    	<%	
      	 }
    	}   	
   }
    }%>
   
    </tbody>
    </table>

</div>
</div>
</div>

<script>
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
	                title :'Course View',
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
function getCourseApplyId(courseId,userName)
{
		var ID="#btn_"+courseId;
		if($(ID).text()=='Applicato'){
			alert('Hai già applicato per esso');
			return;
		}
		formSubmiting(courseId,userName);
	   
}

</script>

<portlet:actionURL name="addApplicant" var="addApplicant">
<portlet:param name="mvcPath" value="/listCourse.jsp"/> 
</portlet:actionURL>
<script type="text/javascript">
function formSubmiting(courseId,userName){
	var ID="#btn_"+courseId;
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=addApplicant%>',{
  		dataType: 'json',
  		method: 'POST',
  		data:{'<portlet:namespace/>courseId':courseId,'<portlet:namespace/>Applicant_Name':userName,'<portlet:namespace/>email':'<%=user.getEmailAddress()%>'},
  		on: {
   			 success: function() {
   			 $(ID).text('Applicato');
   			 alert("Applicato con successo per il corso!");
   			 location.reload();
    		}
  		}
		});
		});
	    //aui ajax call to get updated content
}
</script>
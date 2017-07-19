<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.util.PortletKeys"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.*"%>
<%@page import="com.daffo.form_di_segnalazione.model.form_di_segnalazione"%>
<%@page import="com.daffo.form_di_segnalazione.service.form_di_segnalazioneLocalServiceUtil"%>



<%--Message area --%>
<liferay-ui:success key="showall" message="This is list of all Employee!"/>

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

<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="What you looking for?">
</div>
 <%
 	List<form_di_segnalazione> el=(List<form_di_segnalazione>)form_di_segnalazioneLocalServiceUtil.getform_di_segnalaziones(0, form_di_segnalazioneLocalServiceUtil.getform_di_segnalazionesCount());
 	System.out.println("value:"+el);
%>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <%--<th><b>#</b></th> --%>
    <th><b>CODICE SEGNALAZIONE</b></th>
    <th><b>INIZIALI PAZIENTE</b></th>
    <th><b>DATA di NASCITA o ETÀ</b></th>
    <th><b>SESSO</b></th>
    <th><b>DATA INSORGENZA REAZIONE</b></th>
    <th><b>Action</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="7"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
    <tbody>
    <%
       for(form_di_segnalazione fds: el)
       {
    	   %>
<portlet:actionURL name="form_di_segnalazione_fetch_from" var="form_id">
<portlet:param name="form_id" value="<%= fds.getForm_di_segnalazione_id()+""%>"></portlet:param>
</portlet:actionURL>
<tr>
<%--<td><aui:a href="${form_id}" style="color:black;text-decoration:none;"><%=fds.getForm_di_segnalazione_id()%></aui:a></td>--%>
<td><%=fds.getCODICE()%></td>
<td><%=fds.getINIZIALI_1()%></td>
<td><%=fds.getDATA_2()%></td>
<td><%=fds.getSESSO_3()%></td>
<td><%=fds.getDATA_4()%></td>
<td> <button class="btn btn-primary" onclick="getRowId('<%=fds.getForm_di_segnalazione_id()+""%>')">View Info</button>
</td>
</tr>
 <%  
 }
    
 %>
 </tbody>
 </table>
<%-- <portlet:renderURL var="readOnly" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
<portlet:param name="mvcPath" value="/Form_di_segnalazione_readOnly.jsp" />
</portlet:renderURL>--%> 

<aui:script>
function getRowId(userData)
{
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('formID', userData);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/Form_di_segnalazione_readOnly.jsp');
	    // Now we can use the URL
	  // alert(portletURL.toString());
	   Liferay.Util.openWindow({
			dialog: {
			centered: true,
			cssClass: 'my-liferay-popup',
			constrain2view: true,
			modal: true,
			width: 1600
			},
			id: '<portlet:namespace/>viewdialog',
			title: 'Form di segnalazione' ,
			uri:  portletURL.toString()
			});
}

</aui:script>


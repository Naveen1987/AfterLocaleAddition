<%@page import="com.daffo.suilupposervice.service.suiluppo_applicationLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.model.suiluppo_application"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
<link href="<%= request.getContextPath()%>/css/bootstrap-toggle.min.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/css/bootstrap-toggle.min.js"></script>

<%-- <%=request.getParameter("courseId")%> --%>

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
<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
   
    <th><b><liferay-ui:message key="AName"/></b></th>
    <th><b><liferay-ui:message key="AEmailID"/></b></th>
    <th><b><liferay-ui:message key="AConfirmation"/></b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="4"><i class="fa fa-warning"></i> <liferay-ui:message key="noresult"/></td>
    </tr>
  </thead>
    <tbody>
    <%
   List<suiluppo_application>sa= suiluppo_applicationLocalServiceUtil.getApplicantUnderCourse(new Long(request.getParameter("courseId")).longValue());
    		for(suiluppo_application ap:sa){
    			%>
    			<tr>
    			<td><%=ap.getApplicat_name() %></td><td><%=ap.getApplicat_email() %></td>
    			<td>
    			<input type="checkbox" id="confirm_ch" name="<portlet:namespace/>confirm_ch" data-toggle="toggle" data-on="SI" data-off="NO" data-size="large" data-onstyle="success" data-offstyle="info" onChange="confirmationApplicant('<%=ap.getApplicat_id() %>')" <%=ap.getApplicat_confirm().equalsIgnoreCase("yes")?"checked":""%>>
    			</td>
    			</tr>
    			<%
    		}
    %>
   
    </tbody>
    </table>
    
</div>
</div>
</div>
<portlet:actionURL name="addConfirmApplicant" var="addConfirmApplicant">
<portlet:param name="mvcPath" value="/listOfApplicants.jsp"/> 
</portlet:actionURL>


<script>
function confirmationApplicant(appId){
	/* alert(appId); */
	var courseId='<%=request.getParameter("courseId") %>';
	var ach=$("#confirm_ch").prop('checked');
	if(ach){
		//alert(appId);	
		AUI().use('aui-base','aui-io-request', function(A){
			//aui ajax call to get updated content
			A.io.request('<%=addConfirmApplicant%>',{
	  		dataType: 'json',
	  		method: 'POST',
	  		data:{'<portlet:namespace/>appId':appId,'<portlet:namespace/>courseId':courseId},
	  		on: {
	   			 success: function() {
	   			 alert("<liferay-ui:message key="SuccessfullyConfirmed"/>");
	    		}
	  		}
			});
			});
	}
	
}
</script>
<%@ include file="/init.jsp" %>
 <style>
.ul {
    list-style-type: none;
    font-size:17px;
	font-family: 'Open Sans', sans-serif;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #2C95DD;
}

.li {
    float: left;
}

.li a {
    display: inline-block;
    color: white;
    text-align: center;
   	padding: 10px 20px;
    text-decoration: none;
}

.li a:hover {
    background-color: #1D6391;
}
</style>

<portlet:actionURL name="Archivio_delle_segnalazioni_edit" var="Archivio_delle_segnalazioni">
<%--<portlet:param name="mvcPath" value="/views/selEmployee.jsp"/> --%>
</portlet:actionURL>
<portlet:actionURL name="Form_di_segnalazione" var="Form_di_segnalazione">
<%--<portlet:param name="mvcPath" value="/views/selEmployee.jsp"/> --%>
</portlet:actionURL>
<portlet:actionURL name="Istruzioni_per_la_compilazione_edit" var="Istruzioni_per_la_compilazione">
<%--<portlet:param name="mvcPath" value="/views/selEmployee.jsp"/> --%>
</portlet:actionURL>
<portlet:actionURL name="I_farmaci_da_sottoporre_al_monitoraggio_intensivo" var="I_farmaci_da_sottoporre_al_monitoraggio_intensivo">
<%--<portlet:param name="mvcPath" value="/views/selEmployee.jsp"/> --%>
</portlet:actionURL>
<%--<liferay-ui:success key="success" message="Record saved successfully!"/> --%>

<div  class="container-fluid-1280">
<div class="row">
<div class="cd-md-12">
<ul class="ul">
  <li class="li"><a href="${Archivio_delle_segnalazioni}">Archivio delle segnalazioni</a></li>
  <li class="li"><a href="${Form_di_segnalazione}">Form di segnalazione</a></li>
  <li class="li"><a href="${Istruzioni_per_la_compilazione}">Istruzioni per la compilazione</a></li>
  <li class="li"><a href="${I_farmaci_da_sottoporre_al_monitoraggio_intensivo}">I farmaci da sottoporre al monitoraggio intensivo</a></li>
  <li class="li"><a href="http://www.salute.gov.it" target="_blank">Informazioni e documentaizone</a></li>
</ul>
</div>
</div>
<div class="row">
<div class="cd-md-12">
<%
try{
	String pageToShow=(String)request.getAttribute("pageTOShow");
	System.out.println(pageToShow);	
	if( !pageToShow.equalsIgnoreCase("null")){
		%>
		<jsp:include page="<%=pageToShow %>"></jsp:include>
		<%
	}
}catch(Exception ex)
{
%>
<jsp:include page="Archivio_delle_segnalazioni_edit.jsp"></jsp:include>
<%
}
%>
</div>
</div>
</div>






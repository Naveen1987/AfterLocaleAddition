<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.dynamic.data.mapping.service.DDMStructureLocalServiceUtil"%>
<%@page import="java.util.Set"%>
<%@page import="com.liferay.dynamic.data.mapping.model.DDMStructure"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.daffo.DataMigrationUtility_New.portlet.FolderAndDocType_Service"%>
<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%@ include file="/init.jsp" %>



<%FolderAndDocType_Service fus=new FolderAndDocType_Service(); %>
<div class="container-fluid-1280">
<div class="row">
<div class="col-xs-12 ">
<div class="pull-right">
<span class="btn btn-warning" id="btn-import"><liferay-ui:message key="btnName"></liferay-ui:message></span>
</div>
</div>
</div>
<br/>
<%-- <div class="row">
<div class="col-xs-12">
<table class=" table table-bordered table-hover">
<thead>
<tr class="bg-primary">
<td colspan="2">List Of Folder In liferay Server</td>
</tr>
<tr class="bg-primary">
<td>Folder ID</td> <td>Folder Name</td>
</tr>
</thead>
<%
for(DLFolder fu:fus.getAllDLFolder()){
	%>
	<tr>
	<td><%=fu.getFolderId() %></td><td><%=fu.getName()%></td>
	</tr>
	<%
}
%>
<tbody></tbody>
</table>
</div>
</div>
 --%>
 
<div class="row">
<div class="col-xs-12">
<table  class=" table table-bordered table-hover">
<thead>
<tr class="bg-primary">
<td colspan="2">List Of Folder In Sites</td>
</tr>
<tr class="bg-primary">
<td>Folder ID</td> <td>Folder Name</td>
</tr>
</thead>

<%
for(Folder fu:fus.getAllFolder(themeDisplay)){
	%>
	<tr>
	<td><span style="cursor:pointer;" onClick="getFolder('<%= fu.getFolderId() %>')"><%=fu.getFolderId() %></span></td><td><span style="cursor:pointer;" onClick="getFolder('<%= fu.getFolderId() %>')"><%=fu.getName()%></span></td>
	</tr>
	<%
}
%>
<tbody></tbody>
</table>
</div>
</div>

<%-- <div class="row">
<div class="col-xs-12">
<table  class=" table table-bordered table-hover">
<thead>
<tr class="bg-primary">
<td colspan="3">List Of All Document Type</td>
</tr>
<tr class="bg-primary">
<td>Structure ID</td> <td>Document Type</td><td>Document Fields</td>
</tr>
</thead>
<%
for(DDMStructure fu:fus.getAllDocumentType()){
	%>
	<tr>
	<td><%=fu.getStructureId() %></td><td><%=fu.getNameCurrentValue()%></td><td><%=fu.getFieldNames() %></td>
	</tr>
	<%
}
%>
<tbody></tbody>
</table>
</div>
</div> --%>

<div class="row">
<div class="col-xs-12">
<table  class=" table table-bordered table-hover">
<thead>
<tr class="bg-primary">
<td colspan="3">List Of Document Type In Sites</td>
</tr>
<tr class="bg-primary">
<td>Structure ID</td> <td>Document Type</td><td>Document Fields</td>
</tr>
</thead>

<%
for(DDMStructure fu:fus.getSiteDocumentType(themeDisplay)){
	%>
	<tr>
	<td><%=fu.getStructureId() %></td><td><%=fu.getNameCurrentValue()%></td><td>
	<% Set<String> fields=	fu.getFieldNames();
	for(String field:fields){
		out.println("["+field+"="+fu.getFieldDataType(field)+" "+fu.getFieldRequired(field)+"]");
	}
	%>
	</td>
	</tr>
	<%
}

%>
<tbody></tbody>
</table>
</div>
</div>
<%-- <div class="row">
<div class="col-xs-12">
<jsp:include page="FileImportPage.jsp"></jsp:include>
</div>
</div>
 --%>
</div>

<script>
$("#btn-import").click(function(){
	var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/FileImportPage.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'File Import Page',
	                uri: portletURL,
	                id:'<portlet:namespace/>FileImportPage',
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

function getFolder(folderId)
{
	var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	 	 portletURL.setParameter('folderId', folderId);
	 	portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/ListofFile_info.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'List of File',
	                uri: portletURL,
	                id:'<portlet:namespace/>ListofFile_info',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 1600
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
}
</script>
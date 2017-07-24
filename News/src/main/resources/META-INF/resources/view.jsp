<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.blogs.kernel.model.BlogsEntry"%>
<%@page import="com.liferay.blogs.kernel.service.BlogsEntryLocalServiceUtil"%>
<%@page import="java.util.*"%>
<%@ include file="/init.jsp" %>

<style>
.box-content{
  height:650px;
  overflow:auto;
}
.otherhead {
           width: 14.8%; 
           float: left;
       } 
.otherdata {
           width: 15%; 
           float: left;
       } 
 .widthData{
 width:35%;
 float: left;
 } 
 
 .dataRow tr:first-child {
        border-top: none;
    }
   .dataRow tr:last-child {
 	 border-bottom: 1px solid gray;
 	 }

</style>

<div class="container-fluid-1280">
<div class="row">
<div class="col-md-12">
<table  class="table table-striped">
<thead>
    <tr class="bg-primary">
      <th style="width:.5px"></th>
      <th class="otherhead"><b><liferay-ui:message key="nePublishDate"/></b></th>
      <th class="widthData"><b><liferay-ui:message key="neTitle"/></b></th>
      <th class="widthData"><b><liferay-ui:message key="neBody"/></b></th>
      <th class="otherhead"><b><liferay-ui:message key="neExplirationDate"/></b></th>
      <th style="width:2px"></th>
    </tr>
  </thead>
   <tbody>
    <tr>
    <td colspan="7">
    <div class="box-content">
    <table class="table dataRow">
    <% 
	List<BlogsEntry>lt=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount());
	for(BlogsEntry b:lt){
	%>
	<tr>
	<td class="otherdata"><%=new SimpleDateFormat("dd/MM/YYYY").format(b.getCreateDate()).toString()%></td>
	<td class="widthData"><%=b.getTitle()%></td>
	<td class="widthData"><%=b.getContent()%></td>
	<td class="otherdata"><%=new SimpleDateFormat("dd/MM/YYYY").format(b.getStatusDate()).toString()%></td>
	</tr>
	<%
	}
	%>
    
    </table>
    </div>
    </td>
    </tr>
    </tbody>
</table>
</div>
</div>
</div>



<%-- <%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.blogs.kernel.model.BlogsEntry"%>
<%@page import="com.liferay.blogs.kernel.service.BlogsEntryLocalServiceUtil"%>
<%@page import="java.util.*"%>
<%@ include file="/init.jsp" %>

<%=BlogsEntryLocalServiceUtil.getBlogsEntriesCount()%>
<%=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount()) %>


<div style="height:500px; overflow:auto;">
<table  class="table table-striped">
<thead>
    <tr class="bg-primary">
      <th><b><liferay-ui:message key="nePublishDate"/></b></th>
      <th><b><liferay-ui:message key="neTitle"/></b></th>
      <th><b><liferay-ui:message key="neBody"/></b></th>
      <th><b><liferay-ui:message key="neExplirationDate"/></b></th>
    </tr>
  </thead>
<tbody>
<% 
List<BlogsEntry>lt=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount());
for(BlogsEntry b:lt){
	%>
	<tr>
	<td><%=new SimpleDateFormat("dd/MM/YYYY").format(b.getCreateDate()).toString()%></td>
	<td><%=b.getTitle()%></td>
	<td><%=b.getContent()%></td>
	<td><%=new SimpleDateFormat("dd/MM/YYYY").format(b.getStatusDate()).toString()%></td>
	</tr>
	<%
}
%>
</tbody>
</table>
</div>
 --%>
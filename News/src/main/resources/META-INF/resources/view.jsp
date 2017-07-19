<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.blogs.kernel.model.BlogsEntry"%>
<%@page import="com.liferay.blogs.kernel.service.BlogsEntryLocalServiceUtil"%>
<%@page import="java.util.*"%>
<%@ include file="/init.jsp" %>

<%--<%=BlogsEntryLocalServiceUtil.getBlogsEntriesCount()%>--%>
<%--<%=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount()) %> --%>
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

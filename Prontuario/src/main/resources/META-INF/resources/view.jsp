<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.model.Role"%>

<%
boolean flag=false;
System.out.println(user.getFullName());
for(Role r:user.getRoles()){
if(r.getName().equalsIgnoreCase("Farmacia")
||r.getName().equalsIgnoreCase("Administrator")||r.getName().equalsIgnoreCase("Power User"))
{
	flag=true;
	break;
}
}
%>
<jsp:include page="<%=""+((flag==true)?"/InRole.jsp":"/NotInRole.jsp")%>"></jsp:include>	


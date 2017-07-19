<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@ include file="/init.jsp" %>
<%--<jsp:include page="/NonRoles.jsp"></jsp:include> --%>
<%--<jsp:include page="/InRoles.jsp"></jsp:include> --%>
<%
boolean flag=false;
System.out.println(user.getFullName());
for(Role r:user.getRoles()){
if(r.getName().equalsIgnoreCase("Medico")||r.getName().equalsIgnoreCase("Farmacia")
||r.getName().equalsIgnoreCase("Administrator")||r.getName().equalsIgnoreCase("Power User"))
{
	flag=true;
	break;
}
}
%>
<jsp:include page="<%=""+((flag==true)?"/InRoles.jsp":"/NonRoles.jsp")%>"></jsp:include>	




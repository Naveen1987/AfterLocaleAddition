
<%@page import="com.daffo.suilupposervice.model.suiluppo_course"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_equip_allocationLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_room_allocationLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_equipmentLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_roomLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_applicationLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.model.suiluppo_application"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_courseLocalServiceUtil"%>
<%@ include file="/init.jsp" %>


<%--Now Inclusion of Code --%>
<%@ include file="/listCourse.jsp" %>

/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.daffo.suilupposervice.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.daffo.suilupposervice.model.suiluppo_application;
import com.daffo.suilupposervice.model.suiluppo_course;
import com.daffo.suilupposervice.service.suiluppo_applicationLocalServiceUtil;
import com.daffo.suilupposervice.service.base.suiluppo_applicationLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

/**
 * The implementation of the suiluppo_application local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.daffo.suilupposervice.service.suiluppo_applicationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_applicationLocalServiceBaseImpl
 * @see com.daffo.suilupposervice.service.suiluppo_applicationLocalServiceUtil
 */
@ProviderType
public class suiluppo_applicationLocalServiceImpl
	extends suiluppo_applicationLocalServiceBaseImpl {
	
	public boolean checkApplicantUnderCourse(long courseId,String applicant)
	{
		   //DynamicQuery appQuery = DynamicQueryFactoryUtil.forClass(suiluppo_application.class,PortalClassLoaderUtil.getClassLoader());
		   DynamicQuery appQuery = suiluppo_applicationLocalServiceUtil.dynamicQuery();
	       appQuery.add(RestrictionsFactoryUtil.and(RestrictionsFactoryUtil.eq("applicat_name", applicant), RestrictionsFactoryUtil.eq("course_id", courseId)));
	       return (suiluppo_applicationLocalServiceUtil.dynamicQuery(appQuery).size()>0?true:false);
	    
	}
	public List<suiluppo_application> getApplicantUnderCourse(long courseId)
	{
		   //DynamicQuery appQuery = DynamicQueryFactoryUtil.forClass(suiluppo_application.class,PortalClassLoaderUtil.getClassLoader());
		 DynamicQuery appQuery =suiluppo_applicationLocalServiceUtil.dynamicQuery();
		   appQuery.add(RestrictionsFactoryUtil.eq("course_id", courseId));
	       return suiluppo_applicationLocalServiceUtil.dynamicQuery(appQuery);
	    
	}
	
}
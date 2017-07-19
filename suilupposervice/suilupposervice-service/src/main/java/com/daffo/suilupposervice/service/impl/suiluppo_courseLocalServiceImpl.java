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

import com.daffo.suilupposervice.model.suiluppo_course;
import com.daffo.suilupposervice.service.suiluppo_courseLocalServiceUtil;
import com.daffo.suilupposervice.service.base.suiluppo_courseLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

/**
 * The implementation of the suiluppo_course local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.daffo.suilupposervice.service.suiluppo_courseLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_courseLocalServiceBaseImpl
 * @see com.daffo.suilupposervice.service.suiluppo_courseLocalServiceUtil
 */
@ProviderType
public class suiluppo_courseLocalServiceImpl
	extends suiluppo_courseLocalServiceBaseImpl {
	
	public List<suiluppo_course> getCourseUnderDocente(String Docente)
	{
		DynamicQuery dyQuery=suiluppo_courseLocalServiceUtil.dynamicQuery();
		dyQuery.add(RestrictionsFactoryUtil.eq("Docente", Docente));
		return suiluppo_courseLocalServiceUtil.dynamicQuery(dyQuery);
	    
	}
	public List<suiluppo_course> getCourseNotUnderDocente(String Docente)
	{
		//DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(suiluppo_course.class,PortalClassLoaderUtil.getClassLoader());
		DynamicQuery dyQuery=suiluppo_courseLocalServiceUtil.dynamicQuery();
	    dyQuery.add(RestrictionsFactoryUtil.ne("Docente", Docente));
	    return suiluppo_courseLocalServiceUtil.dynamicQuery(dyQuery);
	    
	}
	
	
}
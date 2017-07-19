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

package com.daffo.suilupposervice.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link suiluppo_courseLocalService}.
 *
 * @author Naveen
 * @see suiluppo_courseLocalService
 * @generated
 */
@ProviderType
public class suiluppo_courseLocalServiceWrapper
	implements suiluppo_courseLocalService,
		ServiceWrapper<suiluppo_courseLocalService> {
	public suiluppo_courseLocalServiceWrapper(
		suiluppo_courseLocalService suiluppo_courseLocalService) {
		_suiluppo_courseLocalService = suiluppo_courseLocalService;
	}

	/**
	* Adds the suiluppo_course to the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_course the suiluppo_course
	* @return the suiluppo_course that was added
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_course addsuiluppo_course(
		com.daffo.suilupposervice.model.suiluppo_course suiluppo_course) {
		return _suiluppo_courseLocalService.addsuiluppo_course(suiluppo_course);
	}

	/**
	* Creates a new suiluppo_course with the primary key. Does not add the suiluppo_course to the database.
	*
	* @param course_id the primary key for the new suiluppo_course
	* @return the new suiluppo_course
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_course createsuiluppo_course(
		long course_id) {
		return _suiluppo_courseLocalService.createsuiluppo_course(course_id);
	}

	/**
	* Deletes the suiluppo_course from the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_course the suiluppo_course
	* @return the suiluppo_course that was removed
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_course deletesuiluppo_course(
		com.daffo.suilupposervice.model.suiluppo_course suiluppo_course) {
		return _suiluppo_courseLocalService.deletesuiluppo_course(suiluppo_course);
	}

	/**
	* Deletes the suiluppo_course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param course_id the primary key of the suiluppo_course
	* @return the suiluppo_course that was removed
	* @throws PortalException if a suiluppo_course with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_course deletesuiluppo_course(
		long course_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_courseLocalService.deletesuiluppo_course(course_id);
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_course fetchsuiluppo_course(
		long course_id) {
		return _suiluppo_courseLocalService.fetchsuiluppo_course(course_id);
	}

	/**
	* Returns the suiluppo_course with the primary key.
	*
	* @param course_id the primary key of the suiluppo_course
	* @return the suiluppo_course
	* @throws PortalException if a suiluppo_course with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_course getsuiluppo_course(
		long course_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_courseLocalService.getsuiluppo_course(course_id);
	}

	/**
	* Updates the suiluppo_course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_course the suiluppo_course
	* @return the suiluppo_course that was updated
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_course updatesuiluppo_course(
		com.daffo.suilupposervice.model.suiluppo_course suiluppo_course) {
		return _suiluppo_courseLocalService.updatesuiluppo_course(suiluppo_course);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _suiluppo_courseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _suiluppo_courseLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _suiluppo_courseLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_courseLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_courseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of suiluppo_courses.
	*
	* @return the number of suiluppo_courses
	*/
	@Override
	public int getsuiluppo_coursesCount() {
		return _suiluppo_courseLocalService.getsuiluppo_coursesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _suiluppo_courseLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _suiluppo_courseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _suiluppo_courseLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _suiluppo_courseLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.daffo.suilupposervice.model.suiluppo_course> getCourseNotUnderDocente(
		java.lang.String Docente) {
		return _suiluppo_courseLocalService.getCourseNotUnderDocente(Docente);
	}

	@Override
	public java.util.List<com.daffo.suilupposervice.model.suiluppo_course> getCourseUnderDocente(
		java.lang.String Docente) {
		return _suiluppo_courseLocalService.getCourseUnderDocente(Docente);
	}

	/**
	* Returns a range of all the suiluppo_courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_courses
	* @param end the upper bound of the range of suiluppo_courses (not inclusive)
	* @return the range of suiluppo_courses
	*/
	@Override
	public java.util.List<com.daffo.suilupposervice.model.suiluppo_course> getsuiluppo_courses(
		int start, int end) {
		return _suiluppo_courseLocalService.getsuiluppo_courses(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _suiluppo_courseLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _suiluppo_courseLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public suiluppo_courseLocalService getWrappedService() {
		return _suiluppo_courseLocalService;
	}

	@Override
	public void setWrappedService(
		suiluppo_courseLocalService suiluppo_courseLocalService) {
		_suiluppo_courseLocalService = suiluppo_courseLocalService;
	}

	private suiluppo_courseLocalService _suiluppo_courseLocalService;
}
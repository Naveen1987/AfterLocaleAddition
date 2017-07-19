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
 * Provides a wrapper for {@link suiluppo_applicationLocalService}.
 *
 * @author Naveen
 * @see suiluppo_applicationLocalService
 * @generated
 */
@ProviderType
public class suiluppo_applicationLocalServiceWrapper
	implements suiluppo_applicationLocalService,
		ServiceWrapper<suiluppo_applicationLocalService> {
	public suiluppo_applicationLocalServiceWrapper(
		suiluppo_applicationLocalService suiluppo_applicationLocalService) {
		_suiluppo_applicationLocalService = suiluppo_applicationLocalService;
	}

	@Override
	public boolean checkApplicantUnderCourse(long courseId,
		java.lang.String applicant) {
		return _suiluppo_applicationLocalService.checkApplicantUnderCourse(courseId,
			applicant);
	}

	/**
	* Adds the suiluppo_application to the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_application the suiluppo_application
	* @return the suiluppo_application that was added
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_application addsuiluppo_application(
		com.daffo.suilupposervice.model.suiluppo_application suiluppo_application) {
		return _suiluppo_applicationLocalService.addsuiluppo_application(suiluppo_application);
	}

	/**
	* Creates a new suiluppo_application with the primary key. Does not add the suiluppo_application to the database.
	*
	* @param applicat_id the primary key for the new suiluppo_application
	* @return the new suiluppo_application
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_application createsuiluppo_application(
		long applicat_id) {
		return _suiluppo_applicationLocalService.createsuiluppo_application(applicat_id);
	}

	/**
	* Deletes the suiluppo_application from the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_application the suiluppo_application
	* @return the suiluppo_application that was removed
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_application deletesuiluppo_application(
		com.daffo.suilupposervice.model.suiluppo_application suiluppo_application) {
		return _suiluppo_applicationLocalService.deletesuiluppo_application(suiluppo_application);
	}

	/**
	* Deletes the suiluppo_application with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicat_id the primary key of the suiluppo_application
	* @return the suiluppo_application that was removed
	* @throws PortalException if a suiluppo_application with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_application deletesuiluppo_application(
		long applicat_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_applicationLocalService.deletesuiluppo_application(applicat_id);
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_application fetchsuiluppo_application(
		long applicat_id) {
		return _suiluppo_applicationLocalService.fetchsuiluppo_application(applicat_id);
	}

	/**
	* Returns the suiluppo_application with the primary key.
	*
	* @param applicat_id the primary key of the suiluppo_application
	* @return the suiluppo_application
	* @throws PortalException if a suiluppo_application with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_application getsuiluppo_application(
		long applicat_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_applicationLocalService.getsuiluppo_application(applicat_id);
	}

	/**
	* Updates the suiluppo_application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_application the suiluppo_application
	* @return the suiluppo_application that was updated
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_application updatesuiluppo_application(
		com.daffo.suilupposervice.model.suiluppo_application suiluppo_application) {
		return _suiluppo_applicationLocalService.updatesuiluppo_application(suiluppo_application);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _suiluppo_applicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _suiluppo_applicationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _suiluppo_applicationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_applicationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_applicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of suiluppo_applications.
	*
	* @return the number of suiluppo_applications
	*/
	@Override
	public int getsuiluppo_applicationsCount() {
		return _suiluppo_applicationLocalService.getsuiluppo_applicationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _suiluppo_applicationLocalService.getOSGiServiceIdentifier();
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
		return _suiluppo_applicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _suiluppo_applicationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _suiluppo_applicationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.daffo.suilupposervice.model.suiluppo_application> getApplicantUnderCourse(
		long courseId) {
		return _suiluppo_applicationLocalService.getApplicantUnderCourse(courseId);
	}

	/**
	* Returns a range of all the suiluppo_applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @return the range of suiluppo_applications
	*/
	@Override
	public java.util.List<com.daffo.suilupposervice.model.suiluppo_application> getsuiluppo_applications(
		int start, int end) {
		return _suiluppo_applicationLocalService.getsuiluppo_applications(start,
			end);
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
		return _suiluppo_applicationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _suiluppo_applicationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public suiluppo_applicationLocalService getWrappedService() {
		return _suiluppo_applicationLocalService;
	}

	@Override
	public void setWrappedService(
		suiluppo_applicationLocalService suiluppo_applicationLocalService) {
		_suiluppo_applicationLocalService = suiluppo_applicationLocalService;
	}

	private suiluppo_applicationLocalService _suiluppo_applicationLocalService;
}
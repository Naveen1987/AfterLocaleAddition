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
 * Provides a wrapper for {@link suiluppo_room_allocationLocalService}.
 *
 * @author Naveen
 * @see suiluppo_room_allocationLocalService
 * @generated
 */
@ProviderType
public class suiluppo_room_allocationLocalServiceWrapper
	implements suiluppo_room_allocationLocalService,
		ServiceWrapper<suiluppo_room_allocationLocalService> {
	public suiluppo_room_allocationLocalServiceWrapper(
		suiluppo_room_allocationLocalService suiluppo_room_allocationLocalService) {
		_suiluppo_room_allocationLocalService = suiluppo_room_allocationLocalService;
	}

	/**
	* Adds the suiluppo_room_allocation to the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room_allocation the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was added
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation addsuiluppo_room_allocation(
		com.daffo.suilupposervice.model.suiluppo_room_allocation suiluppo_room_allocation) {
		return _suiluppo_room_allocationLocalService.addsuiluppo_room_allocation(suiluppo_room_allocation);
	}

	/**
	* Creates a new suiluppo_room_allocation with the primary key. Does not add the suiluppo_room_allocation to the database.
	*
	* @param room_allocat_id the primary key for the new suiluppo_room_allocation
	* @return the new suiluppo_room_allocation
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation createsuiluppo_room_allocation(
		long room_allocat_id) {
		return _suiluppo_room_allocationLocalService.createsuiluppo_room_allocation(room_allocat_id);
	}

	/**
	* Deletes the suiluppo_room_allocation from the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room_allocation the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was removed
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation deletesuiluppo_room_allocation(
		com.daffo.suilupposervice.model.suiluppo_room_allocation suiluppo_room_allocation) {
		return _suiluppo_room_allocationLocalService.deletesuiluppo_room_allocation(suiluppo_room_allocation);
	}

	/**
	* Deletes the suiluppo_room_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was removed
	* @throws PortalException if a suiluppo_room_allocation with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation deletesuiluppo_room_allocation(
		long room_allocat_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_room_allocationLocalService.deletesuiluppo_room_allocation(room_allocat_id);
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation fetchsuiluppo_room_allocation(
		long room_allocat_id) {
		return _suiluppo_room_allocationLocalService.fetchsuiluppo_room_allocation(room_allocat_id);
	}

	/**
	* Returns the suiluppo_room_allocation with the primary key.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation
	* @throws PortalException if a suiluppo_room_allocation with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation getsuiluppo_room_allocation(
		long room_allocat_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_room_allocationLocalService.getsuiluppo_room_allocation(room_allocat_id);
	}

	/**
	* Updates the suiluppo_room_allocation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room_allocation the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was updated
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation updatesuiluppo_room_allocation(
		com.daffo.suilupposervice.model.suiluppo_room_allocation suiluppo_room_allocation) {
		return _suiluppo_room_allocationLocalService.updatesuiluppo_room_allocation(suiluppo_room_allocation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _suiluppo_room_allocationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _suiluppo_room_allocationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _suiluppo_room_allocationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_room_allocationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_room_allocationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of suiluppo_room_allocations.
	*
	* @return the number of suiluppo_room_allocations
	*/
	@Override
	public int getsuiluppo_room_allocationsCount() {
		return _suiluppo_room_allocationLocalService.getsuiluppo_room_allocationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _suiluppo_room_allocationLocalService.getOSGiServiceIdentifier();
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
		return _suiluppo_room_allocationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _suiluppo_room_allocationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _suiluppo_room_allocationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the suiluppo_room_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @return the range of suiluppo_room_allocations
	*/
	@Override
	public java.util.List<com.daffo.suilupposervice.model.suiluppo_room_allocation> getsuiluppo_room_allocations(
		int start, int end) {
		return _suiluppo_room_allocationLocalService.getsuiluppo_room_allocations(start,
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
		return _suiluppo_room_allocationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _suiluppo_room_allocationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public suiluppo_room_allocationLocalService getWrappedService() {
		return _suiluppo_room_allocationLocalService;
	}

	@Override
	public void setWrappedService(
		suiluppo_room_allocationLocalService suiluppo_room_allocationLocalService) {
		_suiluppo_room_allocationLocalService = suiluppo_room_allocationLocalService;
	}

	private suiluppo_room_allocationLocalService _suiluppo_room_allocationLocalService;
}
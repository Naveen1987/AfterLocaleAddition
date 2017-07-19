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
 * Provides a wrapper for {@link suiluppo_equip_allocationLocalService}.
 *
 * @author Naveen
 * @see suiluppo_equip_allocationLocalService
 * @generated
 */
@ProviderType
public class suiluppo_equip_allocationLocalServiceWrapper
	implements suiluppo_equip_allocationLocalService,
		ServiceWrapper<suiluppo_equip_allocationLocalService> {
	public suiluppo_equip_allocationLocalServiceWrapper(
		suiluppo_equip_allocationLocalService suiluppo_equip_allocationLocalService) {
		_suiluppo_equip_allocationLocalService = suiluppo_equip_allocationLocalService;
	}

	/**
	* Adds the suiluppo_equip_allocation to the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_equip_allocation the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation that was added
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation addsuiluppo_equip_allocation(
		com.daffo.suilupposervice.model.suiluppo_equip_allocation suiluppo_equip_allocation) {
		return _suiluppo_equip_allocationLocalService.addsuiluppo_equip_allocation(suiluppo_equip_allocation);
	}

	/**
	* Creates a new suiluppo_equip_allocation with the primary key. Does not add the suiluppo_equip_allocation to the database.
	*
	* @param equip_allocat_id the primary key for the new suiluppo_equip_allocation
	* @return the new suiluppo_equip_allocation
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation createsuiluppo_equip_allocation(
		long equip_allocat_id) {
		return _suiluppo_equip_allocationLocalService.createsuiluppo_equip_allocation(equip_allocat_id);
	}

	/**
	* Deletes the suiluppo_equip_allocation from the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_equip_allocation the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation that was removed
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation deletesuiluppo_equip_allocation(
		com.daffo.suilupposervice.model.suiluppo_equip_allocation suiluppo_equip_allocation) {
		return _suiluppo_equip_allocationLocalService.deletesuiluppo_equip_allocation(suiluppo_equip_allocation);
	}

	/**
	* Deletes the suiluppo_equip_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation that was removed
	* @throws PortalException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation deletesuiluppo_equip_allocation(
		long equip_allocat_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_equip_allocationLocalService.deletesuiluppo_equip_allocation(equip_allocat_id);
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation fetchsuiluppo_equip_allocation(
		long equip_allocat_id) {
		return _suiluppo_equip_allocationLocalService.fetchsuiluppo_equip_allocation(equip_allocat_id);
	}

	/**
	* Returns the suiluppo_equip_allocation with the primary key.
	*
	* @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation
	* @throws PortalException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation getsuiluppo_equip_allocation(
		long equip_allocat_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_equip_allocationLocalService.getsuiluppo_equip_allocation(equip_allocat_id);
	}

	/**
	* Updates the suiluppo_equip_allocation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_equip_allocation the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation that was updated
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation updatesuiluppo_equip_allocation(
		com.daffo.suilupposervice.model.suiluppo_equip_allocation suiluppo_equip_allocation) {
		return _suiluppo_equip_allocationLocalService.updatesuiluppo_equip_allocation(suiluppo_equip_allocation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _suiluppo_equip_allocationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _suiluppo_equip_allocationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _suiluppo_equip_allocationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_equip_allocationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_equip_allocationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of suiluppo_equip_allocations.
	*
	* @return the number of suiluppo_equip_allocations
	*/
	@Override
	public int getsuiluppo_equip_allocationsCount() {
		return _suiluppo_equip_allocationLocalService.getsuiluppo_equip_allocationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _suiluppo_equip_allocationLocalService.getOSGiServiceIdentifier();
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
		return _suiluppo_equip_allocationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _suiluppo_equip_allocationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _suiluppo_equip_allocationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the suiluppo_equip_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @return the range of suiluppo_equip_allocations
	*/
	@Override
	public java.util.List<com.daffo.suilupposervice.model.suiluppo_equip_allocation> getsuiluppo_equip_allocations(
		int start, int end) {
		return _suiluppo_equip_allocationLocalService.getsuiluppo_equip_allocations(start,
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
		return _suiluppo_equip_allocationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _suiluppo_equip_allocationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public suiluppo_equip_allocationLocalService getWrappedService() {
		return _suiluppo_equip_allocationLocalService;
	}

	@Override
	public void setWrappedService(
		suiluppo_equip_allocationLocalService suiluppo_equip_allocationLocalService) {
		_suiluppo_equip_allocationLocalService = suiluppo_equip_allocationLocalService;
	}

	private suiluppo_equip_allocationLocalService _suiluppo_equip_allocationLocalService;
}
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
 * Provides a wrapper for {@link suiluppo_roomLocalService}.
 *
 * @author Naveen
 * @see suiluppo_roomLocalService
 * @generated
 */
@ProviderType
public class suiluppo_roomLocalServiceWrapper
	implements suiluppo_roomLocalService,
		ServiceWrapper<suiluppo_roomLocalService> {
	public suiluppo_roomLocalServiceWrapper(
		suiluppo_roomLocalService suiluppo_roomLocalService) {
		_suiluppo_roomLocalService = suiluppo_roomLocalService;
	}

	/**
	* Adds the suiluppo_room to the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room the suiluppo_room
	* @return the suiluppo_room that was added
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room addsuiluppo_room(
		com.daffo.suilupposervice.model.suiluppo_room suiluppo_room) {
		return _suiluppo_roomLocalService.addsuiluppo_room(suiluppo_room);
	}

	/**
	* Creates a new suiluppo_room with the primary key. Does not add the suiluppo_room to the database.
	*
	* @param roomID the primary key for the new suiluppo_room
	* @return the new suiluppo_room
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room createsuiluppo_room(
		long roomID) {
		return _suiluppo_roomLocalService.createsuiluppo_room(roomID);
	}

	/**
	* Deletes the suiluppo_room from the database. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room the suiluppo_room
	* @return the suiluppo_room that was removed
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room deletesuiluppo_room(
		com.daffo.suilupposervice.model.suiluppo_room suiluppo_room) {
		return _suiluppo_roomLocalService.deletesuiluppo_room(suiluppo_room);
	}

	/**
	* Deletes the suiluppo_room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomID the primary key of the suiluppo_room
	* @return the suiluppo_room that was removed
	* @throws PortalException if a suiluppo_room with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room deletesuiluppo_room(
		long roomID) throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_roomLocalService.deletesuiluppo_room(roomID);
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room fetchsuiluppo_room(
		long roomID) {
		return _suiluppo_roomLocalService.fetchsuiluppo_room(roomID);
	}

	/**
	* Returns the suiluppo_room with the primary key.
	*
	* @param roomID the primary key of the suiluppo_room
	* @return the suiluppo_room
	* @throws PortalException if a suiluppo_room with the primary key could not be found
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room getsuiluppo_room(
		long roomID) throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_roomLocalService.getsuiluppo_room(roomID);
	}

	/**
	* Updates the suiluppo_room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suiluppo_room the suiluppo_room
	* @return the suiluppo_room that was updated
	*/
	@Override
	public com.daffo.suilupposervice.model.suiluppo_room updatesuiluppo_room(
		com.daffo.suilupposervice.model.suiluppo_room suiluppo_room) {
		return _suiluppo_roomLocalService.updatesuiluppo_room(suiluppo_room);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _suiluppo_roomLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _suiluppo_roomLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _suiluppo_roomLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_roomLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _suiluppo_roomLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of suiluppo_rooms.
	*
	* @return the number of suiluppo_rooms
	*/
	@Override
	public int getsuiluppo_roomsCount() {
		return _suiluppo_roomLocalService.getsuiluppo_roomsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _suiluppo_roomLocalService.getOSGiServiceIdentifier();
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
		return _suiluppo_roomLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _suiluppo_roomLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _suiluppo_roomLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the suiluppo_rooms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_rooms
	* @param end the upper bound of the range of suiluppo_rooms (not inclusive)
	* @return the range of suiluppo_rooms
	*/
	@Override
	public java.util.List<com.daffo.suilupposervice.model.suiluppo_room> getsuiluppo_rooms(
		int start, int end) {
		return _suiluppo_roomLocalService.getsuiluppo_rooms(start, end);
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
		return _suiluppo_roomLocalService.dynamicQueryCount(dynamicQuery);
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
		return _suiluppo_roomLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public suiluppo_roomLocalService getWrappedService() {
		return _suiluppo_roomLocalService;
	}

	@Override
	public void setWrappedService(
		suiluppo_roomLocalService suiluppo_roomLocalService) {
		_suiluppo_roomLocalService = suiluppo_roomLocalService;
	}

	private suiluppo_roomLocalService _suiluppo_roomLocalService;
}
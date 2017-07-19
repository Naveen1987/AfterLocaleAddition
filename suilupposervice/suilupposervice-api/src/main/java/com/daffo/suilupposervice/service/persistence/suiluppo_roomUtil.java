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

package com.daffo.suilupposervice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.daffo.suilupposervice.model.suiluppo_room;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the suiluppo_room service. This utility wraps {@link com.daffo.suilupposervice.service.persistence.impl.suiluppo_roomPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_roomPersistence
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_roomPersistenceImpl
 * @generated
 */
@ProviderType
public class suiluppo_roomUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(suiluppo_room suiluppo_room) {
		getPersistence().clearCache(suiluppo_room);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<suiluppo_room> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<suiluppo_room> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<suiluppo_room> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<suiluppo_room> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static suiluppo_room update(suiluppo_room suiluppo_room) {
		return getPersistence().update(suiluppo_room);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static suiluppo_room update(suiluppo_room suiluppo_room,
		ServiceContext serviceContext) {
		return getPersistence().update(suiluppo_room, serviceContext);
	}

	/**
	* Caches the suiluppo_room in the entity cache if it is enabled.
	*
	* @param suiluppo_room the suiluppo_room
	*/
	public static void cacheResult(suiluppo_room suiluppo_room) {
		getPersistence().cacheResult(suiluppo_room);
	}

	/**
	* Caches the suiluppo_rooms in the entity cache if it is enabled.
	*
	* @param suiluppo_rooms the suiluppo_rooms
	*/
	public static void cacheResult(List<suiluppo_room> suiluppo_rooms) {
		getPersistence().cacheResult(suiluppo_rooms);
	}

	/**
	* Creates a new suiluppo_room with the primary key. Does not add the suiluppo_room to the database.
	*
	* @param roomID the primary key for the new suiluppo_room
	* @return the new suiluppo_room
	*/
	public static suiluppo_room create(long roomID) {
		return getPersistence().create(roomID);
	}

	/**
	* Removes the suiluppo_room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomID the primary key of the suiluppo_room
	* @return the suiluppo_room that was removed
	* @throws NoSuchsuiluppo_roomException if a suiluppo_room with the primary key could not be found
	*/
	public static suiluppo_room remove(long roomID)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_roomException {
		return getPersistence().remove(roomID);
	}

	public static suiluppo_room updateImpl(suiluppo_room suiluppo_room) {
		return getPersistence().updateImpl(suiluppo_room);
	}

	/**
	* Returns the suiluppo_room with the primary key or throws a {@link NoSuchsuiluppo_roomException} if it could not be found.
	*
	* @param roomID the primary key of the suiluppo_room
	* @return the suiluppo_room
	* @throws NoSuchsuiluppo_roomException if a suiluppo_room with the primary key could not be found
	*/
	public static suiluppo_room findByPrimaryKey(long roomID)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_roomException {
		return getPersistence().findByPrimaryKey(roomID);
	}

	/**
	* Returns the suiluppo_room with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roomID the primary key of the suiluppo_room
	* @return the suiluppo_room, or <code>null</code> if a suiluppo_room with the primary key could not be found
	*/
	public static suiluppo_room fetchByPrimaryKey(long roomID) {
		return getPersistence().fetchByPrimaryKey(roomID);
	}

	public static java.util.Map<java.io.Serializable, suiluppo_room> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the suiluppo_rooms.
	*
	* @return the suiluppo_rooms
	*/
	public static List<suiluppo_room> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the suiluppo_rooms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_rooms
	* @param end the upper bound of the range of suiluppo_rooms (not inclusive)
	* @return the range of suiluppo_rooms
	*/
	public static List<suiluppo_room> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_rooms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_rooms
	* @param end the upper bound of the range of suiluppo_rooms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suiluppo_rooms
	*/
	public static List<suiluppo_room> findAll(int start, int end,
		OrderByComparator<suiluppo_room> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_rooms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_rooms
	* @param end the upper bound of the range of suiluppo_rooms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of suiluppo_rooms
	*/
	public static List<suiluppo_room> findAll(int start, int end,
		OrderByComparator<suiluppo_room> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the suiluppo_rooms from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of suiluppo_rooms.
	*
	* @return the number of suiluppo_rooms
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static suiluppo_roomPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<suiluppo_roomPersistence, suiluppo_roomPersistence> _serviceTracker =
		ServiceTrackerFactory.open(suiluppo_roomPersistence.class);
}
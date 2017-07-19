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

import com.daffo.suilupposervice.model.suiluppo_room_allocation;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the suiluppo_room_allocation service. This utility wraps {@link com.daffo.suilupposervice.service.persistence.impl.suiluppo_room_allocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_room_allocationPersistence
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_room_allocationPersistenceImpl
 * @generated
 */
@ProviderType
public class suiluppo_room_allocationUtil {
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
	public static void clearCache(
		suiluppo_room_allocation suiluppo_room_allocation) {
		getPersistence().clearCache(suiluppo_room_allocation);
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
	public static List<suiluppo_room_allocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<suiluppo_room_allocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<suiluppo_room_allocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<suiluppo_room_allocation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static suiluppo_room_allocation update(
		suiluppo_room_allocation suiluppo_room_allocation) {
		return getPersistence().update(suiluppo_room_allocation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static suiluppo_room_allocation update(
		suiluppo_room_allocation suiluppo_room_allocation,
		ServiceContext serviceContext) {
		return getPersistence().update(suiluppo_room_allocation, serviceContext);
	}

	/**
	* Returns all the suiluppo_room_allocations where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the matching suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findBycourse_id(long course_id) {
		return getPersistence().findBycourse_id(course_id);
	}

	/**
	* Returns a range of all the suiluppo_room_allocations where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @return the range of matching suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findBycourse_id(
		long course_id, int start, int end) {
		return getPersistence().findBycourse_id(course_id, start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_room_allocations where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findBycourse_id(
		long course_id, int start, int end,
		OrderByComparator<suiluppo_room_allocation> orderByComparator) {
		return getPersistence()
				   .findBycourse_id(course_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_room_allocations where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findBycourse_id(
		long course_id, int start, int end,
		OrderByComparator<suiluppo_room_allocation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycourse_id(course_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a matching suiluppo_room_allocation could not be found
	*/
	public static suiluppo_room_allocation findBycourse_id_First(
		long course_id,
		OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException {
		return getPersistence()
				   .findBycourse_id_First(course_id, orderByComparator);
	}

	/**
	* Returns the first suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_room_allocation, or <code>null</code> if a matching suiluppo_room_allocation could not be found
	*/
	public static suiluppo_room_allocation fetchBycourse_id_First(
		long course_id,
		OrderByComparator<suiluppo_room_allocation> orderByComparator) {
		return getPersistence()
				   .fetchBycourse_id_First(course_id, orderByComparator);
	}

	/**
	* Returns the last suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a matching suiluppo_room_allocation could not be found
	*/
	public static suiluppo_room_allocation findBycourse_id_Last(
		long course_id,
		OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException {
		return getPersistence()
				   .findBycourse_id_Last(course_id, orderByComparator);
	}

	/**
	* Returns the last suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_room_allocation, or <code>null</code> if a matching suiluppo_room_allocation could not be found
	*/
	public static suiluppo_room_allocation fetchBycourse_id_Last(
		long course_id,
		OrderByComparator<suiluppo_room_allocation> orderByComparator) {
		return getPersistence()
				   .fetchBycourse_id_Last(course_id, orderByComparator);
	}

	/**
	* Returns the suiluppo_room_allocations before and after the current suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param room_allocat_id the primary key of the current suiluppo_room_allocation
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a suiluppo_room_allocation with the primary key could not be found
	*/
	public static suiluppo_room_allocation[] findBycourse_id_PrevAndNext(
		long room_allocat_id, long course_id,
		OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException {
		return getPersistence()
				   .findBycourse_id_PrevAndNext(room_allocat_id, course_id,
			orderByComparator);
	}

	/**
	* Removes all the suiluppo_room_allocations where course_id = &#63; from the database.
	*
	* @param course_id the course_id
	*/
	public static void removeBycourse_id(long course_id) {
		getPersistence().removeBycourse_id(course_id);
	}

	/**
	* Returns the number of suiluppo_room_allocations where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the number of matching suiluppo_room_allocations
	*/
	public static int countBycourse_id(long course_id) {
		return getPersistence().countBycourse_id(course_id);
	}

	/**
	* Returns all the suiluppo_room_allocations where roomID = &#63;.
	*
	* @param roomID the room ID
	* @return the matching suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findByroomID(long roomID) {
		return getPersistence().findByroomID(roomID);
	}

	/**
	* Returns a range of all the suiluppo_room_allocations where roomID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roomID the room ID
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @return the range of matching suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findByroomID(long roomID,
		int start, int end) {
		return getPersistence().findByroomID(roomID, start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_room_allocations where roomID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roomID the room ID
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findByroomID(long roomID,
		int start, int end,
		OrderByComparator<suiluppo_room_allocation> orderByComparator) {
		return getPersistence()
				   .findByroomID(roomID, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_room_allocations where roomID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roomID the room ID
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findByroomID(long roomID,
		int start, int end,
		OrderByComparator<suiluppo_room_allocation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByroomID(roomID, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a matching suiluppo_room_allocation could not be found
	*/
	public static suiluppo_room_allocation findByroomID_First(long roomID,
		OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException {
		return getPersistence().findByroomID_First(roomID, orderByComparator);
	}

	/**
	* Returns the first suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_room_allocation, or <code>null</code> if a matching suiluppo_room_allocation could not be found
	*/
	public static suiluppo_room_allocation fetchByroomID_First(long roomID,
		OrderByComparator<suiluppo_room_allocation> orderByComparator) {
		return getPersistence().fetchByroomID_First(roomID, orderByComparator);
	}

	/**
	* Returns the last suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a matching suiluppo_room_allocation could not be found
	*/
	public static suiluppo_room_allocation findByroomID_Last(long roomID,
		OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException {
		return getPersistence().findByroomID_Last(roomID, orderByComparator);
	}

	/**
	* Returns the last suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_room_allocation, or <code>null</code> if a matching suiluppo_room_allocation could not be found
	*/
	public static suiluppo_room_allocation fetchByroomID_Last(long roomID,
		OrderByComparator<suiluppo_room_allocation> orderByComparator) {
		return getPersistence().fetchByroomID_Last(roomID, orderByComparator);
	}

	/**
	* Returns the suiluppo_room_allocations before and after the current suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param room_allocat_id the primary key of the current suiluppo_room_allocation
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a suiluppo_room_allocation with the primary key could not be found
	*/
	public static suiluppo_room_allocation[] findByroomID_PrevAndNext(
		long room_allocat_id, long roomID,
		OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException {
		return getPersistence()
				   .findByroomID_PrevAndNext(room_allocat_id, roomID,
			orderByComparator);
	}

	/**
	* Removes all the suiluppo_room_allocations where roomID = &#63; from the database.
	*
	* @param roomID the room ID
	*/
	public static void removeByroomID(long roomID) {
		getPersistence().removeByroomID(roomID);
	}

	/**
	* Returns the number of suiluppo_room_allocations where roomID = &#63;.
	*
	* @param roomID the room ID
	* @return the number of matching suiluppo_room_allocations
	*/
	public static int countByroomID(long roomID) {
		return getPersistence().countByroomID(roomID);
	}

	/**
	* Caches the suiluppo_room_allocation in the entity cache if it is enabled.
	*
	* @param suiluppo_room_allocation the suiluppo_room_allocation
	*/
	public static void cacheResult(
		suiluppo_room_allocation suiluppo_room_allocation) {
		getPersistence().cacheResult(suiluppo_room_allocation);
	}

	/**
	* Caches the suiluppo_room_allocations in the entity cache if it is enabled.
	*
	* @param suiluppo_room_allocations the suiluppo_room_allocations
	*/
	public static void cacheResult(
		List<suiluppo_room_allocation> suiluppo_room_allocations) {
		getPersistence().cacheResult(suiluppo_room_allocations);
	}

	/**
	* Creates a new suiluppo_room_allocation with the primary key. Does not add the suiluppo_room_allocation to the database.
	*
	* @param room_allocat_id the primary key for the new suiluppo_room_allocation
	* @return the new suiluppo_room_allocation
	*/
	public static suiluppo_room_allocation create(long room_allocat_id) {
		return getPersistence().create(room_allocat_id);
	}

	/**
	* Removes the suiluppo_room_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was removed
	* @throws NoSuchsuiluppo_room_allocationException if a suiluppo_room_allocation with the primary key could not be found
	*/
	public static suiluppo_room_allocation remove(long room_allocat_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException {
		return getPersistence().remove(room_allocat_id);
	}

	public static suiluppo_room_allocation updateImpl(
		suiluppo_room_allocation suiluppo_room_allocation) {
		return getPersistence().updateImpl(suiluppo_room_allocation);
	}

	/**
	* Returns the suiluppo_room_allocation with the primary key or throws a {@link NoSuchsuiluppo_room_allocationException} if it could not be found.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a suiluppo_room_allocation with the primary key could not be found
	*/
	public static suiluppo_room_allocation findByPrimaryKey(
		long room_allocat_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException {
		return getPersistence().findByPrimaryKey(room_allocat_id);
	}

	/**
	* Returns the suiluppo_room_allocation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation, or <code>null</code> if a suiluppo_room_allocation with the primary key could not be found
	*/
	public static suiluppo_room_allocation fetchByPrimaryKey(
		long room_allocat_id) {
		return getPersistence().fetchByPrimaryKey(room_allocat_id);
	}

	public static java.util.Map<java.io.Serializable, suiluppo_room_allocation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the suiluppo_room_allocations.
	*
	* @return the suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the suiluppo_room_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @return the range of suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_room_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findAll(int start, int end,
		OrderByComparator<suiluppo_room_allocation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_room_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_room_allocations
	* @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of suiluppo_room_allocations
	*/
	public static List<suiluppo_room_allocation> findAll(int start, int end,
		OrderByComparator<suiluppo_room_allocation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the suiluppo_room_allocations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of suiluppo_room_allocations.
	*
	* @return the number of suiluppo_room_allocations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static suiluppo_room_allocationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<suiluppo_room_allocationPersistence, suiluppo_room_allocationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(suiluppo_room_allocationPersistence.class);
}
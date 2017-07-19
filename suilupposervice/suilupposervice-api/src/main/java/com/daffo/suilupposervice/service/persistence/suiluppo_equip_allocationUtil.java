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

import com.daffo.suilupposervice.model.suiluppo_equip_allocation;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the suiluppo_equip_allocation service. This utility wraps {@link com.daffo.suilupposervice.service.persistence.impl.suiluppo_equip_allocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_equip_allocationPersistence
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_equip_allocationPersistenceImpl
 * @generated
 */
@ProviderType
public class suiluppo_equip_allocationUtil {
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
		suiluppo_equip_allocation suiluppo_equip_allocation) {
		getPersistence().clearCache(suiluppo_equip_allocation);
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
	public static List<suiluppo_equip_allocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<suiluppo_equip_allocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<suiluppo_equip_allocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static suiluppo_equip_allocation update(
		suiluppo_equip_allocation suiluppo_equip_allocation) {
		return getPersistence().update(suiluppo_equip_allocation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static suiluppo_equip_allocation update(
		suiluppo_equip_allocation suiluppo_equip_allocation,
		ServiceContext serviceContext) {
		return getPersistence().update(suiluppo_equip_allocation, serviceContext);
	}

	/**
	* Returns all the suiluppo_equip_allocations where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the matching suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findBycourse_id(
		long course_id) {
		return getPersistence().findBycourse_id(course_id);
	}

	/**
	* Returns a range of all the suiluppo_equip_allocations where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @return the range of matching suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findBycourse_id(
		long course_id, int start, int end) {
		return getPersistence().findBycourse_id(course_id, start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_equip_allocations where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findBycourse_id(
		long course_id, int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return getPersistence()
				   .findBycourse_id(course_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_equip_allocations where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findBycourse_id(
		long course_id, int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycourse_id(course_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	*/
	public static suiluppo_equip_allocation findBycourse_id_First(
		long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException {
		return getPersistence()
				   .findBycourse_id_First(course_id, orderByComparator);
	}

	/**
	* Returns the first suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	*/
	public static suiluppo_equip_allocation fetchBycourse_id_First(
		long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return getPersistence()
				   .fetchBycourse_id_First(course_id, orderByComparator);
	}

	/**
	* Returns the last suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	*/
	public static suiluppo_equip_allocation findBycourse_id_Last(
		long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException {
		return getPersistence()
				   .findBycourse_id_Last(course_id, orderByComparator);
	}

	/**
	* Returns the last suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	*/
	public static suiluppo_equip_allocation fetchBycourse_id_Last(
		long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return getPersistence()
				   .fetchBycourse_id_Last(course_id, orderByComparator);
	}

	/**
	* Returns the suiluppo_equip_allocations before and after the current suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param equip_allocat_id the primary key of the current suiluppo_equip_allocation
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public static suiluppo_equip_allocation[] findBycourse_id_PrevAndNext(
		long equip_allocat_id, long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException {
		return getPersistence()
				   .findBycourse_id_PrevAndNext(equip_allocat_id, course_id,
			orderByComparator);
	}

	/**
	* Removes all the suiluppo_equip_allocations where course_id = &#63; from the database.
	*
	* @param course_id the course_id
	*/
	public static void removeBycourse_id(long course_id) {
		getPersistence().removeBycourse_id(course_id);
	}

	/**
	* Returns the number of suiluppo_equip_allocations where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the number of matching suiluppo_equip_allocations
	*/
	public static int countBycourse_id(long course_id) {
		return getPersistence().countBycourse_id(course_id);
	}

	/**
	* Returns all the suiluppo_equip_allocations where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @return the matching suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findByequip_id(long equip_id) {
		return getPersistence().findByequip_id(equip_id);
	}

	/**
	* Returns a range of all the suiluppo_equip_allocations where equip_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param equip_id the equip_id
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @return the range of matching suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findByequip_id(
		long equip_id, int start, int end) {
		return getPersistence().findByequip_id(equip_id, start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_equip_allocations where equip_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param equip_id the equip_id
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findByequip_id(
		long equip_id, int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return getPersistence()
				   .findByequip_id(equip_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_equip_allocations where equip_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param equip_id the equip_id
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findByequip_id(
		long equip_id, int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByequip_id(equip_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	*/
	public static suiluppo_equip_allocation findByequip_id_First(
		long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException {
		return getPersistence().findByequip_id_First(equip_id, orderByComparator);
	}

	/**
	* Returns the first suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	*/
	public static suiluppo_equip_allocation fetchByequip_id_First(
		long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return getPersistence()
				   .fetchByequip_id_First(equip_id, orderByComparator);
	}

	/**
	* Returns the last suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	*/
	public static suiluppo_equip_allocation findByequip_id_Last(long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException {
		return getPersistence().findByequip_id_Last(equip_id, orderByComparator);
	}

	/**
	* Returns the last suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	*/
	public static suiluppo_equip_allocation fetchByequip_id_Last(
		long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return getPersistence().fetchByequip_id_Last(equip_id, orderByComparator);
	}

	/**
	* Returns the suiluppo_equip_allocations before and after the current suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_allocat_id the primary key of the current suiluppo_equip_allocation
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public static suiluppo_equip_allocation[] findByequip_id_PrevAndNext(
		long equip_allocat_id, long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException {
		return getPersistence()
				   .findByequip_id_PrevAndNext(equip_allocat_id, equip_id,
			orderByComparator);
	}

	/**
	* Removes all the suiluppo_equip_allocations where equip_id = &#63; from the database.
	*
	* @param equip_id the equip_id
	*/
	public static void removeByequip_id(long equip_id) {
		getPersistence().removeByequip_id(equip_id);
	}

	/**
	* Returns the number of suiluppo_equip_allocations where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @return the number of matching suiluppo_equip_allocations
	*/
	public static int countByequip_id(long equip_id) {
		return getPersistence().countByequip_id(equip_id);
	}

	/**
	* Caches the suiluppo_equip_allocation in the entity cache if it is enabled.
	*
	* @param suiluppo_equip_allocation the suiluppo_equip_allocation
	*/
	public static void cacheResult(
		suiluppo_equip_allocation suiluppo_equip_allocation) {
		getPersistence().cacheResult(suiluppo_equip_allocation);
	}

	/**
	* Caches the suiluppo_equip_allocations in the entity cache if it is enabled.
	*
	* @param suiluppo_equip_allocations the suiluppo_equip_allocations
	*/
	public static void cacheResult(
		List<suiluppo_equip_allocation> suiluppo_equip_allocations) {
		getPersistence().cacheResult(suiluppo_equip_allocations);
	}

	/**
	* Creates a new suiluppo_equip_allocation with the primary key. Does not add the suiluppo_equip_allocation to the database.
	*
	* @param equip_allocat_id the primary key for the new suiluppo_equip_allocation
	* @return the new suiluppo_equip_allocation
	*/
	public static suiluppo_equip_allocation create(long equip_allocat_id) {
		return getPersistence().create(equip_allocat_id);
	}

	/**
	* Removes the suiluppo_equip_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation that was removed
	* @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public static suiluppo_equip_allocation remove(long equip_allocat_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException {
		return getPersistence().remove(equip_allocat_id);
	}

	public static suiluppo_equip_allocation updateImpl(
		suiluppo_equip_allocation suiluppo_equip_allocation) {
		return getPersistence().updateImpl(suiluppo_equip_allocation);
	}

	/**
	* Returns the suiluppo_equip_allocation with the primary key or throws a {@link NoSuchsuiluppo_equip_allocationException} if it could not be found.
	*
	* @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public static suiluppo_equip_allocation findByPrimaryKey(
		long equip_allocat_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException {
		return getPersistence().findByPrimaryKey(equip_allocat_id);
	}

	/**
	* Returns the suiluppo_equip_allocation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation, or <code>null</code> if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public static suiluppo_equip_allocation fetchByPrimaryKey(
		long equip_allocat_id) {
		return getPersistence().fetchByPrimaryKey(equip_allocat_id);
	}

	public static java.util.Map<java.io.Serializable, suiluppo_equip_allocation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the suiluppo_equip_allocations.
	*
	* @return the suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the suiluppo_equip_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @return the range of suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_equip_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findAll(int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_equip_allocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_equip_allocations
	* @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of suiluppo_equip_allocations
	*/
	public static List<suiluppo_equip_allocation> findAll(int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the suiluppo_equip_allocations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of suiluppo_equip_allocations.
	*
	* @return the number of suiluppo_equip_allocations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static suiluppo_equip_allocationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<suiluppo_equip_allocationPersistence, suiluppo_equip_allocationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(suiluppo_equip_allocationPersistence.class);
}
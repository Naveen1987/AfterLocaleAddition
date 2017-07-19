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

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocationException;
import com.daffo.suilupposervice.model.suiluppo_room_allocation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the suiluppo_room_allocation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_room_allocationPersistenceImpl
 * @see suiluppo_room_allocationUtil
 * @generated
 */
@ProviderType
public interface suiluppo_room_allocationPersistence extends BasePersistence<suiluppo_room_allocation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link suiluppo_room_allocationUtil} to access the suiluppo_room_allocation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the suiluppo_room_allocations where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the matching suiluppo_room_allocations
	*/
	public java.util.List<suiluppo_room_allocation> findBycourse_id(
		long course_id);

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
	public java.util.List<suiluppo_room_allocation> findBycourse_id(
		long course_id, int start, int end);

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
	public java.util.List<suiluppo_room_allocation> findBycourse_id(
		long course_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator);

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
	public java.util.List<suiluppo_room_allocation> findBycourse_id(
		long course_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a matching suiluppo_room_allocation could not be found
	*/
	public suiluppo_room_allocation findBycourse_id_First(long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws NoSuchsuiluppo_room_allocationException;

	/**
	* Returns the first suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_room_allocation, or <code>null</code> if a matching suiluppo_room_allocation could not be found
	*/
	public suiluppo_room_allocation fetchBycourse_id_First(long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator);

	/**
	* Returns the last suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a matching suiluppo_room_allocation could not be found
	*/
	public suiluppo_room_allocation findBycourse_id_Last(long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws NoSuchsuiluppo_room_allocationException;

	/**
	* Returns the last suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_room_allocation, or <code>null</code> if a matching suiluppo_room_allocation could not be found
	*/
	public suiluppo_room_allocation fetchBycourse_id_Last(long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator);

	/**
	* Returns the suiluppo_room_allocations before and after the current suiluppo_room_allocation in the ordered set where course_id = &#63;.
	*
	* @param room_allocat_id the primary key of the current suiluppo_room_allocation
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a suiluppo_room_allocation with the primary key could not be found
	*/
	public suiluppo_room_allocation[] findBycourse_id_PrevAndNext(
		long room_allocat_id, long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws NoSuchsuiluppo_room_allocationException;

	/**
	* Removes all the suiluppo_room_allocations where course_id = &#63; from the database.
	*
	* @param course_id the course_id
	*/
	public void removeBycourse_id(long course_id);

	/**
	* Returns the number of suiluppo_room_allocations where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the number of matching suiluppo_room_allocations
	*/
	public int countBycourse_id(long course_id);

	/**
	* Returns all the suiluppo_room_allocations where roomID = &#63;.
	*
	* @param roomID the room ID
	* @return the matching suiluppo_room_allocations
	*/
	public java.util.List<suiluppo_room_allocation> findByroomID(long roomID);

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
	public java.util.List<suiluppo_room_allocation> findByroomID(long roomID,
		int start, int end);

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
	public java.util.List<suiluppo_room_allocation> findByroomID(long roomID,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator);

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
	public java.util.List<suiluppo_room_allocation> findByroomID(long roomID,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a matching suiluppo_room_allocation could not be found
	*/
	public suiluppo_room_allocation findByroomID_First(long roomID,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws NoSuchsuiluppo_room_allocationException;

	/**
	* Returns the first suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_room_allocation, or <code>null</code> if a matching suiluppo_room_allocation could not be found
	*/
	public suiluppo_room_allocation fetchByroomID_First(long roomID,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator);

	/**
	* Returns the last suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a matching suiluppo_room_allocation could not be found
	*/
	public suiluppo_room_allocation findByroomID_Last(long roomID,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws NoSuchsuiluppo_room_allocationException;

	/**
	* Returns the last suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_room_allocation, or <code>null</code> if a matching suiluppo_room_allocation could not be found
	*/
	public suiluppo_room_allocation fetchByroomID_Last(long roomID,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator);

	/**
	* Returns the suiluppo_room_allocations before and after the current suiluppo_room_allocation in the ordered set where roomID = &#63;.
	*
	* @param room_allocat_id the primary key of the current suiluppo_room_allocation
	* @param roomID the room ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a suiluppo_room_allocation with the primary key could not be found
	*/
	public suiluppo_room_allocation[] findByroomID_PrevAndNext(
		long room_allocat_id, long roomID,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator)
		throws NoSuchsuiluppo_room_allocationException;

	/**
	* Removes all the suiluppo_room_allocations where roomID = &#63; from the database.
	*
	* @param roomID the room ID
	*/
	public void removeByroomID(long roomID);

	/**
	* Returns the number of suiluppo_room_allocations where roomID = &#63;.
	*
	* @param roomID the room ID
	* @return the number of matching suiluppo_room_allocations
	*/
	public int countByroomID(long roomID);

	/**
	* Caches the suiluppo_room_allocation in the entity cache if it is enabled.
	*
	* @param suiluppo_room_allocation the suiluppo_room_allocation
	*/
	public void cacheResult(suiluppo_room_allocation suiluppo_room_allocation);

	/**
	* Caches the suiluppo_room_allocations in the entity cache if it is enabled.
	*
	* @param suiluppo_room_allocations the suiluppo_room_allocations
	*/
	public void cacheResult(
		java.util.List<suiluppo_room_allocation> suiluppo_room_allocations);

	/**
	* Creates a new suiluppo_room_allocation with the primary key. Does not add the suiluppo_room_allocation to the database.
	*
	* @param room_allocat_id the primary key for the new suiluppo_room_allocation
	* @return the new suiluppo_room_allocation
	*/
	public suiluppo_room_allocation create(long room_allocat_id);

	/**
	* Removes the suiluppo_room_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation that was removed
	* @throws NoSuchsuiluppo_room_allocationException if a suiluppo_room_allocation with the primary key could not be found
	*/
	public suiluppo_room_allocation remove(long room_allocat_id)
		throws NoSuchsuiluppo_room_allocationException;

	public suiluppo_room_allocation updateImpl(
		suiluppo_room_allocation suiluppo_room_allocation);

	/**
	* Returns the suiluppo_room_allocation with the primary key or throws a {@link NoSuchsuiluppo_room_allocationException} if it could not be found.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation
	* @throws NoSuchsuiluppo_room_allocationException if a suiluppo_room_allocation with the primary key could not be found
	*/
	public suiluppo_room_allocation findByPrimaryKey(long room_allocat_id)
		throws NoSuchsuiluppo_room_allocationException;

	/**
	* Returns the suiluppo_room_allocation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param room_allocat_id the primary key of the suiluppo_room_allocation
	* @return the suiluppo_room_allocation, or <code>null</code> if a suiluppo_room_allocation with the primary key could not be found
	*/
	public suiluppo_room_allocation fetchByPrimaryKey(long room_allocat_id);

	@Override
	public java.util.Map<java.io.Serializable, suiluppo_room_allocation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the suiluppo_room_allocations.
	*
	* @return the suiluppo_room_allocations
	*/
	public java.util.List<suiluppo_room_allocation> findAll();

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
	public java.util.List<suiluppo_room_allocation> findAll(int start, int end);

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
	public java.util.List<suiluppo_room_allocation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator);

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
	public java.util.List<suiluppo_room_allocation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the suiluppo_room_allocations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of suiluppo_room_allocations.
	*
	* @return the number of suiluppo_room_allocations
	*/
	public int countAll();
}
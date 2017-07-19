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

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException;
import com.daffo.suilupposervice.model.suiluppo_equip_allocation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the suiluppo_equip_allocation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_equip_allocationPersistenceImpl
 * @see suiluppo_equip_allocationUtil
 * @generated
 */
@ProviderType
public interface suiluppo_equip_allocationPersistence extends BasePersistence<suiluppo_equip_allocation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link suiluppo_equip_allocationUtil} to access the suiluppo_equip_allocation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the suiluppo_equip_allocations where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the matching suiluppo_equip_allocations
	*/
	public java.util.List<suiluppo_equip_allocation> findBycourse_id(
		long course_id);

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
	public java.util.List<suiluppo_equip_allocation> findBycourse_id(
		long course_id, int start, int end);

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
	public java.util.List<suiluppo_equip_allocation> findBycourse_id(
		long course_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator);

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
	public java.util.List<suiluppo_equip_allocation> findBycourse_id(
		long course_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	*/
	public suiluppo_equip_allocation findBycourse_id_First(long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException;

	/**
	* Returns the first suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	*/
	public suiluppo_equip_allocation fetchBycourse_id_First(long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator);

	/**
	* Returns the last suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	*/
	public suiluppo_equip_allocation findBycourse_id_Last(long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException;

	/**
	* Returns the last suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	*/
	public suiluppo_equip_allocation fetchBycourse_id_Last(long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator);

	/**
	* Returns the suiluppo_equip_allocations before and after the current suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	*
	* @param equip_allocat_id the primary key of the current suiluppo_equip_allocation
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public suiluppo_equip_allocation[] findBycourse_id_PrevAndNext(
		long equip_allocat_id, long course_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException;

	/**
	* Removes all the suiluppo_equip_allocations where course_id = &#63; from the database.
	*
	* @param course_id the course_id
	*/
	public void removeBycourse_id(long course_id);

	/**
	* Returns the number of suiluppo_equip_allocations where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the number of matching suiluppo_equip_allocations
	*/
	public int countBycourse_id(long course_id);

	/**
	* Returns all the suiluppo_equip_allocations where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @return the matching suiluppo_equip_allocations
	*/
	public java.util.List<suiluppo_equip_allocation> findByequip_id(
		long equip_id);

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
	public java.util.List<suiluppo_equip_allocation> findByequip_id(
		long equip_id, int start, int end);

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
	public java.util.List<suiluppo_equip_allocation> findByequip_id(
		long equip_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator);

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
	public java.util.List<suiluppo_equip_allocation> findByequip_id(
		long equip_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	*/
	public suiluppo_equip_allocation findByequip_id_First(long equip_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException;

	/**
	* Returns the first suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	*/
	public suiluppo_equip_allocation fetchByequip_id_First(long equip_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator);

	/**
	* Returns the last suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	*/
	public suiluppo_equip_allocation findByequip_id_Last(long equip_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException;

	/**
	* Returns the last suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	*/
	public suiluppo_equip_allocation fetchByequip_id_Last(long equip_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator);

	/**
	* Returns the suiluppo_equip_allocations before and after the current suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	*
	* @param equip_allocat_id the primary key of the current suiluppo_equip_allocation
	* @param equip_id the equip_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public suiluppo_equip_allocation[] findByequip_id_PrevAndNext(
		long equip_allocat_id, long equip_id,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException;

	/**
	* Removes all the suiluppo_equip_allocations where equip_id = &#63; from the database.
	*
	* @param equip_id the equip_id
	*/
	public void removeByequip_id(long equip_id);

	/**
	* Returns the number of suiluppo_equip_allocations where equip_id = &#63;.
	*
	* @param equip_id the equip_id
	* @return the number of matching suiluppo_equip_allocations
	*/
	public int countByequip_id(long equip_id);

	/**
	* Caches the suiluppo_equip_allocation in the entity cache if it is enabled.
	*
	* @param suiluppo_equip_allocation the suiluppo_equip_allocation
	*/
	public void cacheResult(suiluppo_equip_allocation suiluppo_equip_allocation);

	/**
	* Caches the suiluppo_equip_allocations in the entity cache if it is enabled.
	*
	* @param suiluppo_equip_allocations the suiluppo_equip_allocations
	*/
	public void cacheResult(
		java.util.List<suiluppo_equip_allocation> suiluppo_equip_allocations);

	/**
	* Creates a new suiluppo_equip_allocation with the primary key. Does not add the suiluppo_equip_allocation to the database.
	*
	* @param equip_allocat_id the primary key for the new suiluppo_equip_allocation
	* @return the new suiluppo_equip_allocation
	*/
	public suiluppo_equip_allocation create(long equip_allocat_id);

	/**
	* Removes the suiluppo_equip_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation that was removed
	* @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public suiluppo_equip_allocation remove(long equip_allocat_id)
		throws NoSuchsuiluppo_equip_allocationException;

	public suiluppo_equip_allocation updateImpl(
		suiluppo_equip_allocation suiluppo_equip_allocation);

	/**
	* Returns the suiluppo_equip_allocation with the primary key or throws a {@link NoSuchsuiluppo_equip_allocationException} if it could not be found.
	*
	* @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation
	* @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public suiluppo_equip_allocation findByPrimaryKey(long equip_allocat_id)
		throws NoSuchsuiluppo_equip_allocationException;

	/**
	* Returns the suiluppo_equip_allocation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	* @return the suiluppo_equip_allocation, or <code>null</code> if a suiluppo_equip_allocation with the primary key could not be found
	*/
	public suiluppo_equip_allocation fetchByPrimaryKey(long equip_allocat_id);

	@Override
	public java.util.Map<java.io.Serializable, suiluppo_equip_allocation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the suiluppo_equip_allocations.
	*
	* @return the suiluppo_equip_allocations
	*/
	public java.util.List<suiluppo_equip_allocation> findAll();

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
	public java.util.List<suiluppo_equip_allocation> findAll(int start, int end);

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
	public java.util.List<suiluppo_equip_allocation> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator);

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
	public java.util.List<suiluppo_equip_allocation> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the suiluppo_equip_allocations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of suiluppo_equip_allocations.
	*
	* @return the number of suiluppo_equip_allocations
	*/
	public int countAll();
}
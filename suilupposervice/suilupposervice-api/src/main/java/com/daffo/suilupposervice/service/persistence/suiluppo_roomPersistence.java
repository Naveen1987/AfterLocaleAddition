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

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_roomException;
import com.daffo.suilupposervice.model.suiluppo_room;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the suiluppo_room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_roomPersistenceImpl
 * @see suiluppo_roomUtil
 * @generated
 */
@ProviderType
public interface suiluppo_roomPersistence extends BasePersistence<suiluppo_room> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link suiluppo_roomUtil} to access the suiluppo_room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the suiluppo_room in the entity cache if it is enabled.
	*
	* @param suiluppo_room the suiluppo_room
	*/
	public void cacheResult(suiluppo_room suiluppo_room);

	/**
	* Caches the suiluppo_rooms in the entity cache if it is enabled.
	*
	* @param suiluppo_rooms the suiluppo_rooms
	*/
	public void cacheResult(java.util.List<suiluppo_room> suiluppo_rooms);

	/**
	* Creates a new suiluppo_room with the primary key. Does not add the suiluppo_room to the database.
	*
	* @param roomID the primary key for the new suiluppo_room
	* @return the new suiluppo_room
	*/
	public suiluppo_room create(long roomID);

	/**
	* Removes the suiluppo_room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomID the primary key of the suiluppo_room
	* @return the suiluppo_room that was removed
	* @throws NoSuchsuiluppo_roomException if a suiluppo_room with the primary key could not be found
	*/
	public suiluppo_room remove(long roomID)
		throws NoSuchsuiluppo_roomException;

	public suiluppo_room updateImpl(suiluppo_room suiluppo_room);

	/**
	* Returns the suiluppo_room with the primary key or throws a {@link NoSuchsuiluppo_roomException} if it could not be found.
	*
	* @param roomID the primary key of the suiluppo_room
	* @return the suiluppo_room
	* @throws NoSuchsuiluppo_roomException if a suiluppo_room with the primary key could not be found
	*/
	public suiluppo_room findByPrimaryKey(long roomID)
		throws NoSuchsuiluppo_roomException;

	/**
	* Returns the suiluppo_room with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roomID the primary key of the suiluppo_room
	* @return the suiluppo_room, or <code>null</code> if a suiluppo_room with the primary key could not be found
	*/
	public suiluppo_room fetchByPrimaryKey(long roomID);

	@Override
	public java.util.Map<java.io.Serializable, suiluppo_room> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the suiluppo_rooms.
	*
	* @return the suiluppo_rooms
	*/
	public java.util.List<suiluppo_room> findAll();

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
	public java.util.List<suiluppo_room> findAll(int start, int end);

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
	public java.util.List<suiluppo_room> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room> orderByComparator);

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
	public java.util.List<suiluppo_room> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the suiluppo_rooms from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of suiluppo_rooms.
	*
	* @return the number of suiluppo_rooms
	*/
	public int countAll();
}
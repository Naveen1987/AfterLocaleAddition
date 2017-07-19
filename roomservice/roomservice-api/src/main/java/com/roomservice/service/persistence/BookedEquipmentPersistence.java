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

package com.roomservice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.roomservice.exception.NoSuchBookedEquipmentException;

import com.roomservice.model.BookedEquipment;

/**
 * The persistence interface for the booked equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.roomservice.service.persistence.impl.BookedEquipmentPersistenceImpl
 * @see BookedEquipmentUtil
 * @generated
 */
@ProviderType
public interface BookedEquipmentPersistence extends BasePersistence<BookedEquipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BookedEquipmentUtil} to access the booked equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the booked equipment in the entity cache if it is enabled.
	*
	* @param bookedEquipment the booked equipment
	*/
	public void cacheResult(BookedEquipment bookedEquipment);

	/**
	* Caches the booked equipments in the entity cache if it is enabled.
	*
	* @param bookedEquipments the booked equipments
	*/
	public void cacheResult(java.util.List<BookedEquipment> bookedEquipments);

	/**
	* Creates a new booked equipment with the primary key. Does not add the booked equipment to the database.
	*
	* @param booked_equip_id the primary key for the new booked equipment
	* @return the new booked equipment
	*/
	public BookedEquipment create(long booked_equip_id);

	/**
	* Removes the booked equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param booked_equip_id the primary key of the booked equipment
	* @return the booked equipment that was removed
	* @throws NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	*/
	public BookedEquipment remove(long booked_equip_id)
		throws NoSuchBookedEquipmentException;

	public BookedEquipment updateImpl(BookedEquipment bookedEquipment);

	/**
	* Returns the booked equipment with the primary key or throws a {@link NoSuchBookedEquipmentException} if it could not be found.
	*
	* @param booked_equip_id the primary key of the booked equipment
	* @return the booked equipment
	* @throws NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	*/
	public BookedEquipment findByPrimaryKey(long booked_equip_id)
		throws NoSuchBookedEquipmentException;

	/**
	* Returns the booked equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param booked_equip_id the primary key of the booked equipment
	* @return the booked equipment, or <code>null</code> if a booked equipment with the primary key could not be found
	*/
	public BookedEquipment fetchByPrimaryKey(long booked_equip_id);

	@Override
	public java.util.Map<java.io.Serializable, BookedEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the booked equipments.
	*
	* @return the booked equipments
	*/
	public java.util.List<BookedEquipment> findAll();

	/**
	* Returns a range of all the booked equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of booked equipments
	* @param end the upper bound of the range of booked equipments (not inclusive)
	* @return the range of booked equipments
	*/
	public java.util.List<BookedEquipment> findAll(int start, int end);

	/**
	* Returns an ordered range of all the booked equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of booked equipments
	* @param end the upper bound of the range of booked equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of booked equipments
	*/
	public java.util.List<BookedEquipment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookedEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the booked equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of booked equipments
	* @param end the upper bound of the range of booked equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of booked equipments
	*/
	public java.util.List<BookedEquipment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BookedEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the booked equipments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of booked equipments.
	*
	* @return the number of booked equipments
	*/
	public int countAll();
}
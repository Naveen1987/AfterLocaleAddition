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

import com.roomservice.exception.NoSuchEquipmentException;

import com.roomservice.model.Equipment;

/**
 * The persistence interface for the equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.roomservice.service.persistence.impl.EquipmentPersistenceImpl
 * @see EquipmentUtil
 * @generated
 */
@ProviderType
public interface EquipmentPersistence extends BasePersistence<Equipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EquipmentUtil} to access the equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the equipment in the entity cache if it is enabled.
	*
	* @param equipment the equipment
	*/
	public void cacheResult(Equipment equipment);

	/**
	* Caches the equipments in the entity cache if it is enabled.
	*
	* @param equipments the equipments
	*/
	public void cacheResult(java.util.List<Equipment> equipments);

	/**
	* Creates a new equipment with the primary key. Does not add the equipment to the database.
	*
	* @param equip_id the primary key for the new equipment
	* @return the new equipment
	*/
	public Equipment create(long equip_id);

	/**
	* Removes the equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equip_id the primary key of the equipment
	* @return the equipment that was removed
	* @throws NoSuchEquipmentException if a equipment with the primary key could not be found
	*/
	public Equipment remove(long equip_id) throws NoSuchEquipmentException;

	public Equipment updateImpl(Equipment equipment);

	/**
	* Returns the equipment with the primary key or throws a {@link NoSuchEquipmentException} if it could not be found.
	*
	* @param equip_id the primary key of the equipment
	* @return the equipment
	* @throws NoSuchEquipmentException if a equipment with the primary key could not be found
	*/
	public Equipment findByPrimaryKey(long equip_id)
		throws NoSuchEquipmentException;

	/**
	* Returns the equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param equip_id the primary key of the equipment
	* @return the equipment, or <code>null</code> if a equipment with the primary key could not be found
	*/
	public Equipment fetchByPrimaryKey(long equip_id);

	@Override
	public java.util.Map<java.io.Serializable, Equipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the equipments.
	*
	* @return the equipments
	*/
	public java.util.List<Equipment> findAll();

	/**
	* Returns a range of all the equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equipments
	* @param end the upper bound of the range of equipments (not inclusive)
	* @return the range of equipments
	*/
	public java.util.List<Equipment> findAll(int start, int end);

	/**
	* Returns an ordered range of all the equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equipments
	* @param end the upper bound of the range of equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of equipments
	*/
	public java.util.List<Equipment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equipment> orderByComparator);

	/**
	* Returns an ordered range of all the equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equipments
	* @param end the upper bound of the range of equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of equipments
	*/
	public java.util.List<Equipment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Equipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the equipments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of equipments.
	*
	* @return the number of equipments
	*/
	public int countAll();
}
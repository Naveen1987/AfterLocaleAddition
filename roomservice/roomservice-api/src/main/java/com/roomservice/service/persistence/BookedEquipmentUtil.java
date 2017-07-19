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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.roomservice.model.BookedEquipment;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the booked equipment service. This utility wraps {@link com.roomservice.service.persistence.impl.BookedEquipmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookedEquipmentPersistence
 * @see com.roomservice.service.persistence.impl.BookedEquipmentPersistenceImpl
 * @generated
 */
@ProviderType
public class BookedEquipmentUtil {
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
	public static void clearCache(BookedEquipment bookedEquipment) {
		getPersistence().clearCache(bookedEquipment);
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
	public static List<BookedEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BookedEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BookedEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BookedEquipment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BookedEquipment update(BookedEquipment bookedEquipment) {
		return getPersistence().update(bookedEquipment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BookedEquipment update(BookedEquipment bookedEquipment,
		ServiceContext serviceContext) {
		return getPersistence().update(bookedEquipment, serviceContext);
	}

	/**
	* Caches the booked equipment in the entity cache if it is enabled.
	*
	* @param bookedEquipment the booked equipment
	*/
	public static void cacheResult(BookedEquipment bookedEquipment) {
		getPersistence().cacheResult(bookedEquipment);
	}

	/**
	* Caches the booked equipments in the entity cache if it is enabled.
	*
	* @param bookedEquipments the booked equipments
	*/
	public static void cacheResult(List<BookedEquipment> bookedEquipments) {
		getPersistence().cacheResult(bookedEquipments);
	}

	/**
	* Creates a new booked equipment with the primary key. Does not add the booked equipment to the database.
	*
	* @param booked_equip_id the primary key for the new booked equipment
	* @return the new booked equipment
	*/
	public static BookedEquipment create(long booked_equip_id) {
		return getPersistence().create(booked_equip_id);
	}

	/**
	* Removes the booked equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param booked_equip_id the primary key of the booked equipment
	* @return the booked equipment that was removed
	* @throws NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	*/
	public static BookedEquipment remove(long booked_equip_id)
		throws com.roomservice.exception.NoSuchBookedEquipmentException {
		return getPersistence().remove(booked_equip_id);
	}

	public static BookedEquipment updateImpl(BookedEquipment bookedEquipment) {
		return getPersistence().updateImpl(bookedEquipment);
	}

	/**
	* Returns the booked equipment with the primary key or throws a {@link NoSuchBookedEquipmentException} if it could not be found.
	*
	* @param booked_equip_id the primary key of the booked equipment
	* @return the booked equipment
	* @throws NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	*/
	public static BookedEquipment findByPrimaryKey(long booked_equip_id)
		throws com.roomservice.exception.NoSuchBookedEquipmentException {
		return getPersistence().findByPrimaryKey(booked_equip_id);
	}

	/**
	* Returns the booked equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param booked_equip_id the primary key of the booked equipment
	* @return the booked equipment, or <code>null</code> if a booked equipment with the primary key could not be found
	*/
	public static BookedEquipment fetchByPrimaryKey(long booked_equip_id) {
		return getPersistence().fetchByPrimaryKey(booked_equip_id);
	}

	public static java.util.Map<java.io.Serializable, BookedEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the booked equipments.
	*
	* @return the booked equipments
	*/
	public static List<BookedEquipment> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<BookedEquipment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<BookedEquipment> findAll(int start, int end,
		OrderByComparator<BookedEquipment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<BookedEquipment> findAll(int start, int end,
		OrderByComparator<BookedEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the booked equipments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of booked equipments.
	*
	* @return the number of booked equipments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BookedEquipmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BookedEquipmentPersistence, BookedEquipmentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(BookedEquipmentPersistence.class);
}
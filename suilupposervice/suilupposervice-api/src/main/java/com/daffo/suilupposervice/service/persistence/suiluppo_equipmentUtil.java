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

import com.daffo.suilupposervice.model.suiluppo_equipment;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the suiluppo_equipment service. This utility wraps {@link com.daffo.suilupposervice.service.persistence.impl.suiluppo_equipmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_equipmentPersistence
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_equipmentPersistenceImpl
 * @generated
 */
@ProviderType
public class suiluppo_equipmentUtil {
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
	public static void clearCache(suiluppo_equipment suiluppo_equipment) {
		getPersistence().clearCache(suiluppo_equipment);
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
	public static List<suiluppo_equipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<suiluppo_equipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<suiluppo_equipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<suiluppo_equipment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static suiluppo_equipment update(
		suiluppo_equipment suiluppo_equipment) {
		return getPersistence().update(suiluppo_equipment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static suiluppo_equipment update(
		suiluppo_equipment suiluppo_equipment, ServiceContext serviceContext) {
		return getPersistence().update(suiluppo_equipment, serviceContext);
	}

	/**
	* Caches the suiluppo_equipment in the entity cache if it is enabled.
	*
	* @param suiluppo_equipment the suiluppo_equipment
	*/
	public static void cacheResult(suiluppo_equipment suiluppo_equipment) {
		getPersistence().cacheResult(suiluppo_equipment);
	}

	/**
	* Caches the suiluppo_equipments in the entity cache if it is enabled.
	*
	* @param suiluppo_equipments the suiluppo_equipments
	*/
	public static void cacheResult(List<suiluppo_equipment> suiluppo_equipments) {
		getPersistence().cacheResult(suiluppo_equipments);
	}

	/**
	* Creates a new suiluppo_equipment with the primary key. Does not add the suiluppo_equipment to the database.
	*
	* @param equip_id the primary key for the new suiluppo_equipment
	* @return the new suiluppo_equipment
	*/
	public static suiluppo_equipment create(long equip_id) {
		return getPersistence().create(equip_id);
	}

	/**
	* Removes the suiluppo_equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equip_id the primary key of the suiluppo_equipment
	* @return the suiluppo_equipment that was removed
	* @throws NoSuchsuiluppo_equipmentException if a suiluppo_equipment with the primary key could not be found
	*/
	public static suiluppo_equipment remove(long equip_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equipmentException {
		return getPersistence().remove(equip_id);
	}

	public static suiluppo_equipment updateImpl(
		suiluppo_equipment suiluppo_equipment) {
		return getPersistence().updateImpl(suiluppo_equipment);
	}

	/**
	* Returns the suiluppo_equipment with the primary key or throws a {@link NoSuchsuiluppo_equipmentException} if it could not be found.
	*
	* @param equip_id the primary key of the suiluppo_equipment
	* @return the suiluppo_equipment
	* @throws NoSuchsuiluppo_equipmentException if a suiluppo_equipment with the primary key could not be found
	*/
	public static suiluppo_equipment findByPrimaryKey(long equip_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_equipmentException {
		return getPersistence().findByPrimaryKey(equip_id);
	}

	/**
	* Returns the suiluppo_equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param equip_id the primary key of the suiluppo_equipment
	* @return the suiluppo_equipment, or <code>null</code> if a suiluppo_equipment with the primary key could not be found
	*/
	public static suiluppo_equipment fetchByPrimaryKey(long equip_id) {
		return getPersistence().fetchByPrimaryKey(equip_id);
	}

	public static java.util.Map<java.io.Serializable, suiluppo_equipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the suiluppo_equipments.
	*
	* @return the suiluppo_equipments
	*/
	public static List<suiluppo_equipment> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the suiluppo_equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_equipments
	* @param end the upper bound of the range of suiluppo_equipments (not inclusive)
	* @return the range of suiluppo_equipments
	*/
	public static List<suiluppo_equipment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_equipments
	* @param end the upper bound of the range of suiluppo_equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suiluppo_equipments
	*/
	public static List<suiluppo_equipment> findAll(int start, int end,
		OrderByComparator<suiluppo_equipment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_equipments
	* @param end the upper bound of the range of suiluppo_equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of suiluppo_equipments
	*/
	public static List<suiluppo_equipment> findAll(int start, int end,
		OrderByComparator<suiluppo_equipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the suiluppo_equipments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of suiluppo_equipments.
	*
	* @return the number of suiluppo_equipments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static suiluppo_equipmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<suiluppo_equipmentPersistence, suiluppo_equipmentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(suiluppo_equipmentPersistence.class);
}
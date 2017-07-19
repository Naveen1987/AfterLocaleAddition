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

package com.daffo.prontuario_drugservice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.daffo.prontuario_drugservice.model.prontuario_drug;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the prontuario_drug service. This utility wraps {@link com.daffo.prontuario_drugservice.service.persistence.impl.prontuario_drugPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prontuario_drugPersistence
 * @see com.daffo.prontuario_drugservice.service.persistence.impl.prontuario_drugPersistenceImpl
 * @generated
 */
@ProviderType
public class prontuario_drugUtil {
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
	public static void clearCache(prontuario_drug prontuario_drug) {
		getPersistence().clearCache(prontuario_drug);
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
	public static List<prontuario_drug> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<prontuario_drug> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<prontuario_drug> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<prontuario_drug> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static prontuario_drug update(prontuario_drug prontuario_drug) {
		return getPersistence().update(prontuario_drug);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static prontuario_drug update(prontuario_drug prontuario_drug,
		ServiceContext serviceContext) {
		return getPersistence().update(prontuario_drug, serviceContext);
	}

	/**
	* Caches the prontuario_drug in the entity cache if it is enabled.
	*
	* @param prontuario_drug the prontuario_drug
	*/
	public static void cacheResult(prontuario_drug prontuario_drug) {
		getPersistence().cacheResult(prontuario_drug);
	}

	/**
	* Caches the prontuario_drugs in the entity cache if it is enabled.
	*
	* @param prontuario_drugs the prontuario_drugs
	*/
	public static void cacheResult(List<prontuario_drug> prontuario_drugs) {
		getPersistence().cacheResult(prontuario_drugs);
	}

	/**
	* Creates a new prontuario_drug with the primary key. Does not add the prontuario_drug to the database.
	*
	* @param drug_id the primary key for the new prontuario_drug
	* @return the new prontuario_drug
	*/
	public static prontuario_drug create(long drug_id) {
		return getPersistence().create(drug_id);
	}

	/**
	* Removes the prontuario_drug with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug that was removed
	* @throws NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	*/
	public static prontuario_drug remove(long drug_id)
		throws com.daffo.prontuario_drugservice.exception.NoSuchprontuario_drugException {
		return getPersistence().remove(drug_id);
	}

	public static prontuario_drug updateImpl(prontuario_drug prontuario_drug) {
		return getPersistence().updateImpl(prontuario_drug);
	}

	/**
	* Returns the prontuario_drug with the primary key or throws a {@link NoSuchprontuario_drugException} if it could not be found.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug
	* @throws NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	*/
	public static prontuario_drug findByPrimaryKey(long drug_id)
		throws com.daffo.prontuario_drugservice.exception.NoSuchprontuario_drugException {
		return getPersistence().findByPrimaryKey(drug_id);
	}

	/**
	* Returns the prontuario_drug with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug, or <code>null</code> if a prontuario_drug with the primary key could not be found
	*/
	public static prontuario_drug fetchByPrimaryKey(long drug_id) {
		return getPersistence().fetchByPrimaryKey(drug_id);
	}

	public static java.util.Map<java.io.Serializable, prontuario_drug> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the prontuario_drugs.
	*
	* @return the prontuario_drugs
	*/
	public static List<prontuario_drug> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the prontuario_drugs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prontuario_drugs
	* @param end the upper bound of the range of prontuario_drugs (not inclusive)
	* @return the range of prontuario_drugs
	*/
	public static List<prontuario_drug> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the prontuario_drugs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prontuario_drugs
	* @param end the upper bound of the range of prontuario_drugs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prontuario_drugs
	*/
	public static List<prontuario_drug> findAll(int start, int end,
		OrderByComparator<prontuario_drug> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the prontuario_drugs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prontuario_drugs
	* @param end the upper bound of the range of prontuario_drugs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of prontuario_drugs
	*/
	public static List<prontuario_drug> findAll(int start, int end,
		OrderByComparator<prontuario_drug> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the prontuario_drugs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of prontuario_drugs.
	*
	* @return the number of prontuario_drugs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static prontuario_drugPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<prontuario_drugPersistence, prontuario_drugPersistence> _serviceTracker =
		ServiceTrackerFactory.open(prontuario_drugPersistence.class);
}
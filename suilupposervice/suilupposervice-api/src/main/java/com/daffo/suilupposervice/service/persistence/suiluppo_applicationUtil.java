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

import com.daffo.suilupposervice.model.suiluppo_application;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the suiluppo_application service. This utility wraps {@link com.daffo.suilupposervice.service.persistence.impl.suiluppo_applicationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_applicationPersistence
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_applicationPersistenceImpl
 * @generated
 */
@ProviderType
public class suiluppo_applicationUtil {
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
	public static void clearCache(suiluppo_application suiluppo_application) {
		getPersistence().clearCache(suiluppo_application);
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
	public static List<suiluppo_application> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<suiluppo_application> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<suiluppo_application> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static suiluppo_application update(
		suiluppo_application suiluppo_application) {
		return getPersistence().update(suiluppo_application);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static suiluppo_application update(
		suiluppo_application suiluppo_application, ServiceContext serviceContext) {
		return getPersistence().update(suiluppo_application, serviceContext);
	}

	/**
	* Returns all the suiluppo_applications where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the matching suiluppo_applications
	*/
	public static List<suiluppo_application> findBycourse_id(long course_id) {
		return getPersistence().findBycourse_id(course_id);
	}

	/**
	* Returns a range of all the suiluppo_applications where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @return the range of matching suiluppo_applications
	*/
	public static List<suiluppo_application> findBycourse_id(long course_id,
		int start, int end) {
		return getPersistence().findBycourse_id(course_id, start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_applications where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suiluppo_applications
	*/
	public static List<suiluppo_application> findBycourse_id(long course_id,
		int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator) {
		return getPersistence()
				   .findBycourse_id(course_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_applications where course_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param course_id the course_id
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching suiluppo_applications
	*/
	public static List<suiluppo_application> findBycourse_id(long course_id,
		int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycourse_id(course_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_application
	* @throws NoSuchsuiluppo_applicationException if a matching suiluppo_application could not be found
	*/
	public static suiluppo_application findBycourse_id_First(long course_id,
		OrderByComparator<suiluppo_application> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_applicationException {
		return getPersistence()
				   .findBycourse_id_First(course_id, orderByComparator);
	}

	/**
	* Returns the first suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suiluppo_application, or <code>null</code> if a matching suiluppo_application could not be found
	*/
	public static suiluppo_application fetchBycourse_id_First(long course_id,
		OrderByComparator<suiluppo_application> orderByComparator) {
		return getPersistence()
				   .fetchBycourse_id_First(course_id, orderByComparator);
	}

	/**
	* Returns the last suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_application
	* @throws NoSuchsuiluppo_applicationException if a matching suiluppo_application could not be found
	*/
	public static suiluppo_application findBycourse_id_Last(long course_id,
		OrderByComparator<suiluppo_application> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_applicationException {
		return getPersistence()
				   .findBycourse_id_Last(course_id, orderByComparator);
	}

	/**
	* Returns the last suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suiluppo_application, or <code>null</code> if a matching suiluppo_application could not be found
	*/
	public static suiluppo_application fetchBycourse_id_Last(long course_id,
		OrderByComparator<suiluppo_application> orderByComparator) {
		return getPersistence()
				   .fetchBycourse_id_Last(course_id, orderByComparator);
	}

	/**
	* Returns the suiluppo_applications before and after the current suiluppo_application in the ordered set where course_id = &#63;.
	*
	* @param applicat_id the primary key of the current suiluppo_application
	* @param course_id the course_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suiluppo_application
	* @throws NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	*/
	public static suiluppo_application[] findBycourse_id_PrevAndNext(
		long applicat_id, long course_id,
		OrderByComparator<suiluppo_application> orderByComparator)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_applicationException {
		return getPersistence()
				   .findBycourse_id_PrevAndNext(applicat_id, course_id,
			orderByComparator);
	}

	/**
	* Removes all the suiluppo_applications where course_id = &#63; from the database.
	*
	* @param course_id the course_id
	*/
	public static void removeBycourse_id(long course_id) {
		getPersistence().removeBycourse_id(course_id);
	}

	/**
	* Returns the number of suiluppo_applications where course_id = &#63;.
	*
	* @param course_id the course_id
	* @return the number of matching suiluppo_applications
	*/
	public static int countBycourse_id(long course_id) {
		return getPersistence().countBycourse_id(course_id);
	}

	/**
	* Caches the suiluppo_application in the entity cache if it is enabled.
	*
	* @param suiluppo_application the suiluppo_application
	*/
	public static void cacheResult(suiluppo_application suiluppo_application) {
		getPersistence().cacheResult(suiluppo_application);
	}

	/**
	* Caches the suiluppo_applications in the entity cache if it is enabled.
	*
	* @param suiluppo_applications the suiluppo_applications
	*/
	public static void cacheResult(
		List<suiluppo_application> suiluppo_applications) {
		getPersistence().cacheResult(suiluppo_applications);
	}

	/**
	* Creates a new suiluppo_application with the primary key. Does not add the suiluppo_application to the database.
	*
	* @param applicat_id the primary key for the new suiluppo_application
	* @return the new suiluppo_application
	*/
	public static suiluppo_application create(long applicat_id) {
		return getPersistence().create(applicat_id);
	}

	/**
	* Removes the suiluppo_application with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applicat_id the primary key of the suiluppo_application
	* @return the suiluppo_application that was removed
	* @throws NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	*/
	public static suiluppo_application remove(long applicat_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_applicationException {
		return getPersistence().remove(applicat_id);
	}

	public static suiluppo_application updateImpl(
		suiluppo_application suiluppo_application) {
		return getPersistence().updateImpl(suiluppo_application);
	}

	/**
	* Returns the suiluppo_application with the primary key or throws a {@link NoSuchsuiluppo_applicationException} if it could not be found.
	*
	* @param applicat_id the primary key of the suiluppo_application
	* @return the suiluppo_application
	* @throws NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	*/
	public static suiluppo_application findByPrimaryKey(long applicat_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_applicationException {
		return getPersistence().findByPrimaryKey(applicat_id);
	}

	/**
	* Returns the suiluppo_application with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applicat_id the primary key of the suiluppo_application
	* @return the suiluppo_application, or <code>null</code> if a suiluppo_application with the primary key could not be found
	*/
	public static suiluppo_application fetchByPrimaryKey(long applicat_id) {
		return getPersistence().fetchByPrimaryKey(applicat_id);
	}

	public static java.util.Map<java.io.Serializable, suiluppo_application> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the suiluppo_applications.
	*
	* @return the suiluppo_applications
	*/
	public static List<suiluppo_application> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the suiluppo_applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @return the range of suiluppo_applications
	*/
	public static List<suiluppo_application> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suiluppo_applications
	*/
	public static List<suiluppo_application> findAll(int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_applications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_applications
	* @param end the upper bound of the range of suiluppo_applications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of suiluppo_applications
	*/
	public static List<suiluppo_application> findAll(int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the suiluppo_applications from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of suiluppo_applications.
	*
	* @return the number of suiluppo_applications
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static suiluppo_applicationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<suiluppo_applicationPersistence, suiluppo_applicationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(suiluppo_applicationPersistence.class);
}
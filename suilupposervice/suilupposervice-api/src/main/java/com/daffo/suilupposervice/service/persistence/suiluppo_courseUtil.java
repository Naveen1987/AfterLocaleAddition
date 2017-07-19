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

import com.daffo.suilupposervice.model.suiluppo_course;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the suiluppo_course service. This utility wraps {@link com.daffo.suilupposervice.service.persistence.impl.suiluppo_coursePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_coursePersistence
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_coursePersistenceImpl
 * @generated
 */
@ProviderType
public class suiluppo_courseUtil {
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
	public static void clearCache(suiluppo_course suiluppo_course) {
		getPersistence().clearCache(suiluppo_course);
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
	public static List<suiluppo_course> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<suiluppo_course> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<suiluppo_course> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<suiluppo_course> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static suiluppo_course update(suiluppo_course suiluppo_course) {
		return getPersistence().update(suiluppo_course);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static suiluppo_course update(suiluppo_course suiluppo_course,
		ServiceContext serviceContext) {
		return getPersistence().update(suiluppo_course, serviceContext);
	}

	/**
	* Caches the suiluppo_course in the entity cache if it is enabled.
	*
	* @param suiluppo_course the suiluppo_course
	*/
	public static void cacheResult(suiluppo_course suiluppo_course) {
		getPersistence().cacheResult(suiluppo_course);
	}

	/**
	* Caches the suiluppo_courses in the entity cache if it is enabled.
	*
	* @param suiluppo_courses the suiluppo_courses
	*/
	public static void cacheResult(List<suiluppo_course> suiluppo_courses) {
		getPersistence().cacheResult(suiluppo_courses);
	}

	/**
	* Creates a new suiluppo_course with the primary key. Does not add the suiluppo_course to the database.
	*
	* @param course_id the primary key for the new suiluppo_course
	* @return the new suiluppo_course
	*/
	public static suiluppo_course create(long course_id) {
		return getPersistence().create(course_id);
	}

	/**
	* Removes the suiluppo_course with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param course_id the primary key of the suiluppo_course
	* @return the suiluppo_course that was removed
	* @throws NoSuchsuiluppo_courseException if a suiluppo_course with the primary key could not be found
	*/
	public static suiluppo_course remove(long course_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_courseException {
		return getPersistence().remove(course_id);
	}

	public static suiluppo_course updateImpl(suiluppo_course suiluppo_course) {
		return getPersistence().updateImpl(suiluppo_course);
	}

	/**
	* Returns the suiluppo_course with the primary key or throws a {@link NoSuchsuiluppo_courseException} if it could not be found.
	*
	* @param course_id the primary key of the suiluppo_course
	* @return the suiluppo_course
	* @throws NoSuchsuiluppo_courseException if a suiluppo_course with the primary key could not be found
	*/
	public static suiluppo_course findByPrimaryKey(long course_id)
		throws com.daffo.suilupposervice.exception.NoSuchsuiluppo_courseException {
		return getPersistence().findByPrimaryKey(course_id);
	}

	/**
	* Returns the suiluppo_course with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param course_id the primary key of the suiluppo_course
	* @return the suiluppo_course, or <code>null</code> if a suiluppo_course with the primary key could not be found
	*/
	public static suiluppo_course fetchByPrimaryKey(long course_id) {
		return getPersistence().fetchByPrimaryKey(course_id);
	}

	public static java.util.Map<java.io.Serializable, suiluppo_course> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the suiluppo_courses.
	*
	* @return the suiluppo_courses
	*/
	public static List<suiluppo_course> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the suiluppo_courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_courses
	* @param end the upper bound of the range of suiluppo_courses (not inclusive)
	* @return the range of suiluppo_courses
	*/
	public static List<suiluppo_course> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the suiluppo_courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_courses
	* @param end the upper bound of the range of suiluppo_courses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suiluppo_courses
	*/
	public static List<suiluppo_course> findAll(int start, int end,
		OrderByComparator<suiluppo_course> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the suiluppo_courses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suiluppo_courses
	* @param end the upper bound of the range of suiluppo_courses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of suiluppo_courses
	*/
	public static List<suiluppo_course> findAll(int start, int end,
		OrderByComparator<suiluppo_course> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the suiluppo_courses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of suiluppo_courses.
	*
	* @return the number of suiluppo_courses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static suiluppo_coursePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<suiluppo_coursePersistence, suiluppo_coursePersistence> _serviceTracker =
		ServiceTrackerFactory.open(suiluppo_coursePersistence.class);
}
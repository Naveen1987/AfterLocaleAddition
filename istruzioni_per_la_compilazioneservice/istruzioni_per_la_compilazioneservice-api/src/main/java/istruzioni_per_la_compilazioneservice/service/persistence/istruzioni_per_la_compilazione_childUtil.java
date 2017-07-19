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

package istruzioni_per_la_compilazioneservice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the istruzioni_per_la_compilazione_child service. This utility wraps {@link istruzioni_per_la_compilazioneservice.service.persistence.impl.istruzioni_per_la_compilazione_childPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione_childPersistence
 * @see istruzioni_per_la_compilazioneservice.service.persistence.impl.istruzioni_per_la_compilazione_childPersistenceImpl
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazione_childUtil {
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
	public static void clearCache(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		getPersistence().clearCache(istruzioni_per_la_compilazione_child);
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
	public static List<istruzioni_per_la_compilazione_child> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<istruzioni_per_la_compilazione_child> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<istruzioni_per_la_compilazione_child> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static istruzioni_per_la_compilazione_child update(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		return getPersistence().update(istruzioni_per_la_compilazione_child);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static istruzioni_per_la_compilazione_child update(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(istruzioni_per_la_compilazione_child, serviceContext);
	}

	/**
	* Returns all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @return the matching istruzioni_per_la_compilazione_childs
	*/
	public static List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id) {
		return getPersistence().findByIstruzioni_per_id(Istruzioni_per_id);
	}

	/**
	* Returns a range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @return the range of matching istruzioni_per_la_compilazione_childs
	*/
	public static List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end) {
		return getPersistence()
				   .findByIstruzioni_per_id(Istruzioni_per_id, start, end);
	}

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching istruzioni_per_la_compilazione_childs
	*/
	public static List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		return getPersistence()
				   .findByIstruzioni_per_id(Istruzioni_per_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching istruzioni_per_la_compilazione_childs
	*/
	public static List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIstruzioni_per_id(Istruzioni_per_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching istruzioni_per_la_compilazione_child
	* @throws NoSuch_childException if a matching istruzioni_per_la_compilazione_child could not be found
	*/
	public static istruzioni_per_la_compilazione_child findByIstruzioni_per_id_First(
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws istruzioni_per_la_compilazioneservice.exception.NoSuch_childException {
		return getPersistence()
				   .findByIstruzioni_per_id_First(Istruzioni_per_id,
			orderByComparator);
	}

	/**
	* Returns the first istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching istruzioni_per_la_compilazione_child, or <code>null</code> if a matching istruzioni_per_la_compilazione_child could not be found
	*/
	public static istruzioni_per_la_compilazione_child fetchByIstruzioni_per_id_First(
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		return getPersistence()
				   .fetchByIstruzioni_per_id_First(Istruzioni_per_id,
			orderByComparator);
	}

	/**
	* Returns the last istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching istruzioni_per_la_compilazione_child
	* @throws NoSuch_childException if a matching istruzioni_per_la_compilazione_child could not be found
	*/
	public static istruzioni_per_la_compilazione_child findByIstruzioni_per_id_Last(
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws istruzioni_per_la_compilazioneservice.exception.NoSuch_childException {
		return getPersistence()
				   .findByIstruzioni_per_id_Last(Istruzioni_per_id,
			orderByComparator);
	}

	/**
	* Returns the last istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching istruzioni_per_la_compilazione_child, or <code>null</code> if a matching istruzioni_per_la_compilazione_child could not be found
	*/
	public static istruzioni_per_la_compilazione_child fetchByIstruzioni_per_id_Last(
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		return getPersistence()
				   .fetchByIstruzioni_per_id_Last(Istruzioni_per_id,
			orderByComparator);
	}

	/**
	* Returns the istruzioni_per_la_compilazione_childs before and after the current istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Ins_id the primary key of the current istruzioni_per_la_compilazione_child
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next istruzioni_per_la_compilazione_child
	* @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazione_child[] findByIstruzioni_per_id_PrevAndNext(
		long Ins_id, long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws istruzioni_per_la_compilazioneservice.exception.NoSuch_childException {
		return getPersistence()
				   .findByIstruzioni_per_id_PrevAndNext(Ins_id,
			Istruzioni_per_id, orderByComparator);
	}

	/**
	* Removes all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63; from the database.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	*/
	public static void removeByIstruzioni_per_id(long Istruzioni_per_id) {
		getPersistence().removeByIstruzioni_per_id(Istruzioni_per_id);
	}

	/**
	* Returns the number of istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @return the number of matching istruzioni_per_la_compilazione_childs
	*/
	public static int countByIstruzioni_per_id(long Istruzioni_per_id) {
		return getPersistence().countByIstruzioni_per_id(Istruzioni_per_id);
	}

	/**
	* Caches the istruzioni_per_la_compilazione_child in the entity cache if it is enabled.
	*
	* @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	*/
	public static void cacheResult(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		getPersistence().cacheResult(istruzioni_per_la_compilazione_child);
	}

	/**
	* Caches the istruzioni_per_la_compilazione_childs in the entity cache if it is enabled.
	*
	* @param istruzioni_per_la_compilazione_childs the istruzioni_per_la_compilazione_childs
	*/
	public static void cacheResult(
		List<istruzioni_per_la_compilazione_child> istruzioni_per_la_compilazione_childs) {
		getPersistence().cacheResult(istruzioni_per_la_compilazione_childs);
	}

	/**
	* Creates a new istruzioni_per_la_compilazione_child with the primary key. Does not add the istruzioni_per_la_compilazione_child to the database.
	*
	* @param Ins_id the primary key for the new istruzioni_per_la_compilazione_child
	* @return the new istruzioni_per_la_compilazione_child
	*/
	public static istruzioni_per_la_compilazione_child create(long Ins_id) {
		return getPersistence().create(Ins_id);
	}

	/**
	* Removes the istruzioni_per_la_compilazione_child with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child that was removed
	* @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazione_child remove(long Ins_id)
		throws istruzioni_per_la_compilazioneservice.exception.NoSuch_childException {
		return getPersistence().remove(Ins_id);
	}

	public static istruzioni_per_la_compilazione_child updateImpl(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		return getPersistence().updateImpl(istruzioni_per_la_compilazione_child);
	}

	/**
	* Returns the istruzioni_per_la_compilazione_child with the primary key or throws a {@link NoSuch_childException} if it could not be found.
	*
	* @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child
	* @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazione_child findByPrimaryKey(
		long Ins_id)
		throws istruzioni_per_la_compilazioneservice.exception.NoSuch_childException {
		return getPersistence().findByPrimaryKey(Ins_id);
	}

	/**
	* Returns the istruzioni_per_la_compilazione_child with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child, or <code>null</code> if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazione_child fetchByPrimaryKey(
		long Ins_id) {
		return getPersistence().fetchByPrimaryKey(Ins_id);
	}

	public static java.util.Map<java.io.Serializable, istruzioni_per_la_compilazione_child> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the istruzioni_per_la_compilazione_childs.
	*
	* @return the istruzioni_per_la_compilazione_childs
	*/
	public static List<istruzioni_per_la_compilazione_child> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the istruzioni_per_la_compilazione_childs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @return the range of istruzioni_per_la_compilazione_childs
	*/
	public static List<istruzioni_per_la_compilazione_child> findAll(
		int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilazione_childs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of istruzioni_per_la_compilazione_childs
	*/
	public static List<istruzioni_per_la_compilazione_child> findAll(
		int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilazione_childs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of istruzioni_per_la_compilazione_childs
	*/
	public static List<istruzioni_per_la_compilazione_child> findAll(
		int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the istruzioni_per_la_compilazione_childs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of istruzioni_per_la_compilazione_childs.
	*
	* @return the number of istruzioni_per_la_compilazione_childs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static istruzioni_per_la_compilazione_childPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<istruzioni_per_la_compilazione_childPersistence, istruzioni_per_la_compilazione_childPersistence> _serviceTracker =
		ServiceTrackerFactory.open(istruzioni_per_la_compilazione_childPersistence.class);
}
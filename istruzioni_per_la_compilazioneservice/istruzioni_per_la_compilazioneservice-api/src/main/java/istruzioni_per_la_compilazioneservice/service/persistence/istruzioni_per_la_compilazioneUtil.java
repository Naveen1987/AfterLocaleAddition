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

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the istruzioni_per_la_compilazione service. This utility wraps {@link istruzioni_per_la_compilazioneservice.service.persistence.impl.istruzioni_per_la_compilazionePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazionePersistence
 * @see istruzioni_per_la_compilazioneservice.service.persistence.impl.istruzioni_per_la_compilazionePersistenceImpl
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazioneUtil {
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
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		getPersistence().clearCache(istruzioni_per_la_compilazione);
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
	public static List<istruzioni_per_la_compilazione> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<istruzioni_per_la_compilazione> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<istruzioni_per_la_compilazione> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static istruzioni_per_la_compilazione update(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		return getPersistence().update(istruzioni_per_la_compilazione);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static istruzioni_per_la_compilazione update(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(istruzioni_per_la_compilazione, serviceContext);
	}

	/**
	* Caches the istruzioni_per_la_compilazione in the entity cache if it is enabled.
	*
	* @param istruzioni_per_la_compilazione the istruzioni_per_la_compilazione
	*/
	public static void cacheResult(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		getPersistence().cacheResult(istruzioni_per_la_compilazione);
	}

	/**
	* Caches the istruzioni_per_la_compilaziones in the entity cache if it is enabled.
	*
	* @param istruzioni_per_la_compilaziones the istruzioni_per_la_compilaziones
	*/
	public static void cacheResult(
		List<istruzioni_per_la_compilazione> istruzioni_per_la_compilaziones) {
		getPersistence().cacheResult(istruzioni_per_la_compilaziones);
	}

	/**
	* Creates a new istruzioni_per_la_compilazione with the primary key. Does not add the istruzioni_per_la_compilazione to the database.
	*
	* @param Istruzioni_per_id the primary key for the new istruzioni_per_la_compilazione
	* @return the new istruzioni_per_la_compilazione
	*/
	public static istruzioni_per_la_compilazione create(long Istruzioni_per_id) {
		return getPersistence().create(Istruzioni_per_id);
	}

	/**
	* Removes the istruzioni_per_la_compilazione with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione that was removed
	* @throws NoSuchistruzioni_per_la_compilazioneException if a istruzioni_per_la_compilazione with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazione remove(long Istruzioni_per_id)
		throws istruzioni_per_la_compilazioneservice.exception.NoSuchistruzioni_per_la_compilazioneException {
		return getPersistence().remove(Istruzioni_per_id);
	}

	public static istruzioni_per_la_compilazione updateImpl(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		return getPersistence().updateImpl(istruzioni_per_la_compilazione);
	}

	/**
	* Returns the istruzioni_per_la_compilazione with the primary key or throws a {@link NoSuchistruzioni_per_la_compilazioneException} if it could not be found.
	*
	* @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione
	* @throws NoSuchistruzioni_per_la_compilazioneException if a istruzioni_per_la_compilazione with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazione findByPrimaryKey(
		long Istruzioni_per_id)
		throws istruzioni_per_la_compilazioneservice.exception.NoSuchistruzioni_per_la_compilazioneException {
		return getPersistence().findByPrimaryKey(Istruzioni_per_id);
	}

	/**
	* Returns the istruzioni_per_la_compilazione with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione, or <code>null</code> if a istruzioni_per_la_compilazione with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazione fetchByPrimaryKey(
		long Istruzioni_per_id) {
		return getPersistence().fetchByPrimaryKey(Istruzioni_per_id);
	}

	public static java.util.Map<java.io.Serializable, istruzioni_per_la_compilazione> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the istruzioni_per_la_compilaziones.
	*
	* @return the istruzioni_per_la_compilaziones
	*/
	public static List<istruzioni_per_la_compilazione> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the istruzioni_per_la_compilaziones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilaziones
	* @param end the upper bound of the range of istruzioni_per_la_compilaziones (not inclusive)
	* @return the range of istruzioni_per_la_compilaziones
	*/
	public static List<istruzioni_per_la_compilazione> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilaziones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilaziones
	* @param end the upper bound of the range of istruzioni_per_la_compilaziones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of istruzioni_per_la_compilaziones
	*/
	public static List<istruzioni_per_la_compilazione> findAll(int start,
		int end,
		OrderByComparator<istruzioni_per_la_compilazione> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilaziones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilaziones
	* @param end the upper bound of the range of istruzioni_per_la_compilaziones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of istruzioni_per_la_compilaziones
	*/
	public static List<istruzioni_per_la_compilazione> findAll(int start,
		int end,
		OrderByComparator<istruzioni_per_la_compilazione> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the istruzioni_per_la_compilaziones from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of istruzioni_per_la_compilaziones.
	*
	* @return the number of istruzioni_per_la_compilaziones
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static istruzioni_per_la_compilazionePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<istruzioni_per_la_compilazionePersistence, istruzioni_per_la_compilazionePersistence> _serviceTracker =
		ServiceTrackerFactory.open(istruzioni_per_la_compilazionePersistence.class);
}
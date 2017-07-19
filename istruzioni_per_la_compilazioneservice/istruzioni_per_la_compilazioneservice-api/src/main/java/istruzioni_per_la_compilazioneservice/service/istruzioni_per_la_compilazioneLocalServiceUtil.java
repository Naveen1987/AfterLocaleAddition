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

package istruzioni_per_la_compilazioneservice.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for istruzioni_per_la_compilazione. This utility wraps
 * {@link istruzioni_per_la_compilazioneservice.service.impl.istruzioni_per_la_compilazioneLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazioneLocalService
 * @see istruzioni_per_la_compilazioneservice.service.base.istruzioni_per_la_compilazioneLocalServiceBaseImpl
 * @see istruzioni_per_la_compilazioneservice.service.impl.istruzioni_per_la_compilazioneLocalServiceImpl
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazioneLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link istruzioni_per_la_compilazioneservice.service.impl.istruzioni_per_la_compilazioneLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of istruzioni_per_la_compilaziones.
	*
	* @return the number of istruzioni_per_la_compilaziones
	*/
	public static int getistruzioni_per_la_compilazionesCount() {
		return getService().getistruzioni_per_la_compilazionesCount();
	}

	/**
	* Adds the istruzioni_per_la_compilazione to the database. Also notifies the appropriate model listeners.
	*
	* @param istruzioni_per_la_compilazione the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione that was added
	*/
	public static istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione addistruzioni_per_la_compilazione(
		istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		return getService()
				   .addistruzioni_per_la_compilazione(istruzioni_per_la_compilazione);
	}

	/**
	* Creates a new istruzioni_per_la_compilazione with the primary key. Does not add the istruzioni_per_la_compilazione to the database.
	*
	* @param Istruzioni_per_id the primary key for the new istruzioni_per_la_compilazione
	* @return the new istruzioni_per_la_compilazione
	*/
	public static istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione createistruzioni_per_la_compilazione(
		long Istruzioni_per_id) {
		return getService()
				   .createistruzioni_per_la_compilazione(Istruzioni_per_id);
	}

	/**
	* Deletes the istruzioni_per_la_compilazione from the database. Also notifies the appropriate model listeners.
	*
	* @param istruzioni_per_la_compilazione the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione that was removed
	*/
	public static istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione deleteistruzioni_per_la_compilazione(
		istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		return getService()
				   .deleteistruzioni_per_la_compilazione(istruzioni_per_la_compilazione);
	}

	/**
	* Deletes the istruzioni_per_la_compilazione with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione that was removed
	* @throws PortalException if a istruzioni_per_la_compilazione with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione deleteistruzioni_per_la_compilazione(
		long Istruzioni_per_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteistruzioni_per_la_compilazione(Istruzioni_per_id);
	}

	public static istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione fetchistruzioni_per_la_compilazione(
		long Istruzioni_per_id) {
		return getService()
				   .fetchistruzioni_per_la_compilazione(Istruzioni_per_id);
	}

	/**
	* Returns the istruzioni_per_la_compilazione with the primary key.
	*
	* @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione
	* @throws PortalException if a istruzioni_per_la_compilazione with the primary key could not be found
	*/
	public static istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione getistruzioni_per_la_compilazione(
		long Istruzioni_per_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getistruzioni_per_la_compilazione(Istruzioni_per_id);
	}

	/**
	* Updates the istruzioni_per_la_compilazione in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param istruzioni_per_la_compilazione the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione that was updated
	*/
	public static istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione updateistruzioni_per_la_compilazione(
		istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		return getService()
				   .updateistruzioni_per_la_compilazione(istruzioni_per_la_compilazione);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the istruzioni_per_la_compilaziones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilaziones
	* @param end the upper bound of the range of istruzioni_per_la_compilaziones (not inclusive)
	* @return the range of istruzioni_per_la_compilaziones
	*/
	public static java.util.List<istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione> getistruzioni_per_la_compilaziones(
		int start, int end) {
		return getService().getistruzioni_per_la_compilaziones(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static istruzioni_per_la_compilazioneLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<istruzioni_per_la_compilazioneLocalService, istruzioni_per_la_compilazioneLocalService> _serviceTracker =
		ServiceTrackerFactory.open(istruzioni_per_la_compilazioneLocalService.class);
}
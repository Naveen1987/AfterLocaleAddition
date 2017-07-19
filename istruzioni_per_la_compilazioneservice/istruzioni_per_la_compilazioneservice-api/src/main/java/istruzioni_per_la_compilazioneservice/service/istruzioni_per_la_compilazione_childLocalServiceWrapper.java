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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link istruzioni_per_la_compilazione_childLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione_childLocalService
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazione_childLocalServiceWrapper
	implements istruzioni_per_la_compilazione_childLocalService,
		ServiceWrapper<istruzioni_per_la_compilazione_childLocalService> {
	public istruzioni_per_la_compilazione_childLocalServiceWrapper(
		istruzioni_per_la_compilazione_childLocalService istruzioni_per_la_compilazione_childLocalService) {
		_istruzioni_per_la_compilazione_childLocalService = istruzioni_per_la_compilazione_childLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _istruzioni_per_la_compilazione_childLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _istruzioni_per_la_compilazione_childLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _istruzioni_per_la_compilazione_childLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istruzioni_per_la_compilazione_childLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _istruzioni_per_la_compilazione_childLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of istruzioni_per_la_compilazione_childs.
	*
	* @return the number of istruzioni_per_la_compilazione_childs
	*/
	@Override
	public int getistruzioni_per_la_compilazione_childsCount() {
		return _istruzioni_per_la_compilazione_childLocalService.getistruzioni_per_la_compilazione_childsCount();
	}

	/**
	* Adds the istruzioni_per_la_compilazione_child to the database. Also notifies the appropriate model listeners.
	*
	* @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child that was added
	*/
	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child addistruzioni_per_la_compilazione_child(
		istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		return _istruzioni_per_la_compilazione_childLocalService.addistruzioni_per_la_compilazione_child(istruzioni_per_la_compilazione_child);
	}

	/**
	* Creates a new istruzioni_per_la_compilazione_child with the primary key. Does not add the istruzioni_per_la_compilazione_child to the database.
	*
	* @param Ins_id the primary key for the new istruzioni_per_la_compilazione_child
	* @return the new istruzioni_per_la_compilazione_child
	*/
	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child createistruzioni_per_la_compilazione_child(
		long Ins_id) {
		return _istruzioni_per_la_compilazione_childLocalService.createistruzioni_per_la_compilazione_child(Ins_id);
	}

	/**
	* Deletes the istruzioni_per_la_compilazione_child from the database. Also notifies the appropriate model listeners.
	*
	* @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child that was removed
	*/
	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child deleteistruzioni_per_la_compilazione_child(
		istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		return _istruzioni_per_la_compilazione_childLocalService.deleteistruzioni_per_la_compilazione_child(istruzioni_per_la_compilazione_child);
	}

	/**
	* Deletes the istruzioni_per_la_compilazione_child with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child that was removed
	* @throws PortalException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child deleteistruzioni_per_la_compilazione_child(
		long Ins_id) throws com.liferay.portal.kernel.exception.PortalException {
		return _istruzioni_per_la_compilazione_childLocalService.deleteistruzioni_per_la_compilazione_child(Ins_id);
	}

	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child fetchistruzioni_per_la_compilazione_child(
		long Ins_id) {
		return _istruzioni_per_la_compilazione_childLocalService.fetchistruzioni_per_la_compilazione_child(Ins_id);
	}

	/**
	* Returns the istruzioni_per_la_compilazione_child with the primary key.
	*
	* @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child
	* @throws PortalException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child getistruzioni_per_la_compilazione_child(
		long Ins_id) throws com.liferay.portal.kernel.exception.PortalException {
		return _istruzioni_per_la_compilazione_childLocalService.getistruzioni_per_la_compilazione_child(Ins_id);
	}

	/**
	* Updates the istruzioni_per_la_compilazione_child in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child that was updated
	*/
	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child updateistruzioni_per_la_compilazione_child(
		istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		return _istruzioni_per_la_compilazione_childLocalService.updateistruzioni_per_la_compilazione_child(istruzioni_per_la_compilazione_child);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _istruzioni_per_la_compilazione_childLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _istruzioni_per_la_compilazione_childLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _istruzioni_per_la_compilazione_childLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _istruzioni_per_la_compilazione_childLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the istruzioni_per_la_compilazione_childs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @return the range of istruzioni_per_la_compilazione_childs
	*/
	@Override
	public java.util.List<istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child> getistruzioni_per_la_compilazione_childs(
		int start, int end) {
		return _istruzioni_per_la_compilazione_childLocalService.getistruzioni_per_la_compilazione_childs(start,
			end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _istruzioni_per_la_compilazione_childLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _istruzioni_per_la_compilazione_childLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public istruzioni_per_la_compilazione_childLocalService getWrappedService() {
		return _istruzioni_per_la_compilazione_childLocalService;
	}

	@Override
	public void setWrappedService(
		istruzioni_per_la_compilazione_childLocalService istruzioni_per_la_compilazione_childLocalService) {
		_istruzioni_per_la_compilazione_childLocalService = istruzioni_per_la_compilazione_childLocalService;
	}

	private istruzioni_per_la_compilazione_childLocalService _istruzioni_per_la_compilazione_childLocalService;
}
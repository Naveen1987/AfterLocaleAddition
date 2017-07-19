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

package com.daffo.form_di_segnalazione.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link form_di_segnalazioneLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see form_di_segnalazioneLocalService
 * @generated
 */
@ProviderType
public class form_di_segnalazioneLocalServiceWrapper
	implements form_di_segnalazioneLocalService,
		ServiceWrapper<form_di_segnalazioneLocalService> {
	public form_di_segnalazioneLocalServiceWrapper(
		form_di_segnalazioneLocalService form_di_segnalazioneLocalService) {
		_form_di_segnalazioneLocalService = form_di_segnalazioneLocalService;
	}

	/**
	* Adds the form_di_segnalazione to the database. Also notifies the appropriate model listeners.
	*
	* @param form_di_segnalazione the form_di_segnalazione
	* @return the form_di_segnalazione that was added
	*/
	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione addform_di_segnalazione(
		com.daffo.form_di_segnalazione.model.form_di_segnalazione form_di_segnalazione) {
		return _form_di_segnalazioneLocalService.addform_di_segnalazione(form_di_segnalazione);
	}

	/**
	* Creates a new form_di_segnalazione with the primary key. Does not add the form_di_segnalazione to the database.
	*
	* @param Form_di_segnalazione_id the primary key for the new form_di_segnalazione
	* @return the new form_di_segnalazione
	*/
	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione createform_di_segnalazione(
		long Form_di_segnalazione_id) {
		return _form_di_segnalazioneLocalService.createform_di_segnalazione(Form_di_segnalazione_id);
	}

	/**
	* Deletes the form_di_segnalazione from the database. Also notifies the appropriate model listeners.
	*
	* @param form_di_segnalazione the form_di_segnalazione
	* @return the form_di_segnalazione that was removed
	*/
	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione deleteform_di_segnalazione(
		com.daffo.form_di_segnalazione.model.form_di_segnalazione form_di_segnalazione) {
		return _form_di_segnalazioneLocalService.deleteform_di_segnalazione(form_di_segnalazione);
	}

	/**
	* Deletes the form_di_segnalazione with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Form_di_segnalazione_id the primary key of the form_di_segnalazione
	* @return the form_di_segnalazione that was removed
	* @throws PortalException if a form_di_segnalazione with the primary key could not be found
	*/
	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione deleteform_di_segnalazione(
		long Form_di_segnalazione_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _form_di_segnalazioneLocalService.deleteform_di_segnalazione(Form_di_segnalazione_id);
	}

	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione fetchform_di_segnalazione(
		long Form_di_segnalazione_id) {
		return _form_di_segnalazioneLocalService.fetchform_di_segnalazione(Form_di_segnalazione_id);
	}

	/**
	* Returns the form_di_segnalazione with the primary key.
	*
	* @param Form_di_segnalazione_id the primary key of the form_di_segnalazione
	* @return the form_di_segnalazione
	* @throws PortalException if a form_di_segnalazione with the primary key could not be found
	*/
	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione getform_di_segnalazione(
		long Form_di_segnalazione_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _form_di_segnalazioneLocalService.getform_di_segnalazione(Form_di_segnalazione_id);
	}

	/**
	* Updates the form_di_segnalazione in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param form_di_segnalazione the form_di_segnalazione
	* @return the form_di_segnalazione that was updated
	*/
	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione updateform_di_segnalazione(
		com.daffo.form_di_segnalazione.model.form_di_segnalazione form_di_segnalazione) {
		return _form_di_segnalazioneLocalService.updateform_di_segnalazione(form_di_segnalazione);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _form_di_segnalazioneLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _form_di_segnalazioneLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _form_di_segnalazioneLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _form_di_segnalazioneLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _form_di_segnalazioneLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of form_di_segnalaziones.
	*
	* @return the number of form_di_segnalaziones
	*/
	@Override
	public int getform_di_segnalazionesCount() {
		return _form_di_segnalazioneLocalService.getform_di_segnalazionesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _form_di_segnalazioneLocalService.getOSGiServiceIdentifier();
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
		return _form_di_segnalazioneLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _form_di_segnalazioneLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _form_di_segnalazioneLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the form_di_segnalaziones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of form_di_segnalaziones
	* @param end the upper bound of the range of form_di_segnalaziones (not inclusive)
	* @return the range of form_di_segnalaziones
	*/
	@Override
	public java.util.List<com.daffo.form_di_segnalazione.model.form_di_segnalazione> getform_di_segnalaziones(
		int start, int end) {
		return _form_di_segnalazioneLocalService.getform_di_segnalaziones(start,
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
		return _form_di_segnalazioneLocalService.dynamicQueryCount(dynamicQuery);
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
		return _form_di_segnalazioneLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public form_di_segnalazioneLocalService getWrappedService() {
		return _form_di_segnalazioneLocalService;
	}

	@Override
	public void setWrappedService(
		form_di_segnalazioneLocalService form_di_segnalazioneLocalService) {
		_form_di_segnalazioneLocalService = form_di_segnalazioneLocalService;
	}

	private form_di_segnalazioneLocalService _form_di_segnalazioneLocalService;
}
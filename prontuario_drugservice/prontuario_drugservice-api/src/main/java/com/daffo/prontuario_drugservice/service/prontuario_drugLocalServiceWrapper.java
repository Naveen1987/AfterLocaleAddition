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

package com.daffo.prontuario_drugservice.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link prontuario_drugLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see prontuario_drugLocalService
 * @generated
 */
@ProviderType
public class prontuario_drugLocalServiceWrapper
	implements prontuario_drugLocalService,
		ServiceWrapper<prontuario_drugLocalService> {
	public prontuario_drugLocalServiceWrapper(
		prontuario_drugLocalService prontuario_drugLocalService) {
		_prontuario_drugLocalService = prontuario_drugLocalService;
	}

	/**
	* Adds the prontuario_drug to the database. Also notifies the appropriate model listeners.
	*
	* @param prontuario_drug the prontuario_drug
	* @return the prontuario_drug that was added
	*/
	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug addprontuario_drug(
		com.daffo.prontuario_drugservice.model.prontuario_drug prontuario_drug) {
		return _prontuario_drugLocalService.addprontuario_drug(prontuario_drug);
	}

	/**
	* Creates a new prontuario_drug with the primary key. Does not add the prontuario_drug to the database.
	*
	* @param drug_id the primary key for the new prontuario_drug
	* @return the new prontuario_drug
	*/
	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug createprontuario_drug(
		long drug_id) {
		return _prontuario_drugLocalService.createprontuario_drug(drug_id);
	}

	/**
	* Deletes the prontuario_drug from the database. Also notifies the appropriate model listeners.
	*
	* @param prontuario_drug the prontuario_drug
	* @return the prontuario_drug that was removed
	*/
	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug deleteprontuario_drug(
		com.daffo.prontuario_drugservice.model.prontuario_drug prontuario_drug) {
		return _prontuario_drugLocalService.deleteprontuario_drug(prontuario_drug);
	}

	/**
	* Deletes the prontuario_drug with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug that was removed
	* @throws PortalException if a prontuario_drug with the primary key could not be found
	*/
	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug deleteprontuario_drug(
		long drug_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prontuario_drugLocalService.deleteprontuario_drug(drug_id);
	}

	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug fetchprontuario_drug(
		long drug_id) {
		return _prontuario_drugLocalService.fetchprontuario_drug(drug_id);
	}

	/**
	* Returns the prontuario_drug with the primary key.
	*
	* @param drug_id the primary key of the prontuario_drug
	* @return the prontuario_drug
	* @throws PortalException if a prontuario_drug with the primary key could not be found
	*/
	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug getprontuario_drug(
		long drug_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prontuario_drugLocalService.getprontuario_drug(drug_id);
	}

	/**
	* Updates the prontuario_drug in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param prontuario_drug the prontuario_drug
	* @return the prontuario_drug that was updated
	*/
	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug updateprontuario_drug(
		com.daffo.prontuario_drugservice.model.prontuario_drug prontuario_drug) {
		return _prontuario_drugLocalService.updateprontuario_drug(prontuario_drug);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _prontuario_drugLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _prontuario_drugLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _prontuario_drugLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prontuario_drugLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _prontuario_drugLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of prontuario_drugs.
	*
	* @return the number of prontuario_drugs
	*/
	@Override
	public int getprontuario_drugsCount() {
		return _prontuario_drugLocalService.getprontuario_drugsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _prontuario_drugLocalService.getOSGiServiceIdentifier();
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
		return _prontuario_drugLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.prontuario_drugservice.model.impl.prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _prontuario_drugLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.prontuario_drugservice.model.impl.prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _prontuario_drugLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the prontuario_drugs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.prontuario_drugservice.model.impl.prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prontuario_drugs
	* @param end the upper bound of the range of prontuario_drugs (not inclusive)
	* @return the range of prontuario_drugs
	*/
	@Override
	public java.util.List<com.daffo.prontuario_drugservice.model.prontuario_drug> getprontuario_drugs(
		int start, int end) {
		return _prontuario_drugLocalService.getprontuario_drugs(start, end);
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
		return _prontuario_drugLocalService.dynamicQueryCount(dynamicQuery);
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
		return _prontuario_drugLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public prontuario_drugLocalService getWrappedService() {
		return _prontuario_drugLocalService;
	}

	@Override
	public void setWrappedService(
		prontuario_drugLocalService prontuario_drugLocalService) {
		_prontuario_drugLocalService = prontuario_drugLocalService;
	}

	private prontuario_drugLocalService _prontuario_drugLocalService;
}
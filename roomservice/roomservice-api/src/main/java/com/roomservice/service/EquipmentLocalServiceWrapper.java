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

package com.roomservice.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EquipmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EquipmentLocalService
 * @generated
 */
@ProviderType
public class EquipmentLocalServiceWrapper implements EquipmentLocalService,
	ServiceWrapper<EquipmentLocalService> {
	public EquipmentLocalServiceWrapper(
		EquipmentLocalService equipmentLocalService) {
		_equipmentLocalService = equipmentLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _equipmentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _equipmentLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _equipmentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _equipmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _equipmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param equipment the equipment
	* @return the equipment that was added
	*/
	@Override
	public com.roomservice.model.Equipment addEquipment(
		com.roomservice.model.Equipment equipment) {
		return _equipmentLocalService.addEquipment(equipment);
	}

	/**
	* Creates a new equipment with the primary key. Does not add the equipment to the database.
	*
	* @param equip_id the primary key for the new equipment
	* @return the new equipment
	*/
	@Override
	public com.roomservice.model.Equipment createEquipment(long equip_id) {
		return _equipmentLocalService.createEquipment(equip_id);
	}

	/**
	* Deletes the equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param equipment the equipment
	* @return the equipment that was removed
	*/
	@Override
	public com.roomservice.model.Equipment deleteEquipment(
		com.roomservice.model.Equipment equipment) {
		return _equipmentLocalService.deleteEquipment(equipment);
	}

	/**
	* Deletes the equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param equip_id the primary key of the equipment
	* @return the equipment that was removed
	* @throws PortalException if a equipment with the primary key could not be found
	*/
	@Override
	public com.roomservice.model.Equipment deleteEquipment(long equip_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _equipmentLocalService.deleteEquipment(equip_id);
	}

	@Override
	public com.roomservice.model.Equipment fetchEquipment(long equip_id) {
		return _equipmentLocalService.fetchEquipment(equip_id);
	}

	/**
	* Returns the equipment with the primary key.
	*
	* @param equip_id the primary key of the equipment
	* @return the equipment
	* @throws PortalException if a equipment with the primary key could not be found
	*/
	@Override
	public com.roomservice.model.Equipment getEquipment(long equip_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _equipmentLocalService.getEquipment(equip_id);
	}

	/**
	* Updates the equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param equipment the equipment
	* @return the equipment that was updated
	*/
	@Override
	public com.roomservice.model.Equipment updateEquipment(
		com.roomservice.model.Equipment equipment) {
		return _equipmentLocalService.updateEquipment(equipment);
	}

	/**
	* Returns the number of equipments.
	*
	* @return the number of equipments
	*/
	@Override
	public int getEquipmentsCount() {
		return _equipmentLocalService.getEquipmentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _equipmentLocalService.getOSGiServiceIdentifier();
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
		return _equipmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.roomservice.model.impl.EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _equipmentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.roomservice.model.impl.EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _equipmentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.roomservice.model.impl.EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equipments
	* @param end the upper bound of the range of equipments (not inclusive)
	* @return the range of equipments
	*/
	@Override
	public java.util.List<com.roomservice.model.Equipment> getEquipments(
		int start, int end) {
		return _equipmentLocalService.getEquipments(start, end);
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
		return _equipmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _equipmentLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public EquipmentLocalService getWrappedService() {
		return _equipmentLocalService;
	}

	@Override
	public void setWrappedService(EquipmentLocalService equipmentLocalService) {
		_equipmentLocalService = equipmentLocalService;
	}

	private EquipmentLocalService _equipmentLocalService;
}
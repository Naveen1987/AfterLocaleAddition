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

package com.roomservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Equipment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Equipment
 * @generated
 */
@ProviderType
public class EquipmentWrapper implements Equipment, ModelWrapper<Equipment> {
	public EquipmentWrapper(Equipment equipment) {
		_equipment = equipment;
	}

	@Override
	public Class<?> getModelClass() {
		return Equipment.class;
	}

	@Override
	public String getModelClassName() {
		return Equipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("equip_id", getEquip_id());
		attributes.put("equipment_name", getEquipment_name());
		attributes.put("equip_quantity", getEquip_quantity());
		attributes.put("equip_description", getEquip_description());
		attributes.put("equip_status", getEquip_status());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long equip_id = (Long)attributes.get("equip_id");

		if (equip_id != null) {
			setEquip_id(equip_id);
		}

		String equipment_name = (String)attributes.get("equipment_name");

		if (equipment_name != null) {
			setEquipment_name(equipment_name);
		}

		Integer equip_quantity = (Integer)attributes.get("equip_quantity");

		if (equip_quantity != null) {
			setEquip_quantity(equip_quantity);
		}

		String equip_description = (String)attributes.get("equip_description");

		if (equip_description != null) {
			setEquip_description(equip_description);
		}

		Boolean equip_status = (Boolean)attributes.get("equip_status");

		if (equip_status != null) {
			setEquip_status(equip_status);
		}
	}

	@Override
	public Equipment toEscapedModel() {
		return new EquipmentWrapper(_equipment.toEscapedModel());
	}

	@Override
	public Equipment toUnescapedModel() {
		return new EquipmentWrapper(_equipment.toUnescapedModel());
	}

	/**
	* Returns the equip_status of this equipment.
	*
	* @return the equip_status of this equipment
	*/
	@Override
	public boolean getEquip_status() {
		return _equipment.getEquip_status();
	}

	@Override
	public boolean isCachedModel() {
		return _equipment.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this equipment is equip_status.
	*
	* @return <code>true</code> if this equipment is equip_status; <code>false</code> otherwise
	*/
	@Override
	public boolean isEquip_status() {
		return _equipment.isEquip_status();
	}

	@Override
	public boolean isEscapedModel() {
		return _equipment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _equipment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _equipment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Equipment> toCacheModel() {
		return _equipment.toCacheModel();
	}

	@Override
	public int compareTo(Equipment equipment) {
		return _equipment.compareTo(equipment);
	}

	/**
	* Returns the equip_quantity of this equipment.
	*
	* @return the equip_quantity of this equipment
	*/
	@Override
	public int getEquip_quantity() {
		return _equipment.getEquip_quantity();
	}

	@Override
	public int hashCode() {
		return _equipment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _equipment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EquipmentWrapper((Equipment)_equipment.clone());
	}

	/**
	* Returns the equip_description of this equipment.
	*
	* @return the equip_description of this equipment
	*/
	@Override
	public java.lang.String getEquip_description() {
		return _equipment.getEquip_description();
	}

	/**
	* Returns the equipment_name of this equipment.
	*
	* @return the equipment_name of this equipment
	*/
	@Override
	public java.lang.String getEquipment_name() {
		return _equipment.getEquipment_name();
	}

	@Override
	public java.lang.String toString() {
		return _equipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _equipment.toXmlString();
	}

	/**
	* Returns the equip_id of this equipment.
	*
	* @return the equip_id of this equipment
	*/
	@Override
	public long getEquip_id() {
		return _equipment.getEquip_id();
	}

	/**
	* Returns the primary key of this equipment.
	*
	* @return the primary key of this equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _equipment.getPrimaryKey();
	}

	@Override
	public void persist() {
		_equipment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_equipment.setCachedModel(cachedModel);
	}

	/**
	* Sets the equip_description of this equipment.
	*
	* @param equip_description the equip_description of this equipment
	*/
	@Override
	public void setEquip_description(java.lang.String equip_description) {
		_equipment.setEquip_description(equip_description);
	}

	/**
	* Sets the equip_id of this equipment.
	*
	* @param equip_id the equip_id of this equipment
	*/
	@Override
	public void setEquip_id(long equip_id) {
		_equipment.setEquip_id(equip_id);
	}

	/**
	* Sets the equip_quantity of this equipment.
	*
	* @param equip_quantity the equip_quantity of this equipment
	*/
	@Override
	public void setEquip_quantity(int equip_quantity) {
		_equipment.setEquip_quantity(equip_quantity);
	}

	/**
	* Sets whether this equipment is equip_status.
	*
	* @param equip_status the equip_status of this equipment
	*/
	@Override
	public void setEquip_status(boolean equip_status) {
		_equipment.setEquip_status(equip_status);
	}

	/**
	* Sets the equipment_name of this equipment.
	*
	* @param equipment_name the equipment_name of this equipment
	*/
	@Override
	public void setEquipment_name(java.lang.String equipment_name) {
		_equipment.setEquipment_name(equipment_name);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_equipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_equipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_equipment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_equipment.setNew(n);
	}

	/**
	* Sets the primary key of this equipment.
	*
	* @param primaryKey the primary key of this equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_equipment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_equipment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EquipmentWrapper)) {
			return false;
		}

		EquipmentWrapper equipmentWrapper = (EquipmentWrapper)obj;

		if (Objects.equals(_equipment, equipmentWrapper._equipment)) {
			return true;
		}

		return false;
	}

	@Override
	public Equipment getWrappedModel() {
		return _equipment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _equipment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _equipment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_equipment.resetOriginalValues();
	}

	private final Equipment _equipment;
}
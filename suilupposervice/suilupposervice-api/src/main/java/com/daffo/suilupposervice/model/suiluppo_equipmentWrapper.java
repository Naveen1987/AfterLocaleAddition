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

package com.daffo.suilupposervice.model;

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
 * This class is a wrapper for {@link suiluppo_equipment}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_equipment
 * @generated
 */
@ProviderType
public class suiluppo_equipmentWrapper implements suiluppo_equipment,
	ModelWrapper<suiluppo_equipment> {
	public suiluppo_equipmentWrapper(suiluppo_equipment suiluppo_equipment) {
		_suiluppo_equipment = suiluppo_equipment;
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_equipment.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_equipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("equip_id", getEquip_id());
		attributes.put("equip_name", getEquip_name());
		attributes.put("equip_quanity", getEquip_quanity());
		attributes.put("equip_description", getEquip_description());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long equip_id = (Long)attributes.get("equip_id");

		if (equip_id != null) {
			setEquip_id(equip_id);
		}

		String equip_name = (String)attributes.get("equip_name");

		if (equip_name != null) {
			setEquip_name(equip_name);
		}

		Long equip_quanity = (Long)attributes.get("equip_quanity");

		if (equip_quanity != null) {
			setEquip_quanity(equip_quanity);
		}

		String equip_description = (String)attributes.get("equip_description");

		if (equip_description != null) {
			setEquip_description(equip_description);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _suiluppo_equipment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _suiluppo_equipment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _suiluppo_equipment.isNew();
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_equipment toEscapedModel() {
		return new suiluppo_equipmentWrapper(_suiluppo_equipment.toEscapedModel());
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_equipment toUnescapedModel() {
		return new suiluppo_equipmentWrapper(_suiluppo_equipment.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _suiluppo_equipment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.suilupposervice.model.suiluppo_equipment> toCacheModel() {
		return _suiluppo_equipment.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.suilupposervice.model.suiluppo_equipment suiluppo_equipment) {
		return _suiluppo_equipment.compareTo(suiluppo_equipment);
	}

	@Override
	public int hashCode() {
		return _suiluppo_equipment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _suiluppo_equipment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new suiluppo_equipmentWrapper((suiluppo_equipment)_suiluppo_equipment.clone());
	}

	/**
	* Returns the equip_description of this suiluppo_equipment.
	*
	* @return the equip_description of this suiluppo_equipment
	*/
	@Override
	public java.lang.String getEquip_description() {
		return _suiluppo_equipment.getEquip_description();
	}

	/**
	* Returns the equip_name of this suiluppo_equipment.
	*
	* @return the equip_name of this suiluppo_equipment
	*/
	@Override
	public java.lang.String getEquip_name() {
		return _suiluppo_equipment.getEquip_name();
	}

	@Override
	public java.lang.String toString() {
		return _suiluppo_equipment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suiluppo_equipment.toXmlString();
	}

	/**
	* Returns the equip_id of this suiluppo_equipment.
	*
	* @return the equip_id of this suiluppo_equipment
	*/
	@Override
	public long getEquip_id() {
		return _suiluppo_equipment.getEquip_id();
	}

	/**
	* Returns the equip_quanity of this suiluppo_equipment.
	*
	* @return the equip_quanity of this suiluppo_equipment
	*/
	@Override
	public long getEquip_quanity() {
		return _suiluppo_equipment.getEquip_quanity();
	}

	/**
	* Returns the primary key of this suiluppo_equipment.
	*
	* @return the primary key of this suiluppo_equipment
	*/
	@Override
	public long getPrimaryKey() {
		return _suiluppo_equipment.getPrimaryKey();
	}

	@Override
	public void persist() {
		_suiluppo_equipment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suiluppo_equipment.setCachedModel(cachedModel);
	}

	/**
	* Sets the equip_description of this suiluppo_equipment.
	*
	* @param equip_description the equip_description of this suiluppo_equipment
	*/
	@Override
	public void setEquip_description(java.lang.String equip_description) {
		_suiluppo_equipment.setEquip_description(equip_description);
	}

	/**
	* Sets the equip_id of this suiluppo_equipment.
	*
	* @param equip_id the equip_id of this suiluppo_equipment
	*/
	@Override
	public void setEquip_id(long equip_id) {
		_suiluppo_equipment.setEquip_id(equip_id);
	}

	/**
	* Sets the equip_name of this suiluppo_equipment.
	*
	* @param equip_name the equip_name of this suiluppo_equipment
	*/
	@Override
	public void setEquip_name(java.lang.String equip_name) {
		_suiluppo_equipment.setEquip_name(equip_name);
	}

	/**
	* Sets the equip_quanity of this suiluppo_equipment.
	*
	* @param equip_quanity the equip_quanity of this suiluppo_equipment
	*/
	@Override
	public void setEquip_quanity(long equip_quanity) {
		_suiluppo_equipment.setEquip_quanity(equip_quanity);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_suiluppo_equipment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_suiluppo_equipment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_suiluppo_equipment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_suiluppo_equipment.setNew(n);
	}

	/**
	* Sets the primary key of this suiluppo_equipment.
	*
	* @param primaryKey the primary key of this suiluppo_equipment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suiluppo_equipment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_suiluppo_equipment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_equipmentWrapper)) {
			return false;
		}

		suiluppo_equipmentWrapper suiluppo_equipmentWrapper = (suiluppo_equipmentWrapper)obj;

		if (Objects.equals(_suiluppo_equipment,
					suiluppo_equipmentWrapper._suiluppo_equipment)) {
			return true;
		}

		return false;
	}

	@Override
	public suiluppo_equipment getWrappedModel() {
		return _suiluppo_equipment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _suiluppo_equipment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _suiluppo_equipment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_suiluppo_equipment.resetOriginalValues();
	}

	private final suiluppo_equipment _suiluppo_equipment;
}
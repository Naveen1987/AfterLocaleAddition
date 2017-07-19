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
 * This class is a wrapper for {@link suiluppo_equip_allocation}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_equip_allocation
 * @generated
 */
@ProviderType
public class suiluppo_equip_allocationWrapper
	implements suiluppo_equip_allocation,
		ModelWrapper<suiluppo_equip_allocation> {
	public suiluppo_equip_allocationWrapper(
		suiluppo_equip_allocation suiluppo_equip_allocation) {
		_suiluppo_equip_allocation = suiluppo_equip_allocation;
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_equip_allocation.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_equip_allocation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("equip_allocat_id", getEquip_allocat_id());
		attributes.put("course_id", getCourse_id());
		attributes.put("equip_id", getEquip_id());
		attributes.put("equip_allocat_quantity", getEquip_allocat_quantity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long equip_allocat_id = (Long)attributes.get("equip_allocat_id");

		if (equip_allocat_id != null) {
			setEquip_allocat_id(equip_allocat_id);
		}

		Long course_id = (Long)attributes.get("course_id");

		if (course_id != null) {
			setCourse_id(course_id);
		}

		Long equip_id = (Long)attributes.get("equip_id");

		if (equip_id != null) {
			setEquip_id(equip_id);
		}

		Long equip_allocat_quantity = (Long)attributes.get(
				"equip_allocat_quantity");

		if (equip_allocat_quantity != null) {
			setEquip_allocat_quantity(equip_allocat_quantity);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _suiluppo_equip_allocation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _suiluppo_equip_allocation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _suiluppo_equip_allocation.isNew();
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation toEscapedModel() {
		return new suiluppo_equip_allocationWrapper(_suiluppo_equip_allocation.toEscapedModel());
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_equip_allocation toUnescapedModel() {
		return new suiluppo_equip_allocationWrapper(_suiluppo_equip_allocation.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _suiluppo_equip_allocation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.suilupposervice.model.suiluppo_equip_allocation> toCacheModel() {
		return _suiluppo_equip_allocation.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.suilupposervice.model.suiluppo_equip_allocation suiluppo_equip_allocation) {
		return _suiluppo_equip_allocation.compareTo(suiluppo_equip_allocation);
	}

	@Override
	public int hashCode() {
		return _suiluppo_equip_allocation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _suiluppo_equip_allocation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new suiluppo_equip_allocationWrapper((suiluppo_equip_allocation)_suiluppo_equip_allocation.clone());
	}

	@Override
	public java.lang.String toString() {
		return _suiluppo_equip_allocation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suiluppo_equip_allocation.toXmlString();
	}

	/**
	* Returns the course_id of this suiluppo_equip_allocation.
	*
	* @return the course_id of this suiluppo_equip_allocation
	*/
	@Override
	public long getCourse_id() {
		return _suiluppo_equip_allocation.getCourse_id();
	}

	/**
	* Returns the equip_allocat_id of this suiluppo_equip_allocation.
	*
	* @return the equip_allocat_id of this suiluppo_equip_allocation
	*/
	@Override
	public long getEquip_allocat_id() {
		return _suiluppo_equip_allocation.getEquip_allocat_id();
	}

	/**
	* Returns the equip_allocat_quantity of this suiluppo_equip_allocation.
	*
	* @return the equip_allocat_quantity of this suiluppo_equip_allocation
	*/
	@Override
	public long getEquip_allocat_quantity() {
		return _suiluppo_equip_allocation.getEquip_allocat_quantity();
	}

	/**
	* Returns the equip_id of this suiluppo_equip_allocation.
	*
	* @return the equip_id of this suiluppo_equip_allocation
	*/
	@Override
	public long getEquip_id() {
		return _suiluppo_equip_allocation.getEquip_id();
	}

	/**
	* Returns the primary key of this suiluppo_equip_allocation.
	*
	* @return the primary key of this suiluppo_equip_allocation
	*/
	@Override
	public long getPrimaryKey() {
		return _suiluppo_equip_allocation.getPrimaryKey();
	}

	@Override
	public void persist() {
		_suiluppo_equip_allocation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suiluppo_equip_allocation.setCachedModel(cachedModel);
	}

	/**
	* Sets the course_id of this suiluppo_equip_allocation.
	*
	* @param course_id the course_id of this suiluppo_equip_allocation
	*/
	@Override
	public void setCourse_id(long course_id) {
		_suiluppo_equip_allocation.setCourse_id(course_id);
	}

	/**
	* Sets the equip_allocat_id of this suiluppo_equip_allocation.
	*
	* @param equip_allocat_id the equip_allocat_id of this suiluppo_equip_allocation
	*/
	@Override
	public void setEquip_allocat_id(long equip_allocat_id) {
		_suiluppo_equip_allocation.setEquip_allocat_id(equip_allocat_id);
	}

	/**
	* Sets the equip_allocat_quantity of this suiluppo_equip_allocation.
	*
	* @param equip_allocat_quantity the equip_allocat_quantity of this suiluppo_equip_allocation
	*/
	@Override
	public void setEquip_allocat_quantity(long equip_allocat_quantity) {
		_suiluppo_equip_allocation.setEquip_allocat_quantity(equip_allocat_quantity);
	}

	/**
	* Sets the equip_id of this suiluppo_equip_allocation.
	*
	* @param equip_id the equip_id of this suiluppo_equip_allocation
	*/
	@Override
	public void setEquip_id(long equip_id) {
		_suiluppo_equip_allocation.setEquip_id(equip_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_suiluppo_equip_allocation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_suiluppo_equip_allocation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_suiluppo_equip_allocation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_suiluppo_equip_allocation.setNew(n);
	}

	/**
	* Sets the primary key of this suiluppo_equip_allocation.
	*
	* @param primaryKey the primary key of this suiluppo_equip_allocation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suiluppo_equip_allocation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_suiluppo_equip_allocation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_equip_allocationWrapper)) {
			return false;
		}

		suiluppo_equip_allocationWrapper suiluppo_equip_allocationWrapper = (suiluppo_equip_allocationWrapper)obj;

		if (Objects.equals(_suiluppo_equip_allocation,
					suiluppo_equip_allocationWrapper._suiluppo_equip_allocation)) {
			return true;
		}

		return false;
	}

	@Override
	public suiluppo_equip_allocation getWrappedModel() {
		return _suiluppo_equip_allocation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _suiluppo_equip_allocation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _suiluppo_equip_allocation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_suiluppo_equip_allocation.resetOriginalValues();
	}

	private final suiluppo_equip_allocation _suiluppo_equip_allocation;
}
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

package istruzioni_per_la_compilazioneservice.model;

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
 * This class is a wrapper for {@link istruzioni_per_la_compilazione_child}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione_child
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazione_childWrapper
	implements istruzioni_per_la_compilazione_child,
		ModelWrapper<istruzioni_per_la_compilazione_child> {
	public istruzioni_per_la_compilazione_childWrapper(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		_istruzioni_per_la_compilazione_child = istruzioni_per_la_compilazione_child;
	}

	@Override
	public Class<?> getModelClass() {
		return istruzioni_per_la_compilazione_child.class;
	}

	@Override
	public String getModelClassName() {
		return istruzioni_per_la_compilazione_child.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Ins_id", getIns_id());
		attributes.put("Instruction", getInstruction());
		attributes.put("Istruzioni_per_id", getIstruzioni_per_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Ins_id = (Long)attributes.get("Ins_id");

		if (Ins_id != null) {
			setIns_id(Ins_id);
		}

		String Instruction = (String)attributes.get("Instruction");

		if (Instruction != null) {
			setInstruction(Instruction);
		}

		Long Istruzioni_per_id = (Long)attributes.get("Istruzioni_per_id");

		if (Istruzioni_per_id != null) {
			setIstruzioni_per_id(Istruzioni_per_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _istruzioni_per_la_compilazione_child.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _istruzioni_per_la_compilazione_child.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _istruzioni_per_la_compilazione_child.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _istruzioni_per_la_compilazione_child.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child> toCacheModel() {
		return _istruzioni_per_la_compilazione_child.toCacheModel();
	}

	@Override
	public int compareTo(
		istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		return _istruzioni_per_la_compilazione_child.compareTo(istruzioni_per_la_compilazione_child);
	}

	@Override
	public int hashCode() {
		return _istruzioni_per_la_compilazione_child.hashCode();
	}

	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child toEscapedModel() {
		return new istruzioni_per_la_compilazione_childWrapper(_istruzioni_per_la_compilazione_child.toEscapedModel());
	}

	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child toUnescapedModel() {
		return new istruzioni_per_la_compilazione_childWrapper(_istruzioni_per_la_compilazione_child.toUnescapedModel());
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _istruzioni_per_la_compilazione_child.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new istruzioni_per_la_compilazione_childWrapper((istruzioni_per_la_compilazione_child)_istruzioni_per_la_compilazione_child.clone());
	}

	/**
	* Returns the instruction of this istruzioni_per_la_compilazione_child.
	*
	* @return the instruction of this istruzioni_per_la_compilazione_child
	*/
	@Override
	public java.lang.String getInstruction() {
		return _istruzioni_per_la_compilazione_child.getInstruction();
	}

	@Override
	public java.lang.String toString() {
		return _istruzioni_per_la_compilazione_child.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _istruzioni_per_la_compilazione_child.toXmlString();
	}

	/**
	* Returns the ins_id of this istruzioni_per_la_compilazione_child.
	*
	* @return the ins_id of this istruzioni_per_la_compilazione_child
	*/
	@Override
	public long getIns_id() {
		return _istruzioni_per_la_compilazione_child.getIns_id();
	}

	/**
	* Returns the istruzioni_per_id of this istruzioni_per_la_compilazione_child.
	*
	* @return the istruzioni_per_id of this istruzioni_per_la_compilazione_child
	*/
	@Override
	public long getIstruzioni_per_id() {
		return _istruzioni_per_la_compilazione_child.getIstruzioni_per_id();
	}

	/**
	* Returns the primary key of this istruzioni_per_la_compilazione_child.
	*
	* @return the primary key of this istruzioni_per_la_compilazione_child
	*/
	@Override
	public long getPrimaryKey() {
		return _istruzioni_per_la_compilazione_child.getPrimaryKey();
	}

	@Override
	public void persist() {
		_istruzioni_per_la_compilazione_child.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_istruzioni_per_la_compilazione_child.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_istruzioni_per_la_compilazione_child.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_istruzioni_per_la_compilazione_child.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_istruzioni_per_la_compilazione_child.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ins_id of this istruzioni_per_la_compilazione_child.
	*
	* @param Ins_id the ins_id of this istruzioni_per_la_compilazione_child
	*/
	@Override
	public void setIns_id(long Ins_id) {
		_istruzioni_per_la_compilazione_child.setIns_id(Ins_id);
	}

	/**
	* Sets the instruction of this istruzioni_per_la_compilazione_child.
	*
	* @param Instruction the instruction of this istruzioni_per_la_compilazione_child
	*/
	@Override
	public void setInstruction(java.lang.String Instruction) {
		_istruzioni_per_la_compilazione_child.setInstruction(Instruction);
	}

	/**
	* Sets the istruzioni_per_id of this istruzioni_per_la_compilazione_child.
	*
	* @param Istruzioni_per_id the istruzioni_per_id of this istruzioni_per_la_compilazione_child
	*/
	@Override
	public void setIstruzioni_per_id(long Istruzioni_per_id) {
		_istruzioni_per_la_compilazione_child.setIstruzioni_per_id(Istruzioni_per_id);
	}

	@Override
	public void setNew(boolean n) {
		_istruzioni_per_la_compilazione_child.setNew(n);
	}

	/**
	* Sets the primary key of this istruzioni_per_la_compilazione_child.
	*
	* @param primaryKey the primary key of this istruzioni_per_la_compilazione_child
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_istruzioni_per_la_compilazione_child.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_istruzioni_per_la_compilazione_child.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof istruzioni_per_la_compilazione_childWrapper)) {
			return false;
		}

		istruzioni_per_la_compilazione_childWrapper istruzioni_per_la_compilazione_childWrapper =
			(istruzioni_per_la_compilazione_childWrapper)obj;

		if (Objects.equals(_istruzioni_per_la_compilazione_child,
					istruzioni_per_la_compilazione_childWrapper._istruzioni_per_la_compilazione_child)) {
			return true;
		}

		return false;
	}

	@Override
	public istruzioni_per_la_compilazione_child getWrappedModel() {
		return _istruzioni_per_la_compilazione_child;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _istruzioni_per_la_compilazione_child.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _istruzioni_per_la_compilazione_child.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_istruzioni_per_la_compilazione_child.resetOriginalValues();
	}

	private final istruzioni_per_la_compilazione_child _istruzioni_per_la_compilazione_child;
}
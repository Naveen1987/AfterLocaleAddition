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
 * This class is a wrapper for {@link istruzioni_per_la_compilazione}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazioneWrapper
	implements istruzioni_per_la_compilazione,
		ModelWrapper<istruzioni_per_la_compilazione> {
	public istruzioni_per_la_compilazioneWrapper(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		_istruzioni_per_la_compilazione = istruzioni_per_la_compilazione;
	}

	@Override
	public Class<?> getModelClass() {
		return istruzioni_per_la_compilazione.class;
	}

	@Override
	public String getModelClassName() {
		return istruzioni_per_la_compilazione.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Istruzioni_per_id", getIstruzioni_per_id());
		attributes.put("purpose", getPurpose());
		attributes.put("MainTitle", getMainTitle());
		attributes.put("Tilte", getTilte());
		attributes.put("SubTitle", getSubTitle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Istruzioni_per_id = (Long)attributes.get("Istruzioni_per_id");

		if (Istruzioni_per_id != null) {
			setIstruzioni_per_id(Istruzioni_per_id);
		}

		String purpose = (String)attributes.get("purpose");

		if (purpose != null) {
			setPurpose(purpose);
		}

		String MainTitle = (String)attributes.get("MainTitle");

		if (MainTitle != null) {
			setMainTitle(MainTitle);
		}

		String Tilte = (String)attributes.get("Tilte");

		if (Tilte != null) {
			setTilte(Tilte);
		}

		String SubTitle = (String)attributes.get("SubTitle");

		if (SubTitle != null) {
			setSubTitle(SubTitle);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _istruzioni_per_la_compilazione.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _istruzioni_per_la_compilazione.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _istruzioni_per_la_compilazione.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _istruzioni_per_la_compilazione.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione> toCacheModel() {
		return _istruzioni_per_la_compilazione.toCacheModel();
	}

	@Override
	public int compareTo(
		istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		return _istruzioni_per_la_compilazione.compareTo(istruzioni_per_la_compilazione);
	}

	@Override
	public int hashCode() {
		return _istruzioni_per_la_compilazione.hashCode();
	}

	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione toEscapedModel() {
		return new istruzioni_per_la_compilazioneWrapper(_istruzioni_per_la_compilazione.toEscapedModel());
	}

	@Override
	public istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione toUnescapedModel() {
		return new istruzioni_per_la_compilazioneWrapper(_istruzioni_per_la_compilazione.toUnescapedModel());
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _istruzioni_per_la_compilazione.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new istruzioni_per_la_compilazioneWrapper((istruzioni_per_la_compilazione)_istruzioni_per_la_compilazione.clone());
	}

	/**
	* Returns the main title of this istruzioni_per_la_compilazione.
	*
	* @return the main title of this istruzioni_per_la_compilazione
	*/
	@Override
	public java.lang.String getMainTitle() {
		return _istruzioni_per_la_compilazione.getMainTitle();
	}

	/**
	* Returns the purpose of this istruzioni_per_la_compilazione.
	*
	* @return the purpose of this istruzioni_per_la_compilazione
	*/
	@Override
	public java.lang.String getPurpose() {
		return _istruzioni_per_la_compilazione.getPurpose();
	}

	/**
	* Returns the sub title of this istruzioni_per_la_compilazione.
	*
	* @return the sub title of this istruzioni_per_la_compilazione
	*/
	@Override
	public java.lang.String getSubTitle() {
		return _istruzioni_per_la_compilazione.getSubTitle();
	}

	/**
	* Returns the tilte of this istruzioni_per_la_compilazione.
	*
	* @return the tilte of this istruzioni_per_la_compilazione
	*/
	@Override
	public java.lang.String getTilte() {
		return _istruzioni_per_la_compilazione.getTilte();
	}

	@Override
	public java.lang.String toString() {
		return _istruzioni_per_la_compilazione.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _istruzioni_per_la_compilazione.toXmlString();
	}

	/**
	* Returns the istruzioni_per_id of this istruzioni_per_la_compilazione.
	*
	* @return the istruzioni_per_id of this istruzioni_per_la_compilazione
	*/
	@Override
	public long getIstruzioni_per_id() {
		return _istruzioni_per_la_compilazione.getIstruzioni_per_id();
	}

	/**
	* Returns the primary key of this istruzioni_per_la_compilazione.
	*
	* @return the primary key of this istruzioni_per_la_compilazione
	*/
	@Override
	public long getPrimaryKey() {
		return _istruzioni_per_la_compilazione.getPrimaryKey();
	}

	@Override
	public void persist() {
		_istruzioni_per_la_compilazione.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_istruzioni_per_la_compilazione.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_istruzioni_per_la_compilazione.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_istruzioni_per_la_compilazione.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_istruzioni_per_la_compilazione.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the istruzioni_per_id of this istruzioni_per_la_compilazione.
	*
	* @param Istruzioni_per_id the istruzioni_per_id of this istruzioni_per_la_compilazione
	*/
	@Override
	public void setIstruzioni_per_id(long Istruzioni_per_id) {
		_istruzioni_per_la_compilazione.setIstruzioni_per_id(Istruzioni_per_id);
	}

	/**
	* Sets the main title of this istruzioni_per_la_compilazione.
	*
	* @param MainTitle the main title of this istruzioni_per_la_compilazione
	*/
	@Override
	public void setMainTitle(java.lang.String MainTitle) {
		_istruzioni_per_la_compilazione.setMainTitle(MainTitle);
	}

	@Override
	public void setNew(boolean n) {
		_istruzioni_per_la_compilazione.setNew(n);
	}

	/**
	* Sets the primary key of this istruzioni_per_la_compilazione.
	*
	* @param primaryKey the primary key of this istruzioni_per_la_compilazione
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_istruzioni_per_la_compilazione.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_istruzioni_per_la_compilazione.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the purpose of this istruzioni_per_la_compilazione.
	*
	* @param purpose the purpose of this istruzioni_per_la_compilazione
	*/
	@Override
	public void setPurpose(java.lang.String purpose) {
		_istruzioni_per_la_compilazione.setPurpose(purpose);
	}

	/**
	* Sets the sub title of this istruzioni_per_la_compilazione.
	*
	* @param SubTitle the sub title of this istruzioni_per_la_compilazione
	*/
	@Override
	public void setSubTitle(java.lang.String SubTitle) {
		_istruzioni_per_la_compilazione.setSubTitle(SubTitle);
	}

	/**
	* Sets the tilte of this istruzioni_per_la_compilazione.
	*
	* @param Tilte the tilte of this istruzioni_per_la_compilazione
	*/
	@Override
	public void setTilte(java.lang.String Tilte) {
		_istruzioni_per_la_compilazione.setTilte(Tilte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof istruzioni_per_la_compilazioneWrapper)) {
			return false;
		}

		istruzioni_per_la_compilazioneWrapper istruzioni_per_la_compilazioneWrapper =
			(istruzioni_per_la_compilazioneWrapper)obj;

		if (Objects.equals(_istruzioni_per_la_compilazione,
					istruzioni_per_la_compilazioneWrapper._istruzioni_per_la_compilazione)) {
			return true;
		}

		return false;
	}

	@Override
	public istruzioni_per_la_compilazione getWrappedModel() {
		return _istruzioni_per_la_compilazione;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _istruzioni_per_la_compilazione.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _istruzioni_per_la_compilazione.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_istruzioni_per_la_compilazione.resetOriginalValues();
	}

	private final istruzioni_per_la_compilazione _istruzioni_per_la_compilazione;
}
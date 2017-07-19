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

package com.daffo.prontuario_drugservice.model;

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
 * This class is a wrapper for {@link prontuario_drug}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prontuario_drug
 * @generated
 */
@ProviderType
public class prontuario_drugWrapper implements prontuario_drug,
	ModelWrapper<prontuario_drug> {
	public prontuario_drugWrapper(prontuario_drug prontuario_drug) {
		_prontuario_drug = prontuario_drug;
	}

	@Override
	public Class<?> getModelClass() {
		return prontuario_drug.class;
	}

	@Override
	public String getModelClassName() {
		return prontuario_drug.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("drug_id", getDrug_id());
		attributes.put("Gruppo", getGruppo());
		attributes.put("SottoGruppo", getSottoGruppo());
		attributes.put("Codice", getCodice());
		attributes.put("Principio_Attivo", getPrincipio_Attivo());
		attributes.put("Nome_Commerciale", getNome_Commerciale());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long drug_id = (Long)attributes.get("drug_id");

		if (drug_id != null) {
			setDrug_id(drug_id);
		}

		String Gruppo = (String)attributes.get("Gruppo");

		if (Gruppo != null) {
			setGruppo(Gruppo);
		}

		String SottoGruppo = (String)attributes.get("SottoGruppo");

		if (SottoGruppo != null) {
			setSottoGruppo(SottoGruppo);
		}

		String Codice = (String)attributes.get("Codice");

		if (Codice != null) {
			setCodice(Codice);
		}

		String Principio_Attivo = (String)attributes.get("Principio_Attivo");

		if (Principio_Attivo != null) {
			setPrincipio_Attivo(Principio_Attivo);
		}

		String Nome_Commerciale = (String)attributes.get("Nome_Commerciale");

		if (Nome_Commerciale != null) {
			setNome_Commerciale(Nome_Commerciale);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _prontuario_drug.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _prontuario_drug.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _prontuario_drug.isNew();
	}

	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug toEscapedModel() {
		return new prontuario_drugWrapper(_prontuario_drug.toEscapedModel());
	}

	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug toUnescapedModel() {
		return new prontuario_drugWrapper(_prontuario_drug.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _prontuario_drug.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.prontuario_drugservice.model.prontuario_drug> toCacheModel() {
		return _prontuario_drug.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.prontuario_drugservice.model.prontuario_drug prontuario_drug) {
		return _prontuario_drug.compareTo(prontuario_drug);
	}

	@Override
	public int hashCode() {
		return _prontuario_drug.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _prontuario_drug.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new prontuario_drugWrapper((prontuario_drug)_prontuario_drug.clone());
	}

	/**
	* Returns the codice of this prontuario_drug.
	*
	* @return the codice of this prontuario_drug
	*/
	@Override
	public java.lang.String getCodice() {
		return _prontuario_drug.getCodice();
	}

	/**
	* Returns the gruppo of this prontuario_drug.
	*
	* @return the gruppo of this prontuario_drug
	*/
	@Override
	public java.lang.String getGruppo() {
		return _prontuario_drug.getGruppo();
	}

	/**
	* Returns the nome_ commerciale of this prontuario_drug.
	*
	* @return the nome_ commerciale of this prontuario_drug
	*/
	@Override
	public java.lang.String getNome_Commerciale() {
		return _prontuario_drug.getNome_Commerciale();
	}

	/**
	* Returns the principio_ attivo of this prontuario_drug.
	*
	* @return the principio_ attivo of this prontuario_drug
	*/
	@Override
	public java.lang.String getPrincipio_Attivo() {
		return _prontuario_drug.getPrincipio_Attivo();
	}

	/**
	* Returns the sotto gruppo of this prontuario_drug.
	*
	* @return the sotto gruppo of this prontuario_drug
	*/
	@Override
	public java.lang.String getSottoGruppo() {
		return _prontuario_drug.getSottoGruppo();
	}

	@Override
	public java.lang.String toString() {
		return _prontuario_drug.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prontuario_drug.toXmlString();
	}

	/**
	* Returns the drug_id of this prontuario_drug.
	*
	* @return the drug_id of this prontuario_drug
	*/
	@Override
	public long getDrug_id() {
		return _prontuario_drug.getDrug_id();
	}

	/**
	* Returns the primary key of this prontuario_drug.
	*
	* @return the primary key of this prontuario_drug
	*/
	@Override
	public long getPrimaryKey() {
		return _prontuario_drug.getPrimaryKey();
	}

	@Override
	public void persist() {
		_prontuario_drug.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prontuario_drug.setCachedModel(cachedModel);
	}

	/**
	* Sets the codice of this prontuario_drug.
	*
	* @param Codice the codice of this prontuario_drug
	*/
	@Override
	public void setCodice(java.lang.String Codice) {
		_prontuario_drug.setCodice(Codice);
	}

	/**
	* Sets the drug_id of this prontuario_drug.
	*
	* @param drug_id the drug_id of this prontuario_drug
	*/
	@Override
	public void setDrug_id(long drug_id) {
		_prontuario_drug.setDrug_id(drug_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_prontuario_drug.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_prontuario_drug.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_prontuario_drug.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the gruppo of this prontuario_drug.
	*
	* @param Gruppo the gruppo of this prontuario_drug
	*/
	@Override
	public void setGruppo(java.lang.String Gruppo) {
		_prontuario_drug.setGruppo(Gruppo);
	}

	@Override
	public void setNew(boolean n) {
		_prontuario_drug.setNew(n);
	}

	/**
	* Sets the nome_ commerciale of this prontuario_drug.
	*
	* @param Nome_Commerciale the nome_ commerciale of this prontuario_drug
	*/
	@Override
	public void setNome_Commerciale(java.lang.String Nome_Commerciale) {
		_prontuario_drug.setNome_Commerciale(Nome_Commerciale);
	}

	/**
	* Sets the primary key of this prontuario_drug.
	*
	* @param primaryKey the primary key of this prontuario_drug
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_prontuario_drug.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_prontuario_drug.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the principio_ attivo of this prontuario_drug.
	*
	* @param Principio_Attivo the principio_ attivo of this prontuario_drug
	*/
	@Override
	public void setPrincipio_Attivo(java.lang.String Principio_Attivo) {
		_prontuario_drug.setPrincipio_Attivo(Principio_Attivo);
	}

	/**
	* Sets the sotto gruppo of this prontuario_drug.
	*
	* @param SottoGruppo the sotto gruppo of this prontuario_drug
	*/
	@Override
	public void setSottoGruppo(java.lang.String SottoGruppo) {
		_prontuario_drug.setSottoGruppo(SottoGruppo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof prontuario_drugWrapper)) {
			return false;
		}

		prontuario_drugWrapper prontuario_drugWrapper = (prontuario_drugWrapper)obj;

		if (Objects.equals(_prontuario_drug,
					prontuario_drugWrapper._prontuario_drug)) {
			return true;
		}

		return false;
	}

	@Override
	public prontuario_drug getWrappedModel() {
		return _prontuario_drug;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _prontuario_drug.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _prontuario_drug.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_prontuario_drug.resetOriginalValues();
	}

	private final prontuario_drug _prontuario_drug;
}
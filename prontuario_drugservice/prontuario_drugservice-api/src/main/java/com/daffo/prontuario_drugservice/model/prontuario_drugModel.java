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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the prontuario_drug service. Represents a row in the &quot;prontuario_drug&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.daffo.prontuario_drugservice.model.impl.prontuario_drugModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.daffo.prontuario_drugservice.model.impl.prontuario_drugImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prontuario_drug
 * @see com.daffo.prontuario_drugservice.model.impl.prontuario_drugImpl
 * @see com.daffo.prontuario_drugservice.model.impl.prontuario_drugModelImpl
 * @generated
 */
@ProviderType
public interface prontuario_drugModel extends BaseModel<prontuario_drug> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a prontuario_drug model instance should use the {@link prontuario_drug} interface instead.
	 */

	/**
	 * Returns the primary key of this prontuario_drug.
	 *
	 * @return the primary key of this prontuario_drug
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this prontuario_drug.
	 *
	 * @param primaryKey the primary key of this prontuario_drug
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the drug_id of this prontuario_drug.
	 *
	 * @return the drug_id of this prontuario_drug
	 */
	public long getDrug_id();

	/**
	 * Sets the drug_id of this prontuario_drug.
	 *
	 * @param drug_id the drug_id of this prontuario_drug
	 */
	public void setDrug_id(long drug_id);

	/**
	 * Returns the gruppo of this prontuario_drug.
	 *
	 * @return the gruppo of this prontuario_drug
	 */
	@AutoEscape
	public String getGruppo();

	/**
	 * Sets the gruppo of this prontuario_drug.
	 *
	 * @param Gruppo the gruppo of this prontuario_drug
	 */
	public void setGruppo(String Gruppo);

	/**
	 * Returns the sotto gruppo of this prontuario_drug.
	 *
	 * @return the sotto gruppo of this prontuario_drug
	 */
	@AutoEscape
	public String getSottoGruppo();

	/**
	 * Sets the sotto gruppo of this prontuario_drug.
	 *
	 * @param SottoGruppo the sotto gruppo of this prontuario_drug
	 */
	public void setSottoGruppo(String SottoGruppo);

	/**
	 * Returns the codice of this prontuario_drug.
	 *
	 * @return the codice of this prontuario_drug
	 */
	@AutoEscape
	public String getCodice();

	/**
	 * Sets the codice of this prontuario_drug.
	 *
	 * @param Codice the codice of this prontuario_drug
	 */
	public void setCodice(String Codice);

	/**
	 * Returns the principio_ attivo of this prontuario_drug.
	 *
	 * @return the principio_ attivo of this prontuario_drug
	 */
	@AutoEscape
	public String getPrincipio_Attivo();

	/**
	 * Sets the principio_ attivo of this prontuario_drug.
	 *
	 * @param Principio_Attivo the principio_ attivo of this prontuario_drug
	 */
	public void setPrincipio_Attivo(String Principio_Attivo);

	/**
	 * Returns the nome_ commerciale of this prontuario_drug.
	 *
	 * @return the nome_ commerciale of this prontuario_drug
	 */
	@AutoEscape
	public String getNome_Commerciale();

	/**
	 * Sets the nome_ commerciale of this prontuario_drug.
	 *
	 * @param Nome_Commerciale the nome_ commerciale of this prontuario_drug
	 */
	public void setNome_Commerciale(String Nome_Commerciale);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.daffo.prontuario_drugservice.model.prontuario_drug prontuario_drug);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.daffo.prontuario_drugservice.model.prontuario_drug> toCacheModel();

	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug toEscapedModel();

	@Override
	public com.daffo.prontuario_drugservice.model.prontuario_drug toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
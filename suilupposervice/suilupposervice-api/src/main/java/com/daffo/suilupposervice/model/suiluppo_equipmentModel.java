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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the suiluppo_equipment service. Represents a row in the &quot;suiluppo_equipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.daffo.suilupposervice.model.impl.suiluppo_equipmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.daffo.suilupposervice.model.impl.suiluppo_equipmentImpl}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_equipment
 * @see com.daffo.suilupposervice.model.impl.suiluppo_equipmentImpl
 * @see com.daffo.suilupposervice.model.impl.suiluppo_equipmentModelImpl
 * @generated
 */
@ProviderType
public interface suiluppo_equipmentModel extends BaseModel<suiluppo_equipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a suiluppo_equipment model instance should use the {@link suiluppo_equipment} interface instead.
	 */

	/**
	 * Returns the primary key of this suiluppo_equipment.
	 *
	 * @return the primary key of this suiluppo_equipment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this suiluppo_equipment.
	 *
	 * @param primaryKey the primary key of this suiluppo_equipment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the equip_id of this suiluppo_equipment.
	 *
	 * @return the equip_id of this suiluppo_equipment
	 */
	public long getEquip_id();

	/**
	 * Sets the equip_id of this suiluppo_equipment.
	 *
	 * @param equip_id the equip_id of this suiluppo_equipment
	 */
	public void setEquip_id(long equip_id);

	/**
	 * Returns the equip_name of this suiluppo_equipment.
	 *
	 * @return the equip_name of this suiluppo_equipment
	 */
	@AutoEscape
	public String getEquip_name();

	/**
	 * Sets the equip_name of this suiluppo_equipment.
	 *
	 * @param equip_name the equip_name of this suiluppo_equipment
	 */
	public void setEquip_name(String equip_name);

	/**
	 * Returns the equip_quanity of this suiluppo_equipment.
	 *
	 * @return the equip_quanity of this suiluppo_equipment
	 */
	public long getEquip_quanity();

	/**
	 * Sets the equip_quanity of this suiluppo_equipment.
	 *
	 * @param equip_quanity the equip_quanity of this suiluppo_equipment
	 */
	public void setEquip_quanity(long equip_quanity);

	/**
	 * Returns the equip_description of this suiluppo_equipment.
	 *
	 * @return the equip_description of this suiluppo_equipment
	 */
	@AutoEscape
	public String getEquip_description();

	/**
	 * Sets the equip_description of this suiluppo_equipment.
	 *
	 * @param equip_description the equip_description of this suiluppo_equipment
	 */
	public void setEquip_description(String equip_description);

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
		com.daffo.suilupposervice.model.suiluppo_equipment suiluppo_equipment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.daffo.suilupposervice.model.suiluppo_equipment> toCacheModel();

	@Override
	public com.daffo.suilupposervice.model.suiluppo_equipment toEscapedModel();

	@Override
	public com.daffo.suilupposervice.model.suiluppo_equipment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
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

package com.daffo.suilupposervice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.suilupposervice.model.suiluppo_equipment;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing suiluppo_equipment in entity cache.
 *
 * @author Naveen
 * @see suiluppo_equipment
 * @generated
 */
@ProviderType
public class suiluppo_equipmentCacheModel implements CacheModel<suiluppo_equipment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_equipmentCacheModel)) {
			return false;
		}

		suiluppo_equipmentCacheModel suiluppo_equipmentCacheModel = (suiluppo_equipmentCacheModel)obj;

		if (equip_id == suiluppo_equipmentCacheModel.equip_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, equip_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{equip_id=");
		sb.append(equip_id);
		sb.append(", equip_name=");
		sb.append(equip_name);
		sb.append(", equip_quanity=");
		sb.append(equip_quanity);
		sb.append(", equip_description=");
		sb.append(equip_description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public suiluppo_equipment toEntityModel() {
		suiluppo_equipmentImpl suiluppo_equipmentImpl = new suiluppo_equipmentImpl();

		suiluppo_equipmentImpl.setEquip_id(equip_id);

		if (equip_name == null) {
			suiluppo_equipmentImpl.setEquip_name(StringPool.BLANK);
		}
		else {
			suiluppo_equipmentImpl.setEquip_name(equip_name);
		}

		suiluppo_equipmentImpl.setEquip_quanity(equip_quanity);

		if (equip_description == null) {
			suiluppo_equipmentImpl.setEquip_description(StringPool.BLANK);
		}
		else {
			suiluppo_equipmentImpl.setEquip_description(equip_description);
		}

		suiluppo_equipmentImpl.resetOriginalValues();

		return suiluppo_equipmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		equip_id = objectInput.readLong();
		equip_name = objectInput.readUTF();

		equip_quanity = objectInput.readLong();
		equip_description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(equip_id);

		if (equip_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equip_name);
		}

		objectOutput.writeLong(equip_quanity);

		if (equip_description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equip_description);
		}
	}

	public long equip_id;
	public String equip_name;
	public long equip_quanity;
	public String equip_description;
}
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

package com.roomservice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.roomservice.model.Equipment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Equipment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Equipment
 * @generated
 */
@ProviderType
public class EquipmentCacheModel implements CacheModel<Equipment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EquipmentCacheModel)) {
			return false;
		}

		EquipmentCacheModel equipmentCacheModel = (EquipmentCacheModel)obj;

		if (equip_id == equipmentCacheModel.equip_id) {
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
		StringBundler sb = new StringBundler(11);

		sb.append("{equip_id=");
		sb.append(equip_id);
		sb.append(", equipment_name=");
		sb.append(equipment_name);
		sb.append(", equip_quantity=");
		sb.append(equip_quantity);
		sb.append(", equip_description=");
		sb.append(equip_description);
		sb.append(", equip_status=");
		sb.append(equip_status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Equipment toEntityModel() {
		EquipmentImpl equipmentImpl = new EquipmentImpl();

		equipmentImpl.setEquip_id(equip_id);

		if (equipment_name == null) {
			equipmentImpl.setEquipment_name(StringPool.BLANK);
		}
		else {
			equipmentImpl.setEquipment_name(equipment_name);
		}

		equipmentImpl.setEquip_quantity(equip_quantity);

		if (equip_description == null) {
			equipmentImpl.setEquip_description(StringPool.BLANK);
		}
		else {
			equipmentImpl.setEquip_description(equip_description);
		}

		equipmentImpl.setEquip_status(equip_status);

		equipmentImpl.resetOriginalValues();

		return equipmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		equip_id = objectInput.readLong();
		equipment_name = objectInput.readUTF();

		equip_quantity = objectInput.readInt();
		equip_description = objectInput.readUTF();

		equip_status = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(equip_id);

		if (equipment_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equipment_name);
		}

		objectOutput.writeInt(equip_quantity);

		if (equip_description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(equip_description);
		}

		objectOutput.writeBoolean(equip_status);
	}

	public long equip_id;
	public String equipment_name;
	public int equip_quantity;
	public String equip_description;
	public boolean equip_status;
}
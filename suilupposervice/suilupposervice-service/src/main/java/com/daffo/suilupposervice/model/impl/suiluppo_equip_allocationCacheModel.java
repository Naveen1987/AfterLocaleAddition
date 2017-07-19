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

import com.daffo.suilupposervice.model.suiluppo_equip_allocation;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing suiluppo_equip_allocation in entity cache.
 *
 * @author Naveen
 * @see suiluppo_equip_allocation
 * @generated
 */
@ProviderType
public class suiluppo_equip_allocationCacheModel implements CacheModel<suiluppo_equip_allocation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_equip_allocationCacheModel)) {
			return false;
		}

		suiluppo_equip_allocationCacheModel suiluppo_equip_allocationCacheModel = (suiluppo_equip_allocationCacheModel)obj;

		if (equip_allocat_id == suiluppo_equip_allocationCacheModel.equip_allocat_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, equip_allocat_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{equip_allocat_id=");
		sb.append(equip_allocat_id);
		sb.append(", course_id=");
		sb.append(course_id);
		sb.append(", equip_id=");
		sb.append(equip_id);
		sb.append(", equip_allocat_quantity=");
		sb.append(equip_allocat_quantity);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public suiluppo_equip_allocation toEntityModel() {
		suiluppo_equip_allocationImpl suiluppo_equip_allocationImpl = new suiluppo_equip_allocationImpl();

		suiluppo_equip_allocationImpl.setEquip_allocat_id(equip_allocat_id);
		suiluppo_equip_allocationImpl.setCourse_id(course_id);
		suiluppo_equip_allocationImpl.setEquip_id(equip_id);
		suiluppo_equip_allocationImpl.setEquip_allocat_quantity(equip_allocat_quantity);

		suiluppo_equip_allocationImpl.resetOriginalValues();

		return suiluppo_equip_allocationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		equip_allocat_id = objectInput.readLong();

		course_id = objectInput.readLong();

		equip_id = objectInput.readLong();

		equip_allocat_quantity = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(equip_allocat_id);

		objectOutput.writeLong(course_id);

		objectOutput.writeLong(equip_id);

		objectOutput.writeLong(equip_allocat_quantity);
	}

	public long equip_allocat_id;
	public long course_id;
	public long equip_id;
	public long equip_allocat_quantity;
}
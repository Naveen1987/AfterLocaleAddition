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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Naveen
 * @generated
 */
@ProviderType
public class suiluppo_equip_allocationSoap implements Serializable {
	public static suiluppo_equip_allocationSoap toSoapModel(
		suiluppo_equip_allocation model) {
		suiluppo_equip_allocationSoap soapModel = new suiluppo_equip_allocationSoap();

		soapModel.setEquip_allocat_id(model.getEquip_allocat_id());
		soapModel.setCourse_id(model.getCourse_id());
		soapModel.setEquip_id(model.getEquip_id());
		soapModel.setEquip_allocat_quantity(model.getEquip_allocat_quantity());

		return soapModel;
	}

	public static suiluppo_equip_allocationSoap[] toSoapModels(
		suiluppo_equip_allocation[] models) {
		suiluppo_equip_allocationSoap[] soapModels = new suiluppo_equip_allocationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_equip_allocationSoap[][] toSoapModels(
		suiluppo_equip_allocation[][] models) {
		suiluppo_equip_allocationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new suiluppo_equip_allocationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new suiluppo_equip_allocationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_equip_allocationSoap[] toSoapModels(
		List<suiluppo_equip_allocation> models) {
		List<suiluppo_equip_allocationSoap> soapModels = new ArrayList<suiluppo_equip_allocationSoap>(models.size());

		for (suiluppo_equip_allocation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new suiluppo_equip_allocationSoap[soapModels.size()]);
	}

	public suiluppo_equip_allocationSoap() {
	}

	public long getPrimaryKey() {
		return _equip_allocat_id;
	}

	public void setPrimaryKey(long pk) {
		setEquip_allocat_id(pk);
	}

	public long getEquip_allocat_id() {
		return _equip_allocat_id;
	}

	public void setEquip_allocat_id(long equip_allocat_id) {
		_equip_allocat_id = equip_allocat_id;
	}

	public long getCourse_id() {
		return _course_id;
	}

	public void setCourse_id(long course_id) {
		_course_id = course_id;
	}

	public long getEquip_id() {
		return _equip_id;
	}

	public void setEquip_id(long equip_id) {
		_equip_id = equip_id;
	}

	public long getEquip_allocat_quantity() {
		return _equip_allocat_quantity;
	}

	public void setEquip_allocat_quantity(long equip_allocat_quantity) {
		_equip_allocat_quantity = equip_allocat_quantity;
	}

	private long _equip_allocat_id;
	private long _course_id;
	private long _equip_id;
	private long _equip_allocat_quantity;
}
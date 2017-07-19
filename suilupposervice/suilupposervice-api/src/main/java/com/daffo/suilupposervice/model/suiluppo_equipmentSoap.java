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
public class suiluppo_equipmentSoap implements Serializable {
	public static suiluppo_equipmentSoap toSoapModel(suiluppo_equipment model) {
		suiluppo_equipmentSoap soapModel = new suiluppo_equipmentSoap();

		soapModel.setEquip_id(model.getEquip_id());
		soapModel.setEquip_name(model.getEquip_name());
		soapModel.setEquip_quanity(model.getEquip_quanity());
		soapModel.setEquip_description(model.getEquip_description());

		return soapModel;
	}

	public static suiluppo_equipmentSoap[] toSoapModels(
		suiluppo_equipment[] models) {
		suiluppo_equipmentSoap[] soapModels = new suiluppo_equipmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_equipmentSoap[][] toSoapModels(
		suiluppo_equipment[][] models) {
		suiluppo_equipmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new suiluppo_equipmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new suiluppo_equipmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_equipmentSoap[] toSoapModels(
		List<suiluppo_equipment> models) {
		List<suiluppo_equipmentSoap> soapModels = new ArrayList<suiluppo_equipmentSoap>(models.size());

		for (suiluppo_equipment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new suiluppo_equipmentSoap[soapModels.size()]);
	}

	public suiluppo_equipmentSoap() {
	}

	public long getPrimaryKey() {
		return _equip_id;
	}

	public void setPrimaryKey(long pk) {
		setEquip_id(pk);
	}

	public long getEquip_id() {
		return _equip_id;
	}

	public void setEquip_id(long equip_id) {
		_equip_id = equip_id;
	}

	public String getEquip_name() {
		return _equip_name;
	}

	public void setEquip_name(String equip_name) {
		_equip_name = equip_name;
	}

	public long getEquip_quanity() {
		return _equip_quanity;
	}

	public void setEquip_quanity(long equip_quanity) {
		_equip_quanity = equip_quanity;
	}

	public String getEquip_description() {
		return _equip_description;
	}

	public void setEquip_description(String equip_description) {
		_equip_description = equip_description;
	}

	private long _equip_id;
	private String _equip_name;
	private long _equip_quanity;
	private String _equip_description;
}
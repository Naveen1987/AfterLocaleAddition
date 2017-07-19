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

package com.roomservice.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class EquipmentSoap implements Serializable {
	public static EquipmentSoap toSoapModel(Equipment model) {
		EquipmentSoap soapModel = new EquipmentSoap();

		soapModel.setEquip_id(model.getEquip_id());
		soapModel.setEquipment_name(model.getEquipment_name());
		soapModel.setEquip_quantity(model.getEquip_quantity());
		soapModel.setEquip_description(model.getEquip_description());
		soapModel.setEquip_status(model.getEquip_status());

		return soapModel;
	}

	public static EquipmentSoap[] toSoapModels(Equipment[] models) {
		EquipmentSoap[] soapModels = new EquipmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EquipmentSoap[][] toSoapModels(Equipment[][] models) {
		EquipmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EquipmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EquipmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EquipmentSoap[] toSoapModels(List<Equipment> models) {
		List<EquipmentSoap> soapModels = new ArrayList<EquipmentSoap>(models.size());

		for (Equipment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EquipmentSoap[soapModels.size()]);
	}

	public EquipmentSoap() {
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

	public String getEquipment_name() {
		return _equipment_name;
	}

	public void setEquipment_name(String equipment_name) {
		_equipment_name = equipment_name;
	}

	public int getEquip_quantity() {
		return _equip_quantity;
	}

	public void setEquip_quantity(int equip_quantity) {
		_equip_quantity = equip_quantity;
	}

	public String getEquip_description() {
		return _equip_description;
	}

	public void setEquip_description(String equip_description) {
		_equip_description = equip_description;
	}

	public boolean getEquip_status() {
		return _equip_status;
	}

	public boolean isEquip_status() {
		return _equip_status;
	}

	public void setEquip_status(boolean equip_status) {
		_equip_status = equip_status;
	}

	private long _equip_id;
	private String _equipment_name;
	private int _equip_quantity;
	private String _equip_description;
	private boolean _equip_status;
}
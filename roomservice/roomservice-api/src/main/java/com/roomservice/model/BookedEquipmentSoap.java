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
public class BookedEquipmentSoap implements Serializable {
	public static BookedEquipmentSoap toSoapModel(BookedEquipment model) {
		BookedEquipmentSoap soapModel = new BookedEquipmentSoap();

		soapModel.setBooked_equip_id(model.getBooked_equip_id());
		soapModel.setEquip_id(model.getEquip_id());
		soapModel.setCourse_id(model.getCourse_id());
		soapModel.setEquip_quantity(model.getEquip_quantity());
		soapModel.setBooked_equip_status(model.getBooked_equip_status());
		soapModel.setBooked_equip_date(model.getBooked_equip_date());

		return soapModel;
	}

	public static BookedEquipmentSoap[] toSoapModels(BookedEquipment[] models) {
		BookedEquipmentSoap[] soapModels = new BookedEquipmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BookedEquipmentSoap[][] toSoapModels(
		BookedEquipment[][] models) {
		BookedEquipmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BookedEquipmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BookedEquipmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BookedEquipmentSoap[] toSoapModels(
		List<BookedEquipment> models) {
		List<BookedEquipmentSoap> soapModels = new ArrayList<BookedEquipmentSoap>(models.size());

		for (BookedEquipment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BookedEquipmentSoap[soapModels.size()]);
	}

	public BookedEquipmentSoap() {
	}

	public long getPrimaryKey() {
		return _booked_equip_id;
	}

	public void setPrimaryKey(long pk) {
		setBooked_equip_id(pk);
	}

	public long getBooked_equip_id() {
		return _booked_equip_id;
	}

	public void setBooked_equip_id(long booked_equip_id) {
		_booked_equip_id = booked_equip_id;
	}

	public long getEquip_id() {
		return _equip_id;
	}

	public void setEquip_id(long equip_id) {
		_equip_id = equip_id;
	}

	public long getCourse_id() {
		return _course_id;
	}

	public void setCourse_id(long course_id) {
		_course_id = course_id;
	}

	public int getEquip_quantity() {
		return _equip_quantity;
	}

	public void setEquip_quantity(int equip_quantity) {
		_equip_quantity = equip_quantity;
	}

	public boolean getBooked_equip_status() {
		return _booked_equip_status;
	}

	public boolean isBooked_equip_status() {
		return _booked_equip_status;
	}

	public void setBooked_equip_status(boolean booked_equip_status) {
		_booked_equip_status = booked_equip_status;
	}

	public String getBooked_equip_date() {
		return _booked_equip_date;
	}

	public void setBooked_equip_date(String booked_equip_date) {
		_booked_equip_date = booked_equip_date;
	}

	private long _booked_equip_id;
	private long _equip_id;
	private long _course_id;
	private int _equip_quantity;
	private boolean _booked_equip_status;
	private String _booked_equip_date;
}
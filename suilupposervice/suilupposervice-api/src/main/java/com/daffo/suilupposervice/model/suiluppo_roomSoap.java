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
public class suiluppo_roomSoap implements Serializable {
	public static suiluppo_roomSoap toSoapModel(suiluppo_room model) {
		suiluppo_roomSoap soapModel = new suiluppo_roomSoap();

		soapModel.setRoomID(model.getRoomID());
		soapModel.setRoom_name(model.getRoom_name());
		soapModel.setRoom_description(model.getRoom_description());

		return soapModel;
	}

	public static suiluppo_roomSoap[] toSoapModels(suiluppo_room[] models) {
		suiluppo_roomSoap[] soapModels = new suiluppo_roomSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_roomSoap[][] toSoapModels(suiluppo_room[][] models) {
		suiluppo_roomSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new suiluppo_roomSoap[models.length][models[0].length];
		}
		else {
			soapModels = new suiluppo_roomSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_roomSoap[] toSoapModels(List<suiluppo_room> models) {
		List<suiluppo_roomSoap> soapModels = new ArrayList<suiluppo_roomSoap>(models.size());

		for (suiluppo_room model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new suiluppo_roomSoap[soapModels.size()]);
	}

	public suiluppo_roomSoap() {
	}

	public long getPrimaryKey() {
		return _roomID;
	}

	public void setPrimaryKey(long pk) {
		setRoomID(pk);
	}

	public long getRoomID() {
		return _roomID;
	}

	public void setRoomID(long roomID) {
		_roomID = roomID;
	}

	public String getRoom_name() {
		return _room_name;
	}

	public void setRoom_name(String room_name) {
		_room_name = room_name;
	}

	public String getRoom_description() {
		return _room_description;
	}

	public void setRoom_description(String room_description) {
		_room_description = room_description;
	}

	private long _roomID;
	private String _room_name;
	private String _room_description;
}
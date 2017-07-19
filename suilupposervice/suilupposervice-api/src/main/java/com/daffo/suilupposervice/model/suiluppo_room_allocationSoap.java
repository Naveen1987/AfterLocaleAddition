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
public class suiluppo_room_allocationSoap implements Serializable {
	public static suiluppo_room_allocationSoap toSoapModel(
		suiluppo_room_allocation model) {
		suiluppo_room_allocationSoap soapModel = new suiluppo_room_allocationSoap();

		soapModel.setRoom_allocat_id(model.getRoom_allocat_id());
		soapModel.setRoomID(model.getRoomID());
		soapModel.setCourse_id(model.getCourse_id());
		soapModel.setRoom_allocat_date(model.getRoom_allocat_date());
		soapModel.setRoom_allocat_startTime(model.getRoom_allocat_startTime());
		soapModel.setRoom_allocat_start(model.getRoom_allocat_start());
		soapModel.setRoom_allocat_end(model.getRoom_allocat_end());
		soapModel.setRoom_allocat_status(model.getRoom_allocat_status());
		soapModel.setRoom_allocat_endTime(model.getRoom_allocat_endTime());

		return soapModel;
	}

	public static suiluppo_room_allocationSoap[] toSoapModels(
		suiluppo_room_allocation[] models) {
		suiluppo_room_allocationSoap[] soapModels = new suiluppo_room_allocationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_room_allocationSoap[][] toSoapModels(
		suiluppo_room_allocation[][] models) {
		suiluppo_room_allocationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new suiluppo_room_allocationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new suiluppo_room_allocationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_room_allocationSoap[] toSoapModels(
		List<suiluppo_room_allocation> models) {
		List<suiluppo_room_allocationSoap> soapModels = new ArrayList<suiluppo_room_allocationSoap>(models.size());

		for (suiluppo_room_allocation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new suiluppo_room_allocationSoap[soapModels.size()]);
	}

	public suiluppo_room_allocationSoap() {
	}

	public long getPrimaryKey() {
		return _room_allocat_id;
	}

	public void setPrimaryKey(long pk) {
		setRoom_allocat_id(pk);
	}

	public long getRoom_allocat_id() {
		return _room_allocat_id;
	}

	public void setRoom_allocat_id(long room_allocat_id) {
		_room_allocat_id = room_allocat_id;
	}

	public long getRoomID() {
		return _roomID;
	}

	public void setRoomID(long roomID) {
		_roomID = roomID;
	}

	public long getCourse_id() {
		return _course_id;
	}

	public void setCourse_id(long course_id) {
		_course_id = course_id;
	}

	public String getRoom_allocat_date() {
		return _room_allocat_date;
	}

	public void setRoom_allocat_date(String room_allocat_date) {
		_room_allocat_date = room_allocat_date;
	}

	public String getRoom_allocat_startTime() {
		return _room_allocat_startTime;
	}

	public void setRoom_allocat_startTime(String room_allocat_startTime) {
		_room_allocat_startTime = room_allocat_startTime;
	}

	public String getRoom_allocat_start() {
		return _room_allocat_start;
	}

	public void setRoom_allocat_start(String room_allocat_start) {
		_room_allocat_start = room_allocat_start;
	}

	public String getRoom_allocat_end() {
		return _room_allocat_end;
	}

	public void setRoom_allocat_end(String room_allocat_end) {
		_room_allocat_end = room_allocat_end;
	}

	public String getRoom_allocat_status() {
		return _room_allocat_status;
	}

	public void setRoom_allocat_status(String room_allocat_status) {
		_room_allocat_status = room_allocat_status;
	}

	public String getRoom_allocat_endTime() {
		return _room_allocat_endTime;
	}

	public void setRoom_allocat_endTime(String room_allocat_endTime) {
		_room_allocat_endTime = room_allocat_endTime;
	}

	private long _room_allocat_id;
	private long _roomID;
	private long _course_id;
	private String _room_allocat_date;
	private String _room_allocat_startTime;
	private String _room_allocat_start;
	private String _room_allocat_end;
	private String _room_allocat_status;
	private String _room_allocat_endTime;
}
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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link suiluppo_room_allocation}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_room_allocation
 * @generated
 */
@ProviderType
public class suiluppo_room_allocationWrapper implements suiluppo_room_allocation,
	ModelWrapper<suiluppo_room_allocation> {
	public suiluppo_room_allocationWrapper(
		suiluppo_room_allocation suiluppo_room_allocation) {
		_suiluppo_room_allocation = suiluppo_room_allocation;
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_room_allocation.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_room_allocation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("room_allocat_id", getRoom_allocat_id());
		attributes.put("roomID", getRoomID());
		attributes.put("course_id", getCourse_id());
		attributes.put("room_allocat_date", getRoom_allocat_date());
		attributes.put("room_allocat_startTime", getRoom_allocat_startTime());
		attributes.put("room_allocat_start", getRoom_allocat_start());
		attributes.put("room_allocat_end", getRoom_allocat_end());
		attributes.put("room_allocat_status", getRoom_allocat_status());
		attributes.put("room_allocat_endTime", getRoom_allocat_endTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long room_allocat_id = (Long)attributes.get("room_allocat_id");

		if (room_allocat_id != null) {
			setRoom_allocat_id(room_allocat_id);
		}

		Long roomID = (Long)attributes.get("roomID");

		if (roomID != null) {
			setRoomID(roomID);
		}

		Long course_id = (Long)attributes.get("course_id");

		if (course_id != null) {
			setCourse_id(course_id);
		}

		String room_allocat_date = (String)attributes.get("room_allocat_date");

		if (room_allocat_date != null) {
			setRoom_allocat_date(room_allocat_date);
		}

		String room_allocat_startTime = (String)attributes.get(
				"room_allocat_startTime");

		if (room_allocat_startTime != null) {
			setRoom_allocat_startTime(room_allocat_startTime);
		}

		String room_allocat_start = (String)attributes.get("room_allocat_start");

		if (room_allocat_start != null) {
			setRoom_allocat_start(room_allocat_start);
		}

		String room_allocat_end = (String)attributes.get("room_allocat_end");

		if (room_allocat_end != null) {
			setRoom_allocat_end(room_allocat_end);
		}

		String room_allocat_status = (String)attributes.get(
				"room_allocat_status");

		if (room_allocat_status != null) {
			setRoom_allocat_status(room_allocat_status);
		}

		String room_allocat_endTime = (String)attributes.get(
				"room_allocat_endTime");

		if (room_allocat_endTime != null) {
			setRoom_allocat_endTime(room_allocat_endTime);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _suiluppo_room_allocation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _suiluppo_room_allocation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _suiluppo_room_allocation.isNew();
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation toEscapedModel() {
		return new suiluppo_room_allocationWrapper(_suiluppo_room_allocation.toEscapedModel());
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation toUnescapedModel() {
		return new suiluppo_room_allocationWrapper(_suiluppo_room_allocation.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _suiluppo_room_allocation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.suilupposervice.model.suiluppo_room_allocation> toCacheModel() {
		return _suiluppo_room_allocation.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.suilupposervice.model.suiluppo_room_allocation suiluppo_room_allocation) {
		return _suiluppo_room_allocation.compareTo(suiluppo_room_allocation);
	}

	@Override
	public int hashCode() {
		return _suiluppo_room_allocation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _suiluppo_room_allocation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new suiluppo_room_allocationWrapper((suiluppo_room_allocation)_suiluppo_room_allocation.clone());
	}

	/**
	* Returns the room_allocat_date of this suiluppo_room_allocation.
	*
	* @return the room_allocat_date of this suiluppo_room_allocation
	*/
	@Override
	public java.lang.String getRoom_allocat_date() {
		return _suiluppo_room_allocation.getRoom_allocat_date();
	}

	/**
	* Returns the room_allocat_end of this suiluppo_room_allocation.
	*
	* @return the room_allocat_end of this suiluppo_room_allocation
	*/
	@Override
	public java.lang.String getRoom_allocat_end() {
		return _suiluppo_room_allocation.getRoom_allocat_end();
	}

	/**
	* Returns the room_allocat_end time of this suiluppo_room_allocation.
	*
	* @return the room_allocat_end time of this suiluppo_room_allocation
	*/
	@Override
	public java.lang.String getRoom_allocat_endTime() {
		return _suiluppo_room_allocation.getRoom_allocat_endTime();
	}

	/**
	* Returns the room_allocat_start of this suiluppo_room_allocation.
	*
	* @return the room_allocat_start of this suiluppo_room_allocation
	*/
	@Override
	public java.lang.String getRoom_allocat_start() {
		return _suiluppo_room_allocation.getRoom_allocat_start();
	}

	/**
	* Returns the room_allocat_start time of this suiluppo_room_allocation.
	*
	* @return the room_allocat_start time of this suiluppo_room_allocation
	*/
	@Override
	public java.lang.String getRoom_allocat_startTime() {
		return _suiluppo_room_allocation.getRoom_allocat_startTime();
	}

	/**
	* Returns the room_allocat_status of this suiluppo_room_allocation.
	*
	* @return the room_allocat_status of this suiluppo_room_allocation
	*/
	@Override
	public java.lang.String getRoom_allocat_status() {
		return _suiluppo_room_allocation.getRoom_allocat_status();
	}

	@Override
	public java.lang.String toString() {
		return _suiluppo_room_allocation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suiluppo_room_allocation.toXmlString();
	}

	/**
	* Returns the course_id of this suiluppo_room_allocation.
	*
	* @return the course_id of this suiluppo_room_allocation
	*/
	@Override
	public long getCourse_id() {
		return _suiluppo_room_allocation.getCourse_id();
	}

	/**
	* Returns the primary key of this suiluppo_room_allocation.
	*
	* @return the primary key of this suiluppo_room_allocation
	*/
	@Override
	public long getPrimaryKey() {
		return _suiluppo_room_allocation.getPrimaryKey();
	}

	/**
	* Returns the room ID of this suiluppo_room_allocation.
	*
	* @return the room ID of this suiluppo_room_allocation
	*/
	@Override
	public long getRoomID() {
		return _suiluppo_room_allocation.getRoomID();
	}

	/**
	* Returns the room_allocat_id of this suiluppo_room_allocation.
	*
	* @return the room_allocat_id of this suiluppo_room_allocation
	*/
	@Override
	public long getRoom_allocat_id() {
		return _suiluppo_room_allocation.getRoom_allocat_id();
	}

	@Override
	public void persist() {
		_suiluppo_room_allocation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suiluppo_room_allocation.setCachedModel(cachedModel);
	}

	/**
	* Sets the course_id of this suiluppo_room_allocation.
	*
	* @param course_id the course_id of this suiluppo_room_allocation
	*/
	@Override
	public void setCourse_id(long course_id) {
		_suiluppo_room_allocation.setCourse_id(course_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_suiluppo_room_allocation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_suiluppo_room_allocation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_suiluppo_room_allocation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_suiluppo_room_allocation.setNew(n);
	}

	/**
	* Sets the primary key of this suiluppo_room_allocation.
	*
	* @param primaryKey the primary key of this suiluppo_room_allocation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suiluppo_room_allocation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_suiluppo_room_allocation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the room ID of this suiluppo_room_allocation.
	*
	* @param roomID the room ID of this suiluppo_room_allocation
	*/
	@Override
	public void setRoomID(long roomID) {
		_suiluppo_room_allocation.setRoomID(roomID);
	}

	/**
	* Sets the room_allocat_date of this suiluppo_room_allocation.
	*
	* @param room_allocat_date the room_allocat_date of this suiluppo_room_allocation
	*/
	@Override
	public void setRoom_allocat_date(java.lang.String room_allocat_date) {
		_suiluppo_room_allocation.setRoom_allocat_date(room_allocat_date);
	}

	/**
	* Sets the room_allocat_end of this suiluppo_room_allocation.
	*
	* @param room_allocat_end the room_allocat_end of this suiluppo_room_allocation
	*/
	@Override
	public void setRoom_allocat_end(java.lang.String room_allocat_end) {
		_suiluppo_room_allocation.setRoom_allocat_end(room_allocat_end);
	}

	/**
	* Sets the room_allocat_end time of this suiluppo_room_allocation.
	*
	* @param room_allocat_endTime the room_allocat_end time of this suiluppo_room_allocation
	*/
	@Override
	public void setRoom_allocat_endTime(java.lang.String room_allocat_endTime) {
		_suiluppo_room_allocation.setRoom_allocat_endTime(room_allocat_endTime);
	}

	/**
	* Sets the room_allocat_id of this suiluppo_room_allocation.
	*
	* @param room_allocat_id the room_allocat_id of this suiluppo_room_allocation
	*/
	@Override
	public void setRoom_allocat_id(long room_allocat_id) {
		_suiluppo_room_allocation.setRoom_allocat_id(room_allocat_id);
	}

	/**
	* Sets the room_allocat_start of this suiluppo_room_allocation.
	*
	* @param room_allocat_start the room_allocat_start of this suiluppo_room_allocation
	*/
	@Override
	public void setRoom_allocat_start(java.lang.String room_allocat_start) {
		_suiluppo_room_allocation.setRoom_allocat_start(room_allocat_start);
	}

	/**
	* Sets the room_allocat_start time of this suiluppo_room_allocation.
	*
	* @param room_allocat_startTime the room_allocat_start time of this suiluppo_room_allocation
	*/
	@Override
	public void setRoom_allocat_startTime(
		java.lang.String room_allocat_startTime) {
		_suiluppo_room_allocation.setRoom_allocat_startTime(room_allocat_startTime);
	}

	/**
	* Sets the room_allocat_status of this suiluppo_room_allocation.
	*
	* @param room_allocat_status the room_allocat_status of this suiluppo_room_allocation
	*/
	@Override
	public void setRoom_allocat_status(java.lang.String room_allocat_status) {
		_suiluppo_room_allocation.setRoom_allocat_status(room_allocat_status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_room_allocationWrapper)) {
			return false;
		}

		suiluppo_room_allocationWrapper suiluppo_room_allocationWrapper = (suiluppo_room_allocationWrapper)obj;

		if (Objects.equals(_suiluppo_room_allocation,
					suiluppo_room_allocationWrapper._suiluppo_room_allocation)) {
			return true;
		}

		return false;
	}

	@Override
	public suiluppo_room_allocation getWrappedModel() {
		return _suiluppo_room_allocation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _suiluppo_room_allocation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _suiluppo_room_allocation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_suiluppo_room_allocation.resetOriginalValues();
	}

	private final suiluppo_room_allocation _suiluppo_room_allocation;
}
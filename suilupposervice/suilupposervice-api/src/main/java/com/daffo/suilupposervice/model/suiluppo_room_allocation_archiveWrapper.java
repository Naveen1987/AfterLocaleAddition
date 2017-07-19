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
 * This class is a wrapper for {@link suiluppo_room_allocation_archive}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_room_allocation_archive
 * @generated
 */
@ProviderType
public class suiluppo_room_allocation_archiveWrapper
	implements suiluppo_room_allocation_archive,
		ModelWrapper<suiluppo_room_allocation_archive> {
	public suiluppo_room_allocation_archiveWrapper(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		_suiluppo_room_allocation_archive = suiluppo_room_allocation_archive;
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_room_allocation_archive.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_room_allocation_archive.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("room_allocat_archive_id", getRoom_allocat_archive_id());
		attributes.put("roomID", getRoomID());
		attributes.put("course_id", getCourse_id());
		attributes.put("room_allocat_date", getRoom_allocat_date());
		attributes.put("room_allocat_startTime", getRoom_allocat_startTime());
		attributes.put("room_allocat_start", getRoom_allocat_start());
		attributes.put("room_allocat_end", getRoom_allocat_end());
		attributes.put("room_allocat_status", getRoom_allocat_status());
		attributes.put("room_allocat_endTime", getRoom_allocat_endTime());
		attributes.put("room_archive_date", getRoom_archive_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long room_allocat_archive_id = (Long)attributes.get(
				"room_allocat_archive_id");

		if (room_allocat_archive_id != null) {
			setRoom_allocat_archive_id(room_allocat_archive_id);
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

		String room_archive_date = (String)attributes.get("room_archive_date");

		if (room_archive_date != null) {
			setRoom_archive_date(room_archive_date);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _suiluppo_room_allocation_archive.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _suiluppo_room_allocation_archive.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _suiluppo_room_allocation_archive.isNew();
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation_archive toEscapedModel() {
		return new suiluppo_room_allocation_archiveWrapper(_suiluppo_room_allocation_archive.toEscapedModel());
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation_archive toUnescapedModel() {
		return new suiluppo_room_allocation_archiveWrapper(_suiluppo_room_allocation_archive.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _suiluppo_room_allocation_archive.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.suilupposervice.model.suiluppo_room_allocation_archive> toCacheModel() {
		return _suiluppo_room_allocation_archive.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.suilupposervice.model.suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		return _suiluppo_room_allocation_archive.compareTo(suiluppo_room_allocation_archive);
	}

	@Override
	public int hashCode() {
		return _suiluppo_room_allocation_archive.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _suiluppo_room_allocation_archive.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new suiluppo_room_allocation_archiveWrapper((suiluppo_room_allocation_archive)_suiluppo_room_allocation_archive.clone());
	}

	/**
	* Returns the room_allocat_date of this suiluppo_room_allocation_archive.
	*
	* @return the room_allocat_date of this suiluppo_room_allocation_archive
	*/
	@Override
	public java.lang.String getRoom_allocat_date() {
		return _suiluppo_room_allocation_archive.getRoom_allocat_date();
	}

	/**
	* Returns the room_allocat_end of this suiluppo_room_allocation_archive.
	*
	* @return the room_allocat_end of this suiluppo_room_allocation_archive
	*/
	@Override
	public java.lang.String getRoom_allocat_end() {
		return _suiluppo_room_allocation_archive.getRoom_allocat_end();
	}

	/**
	* Returns the room_allocat_end time of this suiluppo_room_allocation_archive.
	*
	* @return the room_allocat_end time of this suiluppo_room_allocation_archive
	*/
	@Override
	public java.lang.String getRoom_allocat_endTime() {
		return _suiluppo_room_allocation_archive.getRoom_allocat_endTime();
	}

	/**
	* Returns the room_allocat_start of this suiluppo_room_allocation_archive.
	*
	* @return the room_allocat_start of this suiluppo_room_allocation_archive
	*/
	@Override
	public java.lang.String getRoom_allocat_start() {
		return _suiluppo_room_allocation_archive.getRoom_allocat_start();
	}

	/**
	* Returns the room_allocat_start time of this suiluppo_room_allocation_archive.
	*
	* @return the room_allocat_start time of this suiluppo_room_allocation_archive
	*/
	@Override
	public java.lang.String getRoom_allocat_startTime() {
		return _suiluppo_room_allocation_archive.getRoom_allocat_startTime();
	}

	/**
	* Returns the room_allocat_status of this suiluppo_room_allocation_archive.
	*
	* @return the room_allocat_status of this suiluppo_room_allocation_archive
	*/
	@Override
	public java.lang.String getRoom_allocat_status() {
		return _suiluppo_room_allocation_archive.getRoom_allocat_status();
	}

	/**
	* Returns the room_archive_date of this suiluppo_room_allocation_archive.
	*
	* @return the room_archive_date of this suiluppo_room_allocation_archive
	*/
	@Override
	public java.lang.String getRoom_archive_date() {
		return _suiluppo_room_allocation_archive.getRoom_archive_date();
	}

	@Override
	public java.lang.String toString() {
		return _suiluppo_room_allocation_archive.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suiluppo_room_allocation_archive.toXmlString();
	}

	/**
	* Returns the course_id of this suiluppo_room_allocation_archive.
	*
	* @return the course_id of this suiluppo_room_allocation_archive
	*/
	@Override
	public long getCourse_id() {
		return _suiluppo_room_allocation_archive.getCourse_id();
	}

	/**
	* Returns the primary key of this suiluppo_room_allocation_archive.
	*
	* @return the primary key of this suiluppo_room_allocation_archive
	*/
	@Override
	public long getPrimaryKey() {
		return _suiluppo_room_allocation_archive.getPrimaryKey();
	}

	/**
	* Returns the room ID of this suiluppo_room_allocation_archive.
	*
	* @return the room ID of this suiluppo_room_allocation_archive
	*/
	@Override
	public long getRoomID() {
		return _suiluppo_room_allocation_archive.getRoomID();
	}

	/**
	* Returns the room_allocat_archive_id of this suiluppo_room_allocation_archive.
	*
	* @return the room_allocat_archive_id of this suiluppo_room_allocation_archive
	*/
	@Override
	public long getRoom_allocat_archive_id() {
		return _suiluppo_room_allocation_archive.getRoom_allocat_archive_id();
	}

	@Override
	public void persist() {
		_suiluppo_room_allocation_archive.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suiluppo_room_allocation_archive.setCachedModel(cachedModel);
	}

	/**
	* Sets the course_id of this suiluppo_room_allocation_archive.
	*
	* @param course_id the course_id of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setCourse_id(long course_id) {
		_suiluppo_room_allocation_archive.setCourse_id(course_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_suiluppo_room_allocation_archive.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_suiluppo_room_allocation_archive.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_suiluppo_room_allocation_archive.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_suiluppo_room_allocation_archive.setNew(n);
	}

	/**
	* Sets the primary key of this suiluppo_room_allocation_archive.
	*
	* @param primaryKey the primary key of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suiluppo_room_allocation_archive.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_suiluppo_room_allocation_archive.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the room ID of this suiluppo_room_allocation_archive.
	*
	* @param roomID the room ID of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoomID(long roomID) {
		_suiluppo_room_allocation_archive.setRoomID(roomID);
	}

	/**
	* Sets the room_allocat_archive_id of this suiluppo_room_allocation_archive.
	*
	* @param room_allocat_archive_id the room_allocat_archive_id of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoom_allocat_archive_id(long room_allocat_archive_id) {
		_suiluppo_room_allocation_archive.setRoom_allocat_archive_id(room_allocat_archive_id);
	}

	/**
	* Sets the room_allocat_date of this suiluppo_room_allocation_archive.
	*
	* @param room_allocat_date the room_allocat_date of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoom_allocat_date(java.lang.String room_allocat_date) {
		_suiluppo_room_allocation_archive.setRoom_allocat_date(room_allocat_date);
	}

	/**
	* Sets the room_allocat_end of this suiluppo_room_allocation_archive.
	*
	* @param room_allocat_end the room_allocat_end of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoom_allocat_end(java.lang.String room_allocat_end) {
		_suiluppo_room_allocation_archive.setRoom_allocat_end(room_allocat_end);
	}

	/**
	* Sets the room_allocat_end time of this suiluppo_room_allocation_archive.
	*
	* @param room_allocat_endTime the room_allocat_end time of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoom_allocat_endTime(java.lang.String room_allocat_endTime) {
		_suiluppo_room_allocation_archive.setRoom_allocat_endTime(room_allocat_endTime);
	}

	/**
	* Sets the room_allocat_start of this suiluppo_room_allocation_archive.
	*
	* @param room_allocat_start the room_allocat_start of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoom_allocat_start(java.lang.String room_allocat_start) {
		_suiluppo_room_allocation_archive.setRoom_allocat_start(room_allocat_start);
	}

	/**
	* Sets the room_allocat_start time of this suiluppo_room_allocation_archive.
	*
	* @param room_allocat_startTime the room_allocat_start time of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoom_allocat_startTime(
		java.lang.String room_allocat_startTime) {
		_suiluppo_room_allocation_archive.setRoom_allocat_startTime(room_allocat_startTime);
	}

	/**
	* Sets the room_allocat_status of this suiluppo_room_allocation_archive.
	*
	* @param room_allocat_status the room_allocat_status of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoom_allocat_status(java.lang.String room_allocat_status) {
		_suiluppo_room_allocation_archive.setRoom_allocat_status(room_allocat_status);
	}

	/**
	* Sets the room_archive_date of this suiluppo_room_allocation_archive.
	*
	* @param room_archive_date the room_archive_date of this suiluppo_room_allocation_archive
	*/
	@Override
	public void setRoom_archive_date(java.lang.String room_archive_date) {
		_suiluppo_room_allocation_archive.setRoom_archive_date(room_archive_date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_room_allocation_archiveWrapper)) {
			return false;
		}

		suiluppo_room_allocation_archiveWrapper suiluppo_room_allocation_archiveWrapper =
			(suiluppo_room_allocation_archiveWrapper)obj;

		if (Objects.equals(_suiluppo_room_allocation_archive,
					suiluppo_room_allocation_archiveWrapper._suiluppo_room_allocation_archive)) {
			return true;
		}

		return false;
	}

	@Override
	public suiluppo_room_allocation_archive getWrappedModel() {
		return _suiluppo_room_allocation_archive;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _suiluppo_room_allocation_archive.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _suiluppo_room_allocation_archive.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_suiluppo_room_allocation_archive.resetOriginalValues();
	}

	private final suiluppo_room_allocation_archive _suiluppo_room_allocation_archive;
}
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
 * This class is a wrapper for {@link suiluppo_room}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_room
 * @generated
 */
@ProviderType
public class suiluppo_roomWrapper implements suiluppo_room,
	ModelWrapper<suiluppo_room> {
	public suiluppo_roomWrapper(suiluppo_room suiluppo_room) {
		_suiluppo_room = suiluppo_room;
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_room.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_room.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("roomID", getRoomID());
		attributes.put("room_name", getRoom_name());
		attributes.put("room_description", getRoom_description());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long roomID = (Long)attributes.get("roomID");

		if (roomID != null) {
			setRoomID(roomID);
		}

		String room_name = (String)attributes.get("room_name");

		if (room_name != null) {
			setRoom_name(room_name);
		}

		String room_description = (String)attributes.get("room_description");

		if (room_description != null) {
			setRoom_description(room_description);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _suiluppo_room.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _suiluppo_room.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _suiluppo_room.isNew();
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room toEscapedModel() {
		return new suiluppo_roomWrapper(_suiluppo_room.toEscapedModel());
	}

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room toUnescapedModel() {
		return new suiluppo_roomWrapper(_suiluppo_room.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _suiluppo_room.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.suilupposervice.model.suiluppo_room> toCacheModel() {
		return _suiluppo_room.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.suilupposervice.model.suiluppo_room suiluppo_room) {
		return _suiluppo_room.compareTo(suiluppo_room);
	}

	@Override
	public int hashCode() {
		return _suiluppo_room.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _suiluppo_room.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new suiluppo_roomWrapper((suiluppo_room)_suiluppo_room.clone());
	}

	/**
	* Returns the room_description of this suiluppo_room.
	*
	* @return the room_description of this suiluppo_room
	*/
	@Override
	public java.lang.String getRoom_description() {
		return _suiluppo_room.getRoom_description();
	}

	/**
	* Returns the room_name of this suiluppo_room.
	*
	* @return the room_name of this suiluppo_room
	*/
	@Override
	public java.lang.String getRoom_name() {
		return _suiluppo_room.getRoom_name();
	}

	@Override
	public java.lang.String toString() {
		return _suiluppo_room.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suiluppo_room.toXmlString();
	}

	/**
	* Returns the primary key of this suiluppo_room.
	*
	* @return the primary key of this suiluppo_room
	*/
	@Override
	public long getPrimaryKey() {
		return _suiluppo_room.getPrimaryKey();
	}

	/**
	* Returns the room ID of this suiluppo_room.
	*
	* @return the room ID of this suiluppo_room
	*/
	@Override
	public long getRoomID() {
		return _suiluppo_room.getRoomID();
	}

	@Override
	public void persist() {
		_suiluppo_room.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suiluppo_room.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_suiluppo_room.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_suiluppo_room.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_suiluppo_room.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_suiluppo_room.setNew(n);
	}

	/**
	* Sets the primary key of this suiluppo_room.
	*
	* @param primaryKey the primary key of this suiluppo_room
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suiluppo_room.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_suiluppo_room.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the room ID of this suiluppo_room.
	*
	* @param roomID the room ID of this suiluppo_room
	*/
	@Override
	public void setRoomID(long roomID) {
		_suiluppo_room.setRoomID(roomID);
	}

	/**
	* Sets the room_description of this suiluppo_room.
	*
	* @param room_description the room_description of this suiluppo_room
	*/
	@Override
	public void setRoom_description(java.lang.String room_description) {
		_suiluppo_room.setRoom_description(room_description);
	}

	/**
	* Sets the room_name of this suiluppo_room.
	*
	* @param room_name the room_name of this suiluppo_room
	*/
	@Override
	public void setRoom_name(java.lang.String room_name) {
		_suiluppo_room.setRoom_name(room_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_roomWrapper)) {
			return false;
		}

		suiluppo_roomWrapper suiluppo_roomWrapper = (suiluppo_roomWrapper)obj;

		if (Objects.equals(_suiluppo_room, suiluppo_roomWrapper._suiluppo_room)) {
			return true;
		}

		return false;
	}

	@Override
	public suiluppo_room getWrappedModel() {
		return _suiluppo_room;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _suiluppo_room.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _suiluppo_room.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_suiluppo_room.resetOriginalValues();
	}

	private final suiluppo_room _suiluppo_room;
}
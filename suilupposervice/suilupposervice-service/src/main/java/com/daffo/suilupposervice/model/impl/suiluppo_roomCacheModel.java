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

import com.daffo.suilupposervice.model.suiluppo_room;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing suiluppo_room in entity cache.
 *
 * @author Naveen
 * @see suiluppo_room
 * @generated
 */
@ProviderType
public class suiluppo_roomCacheModel implements CacheModel<suiluppo_room>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_roomCacheModel)) {
			return false;
		}

		suiluppo_roomCacheModel suiluppo_roomCacheModel = (suiluppo_roomCacheModel)obj;

		if (roomID == suiluppo_roomCacheModel.roomID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roomID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{roomID=");
		sb.append(roomID);
		sb.append(", room_name=");
		sb.append(room_name);
		sb.append(", room_description=");
		sb.append(room_description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public suiluppo_room toEntityModel() {
		suiluppo_roomImpl suiluppo_roomImpl = new suiluppo_roomImpl();

		suiluppo_roomImpl.setRoomID(roomID);

		if (room_name == null) {
			suiluppo_roomImpl.setRoom_name(StringPool.BLANK);
		}
		else {
			suiluppo_roomImpl.setRoom_name(room_name);
		}

		if (room_description == null) {
			suiluppo_roomImpl.setRoom_description(StringPool.BLANK);
		}
		else {
			suiluppo_roomImpl.setRoom_description(room_description);
		}

		suiluppo_roomImpl.resetOriginalValues();

		return suiluppo_roomImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		roomID = objectInput.readLong();
		room_name = objectInput.readUTF();
		room_description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(roomID);

		if (room_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_name);
		}

		if (room_description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_description);
		}
	}

	public long roomID;
	public String room_name;
	public String room_description;
}
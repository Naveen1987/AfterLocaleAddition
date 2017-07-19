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

import com.daffo.suilupposervice.model.suiluppo_room_allocation;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing suiluppo_room_allocation in entity cache.
 *
 * @author Naveen
 * @see suiluppo_room_allocation
 * @generated
 */
@ProviderType
public class suiluppo_room_allocationCacheModel implements CacheModel<suiluppo_room_allocation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_room_allocationCacheModel)) {
			return false;
		}

		suiluppo_room_allocationCacheModel suiluppo_room_allocationCacheModel = (suiluppo_room_allocationCacheModel)obj;

		if (room_allocat_id == suiluppo_room_allocationCacheModel.room_allocat_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, room_allocat_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{room_allocat_id=");
		sb.append(room_allocat_id);
		sb.append(", roomID=");
		sb.append(roomID);
		sb.append(", course_id=");
		sb.append(course_id);
		sb.append(", room_allocat_date=");
		sb.append(room_allocat_date);
		sb.append(", room_allocat_startTime=");
		sb.append(room_allocat_startTime);
		sb.append(", room_allocat_start=");
		sb.append(room_allocat_start);
		sb.append(", room_allocat_end=");
		sb.append(room_allocat_end);
		sb.append(", room_allocat_status=");
		sb.append(room_allocat_status);
		sb.append(", room_allocat_endTime=");
		sb.append(room_allocat_endTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public suiluppo_room_allocation toEntityModel() {
		suiluppo_room_allocationImpl suiluppo_room_allocationImpl = new suiluppo_room_allocationImpl();

		suiluppo_room_allocationImpl.setRoom_allocat_id(room_allocat_id);
		suiluppo_room_allocationImpl.setRoomID(roomID);
		suiluppo_room_allocationImpl.setCourse_id(course_id);

		if (room_allocat_date == null) {
			suiluppo_room_allocationImpl.setRoom_allocat_date(StringPool.BLANK);
		}
		else {
			suiluppo_room_allocationImpl.setRoom_allocat_date(room_allocat_date);
		}

		if (room_allocat_startTime == null) {
			suiluppo_room_allocationImpl.setRoom_allocat_startTime(StringPool.BLANK);
		}
		else {
			suiluppo_room_allocationImpl.setRoom_allocat_startTime(room_allocat_startTime);
		}

		if (room_allocat_start == null) {
			suiluppo_room_allocationImpl.setRoom_allocat_start(StringPool.BLANK);
		}
		else {
			suiluppo_room_allocationImpl.setRoom_allocat_start(room_allocat_start);
		}

		if (room_allocat_end == null) {
			suiluppo_room_allocationImpl.setRoom_allocat_end(StringPool.BLANK);
		}
		else {
			suiluppo_room_allocationImpl.setRoom_allocat_end(room_allocat_end);
		}

		if (room_allocat_status == null) {
			suiluppo_room_allocationImpl.setRoom_allocat_status(StringPool.BLANK);
		}
		else {
			suiluppo_room_allocationImpl.setRoom_allocat_status(room_allocat_status);
		}

		if (room_allocat_endTime == null) {
			suiluppo_room_allocationImpl.setRoom_allocat_endTime(StringPool.BLANK);
		}
		else {
			suiluppo_room_allocationImpl.setRoom_allocat_endTime(room_allocat_endTime);
		}

		suiluppo_room_allocationImpl.resetOriginalValues();

		return suiluppo_room_allocationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		room_allocat_id = objectInput.readLong();

		roomID = objectInput.readLong();

		course_id = objectInput.readLong();
		room_allocat_date = objectInput.readUTF();
		room_allocat_startTime = objectInput.readUTF();
		room_allocat_start = objectInput.readUTF();
		room_allocat_end = objectInput.readUTF();
		room_allocat_status = objectInput.readUTF();
		room_allocat_endTime = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(room_allocat_id);

		objectOutput.writeLong(roomID);

		objectOutput.writeLong(course_id);

		if (room_allocat_date == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_allocat_date);
		}

		if (room_allocat_startTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_allocat_startTime);
		}

		if (room_allocat_start == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_allocat_start);
		}

		if (room_allocat_end == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_allocat_end);
		}

		if (room_allocat_status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_allocat_status);
		}

		if (room_allocat_endTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_allocat_endTime);
		}
	}

	public long room_allocat_id;
	public long roomID;
	public long course_id;
	public String room_allocat_date;
	public String room_allocat_startTime;
	public String room_allocat_start;
	public String room_allocat_end;
	public String room_allocat_status;
	public String room_allocat_endTime;
}
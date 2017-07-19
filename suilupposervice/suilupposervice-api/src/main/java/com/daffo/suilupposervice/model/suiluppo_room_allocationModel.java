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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the suiluppo_room_allocation service. Represents a row in the &quot;suiluppo_room_allocation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.daffo.suilupposervice.model.impl.suiluppo_room_allocationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.daffo.suilupposervice.model.impl.suiluppo_room_allocationImpl}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_room_allocation
 * @see com.daffo.suilupposervice.model.impl.suiluppo_room_allocationImpl
 * @see com.daffo.suilupposervice.model.impl.suiluppo_room_allocationModelImpl
 * @generated
 */
@ProviderType
public interface suiluppo_room_allocationModel extends BaseModel<suiluppo_room_allocation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a suiluppo_room_allocation model instance should use the {@link suiluppo_room_allocation} interface instead.
	 */

	/**
	 * Returns the primary key of this suiluppo_room_allocation.
	 *
	 * @return the primary key of this suiluppo_room_allocation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this suiluppo_room_allocation.
	 *
	 * @param primaryKey the primary key of this suiluppo_room_allocation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the room_allocat_id of this suiluppo_room_allocation.
	 *
	 * @return the room_allocat_id of this suiluppo_room_allocation
	 */
	public long getRoom_allocat_id();

	/**
	 * Sets the room_allocat_id of this suiluppo_room_allocation.
	 *
	 * @param room_allocat_id the room_allocat_id of this suiluppo_room_allocation
	 */
	public void setRoom_allocat_id(long room_allocat_id);

	/**
	 * Returns the room ID of this suiluppo_room_allocation.
	 *
	 * @return the room ID of this suiluppo_room_allocation
	 */
	public long getRoomID();

	/**
	 * Sets the room ID of this suiluppo_room_allocation.
	 *
	 * @param roomID the room ID of this suiluppo_room_allocation
	 */
	public void setRoomID(long roomID);

	/**
	 * Returns the course_id of this suiluppo_room_allocation.
	 *
	 * @return the course_id of this suiluppo_room_allocation
	 */
	public long getCourse_id();

	/**
	 * Sets the course_id of this suiluppo_room_allocation.
	 *
	 * @param course_id the course_id of this suiluppo_room_allocation
	 */
	public void setCourse_id(long course_id);

	/**
	 * Returns the room_allocat_date of this suiluppo_room_allocation.
	 *
	 * @return the room_allocat_date of this suiluppo_room_allocation
	 */
	@AutoEscape
	public String getRoom_allocat_date();

	/**
	 * Sets the room_allocat_date of this suiluppo_room_allocation.
	 *
	 * @param room_allocat_date the room_allocat_date of this suiluppo_room_allocation
	 */
	public void setRoom_allocat_date(String room_allocat_date);

	/**
	 * Returns the room_allocat_start time of this suiluppo_room_allocation.
	 *
	 * @return the room_allocat_start time of this suiluppo_room_allocation
	 */
	@AutoEscape
	public String getRoom_allocat_startTime();

	/**
	 * Sets the room_allocat_start time of this suiluppo_room_allocation.
	 *
	 * @param room_allocat_startTime the room_allocat_start time of this suiluppo_room_allocation
	 */
	public void setRoom_allocat_startTime(String room_allocat_startTime);

	/**
	 * Returns the room_allocat_start of this suiluppo_room_allocation.
	 *
	 * @return the room_allocat_start of this suiluppo_room_allocation
	 */
	@AutoEscape
	public String getRoom_allocat_start();

	/**
	 * Sets the room_allocat_start of this suiluppo_room_allocation.
	 *
	 * @param room_allocat_start the room_allocat_start of this suiluppo_room_allocation
	 */
	public void setRoom_allocat_start(String room_allocat_start);

	/**
	 * Returns the room_allocat_end of this suiluppo_room_allocation.
	 *
	 * @return the room_allocat_end of this suiluppo_room_allocation
	 */
	@AutoEscape
	public String getRoom_allocat_end();

	/**
	 * Sets the room_allocat_end of this suiluppo_room_allocation.
	 *
	 * @param room_allocat_end the room_allocat_end of this suiluppo_room_allocation
	 */
	public void setRoom_allocat_end(String room_allocat_end);

	/**
	 * Returns the room_allocat_status of this suiluppo_room_allocation.
	 *
	 * @return the room_allocat_status of this suiluppo_room_allocation
	 */
	@AutoEscape
	public String getRoom_allocat_status();

	/**
	 * Sets the room_allocat_status of this suiluppo_room_allocation.
	 *
	 * @param room_allocat_status the room_allocat_status of this suiluppo_room_allocation
	 */
	public void setRoom_allocat_status(String room_allocat_status);

	/**
	 * Returns the room_allocat_end time of this suiluppo_room_allocation.
	 *
	 * @return the room_allocat_end time of this suiluppo_room_allocation
	 */
	@AutoEscape
	public String getRoom_allocat_endTime();

	/**
	 * Sets the room_allocat_end time of this suiluppo_room_allocation.
	 *
	 * @param room_allocat_endTime the room_allocat_end time of this suiluppo_room_allocation
	 */
	public void setRoom_allocat_endTime(String room_allocat_endTime);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.daffo.suilupposervice.model.suiluppo_room_allocation suiluppo_room_allocation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.daffo.suilupposervice.model.suiluppo_room_allocation> toCacheModel();

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation toEscapedModel();

	@Override
	public com.daffo.suilupposervice.model.suiluppo_room_allocation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
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
import com.daffo.suilupposervice.service.suiluppo_room_allocationLocalServiceUtil;

/**
 * The extended model base implementation for the suiluppo_room_allocation service. Represents a row in the &quot;suiluppo_room_allocation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link suiluppo_room_allocationImpl}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_room_allocationImpl
 * @see suiluppo_room_allocation
 * @generated
 */
@ProviderType
public abstract class suiluppo_room_allocationBaseImpl
	extends suiluppo_room_allocationModelImpl
	implements suiluppo_room_allocation {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a suiluppo_room_allocation model instance should use the {@link suiluppo_room_allocation} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			suiluppo_room_allocationLocalServiceUtil.addsuiluppo_room_allocation(this);
		}
		else {
			suiluppo_room_allocationLocalServiceUtil.updatesuiluppo_room_allocation(this);
		}
	}
}
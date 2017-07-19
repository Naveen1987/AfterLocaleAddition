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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the suiluppo_equip_allocation service. Represents a row in the &quot;suiluppo_equip_allocation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Naveen
 * @see suiluppo_equip_allocationModel
 * @see com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationImpl
 * @see com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationModelImpl
 * @generated
 */
@ImplementationClassName("com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationImpl")
@ProviderType
public interface suiluppo_equip_allocation
	extends suiluppo_equip_allocationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<suiluppo_equip_allocation, Long> EQUIP_ALLOCAT_ID_ACCESSOR =
		new Accessor<suiluppo_equip_allocation, Long>() {
			@Override
			public Long get(suiluppo_equip_allocation suiluppo_equip_allocation) {
				return suiluppo_equip_allocation.getEquip_allocat_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<suiluppo_equip_allocation> getTypeClass() {
				return suiluppo_equip_allocation.class;
			}
		};
}
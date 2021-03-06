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
 * The extended model interface for the suiluppo_equipment service. Represents a row in the &quot;suiluppo_equipment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Naveen
 * @see suiluppo_equipmentModel
 * @see com.daffo.suilupposervice.model.impl.suiluppo_equipmentImpl
 * @see com.daffo.suilupposervice.model.impl.suiluppo_equipmentModelImpl
 * @generated
 */
@ImplementationClassName("com.daffo.suilupposervice.model.impl.suiluppo_equipmentImpl")
@ProviderType
public interface suiluppo_equipment extends suiluppo_equipmentModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.daffo.suilupposervice.model.impl.suiluppo_equipmentImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<suiluppo_equipment, Long> EQUIP_ID_ACCESSOR = new Accessor<suiluppo_equipment, Long>() {
			@Override
			public Long get(suiluppo_equipment suiluppo_equipment) {
				return suiluppo_equipment.getEquip_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<suiluppo_equipment> getTypeClass() {
				return suiluppo_equipment.class;
			}
		};
}
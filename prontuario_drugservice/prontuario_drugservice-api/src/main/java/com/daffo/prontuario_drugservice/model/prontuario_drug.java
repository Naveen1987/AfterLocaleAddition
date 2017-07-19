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

package com.daffo.prontuario_drugservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the prontuario_drug service. Represents a row in the &quot;prontuario_drug&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see prontuario_drugModel
 * @see com.daffo.prontuario_drugservice.model.impl.prontuario_drugImpl
 * @see com.daffo.prontuario_drugservice.model.impl.prontuario_drugModelImpl
 * @generated
 */
@ImplementationClassName("com.daffo.prontuario_drugservice.model.impl.prontuario_drugImpl")
@ProviderType
public interface prontuario_drug extends prontuario_drugModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.daffo.prontuario_drugservice.model.impl.prontuario_drugImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<prontuario_drug, Long> DRUG_ID_ACCESSOR = new Accessor<prontuario_drug, Long>() {
			@Override
			public Long get(prontuario_drug prontuario_drug) {
				return prontuario_drug.getDrug_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<prontuario_drug> getTypeClass() {
				return prontuario_drug.class;
			}
		};
}
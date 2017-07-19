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
 * The extended model interface for the suiluppo_application service. Represents a row in the &quot;suiluppo_application&quot; database table, with each column mapped to a property of this class.
 *
 * @author Naveen
 * @see suiluppo_applicationModel
 * @see com.daffo.suilupposervice.model.impl.suiluppo_applicationImpl
 * @see com.daffo.suilupposervice.model.impl.suiluppo_applicationModelImpl
 * @generated
 */
@ImplementationClassName("com.daffo.suilupposervice.model.impl.suiluppo_applicationImpl")
@ProviderType
public interface suiluppo_application extends suiluppo_applicationModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.daffo.suilupposervice.model.impl.suiluppo_applicationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<suiluppo_application, Long> APPLICAT_ID_ACCESSOR =
		new Accessor<suiluppo_application, Long>() {
			@Override
			public Long get(suiluppo_application suiluppo_application) {
				return suiluppo_application.getApplicat_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<suiluppo_application> getTypeClass() {
				return suiluppo_application.class;
			}
		};
}
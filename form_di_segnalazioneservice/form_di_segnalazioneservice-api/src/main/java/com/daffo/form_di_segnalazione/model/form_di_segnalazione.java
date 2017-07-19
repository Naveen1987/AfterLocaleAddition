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

package com.daffo.form_di_segnalazione.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the form_di_segnalazione service. Represents a row in the &quot;form_di_segnalazione&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see form_di_segnalazioneModel
 * @see com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneImpl
 * @see com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneModelImpl
 * @generated
 */
@ImplementationClassName("com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneImpl")
@ProviderType
public interface form_di_segnalazione extends form_di_segnalazioneModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<form_di_segnalazione, Long> FORM_DI_SEGNALAZIONE_ID_ACCESSOR =
		new Accessor<form_di_segnalazione, Long>() {
			@Override
			public Long get(form_di_segnalazione form_di_segnalazione) {
				return form_di_segnalazione.getForm_di_segnalazione_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<form_di_segnalazione> getTypeClass() {
				return form_di_segnalazione.class;
			}
		};
}
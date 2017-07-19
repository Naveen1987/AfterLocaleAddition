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

package istruzioni_per_la_compilazioneservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the istruzioni_per_la_compilazione_child service. Represents a row in the &quot;istruzioni_per_la_compilazione_child&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione_childModel
 * @see istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childImpl
 * @see istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childModelImpl
 * @generated
 */
@ImplementationClassName("istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childImpl")
@ProviderType
public interface istruzioni_per_la_compilazione_child
	extends istruzioni_per_la_compilazione_childModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<istruzioni_per_la_compilazione_child, Long> INS_ID_ACCESSOR =
		new Accessor<istruzioni_per_la_compilazione_child, Long>() {
			@Override
			public Long get(
				istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
				return istruzioni_per_la_compilazione_child.getIns_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<istruzioni_per_la_compilazione_child> getTypeClass() {
				return istruzioni_per_la_compilazione_child.class;
			}
		};
}
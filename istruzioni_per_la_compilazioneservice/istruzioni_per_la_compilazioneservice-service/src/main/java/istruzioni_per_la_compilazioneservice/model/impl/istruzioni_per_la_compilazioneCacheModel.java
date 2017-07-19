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

package istruzioni_per_la_compilazioneservice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing istruzioni_per_la_compilazione in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazioneCacheModel implements CacheModel<istruzioni_per_la_compilazione>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof istruzioni_per_la_compilazioneCacheModel)) {
			return false;
		}

		istruzioni_per_la_compilazioneCacheModel istruzioni_per_la_compilazioneCacheModel =
			(istruzioni_per_la_compilazioneCacheModel)obj;

		if (Istruzioni_per_id == istruzioni_per_la_compilazioneCacheModel.Istruzioni_per_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Istruzioni_per_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Istruzioni_per_id=");
		sb.append(Istruzioni_per_id);
		sb.append(", purpose=");
		sb.append(purpose);
		sb.append(", MainTitle=");
		sb.append(MainTitle);
		sb.append(", Tilte=");
		sb.append(Tilte);
		sb.append(", SubTitle=");
		sb.append(SubTitle);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public istruzioni_per_la_compilazione toEntityModel() {
		istruzioni_per_la_compilazioneImpl istruzioni_per_la_compilazioneImpl = new istruzioni_per_la_compilazioneImpl();

		istruzioni_per_la_compilazioneImpl.setIstruzioni_per_id(Istruzioni_per_id);

		if (purpose == null) {
			istruzioni_per_la_compilazioneImpl.setPurpose(StringPool.BLANK);
		}
		else {
			istruzioni_per_la_compilazioneImpl.setPurpose(purpose);
		}

		if (MainTitle == null) {
			istruzioni_per_la_compilazioneImpl.setMainTitle(StringPool.BLANK);
		}
		else {
			istruzioni_per_la_compilazioneImpl.setMainTitle(MainTitle);
		}

		if (Tilte == null) {
			istruzioni_per_la_compilazioneImpl.setTilte(StringPool.BLANK);
		}
		else {
			istruzioni_per_la_compilazioneImpl.setTilte(Tilte);
		}

		if (SubTitle == null) {
			istruzioni_per_la_compilazioneImpl.setSubTitle(StringPool.BLANK);
		}
		else {
			istruzioni_per_la_compilazioneImpl.setSubTitle(SubTitle);
		}

		istruzioni_per_la_compilazioneImpl.resetOriginalValues();

		return istruzioni_per_la_compilazioneImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Istruzioni_per_id = objectInput.readLong();
		purpose = objectInput.readUTF();
		MainTitle = objectInput.readUTF();
		Tilte = objectInput.readUTF();
		SubTitle = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Istruzioni_per_id);

		if (purpose == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(purpose);
		}

		if (MainTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MainTitle);
		}

		if (Tilte == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Tilte);
		}

		if (SubTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SubTitle);
		}
	}

	public long Istruzioni_per_id;
	public String purpose;
	public String MainTitle;
	public String Tilte;
	public String SubTitle;
}
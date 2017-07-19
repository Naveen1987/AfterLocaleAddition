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

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing istruzioni_per_la_compilazione_child in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione_child
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazione_childCacheModel
	implements CacheModel<istruzioni_per_la_compilazione_child>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof istruzioni_per_la_compilazione_childCacheModel)) {
			return false;
		}

		istruzioni_per_la_compilazione_childCacheModel istruzioni_per_la_compilazione_childCacheModel =
			(istruzioni_per_la_compilazione_childCacheModel)obj;

		if (Ins_id == istruzioni_per_la_compilazione_childCacheModel.Ins_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Ins_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{Ins_id=");
		sb.append(Ins_id);
		sb.append(", Instruction=");
		sb.append(Instruction);
		sb.append(", Istruzioni_per_id=");
		sb.append(Istruzioni_per_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public istruzioni_per_la_compilazione_child toEntityModel() {
		istruzioni_per_la_compilazione_childImpl istruzioni_per_la_compilazione_childImpl =
			new istruzioni_per_la_compilazione_childImpl();

		istruzioni_per_la_compilazione_childImpl.setIns_id(Ins_id);

		if (Instruction == null) {
			istruzioni_per_la_compilazione_childImpl.setInstruction(StringPool.BLANK);
		}
		else {
			istruzioni_per_la_compilazione_childImpl.setInstruction(Instruction);
		}

		istruzioni_per_la_compilazione_childImpl.setIstruzioni_per_id(Istruzioni_per_id);

		istruzioni_per_la_compilazione_childImpl.resetOriginalValues();

		return istruzioni_per_la_compilazione_childImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Ins_id = objectInput.readLong();
		Instruction = objectInput.readUTF();

		Istruzioni_per_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Ins_id);

		if (Instruction == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Instruction);
		}

		objectOutput.writeLong(Istruzioni_per_id);
	}

	public long Ins_id;
	public String Instruction;
	public long Istruzioni_per_id;
}
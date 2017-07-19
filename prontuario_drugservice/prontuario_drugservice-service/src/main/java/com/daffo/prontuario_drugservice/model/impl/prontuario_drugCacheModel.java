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

package com.daffo.prontuario_drugservice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.prontuario_drugservice.model.prontuario_drug;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing prontuario_drug in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see prontuario_drug
 * @generated
 */
@ProviderType
public class prontuario_drugCacheModel implements CacheModel<prontuario_drug>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof prontuario_drugCacheModel)) {
			return false;
		}

		prontuario_drugCacheModel prontuario_drugCacheModel = (prontuario_drugCacheModel)obj;

		if (drug_id == prontuario_drugCacheModel.drug_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, drug_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{drug_id=");
		sb.append(drug_id);
		sb.append(", Gruppo=");
		sb.append(Gruppo);
		sb.append(", SottoGruppo=");
		sb.append(SottoGruppo);
		sb.append(", Codice=");
		sb.append(Codice);
		sb.append(", Principio_Attivo=");
		sb.append(Principio_Attivo);
		sb.append(", Nome_Commerciale=");
		sb.append(Nome_Commerciale);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public prontuario_drug toEntityModel() {
		prontuario_drugImpl prontuario_drugImpl = new prontuario_drugImpl();

		prontuario_drugImpl.setDrug_id(drug_id);

		if (Gruppo == null) {
			prontuario_drugImpl.setGruppo(StringPool.BLANK);
		}
		else {
			prontuario_drugImpl.setGruppo(Gruppo);
		}

		if (SottoGruppo == null) {
			prontuario_drugImpl.setSottoGruppo(StringPool.BLANK);
		}
		else {
			prontuario_drugImpl.setSottoGruppo(SottoGruppo);
		}

		if (Codice == null) {
			prontuario_drugImpl.setCodice(StringPool.BLANK);
		}
		else {
			prontuario_drugImpl.setCodice(Codice);
		}

		if (Principio_Attivo == null) {
			prontuario_drugImpl.setPrincipio_Attivo(StringPool.BLANK);
		}
		else {
			prontuario_drugImpl.setPrincipio_Attivo(Principio_Attivo);
		}

		if (Nome_Commerciale == null) {
			prontuario_drugImpl.setNome_Commerciale(StringPool.BLANK);
		}
		else {
			prontuario_drugImpl.setNome_Commerciale(Nome_Commerciale);
		}

		prontuario_drugImpl.resetOriginalValues();

		return prontuario_drugImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		drug_id = objectInput.readLong();
		Gruppo = objectInput.readUTF();
		SottoGruppo = objectInput.readUTF();
		Codice = objectInput.readUTF();
		Principio_Attivo = objectInput.readUTF();
		Nome_Commerciale = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(drug_id);

		if (Gruppo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Gruppo);
		}

		if (SottoGruppo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SottoGruppo);
		}

		if (Codice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Codice);
		}

		if (Principio_Attivo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Principio_Attivo);
		}

		if (Nome_Commerciale == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Nome_Commerciale);
		}
	}

	public long drug_id;
	public String Gruppo;
	public String SottoGruppo;
	public String Codice;
	public String Principio_Attivo;
	public String Nome_Commerciale;
}
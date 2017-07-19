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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazione_childSoap implements Serializable {
	public static istruzioni_per_la_compilazione_childSoap toSoapModel(
		istruzioni_per_la_compilazione_child model) {
		istruzioni_per_la_compilazione_childSoap soapModel = new istruzioni_per_la_compilazione_childSoap();

		soapModel.setIns_id(model.getIns_id());
		soapModel.setInstruction(model.getInstruction());
		soapModel.setIstruzioni_per_id(model.getIstruzioni_per_id());

		return soapModel;
	}

	public static istruzioni_per_la_compilazione_childSoap[] toSoapModels(
		istruzioni_per_la_compilazione_child[] models) {
		istruzioni_per_la_compilazione_childSoap[] soapModels = new istruzioni_per_la_compilazione_childSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static istruzioni_per_la_compilazione_childSoap[][] toSoapModels(
		istruzioni_per_la_compilazione_child[][] models) {
		istruzioni_per_la_compilazione_childSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new istruzioni_per_la_compilazione_childSoap[models.length][models[0].length];
		}
		else {
			soapModels = new istruzioni_per_la_compilazione_childSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static istruzioni_per_la_compilazione_childSoap[] toSoapModels(
		List<istruzioni_per_la_compilazione_child> models) {
		List<istruzioni_per_la_compilazione_childSoap> soapModels = new ArrayList<istruzioni_per_la_compilazione_childSoap>(models.size());

		for (istruzioni_per_la_compilazione_child model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new istruzioni_per_la_compilazione_childSoap[soapModels.size()]);
	}

	public istruzioni_per_la_compilazione_childSoap() {
	}

	public long getPrimaryKey() {
		return _Ins_id;
	}

	public void setPrimaryKey(long pk) {
		setIns_id(pk);
	}

	public long getIns_id() {
		return _Ins_id;
	}

	public void setIns_id(long Ins_id) {
		_Ins_id = Ins_id;
	}

	public String getInstruction() {
		return _Instruction;
	}

	public void setInstruction(String Instruction) {
		_Instruction = Instruction;
	}

	public long getIstruzioni_per_id() {
		return _Istruzioni_per_id;
	}

	public void setIstruzioni_per_id(long Istruzioni_per_id) {
		_Istruzioni_per_id = Istruzioni_per_id;
	}

	private long _Ins_id;
	private String _Instruction;
	private long _Istruzioni_per_id;
}
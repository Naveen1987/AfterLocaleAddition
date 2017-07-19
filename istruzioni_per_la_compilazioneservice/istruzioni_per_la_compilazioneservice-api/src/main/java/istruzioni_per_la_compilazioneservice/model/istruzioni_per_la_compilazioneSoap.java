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
public class istruzioni_per_la_compilazioneSoap implements Serializable {
	public static istruzioni_per_la_compilazioneSoap toSoapModel(
		istruzioni_per_la_compilazione model) {
		istruzioni_per_la_compilazioneSoap soapModel = new istruzioni_per_la_compilazioneSoap();

		soapModel.setIstruzioni_per_id(model.getIstruzioni_per_id());
		soapModel.setPurpose(model.getPurpose());
		soapModel.setMainTitle(model.getMainTitle());
		soapModel.setTilte(model.getTilte());
		soapModel.setSubTitle(model.getSubTitle());

		return soapModel;
	}

	public static istruzioni_per_la_compilazioneSoap[] toSoapModels(
		istruzioni_per_la_compilazione[] models) {
		istruzioni_per_la_compilazioneSoap[] soapModels = new istruzioni_per_la_compilazioneSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static istruzioni_per_la_compilazioneSoap[][] toSoapModels(
		istruzioni_per_la_compilazione[][] models) {
		istruzioni_per_la_compilazioneSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new istruzioni_per_la_compilazioneSoap[models.length][models[0].length];
		}
		else {
			soapModels = new istruzioni_per_la_compilazioneSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static istruzioni_per_la_compilazioneSoap[] toSoapModels(
		List<istruzioni_per_la_compilazione> models) {
		List<istruzioni_per_la_compilazioneSoap> soapModels = new ArrayList<istruzioni_per_la_compilazioneSoap>(models.size());

		for (istruzioni_per_la_compilazione model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new istruzioni_per_la_compilazioneSoap[soapModels.size()]);
	}

	public istruzioni_per_la_compilazioneSoap() {
	}

	public long getPrimaryKey() {
		return _Istruzioni_per_id;
	}

	public void setPrimaryKey(long pk) {
		setIstruzioni_per_id(pk);
	}

	public long getIstruzioni_per_id() {
		return _Istruzioni_per_id;
	}

	public void setIstruzioni_per_id(long Istruzioni_per_id) {
		_Istruzioni_per_id = Istruzioni_per_id;
	}

	public String getPurpose() {
		return _purpose;
	}

	public void setPurpose(String purpose) {
		_purpose = purpose;
	}

	public String getMainTitle() {
		return _MainTitle;
	}

	public void setMainTitle(String MainTitle) {
		_MainTitle = MainTitle;
	}

	public String getTilte() {
		return _Tilte;
	}

	public void setTilte(String Tilte) {
		_Tilte = Tilte;
	}

	public String getSubTitle() {
		return _SubTitle;
	}

	public void setSubTitle(String SubTitle) {
		_SubTitle = SubTitle;
	}

	private long _Istruzioni_per_id;
	private String _purpose;
	private String _MainTitle;
	private String _Tilte;
	private String _SubTitle;
}
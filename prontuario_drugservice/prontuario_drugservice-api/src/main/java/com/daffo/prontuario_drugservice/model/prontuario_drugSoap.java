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
public class prontuario_drugSoap implements Serializable {
	public static prontuario_drugSoap toSoapModel(prontuario_drug model) {
		prontuario_drugSoap soapModel = new prontuario_drugSoap();

		soapModel.setDrug_id(model.getDrug_id());
		soapModel.setGruppo(model.getGruppo());
		soapModel.setSottoGruppo(model.getSottoGruppo());
		soapModel.setCodice(model.getCodice());
		soapModel.setPrincipio_Attivo(model.getPrincipio_Attivo());
		soapModel.setNome_Commerciale(model.getNome_Commerciale());

		return soapModel;
	}

	public static prontuario_drugSoap[] toSoapModels(prontuario_drug[] models) {
		prontuario_drugSoap[] soapModels = new prontuario_drugSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static prontuario_drugSoap[][] toSoapModels(
		prontuario_drug[][] models) {
		prontuario_drugSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new prontuario_drugSoap[models.length][models[0].length];
		}
		else {
			soapModels = new prontuario_drugSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static prontuario_drugSoap[] toSoapModels(
		List<prontuario_drug> models) {
		List<prontuario_drugSoap> soapModels = new ArrayList<prontuario_drugSoap>(models.size());

		for (prontuario_drug model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new prontuario_drugSoap[soapModels.size()]);
	}

	public prontuario_drugSoap() {
	}

	public long getPrimaryKey() {
		return _drug_id;
	}

	public void setPrimaryKey(long pk) {
		setDrug_id(pk);
	}

	public long getDrug_id() {
		return _drug_id;
	}

	public void setDrug_id(long drug_id) {
		_drug_id = drug_id;
	}

	public String getGruppo() {
		return _Gruppo;
	}

	public void setGruppo(String Gruppo) {
		_Gruppo = Gruppo;
	}

	public String getSottoGruppo() {
		return _SottoGruppo;
	}

	public void setSottoGruppo(String SottoGruppo) {
		_SottoGruppo = SottoGruppo;
	}

	public String getCodice() {
		return _Codice;
	}

	public void setCodice(String Codice) {
		_Codice = Codice;
	}

	public String getPrincipio_Attivo() {
		return _Principio_Attivo;
	}

	public void setPrincipio_Attivo(String Principio_Attivo) {
		_Principio_Attivo = Principio_Attivo;
	}

	public String getNome_Commerciale() {
		return _Nome_Commerciale;
	}

	public void setNome_Commerciale(String Nome_Commerciale) {
		_Nome_Commerciale = Nome_Commerciale;
	}

	private long _drug_id;
	private String _Gruppo;
	private String _SottoGruppo;
	private String _Codice;
	private String _Principio_Attivo;
	private String _Nome_Commerciale;
}
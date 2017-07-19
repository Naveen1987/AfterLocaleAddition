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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Naveen
 * @generated
 */
@ProviderType
public class suiluppo_courseSoap implements Serializable {
	public static suiluppo_courseSoap toSoapModel(suiluppo_course model) {
		suiluppo_courseSoap soapModel = new suiluppo_courseSoap();

		soapModel.setCourse_id(model.getCourse_id());
		soapModel.setDocente(model.getDocente());
		soapModel.setEvento_Progetto(model.getEvento_Progetto());
		soapModel.setTitolo(model.getTitolo());
		soapModel.setDescrizione(model.getDescrizione());
		soapModel.setFigure_Professionali_Coinvolte(model.getFigure_Professionali_Coinvolte());
		soapModel.setData_Inizio(model.getData_Inizio());
		soapModel.setData_Fine(model.getData_Fine());
		soapModel.setTot_Ore(model.getTot_Ore());
		soapModel.setNr_Edizione(model.getNr_Edizione());
		soapModel.setSede(model.getSede());
		soapModel.setAbstract(model.getAbstract());
		soapModel.setDispensa_corso(model.getDispensa_corso());
		soapModel.setAmmessi_al_corso(model.getAmmessi_al_corso());
		soapModel.setScadenza_Iscrizioni(model.getScadenza_Iscrizioni());
		soapModel.setVisibile(model.getVisibile());
		soapModel.setBloccato(model.getBloccato());

		return soapModel;
	}

	public static suiluppo_courseSoap[] toSoapModels(suiluppo_course[] models) {
		suiluppo_courseSoap[] soapModels = new suiluppo_courseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_courseSoap[][] toSoapModels(
		suiluppo_course[][] models) {
		suiluppo_courseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new suiluppo_courseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new suiluppo_courseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_courseSoap[] toSoapModels(
		List<suiluppo_course> models) {
		List<suiluppo_courseSoap> soapModels = new ArrayList<suiluppo_courseSoap>(models.size());

		for (suiluppo_course model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new suiluppo_courseSoap[soapModels.size()]);
	}

	public suiluppo_courseSoap() {
	}

	public long getPrimaryKey() {
		return _course_id;
	}

	public void setPrimaryKey(long pk) {
		setCourse_id(pk);
	}

	public long getCourse_id() {
		return _course_id;
	}

	public void setCourse_id(long course_id) {
		_course_id = course_id;
	}

	public String getDocente() {
		return _Docente;
	}

	public void setDocente(String Docente) {
		_Docente = Docente;
	}

	public String getEvento_Progetto() {
		return _Evento_Progetto;
	}

	public void setEvento_Progetto(String Evento_Progetto) {
		_Evento_Progetto = Evento_Progetto;
	}

	public String getTitolo() {
		return _Titolo;
	}

	public void setTitolo(String Titolo) {
		_Titolo = Titolo;
	}

	public String getDescrizione() {
		return _Descrizione;
	}

	public void setDescrizione(String Descrizione) {
		_Descrizione = Descrizione;
	}

	public String getFigure_Professionali_Coinvolte() {
		return _Figure_Professionali_Coinvolte;
	}

	public void setFigure_Professionali_Coinvolte(
		String Figure_Professionali_Coinvolte) {
		_Figure_Professionali_Coinvolte = Figure_Professionali_Coinvolte;
	}

	public String getData_Inizio() {
		return _Data_Inizio;
	}

	public void setData_Inizio(String Data_Inizio) {
		_Data_Inizio = Data_Inizio;
	}

	public String getData_Fine() {
		return _Data_Fine;
	}

	public void setData_Fine(String Data_Fine) {
		_Data_Fine = Data_Fine;
	}

	public String getTot_Ore() {
		return _Tot_Ore;
	}

	public void setTot_Ore(String Tot_Ore) {
		_Tot_Ore = Tot_Ore;
	}

	public String getNr_Edizione() {
		return _Nr_Edizione;
	}

	public void setNr_Edizione(String Nr_Edizione) {
		_Nr_Edizione = Nr_Edizione;
	}

	public String getSede() {
		return _Sede;
	}

	public void setSede(String Sede) {
		_Sede = Sede;
	}

	public String getAbstract() {
		return _Abstract;
	}

	public void setAbstract(String Abstract) {
		_Abstract = Abstract;
	}

	public String getDispensa_corso() {
		return _Dispensa_corso;
	}

	public void setDispensa_corso(String Dispensa_corso) {
		_Dispensa_corso = Dispensa_corso;
	}

	public long getAmmessi_al_corso() {
		return _Ammessi_al_corso;
	}

	public void setAmmessi_al_corso(long Ammessi_al_corso) {
		_Ammessi_al_corso = Ammessi_al_corso;
	}

	public String getScadenza_Iscrizioni() {
		return _Scadenza_Iscrizioni;
	}

	public void setScadenza_Iscrizioni(String Scadenza_Iscrizioni) {
		_Scadenza_Iscrizioni = Scadenza_Iscrizioni;
	}

	public String getVisibile() {
		return _Visibile;
	}

	public void setVisibile(String Visibile) {
		_Visibile = Visibile;
	}

	public String getBloccato() {
		return _Bloccato;
	}

	public void setBloccato(String Bloccato) {
		_Bloccato = Bloccato;
	}

	private long _course_id;
	private String _Docente;
	private String _Evento_Progetto;
	private String _Titolo;
	private String _Descrizione;
	private String _Figure_Professionali_Coinvolte;
	private String _Data_Inizio;
	private String _Data_Fine;
	private String _Tot_Ore;
	private String _Nr_Edizione;
	private String _Sede;
	private String _Abstract;
	private String _Dispensa_corso;
	private long _Ammessi_al_corso;
	private String _Scadenza_Iscrizioni;
	private String _Visibile;
	private String _Bloccato;
}
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

package com.daffo.suilupposervice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.suilupposervice.model.suiluppo_course;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing suiluppo_course in entity cache.
 *
 * @author Naveen
 * @see suiluppo_course
 * @generated
 */
@ProviderType
public class suiluppo_courseCacheModel implements CacheModel<suiluppo_course>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_courseCacheModel)) {
			return false;
		}

		suiluppo_courseCacheModel suiluppo_courseCacheModel = (suiluppo_courseCacheModel)obj;

		if (course_id == suiluppo_courseCacheModel.course_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, course_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{course_id=");
		sb.append(course_id);
		sb.append(", Docente=");
		sb.append(Docente);
		sb.append(", Evento_Progetto=");
		sb.append(Evento_Progetto);
		sb.append(", Titolo=");
		sb.append(Titolo);
		sb.append(", Descrizione=");
		sb.append(Descrizione);
		sb.append(", Figure_Professionali_Coinvolte=");
		sb.append(Figure_Professionali_Coinvolte);
		sb.append(", Data_Inizio=");
		sb.append(Data_Inizio);
		sb.append(", Data_Fine=");
		sb.append(Data_Fine);
		sb.append(", Tot_Ore=");
		sb.append(Tot_Ore);
		sb.append(", Nr_Edizione=");
		sb.append(Nr_Edizione);
		sb.append(", Sede=");
		sb.append(Sede);
		sb.append(", Abstract=");
		sb.append(Abstract);
		sb.append(", Dispensa_corso=");
		sb.append(Dispensa_corso);
		sb.append(", Ammessi_al_corso=");
		sb.append(Ammessi_al_corso);
		sb.append(", Scadenza_Iscrizioni=");
		sb.append(Scadenza_Iscrizioni);
		sb.append(", Visibile=");
		sb.append(Visibile);
		sb.append(", Bloccato=");
		sb.append(Bloccato);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public suiluppo_course toEntityModel() {
		suiluppo_courseImpl suiluppo_courseImpl = new suiluppo_courseImpl();

		suiluppo_courseImpl.setCourse_id(course_id);

		if (Docente == null) {
			suiluppo_courseImpl.setDocente(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setDocente(Docente);
		}

		if (Evento_Progetto == null) {
			suiluppo_courseImpl.setEvento_Progetto(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setEvento_Progetto(Evento_Progetto);
		}

		if (Titolo == null) {
			suiluppo_courseImpl.setTitolo(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setTitolo(Titolo);
		}

		if (Descrizione == null) {
			suiluppo_courseImpl.setDescrizione(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setDescrizione(Descrizione);
		}

		if (Figure_Professionali_Coinvolte == null) {
			suiluppo_courseImpl.setFigure_Professionali_Coinvolte(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setFigure_Professionali_Coinvolte(Figure_Professionali_Coinvolte);
		}

		if (Data_Inizio == null) {
			suiluppo_courseImpl.setData_Inizio(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setData_Inizio(Data_Inizio);
		}

		if (Data_Fine == null) {
			suiluppo_courseImpl.setData_Fine(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setData_Fine(Data_Fine);
		}

		if (Tot_Ore == null) {
			suiluppo_courseImpl.setTot_Ore(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setTot_Ore(Tot_Ore);
		}

		if (Nr_Edizione == null) {
			suiluppo_courseImpl.setNr_Edizione(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setNr_Edizione(Nr_Edizione);
		}

		if (Sede == null) {
			suiluppo_courseImpl.setSede(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setSede(Sede);
		}

		if (Abstract == null) {
			suiluppo_courseImpl.setAbstract(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setAbstract(Abstract);
		}

		if (Dispensa_corso == null) {
			suiluppo_courseImpl.setDispensa_corso(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setDispensa_corso(Dispensa_corso);
		}

		suiluppo_courseImpl.setAmmessi_al_corso(Ammessi_al_corso);

		if (Scadenza_Iscrizioni == null) {
			suiluppo_courseImpl.setScadenza_Iscrizioni(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setScadenza_Iscrizioni(Scadenza_Iscrizioni);
		}

		if (Visibile == null) {
			suiluppo_courseImpl.setVisibile(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setVisibile(Visibile);
		}

		if (Bloccato == null) {
			suiluppo_courseImpl.setBloccato(StringPool.BLANK);
		}
		else {
			suiluppo_courseImpl.setBloccato(Bloccato);
		}

		suiluppo_courseImpl.resetOriginalValues();

		return suiluppo_courseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		course_id = objectInput.readLong();
		Docente = objectInput.readUTF();
		Evento_Progetto = objectInput.readUTF();
		Titolo = objectInput.readUTF();
		Descrizione = objectInput.readUTF();
		Figure_Professionali_Coinvolte = objectInput.readUTF();
		Data_Inizio = objectInput.readUTF();
		Data_Fine = objectInput.readUTF();
		Tot_Ore = objectInput.readUTF();
		Nr_Edizione = objectInput.readUTF();
		Sede = objectInput.readUTF();
		Abstract = objectInput.readUTF();
		Dispensa_corso = objectInput.readUTF();

		Ammessi_al_corso = objectInput.readLong();
		Scadenza_Iscrizioni = objectInput.readUTF();
		Visibile = objectInput.readUTF();
		Bloccato = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(course_id);

		if (Docente == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Docente);
		}

		if (Evento_Progetto == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Evento_Progetto);
		}

		if (Titolo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Titolo);
		}

		if (Descrizione == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Descrizione);
		}

		if (Figure_Professionali_Coinvolte == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Figure_Professionali_Coinvolte);
		}

		if (Data_Inizio == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Data_Inizio);
		}

		if (Data_Fine == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Data_Fine);
		}

		if (Tot_Ore == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Tot_Ore);
		}

		if (Nr_Edizione == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Nr_Edizione);
		}

		if (Sede == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Sede);
		}

		if (Abstract == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Abstract);
		}

		if (Dispensa_corso == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Dispensa_corso);
		}

		objectOutput.writeLong(Ammessi_al_corso);

		if (Scadenza_Iscrizioni == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Scadenza_Iscrizioni);
		}

		if (Visibile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Visibile);
		}

		if (Bloccato == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Bloccato);
		}
	}

	public long course_id;
	public String Docente;
	public String Evento_Progetto;
	public String Titolo;
	public String Descrizione;
	public String Figure_Professionali_Coinvolte;
	public String Data_Inizio;
	public String Data_Fine;
	public String Tot_Ore;
	public String Nr_Edizione;
	public String Sede;
	public String Abstract;
	public String Dispensa_corso;
	public long Ammessi_al_corso;
	public String Scadenza_Iscrizioni;
	public String Visibile;
	public String Bloccato;
}
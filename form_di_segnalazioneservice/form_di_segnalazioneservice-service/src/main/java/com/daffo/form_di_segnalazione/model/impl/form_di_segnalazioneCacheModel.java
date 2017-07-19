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

package com.daffo.form_di_segnalazione.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.form_di_segnalazione.model.form_di_segnalazione;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing form_di_segnalazione in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see form_di_segnalazione
 * @generated
 */
@ProviderType
public class form_di_segnalazioneCacheModel implements CacheModel<form_di_segnalazione>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof form_di_segnalazioneCacheModel)) {
			return false;
		}

		form_di_segnalazioneCacheModel form_di_segnalazioneCacheModel = (form_di_segnalazioneCacheModel)obj;

		if (Form_di_segnalazione_id == form_di_segnalazioneCacheModel.Form_di_segnalazione_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Form_di_segnalazione_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(245);

		sb.append("{Form_di_segnalazione_id=");
		sb.append(Form_di_segnalazione_id);
		sb.append(", CODICE=");
		sb.append(CODICE);
		sb.append(", INIZIALI_1=");
		sb.append(INIZIALI_1);
		sb.append(", INIZIALI_1_a=");
		sb.append(INIZIALI_1_a);
		sb.append(", INIZIALI_1_b=");
		sb.append(INIZIALI_1_b);
		sb.append(", INIZIALI_1_c=");
		sb.append(INIZIALI_1_c);
		sb.append(", INIZIALI_1_d=");
		sb.append(INIZIALI_1_d);
		sb.append(", INIZIALI_1_e=");
		sb.append(INIZIALI_1_e);
		sb.append(", DATA_2=");
		sb.append(DATA_2);
		sb.append(", SESSO_3=");
		sb.append(SESSO_3);
		sb.append(", DATA_4=");
		sb.append(DATA_4);
		sb.append(", ORIGINE_5=");
		sb.append(ORIGINE_5);
		sb.append(", DESCRIZIONE_6=");
		sb.append(DESCRIZIONE_6);
		sb.append(", INDICARE_7_1=");
		sb.append(INDICARE_7_1);
		sb.append(", INDICARE_7_2=");
		sb.append(INDICARE_7_2);
		sb.append(", INDICARE_7_3=");
		sb.append(INDICARE_7_3);
		sb.append(", INDICARE_7_4=");
		sb.append(INDICARE_7_4);
		sb.append(", INDICARE_7_5=");
		sb.append(INDICARE_7_5);
		sb.append(", INDICARE_7_6=");
		sb.append(INDICARE_7_6);
		sb.append(", INDICARE_7_7=");
		sb.append(INDICARE_7_7);
		sb.append(", GRAVITA_8_1=");
		sb.append(GRAVITA_8_1);
		sb.append(", GRAVITA_8_2=");
		sb.append(GRAVITA_8_2);
		sb.append(", GRAVITA_8_3=");
		sb.append(GRAVITA_8_3);
		sb.append(", GRAVITA_8_4=");
		sb.append(GRAVITA_8_4);
		sb.append(", GRAVITA_8_5=");
		sb.append(GRAVITA_8_5);
		sb.append(", GRAVITA_8_6=");
		sb.append(GRAVITA_8_6);
		sb.append(", GRAVITA_8_7=");
		sb.append(GRAVITA_8_7);
		sb.append(", EVENTUALI_9=");
		sb.append(EVENTUALI_9);
		sb.append(", ESITO_10=");
		sb.append(ESITO_10);
		sb.append(", ESITO_10_1=");
		sb.append(ESITO_10_1);
		sb.append(", ESITO_10_2=");
		sb.append(ESITO_10_2);
		sb.append(", ESITO_10_3=");
		sb.append(ESITO_10_3);
		sb.append(", ESITO_10_4=");
		sb.append(ESITO_10_4);
		sb.append(", ESITO_10_5=");
		sb.append(ESITO_10_5);
		sb.append(", ESITO_10_6=");
		sb.append(ESITO_10_6);
		sb.append(", ESITO_10_7=");
		sb.append(ESITO_10_7);
		sb.append(", ESITO_10_8=");
		sb.append(ESITO_10_8);
		sb.append(", ESITO_10_9=");
		sb.append(ESITO_10_9);
		sb.append(", ESITO_10_10=");
		sb.append(ESITO_10_10);
		sb.append(", AZIONI_11=");
		sb.append(AZIONI_11);
		sb.append(", FARMACO_12_a=");
		sb.append(FARMACO_12_a);
		sb.append(", FARMACO_12_a_13=");
		sb.append(FARMACO_12_a_13);
		sb.append(", FARMACO_12_a_14=");
		sb.append(FARMACO_12_a_14);
		sb.append(", FARMACO_12_a_15=");
		sb.append(FARMACO_12_a_15);
		sb.append(", FARMACO_12_a_16_1=");
		sb.append(FARMACO_12_a_16_1);
		sb.append(", FARMACO_12_a_16_2=");
		sb.append(FARMACO_12_a_16_2);
		sb.append(", FARMACO_12_a_17=");
		sb.append(FARMACO_12_a_17);
		sb.append(", FARMACO_12_a_18=");
		sb.append(FARMACO_12_a_18);
		sb.append(", FARMACO_12_a_19=");
		sb.append(FARMACO_12_a_19);
		sb.append(", FARMACO_12_a_20=");
		sb.append(FARMACO_12_a_20);
		sb.append(", FARMACO_12_b=");
		sb.append(FARMACO_12_b);
		sb.append(", FARMACO_12_b_13=");
		sb.append(FARMACO_12_b_13);
		sb.append(", FARMACO_12_b_14=");
		sb.append(FARMACO_12_b_14);
		sb.append(", FARMACO_12_b_15=");
		sb.append(FARMACO_12_b_15);
		sb.append(", FARMACO_12_b_16_1=");
		sb.append(FARMACO_12_b_16_1);
		sb.append(", FARMACO_12_b_16_2=");
		sb.append(FARMACO_12_b_16_2);
		sb.append(", FARMACO_12_b_17=");
		sb.append(FARMACO_12_b_17);
		sb.append(", FARMACO_12_b_18=");
		sb.append(FARMACO_12_b_18);
		sb.append(", FARMACO_12_b_19=");
		sb.append(FARMACO_12_b_19);
		sb.append(", FARMACO_12_b_20=");
		sb.append(FARMACO_12_b_20);
		sb.append(", FARMACO_12_c=");
		sb.append(FARMACO_12_c);
		sb.append(", FARMACO_12_c_13=");
		sb.append(FARMACO_12_c_13);
		sb.append(", FARMACO_12_c_14=");
		sb.append(FARMACO_12_c_14);
		sb.append(", FARMACO_12_c_15=");
		sb.append(FARMACO_12_c_15);
		sb.append(", FARMACO_12_c_16_1=");
		sb.append(FARMACO_12_c_16_1);
		sb.append(", FARMACO_12_c_16_2=");
		sb.append(FARMACO_12_c_16_2);
		sb.append(", FARMACO_12_c_17=");
		sb.append(FARMACO_12_c_17);
		sb.append(", FARMACO_12_c_18=");
		sb.append(FARMACO_12_c_18);
		sb.append(", FARMACO_12_c_19=");
		sb.append(FARMACO_12_c_19);
		sb.append(", FARMACO_12_c_20=");
		sb.append(FARMACO_12_c_20);
		sb.append(", INDICAZIONI_21_a=");
		sb.append(INDICAZIONI_21_a);
		sb.append(", INDICAZIONI_21_b=");
		sb.append(INDICAZIONI_21_b);
		sb.append(", INDICAZIONI_21_c=");
		sb.append(INDICAZIONI_21_c);
		sb.append(", FARMACO_22_a=");
		sb.append(FARMACO_22_a);
		sb.append(", FARMACO_22_a_23=");
		sb.append(FARMACO_22_a_23);
		sb.append(", FARMACO_22_a_24=");
		sb.append(FARMACO_22_a_24);
		sb.append(", FARMACO_22_a_25=");
		sb.append(FARMACO_22_a_25);
		sb.append(", FARMACO_22_a_26_1=");
		sb.append(FARMACO_22_a_26_1);
		sb.append(", FARMACO_22_a_26_2=");
		sb.append(FARMACO_22_a_26_2);
		sb.append(", FARMACO_22_a_27=");
		sb.append(FARMACO_22_a_27);
		sb.append(", FARMACO_22_a_28=");
		sb.append(FARMACO_22_a_28);
		sb.append(", FARMACO_22_a_29=");
		sb.append(FARMACO_22_a_29);
		sb.append(", FARMACO_22_a_30=");
		sb.append(FARMACO_22_a_30);
		sb.append(", FARMACO_22_b=");
		sb.append(FARMACO_22_b);
		sb.append(", FARMACO_22_b_23=");
		sb.append(FARMACO_22_b_23);
		sb.append(", FARMACO_22_b_24=");
		sb.append(FARMACO_22_b_24);
		sb.append(", FARMACO_22_b_25=");
		sb.append(FARMACO_22_b_25);
		sb.append(", FARMACO_22_b_26_1=");
		sb.append(FARMACO_22_b_26_1);
		sb.append(", FARMACO_22_b_26_2=");
		sb.append(FARMACO_22_b_26_2);
		sb.append(", FARMACO_22_b_27=");
		sb.append(FARMACO_22_b_27);
		sb.append(", FARMACO_22_b_28=");
		sb.append(FARMACO_22_b_28);
		sb.append(", FARMACO_22_b_29=");
		sb.append(FARMACO_22_b_29);
		sb.append(", FARMACO_22_b_30=");
		sb.append(FARMACO_22_b_30);
		sb.append(", INDICAZIONI_31_a=");
		sb.append(INDICAZIONI_31_a);
		sb.append(", INDICAZIONI_31_b=");
		sb.append(INDICAZIONI_31_b);
		sb.append(", USO_32=");
		sb.append(USO_32);
		sb.append(", CONDIZIONI_33=");
		sb.append(CONDIZIONI_33);
		sb.append(", ALTRE_34=");
		sb.append(ALTRE_34);
		sb.append(", INDICARE_35_1=");
		sb.append(INDICARE_35_1);
		sb.append(", INDICARE_35_2=");
		sb.append(INDICARE_35_2);
		sb.append(", INDICARE_35_3=");
		sb.append(INDICARE_35_3);
		sb.append(", INDICARE_35_4=");
		sb.append(INDICARE_35_4);
		sb.append(", INDICARE_35_5=");
		sb.append(INDICARE_35_5);
		sb.append(", INDICARE_35_6=");
		sb.append(INDICARE_35_6);
		sb.append(", QUALIFICA_36_1=");
		sb.append(QUALIFICA_36_1);
		sb.append(", QUALIFICA_36_2=");
		sb.append(QUALIFICA_36_2);
		sb.append(", QUALIFICA_36_3=");
		sb.append(QUALIFICA_36_3);
		sb.append(", QUALIFICA_36_4=");
		sb.append(QUALIFICA_36_4);
		sb.append(", QUALIFICA_36_5=");
		sb.append(QUALIFICA_36_5);
		sb.append(", QUALIFICA_36_6=");
		sb.append(QUALIFICA_36_6);
		sb.append(", QUALIFICA_36_7=");
		sb.append(QUALIFICA_36_7);
		sb.append(", QUALIFICA_36_8=");
		sb.append(QUALIFICA_36_8);
		sb.append(", QUALIFICA_36_9=");
		sb.append(QUALIFICA_36_9);
		sb.append(", QUALIFICA_36_10=");
		sb.append(QUALIFICA_36_10);
		sb.append(", DATI_37_1=");
		sb.append(DATI_37_1);
		sb.append(", DATI_37_2=");
		sb.append(DATI_37_2);
		sb.append(", DATI_37_3=");
		sb.append(DATI_37_3);
		sb.append(", DATI_37_4=");
		sb.append(DATI_37_4);
		sb.append(", ASL_38=");
		sb.append(ASL_38);
		sb.append(", REGIONE_39=");
		sb.append(REGIONE_39);
		sb.append(", DATA_40=");
		sb.append(DATA_40);
		sb.append(", FIRMA_41=");
		sb.append(FIRMA_41);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public form_di_segnalazione toEntityModel() {
		form_di_segnalazioneImpl form_di_segnalazioneImpl = new form_di_segnalazioneImpl();

		form_di_segnalazioneImpl.setForm_di_segnalazione_id(Form_di_segnalazione_id);

		if (CODICE == null) {
			form_di_segnalazioneImpl.setCODICE(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setCODICE(CODICE);
		}

		if (INIZIALI_1 == null) {
			form_di_segnalazioneImpl.setINIZIALI_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINIZIALI_1(INIZIALI_1);
		}

		if (INIZIALI_1_a == null) {
			form_di_segnalazioneImpl.setINIZIALI_1_a(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINIZIALI_1_a(INIZIALI_1_a);
		}

		if (INIZIALI_1_b == null) {
			form_di_segnalazioneImpl.setINIZIALI_1_b(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINIZIALI_1_b(INIZIALI_1_b);
		}

		if (INIZIALI_1_c == null) {
			form_di_segnalazioneImpl.setINIZIALI_1_c(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINIZIALI_1_c(INIZIALI_1_c);
		}

		if (INIZIALI_1_d == null) {
			form_di_segnalazioneImpl.setINIZIALI_1_d(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINIZIALI_1_d(INIZIALI_1_d);
		}

		if (INIZIALI_1_e == null) {
			form_di_segnalazioneImpl.setINIZIALI_1_e(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINIZIALI_1_e(INIZIALI_1_e);
		}

		if (DATA_2 == null) {
			form_di_segnalazioneImpl.setDATA_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setDATA_2(DATA_2);
		}

		if (SESSO_3 == null) {
			form_di_segnalazioneImpl.setSESSO_3(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setSESSO_3(SESSO_3);
		}

		if (DATA_4 == null) {
			form_di_segnalazioneImpl.setDATA_4(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setDATA_4(DATA_4);
		}

		if (ORIGINE_5 == null) {
			form_di_segnalazioneImpl.setORIGINE_5(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setORIGINE_5(ORIGINE_5);
		}

		if (DESCRIZIONE_6 == null) {
			form_di_segnalazioneImpl.setDESCRIZIONE_6(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setDESCRIZIONE_6(DESCRIZIONE_6);
		}

		if (INDICARE_7_1 == null) {
			form_di_segnalazioneImpl.setINDICARE_7_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_7_1(INDICARE_7_1);
		}

		if (INDICARE_7_2 == null) {
			form_di_segnalazioneImpl.setINDICARE_7_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_7_2(INDICARE_7_2);
		}

		if (INDICARE_7_3 == null) {
			form_di_segnalazioneImpl.setINDICARE_7_3(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_7_3(INDICARE_7_3);
		}

		if (INDICARE_7_4 == null) {
			form_di_segnalazioneImpl.setINDICARE_7_4(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_7_4(INDICARE_7_4);
		}

		if (INDICARE_7_5 == null) {
			form_di_segnalazioneImpl.setINDICARE_7_5(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_7_5(INDICARE_7_5);
		}

		if (INDICARE_7_6 == null) {
			form_di_segnalazioneImpl.setINDICARE_7_6(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_7_6(INDICARE_7_6);
		}

		if (INDICARE_7_7 == null) {
			form_di_segnalazioneImpl.setINDICARE_7_7(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_7_7(INDICARE_7_7);
		}

		if (GRAVITA_8_1 == null) {
			form_di_segnalazioneImpl.setGRAVITA_8_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setGRAVITA_8_1(GRAVITA_8_1);
		}

		if (GRAVITA_8_2 == null) {
			form_di_segnalazioneImpl.setGRAVITA_8_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setGRAVITA_8_2(GRAVITA_8_2);
		}

		if (GRAVITA_8_3 == null) {
			form_di_segnalazioneImpl.setGRAVITA_8_3(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setGRAVITA_8_3(GRAVITA_8_3);
		}

		if (GRAVITA_8_4 == null) {
			form_di_segnalazioneImpl.setGRAVITA_8_4(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setGRAVITA_8_4(GRAVITA_8_4);
		}

		if (GRAVITA_8_5 == null) {
			form_di_segnalazioneImpl.setGRAVITA_8_5(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setGRAVITA_8_5(GRAVITA_8_5);
		}

		if (GRAVITA_8_6 == null) {
			form_di_segnalazioneImpl.setGRAVITA_8_6(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setGRAVITA_8_6(GRAVITA_8_6);
		}

		if (GRAVITA_8_7 == null) {
			form_di_segnalazioneImpl.setGRAVITA_8_7(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setGRAVITA_8_7(GRAVITA_8_7);
		}

		if (EVENTUALI_9 == null) {
			form_di_segnalazioneImpl.setEVENTUALI_9(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setEVENTUALI_9(EVENTUALI_9);
		}

		if (ESITO_10 == null) {
			form_di_segnalazioneImpl.setESITO_10(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10(ESITO_10);
		}

		if (ESITO_10_1 == null) {
			form_di_segnalazioneImpl.setESITO_10_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_1(ESITO_10_1);
		}

		if (ESITO_10_2 == null) {
			form_di_segnalazioneImpl.setESITO_10_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_2(ESITO_10_2);
		}

		if (ESITO_10_3 == null) {
			form_di_segnalazioneImpl.setESITO_10_3(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_3(ESITO_10_3);
		}

		if (ESITO_10_4 == null) {
			form_di_segnalazioneImpl.setESITO_10_4(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_4(ESITO_10_4);
		}

		if (ESITO_10_5 == null) {
			form_di_segnalazioneImpl.setESITO_10_5(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_5(ESITO_10_5);
		}

		if (ESITO_10_6 == null) {
			form_di_segnalazioneImpl.setESITO_10_6(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_6(ESITO_10_6);
		}

		if (ESITO_10_7 == null) {
			form_di_segnalazioneImpl.setESITO_10_7(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_7(ESITO_10_7);
		}

		if (ESITO_10_8 == null) {
			form_di_segnalazioneImpl.setESITO_10_8(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_8(ESITO_10_8);
		}

		if (ESITO_10_9 == null) {
			form_di_segnalazioneImpl.setESITO_10_9(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_9(ESITO_10_9);
		}

		if (ESITO_10_10 == null) {
			form_di_segnalazioneImpl.setESITO_10_10(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setESITO_10_10(ESITO_10_10);
		}

		if (AZIONI_11 == null) {
			form_di_segnalazioneImpl.setAZIONI_11(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setAZIONI_11(AZIONI_11);
		}

		if (FARMACO_12_a == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a(FARMACO_12_a);
		}

		if (FARMACO_12_a_13 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_13(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_13(FARMACO_12_a_13);
		}

		if (FARMACO_12_a_14 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_14(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_14(FARMACO_12_a_14);
		}

		if (FARMACO_12_a_15 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_15(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_15(FARMACO_12_a_15);
		}

		if (FARMACO_12_a_16_1 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_16_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_16_1(FARMACO_12_a_16_1);
		}

		if (FARMACO_12_a_16_2 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_16_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_16_2(FARMACO_12_a_16_2);
		}

		if (FARMACO_12_a_17 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_17(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_17(FARMACO_12_a_17);
		}

		if (FARMACO_12_a_18 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_18(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_18(FARMACO_12_a_18);
		}

		if (FARMACO_12_a_19 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_19(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_19(FARMACO_12_a_19);
		}

		if (FARMACO_12_a_20 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_a_20(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_a_20(FARMACO_12_a_20);
		}

		if (FARMACO_12_b == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b(FARMACO_12_b);
		}

		if (FARMACO_12_b_13 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_13(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_13(FARMACO_12_b_13);
		}

		if (FARMACO_12_b_14 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_14(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_14(FARMACO_12_b_14);
		}

		if (FARMACO_12_b_15 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_15(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_15(FARMACO_12_b_15);
		}

		if (FARMACO_12_b_16_1 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_16_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_16_1(FARMACO_12_b_16_1);
		}

		if (FARMACO_12_b_16_2 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_16_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_16_2(FARMACO_12_b_16_2);
		}

		if (FARMACO_12_b_17 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_17(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_17(FARMACO_12_b_17);
		}

		if (FARMACO_12_b_18 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_18(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_18(FARMACO_12_b_18);
		}

		if (FARMACO_12_b_19 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_19(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_19(FARMACO_12_b_19);
		}

		if (FARMACO_12_b_20 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_b_20(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_b_20(FARMACO_12_b_20);
		}

		if (FARMACO_12_c == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c(FARMACO_12_c);
		}

		if (FARMACO_12_c_13 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_13(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_13(FARMACO_12_c_13);
		}

		if (FARMACO_12_c_14 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_14(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_14(FARMACO_12_c_14);
		}

		if (FARMACO_12_c_15 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_15(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_15(FARMACO_12_c_15);
		}

		if (FARMACO_12_c_16_1 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_16_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_16_1(FARMACO_12_c_16_1);
		}

		if (FARMACO_12_c_16_2 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_16_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_16_2(FARMACO_12_c_16_2);
		}

		if (FARMACO_12_c_17 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_17(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_17(FARMACO_12_c_17);
		}

		if (FARMACO_12_c_18 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_18(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_18(FARMACO_12_c_18);
		}

		if (FARMACO_12_c_19 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_19(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_19(FARMACO_12_c_19);
		}

		if (FARMACO_12_c_20 == null) {
			form_di_segnalazioneImpl.setFARMACO_12_c_20(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_12_c_20(FARMACO_12_c_20);
		}

		if (INDICAZIONI_21_a == null) {
			form_di_segnalazioneImpl.setINDICAZIONI_21_a(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICAZIONI_21_a(INDICAZIONI_21_a);
		}

		if (INDICAZIONI_21_b == null) {
			form_di_segnalazioneImpl.setINDICAZIONI_21_b(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICAZIONI_21_b(INDICAZIONI_21_b);
		}

		if (INDICAZIONI_21_c == null) {
			form_di_segnalazioneImpl.setINDICAZIONI_21_c(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICAZIONI_21_c(INDICAZIONI_21_c);
		}

		if (FARMACO_22_a == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a(FARMACO_22_a);
		}

		if (FARMACO_22_a_23 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_23(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_23(FARMACO_22_a_23);
		}

		if (FARMACO_22_a_24 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_24(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_24(FARMACO_22_a_24);
		}

		if (FARMACO_22_a_25 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_25(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_25(FARMACO_22_a_25);
		}

		if (FARMACO_22_a_26_1 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_26_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_26_1(FARMACO_22_a_26_1);
		}

		if (FARMACO_22_a_26_2 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_26_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_26_2(FARMACO_22_a_26_2);
		}

		if (FARMACO_22_a_27 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_27(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_27(FARMACO_22_a_27);
		}

		if (FARMACO_22_a_28 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_28(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_28(FARMACO_22_a_28);
		}

		if (FARMACO_22_a_29 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_29(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_29(FARMACO_22_a_29);
		}

		if (FARMACO_22_a_30 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_a_30(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_a_30(FARMACO_22_a_30);
		}

		if (FARMACO_22_b == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b(FARMACO_22_b);
		}

		if (FARMACO_22_b_23 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_23(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_23(FARMACO_22_b_23);
		}

		if (FARMACO_22_b_24 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_24(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_24(FARMACO_22_b_24);
		}

		if (FARMACO_22_b_25 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_25(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_25(FARMACO_22_b_25);
		}

		if (FARMACO_22_b_26_1 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_26_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_26_1(FARMACO_22_b_26_1);
		}

		if (FARMACO_22_b_26_2 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_26_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_26_2(FARMACO_22_b_26_2);
		}

		if (FARMACO_22_b_27 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_27(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_27(FARMACO_22_b_27);
		}

		if (FARMACO_22_b_28 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_28(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_28(FARMACO_22_b_28);
		}

		if (FARMACO_22_b_29 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_29(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_29(FARMACO_22_b_29);
		}

		if (FARMACO_22_b_30 == null) {
			form_di_segnalazioneImpl.setFARMACO_22_b_30(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFARMACO_22_b_30(FARMACO_22_b_30);
		}

		if (INDICAZIONI_31_a == null) {
			form_di_segnalazioneImpl.setINDICAZIONI_31_a(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICAZIONI_31_a(INDICAZIONI_31_a);
		}

		if (INDICAZIONI_31_b == null) {
			form_di_segnalazioneImpl.setINDICAZIONI_31_b(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICAZIONI_31_b(INDICAZIONI_31_b);
		}

		if (USO_32 == null) {
			form_di_segnalazioneImpl.setUSO_32(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setUSO_32(USO_32);
		}

		if (CONDIZIONI_33 == null) {
			form_di_segnalazioneImpl.setCONDIZIONI_33(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setCONDIZIONI_33(CONDIZIONI_33);
		}

		if (ALTRE_34 == null) {
			form_di_segnalazioneImpl.setALTRE_34(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setALTRE_34(ALTRE_34);
		}

		if (INDICARE_35_1 == null) {
			form_di_segnalazioneImpl.setINDICARE_35_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_35_1(INDICARE_35_1);
		}

		if (INDICARE_35_2 == null) {
			form_di_segnalazioneImpl.setINDICARE_35_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_35_2(INDICARE_35_2);
		}

		if (INDICARE_35_3 == null) {
			form_di_segnalazioneImpl.setINDICARE_35_3(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_35_3(INDICARE_35_3);
		}

		if (INDICARE_35_4 == null) {
			form_di_segnalazioneImpl.setINDICARE_35_4(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_35_4(INDICARE_35_4);
		}

		if (INDICARE_35_5 == null) {
			form_di_segnalazioneImpl.setINDICARE_35_5(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_35_5(INDICARE_35_5);
		}

		if (INDICARE_35_6 == null) {
			form_di_segnalazioneImpl.setINDICARE_35_6(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setINDICARE_35_6(INDICARE_35_6);
		}

		if (QUALIFICA_36_1 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_1(QUALIFICA_36_1);
		}

		if (QUALIFICA_36_2 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_2(QUALIFICA_36_2);
		}

		if (QUALIFICA_36_3 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_3(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_3(QUALIFICA_36_3);
		}

		if (QUALIFICA_36_4 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_4(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_4(QUALIFICA_36_4);
		}

		if (QUALIFICA_36_5 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_5(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_5(QUALIFICA_36_5);
		}

		if (QUALIFICA_36_6 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_6(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_6(QUALIFICA_36_6);
		}

		if (QUALIFICA_36_7 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_7(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_7(QUALIFICA_36_7);
		}

		if (QUALIFICA_36_8 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_8(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_8(QUALIFICA_36_8);
		}

		if (QUALIFICA_36_9 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_9(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_9(QUALIFICA_36_9);
		}

		if (QUALIFICA_36_10 == null) {
			form_di_segnalazioneImpl.setQUALIFICA_36_10(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setQUALIFICA_36_10(QUALIFICA_36_10);
		}

		if (DATI_37_1 == null) {
			form_di_segnalazioneImpl.setDATI_37_1(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setDATI_37_1(DATI_37_1);
		}

		if (DATI_37_2 == null) {
			form_di_segnalazioneImpl.setDATI_37_2(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setDATI_37_2(DATI_37_2);
		}

		if (DATI_37_3 == null) {
			form_di_segnalazioneImpl.setDATI_37_3(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setDATI_37_3(DATI_37_3);
		}

		if (DATI_37_4 == null) {
			form_di_segnalazioneImpl.setDATI_37_4(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setDATI_37_4(DATI_37_4);
		}

		if (ASL_38 == null) {
			form_di_segnalazioneImpl.setASL_38(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setASL_38(ASL_38);
		}

		if (REGIONE_39 == null) {
			form_di_segnalazioneImpl.setREGIONE_39(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setREGIONE_39(REGIONE_39);
		}

		if (DATA_40 == null) {
			form_di_segnalazioneImpl.setDATA_40(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setDATA_40(DATA_40);
		}

		if (FIRMA_41 == null) {
			form_di_segnalazioneImpl.setFIRMA_41(StringPool.BLANK);
		}
		else {
			form_di_segnalazioneImpl.setFIRMA_41(FIRMA_41);
		}

		form_di_segnalazioneImpl.resetOriginalValues();

		return form_di_segnalazioneImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Form_di_segnalazione_id = objectInput.readLong();
		CODICE = objectInput.readUTF();
		INIZIALI_1 = objectInput.readUTF();
		INIZIALI_1_a = objectInput.readUTF();
		INIZIALI_1_b = objectInput.readUTF();
		INIZIALI_1_c = objectInput.readUTF();
		INIZIALI_1_d = objectInput.readUTF();
		INIZIALI_1_e = objectInput.readUTF();
		DATA_2 = objectInput.readUTF();
		SESSO_3 = objectInput.readUTF();
		DATA_4 = objectInput.readUTF();
		ORIGINE_5 = objectInput.readUTF();
		DESCRIZIONE_6 = objectInput.readUTF();
		INDICARE_7_1 = objectInput.readUTF();
		INDICARE_7_2 = objectInput.readUTF();
		INDICARE_7_3 = objectInput.readUTF();
		INDICARE_7_4 = objectInput.readUTF();
		INDICARE_7_5 = objectInput.readUTF();
		INDICARE_7_6 = objectInput.readUTF();
		INDICARE_7_7 = objectInput.readUTF();
		GRAVITA_8_1 = objectInput.readUTF();
		GRAVITA_8_2 = objectInput.readUTF();
		GRAVITA_8_3 = objectInput.readUTF();
		GRAVITA_8_4 = objectInput.readUTF();
		GRAVITA_8_5 = objectInput.readUTF();
		GRAVITA_8_6 = objectInput.readUTF();
		GRAVITA_8_7 = objectInput.readUTF();
		EVENTUALI_9 = objectInput.readUTF();
		ESITO_10 = objectInput.readUTF();
		ESITO_10_1 = objectInput.readUTF();
		ESITO_10_2 = objectInput.readUTF();
		ESITO_10_3 = objectInput.readUTF();
		ESITO_10_4 = objectInput.readUTF();
		ESITO_10_5 = objectInput.readUTF();
		ESITO_10_6 = objectInput.readUTF();
		ESITO_10_7 = objectInput.readUTF();
		ESITO_10_8 = objectInput.readUTF();
		ESITO_10_9 = objectInput.readUTF();
		ESITO_10_10 = objectInput.readUTF();
		AZIONI_11 = objectInput.readUTF();
		FARMACO_12_a = objectInput.readUTF();
		FARMACO_12_a_13 = objectInput.readUTF();
		FARMACO_12_a_14 = objectInput.readUTF();
		FARMACO_12_a_15 = objectInput.readUTF();
		FARMACO_12_a_16_1 = objectInput.readUTF();
		FARMACO_12_a_16_2 = objectInput.readUTF();
		FARMACO_12_a_17 = objectInput.readUTF();
		FARMACO_12_a_18 = objectInput.readUTF();
		FARMACO_12_a_19 = objectInput.readUTF();
		FARMACO_12_a_20 = objectInput.readUTF();
		FARMACO_12_b = objectInput.readUTF();
		FARMACO_12_b_13 = objectInput.readUTF();
		FARMACO_12_b_14 = objectInput.readUTF();
		FARMACO_12_b_15 = objectInput.readUTF();
		FARMACO_12_b_16_1 = objectInput.readUTF();
		FARMACO_12_b_16_2 = objectInput.readUTF();
		FARMACO_12_b_17 = objectInput.readUTF();
		FARMACO_12_b_18 = objectInput.readUTF();
		FARMACO_12_b_19 = objectInput.readUTF();
		FARMACO_12_b_20 = objectInput.readUTF();
		FARMACO_12_c = objectInput.readUTF();
		FARMACO_12_c_13 = objectInput.readUTF();
		FARMACO_12_c_14 = objectInput.readUTF();
		FARMACO_12_c_15 = objectInput.readUTF();
		FARMACO_12_c_16_1 = objectInput.readUTF();
		FARMACO_12_c_16_2 = objectInput.readUTF();
		FARMACO_12_c_17 = objectInput.readUTF();
		FARMACO_12_c_18 = objectInput.readUTF();
		FARMACO_12_c_19 = objectInput.readUTF();
		FARMACO_12_c_20 = objectInput.readUTF();
		INDICAZIONI_21_a = objectInput.readUTF();
		INDICAZIONI_21_b = objectInput.readUTF();
		INDICAZIONI_21_c = objectInput.readUTF();
		FARMACO_22_a = objectInput.readUTF();
		FARMACO_22_a_23 = objectInput.readUTF();
		FARMACO_22_a_24 = objectInput.readUTF();
		FARMACO_22_a_25 = objectInput.readUTF();
		FARMACO_22_a_26_1 = objectInput.readUTF();
		FARMACO_22_a_26_2 = objectInput.readUTF();
		FARMACO_22_a_27 = objectInput.readUTF();
		FARMACO_22_a_28 = objectInput.readUTF();
		FARMACO_22_a_29 = objectInput.readUTF();
		FARMACO_22_a_30 = objectInput.readUTF();
		FARMACO_22_b = objectInput.readUTF();
		FARMACO_22_b_23 = objectInput.readUTF();
		FARMACO_22_b_24 = objectInput.readUTF();
		FARMACO_22_b_25 = objectInput.readUTF();
		FARMACO_22_b_26_1 = objectInput.readUTF();
		FARMACO_22_b_26_2 = objectInput.readUTF();
		FARMACO_22_b_27 = objectInput.readUTF();
		FARMACO_22_b_28 = objectInput.readUTF();
		FARMACO_22_b_29 = objectInput.readUTF();
		FARMACO_22_b_30 = objectInput.readUTF();
		INDICAZIONI_31_a = objectInput.readUTF();
		INDICAZIONI_31_b = objectInput.readUTF();
		USO_32 = objectInput.readUTF();
		CONDIZIONI_33 = objectInput.readUTF();
		ALTRE_34 = objectInput.readUTF();
		INDICARE_35_1 = objectInput.readUTF();
		INDICARE_35_2 = objectInput.readUTF();
		INDICARE_35_3 = objectInput.readUTF();
		INDICARE_35_4 = objectInput.readUTF();
		INDICARE_35_5 = objectInput.readUTF();
		INDICARE_35_6 = objectInput.readUTF();
		QUALIFICA_36_1 = objectInput.readUTF();
		QUALIFICA_36_2 = objectInput.readUTF();
		QUALIFICA_36_3 = objectInput.readUTF();
		QUALIFICA_36_4 = objectInput.readUTF();
		QUALIFICA_36_5 = objectInput.readUTF();
		QUALIFICA_36_6 = objectInput.readUTF();
		QUALIFICA_36_7 = objectInput.readUTF();
		QUALIFICA_36_8 = objectInput.readUTF();
		QUALIFICA_36_9 = objectInput.readUTF();
		QUALIFICA_36_10 = objectInput.readUTF();
		DATI_37_1 = objectInput.readUTF();
		DATI_37_2 = objectInput.readUTF();
		DATI_37_3 = objectInput.readUTF();
		DATI_37_4 = objectInput.readUTF();
		ASL_38 = objectInput.readUTF();
		REGIONE_39 = objectInput.readUTF();
		DATA_40 = objectInput.readUTF();
		FIRMA_41 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Form_di_segnalazione_id);

		if (CODICE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CODICE);
		}

		if (INIZIALI_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INIZIALI_1);
		}

		if (INIZIALI_1_a == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INIZIALI_1_a);
		}

		if (INIZIALI_1_b == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INIZIALI_1_b);
		}

		if (INIZIALI_1_c == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INIZIALI_1_c);
		}

		if (INIZIALI_1_d == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INIZIALI_1_d);
		}

		if (INIZIALI_1_e == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INIZIALI_1_e);
		}

		if (DATA_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DATA_2);
		}

		if (SESSO_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SESSO_3);
		}

		if (DATA_4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DATA_4);
		}

		if (ORIGINE_5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ORIGINE_5);
		}

		if (DESCRIZIONE_6 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DESCRIZIONE_6);
		}

		if (INDICARE_7_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_7_1);
		}

		if (INDICARE_7_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_7_2);
		}

		if (INDICARE_7_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_7_3);
		}

		if (INDICARE_7_4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_7_4);
		}

		if (INDICARE_7_5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_7_5);
		}

		if (INDICARE_7_6 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_7_6);
		}

		if (INDICARE_7_7 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_7_7);
		}

		if (GRAVITA_8_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GRAVITA_8_1);
		}

		if (GRAVITA_8_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GRAVITA_8_2);
		}

		if (GRAVITA_8_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GRAVITA_8_3);
		}

		if (GRAVITA_8_4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GRAVITA_8_4);
		}

		if (GRAVITA_8_5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GRAVITA_8_5);
		}

		if (GRAVITA_8_6 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GRAVITA_8_6);
		}

		if (GRAVITA_8_7 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GRAVITA_8_7);
		}

		if (EVENTUALI_9 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EVENTUALI_9);
		}

		if (ESITO_10 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10);
		}

		if (ESITO_10_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_1);
		}

		if (ESITO_10_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_2);
		}

		if (ESITO_10_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_3);
		}

		if (ESITO_10_4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_4);
		}

		if (ESITO_10_5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_5);
		}

		if (ESITO_10_6 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_6);
		}

		if (ESITO_10_7 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_7);
		}

		if (ESITO_10_8 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_8);
		}

		if (ESITO_10_9 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_9);
		}

		if (ESITO_10_10 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ESITO_10_10);
		}

		if (AZIONI_11 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AZIONI_11);
		}

		if (FARMACO_12_a == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a);
		}

		if (FARMACO_12_a_13 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_13);
		}

		if (FARMACO_12_a_14 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_14);
		}

		if (FARMACO_12_a_15 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_15);
		}

		if (FARMACO_12_a_16_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_16_1);
		}

		if (FARMACO_12_a_16_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_16_2);
		}

		if (FARMACO_12_a_17 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_17);
		}

		if (FARMACO_12_a_18 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_18);
		}

		if (FARMACO_12_a_19 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_19);
		}

		if (FARMACO_12_a_20 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_a_20);
		}

		if (FARMACO_12_b == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b);
		}

		if (FARMACO_12_b_13 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_13);
		}

		if (FARMACO_12_b_14 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_14);
		}

		if (FARMACO_12_b_15 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_15);
		}

		if (FARMACO_12_b_16_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_16_1);
		}

		if (FARMACO_12_b_16_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_16_2);
		}

		if (FARMACO_12_b_17 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_17);
		}

		if (FARMACO_12_b_18 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_18);
		}

		if (FARMACO_12_b_19 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_19);
		}

		if (FARMACO_12_b_20 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_b_20);
		}

		if (FARMACO_12_c == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c);
		}

		if (FARMACO_12_c_13 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_13);
		}

		if (FARMACO_12_c_14 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_14);
		}

		if (FARMACO_12_c_15 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_15);
		}

		if (FARMACO_12_c_16_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_16_1);
		}

		if (FARMACO_12_c_16_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_16_2);
		}

		if (FARMACO_12_c_17 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_17);
		}

		if (FARMACO_12_c_18 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_18);
		}

		if (FARMACO_12_c_19 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_19);
		}

		if (FARMACO_12_c_20 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_12_c_20);
		}

		if (INDICAZIONI_21_a == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICAZIONI_21_a);
		}

		if (INDICAZIONI_21_b == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICAZIONI_21_b);
		}

		if (INDICAZIONI_21_c == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICAZIONI_21_c);
		}

		if (FARMACO_22_a == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a);
		}

		if (FARMACO_22_a_23 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_23);
		}

		if (FARMACO_22_a_24 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_24);
		}

		if (FARMACO_22_a_25 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_25);
		}

		if (FARMACO_22_a_26_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_26_1);
		}

		if (FARMACO_22_a_26_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_26_2);
		}

		if (FARMACO_22_a_27 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_27);
		}

		if (FARMACO_22_a_28 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_28);
		}

		if (FARMACO_22_a_29 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_29);
		}

		if (FARMACO_22_a_30 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_a_30);
		}

		if (FARMACO_22_b == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b);
		}

		if (FARMACO_22_b_23 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_23);
		}

		if (FARMACO_22_b_24 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_24);
		}

		if (FARMACO_22_b_25 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_25);
		}

		if (FARMACO_22_b_26_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_26_1);
		}

		if (FARMACO_22_b_26_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_26_2);
		}

		if (FARMACO_22_b_27 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_27);
		}

		if (FARMACO_22_b_28 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_28);
		}

		if (FARMACO_22_b_29 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_29);
		}

		if (FARMACO_22_b_30 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FARMACO_22_b_30);
		}

		if (INDICAZIONI_31_a == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICAZIONI_31_a);
		}

		if (INDICAZIONI_31_b == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICAZIONI_31_b);
		}

		if (USO_32 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(USO_32);
		}

		if (CONDIZIONI_33 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CONDIZIONI_33);
		}

		if (ALTRE_34 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ALTRE_34);
		}

		if (INDICARE_35_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_35_1);
		}

		if (INDICARE_35_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_35_2);
		}

		if (INDICARE_35_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_35_3);
		}

		if (INDICARE_35_4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_35_4);
		}

		if (INDICARE_35_5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_35_5);
		}

		if (INDICARE_35_6 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INDICARE_35_6);
		}

		if (QUALIFICA_36_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_1);
		}

		if (QUALIFICA_36_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_2);
		}

		if (QUALIFICA_36_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_3);
		}

		if (QUALIFICA_36_4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_4);
		}

		if (QUALIFICA_36_5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_5);
		}

		if (QUALIFICA_36_6 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_6);
		}

		if (QUALIFICA_36_7 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_7);
		}

		if (QUALIFICA_36_8 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_8);
		}

		if (QUALIFICA_36_9 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_9);
		}

		if (QUALIFICA_36_10 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALIFICA_36_10);
		}

		if (DATI_37_1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DATI_37_1);
		}

		if (DATI_37_2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DATI_37_2);
		}

		if (DATI_37_3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DATI_37_3);
		}

		if (DATI_37_4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DATI_37_4);
		}

		if (ASL_38 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ASL_38);
		}

		if (REGIONE_39 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(REGIONE_39);
		}

		if (DATA_40 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DATA_40);
		}

		if (FIRMA_41 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FIRMA_41);
		}
	}

	public long Form_di_segnalazione_id;
	public String CODICE;
	public String INIZIALI_1;
	public String INIZIALI_1_a;
	public String INIZIALI_1_b;
	public String INIZIALI_1_c;
	public String INIZIALI_1_d;
	public String INIZIALI_1_e;
	public String DATA_2;
	public String SESSO_3;
	public String DATA_4;
	public String ORIGINE_5;
	public String DESCRIZIONE_6;
	public String INDICARE_7_1;
	public String INDICARE_7_2;
	public String INDICARE_7_3;
	public String INDICARE_7_4;
	public String INDICARE_7_5;
	public String INDICARE_7_6;
	public String INDICARE_7_7;
	public String GRAVITA_8_1;
	public String GRAVITA_8_2;
	public String GRAVITA_8_3;
	public String GRAVITA_8_4;
	public String GRAVITA_8_5;
	public String GRAVITA_8_6;
	public String GRAVITA_8_7;
	public String EVENTUALI_9;
	public String ESITO_10;
	public String ESITO_10_1;
	public String ESITO_10_2;
	public String ESITO_10_3;
	public String ESITO_10_4;
	public String ESITO_10_5;
	public String ESITO_10_6;
	public String ESITO_10_7;
	public String ESITO_10_8;
	public String ESITO_10_9;
	public String ESITO_10_10;
	public String AZIONI_11;
	public String FARMACO_12_a;
	public String FARMACO_12_a_13;
	public String FARMACO_12_a_14;
	public String FARMACO_12_a_15;
	public String FARMACO_12_a_16_1;
	public String FARMACO_12_a_16_2;
	public String FARMACO_12_a_17;
	public String FARMACO_12_a_18;
	public String FARMACO_12_a_19;
	public String FARMACO_12_a_20;
	public String FARMACO_12_b;
	public String FARMACO_12_b_13;
	public String FARMACO_12_b_14;
	public String FARMACO_12_b_15;
	public String FARMACO_12_b_16_1;
	public String FARMACO_12_b_16_2;
	public String FARMACO_12_b_17;
	public String FARMACO_12_b_18;
	public String FARMACO_12_b_19;
	public String FARMACO_12_b_20;
	public String FARMACO_12_c;
	public String FARMACO_12_c_13;
	public String FARMACO_12_c_14;
	public String FARMACO_12_c_15;
	public String FARMACO_12_c_16_1;
	public String FARMACO_12_c_16_2;
	public String FARMACO_12_c_17;
	public String FARMACO_12_c_18;
	public String FARMACO_12_c_19;
	public String FARMACO_12_c_20;
	public String INDICAZIONI_21_a;
	public String INDICAZIONI_21_b;
	public String INDICAZIONI_21_c;
	public String FARMACO_22_a;
	public String FARMACO_22_a_23;
	public String FARMACO_22_a_24;
	public String FARMACO_22_a_25;
	public String FARMACO_22_a_26_1;
	public String FARMACO_22_a_26_2;
	public String FARMACO_22_a_27;
	public String FARMACO_22_a_28;
	public String FARMACO_22_a_29;
	public String FARMACO_22_a_30;
	public String FARMACO_22_b;
	public String FARMACO_22_b_23;
	public String FARMACO_22_b_24;
	public String FARMACO_22_b_25;
	public String FARMACO_22_b_26_1;
	public String FARMACO_22_b_26_2;
	public String FARMACO_22_b_27;
	public String FARMACO_22_b_28;
	public String FARMACO_22_b_29;
	public String FARMACO_22_b_30;
	public String INDICAZIONI_31_a;
	public String INDICAZIONI_31_b;
	public String USO_32;
	public String CONDIZIONI_33;
	public String ALTRE_34;
	public String INDICARE_35_1;
	public String INDICARE_35_2;
	public String INDICARE_35_3;
	public String INDICARE_35_4;
	public String INDICARE_35_5;
	public String INDICARE_35_6;
	public String QUALIFICA_36_1;
	public String QUALIFICA_36_2;
	public String QUALIFICA_36_3;
	public String QUALIFICA_36_4;
	public String QUALIFICA_36_5;
	public String QUALIFICA_36_6;
	public String QUALIFICA_36_7;
	public String QUALIFICA_36_8;
	public String QUALIFICA_36_9;
	public String QUALIFICA_36_10;
	public String DATI_37_1;
	public String DATI_37_2;
	public String DATI_37_3;
	public String DATI_37_4;
	public String ASL_38;
	public String REGIONE_39;
	public String DATA_40;
	public String FIRMA_41;
}
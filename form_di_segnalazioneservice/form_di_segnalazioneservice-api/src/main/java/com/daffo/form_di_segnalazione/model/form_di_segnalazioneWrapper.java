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

package com.daffo.form_di_segnalazione.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link form_di_segnalazione}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see form_di_segnalazione
 * @generated
 */
@ProviderType
public class form_di_segnalazioneWrapper implements form_di_segnalazione,
	ModelWrapper<form_di_segnalazione> {
	public form_di_segnalazioneWrapper(
		form_di_segnalazione form_di_segnalazione) {
		_form_di_segnalazione = form_di_segnalazione;
	}

	@Override
	public Class<?> getModelClass() {
		return form_di_segnalazione.class;
	}

	@Override
	public String getModelClassName() {
		return form_di_segnalazione.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Form_di_segnalazione_id", getForm_di_segnalazione_id());
		attributes.put("CODICE", getCODICE());
		attributes.put("INIZIALI_1", getINIZIALI_1());
		attributes.put("INIZIALI_1_a", getINIZIALI_1_a());
		attributes.put("INIZIALI_1_b", getINIZIALI_1_b());
		attributes.put("INIZIALI_1_c", getINIZIALI_1_c());
		attributes.put("INIZIALI_1_d", getINIZIALI_1_d());
		attributes.put("INIZIALI_1_e", getINIZIALI_1_e());
		attributes.put("DATA_2", getDATA_2());
		attributes.put("SESSO_3", getSESSO_3());
		attributes.put("DATA_4", getDATA_4());
		attributes.put("ORIGINE_5", getORIGINE_5());
		attributes.put("DESCRIZIONE_6", getDESCRIZIONE_6());
		attributes.put("INDICARE_7_1", getINDICARE_7_1());
		attributes.put("INDICARE_7_2", getINDICARE_7_2());
		attributes.put("INDICARE_7_3", getINDICARE_7_3());
		attributes.put("INDICARE_7_4", getINDICARE_7_4());
		attributes.put("INDICARE_7_5", getINDICARE_7_5());
		attributes.put("INDICARE_7_6", getINDICARE_7_6());
		attributes.put("INDICARE_7_7", getINDICARE_7_7());
		attributes.put("GRAVITA_8_1", getGRAVITA_8_1());
		attributes.put("GRAVITA_8_2", getGRAVITA_8_2());
		attributes.put("GRAVITA_8_3", getGRAVITA_8_3());
		attributes.put("GRAVITA_8_4", getGRAVITA_8_4());
		attributes.put("GRAVITA_8_5", getGRAVITA_8_5());
		attributes.put("GRAVITA_8_6", getGRAVITA_8_6());
		attributes.put("GRAVITA_8_7", getGRAVITA_8_7());
		attributes.put("EVENTUALI_9", getEVENTUALI_9());
		attributes.put("ESITO_10", getESITO_10());
		attributes.put("ESITO_10_1", getESITO_10_1());
		attributes.put("ESITO_10_2", getESITO_10_2());
		attributes.put("ESITO_10_3", getESITO_10_3());
		attributes.put("ESITO_10_4", getESITO_10_4());
		attributes.put("ESITO_10_5", getESITO_10_5());
		attributes.put("ESITO_10_6", getESITO_10_6());
		attributes.put("ESITO_10_7", getESITO_10_7());
		attributes.put("ESITO_10_8", getESITO_10_8());
		attributes.put("ESITO_10_9", getESITO_10_9());
		attributes.put("ESITO_10_10", getESITO_10_10());
		attributes.put("AZIONI_11", getAZIONI_11());
		attributes.put("FARMACO_12_a", getFARMACO_12_a());
		attributes.put("FARMACO_12_a_13", getFARMACO_12_a_13());
		attributes.put("FARMACO_12_a_14", getFARMACO_12_a_14());
		attributes.put("FARMACO_12_a_15", getFARMACO_12_a_15());
		attributes.put("FARMACO_12_a_16_1", getFARMACO_12_a_16_1());
		attributes.put("FARMACO_12_a_16_2", getFARMACO_12_a_16_2());
		attributes.put("FARMACO_12_a_17", getFARMACO_12_a_17());
		attributes.put("FARMACO_12_a_18", getFARMACO_12_a_18());
		attributes.put("FARMACO_12_a_19", getFARMACO_12_a_19());
		attributes.put("FARMACO_12_a_20", getFARMACO_12_a_20());
		attributes.put("FARMACO_12_b", getFARMACO_12_b());
		attributes.put("FARMACO_12_b_13", getFARMACO_12_b_13());
		attributes.put("FARMACO_12_b_14", getFARMACO_12_b_14());
		attributes.put("FARMACO_12_b_15", getFARMACO_12_b_15());
		attributes.put("FARMACO_12_b_16_1", getFARMACO_12_b_16_1());
		attributes.put("FARMACO_12_b_16_2", getFARMACO_12_b_16_2());
		attributes.put("FARMACO_12_b_17", getFARMACO_12_b_17());
		attributes.put("FARMACO_12_b_18", getFARMACO_12_b_18());
		attributes.put("FARMACO_12_b_19", getFARMACO_12_b_19());
		attributes.put("FARMACO_12_b_20", getFARMACO_12_b_20());
		attributes.put("FARMACO_12_c", getFARMACO_12_c());
		attributes.put("FARMACO_12_c_13", getFARMACO_12_c_13());
		attributes.put("FARMACO_12_c_14", getFARMACO_12_c_14());
		attributes.put("FARMACO_12_c_15", getFARMACO_12_c_15());
		attributes.put("FARMACO_12_c_16_1", getFARMACO_12_c_16_1());
		attributes.put("FARMACO_12_c_16_2", getFARMACO_12_c_16_2());
		attributes.put("FARMACO_12_c_17", getFARMACO_12_c_17());
		attributes.put("FARMACO_12_c_18", getFARMACO_12_c_18());
		attributes.put("FARMACO_12_c_19", getFARMACO_12_c_19());
		attributes.put("FARMACO_12_c_20", getFARMACO_12_c_20());
		attributes.put("INDICAZIONI_21_a", getINDICAZIONI_21_a());
		attributes.put("INDICAZIONI_21_b", getINDICAZIONI_21_b());
		attributes.put("INDICAZIONI_21_c", getINDICAZIONI_21_c());
		attributes.put("FARMACO_22_a", getFARMACO_22_a());
		attributes.put("FARMACO_22_a_23", getFARMACO_22_a_23());
		attributes.put("FARMACO_22_a_24", getFARMACO_22_a_24());
		attributes.put("FARMACO_22_a_25", getFARMACO_22_a_25());
		attributes.put("FARMACO_22_a_26_1", getFARMACO_22_a_26_1());
		attributes.put("FARMACO_22_a_26_2", getFARMACO_22_a_26_2());
		attributes.put("FARMACO_22_a_27", getFARMACO_22_a_27());
		attributes.put("FARMACO_22_a_28", getFARMACO_22_a_28());
		attributes.put("FARMACO_22_a_29", getFARMACO_22_a_29());
		attributes.put("FARMACO_22_a_30", getFARMACO_22_a_30());
		attributes.put("FARMACO_22_b", getFARMACO_22_b());
		attributes.put("FARMACO_22_b_23", getFARMACO_22_b_23());
		attributes.put("FARMACO_22_b_24", getFARMACO_22_b_24());
		attributes.put("FARMACO_22_b_25", getFARMACO_22_b_25());
		attributes.put("FARMACO_22_b_26_1", getFARMACO_22_b_26_1());
		attributes.put("FARMACO_22_b_26_2", getFARMACO_22_b_26_2());
		attributes.put("FARMACO_22_b_27", getFARMACO_22_b_27());
		attributes.put("FARMACO_22_b_28", getFARMACO_22_b_28());
		attributes.put("FARMACO_22_b_29", getFARMACO_22_b_29());
		attributes.put("FARMACO_22_b_30", getFARMACO_22_b_30());
		attributes.put("INDICAZIONI_31_a", getINDICAZIONI_31_a());
		attributes.put("INDICAZIONI_31_b", getINDICAZIONI_31_b());
		attributes.put("USO_32", getUSO_32());
		attributes.put("CONDIZIONI_33", getCONDIZIONI_33());
		attributes.put("ALTRE_34", getALTRE_34());
		attributes.put("INDICARE_35_1", getINDICARE_35_1());
		attributes.put("INDICARE_35_2", getINDICARE_35_2());
		attributes.put("INDICARE_35_3", getINDICARE_35_3());
		attributes.put("INDICARE_35_4", getINDICARE_35_4());
		attributes.put("INDICARE_35_5", getINDICARE_35_5());
		attributes.put("INDICARE_35_6", getINDICARE_35_6());
		attributes.put("QUALIFICA_36_1", getQUALIFICA_36_1());
		attributes.put("QUALIFICA_36_2", getQUALIFICA_36_2());
		attributes.put("QUALIFICA_36_3", getQUALIFICA_36_3());
		attributes.put("QUALIFICA_36_4", getQUALIFICA_36_4());
		attributes.put("QUALIFICA_36_5", getQUALIFICA_36_5());
		attributes.put("QUALIFICA_36_6", getQUALIFICA_36_6());
		attributes.put("QUALIFICA_36_7", getQUALIFICA_36_7());
		attributes.put("QUALIFICA_36_8", getQUALIFICA_36_8());
		attributes.put("QUALIFICA_36_9", getQUALIFICA_36_9());
		attributes.put("QUALIFICA_36_10", getQUALIFICA_36_10());
		attributes.put("DATI_37_1", getDATI_37_1());
		attributes.put("DATI_37_2", getDATI_37_2());
		attributes.put("DATI_37_3", getDATI_37_3());
		attributes.put("DATI_37_4", getDATI_37_4());
		attributes.put("ASL_38", getASL_38());
		attributes.put("REGIONE_39", getREGIONE_39());
		attributes.put("DATA_40", getDATA_40());
		attributes.put("FIRMA_41", getFIRMA_41());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Form_di_segnalazione_id = (Long)attributes.get(
				"Form_di_segnalazione_id");

		if (Form_di_segnalazione_id != null) {
			setForm_di_segnalazione_id(Form_di_segnalazione_id);
		}

		String CODICE = (String)attributes.get("CODICE");

		if (CODICE != null) {
			setCODICE(CODICE);
		}

		String INIZIALI_1 = (String)attributes.get("INIZIALI_1");

		if (INIZIALI_1 != null) {
			setINIZIALI_1(INIZIALI_1);
		}

		String INIZIALI_1_a = (String)attributes.get("INIZIALI_1_a");

		if (INIZIALI_1_a != null) {
			setINIZIALI_1_a(INIZIALI_1_a);
		}

		String INIZIALI_1_b = (String)attributes.get("INIZIALI_1_b");

		if (INIZIALI_1_b != null) {
			setINIZIALI_1_b(INIZIALI_1_b);
		}

		String INIZIALI_1_c = (String)attributes.get("INIZIALI_1_c");

		if (INIZIALI_1_c != null) {
			setINIZIALI_1_c(INIZIALI_1_c);
		}

		String INIZIALI_1_d = (String)attributes.get("INIZIALI_1_d");

		if (INIZIALI_1_d != null) {
			setINIZIALI_1_d(INIZIALI_1_d);
		}

		String INIZIALI_1_e = (String)attributes.get("INIZIALI_1_e");

		if (INIZIALI_1_e != null) {
			setINIZIALI_1_e(INIZIALI_1_e);
		}

		String DATA_2 = (String)attributes.get("DATA_2");

		if (DATA_2 != null) {
			setDATA_2(DATA_2);
		}

		String SESSO_3 = (String)attributes.get("SESSO_3");

		if (SESSO_3 != null) {
			setSESSO_3(SESSO_3);
		}

		String DATA_4 = (String)attributes.get("DATA_4");

		if (DATA_4 != null) {
			setDATA_4(DATA_4);
		}

		String ORIGINE_5 = (String)attributes.get("ORIGINE_5");

		if (ORIGINE_5 != null) {
			setORIGINE_5(ORIGINE_5);
		}

		String DESCRIZIONE_6 = (String)attributes.get("DESCRIZIONE_6");

		if (DESCRIZIONE_6 != null) {
			setDESCRIZIONE_6(DESCRIZIONE_6);
		}

		String INDICARE_7_1 = (String)attributes.get("INDICARE_7_1");

		if (INDICARE_7_1 != null) {
			setINDICARE_7_1(INDICARE_7_1);
		}

		String INDICARE_7_2 = (String)attributes.get("INDICARE_7_2");

		if (INDICARE_7_2 != null) {
			setINDICARE_7_2(INDICARE_7_2);
		}

		String INDICARE_7_3 = (String)attributes.get("INDICARE_7_3");

		if (INDICARE_7_3 != null) {
			setINDICARE_7_3(INDICARE_7_3);
		}

		String INDICARE_7_4 = (String)attributes.get("INDICARE_7_4");

		if (INDICARE_7_4 != null) {
			setINDICARE_7_4(INDICARE_7_4);
		}

		String INDICARE_7_5 = (String)attributes.get("INDICARE_7_5");

		if (INDICARE_7_5 != null) {
			setINDICARE_7_5(INDICARE_7_5);
		}

		String INDICARE_7_6 = (String)attributes.get("INDICARE_7_6");

		if (INDICARE_7_6 != null) {
			setINDICARE_7_6(INDICARE_7_6);
		}

		String INDICARE_7_7 = (String)attributes.get("INDICARE_7_7");

		if (INDICARE_7_7 != null) {
			setINDICARE_7_7(INDICARE_7_7);
		}

		String GRAVITA_8_1 = (String)attributes.get("GRAVITA_8_1");

		if (GRAVITA_8_1 != null) {
			setGRAVITA_8_1(GRAVITA_8_1);
		}

		String GRAVITA_8_2 = (String)attributes.get("GRAVITA_8_2");

		if (GRAVITA_8_2 != null) {
			setGRAVITA_8_2(GRAVITA_8_2);
		}

		String GRAVITA_8_3 = (String)attributes.get("GRAVITA_8_3");

		if (GRAVITA_8_3 != null) {
			setGRAVITA_8_3(GRAVITA_8_3);
		}

		String GRAVITA_8_4 = (String)attributes.get("GRAVITA_8_4");

		if (GRAVITA_8_4 != null) {
			setGRAVITA_8_4(GRAVITA_8_4);
		}

		String GRAVITA_8_5 = (String)attributes.get("GRAVITA_8_5");

		if (GRAVITA_8_5 != null) {
			setGRAVITA_8_5(GRAVITA_8_5);
		}

		String GRAVITA_8_6 = (String)attributes.get("GRAVITA_8_6");

		if (GRAVITA_8_6 != null) {
			setGRAVITA_8_6(GRAVITA_8_6);
		}

		String GRAVITA_8_7 = (String)attributes.get("GRAVITA_8_7");

		if (GRAVITA_8_7 != null) {
			setGRAVITA_8_7(GRAVITA_8_7);
		}

		String EVENTUALI_9 = (String)attributes.get("EVENTUALI_9");

		if (EVENTUALI_9 != null) {
			setEVENTUALI_9(EVENTUALI_9);
		}

		String ESITO_10 = (String)attributes.get("ESITO_10");

		if (ESITO_10 != null) {
			setESITO_10(ESITO_10);
		}

		String ESITO_10_1 = (String)attributes.get("ESITO_10_1");

		if (ESITO_10_1 != null) {
			setESITO_10_1(ESITO_10_1);
		}

		String ESITO_10_2 = (String)attributes.get("ESITO_10_2");

		if (ESITO_10_2 != null) {
			setESITO_10_2(ESITO_10_2);
		}

		String ESITO_10_3 = (String)attributes.get("ESITO_10_3");

		if (ESITO_10_3 != null) {
			setESITO_10_3(ESITO_10_3);
		}

		String ESITO_10_4 = (String)attributes.get("ESITO_10_4");

		if (ESITO_10_4 != null) {
			setESITO_10_4(ESITO_10_4);
		}

		String ESITO_10_5 = (String)attributes.get("ESITO_10_5");

		if (ESITO_10_5 != null) {
			setESITO_10_5(ESITO_10_5);
		}

		String ESITO_10_6 = (String)attributes.get("ESITO_10_6");

		if (ESITO_10_6 != null) {
			setESITO_10_6(ESITO_10_6);
		}

		String ESITO_10_7 = (String)attributes.get("ESITO_10_7");

		if (ESITO_10_7 != null) {
			setESITO_10_7(ESITO_10_7);
		}

		String ESITO_10_8 = (String)attributes.get("ESITO_10_8");

		if (ESITO_10_8 != null) {
			setESITO_10_8(ESITO_10_8);
		}

		String ESITO_10_9 = (String)attributes.get("ESITO_10_9");

		if (ESITO_10_9 != null) {
			setESITO_10_9(ESITO_10_9);
		}

		String ESITO_10_10 = (String)attributes.get("ESITO_10_10");

		if (ESITO_10_10 != null) {
			setESITO_10_10(ESITO_10_10);
		}

		String AZIONI_11 = (String)attributes.get("AZIONI_11");

		if (AZIONI_11 != null) {
			setAZIONI_11(AZIONI_11);
		}

		String FARMACO_12_a = (String)attributes.get("FARMACO_12_a");

		if (FARMACO_12_a != null) {
			setFARMACO_12_a(FARMACO_12_a);
		}

		String FARMACO_12_a_13 = (String)attributes.get("FARMACO_12_a_13");

		if (FARMACO_12_a_13 != null) {
			setFARMACO_12_a_13(FARMACO_12_a_13);
		}

		String FARMACO_12_a_14 = (String)attributes.get("FARMACO_12_a_14");

		if (FARMACO_12_a_14 != null) {
			setFARMACO_12_a_14(FARMACO_12_a_14);
		}

		String FARMACO_12_a_15 = (String)attributes.get("FARMACO_12_a_15");

		if (FARMACO_12_a_15 != null) {
			setFARMACO_12_a_15(FARMACO_12_a_15);
		}

		String FARMACO_12_a_16_1 = (String)attributes.get("FARMACO_12_a_16_1");

		if (FARMACO_12_a_16_1 != null) {
			setFARMACO_12_a_16_1(FARMACO_12_a_16_1);
		}

		String FARMACO_12_a_16_2 = (String)attributes.get("FARMACO_12_a_16_2");

		if (FARMACO_12_a_16_2 != null) {
			setFARMACO_12_a_16_2(FARMACO_12_a_16_2);
		}

		String FARMACO_12_a_17 = (String)attributes.get("FARMACO_12_a_17");

		if (FARMACO_12_a_17 != null) {
			setFARMACO_12_a_17(FARMACO_12_a_17);
		}

		String FARMACO_12_a_18 = (String)attributes.get("FARMACO_12_a_18");

		if (FARMACO_12_a_18 != null) {
			setFARMACO_12_a_18(FARMACO_12_a_18);
		}

		String FARMACO_12_a_19 = (String)attributes.get("FARMACO_12_a_19");

		if (FARMACO_12_a_19 != null) {
			setFARMACO_12_a_19(FARMACO_12_a_19);
		}

		String FARMACO_12_a_20 = (String)attributes.get("FARMACO_12_a_20");

		if (FARMACO_12_a_20 != null) {
			setFARMACO_12_a_20(FARMACO_12_a_20);
		}

		String FARMACO_12_b = (String)attributes.get("FARMACO_12_b");

		if (FARMACO_12_b != null) {
			setFARMACO_12_b(FARMACO_12_b);
		}

		String FARMACO_12_b_13 = (String)attributes.get("FARMACO_12_b_13");

		if (FARMACO_12_b_13 != null) {
			setFARMACO_12_b_13(FARMACO_12_b_13);
		}

		String FARMACO_12_b_14 = (String)attributes.get("FARMACO_12_b_14");

		if (FARMACO_12_b_14 != null) {
			setFARMACO_12_b_14(FARMACO_12_b_14);
		}

		String FARMACO_12_b_15 = (String)attributes.get("FARMACO_12_b_15");

		if (FARMACO_12_b_15 != null) {
			setFARMACO_12_b_15(FARMACO_12_b_15);
		}

		String FARMACO_12_b_16_1 = (String)attributes.get("FARMACO_12_b_16_1");

		if (FARMACO_12_b_16_1 != null) {
			setFARMACO_12_b_16_1(FARMACO_12_b_16_1);
		}

		String FARMACO_12_b_16_2 = (String)attributes.get("FARMACO_12_b_16_2");

		if (FARMACO_12_b_16_2 != null) {
			setFARMACO_12_b_16_2(FARMACO_12_b_16_2);
		}

		String FARMACO_12_b_17 = (String)attributes.get("FARMACO_12_b_17");

		if (FARMACO_12_b_17 != null) {
			setFARMACO_12_b_17(FARMACO_12_b_17);
		}

		String FARMACO_12_b_18 = (String)attributes.get("FARMACO_12_b_18");

		if (FARMACO_12_b_18 != null) {
			setFARMACO_12_b_18(FARMACO_12_b_18);
		}

		String FARMACO_12_b_19 = (String)attributes.get("FARMACO_12_b_19");

		if (FARMACO_12_b_19 != null) {
			setFARMACO_12_b_19(FARMACO_12_b_19);
		}

		String FARMACO_12_b_20 = (String)attributes.get("FARMACO_12_b_20");

		if (FARMACO_12_b_20 != null) {
			setFARMACO_12_b_20(FARMACO_12_b_20);
		}

		String FARMACO_12_c = (String)attributes.get("FARMACO_12_c");

		if (FARMACO_12_c != null) {
			setFARMACO_12_c(FARMACO_12_c);
		}

		String FARMACO_12_c_13 = (String)attributes.get("FARMACO_12_c_13");

		if (FARMACO_12_c_13 != null) {
			setFARMACO_12_c_13(FARMACO_12_c_13);
		}

		String FARMACO_12_c_14 = (String)attributes.get("FARMACO_12_c_14");

		if (FARMACO_12_c_14 != null) {
			setFARMACO_12_c_14(FARMACO_12_c_14);
		}

		String FARMACO_12_c_15 = (String)attributes.get("FARMACO_12_c_15");

		if (FARMACO_12_c_15 != null) {
			setFARMACO_12_c_15(FARMACO_12_c_15);
		}

		String FARMACO_12_c_16_1 = (String)attributes.get("FARMACO_12_c_16_1");

		if (FARMACO_12_c_16_1 != null) {
			setFARMACO_12_c_16_1(FARMACO_12_c_16_1);
		}

		String FARMACO_12_c_16_2 = (String)attributes.get("FARMACO_12_c_16_2");

		if (FARMACO_12_c_16_2 != null) {
			setFARMACO_12_c_16_2(FARMACO_12_c_16_2);
		}

		String FARMACO_12_c_17 = (String)attributes.get("FARMACO_12_c_17");

		if (FARMACO_12_c_17 != null) {
			setFARMACO_12_c_17(FARMACO_12_c_17);
		}

		String FARMACO_12_c_18 = (String)attributes.get("FARMACO_12_c_18");

		if (FARMACO_12_c_18 != null) {
			setFARMACO_12_c_18(FARMACO_12_c_18);
		}

		String FARMACO_12_c_19 = (String)attributes.get("FARMACO_12_c_19");

		if (FARMACO_12_c_19 != null) {
			setFARMACO_12_c_19(FARMACO_12_c_19);
		}

		String FARMACO_12_c_20 = (String)attributes.get("FARMACO_12_c_20");

		if (FARMACO_12_c_20 != null) {
			setFARMACO_12_c_20(FARMACO_12_c_20);
		}

		String INDICAZIONI_21_a = (String)attributes.get("INDICAZIONI_21_a");

		if (INDICAZIONI_21_a != null) {
			setINDICAZIONI_21_a(INDICAZIONI_21_a);
		}

		String INDICAZIONI_21_b = (String)attributes.get("INDICAZIONI_21_b");

		if (INDICAZIONI_21_b != null) {
			setINDICAZIONI_21_b(INDICAZIONI_21_b);
		}

		String INDICAZIONI_21_c = (String)attributes.get("INDICAZIONI_21_c");

		if (INDICAZIONI_21_c != null) {
			setINDICAZIONI_21_c(INDICAZIONI_21_c);
		}

		String FARMACO_22_a = (String)attributes.get("FARMACO_22_a");

		if (FARMACO_22_a != null) {
			setFARMACO_22_a(FARMACO_22_a);
		}

		String FARMACO_22_a_23 = (String)attributes.get("FARMACO_22_a_23");

		if (FARMACO_22_a_23 != null) {
			setFARMACO_22_a_23(FARMACO_22_a_23);
		}

		String FARMACO_22_a_24 = (String)attributes.get("FARMACO_22_a_24");

		if (FARMACO_22_a_24 != null) {
			setFARMACO_22_a_24(FARMACO_22_a_24);
		}

		String FARMACO_22_a_25 = (String)attributes.get("FARMACO_22_a_25");

		if (FARMACO_22_a_25 != null) {
			setFARMACO_22_a_25(FARMACO_22_a_25);
		}

		String FARMACO_22_a_26_1 = (String)attributes.get("FARMACO_22_a_26_1");

		if (FARMACO_22_a_26_1 != null) {
			setFARMACO_22_a_26_1(FARMACO_22_a_26_1);
		}

		String FARMACO_22_a_26_2 = (String)attributes.get("FARMACO_22_a_26_2");

		if (FARMACO_22_a_26_2 != null) {
			setFARMACO_22_a_26_2(FARMACO_22_a_26_2);
		}

		String FARMACO_22_a_27 = (String)attributes.get("FARMACO_22_a_27");

		if (FARMACO_22_a_27 != null) {
			setFARMACO_22_a_27(FARMACO_22_a_27);
		}

		String FARMACO_22_a_28 = (String)attributes.get("FARMACO_22_a_28");

		if (FARMACO_22_a_28 != null) {
			setFARMACO_22_a_28(FARMACO_22_a_28);
		}

		String FARMACO_22_a_29 = (String)attributes.get("FARMACO_22_a_29");

		if (FARMACO_22_a_29 != null) {
			setFARMACO_22_a_29(FARMACO_22_a_29);
		}

		String FARMACO_22_a_30 = (String)attributes.get("FARMACO_22_a_30");

		if (FARMACO_22_a_30 != null) {
			setFARMACO_22_a_30(FARMACO_22_a_30);
		}

		String FARMACO_22_b = (String)attributes.get("FARMACO_22_b");

		if (FARMACO_22_b != null) {
			setFARMACO_22_b(FARMACO_22_b);
		}

		String FARMACO_22_b_23 = (String)attributes.get("FARMACO_22_b_23");

		if (FARMACO_22_b_23 != null) {
			setFARMACO_22_b_23(FARMACO_22_b_23);
		}

		String FARMACO_22_b_24 = (String)attributes.get("FARMACO_22_b_24");

		if (FARMACO_22_b_24 != null) {
			setFARMACO_22_b_24(FARMACO_22_b_24);
		}

		String FARMACO_22_b_25 = (String)attributes.get("FARMACO_22_b_25");

		if (FARMACO_22_b_25 != null) {
			setFARMACO_22_b_25(FARMACO_22_b_25);
		}

		String FARMACO_22_b_26_1 = (String)attributes.get("FARMACO_22_b_26_1");

		if (FARMACO_22_b_26_1 != null) {
			setFARMACO_22_b_26_1(FARMACO_22_b_26_1);
		}

		String FARMACO_22_b_26_2 = (String)attributes.get("FARMACO_22_b_26_2");

		if (FARMACO_22_b_26_2 != null) {
			setFARMACO_22_b_26_2(FARMACO_22_b_26_2);
		}

		String FARMACO_22_b_27 = (String)attributes.get("FARMACO_22_b_27");

		if (FARMACO_22_b_27 != null) {
			setFARMACO_22_b_27(FARMACO_22_b_27);
		}

		String FARMACO_22_b_28 = (String)attributes.get("FARMACO_22_b_28");

		if (FARMACO_22_b_28 != null) {
			setFARMACO_22_b_28(FARMACO_22_b_28);
		}

		String FARMACO_22_b_29 = (String)attributes.get("FARMACO_22_b_29");

		if (FARMACO_22_b_29 != null) {
			setFARMACO_22_b_29(FARMACO_22_b_29);
		}

		String FARMACO_22_b_30 = (String)attributes.get("FARMACO_22_b_30");

		if (FARMACO_22_b_30 != null) {
			setFARMACO_22_b_30(FARMACO_22_b_30);
		}

		String INDICAZIONI_31_a = (String)attributes.get("INDICAZIONI_31_a");

		if (INDICAZIONI_31_a != null) {
			setINDICAZIONI_31_a(INDICAZIONI_31_a);
		}

		String INDICAZIONI_31_b = (String)attributes.get("INDICAZIONI_31_b");

		if (INDICAZIONI_31_b != null) {
			setINDICAZIONI_31_b(INDICAZIONI_31_b);
		}

		String USO_32 = (String)attributes.get("USO_32");

		if (USO_32 != null) {
			setUSO_32(USO_32);
		}

		String CONDIZIONI_33 = (String)attributes.get("CONDIZIONI_33");

		if (CONDIZIONI_33 != null) {
			setCONDIZIONI_33(CONDIZIONI_33);
		}

		String ALTRE_34 = (String)attributes.get("ALTRE_34");

		if (ALTRE_34 != null) {
			setALTRE_34(ALTRE_34);
		}

		String INDICARE_35_1 = (String)attributes.get("INDICARE_35_1");

		if (INDICARE_35_1 != null) {
			setINDICARE_35_1(INDICARE_35_1);
		}

		String INDICARE_35_2 = (String)attributes.get("INDICARE_35_2");

		if (INDICARE_35_2 != null) {
			setINDICARE_35_2(INDICARE_35_2);
		}

		String INDICARE_35_3 = (String)attributes.get("INDICARE_35_3");

		if (INDICARE_35_3 != null) {
			setINDICARE_35_3(INDICARE_35_3);
		}

		String INDICARE_35_4 = (String)attributes.get("INDICARE_35_4");

		if (INDICARE_35_4 != null) {
			setINDICARE_35_4(INDICARE_35_4);
		}

		String INDICARE_35_5 = (String)attributes.get("INDICARE_35_5");

		if (INDICARE_35_5 != null) {
			setINDICARE_35_5(INDICARE_35_5);
		}

		String INDICARE_35_6 = (String)attributes.get("INDICARE_35_6");

		if (INDICARE_35_6 != null) {
			setINDICARE_35_6(INDICARE_35_6);
		}

		String QUALIFICA_36_1 = (String)attributes.get("QUALIFICA_36_1");

		if (QUALIFICA_36_1 != null) {
			setQUALIFICA_36_1(QUALIFICA_36_1);
		}

		String QUALIFICA_36_2 = (String)attributes.get("QUALIFICA_36_2");

		if (QUALIFICA_36_2 != null) {
			setQUALIFICA_36_2(QUALIFICA_36_2);
		}

		String QUALIFICA_36_3 = (String)attributes.get("QUALIFICA_36_3");

		if (QUALIFICA_36_3 != null) {
			setQUALIFICA_36_3(QUALIFICA_36_3);
		}

		String QUALIFICA_36_4 = (String)attributes.get("QUALIFICA_36_4");

		if (QUALIFICA_36_4 != null) {
			setQUALIFICA_36_4(QUALIFICA_36_4);
		}

		String QUALIFICA_36_5 = (String)attributes.get("QUALIFICA_36_5");

		if (QUALIFICA_36_5 != null) {
			setQUALIFICA_36_5(QUALIFICA_36_5);
		}

		String QUALIFICA_36_6 = (String)attributes.get("QUALIFICA_36_6");

		if (QUALIFICA_36_6 != null) {
			setQUALIFICA_36_6(QUALIFICA_36_6);
		}

		String QUALIFICA_36_7 = (String)attributes.get("QUALIFICA_36_7");

		if (QUALIFICA_36_7 != null) {
			setQUALIFICA_36_7(QUALIFICA_36_7);
		}

		String QUALIFICA_36_8 = (String)attributes.get("QUALIFICA_36_8");

		if (QUALIFICA_36_8 != null) {
			setQUALIFICA_36_8(QUALIFICA_36_8);
		}

		String QUALIFICA_36_9 = (String)attributes.get("QUALIFICA_36_9");

		if (QUALIFICA_36_9 != null) {
			setQUALIFICA_36_9(QUALIFICA_36_9);
		}

		String QUALIFICA_36_10 = (String)attributes.get("QUALIFICA_36_10");

		if (QUALIFICA_36_10 != null) {
			setQUALIFICA_36_10(QUALIFICA_36_10);
		}

		String DATI_37_1 = (String)attributes.get("DATI_37_1");

		if (DATI_37_1 != null) {
			setDATI_37_1(DATI_37_1);
		}

		String DATI_37_2 = (String)attributes.get("DATI_37_2");

		if (DATI_37_2 != null) {
			setDATI_37_2(DATI_37_2);
		}

		String DATI_37_3 = (String)attributes.get("DATI_37_3");

		if (DATI_37_3 != null) {
			setDATI_37_3(DATI_37_3);
		}

		String DATI_37_4 = (String)attributes.get("DATI_37_4");

		if (DATI_37_4 != null) {
			setDATI_37_4(DATI_37_4);
		}

		String ASL_38 = (String)attributes.get("ASL_38");

		if (ASL_38 != null) {
			setASL_38(ASL_38);
		}

		String REGIONE_39 = (String)attributes.get("REGIONE_39");

		if (REGIONE_39 != null) {
			setREGIONE_39(REGIONE_39);
		}

		String DATA_40 = (String)attributes.get("DATA_40");

		if (DATA_40 != null) {
			setDATA_40(DATA_40);
		}

		String FIRMA_41 = (String)attributes.get("FIRMA_41");

		if (FIRMA_41 != null) {
			setFIRMA_41(FIRMA_41);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _form_di_segnalazione.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _form_di_segnalazione.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _form_di_segnalazione.isNew();
	}

	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione toEscapedModel() {
		return new form_di_segnalazioneWrapper(_form_di_segnalazione.toEscapedModel());
	}

	@Override
	public com.daffo.form_di_segnalazione.model.form_di_segnalazione toUnescapedModel() {
		return new form_di_segnalazioneWrapper(_form_di_segnalazione.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _form_di_segnalazione.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.daffo.form_di_segnalazione.model.form_di_segnalazione> toCacheModel() {
		return _form_di_segnalazione.toCacheModel();
	}

	@Override
	public int compareTo(
		com.daffo.form_di_segnalazione.model.form_di_segnalazione form_di_segnalazione) {
		return _form_di_segnalazione.compareTo(form_di_segnalazione);
	}

	@Override
	public int hashCode() {
		return _form_di_segnalazione.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _form_di_segnalazione.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new form_di_segnalazioneWrapper((form_di_segnalazione)_form_di_segnalazione.clone());
	}

	/**
	* Returns the altre_34 of this form_di_segnalazione.
	*
	* @return the altre_34 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getALTRE_34() {
		return _form_di_segnalazione.getALTRE_34();
	}

	/**
	* Returns the asl_38 of this form_di_segnalazione.
	*
	* @return the asl_38 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getASL_38() {
		return _form_di_segnalazione.getASL_38();
	}

	/**
	* Returns the azioni_11 of this form_di_segnalazione.
	*
	* @return the azioni_11 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getAZIONI_11() {
		return _form_di_segnalazione.getAZIONI_11();
	}

	/**
	* Returns the codice of this form_di_segnalazione.
	*
	* @return the codice of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getCODICE() {
		return _form_di_segnalazione.getCODICE();
	}

	/**
	* Returns the condizioni_33 of this form_di_segnalazione.
	*
	* @return the condizioni_33 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getCONDIZIONI_33() {
		return _form_di_segnalazione.getCONDIZIONI_33();
	}

	/**
	* Returns the data_2 of this form_di_segnalazione.
	*
	* @return the data_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getDATA_2() {
		return _form_di_segnalazione.getDATA_2();
	}

	/**
	* Returns the data_4 of this form_di_segnalazione.
	*
	* @return the data_4 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getDATA_4() {
		return _form_di_segnalazione.getDATA_4();
	}

	/**
	* Returns the data_40 of this form_di_segnalazione.
	*
	* @return the data_40 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getDATA_40() {
		return _form_di_segnalazione.getDATA_40();
	}

	/**
	* Returns the dati_37_1 of this form_di_segnalazione.
	*
	* @return the dati_37_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getDATI_37_1() {
		return _form_di_segnalazione.getDATI_37_1();
	}

	/**
	* Returns the dati_37_2 of this form_di_segnalazione.
	*
	* @return the dati_37_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getDATI_37_2() {
		return _form_di_segnalazione.getDATI_37_2();
	}

	/**
	* Returns the dati_37_3 of this form_di_segnalazione.
	*
	* @return the dati_37_3 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getDATI_37_3() {
		return _form_di_segnalazione.getDATI_37_3();
	}

	/**
	* Returns the dati_37_4 of this form_di_segnalazione.
	*
	* @return the dati_37_4 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getDATI_37_4() {
		return _form_di_segnalazione.getDATI_37_4();
	}

	/**
	* Returns the descrizione_6 of this form_di_segnalazione.
	*
	* @return the descrizione_6 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getDESCRIZIONE_6() {
		return _form_di_segnalazione.getDESCRIZIONE_6();
	}

	/**
	* Returns the esito_10 of this form_di_segnalazione.
	*
	* @return the esito_10 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10() {
		return _form_di_segnalazione.getESITO_10();
	}

	/**
	* Returns the esito_10_1 of this form_di_segnalazione.
	*
	* @return the esito_10_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_1() {
		return _form_di_segnalazione.getESITO_10_1();
	}

	/**
	* Returns the esito_10_10 of this form_di_segnalazione.
	*
	* @return the esito_10_10 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_10() {
		return _form_di_segnalazione.getESITO_10_10();
	}

	/**
	* Returns the esito_10_2 of this form_di_segnalazione.
	*
	* @return the esito_10_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_2() {
		return _form_di_segnalazione.getESITO_10_2();
	}

	/**
	* Returns the esito_10_3 of this form_di_segnalazione.
	*
	* @return the esito_10_3 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_3() {
		return _form_di_segnalazione.getESITO_10_3();
	}

	/**
	* Returns the esito_10_4 of this form_di_segnalazione.
	*
	* @return the esito_10_4 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_4() {
		return _form_di_segnalazione.getESITO_10_4();
	}

	/**
	* Returns the esito_10_5 of this form_di_segnalazione.
	*
	* @return the esito_10_5 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_5() {
		return _form_di_segnalazione.getESITO_10_5();
	}

	/**
	* Returns the esito_10_6 of this form_di_segnalazione.
	*
	* @return the esito_10_6 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_6() {
		return _form_di_segnalazione.getESITO_10_6();
	}

	/**
	* Returns the esito_10_7 of this form_di_segnalazione.
	*
	* @return the esito_10_7 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_7() {
		return _form_di_segnalazione.getESITO_10_7();
	}

	/**
	* Returns the esito_10_8 of this form_di_segnalazione.
	*
	* @return the esito_10_8 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_8() {
		return _form_di_segnalazione.getESITO_10_8();
	}

	/**
	* Returns the esito_10_9 of this form_di_segnalazione.
	*
	* @return the esito_10_9 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getESITO_10_9() {
		return _form_di_segnalazione.getESITO_10_9();
	}

	/**
	* Returns the eventuali_9 of this form_di_segnalazione.
	*
	* @return the eventuali_9 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getEVENTUALI_9() {
		return _form_di_segnalazione.getEVENTUALI_9();
	}

	/**
	* Returns the farmaco_12_a of this form_di_segnalazione.
	*
	* @return the farmaco_12_a of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a() {
		return _form_di_segnalazione.getFARMACO_12_a();
	}

	/**
	* Returns the farmaco_12_a_13 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_13 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_13() {
		return _form_di_segnalazione.getFARMACO_12_a_13();
	}

	/**
	* Returns the farmaco_12_a_14 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_14 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_14() {
		return _form_di_segnalazione.getFARMACO_12_a_14();
	}

	/**
	* Returns the farmaco_12_a_15 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_15 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_15() {
		return _form_di_segnalazione.getFARMACO_12_a_15();
	}

	/**
	* Returns the farmaco_12_a_16_1 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_16_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_16_1() {
		return _form_di_segnalazione.getFARMACO_12_a_16_1();
	}

	/**
	* Returns the farmaco_12_a_16_2 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_16_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_16_2() {
		return _form_di_segnalazione.getFARMACO_12_a_16_2();
	}

	/**
	* Returns the farmaco_12_a_17 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_17 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_17() {
		return _form_di_segnalazione.getFARMACO_12_a_17();
	}

	/**
	* Returns the farmaco_12_a_18 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_18 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_18() {
		return _form_di_segnalazione.getFARMACO_12_a_18();
	}

	/**
	* Returns the farmaco_12_a_19 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_19 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_19() {
		return _form_di_segnalazione.getFARMACO_12_a_19();
	}

	/**
	* Returns the farmaco_12_a_20 of this form_di_segnalazione.
	*
	* @return the farmaco_12_a_20 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_a_20() {
		return _form_di_segnalazione.getFARMACO_12_a_20();
	}

	/**
	* Returns the farmaco_12_b of this form_di_segnalazione.
	*
	* @return the farmaco_12_b of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b() {
		return _form_di_segnalazione.getFARMACO_12_b();
	}

	/**
	* Returns the farmaco_12_b_13 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_13 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_13() {
		return _form_di_segnalazione.getFARMACO_12_b_13();
	}

	/**
	* Returns the farmaco_12_b_14 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_14 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_14() {
		return _form_di_segnalazione.getFARMACO_12_b_14();
	}

	/**
	* Returns the farmaco_12_b_15 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_15 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_15() {
		return _form_di_segnalazione.getFARMACO_12_b_15();
	}

	/**
	* Returns the farmaco_12_b_16_1 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_16_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_16_1() {
		return _form_di_segnalazione.getFARMACO_12_b_16_1();
	}

	/**
	* Returns the farmaco_12_b_16_2 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_16_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_16_2() {
		return _form_di_segnalazione.getFARMACO_12_b_16_2();
	}

	/**
	* Returns the farmaco_12_b_17 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_17 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_17() {
		return _form_di_segnalazione.getFARMACO_12_b_17();
	}

	/**
	* Returns the farmaco_12_b_18 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_18 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_18() {
		return _form_di_segnalazione.getFARMACO_12_b_18();
	}

	/**
	* Returns the farmaco_12_b_19 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_19 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_19() {
		return _form_di_segnalazione.getFARMACO_12_b_19();
	}

	/**
	* Returns the farmaco_12_b_20 of this form_di_segnalazione.
	*
	* @return the farmaco_12_b_20 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_b_20() {
		return _form_di_segnalazione.getFARMACO_12_b_20();
	}

	/**
	* Returns the farmaco_12_c of this form_di_segnalazione.
	*
	* @return the farmaco_12_c of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c() {
		return _form_di_segnalazione.getFARMACO_12_c();
	}

	/**
	* Returns the farmaco_12_c_13 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_13 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_13() {
		return _form_di_segnalazione.getFARMACO_12_c_13();
	}

	/**
	* Returns the farmaco_12_c_14 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_14 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_14() {
		return _form_di_segnalazione.getFARMACO_12_c_14();
	}

	/**
	* Returns the farmaco_12_c_15 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_15 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_15() {
		return _form_di_segnalazione.getFARMACO_12_c_15();
	}

	/**
	* Returns the farmaco_12_c_16_1 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_16_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_16_1() {
		return _form_di_segnalazione.getFARMACO_12_c_16_1();
	}

	/**
	* Returns the farmaco_12_c_16_2 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_16_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_16_2() {
		return _form_di_segnalazione.getFARMACO_12_c_16_2();
	}

	/**
	* Returns the farmaco_12_c_17 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_17 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_17() {
		return _form_di_segnalazione.getFARMACO_12_c_17();
	}

	/**
	* Returns the farmaco_12_c_18 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_18 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_18() {
		return _form_di_segnalazione.getFARMACO_12_c_18();
	}

	/**
	* Returns the farmaco_12_c_19 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_19 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_19() {
		return _form_di_segnalazione.getFARMACO_12_c_19();
	}

	/**
	* Returns the farmaco_12_c_20 of this form_di_segnalazione.
	*
	* @return the farmaco_12_c_20 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_12_c_20() {
		return _form_di_segnalazione.getFARMACO_12_c_20();
	}

	/**
	* Returns the farmaco_22_a of this form_di_segnalazione.
	*
	* @return the farmaco_22_a of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a() {
		return _form_di_segnalazione.getFARMACO_22_a();
	}

	/**
	* Returns the farmaco_22_a_23 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_23 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_23() {
		return _form_di_segnalazione.getFARMACO_22_a_23();
	}

	/**
	* Returns the farmaco_22_a_24 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_24 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_24() {
		return _form_di_segnalazione.getFARMACO_22_a_24();
	}

	/**
	* Returns the farmaco_22_a_25 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_25 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_25() {
		return _form_di_segnalazione.getFARMACO_22_a_25();
	}

	/**
	* Returns the farmaco_22_a_26_1 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_26_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_26_1() {
		return _form_di_segnalazione.getFARMACO_22_a_26_1();
	}

	/**
	* Returns the farmaco_22_a_26_2 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_26_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_26_2() {
		return _form_di_segnalazione.getFARMACO_22_a_26_2();
	}

	/**
	* Returns the farmaco_22_a_27 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_27 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_27() {
		return _form_di_segnalazione.getFARMACO_22_a_27();
	}

	/**
	* Returns the farmaco_22_a_28 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_28 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_28() {
		return _form_di_segnalazione.getFARMACO_22_a_28();
	}

	/**
	* Returns the farmaco_22_a_29 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_29 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_29() {
		return _form_di_segnalazione.getFARMACO_22_a_29();
	}

	/**
	* Returns the farmaco_22_a_30 of this form_di_segnalazione.
	*
	* @return the farmaco_22_a_30 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_a_30() {
		return _form_di_segnalazione.getFARMACO_22_a_30();
	}

	/**
	* Returns the farmaco_22_b of this form_di_segnalazione.
	*
	* @return the farmaco_22_b of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b() {
		return _form_di_segnalazione.getFARMACO_22_b();
	}

	/**
	* Returns the farmaco_22_b_23 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_23 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_23() {
		return _form_di_segnalazione.getFARMACO_22_b_23();
	}

	/**
	* Returns the farmaco_22_b_24 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_24 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_24() {
		return _form_di_segnalazione.getFARMACO_22_b_24();
	}

	/**
	* Returns the farmaco_22_b_25 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_25 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_25() {
		return _form_di_segnalazione.getFARMACO_22_b_25();
	}

	/**
	* Returns the farmaco_22_b_26_1 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_26_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_26_1() {
		return _form_di_segnalazione.getFARMACO_22_b_26_1();
	}

	/**
	* Returns the farmaco_22_b_26_2 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_26_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_26_2() {
		return _form_di_segnalazione.getFARMACO_22_b_26_2();
	}

	/**
	* Returns the farmaco_22_b_27 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_27 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_27() {
		return _form_di_segnalazione.getFARMACO_22_b_27();
	}

	/**
	* Returns the farmaco_22_b_28 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_28 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_28() {
		return _form_di_segnalazione.getFARMACO_22_b_28();
	}

	/**
	* Returns the farmaco_22_b_29 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_29 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_29() {
		return _form_di_segnalazione.getFARMACO_22_b_29();
	}

	/**
	* Returns the farmaco_22_b_30 of this form_di_segnalazione.
	*
	* @return the farmaco_22_b_30 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFARMACO_22_b_30() {
		return _form_di_segnalazione.getFARMACO_22_b_30();
	}

	/**
	* Returns the firma_41 of this form_di_segnalazione.
	*
	* @return the firma_41 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getFIRMA_41() {
		return _form_di_segnalazione.getFIRMA_41();
	}

	/**
	* Returns the gravita_8_1 of this form_di_segnalazione.
	*
	* @return the gravita_8_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getGRAVITA_8_1() {
		return _form_di_segnalazione.getGRAVITA_8_1();
	}

	/**
	* Returns the gravita_8_2 of this form_di_segnalazione.
	*
	* @return the gravita_8_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getGRAVITA_8_2() {
		return _form_di_segnalazione.getGRAVITA_8_2();
	}

	/**
	* Returns the gravita_8_3 of this form_di_segnalazione.
	*
	* @return the gravita_8_3 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getGRAVITA_8_3() {
		return _form_di_segnalazione.getGRAVITA_8_3();
	}

	/**
	* Returns the gravita_8_4 of this form_di_segnalazione.
	*
	* @return the gravita_8_4 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getGRAVITA_8_4() {
		return _form_di_segnalazione.getGRAVITA_8_4();
	}

	/**
	* Returns the gravita_8_5 of this form_di_segnalazione.
	*
	* @return the gravita_8_5 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getGRAVITA_8_5() {
		return _form_di_segnalazione.getGRAVITA_8_5();
	}

	/**
	* Returns the gravita_8_6 of this form_di_segnalazione.
	*
	* @return the gravita_8_6 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getGRAVITA_8_6() {
		return _form_di_segnalazione.getGRAVITA_8_6();
	}

	/**
	* Returns the gravita_8_7 of this form_di_segnalazione.
	*
	* @return the gravita_8_7 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getGRAVITA_8_7() {
		return _form_di_segnalazione.getGRAVITA_8_7();
	}

	/**
	* Returns the indicare_35_1 of this form_di_segnalazione.
	*
	* @return the indicare_35_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_35_1() {
		return _form_di_segnalazione.getINDICARE_35_1();
	}

	/**
	* Returns the indicare_35_2 of this form_di_segnalazione.
	*
	* @return the indicare_35_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_35_2() {
		return _form_di_segnalazione.getINDICARE_35_2();
	}

	/**
	* Returns the indicare_35_3 of this form_di_segnalazione.
	*
	* @return the indicare_35_3 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_35_3() {
		return _form_di_segnalazione.getINDICARE_35_3();
	}

	/**
	* Returns the indicare_35_4 of this form_di_segnalazione.
	*
	* @return the indicare_35_4 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_35_4() {
		return _form_di_segnalazione.getINDICARE_35_4();
	}

	/**
	* Returns the indicare_35_5 of this form_di_segnalazione.
	*
	* @return the indicare_35_5 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_35_5() {
		return _form_di_segnalazione.getINDICARE_35_5();
	}

	/**
	* Returns the indicare_35_6 of this form_di_segnalazione.
	*
	* @return the indicare_35_6 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_35_6() {
		return _form_di_segnalazione.getINDICARE_35_6();
	}

	/**
	* Returns the indicare_7_1 of this form_di_segnalazione.
	*
	* @return the indicare_7_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_7_1() {
		return _form_di_segnalazione.getINDICARE_7_1();
	}

	/**
	* Returns the indicare_7_2 of this form_di_segnalazione.
	*
	* @return the indicare_7_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_7_2() {
		return _form_di_segnalazione.getINDICARE_7_2();
	}

	/**
	* Returns the indicare_7_3 of this form_di_segnalazione.
	*
	* @return the indicare_7_3 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_7_3() {
		return _form_di_segnalazione.getINDICARE_7_3();
	}

	/**
	* Returns the indicare_7_4 of this form_di_segnalazione.
	*
	* @return the indicare_7_4 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_7_4() {
		return _form_di_segnalazione.getINDICARE_7_4();
	}

	/**
	* Returns the indicare_7_5 of this form_di_segnalazione.
	*
	* @return the indicare_7_5 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_7_5() {
		return _form_di_segnalazione.getINDICARE_7_5();
	}

	/**
	* Returns the indicare_7_6 of this form_di_segnalazione.
	*
	* @return the indicare_7_6 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_7_6() {
		return _form_di_segnalazione.getINDICARE_7_6();
	}

	/**
	* Returns the indicare_7_7 of this form_di_segnalazione.
	*
	* @return the indicare_7_7 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICARE_7_7() {
		return _form_di_segnalazione.getINDICARE_7_7();
	}

	/**
	* Returns the indicazioni_21_a of this form_di_segnalazione.
	*
	* @return the indicazioni_21_a of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICAZIONI_21_a() {
		return _form_di_segnalazione.getINDICAZIONI_21_a();
	}

	/**
	* Returns the indicazioni_21_b of this form_di_segnalazione.
	*
	* @return the indicazioni_21_b of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICAZIONI_21_b() {
		return _form_di_segnalazione.getINDICAZIONI_21_b();
	}

	/**
	* Returns the indicazioni_21_c of this form_di_segnalazione.
	*
	* @return the indicazioni_21_c of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICAZIONI_21_c() {
		return _form_di_segnalazione.getINDICAZIONI_21_c();
	}

	/**
	* Returns the indicazioni_31_a of this form_di_segnalazione.
	*
	* @return the indicazioni_31_a of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICAZIONI_31_a() {
		return _form_di_segnalazione.getINDICAZIONI_31_a();
	}

	/**
	* Returns the indicazioni_31_b of this form_di_segnalazione.
	*
	* @return the indicazioni_31_b of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINDICAZIONI_31_b() {
		return _form_di_segnalazione.getINDICAZIONI_31_b();
	}

	/**
	* Returns the iniziali_1 of this form_di_segnalazione.
	*
	* @return the iniziali_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINIZIALI_1() {
		return _form_di_segnalazione.getINIZIALI_1();
	}

	/**
	* Returns the iniziali_1_a of this form_di_segnalazione.
	*
	* @return the iniziali_1_a of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINIZIALI_1_a() {
		return _form_di_segnalazione.getINIZIALI_1_a();
	}

	/**
	* Returns the iniziali_1_b of this form_di_segnalazione.
	*
	* @return the iniziali_1_b of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINIZIALI_1_b() {
		return _form_di_segnalazione.getINIZIALI_1_b();
	}

	/**
	* Returns the iniziali_1_c of this form_di_segnalazione.
	*
	* @return the iniziali_1_c of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINIZIALI_1_c() {
		return _form_di_segnalazione.getINIZIALI_1_c();
	}

	/**
	* Returns the iniziali_1_d of this form_di_segnalazione.
	*
	* @return the iniziali_1_d of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINIZIALI_1_d() {
		return _form_di_segnalazione.getINIZIALI_1_d();
	}

	/**
	* Returns the iniziali_1_e of this form_di_segnalazione.
	*
	* @return the iniziali_1_e of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getINIZIALI_1_e() {
		return _form_di_segnalazione.getINIZIALI_1_e();
	}

	/**
	* Returns the origine_5 of this form_di_segnalazione.
	*
	* @return the origine_5 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getORIGINE_5() {
		return _form_di_segnalazione.getORIGINE_5();
	}

	/**
	* Returns the qualifica_36_1 of this form_di_segnalazione.
	*
	* @return the qualifica_36_1 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_1() {
		return _form_di_segnalazione.getQUALIFICA_36_1();
	}

	/**
	* Returns the qualifica_36_10 of this form_di_segnalazione.
	*
	* @return the qualifica_36_10 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_10() {
		return _form_di_segnalazione.getQUALIFICA_36_10();
	}

	/**
	* Returns the qualifica_36_2 of this form_di_segnalazione.
	*
	* @return the qualifica_36_2 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_2() {
		return _form_di_segnalazione.getQUALIFICA_36_2();
	}

	/**
	* Returns the qualifica_36_3 of this form_di_segnalazione.
	*
	* @return the qualifica_36_3 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_3() {
		return _form_di_segnalazione.getQUALIFICA_36_3();
	}

	/**
	* Returns the qualifica_36_4 of this form_di_segnalazione.
	*
	* @return the qualifica_36_4 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_4() {
		return _form_di_segnalazione.getQUALIFICA_36_4();
	}

	/**
	* Returns the qualifica_36_5 of this form_di_segnalazione.
	*
	* @return the qualifica_36_5 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_5() {
		return _form_di_segnalazione.getQUALIFICA_36_5();
	}

	/**
	* Returns the qualifica_36_6 of this form_di_segnalazione.
	*
	* @return the qualifica_36_6 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_6() {
		return _form_di_segnalazione.getQUALIFICA_36_6();
	}

	/**
	* Returns the qualifica_36_7 of this form_di_segnalazione.
	*
	* @return the qualifica_36_7 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_7() {
		return _form_di_segnalazione.getQUALIFICA_36_7();
	}

	/**
	* Returns the qualifica_36_8 of this form_di_segnalazione.
	*
	* @return the qualifica_36_8 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_8() {
		return _form_di_segnalazione.getQUALIFICA_36_8();
	}

	/**
	* Returns the qualifica_36_9 of this form_di_segnalazione.
	*
	* @return the qualifica_36_9 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getQUALIFICA_36_9() {
		return _form_di_segnalazione.getQUALIFICA_36_9();
	}

	/**
	* Returns the regione_39 of this form_di_segnalazione.
	*
	* @return the regione_39 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getREGIONE_39() {
		return _form_di_segnalazione.getREGIONE_39();
	}

	/**
	* Returns the sesso_3 of this form_di_segnalazione.
	*
	* @return the sesso_3 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getSESSO_3() {
		return _form_di_segnalazione.getSESSO_3();
	}

	/**
	* Returns the uso_32 of this form_di_segnalazione.
	*
	* @return the uso_32 of this form_di_segnalazione
	*/
	@Override
	public java.lang.String getUSO_32() {
		return _form_di_segnalazione.getUSO_32();
	}

	@Override
	public java.lang.String toString() {
		return _form_di_segnalazione.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _form_di_segnalazione.toXmlString();
	}

	/**
	* Returns the form_di_segnalazione_id of this form_di_segnalazione.
	*
	* @return the form_di_segnalazione_id of this form_di_segnalazione
	*/
	@Override
	public long getForm_di_segnalazione_id() {
		return _form_di_segnalazione.getForm_di_segnalazione_id();
	}

	/**
	* Returns the primary key of this form_di_segnalazione.
	*
	* @return the primary key of this form_di_segnalazione
	*/
	@Override
	public long getPrimaryKey() {
		return _form_di_segnalazione.getPrimaryKey();
	}

	@Override
	public void persist() {
		_form_di_segnalazione.persist();
	}

	/**
	* Sets the altre_34 of this form_di_segnalazione.
	*
	* @param ALTRE_34 the altre_34 of this form_di_segnalazione
	*/
	@Override
	public void setALTRE_34(java.lang.String ALTRE_34) {
		_form_di_segnalazione.setALTRE_34(ALTRE_34);
	}

	/**
	* Sets the asl_38 of this form_di_segnalazione.
	*
	* @param ASL_38 the asl_38 of this form_di_segnalazione
	*/
	@Override
	public void setASL_38(java.lang.String ASL_38) {
		_form_di_segnalazione.setASL_38(ASL_38);
	}

	/**
	* Sets the azioni_11 of this form_di_segnalazione.
	*
	* @param AZIONI_11 the azioni_11 of this form_di_segnalazione
	*/
	@Override
	public void setAZIONI_11(java.lang.String AZIONI_11) {
		_form_di_segnalazione.setAZIONI_11(AZIONI_11);
	}

	/**
	* Sets the codice of this form_di_segnalazione.
	*
	* @param CODICE the codice of this form_di_segnalazione
	*/
	@Override
	public void setCODICE(java.lang.String CODICE) {
		_form_di_segnalazione.setCODICE(CODICE);
	}

	/**
	* Sets the condizioni_33 of this form_di_segnalazione.
	*
	* @param CONDIZIONI_33 the condizioni_33 of this form_di_segnalazione
	*/
	@Override
	public void setCONDIZIONI_33(java.lang.String CONDIZIONI_33) {
		_form_di_segnalazione.setCONDIZIONI_33(CONDIZIONI_33);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_form_di_segnalazione.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_2 of this form_di_segnalazione.
	*
	* @param DATA_2 the data_2 of this form_di_segnalazione
	*/
	@Override
	public void setDATA_2(java.lang.String DATA_2) {
		_form_di_segnalazione.setDATA_2(DATA_2);
	}

	/**
	* Sets the data_4 of this form_di_segnalazione.
	*
	* @param DATA_4 the data_4 of this form_di_segnalazione
	*/
	@Override
	public void setDATA_4(java.lang.String DATA_4) {
		_form_di_segnalazione.setDATA_4(DATA_4);
	}

	/**
	* Sets the data_40 of this form_di_segnalazione.
	*
	* @param DATA_40 the data_40 of this form_di_segnalazione
	*/
	@Override
	public void setDATA_40(java.lang.String DATA_40) {
		_form_di_segnalazione.setDATA_40(DATA_40);
	}

	/**
	* Sets the dati_37_1 of this form_di_segnalazione.
	*
	* @param DATI_37_1 the dati_37_1 of this form_di_segnalazione
	*/
	@Override
	public void setDATI_37_1(java.lang.String DATI_37_1) {
		_form_di_segnalazione.setDATI_37_1(DATI_37_1);
	}

	/**
	* Sets the dati_37_2 of this form_di_segnalazione.
	*
	* @param DATI_37_2 the dati_37_2 of this form_di_segnalazione
	*/
	@Override
	public void setDATI_37_2(java.lang.String DATI_37_2) {
		_form_di_segnalazione.setDATI_37_2(DATI_37_2);
	}

	/**
	* Sets the dati_37_3 of this form_di_segnalazione.
	*
	* @param DATI_37_3 the dati_37_3 of this form_di_segnalazione
	*/
	@Override
	public void setDATI_37_3(java.lang.String DATI_37_3) {
		_form_di_segnalazione.setDATI_37_3(DATI_37_3);
	}

	/**
	* Sets the dati_37_4 of this form_di_segnalazione.
	*
	* @param DATI_37_4 the dati_37_4 of this form_di_segnalazione
	*/
	@Override
	public void setDATI_37_4(java.lang.String DATI_37_4) {
		_form_di_segnalazione.setDATI_37_4(DATI_37_4);
	}

	/**
	* Sets the descrizione_6 of this form_di_segnalazione.
	*
	* @param DESCRIZIONE_6 the descrizione_6 of this form_di_segnalazione
	*/
	@Override
	public void setDESCRIZIONE_6(java.lang.String DESCRIZIONE_6) {
		_form_di_segnalazione.setDESCRIZIONE_6(DESCRIZIONE_6);
	}

	/**
	* Sets the esito_10 of this form_di_segnalazione.
	*
	* @param ESITO_10 the esito_10 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10(java.lang.String ESITO_10) {
		_form_di_segnalazione.setESITO_10(ESITO_10);
	}

	/**
	* Sets the esito_10_1 of this form_di_segnalazione.
	*
	* @param ESITO_10_1 the esito_10_1 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_1(java.lang.String ESITO_10_1) {
		_form_di_segnalazione.setESITO_10_1(ESITO_10_1);
	}

	/**
	* Sets the esito_10_10 of this form_di_segnalazione.
	*
	* @param ESITO_10_10 the esito_10_10 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_10(java.lang.String ESITO_10_10) {
		_form_di_segnalazione.setESITO_10_10(ESITO_10_10);
	}

	/**
	* Sets the esito_10_2 of this form_di_segnalazione.
	*
	* @param ESITO_10_2 the esito_10_2 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_2(java.lang.String ESITO_10_2) {
		_form_di_segnalazione.setESITO_10_2(ESITO_10_2);
	}

	/**
	* Sets the esito_10_3 of this form_di_segnalazione.
	*
	* @param ESITO_10_3 the esito_10_3 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_3(java.lang.String ESITO_10_3) {
		_form_di_segnalazione.setESITO_10_3(ESITO_10_3);
	}

	/**
	* Sets the esito_10_4 of this form_di_segnalazione.
	*
	* @param ESITO_10_4 the esito_10_4 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_4(java.lang.String ESITO_10_4) {
		_form_di_segnalazione.setESITO_10_4(ESITO_10_4);
	}

	/**
	* Sets the esito_10_5 of this form_di_segnalazione.
	*
	* @param ESITO_10_5 the esito_10_5 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_5(java.lang.String ESITO_10_5) {
		_form_di_segnalazione.setESITO_10_5(ESITO_10_5);
	}

	/**
	* Sets the esito_10_6 of this form_di_segnalazione.
	*
	* @param ESITO_10_6 the esito_10_6 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_6(java.lang.String ESITO_10_6) {
		_form_di_segnalazione.setESITO_10_6(ESITO_10_6);
	}

	/**
	* Sets the esito_10_7 of this form_di_segnalazione.
	*
	* @param ESITO_10_7 the esito_10_7 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_7(java.lang.String ESITO_10_7) {
		_form_di_segnalazione.setESITO_10_7(ESITO_10_7);
	}

	/**
	* Sets the esito_10_8 of this form_di_segnalazione.
	*
	* @param ESITO_10_8 the esito_10_8 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_8(java.lang.String ESITO_10_8) {
		_form_di_segnalazione.setESITO_10_8(ESITO_10_8);
	}

	/**
	* Sets the esito_10_9 of this form_di_segnalazione.
	*
	* @param ESITO_10_9 the esito_10_9 of this form_di_segnalazione
	*/
	@Override
	public void setESITO_10_9(java.lang.String ESITO_10_9) {
		_form_di_segnalazione.setESITO_10_9(ESITO_10_9);
	}

	/**
	* Sets the eventuali_9 of this form_di_segnalazione.
	*
	* @param EVENTUALI_9 the eventuali_9 of this form_di_segnalazione
	*/
	@Override
	public void setEVENTUALI_9(java.lang.String EVENTUALI_9) {
		_form_di_segnalazione.setEVENTUALI_9(EVENTUALI_9);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_form_di_segnalazione.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_form_di_segnalazione.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_form_di_segnalazione.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the farmaco_12_a of this form_di_segnalazione.
	*
	* @param FARMACO_12_a the farmaco_12_a of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a(java.lang.String FARMACO_12_a) {
		_form_di_segnalazione.setFARMACO_12_a(FARMACO_12_a);
	}

	/**
	* Sets the farmaco_12_a_13 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_13 the farmaco_12_a_13 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_13(java.lang.String FARMACO_12_a_13) {
		_form_di_segnalazione.setFARMACO_12_a_13(FARMACO_12_a_13);
	}

	/**
	* Sets the farmaco_12_a_14 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_14 the farmaco_12_a_14 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_14(java.lang.String FARMACO_12_a_14) {
		_form_di_segnalazione.setFARMACO_12_a_14(FARMACO_12_a_14);
	}

	/**
	* Sets the farmaco_12_a_15 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_15 the farmaco_12_a_15 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_15(java.lang.String FARMACO_12_a_15) {
		_form_di_segnalazione.setFARMACO_12_a_15(FARMACO_12_a_15);
	}

	/**
	* Sets the farmaco_12_a_16_1 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_16_1 the farmaco_12_a_16_1 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_16_1(java.lang.String FARMACO_12_a_16_1) {
		_form_di_segnalazione.setFARMACO_12_a_16_1(FARMACO_12_a_16_1);
	}

	/**
	* Sets the farmaco_12_a_16_2 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_16_2 the farmaco_12_a_16_2 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_16_2(java.lang.String FARMACO_12_a_16_2) {
		_form_di_segnalazione.setFARMACO_12_a_16_2(FARMACO_12_a_16_2);
	}

	/**
	* Sets the farmaco_12_a_17 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_17 the farmaco_12_a_17 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_17(java.lang.String FARMACO_12_a_17) {
		_form_di_segnalazione.setFARMACO_12_a_17(FARMACO_12_a_17);
	}

	/**
	* Sets the farmaco_12_a_18 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_18 the farmaco_12_a_18 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_18(java.lang.String FARMACO_12_a_18) {
		_form_di_segnalazione.setFARMACO_12_a_18(FARMACO_12_a_18);
	}

	/**
	* Sets the farmaco_12_a_19 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_19 the farmaco_12_a_19 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_19(java.lang.String FARMACO_12_a_19) {
		_form_di_segnalazione.setFARMACO_12_a_19(FARMACO_12_a_19);
	}

	/**
	* Sets the farmaco_12_a_20 of this form_di_segnalazione.
	*
	* @param FARMACO_12_a_20 the farmaco_12_a_20 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_a_20(java.lang.String FARMACO_12_a_20) {
		_form_di_segnalazione.setFARMACO_12_a_20(FARMACO_12_a_20);
	}

	/**
	* Sets the farmaco_12_b of this form_di_segnalazione.
	*
	* @param FARMACO_12_b the farmaco_12_b of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b(java.lang.String FARMACO_12_b) {
		_form_di_segnalazione.setFARMACO_12_b(FARMACO_12_b);
	}

	/**
	* Sets the farmaco_12_b_13 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_13 the farmaco_12_b_13 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_13(java.lang.String FARMACO_12_b_13) {
		_form_di_segnalazione.setFARMACO_12_b_13(FARMACO_12_b_13);
	}

	/**
	* Sets the farmaco_12_b_14 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_14 the farmaco_12_b_14 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_14(java.lang.String FARMACO_12_b_14) {
		_form_di_segnalazione.setFARMACO_12_b_14(FARMACO_12_b_14);
	}

	/**
	* Sets the farmaco_12_b_15 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_15 the farmaco_12_b_15 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_15(java.lang.String FARMACO_12_b_15) {
		_form_di_segnalazione.setFARMACO_12_b_15(FARMACO_12_b_15);
	}

	/**
	* Sets the farmaco_12_b_16_1 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_16_1 the farmaco_12_b_16_1 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_16_1(java.lang.String FARMACO_12_b_16_1) {
		_form_di_segnalazione.setFARMACO_12_b_16_1(FARMACO_12_b_16_1);
	}

	/**
	* Sets the farmaco_12_b_16_2 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_16_2 the farmaco_12_b_16_2 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_16_2(java.lang.String FARMACO_12_b_16_2) {
		_form_di_segnalazione.setFARMACO_12_b_16_2(FARMACO_12_b_16_2);
	}

	/**
	* Sets the farmaco_12_b_17 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_17 the farmaco_12_b_17 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_17(java.lang.String FARMACO_12_b_17) {
		_form_di_segnalazione.setFARMACO_12_b_17(FARMACO_12_b_17);
	}

	/**
	* Sets the farmaco_12_b_18 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_18 the farmaco_12_b_18 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_18(java.lang.String FARMACO_12_b_18) {
		_form_di_segnalazione.setFARMACO_12_b_18(FARMACO_12_b_18);
	}

	/**
	* Sets the farmaco_12_b_19 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_19 the farmaco_12_b_19 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_19(java.lang.String FARMACO_12_b_19) {
		_form_di_segnalazione.setFARMACO_12_b_19(FARMACO_12_b_19);
	}

	/**
	* Sets the farmaco_12_b_20 of this form_di_segnalazione.
	*
	* @param FARMACO_12_b_20 the farmaco_12_b_20 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_b_20(java.lang.String FARMACO_12_b_20) {
		_form_di_segnalazione.setFARMACO_12_b_20(FARMACO_12_b_20);
	}

	/**
	* Sets the farmaco_12_c of this form_di_segnalazione.
	*
	* @param FARMACO_12_c the farmaco_12_c of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c(java.lang.String FARMACO_12_c) {
		_form_di_segnalazione.setFARMACO_12_c(FARMACO_12_c);
	}

	/**
	* Sets the farmaco_12_c_13 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_13 the farmaco_12_c_13 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_13(java.lang.String FARMACO_12_c_13) {
		_form_di_segnalazione.setFARMACO_12_c_13(FARMACO_12_c_13);
	}

	/**
	* Sets the farmaco_12_c_14 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_14 the farmaco_12_c_14 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_14(java.lang.String FARMACO_12_c_14) {
		_form_di_segnalazione.setFARMACO_12_c_14(FARMACO_12_c_14);
	}

	/**
	* Sets the farmaco_12_c_15 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_15 the farmaco_12_c_15 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_15(java.lang.String FARMACO_12_c_15) {
		_form_di_segnalazione.setFARMACO_12_c_15(FARMACO_12_c_15);
	}

	/**
	* Sets the farmaco_12_c_16_1 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_16_1 the farmaco_12_c_16_1 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_16_1(java.lang.String FARMACO_12_c_16_1) {
		_form_di_segnalazione.setFARMACO_12_c_16_1(FARMACO_12_c_16_1);
	}

	/**
	* Sets the farmaco_12_c_16_2 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_16_2 the farmaco_12_c_16_2 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_16_2(java.lang.String FARMACO_12_c_16_2) {
		_form_di_segnalazione.setFARMACO_12_c_16_2(FARMACO_12_c_16_2);
	}

	/**
	* Sets the farmaco_12_c_17 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_17 the farmaco_12_c_17 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_17(java.lang.String FARMACO_12_c_17) {
		_form_di_segnalazione.setFARMACO_12_c_17(FARMACO_12_c_17);
	}

	/**
	* Sets the farmaco_12_c_18 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_18 the farmaco_12_c_18 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_18(java.lang.String FARMACO_12_c_18) {
		_form_di_segnalazione.setFARMACO_12_c_18(FARMACO_12_c_18);
	}

	/**
	* Sets the farmaco_12_c_19 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_19 the farmaco_12_c_19 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_19(java.lang.String FARMACO_12_c_19) {
		_form_di_segnalazione.setFARMACO_12_c_19(FARMACO_12_c_19);
	}

	/**
	* Sets the farmaco_12_c_20 of this form_di_segnalazione.
	*
	* @param FARMACO_12_c_20 the farmaco_12_c_20 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_12_c_20(java.lang.String FARMACO_12_c_20) {
		_form_di_segnalazione.setFARMACO_12_c_20(FARMACO_12_c_20);
	}

	/**
	* Sets the farmaco_22_a of this form_di_segnalazione.
	*
	* @param FARMACO_22_a the farmaco_22_a of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a(java.lang.String FARMACO_22_a) {
		_form_di_segnalazione.setFARMACO_22_a(FARMACO_22_a);
	}

	/**
	* Sets the farmaco_22_a_23 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_23 the farmaco_22_a_23 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_23(java.lang.String FARMACO_22_a_23) {
		_form_di_segnalazione.setFARMACO_22_a_23(FARMACO_22_a_23);
	}

	/**
	* Sets the farmaco_22_a_24 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_24 the farmaco_22_a_24 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_24(java.lang.String FARMACO_22_a_24) {
		_form_di_segnalazione.setFARMACO_22_a_24(FARMACO_22_a_24);
	}

	/**
	* Sets the farmaco_22_a_25 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_25 the farmaco_22_a_25 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_25(java.lang.String FARMACO_22_a_25) {
		_form_di_segnalazione.setFARMACO_22_a_25(FARMACO_22_a_25);
	}

	/**
	* Sets the farmaco_22_a_26_1 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_26_1 the farmaco_22_a_26_1 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_26_1(java.lang.String FARMACO_22_a_26_1) {
		_form_di_segnalazione.setFARMACO_22_a_26_1(FARMACO_22_a_26_1);
	}

	/**
	* Sets the farmaco_22_a_26_2 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_26_2 the farmaco_22_a_26_2 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_26_2(java.lang.String FARMACO_22_a_26_2) {
		_form_di_segnalazione.setFARMACO_22_a_26_2(FARMACO_22_a_26_2);
	}

	/**
	* Sets the farmaco_22_a_27 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_27 the farmaco_22_a_27 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_27(java.lang.String FARMACO_22_a_27) {
		_form_di_segnalazione.setFARMACO_22_a_27(FARMACO_22_a_27);
	}

	/**
	* Sets the farmaco_22_a_28 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_28 the farmaco_22_a_28 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_28(java.lang.String FARMACO_22_a_28) {
		_form_di_segnalazione.setFARMACO_22_a_28(FARMACO_22_a_28);
	}

	/**
	* Sets the farmaco_22_a_29 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_29 the farmaco_22_a_29 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_29(java.lang.String FARMACO_22_a_29) {
		_form_di_segnalazione.setFARMACO_22_a_29(FARMACO_22_a_29);
	}

	/**
	* Sets the farmaco_22_a_30 of this form_di_segnalazione.
	*
	* @param FARMACO_22_a_30 the farmaco_22_a_30 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_a_30(java.lang.String FARMACO_22_a_30) {
		_form_di_segnalazione.setFARMACO_22_a_30(FARMACO_22_a_30);
	}

	/**
	* Sets the farmaco_22_b of this form_di_segnalazione.
	*
	* @param FARMACO_22_b the farmaco_22_b of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b(java.lang.String FARMACO_22_b) {
		_form_di_segnalazione.setFARMACO_22_b(FARMACO_22_b);
	}

	/**
	* Sets the farmaco_22_b_23 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_23 the farmaco_22_b_23 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_23(java.lang.String FARMACO_22_b_23) {
		_form_di_segnalazione.setFARMACO_22_b_23(FARMACO_22_b_23);
	}

	/**
	* Sets the farmaco_22_b_24 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_24 the farmaco_22_b_24 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_24(java.lang.String FARMACO_22_b_24) {
		_form_di_segnalazione.setFARMACO_22_b_24(FARMACO_22_b_24);
	}

	/**
	* Sets the farmaco_22_b_25 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_25 the farmaco_22_b_25 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_25(java.lang.String FARMACO_22_b_25) {
		_form_di_segnalazione.setFARMACO_22_b_25(FARMACO_22_b_25);
	}

	/**
	* Sets the farmaco_22_b_26_1 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_26_1 the farmaco_22_b_26_1 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_26_1(java.lang.String FARMACO_22_b_26_1) {
		_form_di_segnalazione.setFARMACO_22_b_26_1(FARMACO_22_b_26_1);
	}

	/**
	* Sets the farmaco_22_b_26_2 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_26_2 the farmaco_22_b_26_2 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_26_2(java.lang.String FARMACO_22_b_26_2) {
		_form_di_segnalazione.setFARMACO_22_b_26_2(FARMACO_22_b_26_2);
	}

	/**
	* Sets the farmaco_22_b_27 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_27 the farmaco_22_b_27 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_27(java.lang.String FARMACO_22_b_27) {
		_form_di_segnalazione.setFARMACO_22_b_27(FARMACO_22_b_27);
	}

	/**
	* Sets the farmaco_22_b_28 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_28 the farmaco_22_b_28 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_28(java.lang.String FARMACO_22_b_28) {
		_form_di_segnalazione.setFARMACO_22_b_28(FARMACO_22_b_28);
	}

	/**
	* Sets the farmaco_22_b_29 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_29 the farmaco_22_b_29 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_29(java.lang.String FARMACO_22_b_29) {
		_form_di_segnalazione.setFARMACO_22_b_29(FARMACO_22_b_29);
	}

	/**
	* Sets the farmaco_22_b_30 of this form_di_segnalazione.
	*
	* @param FARMACO_22_b_30 the farmaco_22_b_30 of this form_di_segnalazione
	*/
	@Override
	public void setFARMACO_22_b_30(java.lang.String FARMACO_22_b_30) {
		_form_di_segnalazione.setFARMACO_22_b_30(FARMACO_22_b_30);
	}

	/**
	* Sets the firma_41 of this form_di_segnalazione.
	*
	* @param FIRMA_41 the firma_41 of this form_di_segnalazione
	*/
	@Override
	public void setFIRMA_41(java.lang.String FIRMA_41) {
		_form_di_segnalazione.setFIRMA_41(FIRMA_41);
	}

	/**
	* Sets the form_di_segnalazione_id of this form_di_segnalazione.
	*
	* @param Form_di_segnalazione_id the form_di_segnalazione_id of this form_di_segnalazione
	*/
	@Override
	public void setForm_di_segnalazione_id(long Form_di_segnalazione_id) {
		_form_di_segnalazione.setForm_di_segnalazione_id(Form_di_segnalazione_id);
	}

	/**
	* Sets the gravita_8_1 of this form_di_segnalazione.
	*
	* @param GRAVITA_8_1 the gravita_8_1 of this form_di_segnalazione
	*/
	@Override
	public void setGRAVITA_8_1(java.lang.String GRAVITA_8_1) {
		_form_di_segnalazione.setGRAVITA_8_1(GRAVITA_8_1);
	}

	/**
	* Sets the gravita_8_2 of this form_di_segnalazione.
	*
	* @param GRAVITA_8_2 the gravita_8_2 of this form_di_segnalazione
	*/
	@Override
	public void setGRAVITA_8_2(java.lang.String GRAVITA_8_2) {
		_form_di_segnalazione.setGRAVITA_8_2(GRAVITA_8_2);
	}

	/**
	* Sets the gravita_8_3 of this form_di_segnalazione.
	*
	* @param GRAVITA_8_3 the gravita_8_3 of this form_di_segnalazione
	*/
	@Override
	public void setGRAVITA_8_3(java.lang.String GRAVITA_8_3) {
		_form_di_segnalazione.setGRAVITA_8_3(GRAVITA_8_3);
	}

	/**
	* Sets the gravita_8_4 of this form_di_segnalazione.
	*
	* @param GRAVITA_8_4 the gravita_8_4 of this form_di_segnalazione
	*/
	@Override
	public void setGRAVITA_8_4(java.lang.String GRAVITA_8_4) {
		_form_di_segnalazione.setGRAVITA_8_4(GRAVITA_8_4);
	}

	/**
	* Sets the gravita_8_5 of this form_di_segnalazione.
	*
	* @param GRAVITA_8_5 the gravita_8_5 of this form_di_segnalazione
	*/
	@Override
	public void setGRAVITA_8_5(java.lang.String GRAVITA_8_5) {
		_form_di_segnalazione.setGRAVITA_8_5(GRAVITA_8_5);
	}

	/**
	* Sets the gravita_8_6 of this form_di_segnalazione.
	*
	* @param GRAVITA_8_6 the gravita_8_6 of this form_di_segnalazione
	*/
	@Override
	public void setGRAVITA_8_6(java.lang.String GRAVITA_8_6) {
		_form_di_segnalazione.setGRAVITA_8_6(GRAVITA_8_6);
	}

	/**
	* Sets the gravita_8_7 of this form_di_segnalazione.
	*
	* @param GRAVITA_8_7 the gravita_8_7 of this form_di_segnalazione
	*/
	@Override
	public void setGRAVITA_8_7(java.lang.String GRAVITA_8_7) {
		_form_di_segnalazione.setGRAVITA_8_7(GRAVITA_8_7);
	}

	/**
	* Sets the indicare_35_1 of this form_di_segnalazione.
	*
	* @param INDICARE_35_1 the indicare_35_1 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_35_1(java.lang.String INDICARE_35_1) {
		_form_di_segnalazione.setINDICARE_35_1(INDICARE_35_1);
	}

	/**
	* Sets the indicare_35_2 of this form_di_segnalazione.
	*
	* @param INDICARE_35_2 the indicare_35_2 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_35_2(java.lang.String INDICARE_35_2) {
		_form_di_segnalazione.setINDICARE_35_2(INDICARE_35_2);
	}

	/**
	* Sets the indicare_35_3 of this form_di_segnalazione.
	*
	* @param INDICARE_35_3 the indicare_35_3 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_35_3(java.lang.String INDICARE_35_3) {
		_form_di_segnalazione.setINDICARE_35_3(INDICARE_35_3);
	}

	/**
	* Sets the indicare_35_4 of this form_di_segnalazione.
	*
	* @param INDICARE_35_4 the indicare_35_4 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_35_4(java.lang.String INDICARE_35_4) {
		_form_di_segnalazione.setINDICARE_35_4(INDICARE_35_4);
	}

	/**
	* Sets the indicare_35_5 of this form_di_segnalazione.
	*
	* @param INDICARE_35_5 the indicare_35_5 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_35_5(java.lang.String INDICARE_35_5) {
		_form_di_segnalazione.setINDICARE_35_5(INDICARE_35_5);
	}

	/**
	* Sets the indicare_35_6 of this form_di_segnalazione.
	*
	* @param INDICARE_35_6 the indicare_35_6 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_35_6(java.lang.String INDICARE_35_6) {
		_form_di_segnalazione.setINDICARE_35_6(INDICARE_35_6);
	}

	/**
	* Sets the indicare_7_1 of this form_di_segnalazione.
	*
	* @param INDICARE_7_1 the indicare_7_1 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_7_1(java.lang.String INDICARE_7_1) {
		_form_di_segnalazione.setINDICARE_7_1(INDICARE_7_1);
	}

	/**
	* Sets the indicare_7_2 of this form_di_segnalazione.
	*
	* @param INDICARE_7_2 the indicare_7_2 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_7_2(java.lang.String INDICARE_7_2) {
		_form_di_segnalazione.setINDICARE_7_2(INDICARE_7_2);
	}

	/**
	* Sets the indicare_7_3 of this form_di_segnalazione.
	*
	* @param INDICARE_7_3 the indicare_7_3 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_7_3(java.lang.String INDICARE_7_3) {
		_form_di_segnalazione.setINDICARE_7_3(INDICARE_7_3);
	}

	/**
	* Sets the indicare_7_4 of this form_di_segnalazione.
	*
	* @param INDICARE_7_4 the indicare_7_4 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_7_4(java.lang.String INDICARE_7_4) {
		_form_di_segnalazione.setINDICARE_7_4(INDICARE_7_4);
	}

	/**
	* Sets the indicare_7_5 of this form_di_segnalazione.
	*
	* @param INDICARE_7_5 the indicare_7_5 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_7_5(java.lang.String INDICARE_7_5) {
		_form_di_segnalazione.setINDICARE_7_5(INDICARE_7_5);
	}

	/**
	* Sets the indicare_7_6 of this form_di_segnalazione.
	*
	* @param INDICARE_7_6 the indicare_7_6 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_7_6(java.lang.String INDICARE_7_6) {
		_form_di_segnalazione.setINDICARE_7_6(INDICARE_7_6);
	}

	/**
	* Sets the indicare_7_7 of this form_di_segnalazione.
	*
	* @param INDICARE_7_7 the indicare_7_7 of this form_di_segnalazione
	*/
	@Override
	public void setINDICARE_7_7(java.lang.String INDICARE_7_7) {
		_form_di_segnalazione.setINDICARE_7_7(INDICARE_7_7);
	}

	/**
	* Sets the indicazioni_21_a of this form_di_segnalazione.
	*
	* @param INDICAZIONI_21_a the indicazioni_21_a of this form_di_segnalazione
	*/
	@Override
	public void setINDICAZIONI_21_a(java.lang.String INDICAZIONI_21_a) {
		_form_di_segnalazione.setINDICAZIONI_21_a(INDICAZIONI_21_a);
	}

	/**
	* Sets the indicazioni_21_b of this form_di_segnalazione.
	*
	* @param INDICAZIONI_21_b the indicazioni_21_b of this form_di_segnalazione
	*/
	@Override
	public void setINDICAZIONI_21_b(java.lang.String INDICAZIONI_21_b) {
		_form_di_segnalazione.setINDICAZIONI_21_b(INDICAZIONI_21_b);
	}

	/**
	* Sets the indicazioni_21_c of this form_di_segnalazione.
	*
	* @param INDICAZIONI_21_c the indicazioni_21_c of this form_di_segnalazione
	*/
	@Override
	public void setINDICAZIONI_21_c(java.lang.String INDICAZIONI_21_c) {
		_form_di_segnalazione.setINDICAZIONI_21_c(INDICAZIONI_21_c);
	}

	/**
	* Sets the indicazioni_31_a of this form_di_segnalazione.
	*
	* @param INDICAZIONI_31_a the indicazioni_31_a of this form_di_segnalazione
	*/
	@Override
	public void setINDICAZIONI_31_a(java.lang.String INDICAZIONI_31_a) {
		_form_di_segnalazione.setINDICAZIONI_31_a(INDICAZIONI_31_a);
	}

	/**
	* Sets the indicazioni_31_b of this form_di_segnalazione.
	*
	* @param INDICAZIONI_31_b the indicazioni_31_b of this form_di_segnalazione
	*/
	@Override
	public void setINDICAZIONI_31_b(java.lang.String INDICAZIONI_31_b) {
		_form_di_segnalazione.setINDICAZIONI_31_b(INDICAZIONI_31_b);
	}

	/**
	* Sets the iniziali_1 of this form_di_segnalazione.
	*
	* @param INIZIALI_1 the iniziali_1 of this form_di_segnalazione
	*/
	@Override
	public void setINIZIALI_1(java.lang.String INIZIALI_1) {
		_form_di_segnalazione.setINIZIALI_1(INIZIALI_1);
	}

	/**
	* Sets the iniziali_1_a of this form_di_segnalazione.
	*
	* @param INIZIALI_1_a the iniziali_1_a of this form_di_segnalazione
	*/
	@Override
	public void setINIZIALI_1_a(java.lang.String INIZIALI_1_a) {
		_form_di_segnalazione.setINIZIALI_1_a(INIZIALI_1_a);
	}

	/**
	* Sets the iniziali_1_b of this form_di_segnalazione.
	*
	* @param INIZIALI_1_b the iniziali_1_b of this form_di_segnalazione
	*/
	@Override
	public void setINIZIALI_1_b(java.lang.String INIZIALI_1_b) {
		_form_di_segnalazione.setINIZIALI_1_b(INIZIALI_1_b);
	}

	/**
	* Sets the iniziali_1_c of this form_di_segnalazione.
	*
	* @param INIZIALI_1_c the iniziali_1_c of this form_di_segnalazione
	*/
	@Override
	public void setINIZIALI_1_c(java.lang.String INIZIALI_1_c) {
		_form_di_segnalazione.setINIZIALI_1_c(INIZIALI_1_c);
	}

	/**
	* Sets the iniziali_1_d of this form_di_segnalazione.
	*
	* @param INIZIALI_1_d the iniziali_1_d of this form_di_segnalazione
	*/
	@Override
	public void setINIZIALI_1_d(java.lang.String INIZIALI_1_d) {
		_form_di_segnalazione.setINIZIALI_1_d(INIZIALI_1_d);
	}

	/**
	* Sets the iniziali_1_e of this form_di_segnalazione.
	*
	* @param INIZIALI_1_e the iniziali_1_e of this form_di_segnalazione
	*/
	@Override
	public void setINIZIALI_1_e(java.lang.String INIZIALI_1_e) {
		_form_di_segnalazione.setINIZIALI_1_e(INIZIALI_1_e);
	}

	@Override
	public void setNew(boolean n) {
		_form_di_segnalazione.setNew(n);
	}

	/**
	* Sets the origine_5 of this form_di_segnalazione.
	*
	* @param ORIGINE_5 the origine_5 of this form_di_segnalazione
	*/
	@Override
	public void setORIGINE_5(java.lang.String ORIGINE_5) {
		_form_di_segnalazione.setORIGINE_5(ORIGINE_5);
	}

	/**
	* Sets the primary key of this form_di_segnalazione.
	*
	* @param primaryKey the primary key of this form_di_segnalazione
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_form_di_segnalazione.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_form_di_segnalazione.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the qualifica_36_1 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_1 the qualifica_36_1 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_1(java.lang.String QUALIFICA_36_1) {
		_form_di_segnalazione.setQUALIFICA_36_1(QUALIFICA_36_1);
	}

	/**
	* Sets the qualifica_36_10 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_10 the qualifica_36_10 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_10(java.lang.String QUALIFICA_36_10) {
		_form_di_segnalazione.setQUALIFICA_36_10(QUALIFICA_36_10);
	}

	/**
	* Sets the qualifica_36_2 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_2 the qualifica_36_2 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_2(java.lang.String QUALIFICA_36_2) {
		_form_di_segnalazione.setQUALIFICA_36_2(QUALIFICA_36_2);
	}

	/**
	* Sets the qualifica_36_3 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_3 the qualifica_36_3 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_3(java.lang.String QUALIFICA_36_3) {
		_form_di_segnalazione.setQUALIFICA_36_3(QUALIFICA_36_3);
	}

	/**
	* Sets the qualifica_36_4 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_4 the qualifica_36_4 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_4(java.lang.String QUALIFICA_36_4) {
		_form_di_segnalazione.setQUALIFICA_36_4(QUALIFICA_36_4);
	}

	/**
	* Sets the qualifica_36_5 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_5 the qualifica_36_5 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_5(java.lang.String QUALIFICA_36_5) {
		_form_di_segnalazione.setQUALIFICA_36_5(QUALIFICA_36_5);
	}

	/**
	* Sets the qualifica_36_6 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_6 the qualifica_36_6 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_6(java.lang.String QUALIFICA_36_6) {
		_form_di_segnalazione.setQUALIFICA_36_6(QUALIFICA_36_6);
	}

	/**
	* Sets the qualifica_36_7 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_7 the qualifica_36_7 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_7(java.lang.String QUALIFICA_36_7) {
		_form_di_segnalazione.setQUALIFICA_36_7(QUALIFICA_36_7);
	}

	/**
	* Sets the qualifica_36_8 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_8 the qualifica_36_8 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_8(java.lang.String QUALIFICA_36_8) {
		_form_di_segnalazione.setQUALIFICA_36_8(QUALIFICA_36_8);
	}

	/**
	* Sets the qualifica_36_9 of this form_di_segnalazione.
	*
	* @param QUALIFICA_36_9 the qualifica_36_9 of this form_di_segnalazione
	*/
	@Override
	public void setQUALIFICA_36_9(java.lang.String QUALIFICA_36_9) {
		_form_di_segnalazione.setQUALIFICA_36_9(QUALIFICA_36_9);
	}

	/**
	* Sets the regione_39 of this form_di_segnalazione.
	*
	* @param REGIONE_39 the regione_39 of this form_di_segnalazione
	*/
	@Override
	public void setREGIONE_39(java.lang.String REGIONE_39) {
		_form_di_segnalazione.setREGIONE_39(REGIONE_39);
	}

	/**
	* Sets the sesso_3 of this form_di_segnalazione.
	*
	* @param SESSO_3 the sesso_3 of this form_di_segnalazione
	*/
	@Override
	public void setSESSO_3(java.lang.String SESSO_3) {
		_form_di_segnalazione.setSESSO_3(SESSO_3);
	}

	/**
	* Sets the uso_32 of this form_di_segnalazione.
	*
	* @param USO_32 the uso_32 of this form_di_segnalazione
	*/
	@Override
	public void setUSO_32(java.lang.String USO_32) {
		_form_di_segnalazione.setUSO_32(USO_32);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof form_di_segnalazioneWrapper)) {
			return false;
		}

		form_di_segnalazioneWrapper form_di_segnalazioneWrapper = (form_di_segnalazioneWrapper)obj;

		if (Objects.equals(_form_di_segnalazione,
					form_di_segnalazioneWrapper._form_di_segnalazione)) {
			return true;
		}

		return false;
	}

	@Override
	public form_di_segnalazione getWrappedModel() {
		return _form_di_segnalazione;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _form_di_segnalazione.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _form_di_segnalazione.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_form_di_segnalazione.resetOriginalValues();
	}

	private final form_di_segnalazione _form_di_segnalazione;
}
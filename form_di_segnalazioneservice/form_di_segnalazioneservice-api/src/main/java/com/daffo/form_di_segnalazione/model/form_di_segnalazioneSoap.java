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
public class form_di_segnalazioneSoap implements Serializable {
	public static form_di_segnalazioneSoap toSoapModel(
		form_di_segnalazione model) {
		form_di_segnalazioneSoap soapModel = new form_di_segnalazioneSoap();

		soapModel.setForm_di_segnalazione_id(model.getForm_di_segnalazione_id());
		soapModel.setCODICE(model.getCODICE());
		soapModel.setINIZIALI_1(model.getINIZIALI_1());
		soapModel.setINIZIALI_1_a(model.getINIZIALI_1_a());
		soapModel.setINIZIALI_1_b(model.getINIZIALI_1_b());
		soapModel.setINIZIALI_1_c(model.getINIZIALI_1_c());
		soapModel.setINIZIALI_1_d(model.getINIZIALI_1_d());
		soapModel.setINIZIALI_1_e(model.getINIZIALI_1_e());
		soapModel.setDATA_2(model.getDATA_2());
		soapModel.setSESSO_3(model.getSESSO_3());
		soapModel.setDATA_4(model.getDATA_4());
		soapModel.setORIGINE_5(model.getORIGINE_5());
		soapModel.setDESCRIZIONE_6(model.getDESCRIZIONE_6());
		soapModel.setINDICARE_7_1(model.getINDICARE_7_1());
		soapModel.setINDICARE_7_2(model.getINDICARE_7_2());
		soapModel.setINDICARE_7_3(model.getINDICARE_7_3());
		soapModel.setINDICARE_7_4(model.getINDICARE_7_4());
		soapModel.setINDICARE_7_5(model.getINDICARE_7_5());
		soapModel.setINDICARE_7_6(model.getINDICARE_7_6());
		soapModel.setINDICARE_7_7(model.getINDICARE_7_7());
		soapModel.setGRAVITA_8_1(model.getGRAVITA_8_1());
		soapModel.setGRAVITA_8_2(model.getGRAVITA_8_2());
		soapModel.setGRAVITA_8_3(model.getGRAVITA_8_3());
		soapModel.setGRAVITA_8_4(model.getGRAVITA_8_4());
		soapModel.setGRAVITA_8_5(model.getGRAVITA_8_5());
		soapModel.setGRAVITA_8_6(model.getGRAVITA_8_6());
		soapModel.setGRAVITA_8_7(model.getGRAVITA_8_7());
		soapModel.setEVENTUALI_9(model.getEVENTUALI_9());
		soapModel.setESITO_10(model.getESITO_10());
		soapModel.setESITO_10_1(model.getESITO_10_1());
		soapModel.setESITO_10_2(model.getESITO_10_2());
		soapModel.setESITO_10_3(model.getESITO_10_3());
		soapModel.setESITO_10_4(model.getESITO_10_4());
		soapModel.setESITO_10_5(model.getESITO_10_5());
		soapModel.setESITO_10_6(model.getESITO_10_6());
		soapModel.setESITO_10_7(model.getESITO_10_7());
		soapModel.setESITO_10_8(model.getESITO_10_8());
		soapModel.setESITO_10_9(model.getESITO_10_9());
		soapModel.setESITO_10_10(model.getESITO_10_10());
		soapModel.setAZIONI_11(model.getAZIONI_11());
		soapModel.setFARMACO_12_a(model.getFARMACO_12_a());
		soapModel.setFARMACO_12_a_13(model.getFARMACO_12_a_13());
		soapModel.setFARMACO_12_a_14(model.getFARMACO_12_a_14());
		soapModel.setFARMACO_12_a_15(model.getFARMACO_12_a_15());
		soapModel.setFARMACO_12_a_16_1(model.getFARMACO_12_a_16_1());
		soapModel.setFARMACO_12_a_16_2(model.getFARMACO_12_a_16_2());
		soapModel.setFARMACO_12_a_17(model.getFARMACO_12_a_17());
		soapModel.setFARMACO_12_a_18(model.getFARMACO_12_a_18());
		soapModel.setFARMACO_12_a_19(model.getFARMACO_12_a_19());
		soapModel.setFARMACO_12_a_20(model.getFARMACO_12_a_20());
		soapModel.setFARMACO_12_b(model.getFARMACO_12_b());
		soapModel.setFARMACO_12_b_13(model.getFARMACO_12_b_13());
		soapModel.setFARMACO_12_b_14(model.getFARMACO_12_b_14());
		soapModel.setFARMACO_12_b_15(model.getFARMACO_12_b_15());
		soapModel.setFARMACO_12_b_16_1(model.getFARMACO_12_b_16_1());
		soapModel.setFARMACO_12_b_16_2(model.getFARMACO_12_b_16_2());
		soapModel.setFARMACO_12_b_17(model.getFARMACO_12_b_17());
		soapModel.setFARMACO_12_b_18(model.getFARMACO_12_b_18());
		soapModel.setFARMACO_12_b_19(model.getFARMACO_12_b_19());
		soapModel.setFARMACO_12_b_20(model.getFARMACO_12_b_20());
		soapModel.setFARMACO_12_c(model.getFARMACO_12_c());
		soapModel.setFARMACO_12_c_13(model.getFARMACO_12_c_13());
		soapModel.setFARMACO_12_c_14(model.getFARMACO_12_c_14());
		soapModel.setFARMACO_12_c_15(model.getFARMACO_12_c_15());
		soapModel.setFARMACO_12_c_16_1(model.getFARMACO_12_c_16_1());
		soapModel.setFARMACO_12_c_16_2(model.getFARMACO_12_c_16_2());
		soapModel.setFARMACO_12_c_17(model.getFARMACO_12_c_17());
		soapModel.setFARMACO_12_c_18(model.getFARMACO_12_c_18());
		soapModel.setFARMACO_12_c_19(model.getFARMACO_12_c_19());
		soapModel.setFARMACO_12_c_20(model.getFARMACO_12_c_20());
		soapModel.setINDICAZIONI_21_a(model.getINDICAZIONI_21_a());
		soapModel.setINDICAZIONI_21_b(model.getINDICAZIONI_21_b());
		soapModel.setINDICAZIONI_21_c(model.getINDICAZIONI_21_c());
		soapModel.setFARMACO_22_a(model.getFARMACO_22_a());
		soapModel.setFARMACO_22_a_23(model.getFARMACO_22_a_23());
		soapModel.setFARMACO_22_a_24(model.getFARMACO_22_a_24());
		soapModel.setFARMACO_22_a_25(model.getFARMACO_22_a_25());
		soapModel.setFARMACO_22_a_26_1(model.getFARMACO_22_a_26_1());
		soapModel.setFARMACO_22_a_26_2(model.getFARMACO_22_a_26_2());
		soapModel.setFARMACO_22_a_27(model.getFARMACO_22_a_27());
		soapModel.setFARMACO_22_a_28(model.getFARMACO_22_a_28());
		soapModel.setFARMACO_22_a_29(model.getFARMACO_22_a_29());
		soapModel.setFARMACO_22_a_30(model.getFARMACO_22_a_30());
		soapModel.setFARMACO_22_b(model.getFARMACO_22_b());
		soapModel.setFARMACO_22_b_23(model.getFARMACO_22_b_23());
		soapModel.setFARMACO_22_b_24(model.getFARMACO_22_b_24());
		soapModel.setFARMACO_22_b_25(model.getFARMACO_22_b_25());
		soapModel.setFARMACO_22_b_26_1(model.getFARMACO_22_b_26_1());
		soapModel.setFARMACO_22_b_26_2(model.getFARMACO_22_b_26_2());
		soapModel.setFARMACO_22_b_27(model.getFARMACO_22_b_27());
		soapModel.setFARMACO_22_b_28(model.getFARMACO_22_b_28());
		soapModel.setFARMACO_22_b_29(model.getFARMACO_22_b_29());
		soapModel.setFARMACO_22_b_30(model.getFARMACO_22_b_30());
		soapModel.setINDICAZIONI_31_a(model.getINDICAZIONI_31_a());
		soapModel.setINDICAZIONI_31_b(model.getINDICAZIONI_31_b());
		soapModel.setUSO_32(model.getUSO_32());
		soapModel.setCONDIZIONI_33(model.getCONDIZIONI_33());
		soapModel.setALTRE_34(model.getALTRE_34());
		soapModel.setINDICARE_35_1(model.getINDICARE_35_1());
		soapModel.setINDICARE_35_2(model.getINDICARE_35_2());
		soapModel.setINDICARE_35_3(model.getINDICARE_35_3());
		soapModel.setINDICARE_35_4(model.getINDICARE_35_4());
		soapModel.setINDICARE_35_5(model.getINDICARE_35_5());
		soapModel.setINDICARE_35_6(model.getINDICARE_35_6());
		soapModel.setQUALIFICA_36_1(model.getQUALIFICA_36_1());
		soapModel.setQUALIFICA_36_2(model.getQUALIFICA_36_2());
		soapModel.setQUALIFICA_36_3(model.getQUALIFICA_36_3());
		soapModel.setQUALIFICA_36_4(model.getQUALIFICA_36_4());
		soapModel.setQUALIFICA_36_5(model.getQUALIFICA_36_5());
		soapModel.setQUALIFICA_36_6(model.getQUALIFICA_36_6());
		soapModel.setQUALIFICA_36_7(model.getQUALIFICA_36_7());
		soapModel.setQUALIFICA_36_8(model.getQUALIFICA_36_8());
		soapModel.setQUALIFICA_36_9(model.getQUALIFICA_36_9());
		soapModel.setQUALIFICA_36_10(model.getQUALIFICA_36_10());
		soapModel.setDATI_37_1(model.getDATI_37_1());
		soapModel.setDATI_37_2(model.getDATI_37_2());
		soapModel.setDATI_37_3(model.getDATI_37_3());
		soapModel.setDATI_37_4(model.getDATI_37_4());
		soapModel.setASL_38(model.getASL_38());
		soapModel.setREGIONE_39(model.getREGIONE_39());
		soapModel.setDATA_40(model.getDATA_40());
		soapModel.setFIRMA_41(model.getFIRMA_41());

		return soapModel;
	}

	public static form_di_segnalazioneSoap[] toSoapModels(
		form_di_segnalazione[] models) {
		form_di_segnalazioneSoap[] soapModels = new form_di_segnalazioneSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static form_di_segnalazioneSoap[][] toSoapModels(
		form_di_segnalazione[][] models) {
		form_di_segnalazioneSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new form_di_segnalazioneSoap[models.length][models[0].length];
		}
		else {
			soapModels = new form_di_segnalazioneSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static form_di_segnalazioneSoap[] toSoapModels(
		List<form_di_segnalazione> models) {
		List<form_di_segnalazioneSoap> soapModels = new ArrayList<form_di_segnalazioneSoap>(models.size());

		for (form_di_segnalazione model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new form_di_segnalazioneSoap[soapModels.size()]);
	}

	public form_di_segnalazioneSoap() {
	}

	public long getPrimaryKey() {
		return _Form_di_segnalazione_id;
	}

	public void setPrimaryKey(long pk) {
		setForm_di_segnalazione_id(pk);
	}

	public long getForm_di_segnalazione_id() {
		return _Form_di_segnalazione_id;
	}

	public void setForm_di_segnalazione_id(long Form_di_segnalazione_id) {
		_Form_di_segnalazione_id = Form_di_segnalazione_id;
	}

	public String getCODICE() {
		return _CODICE;
	}

	public void setCODICE(String CODICE) {
		_CODICE = CODICE;
	}

	public String getINIZIALI_1() {
		return _INIZIALI_1;
	}

	public void setINIZIALI_1(String INIZIALI_1) {
		_INIZIALI_1 = INIZIALI_1;
	}

	public String getINIZIALI_1_a() {
		return _INIZIALI_1_a;
	}

	public void setINIZIALI_1_a(String INIZIALI_1_a) {
		_INIZIALI_1_a = INIZIALI_1_a;
	}

	public String getINIZIALI_1_b() {
		return _INIZIALI_1_b;
	}

	public void setINIZIALI_1_b(String INIZIALI_1_b) {
		_INIZIALI_1_b = INIZIALI_1_b;
	}

	public String getINIZIALI_1_c() {
		return _INIZIALI_1_c;
	}

	public void setINIZIALI_1_c(String INIZIALI_1_c) {
		_INIZIALI_1_c = INIZIALI_1_c;
	}

	public String getINIZIALI_1_d() {
		return _INIZIALI_1_d;
	}

	public void setINIZIALI_1_d(String INIZIALI_1_d) {
		_INIZIALI_1_d = INIZIALI_1_d;
	}

	public String getINIZIALI_1_e() {
		return _INIZIALI_1_e;
	}

	public void setINIZIALI_1_e(String INIZIALI_1_e) {
		_INIZIALI_1_e = INIZIALI_1_e;
	}

	public String getDATA_2() {
		return _DATA_2;
	}

	public void setDATA_2(String DATA_2) {
		_DATA_2 = DATA_2;
	}

	public String getSESSO_3() {
		return _SESSO_3;
	}

	public void setSESSO_3(String SESSO_3) {
		_SESSO_3 = SESSO_3;
	}

	public String getDATA_4() {
		return _DATA_4;
	}

	public void setDATA_4(String DATA_4) {
		_DATA_4 = DATA_4;
	}

	public String getORIGINE_5() {
		return _ORIGINE_5;
	}

	public void setORIGINE_5(String ORIGINE_5) {
		_ORIGINE_5 = ORIGINE_5;
	}

	public String getDESCRIZIONE_6() {
		return _DESCRIZIONE_6;
	}

	public void setDESCRIZIONE_6(String DESCRIZIONE_6) {
		_DESCRIZIONE_6 = DESCRIZIONE_6;
	}

	public String getINDICARE_7_1() {
		return _INDICARE_7_1;
	}

	public void setINDICARE_7_1(String INDICARE_7_1) {
		_INDICARE_7_1 = INDICARE_7_1;
	}

	public String getINDICARE_7_2() {
		return _INDICARE_7_2;
	}

	public void setINDICARE_7_2(String INDICARE_7_2) {
		_INDICARE_7_2 = INDICARE_7_2;
	}

	public String getINDICARE_7_3() {
		return _INDICARE_7_3;
	}

	public void setINDICARE_7_3(String INDICARE_7_3) {
		_INDICARE_7_3 = INDICARE_7_3;
	}

	public String getINDICARE_7_4() {
		return _INDICARE_7_4;
	}

	public void setINDICARE_7_4(String INDICARE_7_4) {
		_INDICARE_7_4 = INDICARE_7_4;
	}

	public String getINDICARE_7_5() {
		return _INDICARE_7_5;
	}

	public void setINDICARE_7_5(String INDICARE_7_5) {
		_INDICARE_7_5 = INDICARE_7_5;
	}

	public String getINDICARE_7_6() {
		return _INDICARE_7_6;
	}

	public void setINDICARE_7_6(String INDICARE_7_6) {
		_INDICARE_7_6 = INDICARE_7_6;
	}

	public String getINDICARE_7_7() {
		return _INDICARE_7_7;
	}

	public void setINDICARE_7_7(String INDICARE_7_7) {
		_INDICARE_7_7 = INDICARE_7_7;
	}

	public String getGRAVITA_8_1() {
		return _GRAVITA_8_1;
	}

	public void setGRAVITA_8_1(String GRAVITA_8_1) {
		_GRAVITA_8_1 = GRAVITA_8_1;
	}

	public String getGRAVITA_8_2() {
		return _GRAVITA_8_2;
	}

	public void setGRAVITA_8_2(String GRAVITA_8_2) {
		_GRAVITA_8_2 = GRAVITA_8_2;
	}

	public String getGRAVITA_8_3() {
		return _GRAVITA_8_3;
	}

	public void setGRAVITA_8_3(String GRAVITA_8_3) {
		_GRAVITA_8_3 = GRAVITA_8_3;
	}

	public String getGRAVITA_8_4() {
		return _GRAVITA_8_4;
	}

	public void setGRAVITA_8_4(String GRAVITA_8_4) {
		_GRAVITA_8_4 = GRAVITA_8_4;
	}

	public String getGRAVITA_8_5() {
		return _GRAVITA_8_5;
	}

	public void setGRAVITA_8_5(String GRAVITA_8_5) {
		_GRAVITA_8_5 = GRAVITA_8_5;
	}

	public String getGRAVITA_8_6() {
		return _GRAVITA_8_6;
	}

	public void setGRAVITA_8_6(String GRAVITA_8_6) {
		_GRAVITA_8_6 = GRAVITA_8_6;
	}

	public String getGRAVITA_8_7() {
		return _GRAVITA_8_7;
	}

	public void setGRAVITA_8_7(String GRAVITA_8_7) {
		_GRAVITA_8_7 = GRAVITA_8_7;
	}

	public String getEVENTUALI_9() {
		return _EVENTUALI_9;
	}

	public void setEVENTUALI_9(String EVENTUALI_9) {
		_EVENTUALI_9 = EVENTUALI_9;
	}

	public String getESITO_10() {
		return _ESITO_10;
	}

	public void setESITO_10(String ESITO_10) {
		_ESITO_10 = ESITO_10;
	}

	public String getESITO_10_1() {
		return _ESITO_10_1;
	}

	public void setESITO_10_1(String ESITO_10_1) {
		_ESITO_10_1 = ESITO_10_1;
	}

	public String getESITO_10_2() {
		return _ESITO_10_2;
	}

	public void setESITO_10_2(String ESITO_10_2) {
		_ESITO_10_2 = ESITO_10_2;
	}

	public String getESITO_10_3() {
		return _ESITO_10_3;
	}

	public void setESITO_10_3(String ESITO_10_3) {
		_ESITO_10_3 = ESITO_10_3;
	}

	public String getESITO_10_4() {
		return _ESITO_10_4;
	}

	public void setESITO_10_4(String ESITO_10_4) {
		_ESITO_10_4 = ESITO_10_4;
	}

	public String getESITO_10_5() {
		return _ESITO_10_5;
	}

	public void setESITO_10_5(String ESITO_10_5) {
		_ESITO_10_5 = ESITO_10_5;
	}

	public String getESITO_10_6() {
		return _ESITO_10_6;
	}

	public void setESITO_10_6(String ESITO_10_6) {
		_ESITO_10_6 = ESITO_10_6;
	}

	public String getESITO_10_7() {
		return _ESITO_10_7;
	}

	public void setESITO_10_7(String ESITO_10_7) {
		_ESITO_10_7 = ESITO_10_7;
	}

	public String getESITO_10_8() {
		return _ESITO_10_8;
	}

	public void setESITO_10_8(String ESITO_10_8) {
		_ESITO_10_8 = ESITO_10_8;
	}

	public String getESITO_10_9() {
		return _ESITO_10_9;
	}

	public void setESITO_10_9(String ESITO_10_9) {
		_ESITO_10_9 = ESITO_10_9;
	}

	public String getESITO_10_10() {
		return _ESITO_10_10;
	}

	public void setESITO_10_10(String ESITO_10_10) {
		_ESITO_10_10 = ESITO_10_10;
	}

	public String getAZIONI_11() {
		return _AZIONI_11;
	}

	public void setAZIONI_11(String AZIONI_11) {
		_AZIONI_11 = AZIONI_11;
	}

	public String getFARMACO_12_a() {
		return _FARMACO_12_a;
	}

	public void setFARMACO_12_a(String FARMACO_12_a) {
		_FARMACO_12_a = FARMACO_12_a;
	}

	public String getFARMACO_12_a_13() {
		return _FARMACO_12_a_13;
	}

	public void setFARMACO_12_a_13(String FARMACO_12_a_13) {
		_FARMACO_12_a_13 = FARMACO_12_a_13;
	}

	public String getFARMACO_12_a_14() {
		return _FARMACO_12_a_14;
	}

	public void setFARMACO_12_a_14(String FARMACO_12_a_14) {
		_FARMACO_12_a_14 = FARMACO_12_a_14;
	}

	public String getFARMACO_12_a_15() {
		return _FARMACO_12_a_15;
	}

	public void setFARMACO_12_a_15(String FARMACO_12_a_15) {
		_FARMACO_12_a_15 = FARMACO_12_a_15;
	}

	public String getFARMACO_12_a_16_1() {
		return _FARMACO_12_a_16_1;
	}

	public void setFARMACO_12_a_16_1(String FARMACO_12_a_16_1) {
		_FARMACO_12_a_16_1 = FARMACO_12_a_16_1;
	}

	public String getFARMACO_12_a_16_2() {
		return _FARMACO_12_a_16_2;
	}

	public void setFARMACO_12_a_16_2(String FARMACO_12_a_16_2) {
		_FARMACO_12_a_16_2 = FARMACO_12_a_16_2;
	}

	public String getFARMACO_12_a_17() {
		return _FARMACO_12_a_17;
	}

	public void setFARMACO_12_a_17(String FARMACO_12_a_17) {
		_FARMACO_12_a_17 = FARMACO_12_a_17;
	}

	public String getFARMACO_12_a_18() {
		return _FARMACO_12_a_18;
	}

	public void setFARMACO_12_a_18(String FARMACO_12_a_18) {
		_FARMACO_12_a_18 = FARMACO_12_a_18;
	}

	public String getFARMACO_12_a_19() {
		return _FARMACO_12_a_19;
	}

	public void setFARMACO_12_a_19(String FARMACO_12_a_19) {
		_FARMACO_12_a_19 = FARMACO_12_a_19;
	}

	public String getFARMACO_12_a_20() {
		return _FARMACO_12_a_20;
	}

	public void setFARMACO_12_a_20(String FARMACO_12_a_20) {
		_FARMACO_12_a_20 = FARMACO_12_a_20;
	}

	public String getFARMACO_12_b() {
		return _FARMACO_12_b;
	}

	public void setFARMACO_12_b(String FARMACO_12_b) {
		_FARMACO_12_b = FARMACO_12_b;
	}

	public String getFARMACO_12_b_13() {
		return _FARMACO_12_b_13;
	}

	public void setFARMACO_12_b_13(String FARMACO_12_b_13) {
		_FARMACO_12_b_13 = FARMACO_12_b_13;
	}

	public String getFARMACO_12_b_14() {
		return _FARMACO_12_b_14;
	}

	public void setFARMACO_12_b_14(String FARMACO_12_b_14) {
		_FARMACO_12_b_14 = FARMACO_12_b_14;
	}

	public String getFARMACO_12_b_15() {
		return _FARMACO_12_b_15;
	}

	public void setFARMACO_12_b_15(String FARMACO_12_b_15) {
		_FARMACO_12_b_15 = FARMACO_12_b_15;
	}

	public String getFARMACO_12_b_16_1() {
		return _FARMACO_12_b_16_1;
	}

	public void setFARMACO_12_b_16_1(String FARMACO_12_b_16_1) {
		_FARMACO_12_b_16_1 = FARMACO_12_b_16_1;
	}

	public String getFARMACO_12_b_16_2() {
		return _FARMACO_12_b_16_2;
	}

	public void setFARMACO_12_b_16_2(String FARMACO_12_b_16_2) {
		_FARMACO_12_b_16_2 = FARMACO_12_b_16_2;
	}

	public String getFARMACO_12_b_17() {
		return _FARMACO_12_b_17;
	}

	public void setFARMACO_12_b_17(String FARMACO_12_b_17) {
		_FARMACO_12_b_17 = FARMACO_12_b_17;
	}

	public String getFARMACO_12_b_18() {
		return _FARMACO_12_b_18;
	}

	public void setFARMACO_12_b_18(String FARMACO_12_b_18) {
		_FARMACO_12_b_18 = FARMACO_12_b_18;
	}

	public String getFARMACO_12_b_19() {
		return _FARMACO_12_b_19;
	}

	public void setFARMACO_12_b_19(String FARMACO_12_b_19) {
		_FARMACO_12_b_19 = FARMACO_12_b_19;
	}

	public String getFARMACO_12_b_20() {
		return _FARMACO_12_b_20;
	}

	public void setFARMACO_12_b_20(String FARMACO_12_b_20) {
		_FARMACO_12_b_20 = FARMACO_12_b_20;
	}

	public String getFARMACO_12_c() {
		return _FARMACO_12_c;
	}

	public void setFARMACO_12_c(String FARMACO_12_c) {
		_FARMACO_12_c = FARMACO_12_c;
	}

	public String getFARMACO_12_c_13() {
		return _FARMACO_12_c_13;
	}

	public void setFARMACO_12_c_13(String FARMACO_12_c_13) {
		_FARMACO_12_c_13 = FARMACO_12_c_13;
	}

	public String getFARMACO_12_c_14() {
		return _FARMACO_12_c_14;
	}

	public void setFARMACO_12_c_14(String FARMACO_12_c_14) {
		_FARMACO_12_c_14 = FARMACO_12_c_14;
	}

	public String getFARMACO_12_c_15() {
		return _FARMACO_12_c_15;
	}

	public void setFARMACO_12_c_15(String FARMACO_12_c_15) {
		_FARMACO_12_c_15 = FARMACO_12_c_15;
	}

	public String getFARMACO_12_c_16_1() {
		return _FARMACO_12_c_16_1;
	}

	public void setFARMACO_12_c_16_1(String FARMACO_12_c_16_1) {
		_FARMACO_12_c_16_1 = FARMACO_12_c_16_1;
	}

	public String getFARMACO_12_c_16_2() {
		return _FARMACO_12_c_16_2;
	}

	public void setFARMACO_12_c_16_2(String FARMACO_12_c_16_2) {
		_FARMACO_12_c_16_2 = FARMACO_12_c_16_2;
	}

	public String getFARMACO_12_c_17() {
		return _FARMACO_12_c_17;
	}

	public void setFARMACO_12_c_17(String FARMACO_12_c_17) {
		_FARMACO_12_c_17 = FARMACO_12_c_17;
	}

	public String getFARMACO_12_c_18() {
		return _FARMACO_12_c_18;
	}

	public void setFARMACO_12_c_18(String FARMACO_12_c_18) {
		_FARMACO_12_c_18 = FARMACO_12_c_18;
	}

	public String getFARMACO_12_c_19() {
		return _FARMACO_12_c_19;
	}

	public void setFARMACO_12_c_19(String FARMACO_12_c_19) {
		_FARMACO_12_c_19 = FARMACO_12_c_19;
	}

	public String getFARMACO_12_c_20() {
		return _FARMACO_12_c_20;
	}

	public void setFARMACO_12_c_20(String FARMACO_12_c_20) {
		_FARMACO_12_c_20 = FARMACO_12_c_20;
	}

	public String getINDICAZIONI_21_a() {
		return _INDICAZIONI_21_a;
	}

	public void setINDICAZIONI_21_a(String INDICAZIONI_21_a) {
		_INDICAZIONI_21_a = INDICAZIONI_21_a;
	}

	public String getINDICAZIONI_21_b() {
		return _INDICAZIONI_21_b;
	}

	public void setINDICAZIONI_21_b(String INDICAZIONI_21_b) {
		_INDICAZIONI_21_b = INDICAZIONI_21_b;
	}

	public String getINDICAZIONI_21_c() {
		return _INDICAZIONI_21_c;
	}

	public void setINDICAZIONI_21_c(String INDICAZIONI_21_c) {
		_INDICAZIONI_21_c = INDICAZIONI_21_c;
	}

	public String getFARMACO_22_a() {
		return _FARMACO_22_a;
	}

	public void setFARMACO_22_a(String FARMACO_22_a) {
		_FARMACO_22_a = FARMACO_22_a;
	}

	public String getFARMACO_22_a_23() {
		return _FARMACO_22_a_23;
	}

	public void setFARMACO_22_a_23(String FARMACO_22_a_23) {
		_FARMACO_22_a_23 = FARMACO_22_a_23;
	}

	public String getFARMACO_22_a_24() {
		return _FARMACO_22_a_24;
	}

	public void setFARMACO_22_a_24(String FARMACO_22_a_24) {
		_FARMACO_22_a_24 = FARMACO_22_a_24;
	}

	public String getFARMACO_22_a_25() {
		return _FARMACO_22_a_25;
	}

	public void setFARMACO_22_a_25(String FARMACO_22_a_25) {
		_FARMACO_22_a_25 = FARMACO_22_a_25;
	}

	public String getFARMACO_22_a_26_1() {
		return _FARMACO_22_a_26_1;
	}

	public void setFARMACO_22_a_26_1(String FARMACO_22_a_26_1) {
		_FARMACO_22_a_26_1 = FARMACO_22_a_26_1;
	}

	public String getFARMACO_22_a_26_2() {
		return _FARMACO_22_a_26_2;
	}

	public void setFARMACO_22_a_26_2(String FARMACO_22_a_26_2) {
		_FARMACO_22_a_26_2 = FARMACO_22_a_26_2;
	}

	public String getFARMACO_22_a_27() {
		return _FARMACO_22_a_27;
	}

	public void setFARMACO_22_a_27(String FARMACO_22_a_27) {
		_FARMACO_22_a_27 = FARMACO_22_a_27;
	}

	public String getFARMACO_22_a_28() {
		return _FARMACO_22_a_28;
	}

	public void setFARMACO_22_a_28(String FARMACO_22_a_28) {
		_FARMACO_22_a_28 = FARMACO_22_a_28;
	}

	public String getFARMACO_22_a_29() {
		return _FARMACO_22_a_29;
	}

	public void setFARMACO_22_a_29(String FARMACO_22_a_29) {
		_FARMACO_22_a_29 = FARMACO_22_a_29;
	}

	public String getFARMACO_22_a_30() {
		return _FARMACO_22_a_30;
	}

	public void setFARMACO_22_a_30(String FARMACO_22_a_30) {
		_FARMACO_22_a_30 = FARMACO_22_a_30;
	}

	public String getFARMACO_22_b() {
		return _FARMACO_22_b;
	}

	public void setFARMACO_22_b(String FARMACO_22_b) {
		_FARMACO_22_b = FARMACO_22_b;
	}

	public String getFARMACO_22_b_23() {
		return _FARMACO_22_b_23;
	}

	public void setFARMACO_22_b_23(String FARMACO_22_b_23) {
		_FARMACO_22_b_23 = FARMACO_22_b_23;
	}

	public String getFARMACO_22_b_24() {
		return _FARMACO_22_b_24;
	}

	public void setFARMACO_22_b_24(String FARMACO_22_b_24) {
		_FARMACO_22_b_24 = FARMACO_22_b_24;
	}

	public String getFARMACO_22_b_25() {
		return _FARMACO_22_b_25;
	}

	public void setFARMACO_22_b_25(String FARMACO_22_b_25) {
		_FARMACO_22_b_25 = FARMACO_22_b_25;
	}

	public String getFARMACO_22_b_26_1() {
		return _FARMACO_22_b_26_1;
	}

	public void setFARMACO_22_b_26_1(String FARMACO_22_b_26_1) {
		_FARMACO_22_b_26_1 = FARMACO_22_b_26_1;
	}

	public String getFARMACO_22_b_26_2() {
		return _FARMACO_22_b_26_2;
	}

	public void setFARMACO_22_b_26_2(String FARMACO_22_b_26_2) {
		_FARMACO_22_b_26_2 = FARMACO_22_b_26_2;
	}

	public String getFARMACO_22_b_27() {
		return _FARMACO_22_b_27;
	}

	public void setFARMACO_22_b_27(String FARMACO_22_b_27) {
		_FARMACO_22_b_27 = FARMACO_22_b_27;
	}

	public String getFARMACO_22_b_28() {
		return _FARMACO_22_b_28;
	}

	public void setFARMACO_22_b_28(String FARMACO_22_b_28) {
		_FARMACO_22_b_28 = FARMACO_22_b_28;
	}

	public String getFARMACO_22_b_29() {
		return _FARMACO_22_b_29;
	}

	public void setFARMACO_22_b_29(String FARMACO_22_b_29) {
		_FARMACO_22_b_29 = FARMACO_22_b_29;
	}

	public String getFARMACO_22_b_30() {
		return _FARMACO_22_b_30;
	}

	public void setFARMACO_22_b_30(String FARMACO_22_b_30) {
		_FARMACO_22_b_30 = FARMACO_22_b_30;
	}

	public String getINDICAZIONI_31_a() {
		return _INDICAZIONI_31_a;
	}

	public void setINDICAZIONI_31_a(String INDICAZIONI_31_a) {
		_INDICAZIONI_31_a = INDICAZIONI_31_a;
	}

	public String getINDICAZIONI_31_b() {
		return _INDICAZIONI_31_b;
	}

	public void setINDICAZIONI_31_b(String INDICAZIONI_31_b) {
		_INDICAZIONI_31_b = INDICAZIONI_31_b;
	}

	public String getUSO_32() {
		return _USO_32;
	}

	public void setUSO_32(String USO_32) {
		_USO_32 = USO_32;
	}

	public String getCONDIZIONI_33() {
		return _CONDIZIONI_33;
	}

	public void setCONDIZIONI_33(String CONDIZIONI_33) {
		_CONDIZIONI_33 = CONDIZIONI_33;
	}

	public String getALTRE_34() {
		return _ALTRE_34;
	}

	public void setALTRE_34(String ALTRE_34) {
		_ALTRE_34 = ALTRE_34;
	}

	public String getINDICARE_35_1() {
		return _INDICARE_35_1;
	}

	public void setINDICARE_35_1(String INDICARE_35_1) {
		_INDICARE_35_1 = INDICARE_35_1;
	}

	public String getINDICARE_35_2() {
		return _INDICARE_35_2;
	}

	public void setINDICARE_35_2(String INDICARE_35_2) {
		_INDICARE_35_2 = INDICARE_35_2;
	}

	public String getINDICARE_35_3() {
		return _INDICARE_35_3;
	}

	public void setINDICARE_35_3(String INDICARE_35_3) {
		_INDICARE_35_3 = INDICARE_35_3;
	}

	public String getINDICARE_35_4() {
		return _INDICARE_35_4;
	}

	public void setINDICARE_35_4(String INDICARE_35_4) {
		_INDICARE_35_4 = INDICARE_35_4;
	}

	public String getINDICARE_35_5() {
		return _INDICARE_35_5;
	}

	public void setINDICARE_35_5(String INDICARE_35_5) {
		_INDICARE_35_5 = INDICARE_35_5;
	}

	public String getINDICARE_35_6() {
		return _INDICARE_35_6;
	}

	public void setINDICARE_35_6(String INDICARE_35_6) {
		_INDICARE_35_6 = INDICARE_35_6;
	}

	public String getQUALIFICA_36_1() {
		return _QUALIFICA_36_1;
	}

	public void setQUALIFICA_36_1(String QUALIFICA_36_1) {
		_QUALIFICA_36_1 = QUALIFICA_36_1;
	}

	public String getQUALIFICA_36_2() {
		return _QUALIFICA_36_2;
	}

	public void setQUALIFICA_36_2(String QUALIFICA_36_2) {
		_QUALIFICA_36_2 = QUALIFICA_36_2;
	}

	public String getQUALIFICA_36_3() {
		return _QUALIFICA_36_3;
	}

	public void setQUALIFICA_36_3(String QUALIFICA_36_3) {
		_QUALIFICA_36_3 = QUALIFICA_36_3;
	}

	public String getQUALIFICA_36_4() {
		return _QUALIFICA_36_4;
	}

	public void setQUALIFICA_36_4(String QUALIFICA_36_4) {
		_QUALIFICA_36_4 = QUALIFICA_36_4;
	}

	public String getQUALIFICA_36_5() {
		return _QUALIFICA_36_5;
	}

	public void setQUALIFICA_36_5(String QUALIFICA_36_5) {
		_QUALIFICA_36_5 = QUALIFICA_36_5;
	}

	public String getQUALIFICA_36_6() {
		return _QUALIFICA_36_6;
	}

	public void setQUALIFICA_36_6(String QUALIFICA_36_6) {
		_QUALIFICA_36_6 = QUALIFICA_36_6;
	}

	public String getQUALIFICA_36_7() {
		return _QUALIFICA_36_7;
	}

	public void setQUALIFICA_36_7(String QUALIFICA_36_7) {
		_QUALIFICA_36_7 = QUALIFICA_36_7;
	}

	public String getQUALIFICA_36_8() {
		return _QUALIFICA_36_8;
	}

	public void setQUALIFICA_36_8(String QUALIFICA_36_8) {
		_QUALIFICA_36_8 = QUALIFICA_36_8;
	}

	public String getQUALIFICA_36_9() {
		return _QUALIFICA_36_9;
	}

	public void setQUALIFICA_36_9(String QUALIFICA_36_9) {
		_QUALIFICA_36_9 = QUALIFICA_36_9;
	}

	public String getQUALIFICA_36_10() {
		return _QUALIFICA_36_10;
	}

	public void setQUALIFICA_36_10(String QUALIFICA_36_10) {
		_QUALIFICA_36_10 = QUALIFICA_36_10;
	}

	public String getDATI_37_1() {
		return _DATI_37_1;
	}

	public void setDATI_37_1(String DATI_37_1) {
		_DATI_37_1 = DATI_37_1;
	}

	public String getDATI_37_2() {
		return _DATI_37_2;
	}

	public void setDATI_37_2(String DATI_37_2) {
		_DATI_37_2 = DATI_37_2;
	}

	public String getDATI_37_3() {
		return _DATI_37_3;
	}

	public void setDATI_37_3(String DATI_37_3) {
		_DATI_37_3 = DATI_37_3;
	}

	public String getDATI_37_4() {
		return _DATI_37_4;
	}

	public void setDATI_37_4(String DATI_37_4) {
		_DATI_37_4 = DATI_37_4;
	}

	public String getASL_38() {
		return _ASL_38;
	}

	public void setASL_38(String ASL_38) {
		_ASL_38 = ASL_38;
	}

	public String getREGIONE_39() {
		return _REGIONE_39;
	}

	public void setREGIONE_39(String REGIONE_39) {
		_REGIONE_39 = REGIONE_39;
	}

	public String getDATA_40() {
		return _DATA_40;
	}

	public void setDATA_40(String DATA_40) {
		_DATA_40 = DATA_40;
	}

	public String getFIRMA_41() {
		return _FIRMA_41;
	}

	public void setFIRMA_41(String FIRMA_41) {
		_FIRMA_41 = FIRMA_41;
	}

	private long _Form_di_segnalazione_id;
	private String _CODICE;
	private String _INIZIALI_1;
	private String _INIZIALI_1_a;
	private String _INIZIALI_1_b;
	private String _INIZIALI_1_c;
	private String _INIZIALI_1_d;
	private String _INIZIALI_1_e;
	private String _DATA_2;
	private String _SESSO_3;
	private String _DATA_4;
	private String _ORIGINE_5;
	private String _DESCRIZIONE_6;
	private String _INDICARE_7_1;
	private String _INDICARE_7_2;
	private String _INDICARE_7_3;
	private String _INDICARE_7_4;
	private String _INDICARE_7_5;
	private String _INDICARE_7_6;
	private String _INDICARE_7_7;
	private String _GRAVITA_8_1;
	private String _GRAVITA_8_2;
	private String _GRAVITA_8_3;
	private String _GRAVITA_8_4;
	private String _GRAVITA_8_5;
	private String _GRAVITA_8_6;
	private String _GRAVITA_8_7;
	private String _EVENTUALI_9;
	private String _ESITO_10;
	private String _ESITO_10_1;
	private String _ESITO_10_2;
	private String _ESITO_10_3;
	private String _ESITO_10_4;
	private String _ESITO_10_5;
	private String _ESITO_10_6;
	private String _ESITO_10_7;
	private String _ESITO_10_8;
	private String _ESITO_10_9;
	private String _ESITO_10_10;
	private String _AZIONI_11;
	private String _FARMACO_12_a;
	private String _FARMACO_12_a_13;
	private String _FARMACO_12_a_14;
	private String _FARMACO_12_a_15;
	private String _FARMACO_12_a_16_1;
	private String _FARMACO_12_a_16_2;
	private String _FARMACO_12_a_17;
	private String _FARMACO_12_a_18;
	private String _FARMACO_12_a_19;
	private String _FARMACO_12_a_20;
	private String _FARMACO_12_b;
	private String _FARMACO_12_b_13;
	private String _FARMACO_12_b_14;
	private String _FARMACO_12_b_15;
	private String _FARMACO_12_b_16_1;
	private String _FARMACO_12_b_16_2;
	private String _FARMACO_12_b_17;
	private String _FARMACO_12_b_18;
	private String _FARMACO_12_b_19;
	private String _FARMACO_12_b_20;
	private String _FARMACO_12_c;
	private String _FARMACO_12_c_13;
	private String _FARMACO_12_c_14;
	private String _FARMACO_12_c_15;
	private String _FARMACO_12_c_16_1;
	private String _FARMACO_12_c_16_2;
	private String _FARMACO_12_c_17;
	private String _FARMACO_12_c_18;
	private String _FARMACO_12_c_19;
	private String _FARMACO_12_c_20;
	private String _INDICAZIONI_21_a;
	private String _INDICAZIONI_21_b;
	private String _INDICAZIONI_21_c;
	private String _FARMACO_22_a;
	private String _FARMACO_22_a_23;
	private String _FARMACO_22_a_24;
	private String _FARMACO_22_a_25;
	private String _FARMACO_22_a_26_1;
	private String _FARMACO_22_a_26_2;
	private String _FARMACO_22_a_27;
	private String _FARMACO_22_a_28;
	private String _FARMACO_22_a_29;
	private String _FARMACO_22_a_30;
	private String _FARMACO_22_b;
	private String _FARMACO_22_b_23;
	private String _FARMACO_22_b_24;
	private String _FARMACO_22_b_25;
	private String _FARMACO_22_b_26_1;
	private String _FARMACO_22_b_26_2;
	private String _FARMACO_22_b_27;
	private String _FARMACO_22_b_28;
	private String _FARMACO_22_b_29;
	private String _FARMACO_22_b_30;
	private String _INDICAZIONI_31_a;
	private String _INDICAZIONI_31_b;
	private String _USO_32;
	private String _CONDIZIONI_33;
	private String _ALTRE_34;
	private String _INDICARE_35_1;
	private String _INDICARE_35_2;
	private String _INDICARE_35_3;
	private String _INDICARE_35_4;
	private String _INDICARE_35_5;
	private String _INDICARE_35_6;
	private String _QUALIFICA_36_1;
	private String _QUALIFICA_36_2;
	private String _QUALIFICA_36_3;
	private String _QUALIFICA_36_4;
	private String _QUALIFICA_36_5;
	private String _QUALIFICA_36_6;
	private String _QUALIFICA_36_7;
	private String _QUALIFICA_36_8;
	private String _QUALIFICA_36_9;
	private String _QUALIFICA_36_10;
	private String _DATI_37_1;
	private String _DATI_37_2;
	private String _DATI_37_3;
	private String _DATI_37_4;
	private String _ASL_38;
	private String _REGIONE_39;
	private String _DATA_40;
	private String _FIRMA_41;
}
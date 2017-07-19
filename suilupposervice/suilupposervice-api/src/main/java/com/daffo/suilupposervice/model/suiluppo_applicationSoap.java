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
public class suiluppo_applicationSoap implements Serializable {
	public static suiluppo_applicationSoap toSoapModel(
		suiluppo_application model) {
		suiluppo_applicationSoap soapModel = new suiluppo_applicationSoap();

		soapModel.setApplicat_id(model.getApplicat_id());
		soapModel.setApplicat_name(model.getApplicat_name());
		soapModel.setApplicat_email(model.getApplicat_email());
		soapModel.setApplicat_phone(model.getApplicat_phone());
		soapModel.setCourse_id(model.getCourse_id());
		soapModel.setApplicat_confirm(model.getApplicat_confirm());

		return soapModel;
	}

	public static suiluppo_applicationSoap[] toSoapModels(
		suiluppo_application[] models) {
		suiluppo_applicationSoap[] soapModels = new suiluppo_applicationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_applicationSoap[][] toSoapModels(
		suiluppo_application[][] models) {
		suiluppo_applicationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new suiluppo_applicationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new suiluppo_applicationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static suiluppo_applicationSoap[] toSoapModels(
		List<suiluppo_application> models) {
		List<suiluppo_applicationSoap> soapModels = new ArrayList<suiluppo_applicationSoap>(models.size());

		for (suiluppo_application model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new suiluppo_applicationSoap[soapModels.size()]);
	}

	public suiluppo_applicationSoap() {
	}

	public long getPrimaryKey() {
		return _applicat_id;
	}

	public void setPrimaryKey(long pk) {
		setApplicat_id(pk);
	}

	public long getApplicat_id() {
		return _applicat_id;
	}

	public void setApplicat_id(long applicat_id) {
		_applicat_id = applicat_id;
	}

	public String getApplicat_name() {
		return _applicat_name;
	}

	public void setApplicat_name(String applicat_name) {
		_applicat_name = applicat_name;
	}

	public String getApplicat_email() {
		return _applicat_email;
	}

	public void setApplicat_email(String applicat_email) {
		_applicat_email = applicat_email;
	}

	public String getApplicat_phone() {
		return _applicat_phone;
	}

	public void setApplicat_phone(String applicat_phone) {
		_applicat_phone = applicat_phone;
	}

	public long getCourse_id() {
		return _course_id;
	}

	public void setCourse_id(long course_id) {
		_course_id = course_id;
	}

	public String getApplicat_confirm() {
		return _applicat_confirm;
	}

	public void setApplicat_confirm(String applicat_confirm) {
		_applicat_confirm = applicat_confirm;
	}

	private long _applicat_id;
	private String _applicat_name;
	private String _applicat_email;
	private String _applicat_phone;
	private long _course_id;
	private String _applicat_confirm;
}
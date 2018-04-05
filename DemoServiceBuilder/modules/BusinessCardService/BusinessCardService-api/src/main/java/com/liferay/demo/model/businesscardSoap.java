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

package com.liferay.demo.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.demo.service.http.businesscardServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.demo.service.http.businesscardServiceSoap
 * @generated
 */
@ProviderType
public class businesscardSoap implements Serializable {
	public static businesscardSoap toSoapModel(businesscard model) {
		businesscardSoap soapModel = new businesscardSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBusinesscardId(model.getBusinesscardId());
		soapModel.setName(model.getName());
		soapModel.setPosition(model.getPosition());
		soapModel.setEmail(model.getEmail());
		soapModel.setPhone(model.getPhone());
		soapModel.setCompany(model.getCompany());

		return soapModel;
	}

	public static businesscardSoap[] toSoapModels(businesscard[] models) {
		businesscardSoap[] soapModels = new businesscardSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static businesscardSoap[][] toSoapModels(businesscard[][] models) {
		businesscardSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new businesscardSoap[models.length][models[0].length];
		}
		else {
			soapModels = new businesscardSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static businesscardSoap[] toSoapModels(List<businesscard> models) {
		List<businesscardSoap> soapModels = new ArrayList<businesscardSoap>(models.size());

		for (businesscard model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new businesscardSoap[soapModels.size()]);
	}

	public businesscardSoap() {
	}

	public long getPrimaryKey() {
		return _businesscardId;
	}

	public void setPrimaryKey(long pk) {
		setBusinesscardId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBusinesscardId() {
		return _businesscardId;
	}

	public void setBusinesscardId(long businesscardId) {
		_businesscardId = businesscardId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getCompany() {
		return _company;
	}

	public void setCompany(String company) {
		_company = company;
	}

	private String _uuid;
	private long _businesscardId;
	private String _name;
	private String _position;
	private String _email;
	private String _phone;
	private String _company;
}
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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link businesscard}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see businesscard
 * @generated
 */
@ProviderType
public class businesscardWrapper implements businesscard,
	ModelWrapper<businesscard> {
	public businesscardWrapper(businesscard businesscard) {
		_businesscard = businesscard;
	}

	@Override
	public Class<?> getModelClass() {
		return businesscard.class;
	}

	@Override
	public String getModelClassName() {
		return businesscard.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("businesscardId", getBusinesscardId());
		attributes.put("name", getName());
		attributes.put("position", getPosition());
		attributes.put("email", getEmail());
		attributes.put("phone", getPhone());
		attributes.put("company", getCompany());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long businesscardId = (Long)attributes.get("businesscardId");

		if (businesscardId != null) {
			setBusinesscardId(businesscardId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String company = (String)attributes.get("company");

		if (company != null) {
			setCompany(company);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _businesscard.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _businesscard.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _businesscard.isNew();
	}

	@Override
	public com.liferay.demo.model.businesscard toEscapedModel() {
		return new businesscardWrapper(_businesscard.toEscapedModel());
	}

	@Override
	public com.liferay.demo.model.businesscard toUnescapedModel() {
		return new businesscardWrapper(_businesscard.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _businesscard.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.liferay.demo.model.businesscard> toCacheModel() {
		return _businesscard.toCacheModel();
	}

	@Override
	public int compareTo(com.liferay.demo.model.businesscard businesscard) {
		return _businesscard.compareTo(businesscard);
	}

	@Override
	public int hashCode() {
		return _businesscard.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businesscard.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new businesscardWrapper((businesscard)_businesscard.clone());
	}

	/**
	* Returns the company of this businesscard.
	*
	* @return the company of this businesscard
	*/
	@Override
	public java.lang.String getCompany() {
		return _businesscard.getCompany();
	}

	/**
	* Returns the email of this businesscard.
	*
	* @return the email of this businesscard
	*/
	@Override
	public java.lang.String getEmail() {
		return _businesscard.getEmail();
	}

	/**
	* Returns the name of this businesscard.
	*
	* @return the name of this businesscard
	*/
	@Override
	public java.lang.String getName() {
		return _businesscard.getName();
	}

	/**
	* Returns the phone of this businesscard.
	*
	* @return the phone of this businesscard
	*/
	@Override
	public java.lang.String getPhone() {
		return _businesscard.getPhone();
	}

	/**
	* Returns the position of this businesscard.
	*
	* @return the position of this businesscard
	*/
	@Override
	public java.lang.String getPosition() {
		return _businesscard.getPosition();
	}

	/**
	* Returns the uuid of this businesscard.
	*
	* @return the uuid of this businesscard
	*/
	@Override
	public java.lang.String getUuid() {
		return _businesscard.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _businesscard.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businesscard.toXmlString();
	}

	/**
	* Returns the businesscard ID of this businesscard.
	*
	* @return the businesscard ID of this businesscard
	*/
	@Override
	public long getBusinesscardId() {
		return _businesscard.getBusinesscardId();
	}

	/**
	* Returns the primary key of this businesscard.
	*
	* @return the primary key of this businesscard
	*/
	@Override
	public long getPrimaryKey() {
		return _businesscard.getPrimaryKey();
	}

	@Override
	public void persist() {
		_businesscard.persist();
	}

	/**
	* Sets the businesscard ID of this businesscard.
	*
	* @param businesscardId the businesscard ID of this businesscard
	*/
	@Override
	public void setBusinesscardId(long businesscardId) {
		_businesscard.setBusinesscardId(businesscardId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businesscard.setCachedModel(cachedModel);
	}

	/**
	* Sets the company of this businesscard.
	*
	* @param company the company of this businesscard
	*/
	@Override
	public void setCompany(java.lang.String company) {
		_businesscard.setCompany(company);
	}

	/**
	* Sets the email of this businesscard.
	*
	* @param email the email of this businesscard
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_businesscard.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_businesscard.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_businesscard.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_businesscard.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the name of this businesscard.
	*
	* @param name the name of this businesscard
	*/
	@Override
	public void setName(java.lang.String name) {
		_businesscard.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_businesscard.setNew(n);
	}

	/**
	* Sets the phone of this businesscard.
	*
	* @param phone the phone of this businesscard
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_businesscard.setPhone(phone);
	}

	/**
	* Sets the position of this businesscard.
	*
	* @param position the position of this businesscard
	*/
	@Override
	public void setPosition(java.lang.String position) {
		_businesscard.setPosition(position);
	}

	/**
	* Sets the primary key of this businesscard.
	*
	* @param primaryKey the primary key of this businesscard
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businesscard.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_businesscard.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the uuid of this businesscard.
	*
	* @param uuid the uuid of this businesscard
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_businesscard.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businesscardWrapper)) {
			return false;
		}

		businesscardWrapper businesscardWrapper = (businesscardWrapper)obj;

        return Objects.equals(_businesscard, businesscardWrapper._businesscard);

    }

	@Override
	public businesscard getWrappedModel() {
		return _businesscard;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _businesscard.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _businesscard.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_businesscard.resetOriginalValues();
	}

	private final businesscard _businesscard;
}
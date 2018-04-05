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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the businesscard service. Represents a row in the &quot;DEMO_businesscard&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.demo.model.impl.businesscardModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.demo.model.impl.businesscardImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see businesscard
 * @see com.liferay.demo.model.impl.businesscardImpl
 * @see com.liferay.demo.model.impl.businesscardModelImpl
 * @generated
 */
@ProviderType
public interface businesscardModel extends BaseModel<businesscard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a businesscard model instance should use the {@link businesscard} interface instead.
	 */

	/**
	 * Returns the primary key of this businesscard.
	 *
	 * @return the primary key of this businesscard
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this businesscard.
	 *
	 * @param primaryKey the primary key of this businesscard
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this businesscard.
	 *
	 * @return the uuid of this businesscard
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this businesscard.
	 *
	 * @param uuid the uuid of this businesscard
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the businesscard ID of this businesscard.
	 *
	 * @return the businesscard ID of this businesscard
	 */
	public long getBusinesscardId();

	/**
	 * Sets the businesscard ID of this businesscard.
	 *
	 * @param businesscardId the businesscard ID of this businesscard
	 */
	public void setBusinesscardId(long businesscardId);

	/**
	 * Returns the name of this businesscard.
	 *
	 * @return the name of this businesscard
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this businesscard.
	 *
	 * @param name the name of this businesscard
	 */
	public void setName(String name);

	/**
	 * Returns the position of this businesscard.
	 *
	 * @return the position of this businesscard
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this businesscard.
	 *
	 * @param position the position of this businesscard
	 */
	public void setPosition(String position);

	/**
	 * Returns the email of this businesscard.
	 *
	 * @return the email of this businesscard
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this businesscard.
	 *
	 * @param email the email of this businesscard
	 */
	public void setEmail(String email);

	/**
	 * Returns the phone of this businesscard.
	 *
	 * @return the phone of this businesscard
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this businesscard.
	 *
	 * @param phone the phone of this businesscard
	 */
	public void setPhone(String phone);

	/**
	 * Returns the company of this businesscard.
	 *
	 * @return the company of this businesscard
	 */
	@AutoEscape
	public String getCompany();

	/**
	 * Sets the company of this businesscard.
	 *
	 * @param company the company of this businesscard
	 */
	public void setCompany(String company);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.demo.model.businesscard businesscard);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.demo.model.businesscard> toCacheModel();

	@Override
	public com.liferay.demo.model.businesscard toEscapedModel();

	@Override
	public com.liferay.demo.model.businesscard toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
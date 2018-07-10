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

package com.liferay.demo.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.demo.model.businesscard;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing businesscard in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see businesscard
 * @generated
 */
@ProviderType
public class businesscardCacheModel implements CacheModel<businesscard>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businesscardCacheModel)) {
			return false;
		}

		businesscardCacheModel businesscardCacheModel = (businesscardCacheModel)obj;

        return businesscardId == businesscardCacheModel.businesscardId;

    }

	@Override
	public int hashCode() {
		return HashUtil.hash(0, businesscardId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", businesscardId=");
		sb.append(businesscardId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", position=");
		sb.append(position);
		sb.append(", email=");
		sb.append(email);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", company=");
		sb.append(company);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public businesscard toEntityModel() {
		businesscardImpl businesscardImpl = new businesscardImpl();

		if (uuid == null) {
			businesscardImpl.setUuid(StringPool.BLANK);
		}
		else {
			businesscardImpl.setUuid(uuid);
		}

		businesscardImpl.setBusinesscardId(businesscardId);

		if (name == null) {
			businesscardImpl.setName(StringPool.BLANK);
		}
		else {
			businesscardImpl.setName(name);
		}

		if (position == null) {
			businesscardImpl.setPosition(StringPool.BLANK);
		}
		else {
			businesscardImpl.setPosition(position);
		}

		if (email == null) {
			businesscardImpl.setEmail(StringPool.BLANK);
		}
		else {
			businesscardImpl.setEmail(email);
		}

		if (phone == null) {
			businesscardImpl.setPhone(StringPool.BLANK);
		}
		else {
			businesscardImpl.setPhone(phone);
		}

		if (company == null) {
			businesscardImpl.setCompany(StringPool.BLANK);
		}
		else {
			businesscardImpl.setCompany(company);
		}

		businesscardImpl.resetOriginalValues();

		return businesscardImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		businesscardId = objectInput.readLong();
		name = objectInput.readUTF();
		position = objectInput.readUTF();
		email = objectInput.readUTF();
		phone = objectInput.readUTF();
		company = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(businesscardId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (position == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (company == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(company);
		}
	}

	public String uuid;
	public long businesscardId;
	public String name;
	public String position;
	public String email;
	public String phone;
	public String company;
}
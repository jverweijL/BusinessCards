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

package com.liferay.demo.service.impl;

import com.liferay.demo.model.businesscard;
import com.liferay.demo.model.impl.businesscardImpl;
import com.liferay.demo.service.base.businesscardLocalServiceBaseImpl;

/**
 * The implementation of the businesscard local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.demo.service.businesscardLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see businesscardLocalServiceBaseImpl
 * @see com.liferay.demo.service.businesscardLocalServiceUtil
 */
public class businesscardLocalServiceImpl
	extends businesscardLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.demo.service.businesscardLocalServiceUtil} to access the businesscard local service.
	 */
	
	public void saveBusinesscard(String name, String position, String phone, String email, String company) {
		businesscard b = new businesscardImpl();
		b.setName(name);
		b.setPosition(position);
		b.setPhone(phone);
		b.setEmail(email);
		b.setCompany(company);
		updatebusinesscard(b);
	}
}


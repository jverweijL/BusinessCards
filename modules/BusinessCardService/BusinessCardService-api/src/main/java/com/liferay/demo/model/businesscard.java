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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the businesscard service. Represents a row in the &quot;DEMO_businesscard&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see businesscardModel
 * @see com.liferay.demo.model.impl.businesscardImpl
 * @see com.liferay.demo.model.impl.businesscardModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.demo.model.impl.businesscardImpl")
@ProviderType
public interface businesscard extends businesscardModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.demo.model.impl.businesscardImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
    Accessor<businesscard, Long> BUSINESSCARD_ID_ACCESSOR = new Accessor<businesscard, Long>() {
			@Override
			public Long get(businesscard businesscard) {
				return businesscard.getBusinesscardId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<businesscard> getTypeClass() {
				return businesscard.class;
			}
		};
}
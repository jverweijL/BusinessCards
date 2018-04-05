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

package com.liferay.demo.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.demo.exception.NoSuchbusinesscardException;
import com.liferay.demo.model.businesscard;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the businesscard service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.demo.service.persistence.impl.businesscardPersistenceImpl
 * @see businesscardUtil
 * @generated
 */
@ProviderType
public interface businesscardPersistence extends BasePersistence<businesscard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link businesscardUtil} to access the businesscard persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the businesscards where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching businesscards
	*/
	public java.util.List<businesscard> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the businesscards where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesscardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of businesscards
	* @param end the upper bound of the range of businesscards (not inclusive)
	* @return the range of matching businesscards
	*/
	public java.util.List<businesscard> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the businesscards where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesscardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of businesscards
	* @param end the upper bound of the range of businesscards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesscards
	*/
	public java.util.List<businesscard> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator);

	/**
	* Returns an ordered range of all the businesscards where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesscardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of businesscards
	* @param end the upper bound of the range of businesscards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businesscards
	*/
	public java.util.List<businesscard> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first businesscard in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesscard
	* @throws NoSuchbusinesscardException if a matching businesscard could not be found
	*/
	public businesscard findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator)
		throws NoSuchbusinesscardException;

	/**
	* Returns the first businesscard in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesscard, or <code>null</code> if a matching businesscard could not be found
	*/
	public businesscard fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator);

	/**
	* Returns the last businesscard in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesscard
	* @throws NoSuchbusinesscardException if a matching businesscard could not be found
	*/
	public businesscard findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator)
		throws NoSuchbusinesscardException;

	/**
	* Returns the last businesscard in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesscard, or <code>null</code> if a matching businesscard could not be found
	*/
	public businesscard fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator);

	/**
	* Returns the businesscards before and after the current businesscard in the ordered set where uuid = &#63;.
	*
	* @param businesscardId the primary key of the current businesscard
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businesscard
	* @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	*/
	public businesscard[] findByUuid_PrevAndNext(long businesscardId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator)
		throws NoSuchbusinesscardException;

	/**
	* Removes all the businesscards where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of businesscards where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching businesscards
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Caches the businesscard in the entity cache if it is enabled.
	*
	* @param businesscard the businesscard
	*/
	public void cacheResult(businesscard businesscard);

	/**
	* Caches the businesscards in the entity cache if it is enabled.
	*
	* @param businesscards the businesscards
	*/
	public void cacheResult(java.util.List<businesscard> businesscards);

	/**
	* Creates a new businesscard with the primary key. Does not add the businesscard to the database.
	*
	* @param businesscardId the primary key for the new businesscard
	* @return the new businesscard
	*/
	public businesscard create(long businesscardId);

	/**
	* Removes the businesscard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businesscardId the primary key of the businesscard
	* @return the businesscard that was removed
	* @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	*/
	public businesscard remove(long businesscardId)
		throws NoSuchbusinesscardException;

	public businesscard updateImpl(businesscard businesscard);

	/**
	* Returns the businesscard with the primary key or throws a {@link NoSuchbusinesscardException} if it could not be found.
	*
	* @param businesscardId the primary key of the businesscard
	* @return the businesscard
	* @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	*/
	public businesscard findByPrimaryKey(long businesscardId)
		throws NoSuchbusinesscardException;

	/**
	* Returns the businesscard with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param businesscardId the primary key of the businesscard
	* @return the businesscard, or <code>null</code> if a businesscard with the primary key could not be found
	*/
	public businesscard fetchByPrimaryKey(long businesscardId);

	@Override
	public java.util.Map<java.io.Serializable, businesscard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the businesscards.
	*
	* @return the businesscards
	*/
	public java.util.List<businesscard> findAll();

	/**
	* Returns a range of all the businesscards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesscardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesscards
	* @param end the upper bound of the range of businesscards (not inclusive)
	* @return the range of businesscards
	*/
	public java.util.List<businesscard> findAll(int start, int end);

	/**
	* Returns an ordered range of all the businesscards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesscardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesscards
	* @param end the upper bound of the range of businesscards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesscards
	*/
	public java.util.List<businesscard> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator);

	/**
	* Returns an ordered range of all the businesscards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesscardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesscards
	* @param end the upper bound of the range of businesscards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businesscards
	*/
	public java.util.List<businesscard> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesscard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the businesscards from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of businesscards.
	*
	* @return the number of businesscards
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
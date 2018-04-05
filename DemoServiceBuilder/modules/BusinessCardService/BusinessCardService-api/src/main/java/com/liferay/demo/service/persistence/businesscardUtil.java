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

import com.liferay.demo.model.businesscard;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the businesscard service. This utility wraps {@link com.liferay.demo.service.persistence.impl.businesscardPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see businesscardPersistence
 * @see com.liferay.demo.service.persistence.impl.businesscardPersistenceImpl
 * @generated
 */
@ProviderType
public class businesscardUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(businesscard businesscard) {
		getPersistence().clearCache(businesscard);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<businesscard> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<businesscard> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<businesscard> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<businesscard> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static businesscard update(businesscard businesscard) {
		return getPersistence().update(businesscard);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static businesscard update(businesscard businesscard,
		ServiceContext serviceContext) {
		return getPersistence().update(businesscard, serviceContext);
	}

	/**
	* Returns all the businesscards where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching businesscards
	*/
	public static List<businesscard> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<businesscard> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<businesscard> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<businesscard> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<businesscard> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<businesscard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first businesscard in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesscard
	* @throws NoSuchbusinesscardException if a matching businesscard could not be found
	*/
	public static businesscard findByUuid_First(java.lang.String uuid,
		OrderByComparator<businesscard> orderByComparator)
		throws com.liferay.demo.exception.NoSuchbusinesscardException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first businesscard in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesscard, or <code>null</code> if a matching businesscard could not be found
	*/
	public static businesscard fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<businesscard> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last businesscard in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesscard
	* @throws NoSuchbusinesscardException if a matching businesscard could not be found
	*/
	public static businesscard findByUuid_Last(java.lang.String uuid,
		OrderByComparator<businesscard> orderByComparator)
		throws com.liferay.demo.exception.NoSuchbusinesscardException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last businesscard in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesscard, or <code>null</code> if a matching businesscard could not be found
	*/
	public static businesscard fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<businesscard> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the businesscards before and after the current businesscard in the ordered set where uuid = &#63;.
	*
	* @param businesscardId the primary key of the current businesscard
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businesscard
	* @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	*/
	public static businesscard[] findByUuid_PrevAndNext(long businesscardId,
		java.lang.String uuid, OrderByComparator<businesscard> orderByComparator)
		throws com.liferay.demo.exception.NoSuchbusinesscardException {
		return getPersistence()
				   .findByUuid_PrevAndNext(businesscardId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the businesscards where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of businesscards where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching businesscards
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Caches the businesscard in the entity cache if it is enabled.
	*
	* @param businesscard the businesscard
	*/
	public static void cacheResult(businesscard businesscard) {
		getPersistence().cacheResult(businesscard);
	}

	/**
	* Caches the businesscards in the entity cache if it is enabled.
	*
	* @param businesscards the businesscards
	*/
	public static void cacheResult(List<businesscard> businesscards) {
		getPersistence().cacheResult(businesscards);
	}

	/**
	* Creates a new businesscard with the primary key. Does not add the businesscard to the database.
	*
	* @param businesscardId the primary key for the new businesscard
	* @return the new businesscard
	*/
	public static businesscard create(long businesscardId) {
		return getPersistence().create(businesscardId);
	}

	/**
	* Removes the businesscard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param businesscardId the primary key of the businesscard
	* @return the businesscard that was removed
	* @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	*/
	public static businesscard remove(long businesscardId)
		throws com.liferay.demo.exception.NoSuchbusinesscardException {
		return getPersistence().remove(businesscardId);
	}

	public static businesscard updateImpl(businesscard businesscard) {
		return getPersistence().updateImpl(businesscard);
	}

	/**
	* Returns the businesscard with the primary key or throws a {@link NoSuchbusinesscardException} if it could not be found.
	*
	* @param businesscardId the primary key of the businesscard
	* @return the businesscard
	* @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	*/
	public static businesscard findByPrimaryKey(long businesscardId)
		throws com.liferay.demo.exception.NoSuchbusinesscardException {
		return getPersistence().findByPrimaryKey(businesscardId);
	}

	/**
	* Returns the businesscard with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param businesscardId the primary key of the businesscard
	* @return the businesscard, or <code>null</code> if a businesscard with the primary key could not be found
	*/
	public static businesscard fetchByPrimaryKey(long businesscardId) {
		return getPersistence().fetchByPrimaryKey(businesscardId);
	}

	public static java.util.Map<java.io.Serializable, businesscard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the businesscards.
	*
	* @return the businesscards
	*/
	public static List<businesscard> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<businesscard> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<businesscard> findAll(int start, int end,
		OrderByComparator<businesscard> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<businesscard> findAll(int start, int end,
		OrderByComparator<businesscard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the businesscards from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of businesscards.
	*
	* @return the number of businesscards
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static businesscardPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<businesscardPersistence, businesscardPersistence> _serviceTracker =
		ServiceTrackerFactory.open(businesscardPersistence.class);
}
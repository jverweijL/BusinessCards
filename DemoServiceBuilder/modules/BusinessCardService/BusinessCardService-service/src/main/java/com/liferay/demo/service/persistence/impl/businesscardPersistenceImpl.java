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

package com.liferay.demo.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.demo.exception.NoSuchbusinesscardException;
import com.liferay.demo.model.businesscard;
import com.liferay.demo.model.impl.businesscardImpl;
import com.liferay.demo.model.impl.businesscardModelImpl;
import com.liferay.demo.service.persistence.businesscardPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the businesscard service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see businesscardPersistence
 * @see com.liferay.demo.service.persistence.businesscardUtil
 * @generated
 */
@ProviderType
public class businesscardPersistenceImpl extends BasePersistenceImpl<businesscard>
	implements businesscardPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link businesscardUtil} to access the businesscard persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = businesscardImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardModelImpl.FINDER_CACHE_ENABLED, businesscardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardModelImpl.FINDER_CACHE_ENABLED, businesscardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardModelImpl.FINDER_CACHE_ENABLED, businesscardImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardModelImpl.FINDER_CACHE_ENABLED, businesscardImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			businesscardModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the businesscards where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching businesscards
	 */
	@Override
	public List<businesscard> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<businesscard> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<businesscard> findByUuid(String uuid, int start, int end,
		OrderByComparator<businesscard> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<businesscard> findByUuid(String uuid, int start, int end,
		OrderByComparator<businesscard> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<businesscard> list = null;

		if (retrieveFromCache) {
			list = (List<businesscard>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (businesscard businesscard : list) {
					if (!Objects.equals(uuid, businesscard.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BUSINESSCARD_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(businesscardModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<businesscard>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businesscard>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first businesscard in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businesscard
	 * @throws NoSuchbusinesscardException if a matching businesscard could not be found
	 */
	@Override
	public businesscard findByUuid_First(String uuid,
		OrderByComparator<businesscard> orderByComparator)
		throws NoSuchbusinesscardException {
		businesscard businesscard = fetchByUuid_First(uuid, orderByComparator);

		if (businesscard != null) {
			return businesscard;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinesscardException(msg.toString());
	}

	/**
	 * Returns the first businesscard in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businesscard, or <code>null</code> if a matching businesscard could not be found
	 */
	@Override
	public businesscard fetchByUuid_First(String uuid,
		OrderByComparator<businesscard> orderByComparator) {
		List<businesscard> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last businesscard in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businesscard
	 * @throws NoSuchbusinesscardException if a matching businesscard could not be found
	 */
	@Override
	public businesscard findByUuid_Last(String uuid,
		OrderByComparator<businesscard> orderByComparator)
		throws NoSuchbusinesscardException {
		businesscard businesscard = fetchByUuid_Last(uuid, orderByComparator);

		if (businesscard != null) {
			return businesscard;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinesscardException(msg.toString());
	}

	/**
	 * Returns the last businesscard in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businesscard, or <code>null</code> if a matching businesscard could not be found
	 */
	@Override
	public businesscard fetchByUuid_Last(String uuid,
		OrderByComparator<businesscard> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<businesscard> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public businesscard[] findByUuid_PrevAndNext(long businesscardId,
		String uuid, OrderByComparator<businesscard> orderByComparator)
		throws NoSuchbusinesscardException {
		businesscard businesscard = findByPrimaryKey(businesscardId);

		Session session = null;

		try {
			session = openSession();

			businesscard[] array = new businesscardImpl[3];

			array[0] = getByUuid_PrevAndNext(session, businesscard, uuid,
					orderByComparator, true);

			array[1] = businesscard;

			array[2] = getByUuid_PrevAndNext(session, businesscard, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected businesscard getByUuid_PrevAndNext(Session session,
		businesscard businesscard, String uuid,
		OrderByComparator<businesscard> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESSCARD_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(businesscardModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(businesscard);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<businesscard> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businesscards where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (businesscard businesscard : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(businesscard);
		}
	}

	/**
	 * Returns the number of businesscards where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching businesscards
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESSCARD_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "businesscard.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "businesscard.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(businesscard.uuid IS NULL OR businesscard.uuid = '')";

	public businesscardPersistenceImpl() {
		setModelClass(businesscard.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the businesscard in the entity cache if it is enabled.
	 *
	 * @param businesscard the businesscard
	 */
	@Override
	public void cacheResult(businesscard businesscard) {
		entityCache.putResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardImpl.class, businesscard.getPrimaryKey(), businesscard);

		businesscard.resetOriginalValues();
	}

	/**
	 * Caches the businesscards in the entity cache if it is enabled.
	 *
	 * @param businesscards the businesscards
	 */
	@Override
	public void cacheResult(List<businesscard> businesscards) {
		for (businesscard businesscard : businesscards) {
			if (entityCache.getResult(
						businesscardModelImpl.ENTITY_CACHE_ENABLED,
						businesscardImpl.class, businesscard.getPrimaryKey()) == null) {
				cacheResult(businesscard);
			}
			else {
				businesscard.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all businesscards.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(businesscardImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the businesscard.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(businesscard businesscard) {
		entityCache.removeResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardImpl.class, businesscard.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<businesscard> businesscards) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (businesscard businesscard : businesscards) {
			entityCache.removeResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
				businesscardImpl.class, businesscard.getPrimaryKey());
		}
	}

	/**
	 * Creates a new businesscard with the primary key. Does not add the businesscard to the database.
	 *
	 * @param businesscardId the primary key for the new businesscard
	 * @return the new businesscard
	 */
	@Override
	public businesscard create(long businesscardId) {
		businesscard businesscard = new businesscardImpl();

		businesscard.setNew(true);
		businesscard.setPrimaryKey(businesscardId);

		String uuid = PortalUUIDUtil.generate();

		businesscard.setUuid(uuid);

		return businesscard;
	}

	/**
	 * Removes the businesscard with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param businesscardId the primary key of the businesscard
	 * @return the businesscard that was removed
	 * @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	 */
	@Override
	public businesscard remove(long businesscardId)
		throws NoSuchbusinesscardException {
		return remove((Serializable)businesscardId);
	}

	/**
	 * Removes the businesscard with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the businesscard
	 * @return the businesscard that was removed
	 * @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	 */
	@Override
	public businesscard remove(Serializable primaryKey)
		throws NoSuchbusinesscardException {
		Session session = null;

		try {
			session = openSession();

			businesscard businesscard = (businesscard)session.get(businesscardImpl.class,
					primaryKey);

			if (businesscard == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbusinesscardException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(businesscard);
		}
		catch (NoSuchbusinesscardException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected businesscard removeImpl(businesscard businesscard) {
		businesscard = toUnwrappedModel(businesscard);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(businesscard)) {
				businesscard = (businesscard)session.get(businesscardImpl.class,
						businesscard.getPrimaryKeyObj());
			}

			if (businesscard != null) {
				session.delete(businesscard);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (businesscard != null) {
			clearCache(businesscard);
		}

		return businesscard;
	}

	@Override
	public businesscard updateImpl(businesscard businesscard) {
		businesscard = toUnwrappedModel(businesscard);

		boolean isNew = businesscard.isNew();

		businesscardModelImpl businesscardModelImpl = (businesscardModelImpl)businesscard;

		if (Validator.isNull(businesscard.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			businesscard.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (businesscard.isNew()) {
				session.save(businesscard);

				businesscard.setNew(false);
			}
			else {
				businesscard = (businesscard)session.merge(businesscard);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!businesscardModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { businesscardModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((businesscardModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businesscardModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { businesscardModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}
		}

		entityCache.putResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
			businesscardImpl.class, businesscard.getPrimaryKey(), businesscard,
			false);

		businesscard.resetOriginalValues();

		return businesscard;
	}

	protected businesscard toUnwrappedModel(businesscard businesscard) {
		if (businesscard instanceof businesscardImpl) {
			return businesscard;
		}

		businesscardImpl businesscardImpl = new businesscardImpl();

		businesscardImpl.setNew(businesscard.isNew());
		businesscardImpl.setPrimaryKey(businesscard.getPrimaryKey());

		businesscardImpl.setUuid(businesscard.getUuid());
		businesscardImpl.setBusinesscardId(businesscard.getBusinesscardId());
		businesscardImpl.setName(businesscard.getName());
		businesscardImpl.setPosition(businesscard.getPosition());
		businesscardImpl.setEmail(businesscard.getEmail());
		businesscardImpl.setPhone(businesscard.getPhone());
		businesscardImpl.setCompany(businesscard.getCompany());

		return businesscardImpl;
	}

	/**
	 * Returns the businesscard with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the businesscard
	 * @return the businesscard
	 * @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	 */
	@Override
	public businesscard findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbusinesscardException {
		businesscard businesscard = fetchByPrimaryKey(primaryKey);

		if (businesscard == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbusinesscardException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return businesscard;
	}

	/**
	 * Returns the businesscard with the primary key or throws a {@link NoSuchbusinesscardException} if it could not be found.
	 *
	 * @param businesscardId the primary key of the businesscard
	 * @return the businesscard
	 * @throws NoSuchbusinesscardException if a businesscard with the primary key could not be found
	 */
	@Override
	public businesscard findByPrimaryKey(long businesscardId)
		throws NoSuchbusinesscardException {
		return findByPrimaryKey((Serializable)businesscardId);
	}

	/**
	 * Returns the businesscard with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the businesscard
	 * @return the businesscard, or <code>null</code> if a businesscard with the primary key could not be found
	 */
	@Override
	public businesscard fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
				businesscardImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		businesscard businesscard = (businesscard)serializable;

		if (businesscard == null) {
			Session session = null;

			try {
				session = openSession();

				businesscard = (businesscard)session.get(businesscardImpl.class,
						primaryKey);

				if (businesscard != null) {
					cacheResult(businesscard);
				}
				else {
					entityCache.putResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
						businesscardImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
					businesscardImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return businesscard;
	}

	/**
	 * Returns the businesscard with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param businesscardId the primary key of the businesscard
	 * @return the businesscard, or <code>null</code> if a businesscard with the primary key could not be found
	 */
	@Override
	public businesscard fetchByPrimaryKey(long businesscardId) {
		return fetchByPrimaryKey((Serializable)businesscardId);
	}

	@Override
	public Map<Serializable, businesscard> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, businesscard> map = new HashMap<Serializable, businesscard>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			businesscard businesscard = fetchByPrimaryKey(primaryKey);

			if (businesscard != null) {
				map.put(primaryKey, businesscard);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
					businesscardImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (businesscard)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUSINESSCARD_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (businesscard businesscard : (List<businesscard>)q.list()) {
				map.put(businesscard.getPrimaryKeyObj(), businesscard);

				cacheResult(businesscard);

				uncachedPrimaryKeys.remove(businesscard.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(businesscardModelImpl.ENTITY_CACHE_ENABLED,
					businesscardImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the businesscards.
	 *
	 * @return the businesscards
	 */
	@Override
	public List<businesscard> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<businesscard> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<businesscard> findAll(int start, int end,
		OrderByComparator<businesscard> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<businesscard> findAll(int start, int end,
		OrderByComparator<businesscard> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<businesscard> list = null;

		if (retrieveFromCache) {
			list = (List<businesscard>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUSINESSCARD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESSCARD;

				if (pagination) {
					sql = sql.concat(businesscardModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<businesscard>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businesscard>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the businesscards from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (businesscard businesscard : findAll()) {
			remove(businesscard);
		}
	}

	/**
	 * Returns the number of businesscards.
	 *
	 * @return the number of businesscards
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUSINESSCARD);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return businesscardModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the businesscard persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(businesscardImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BUSINESSCARD = "SELECT businesscard FROM businesscard businesscard";
	private static final String _SQL_SELECT_BUSINESSCARD_WHERE_PKS_IN = "SELECT businesscard FROM businesscard businesscard WHERE businesscardId IN (";
	private static final String _SQL_SELECT_BUSINESSCARD_WHERE = "SELECT businesscard FROM businesscard businesscard WHERE ";
	private static final String _SQL_COUNT_BUSINESSCARD = "SELECT COUNT(businesscard) FROM businesscard businesscard";
	private static final String _SQL_COUNT_BUSINESSCARD_WHERE = "SELECT COUNT(businesscard) FROM businesscard businesscard WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "businesscard.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No businesscard exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No businesscard exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(businesscardPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}
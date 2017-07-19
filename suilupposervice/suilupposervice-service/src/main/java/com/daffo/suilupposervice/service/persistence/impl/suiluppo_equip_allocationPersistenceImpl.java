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

package com.daffo.suilupposervice.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_equip_allocationException;
import com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationImpl;
import com.daffo.suilupposervice.model.impl.suiluppo_equip_allocationModelImpl;
import com.daffo.suilupposervice.model.suiluppo_equip_allocation;
import com.daffo.suilupposervice.service.persistence.suiluppo_equip_allocationPersistence;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the suiluppo_equip_allocation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_equip_allocationPersistence
 * @see com.daffo.suilupposervice.service.persistence.suiluppo_equip_allocationUtil
 * @generated
 */
@ProviderType
public class suiluppo_equip_allocationPersistenceImpl
	extends BasePersistenceImpl<suiluppo_equip_allocation>
	implements suiluppo_equip_allocationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link suiluppo_equip_allocationUtil} to access the suiluppo_equip_allocation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = suiluppo_equip_allocationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSE_ID =
		new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycourse_id",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID =
		new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycourse_id",
			new String[] { Long.class.getName() },
			suiluppo_equip_allocationModelImpl.COURSE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COURSE_ID = new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycourse_id", new String[] { Long.class.getName() });

	/**
	 * Returns all the suiluppo_equip_allocations where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @return the matching suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findBycourse_id(long course_id) {
		return findBycourse_id(course_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the suiluppo_equip_allocations where course_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param course_id the course_id
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @return the range of matching suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findBycourse_id(long course_id,
		int start, int end) {
		return findBycourse_id(course_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_equip_allocations where course_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param course_id the course_id
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findBycourse_id(long course_id,
		int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return findBycourse_id(course_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_equip_allocations where course_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param course_id the course_id
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findBycourse_id(long course_id,
		int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID;
			finderArgs = new Object[] { course_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSE_ID;
			finderArgs = new Object[] { course_id, start, end, orderByComparator };
		}

		List<suiluppo_equip_allocation> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_equip_allocation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (suiluppo_equip_allocation suiluppo_equip_allocation : list) {
					if ((course_id != suiluppo_equip_allocation.getCourse_id())) {
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

			query.append(_SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION_WHERE);

			query.append(_FINDER_COLUMN_COURSE_ID_COURSE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(suiluppo_equip_allocationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(course_id);

				if (!pagination) {
					list = (List<suiluppo_equip_allocation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_equip_allocation>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching suiluppo_equip_allocation
	 * @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	 */
	@Override
	public suiluppo_equip_allocation findBycourse_id_First(long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException {
		suiluppo_equip_allocation suiluppo_equip_allocation = fetchBycourse_id_First(course_id,
				orderByComparator);

		if (suiluppo_equip_allocation != null) {
			return suiluppo_equip_allocation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("course_id=");
		msg.append(course_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsuiluppo_equip_allocationException(msg.toString());
	}

	/**
	 * Returns the first suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	 */
	@Override
	public suiluppo_equip_allocation fetchBycourse_id_First(long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		List<suiluppo_equip_allocation> list = findBycourse_id(course_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching suiluppo_equip_allocation
	 * @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	 */
	@Override
	public suiluppo_equip_allocation findBycourse_id_Last(long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException {
		suiluppo_equip_allocation suiluppo_equip_allocation = fetchBycourse_id_Last(course_id,
				orderByComparator);

		if (suiluppo_equip_allocation != null) {
			return suiluppo_equip_allocation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("course_id=");
		msg.append(course_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsuiluppo_equip_allocationException(msg.toString());
	}

	/**
	 * Returns the last suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	 */
	@Override
	public suiluppo_equip_allocation fetchBycourse_id_Last(long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		int count = countBycourse_id(course_id);

		if (count == 0) {
			return null;
		}

		List<suiluppo_equip_allocation> list = findBycourse_id(course_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the suiluppo_equip_allocations before and after the current suiluppo_equip_allocation in the ordered set where course_id = &#63;.
	 *
	 * @param equip_allocat_id the primary key of the current suiluppo_equip_allocation
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next suiluppo_equip_allocation
	 * @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_equip_allocation[] findBycourse_id_PrevAndNext(
		long equip_allocat_id, long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException {
		suiluppo_equip_allocation suiluppo_equip_allocation = findByPrimaryKey(equip_allocat_id);

		Session session = null;

		try {
			session = openSession();

			suiluppo_equip_allocation[] array = new suiluppo_equip_allocationImpl[3];

			array[0] = getBycourse_id_PrevAndNext(session,
					suiluppo_equip_allocation, course_id, orderByComparator,
					true);

			array[1] = suiluppo_equip_allocation;

			array[2] = getBycourse_id_PrevAndNext(session,
					suiluppo_equip_allocation, course_id, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected suiluppo_equip_allocation getBycourse_id_PrevAndNext(
		Session session, suiluppo_equip_allocation suiluppo_equip_allocation,
		long course_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION_WHERE);

		query.append(_FINDER_COLUMN_COURSE_ID_COURSE_ID_2);

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
			query.append(suiluppo_equip_allocationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(course_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(suiluppo_equip_allocation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<suiluppo_equip_allocation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the suiluppo_equip_allocations where course_id = &#63; from the database.
	 *
	 * @param course_id the course_id
	 */
	@Override
	public void removeBycourse_id(long course_id) {
		for (suiluppo_equip_allocation suiluppo_equip_allocation : findBycourse_id(
				course_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(suiluppo_equip_allocation);
		}
	}

	/**
	 * Returns the number of suiluppo_equip_allocations where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @return the number of matching suiluppo_equip_allocations
	 */
	@Override
	public int countBycourse_id(long course_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COURSE_ID;

		Object[] finderArgs = new Object[] { course_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUILUPPO_EQUIP_ALLOCATION_WHERE);

			query.append(_FINDER_COLUMN_COURSE_ID_COURSE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(course_id);

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

	private static final String _FINDER_COLUMN_COURSE_ID_COURSE_ID_2 = "suiluppo_equip_allocation.course_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EQUIP_ID = new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByequip_id",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EQUIP_ID =
		new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByequip_id",
			new String[] { Long.class.getName() },
			suiluppo_equip_allocationModelImpl.EQUIP_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EQUIP_ID = new FinderPath(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByequip_id", new String[] { Long.class.getName() });

	/**
	 * Returns all the suiluppo_equip_allocations where equip_id = &#63;.
	 *
	 * @param equip_id the equip_id
	 * @return the matching suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findByequip_id(long equip_id) {
		return findByequip_id(equip_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the suiluppo_equip_allocations where equip_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param equip_id the equip_id
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @return the range of matching suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findByequip_id(long equip_id,
		int start, int end) {
		return findByequip_id(equip_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_equip_allocations where equip_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param equip_id the equip_id
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findByequip_id(long equip_id,
		int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return findByequip_id(equip_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_equip_allocations where equip_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param equip_id the equip_id
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findByequip_id(long equip_id,
		int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EQUIP_ID;
			finderArgs = new Object[] { equip_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EQUIP_ID;
			finderArgs = new Object[] { equip_id, start, end, orderByComparator };
		}

		List<suiluppo_equip_allocation> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_equip_allocation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (suiluppo_equip_allocation suiluppo_equip_allocation : list) {
					if ((equip_id != suiluppo_equip_allocation.getEquip_id())) {
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

			query.append(_SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION_WHERE);

			query.append(_FINDER_COLUMN_EQUIP_ID_EQUIP_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(suiluppo_equip_allocationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(equip_id);

				if (!pagination) {
					list = (List<suiluppo_equip_allocation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_equip_allocation>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	 *
	 * @param equip_id the equip_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching suiluppo_equip_allocation
	 * @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	 */
	@Override
	public suiluppo_equip_allocation findByequip_id_First(long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException {
		suiluppo_equip_allocation suiluppo_equip_allocation = fetchByequip_id_First(equip_id,
				orderByComparator);

		if (suiluppo_equip_allocation != null) {
			return suiluppo_equip_allocation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("equip_id=");
		msg.append(equip_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsuiluppo_equip_allocationException(msg.toString());
	}

	/**
	 * Returns the first suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	 *
	 * @param equip_id the equip_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	 */
	@Override
	public suiluppo_equip_allocation fetchByequip_id_First(long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		List<suiluppo_equip_allocation> list = findByequip_id(equip_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	 *
	 * @param equip_id the equip_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching suiluppo_equip_allocation
	 * @throws NoSuchsuiluppo_equip_allocationException if a matching suiluppo_equip_allocation could not be found
	 */
	@Override
	public suiluppo_equip_allocation findByequip_id_Last(long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException {
		suiluppo_equip_allocation suiluppo_equip_allocation = fetchByequip_id_Last(equip_id,
				orderByComparator);

		if (suiluppo_equip_allocation != null) {
			return suiluppo_equip_allocation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("equip_id=");
		msg.append(equip_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsuiluppo_equip_allocationException(msg.toString());
	}

	/**
	 * Returns the last suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	 *
	 * @param equip_id the equip_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching suiluppo_equip_allocation, or <code>null</code> if a matching suiluppo_equip_allocation could not be found
	 */
	@Override
	public suiluppo_equip_allocation fetchByequip_id_Last(long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		int count = countByequip_id(equip_id);

		if (count == 0) {
			return null;
		}

		List<suiluppo_equip_allocation> list = findByequip_id(equip_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the suiluppo_equip_allocations before and after the current suiluppo_equip_allocation in the ordered set where equip_id = &#63;.
	 *
	 * @param equip_allocat_id the primary key of the current suiluppo_equip_allocation
	 * @param equip_id the equip_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next suiluppo_equip_allocation
	 * @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_equip_allocation[] findByequip_id_PrevAndNext(
		long equip_allocat_id, long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator)
		throws NoSuchsuiluppo_equip_allocationException {
		suiluppo_equip_allocation suiluppo_equip_allocation = findByPrimaryKey(equip_allocat_id);

		Session session = null;

		try {
			session = openSession();

			suiluppo_equip_allocation[] array = new suiluppo_equip_allocationImpl[3];

			array[0] = getByequip_id_PrevAndNext(session,
					suiluppo_equip_allocation, equip_id, orderByComparator, true);

			array[1] = suiluppo_equip_allocation;

			array[2] = getByequip_id_PrevAndNext(session,
					suiluppo_equip_allocation, equip_id, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected suiluppo_equip_allocation getByequip_id_PrevAndNext(
		Session session, suiluppo_equip_allocation suiluppo_equip_allocation,
		long equip_id,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION_WHERE);

		query.append(_FINDER_COLUMN_EQUIP_ID_EQUIP_ID_2);

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
			query.append(suiluppo_equip_allocationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(equip_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(suiluppo_equip_allocation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<suiluppo_equip_allocation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the suiluppo_equip_allocations where equip_id = &#63; from the database.
	 *
	 * @param equip_id the equip_id
	 */
	@Override
	public void removeByequip_id(long equip_id) {
		for (suiluppo_equip_allocation suiluppo_equip_allocation : findByequip_id(
				equip_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(suiluppo_equip_allocation);
		}
	}

	/**
	 * Returns the number of suiluppo_equip_allocations where equip_id = &#63;.
	 *
	 * @param equip_id the equip_id
	 * @return the number of matching suiluppo_equip_allocations
	 */
	@Override
	public int countByequip_id(long equip_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EQUIP_ID;

		Object[] finderArgs = new Object[] { equip_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUILUPPO_EQUIP_ALLOCATION_WHERE);

			query.append(_FINDER_COLUMN_EQUIP_ID_EQUIP_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(equip_id);

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

	private static final String _FINDER_COLUMN_EQUIP_ID_EQUIP_ID_2 = "suiluppo_equip_allocation.equip_id = ?";

	public suiluppo_equip_allocationPersistenceImpl() {
		setModelClass(suiluppo_equip_allocation.class);
	}

	/**
	 * Caches the suiluppo_equip_allocation in the entity cache if it is enabled.
	 *
	 * @param suiluppo_equip_allocation the suiluppo_equip_allocation
	 */
	@Override
	public void cacheResult(suiluppo_equip_allocation suiluppo_equip_allocation) {
		entityCache.putResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			suiluppo_equip_allocation.getPrimaryKey(), suiluppo_equip_allocation);

		suiluppo_equip_allocation.resetOriginalValues();
	}

	/**
	 * Caches the suiluppo_equip_allocations in the entity cache if it is enabled.
	 *
	 * @param suiluppo_equip_allocations the suiluppo_equip_allocations
	 */
	@Override
	public void cacheResult(
		List<suiluppo_equip_allocation> suiluppo_equip_allocations) {
		for (suiluppo_equip_allocation suiluppo_equip_allocation : suiluppo_equip_allocations) {
			if (entityCache.getResult(
						suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_equip_allocationImpl.class,
						suiluppo_equip_allocation.getPrimaryKey()) == null) {
				cacheResult(suiluppo_equip_allocation);
			}
			else {
				suiluppo_equip_allocation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all suiluppo_equip_allocations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(suiluppo_equip_allocationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the suiluppo_equip_allocation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(suiluppo_equip_allocation suiluppo_equip_allocation) {
		entityCache.removeResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			suiluppo_equip_allocation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<suiluppo_equip_allocation> suiluppo_equip_allocations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (suiluppo_equip_allocation suiluppo_equip_allocation : suiluppo_equip_allocations) {
			entityCache.removeResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_equip_allocationImpl.class,
				suiluppo_equip_allocation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new suiluppo_equip_allocation with the primary key. Does not add the suiluppo_equip_allocation to the database.
	 *
	 * @param equip_allocat_id the primary key for the new suiluppo_equip_allocation
	 * @return the new suiluppo_equip_allocation
	 */
	@Override
	public suiluppo_equip_allocation create(long equip_allocat_id) {
		suiluppo_equip_allocation suiluppo_equip_allocation = new suiluppo_equip_allocationImpl();

		suiluppo_equip_allocation.setNew(true);
		suiluppo_equip_allocation.setPrimaryKey(equip_allocat_id);

		return suiluppo_equip_allocation;
	}

	/**
	 * Removes the suiluppo_equip_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	 * @return the suiluppo_equip_allocation that was removed
	 * @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_equip_allocation remove(long equip_allocat_id)
		throws NoSuchsuiluppo_equip_allocationException {
		return remove((Serializable)equip_allocat_id);
	}

	/**
	 * Removes the suiluppo_equip_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the suiluppo_equip_allocation
	 * @return the suiluppo_equip_allocation that was removed
	 * @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_equip_allocation remove(Serializable primaryKey)
		throws NoSuchsuiluppo_equip_allocationException {
		Session session = null;

		try {
			session = openSession();

			suiluppo_equip_allocation suiluppo_equip_allocation = (suiluppo_equip_allocation)session.get(suiluppo_equip_allocationImpl.class,
					primaryKey);

			if (suiluppo_equip_allocation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsuiluppo_equip_allocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(suiluppo_equip_allocation);
		}
		catch (NoSuchsuiluppo_equip_allocationException nsee) {
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
	protected suiluppo_equip_allocation removeImpl(
		suiluppo_equip_allocation suiluppo_equip_allocation) {
		suiluppo_equip_allocation = toUnwrappedModel(suiluppo_equip_allocation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(suiluppo_equip_allocation)) {
				suiluppo_equip_allocation = (suiluppo_equip_allocation)session.get(suiluppo_equip_allocationImpl.class,
						suiluppo_equip_allocation.getPrimaryKeyObj());
			}

			if (suiluppo_equip_allocation != null) {
				session.delete(suiluppo_equip_allocation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (suiluppo_equip_allocation != null) {
			clearCache(suiluppo_equip_allocation);
		}

		return suiluppo_equip_allocation;
	}

	@Override
	public suiluppo_equip_allocation updateImpl(
		suiluppo_equip_allocation suiluppo_equip_allocation) {
		suiluppo_equip_allocation = toUnwrappedModel(suiluppo_equip_allocation);

		boolean isNew = suiluppo_equip_allocation.isNew();

		suiluppo_equip_allocationModelImpl suiluppo_equip_allocationModelImpl = (suiluppo_equip_allocationModelImpl)suiluppo_equip_allocation;

		Session session = null;

		try {
			session = openSession();

			if (suiluppo_equip_allocation.isNew()) {
				session.save(suiluppo_equip_allocation);

				suiluppo_equip_allocation.setNew(false);
			}
			else {
				suiluppo_equip_allocation = (suiluppo_equip_allocation)session.merge(suiluppo_equip_allocation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!suiluppo_equip_allocationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((suiluppo_equip_allocationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						suiluppo_equip_allocationModelImpl.getOriginalCourse_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COURSE_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID,
					args);

				args = new Object[] {
						suiluppo_equip_allocationModelImpl.getCourse_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COURSE_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID,
					args);
			}

			if ((suiluppo_equip_allocationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EQUIP_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						suiluppo_equip_allocationModelImpl.getOriginalEquip_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EQUIP_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EQUIP_ID,
					args);

				args = new Object[] {
						suiluppo_equip_allocationModelImpl.getEquip_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EQUIP_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EQUIP_ID,
					args);
			}
		}

		entityCache.putResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equip_allocationImpl.class,
			suiluppo_equip_allocation.getPrimaryKey(),
			suiluppo_equip_allocation, false);

		suiluppo_equip_allocation.resetOriginalValues();

		return suiluppo_equip_allocation;
	}

	protected suiluppo_equip_allocation toUnwrappedModel(
		suiluppo_equip_allocation suiluppo_equip_allocation) {
		if (suiluppo_equip_allocation instanceof suiluppo_equip_allocationImpl) {
			return suiluppo_equip_allocation;
		}

		suiluppo_equip_allocationImpl suiluppo_equip_allocationImpl = new suiluppo_equip_allocationImpl();

		suiluppo_equip_allocationImpl.setNew(suiluppo_equip_allocation.isNew());
		suiluppo_equip_allocationImpl.setPrimaryKey(suiluppo_equip_allocation.getPrimaryKey());

		suiluppo_equip_allocationImpl.setEquip_allocat_id(suiluppo_equip_allocation.getEquip_allocat_id());
		suiluppo_equip_allocationImpl.setCourse_id(suiluppo_equip_allocation.getCourse_id());
		suiluppo_equip_allocationImpl.setEquip_id(suiluppo_equip_allocation.getEquip_id());
		suiluppo_equip_allocationImpl.setEquip_allocat_quantity(suiluppo_equip_allocation.getEquip_allocat_quantity());

		return suiluppo_equip_allocationImpl;
	}

	/**
	 * Returns the suiluppo_equip_allocation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_equip_allocation
	 * @return the suiluppo_equip_allocation
	 * @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_equip_allocation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsuiluppo_equip_allocationException {
		suiluppo_equip_allocation suiluppo_equip_allocation = fetchByPrimaryKey(primaryKey);

		if (suiluppo_equip_allocation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsuiluppo_equip_allocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return suiluppo_equip_allocation;
	}

	/**
	 * Returns the suiluppo_equip_allocation with the primary key or throws a {@link NoSuchsuiluppo_equip_allocationException} if it could not be found.
	 *
	 * @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	 * @return the suiluppo_equip_allocation
	 * @throws NoSuchsuiluppo_equip_allocationException if a suiluppo_equip_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_equip_allocation findByPrimaryKey(long equip_allocat_id)
		throws NoSuchsuiluppo_equip_allocationException {
		return findByPrimaryKey((Serializable)equip_allocat_id);
	}

	/**
	 * Returns the suiluppo_equip_allocation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_equip_allocation
	 * @return the suiluppo_equip_allocation, or <code>null</code> if a suiluppo_equip_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_equip_allocation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_equip_allocationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		suiluppo_equip_allocation suiluppo_equip_allocation = (suiluppo_equip_allocation)serializable;

		if (suiluppo_equip_allocation == null) {
			Session session = null;

			try {
				session = openSession();

				suiluppo_equip_allocation = (suiluppo_equip_allocation)session.get(suiluppo_equip_allocationImpl.class,
						primaryKey);

				if (suiluppo_equip_allocation != null) {
					cacheResult(suiluppo_equip_allocation);
				}
				else {
					entityCache.putResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_equip_allocationImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_equip_allocationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return suiluppo_equip_allocation;
	}

	/**
	 * Returns the suiluppo_equip_allocation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param equip_allocat_id the primary key of the suiluppo_equip_allocation
	 * @return the suiluppo_equip_allocation, or <code>null</code> if a suiluppo_equip_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_equip_allocation fetchByPrimaryKey(long equip_allocat_id) {
		return fetchByPrimaryKey((Serializable)equip_allocat_id);
	}

	@Override
	public Map<Serializable, suiluppo_equip_allocation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, suiluppo_equip_allocation> map = new HashMap<Serializable, suiluppo_equip_allocation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			suiluppo_equip_allocation suiluppo_equip_allocation = fetchByPrimaryKey(primaryKey);

			if (suiluppo_equip_allocation != null) {
				map.put(primaryKey, suiluppo_equip_allocation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_equip_allocationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (suiluppo_equip_allocation)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (suiluppo_equip_allocation suiluppo_equip_allocation : (List<suiluppo_equip_allocation>)q.list()) {
				map.put(suiluppo_equip_allocation.getPrimaryKeyObj(),
					suiluppo_equip_allocation);

				cacheResult(suiluppo_equip_allocation);

				uncachedPrimaryKeys.remove(suiluppo_equip_allocation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(suiluppo_equip_allocationModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_equip_allocationImpl.class, primaryKey, nullModel);
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
	 * Returns all the suiluppo_equip_allocations.
	 *
	 * @return the suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the suiluppo_equip_allocations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @return the range of suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_equip_allocations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findAll(int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_equip_allocations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equip_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_equip_allocations
	 * @param end the upper bound of the range of suiluppo_equip_allocations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of suiluppo_equip_allocations
	 */
	@Override
	public List<suiluppo_equip_allocation> findAll(int start, int end,
		OrderByComparator<suiluppo_equip_allocation> orderByComparator,
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

		List<suiluppo_equip_allocation> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_equip_allocation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION;

				if (pagination) {
					sql = sql.concat(suiluppo_equip_allocationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<suiluppo_equip_allocation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_equip_allocation>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the suiluppo_equip_allocations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (suiluppo_equip_allocation suiluppo_equip_allocation : findAll()) {
			remove(suiluppo_equip_allocation);
		}
	}

	/**
	 * Returns the number of suiluppo_equip_allocations.
	 *
	 * @return the number of suiluppo_equip_allocations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUILUPPO_EQUIP_ALLOCATION);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return suiluppo_equip_allocationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the suiluppo_equip_allocation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(suiluppo_equip_allocationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION = "SELECT suiluppo_equip_allocation FROM suiluppo_equip_allocation suiluppo_equip_allocation";
	private static final String _SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION_WHERE_PKS_IN =
		"SELECT suiluppo_equip_allocation FROM suiluppo_equip_allocation suiluppo_equip_allocation WHERE equip_allocat_id IN (";
	private static final String _SQL_SELECT_SUILUPPO_EQUIP_ALLOCATION_WHERE = "SELECT suiluppo_equip_allocation FROM suiluppo_equip_allocation suiluppo_equip_allocation WHERE ";
	private static final String _SQL_COUNT_SUILUPPO_EQUIP_ALLOCATION = "SELECT COUNT(suiluppo_equip_allocation) FROM suiluppo_equip_allocation suiluppo_equip_allocation";
	private static final String _SQL_COUNT_SUILUPPO_EQUIP_ALLOCATION_WHERE = "SELECT COUNT(suiluppo_equip_allocation) FROM suiluppo_equip_allocation suiluppo_equip_allocation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "suiluppo_equip_allocation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No suiluppo_equip_allocation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No suiluppo_equip_allocation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(suiluppo_equip_allocationPersistenceImpl.class);
}
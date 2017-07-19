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

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_applicationException;
import com.daffo.suilupposervice.model.impl.suiluppo_applicationImpl;
import com.daffo.suilupposervice.model.impl.suiluppo_applicationModelImpl;
import com.daffo.suilupposervice.model.suiluppo_application;
import com.daffo.suilupposervice.service.persistence.suiluppo_applicationPersistence;

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
 * The persistence implementation for the suiluppo_application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_applicationPersistence
 * @see com.daffo.suilupposervice.service.persistence.suiluppo_applicationUtil
 * @generated
 */
@ProviderType
public class suiluppo_applicationPersistenceImpl extends BasePersistenceImpl<suiluppo_application>
	implements suiluppo_applicationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link suiluppo_applicationUtil} to access the suiluppo_application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = suiluppo_applicationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_applicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_applicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSE_ID =
		new FinderPath(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_applicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycourse_id",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID =
		new FinderPath(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_applicationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycourse_id",
			new String[] { Long.class.getName() },
			suiluppo_applicationModelImpl.COURSE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COURSE_ID = new FinderPath(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycourse_id",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the suiluppo_applications where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @return the matching suiluppo_applications
	 */
	@Override
	public List<suiluppo_application> findBycourse_id(long course_id) {
		return findBycourse_id(course_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the suiluppo_applications where course_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param course_id the course_id
	 * @param start the lower bound of the range of suiluppo_applications
	 * @param end the upper bound of the range of suiluppo_applications (not inclusive)
	 * @return the range of matching suiluppo_applications
	 */
	@Override
	public List<suiluppo_application> findBycourse_id(long course_id,
		int start, int end) {
		return findBycourse_id(course_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_applications where course_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param course_id the course_id
	 * @param start the lower bound of the range of suiluppo_applications
	 * @param end the upper bound of the range of suiluppo_applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching suiluppo_applications
	 */
	@Override
	public List<suiluppo_application> findBycourse_id(long course_id,
		int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator) {
		return findBycourse_id(course_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_applications where course_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param course_id the course_id
	 * @param start the lower bound of the range of suiluppo_applications
	 * @param end the upper bound of the range of suiluppo_applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching suiluppo_applications
	 */
	@Override
	public List<suiluppo_application> findBycourse_id(long course_id,
		int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator,
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

		List<suiluppo_application> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_application>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (suiluppo_application suiluppo_application : list) {
					if ((course_id != suiluppo_application.getCourse_id())) {
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

			query.append(_SQL_SELECT_SUILUPPO_APPLICATION_WHERE);

			query.append(_FINDER_COLUMN_COURSE_ID_COURSE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(suiluppo_applicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(course_id);

				if (!pagination) {
					list = (List<suiluppo_application>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_application>)QueryUtil.list(q,
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
	 * Returns the first suiluppo_application in the ordered set where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching suiluppo_application
	 * @throws NoSuchsuiluppo_applicationException if a matching suiluppo_application could not be found
	 */
	@Override
	public suiluppo_application findBycourse_id_First(long course_id,
		OrderByComparator<suiluppo_application> orderByComparator)
		throws NoSuchsuiluppo_applicationException {
		suiluppo_application suiluppo_application = fetchBycourse_id_First(course_id,
				orderByComparator);

		if (suiluppo_application != null) {
			return suiluppo_application;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("course_id=");
		msg.append(course_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsuiluppo_applicationException(msg.toString());
	}

	/**
	 * Returns the first suiluppo_application in the ordered set where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching suiluppo_application, or <code>null</code> if a matching suiluppo_application could not be found
	 */
	@Override
	public suiluppo_application fetchBycourse_id_First(long course_id,
		OrderByComparator<suiluppo_application> orderByComparator) {
		List<suiluppo_application> list = findBycourse_id(course_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last suiluppo_application in the ordered set where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching suiluppo_application
	 * @throws NoSuchsuiluppo_applicationException if a matching suiluppo_application could not be found
	 */
	@Override
	public suiluppo_application findBycourse_id_Last(long course_id,
		OrderByComparator<suiluppo_application> orderByComparator)
		throws NoSuchsuiluppo_applicationException {
		suiluppo_application suiluppo_application = fetchBycourse_id_Last(course_id,
				orderByComparator);

		if (suiluppo_application != null) {
			return suiluppo_application;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("course_id=");
		msg.append(course_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsuiluppo_applicationException(msg.toString());
	}

	/**
	 * Returns the last suiluppo_application in the ordered set where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching suiluppo_application, or <code>null</code> if a matching suiluppo_application could not be found
	 */
	@Override
	public suiluppo_application fetchBycourse_id_Last(long course_id,
		OrderByComparator<suiluppo_application> orderByComparator) {
		int count = countBycourse_id(course_id);

		if (count == 0) {
			return null;
		}

		List<suiluppo_application> list = findBycourse_id(course_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the suiluppo_applications before and after the current suiluppo_application in the ordered set where course_id = &#63;.
	 *
	 * @param applicat_id the primary key of the current suiluppo_application
	 * @param course_id the course_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next suiluppo_application
	 * @throws NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	 */
	@Override
	public suiluppo_application[] findBycourse_id_PrevAndNext(
		long applicat_id, long course_id,
		OrderByComparator<suiluppo_application> orderByComparator)
		throws NoSuchsuiluppo_applicationException {
		suiluppo_application suiluppo_application = findByPrimaryKey(applicat_id);

		Session session = null;

		try {
			session = openSession();

			suiluppo_application[] array = new suiluppo_applicationImpl[3];

			array[0] = getBycourse_id_PrevAndNext(session,
					suiluppo_application, course_id, orderByComparator, true);

			array[1] = suiluppo_application;

			array[2] = getBycourse_id_PrevAndNext(session,
					suiluppo_application, course_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected suiluppo_application getBycourse_id_PrevAndNext(Session session,
		suiluppo_application suiluppo_application, long course_id,
		OrderByComparator<suiluppo_application> orderByComparator,
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

		query.append(_SQL_SELECT_SUILUPPO_APPLICATION_WHERE);

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
			query.append(suiluppo_applicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(course_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(suiluppo_application);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<suiluppo_application> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the suiluppo_applications where course_id = &#63; from the database.
	 *
	 * @param course_id the course_id
	 */
	@Override
	public void removeBycourse_id(long course_id) {
		for (suiluppo_application suiluppo_application : findBycourse_id(
				course_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(suiluppo_application);
		}
	}

	/**
	 * Returns the number of suiluppo_applications where course_id = &#63;.
	 *
	 * @param course_id the course_id
	 * @return the number of matching suiluppo_applications
	 */
	@Override
	public int countBycourse_id(long course_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COURSE_ID;

		Object[] finderArgs = new Object[] { course_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUILUPPO_APPLICATION_WHERE);

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

	private static final String _FINDER_COLUMN_COURSE_ID_COURSE_ID_2 = "suiluppo_application.course_id = ?";

	public suiluppo_applicationPersistenceImpl() {
		setModelClass(suiluppo_application.class);
	}

	/**
	 * Caches the suiluppo_application in the entity cache if it is enabled.
	 *
	 * @param suiluppo_application the suiluppo_application
	 */
	@Override
	public void cacheResult(suiluppo_application suiluppo_application) {
		entityCache.putResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationImpl.class,
			suiluppo_application.getPrimaryKey(), suiluppo_application);

		suiluppo_application.resetOriginalValues();
	}

	/**
	 * Caches the suiluppo_applications in the entity cache if it is enabled.
	 *
	 * @param suiluppo_applications the suiluppo_applications
	 */
	@Override
	public void cacheResult(List<suiluppo_application> suiluppo_applications) {
		for (suiluppo_application suiluppo_application : suiluppo_applications) {
			if (entityCache.getResult(
						suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_applicationImpl.class,
						suiluppo_application.getPrimaryKey()) == null) {
				cacheResult(suiluppo_application);
			}
			else {
				suiluppo_application.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all suiluppo_applications.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(suiluppo_applicationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the suiluppo_application.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(suiluppo_application suiluppo_application) {
		entityCache.removeResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationImpl.class, suiluppo_application.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<suiluppo_application> suiluppo_applications) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (suiluppo_application suiluppo_application : suiluppo_applications) {
			entityCache.removeResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_applicationImpl.class,
				suiluppo_application.getPrimaryKey());
		}
	}

	/**
	 * Creates a new suiluppo_application with the primary key. Does not add the suiluppo_application to the database.
	 *
	 * @param applicat_id the primary key for the new suiluppo_application
	 * @return the new suiluppo_application
	 */
	@Override
	public suiluppo_application create(long applicat_id) {
		suiluppo_application suiluppo_application = new suiluppo_applicationImpl();

		suiluppo_application.setNew(true);
		suiluppo_application.setPrimaryKey(applicat_id);

		return suiluppo_application;
	}

	/**
	 * Removes the suiluppo_application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applicat_id the primary key of the suiluppo_application
	 * @return the suiluppo_application that was removed
	 * @throws NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	 */
	@Override
	public suiluppo_application remove(long applicat_id)
		throws NoSuchsuiluppo_applicationException {
		return remove((Serializable)applicat_id);
	}

	/**
	 * Removes the suiluppo_application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the suiluppo_application
	 * @return the suiluppo_application that was removed
	 * @throws NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	 */
	@Override
	public suiluppo_application remove(Serializable primaryKey)
		throws NoSuchsuiluppo_applicationException {
		Session session = null;

		try {
			session = openSession();

			suiluppo_application suiluppo_application = (suiluppo_application)session.get(suiluppo_applicationImpl.class,
					primaryKey);

			if (suiluppo_application == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsuiluppo_applicationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(suiluppo_application);
		}
		catch (NoSuchsuiluppo_applicationException nsee) {
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
	protected suiluppo_application removeImpl(
		suiluppo_application suiluppo_application) {
		suiluppo_application = toUnwrappedModel(suiluppo_application);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(suiluppo_application)) {
				suiluppo_application = (suiluppo_application)session.get(suiluppo_applicationImpl.class,
						suiluppo_application.getPrimaryKeyObj());
			}

			if (suiluppo_application != null) {
				session.delete(suiluppo_application);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (suiluppo_application != null) {
			clearCache(suiluppo_application);
		}

		return suiluppo_application;
	}

	@Override
	public suiluppo_application updateImpl(
		suiluppo_application suiluppo_application) {
		suiluppo_application = toUnwrappedModel(suiluppo_application);

		boolean isNew = suiluppo_application.isNew();

		suiluppo_applicationModelImpl suiluppo_applicationModelImpl = (suiluppo_applicationModelImpl)suiluppo_application;

		Session session = null;

		try {
			session = openSession();

			if (suiluppo_application.isNew()) {
				session.save(suiluppo_application);

				suiluppo_application.setNew(false);
			}
			else {
				suiluppo_application = (suiluppo_application)session.merge(suiluppo_application);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !suiluppo_applicationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((suiluppo_applicationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						suiluppo_applicationModelImpl.getOriginalCourse_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COURSE_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID,
					args);

				args = new Object[] { suiluppo_applicationModelImpl.getCourse_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COURSE_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSE_ID,
					args);
			}
		}

		entityCache.putResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_applicationImpl.class,
			suiluppo_application.getPrimaryKey(), suiluppo_application, false);

		suiluppo_application.resetOriginalValues();

		return suiluppo_application;
	}

	protected suiluppo_application toUnwrappedModel(
		suiluppo_application suiluppo_application) {
		if (suiluppo_application instanceof suiluppo_applicationImpl) {
			return suiluppo_application;
		}

		suiluppo_applicationImpl suiluppo_applicationImpl = new suiluppo_applicationImpl();

		suiluppo_applicationImpl.setNew(suiluppo_application.isNew());
		suiluppo_applicationImpl.setPrimaryKey(suiluppo_application.getPrimaryKey());

		suiluppo_applicationImpl.setApplicat_id(suiluppo_application.getApplicat_id());
		suiluppo_applicationImpl.setApplicat_name(suiluppo_application.getApplicat_name());
		suiluppo_applicationImpl.setApplicat_email(suiluppo_application.getApplicat_email());
		suiluppo_applicationImpl.setApplicat_phone(suiluppo_application.getApplicat_phone());
		suiluppo_applicationImpl.setCourse_id(suiluppo_application.getCourse_id());
		suiluppo_applicationImpl.setApplicat_confirm(suiluppo_application.getApplicat_confirm());

		return suiluppo_applicationImpl;
	}

	/**
	 * Returns the suiluppo_application with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_application
	 * @return the suiluppo_application
	 * @throws NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	 */
	@Override
	public suiluppo_application findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsuiluppo_applicationException {
		suiluppo_application suiluppo_application = fetchByPrimaryKey(primaryKey);

		if (suiluppo_application == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsuiluppo_applicationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return suiluppo_application;
	}

	/**
	 * Returns the suiluppo_application with the primary key or throws a {@link NoSuchsuiluppo_applicationException} if it could not be found.
	 *
	 * @param applicat_id the primary key of the suiluppo_application
	 * @return the suiluppo_application
	 * @throws NoSuchsuiluppo_applicationException if a suiluppo_application with the primary key could not be found
	 */
	@Override
	public suiluppo_application findByPrimaryKey(long applicat_id)
		throws NoSuchsuiluppo_applicationException {
		return findByPrimaryKey((Serializable)applicat_id);
	}

	/**
	 * Returns the suiluppo_application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_application
	 * @return the suiluppo_application, or <code>null</code> if a suiluppo_application with the primary key could not be found
	 */
	@Override
	public suiluppo_application fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_applicationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		suiluppo_application suiluppo_application = (suiluppo_application)serializable;

		if (suiluppo_application == null) {
			Session session = null;

			try {
				session = openSession();

				suiluppo_application = (suiluppo_application)session.get(suiluppo_applicationImpl.class,
						primaryKey);

				if (suiluppo_application != null) {
					cacheResult(suiluppo_application);
				}
				else {
					entityCache.putResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_applicationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_applicationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return suiluppo_application;
	}

	/**
	 * Returns the suiluppo_application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param applicat_id the primary key of the suiluppo_application
	 * @return the suiluppo_application, or <code>null</code> if a suiluppo_application with the primary key could not be found
	 */
	@Override
	public suiluppo_application fetchByPrimaryKey(long applicat_id) {
		return fetchByPrimaryKey((Serializable)applicat_id);
	}

	@Override
	public Map<Serializable, suiluppo_application> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, suiluppo_application> map = new HashMap<Serializable, suiluppo_application>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			suiluppo_application suiluppo_application = fetchByPrimaryKey(primaryKey);

			if (suiluppo_application != null) {
				map.put(primaryKey, suiluppo_application);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_applicationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (suiluppo_application)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUILUPPO_APPLICATION_WHERE_PKS_IN);

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

			for (suiluppo_application suiluppo_application : (List<suiluppo_application>)q.list()) {
				map.put(suiluppo_application.getPrimaryKeyObj(),
					suiluppo_application);

				cacheResult(suiluppo_application);

				uncachedPrimaryKeys.remove(suiluppo_application.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(suiluppo_applicationModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_applicationImpl.class, primaryKey, nullModel);
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
	 * Returns all the suiluppo_applications.
	 *
	 * @return the suiluppo_applications
	 */
	@Override
	public List<suiluppo_application> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the suiluppo_applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_applications
	 * @param end the upper bound of the range of suiluppo_applications (not inclusive)
	 * @return the range of suiluppo_applications
	 */
	@Override
	public List<suiluppo_application> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_applications
	 * @param end the upper bound of the range of suiluppo_applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of suiluppo_applications
	 */
	@Override
	public List<suiluppo_application> findAll(int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_applicationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_applications
	 * @param end the upper bound of the range of suiluppo_applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of suiluppo_applications
	 */
	@Override
	public List<suiluppo_application> findAll(int start, int end,
		OrderByComparator<suiluppo_application> orderByComparator,
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

		List<suiluppo_application> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_application>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUILUPPO_APPLICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUILUPPO_APPLICATION;

				if (pagination) {
					sql = sql.concat(suiluppo_applicationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<suiluppo_application>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_application>)QueryUtil.list(q,
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
	 * Removes all the suiluppo_applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (suiluppo_application suiluppo_application : findAll()) {
			remove(suiluppo_application);
		}
	}

	/**
	 * Returns the number of suiluppo_applications.
	 *
	 * @return the number of suiluppo_applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUILUPPO_APPLICATION);

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
		return suiluppo_applicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the suiluppo_application persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(suiluppo_applicationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SUILUPPO_APPLICATION = "SELECT suiluppo_application FROM suiluppo_application suiluppo_application";
	private static final String _SQL_SELECT_SUILUPPO_APPLICATION_WHERE_PKS_IN = "SELECT suiluppo_application FROM suiluppo_application suiluppo_application WHERE applicat_id IN (";
	private static final String _SQL_SELECT_SUILUPPO_APPLICATION_WHERE = "SELECT suiluppo_application FROM suiluppo_application suiluppo_application WHERE ";
	private static final String _SQL_COUNT_SUILUPPO_APPLICATION = "SELECT COUNT(suiluppo_application) FROM suiluppo_application suiluppo_application";
	private static final String _SQL_COUNT_SUILUPPO_APPLICATION_WHERE = "SELECT COUNT(suiluppo_application) FROM suiluppo_application suiluppo_application WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "suiluppo_application.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No suiluppo_application exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No suiluppo_application exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(suiluppo_applicationPersistenceImpl.class);
}
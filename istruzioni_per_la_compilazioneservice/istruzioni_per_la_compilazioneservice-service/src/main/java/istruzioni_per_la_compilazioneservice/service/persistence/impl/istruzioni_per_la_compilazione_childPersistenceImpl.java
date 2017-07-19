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

package istruzioni_per_la_compilazioneservice.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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

import istruzioni_per_la_compilazioneservice.exception.NoSuch_childException;

import istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childImpl;
import istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childModelImpl;

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child;

import istruzioni_per_la_compilazioneservice.service.persistence.istruzioni_per_la_compilazione_childPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the istruzioni_per_la_compilazione_child service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione_childPersistence
 * @see istruzioni_per_la_compilazioneservice.service.persistence.istruzioni_per_la_compilazione_childUtil
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazione_childPersistenceImpl
	extends BasePersistenceImpl<istruzioni_per_la_compilazione_child>
	implements istruzioni_per_la_compilazione_childPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link istruzioni_per_la_compilazione_childUtil} to access the istruzioni_per_la_compilazione_child persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = istruzioni_per_la_compilazione_childImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childModelImpl.FINDER_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childModelImpl.FINDER_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISTRUZIONI_PER_ID =
		new FinderPath(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childModelImpl.FINDER_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIstruzioni_per_id",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISTRUZIONI_PER_ID =
		new FinderPath(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childModelImpl.FINDER_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByIstruzioni_per_id", new String[] { Long.class.getName() },
			istruzioni_per_la_compilazione_childModelImpl.ISTRUZIONI_PER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISTRUZIONI_PER_ID = new FinderPath(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByIstruzioni_per_id", new String[] { Long.class.getName() });

	/**
	 * Returns all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @return the matching istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id) {
		return findByIstruzioni_per_id(Istruzioni_per_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	 * @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	 * @return the range of matching istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end) {
		return findByIstruzioni_per_id(Istruzioni_per_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	 * @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		return findByIstruzioni_per_id(Istruzioni_per_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	 * @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISTRUZIONI_PER_ID;
			finderArgs = new Object[] { Istruzioni_per_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISTRUZIONI_PER_ID;
			finderArgs = new Object[] {
					Istruzioni_per_id,
					
					start, end, orderByComparator
				};
		}

		List<istruzioni_per_la_compilazione_child> list = null;

		if (retrieveFromCache) {
			list = (List<istruzioni_per_la_compilazione_child>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child : list) {
					if ((Istruzioni_per_id != istruzioni_per_la_compilazione_child.getIstruzioni_per_id())) {
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

			query.append(_SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD_WHERE);

			query.append(_FINDER_COLUMN_ISTRUZIONI_PER_ID_ISTRUZIONI_PER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(istruzioni_per_la_compilazione_childModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(Istruzioni_per_id);

				if (!pagination) {
					list = (List<istruzioni_per_la_compilazione_child>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<istruzioni_per_la_compilazione_child>)QueryUtil.list(q,
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
	 * Returns the first istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching istruzioni_per_la_compilazione_child
	 * @throws NoSuch_childException if a matching istruzioni_per_la_compilazione_child could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child findByIstruzioni_per_id_First(
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws NoSuch_childException {
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
			fetchByIstruzioni_per_id_First(Istruzioni_per_id, orderByComparator);

		if (istruzioni_per_la_compilazione_child != null) {
			return istruzioni_per_la_compilazione_child;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("Istruzioni_per_id=");
		msg.append(Istruzioni_per_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_childException(msg.toString());
	}

	/**
	 * Returns the first istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching istruzioni_per_la_compilazione_child, or <code>null</code> if a matching istruzioni_per_la_compilazione_child could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child fetchByIstruzioni_per_id_First(
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		List<istruzioni_per_la_compilazione_child> list = findByIstruzioni_per_id(Istruzioni_per_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching istruzioni_per_la_compilazione_child
	 * @throws NoSuch_childException if a matching istruzioni_per_la_compilazione_child could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child findByIstruzioni_per_id_Last(
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws NoSuch_childException {
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
			fetchByIstruzioni_per_id_Last(Istruzioni_per_id, orderByComparator);

		if (istruzioni_per_la_compilazione_child != null) {
			return istruzioni_per_la_compilazione_child;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("Istruzioni_per_id=");
		msg.append(Istruzioni_per_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuch_childException(msg.toString());
	}

	/**
	 * Returns the last istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching istruzioni_per_la_compilazione_child, or <code>null</code> if a matching istruzioni_per_la_compilazione_child could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child fetchByIstruzioni_per_id_Last(
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		int count = countByIstruzioni_per_id(Istruzioni_per_id);

		if (count == 0) {
			return null;
		}

		List<istruzioni_per_la_compilazione_child> list = findByIstruzioni_per_id(Istruzioni_per_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione_childs before and after the current istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	 *
	 * @param Ins_id the primary key of the current istruzioni_per_la_compilazione_child
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next istruzioni_per_la_compilazione_child
	 * @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child[] findByIstruzioni_per_id_PrevAndNext(
		long Ins_id, long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws NoSuch_childException {
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
			findByPrimaryKey(Ins_id);

		Session session = null;

		try {
			session = openSession();

			istruzioni_per_la_compilazione_child[] array = new istruzioni_per_la_compilazione_childImpl[3];

			array[0] = getByIstruzioni_per_id_PrevAndNext(session,
					istruzioni_per_la_compilazione_child, Istruzioni_per_id,
					orderByComparator, true);

			array[1] = istruzioni_per_la_compilazione_child;

			array[2] = getByIstruzioni_per_id_PrevAndNext(session,
					istruzioni_per_la_compilazione_child, Istruzioni_per_id,
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

	protected istruzioni_per_la_compilazione_child getByIstruzioni_per_id_PrevAndNext(
		Session session,
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child,
		long Istruzioni_per_id,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator,
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

		query.append(_SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD_WHERE);

		query.append(_FINDER_COLUMN_ISTRUZIONI_PER_ID_ISTRUZIONI_PER_ID_2);

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
			query.append(istruzioni_per_la_compilazione_childModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(Istruzioni_per_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(istruzioni_per_la_compilazione_child);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<istruzioni_per_la_compilazione_child> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63; from the database.
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 */
	@Override
	public void removeByIstruzioni_per_id(long Istruzioni_per_id) {
		for (istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child : findByIstruzioni_per_id(
				Istruzioni_per_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(istruzioni_per_la_compilazione_child);
		}
	}

	/**
	 * Returns the number of istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	 *
	 * @param Istruzioni_per_id the istruzioni_per_id
	 * @return the number of matching istruzioni_per_la_compilazione_childs
	 */
	@Override
	public int countByIstruzioni_per_id(long Istruzioni_per_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISTRUZIONI_PER_ID;

		Object[] finderArgs = new Object[] { Istruzioni_per_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD_WHERE);

			query.append(_FINDER_COLUMN_ISTRUZIONI_PER_ID_ISTRUZIONI_PER_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(Istruzioni_per_id);

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

	private static final String _FINDER_COLUMN_ISTRUZIONI_PER_ID_ISTRUZIONI_PER_ID_2 =
		"istruzioni_per_la_compilazione_child.Istruzioni_per_id = ?";

	public istruzioni_per_la_compilazione_childPersistenceImpl() {
		setModelClass(istruzioni_per_la_compilazione_child.class);
	}

	/**
	 * Caches the istruzioni_per_la_compilazione_child in the entity cache if it is enabled.
	 *
	 * @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	 */
	@Override
	public void cacheResult(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		entityCache.putResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childImpl.class,
			istruzioni_per_la_compilazione_child.getPrimaryKey(),
			istruzioni_per_la_compilazione_child);

		istruzioni_per_la_compilazione_child.resetOriginalValues();
	}

	/**
	 * Caches the istruzioni_per_la_compilazione_childs in the entity cache if it is enabled.
	 *
	 * @param istruzioni_per_la_compilazione_childs the istruzioni_per_la_compilazione_childs
	 */
	@Override
	public void cacheResult(
		List<istruzioni_per_la_compilazione_child> istruzioni_per_la_compilazione_childs) {
		for (istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child : istruzioni_per_la_compilazione_childs) {
			if (entityCache.getResult(
						istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
						istruzioni_per_la_compilazione_childImpl.class,
						istruzioni_per_la_compilazione_child.getPrimaryKey()) == null) {
				cacheResult(istruzioni_per_la_compilazione_child);
			}
			else {
				istruzioni_per_la_compilazione_child.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all istruzioni_per_la_compilazione_childs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(istruzioni_per_la_compilazione_childImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the istruzioni_per_la_compilazione_child.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		entityCache.removeResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childImpl.class,
			istruzioni_per_la_compilazione_child.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<istruzioni_per_la_compilazione_child> istruzioni_per_la_compilazione_childs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child : istruzioni_per_la_compilazione_childs) {
			entityCache.removeResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
				istruzioni_per_la_compilazione_childImpl.class,
				istruzioni_per_la_compilazione_child.getPrimaryKey());
		}
	}

	/**
	 * Creates a new istruzioni_per_la_compilazione_child with the primary key. Does not add the istruzioni_per_la_compilazione_child to the database.
	 *
	 * @param Ins_id the primary key for the new istruzioni_per_la_compilazione_child
	 * @return the new istruzioni_per_la_compilazione_child
	 */
	@Override
	public istruzioni_per_la_compilazione_child create(long Ins_id) {
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
			new istruzioni_per_la_compilazione_childImpl();

		istruzioni_per_la_compilazione_child.setNew(true);
		istruzioni_per_la_compilazione_child.setPrimaryKey(Ins_id);

		return istruzioni_per_la_compilazione_child;
	}

	/**
	 * Removes the istruzioni_per_la_compilazione_child with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child that was removed
	 * @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child remove(long Ins_id)
		throws NoSuch_childException {
		return remove((Serializable)Ins_id);
	}

	/**
	 * Removes the istruzioni_per_la_compilazione_child with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child that was removed
	 * @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child remove(Serializable primaryKey)
		throws NoSuch_childException {
		Session session = null;

		try {
			session = openSession();

			istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
				(istruzioni_per_la_compilazione_child)session.get(istruzioni_per_la_compilazione_childImpl.class,
					primaryKey);

			if (istruzioni_per_la_compilazione_child == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuch_childException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(istruzioni_per_la_compilazione_child);
		}
		catch (NoSuch_childException nsee) {
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
	protected istruzioni_per_la_compilazione_child removeImpl(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		istruzioni_per_la_compilazione_child = toUnwrappedModel(istruzioni_per_la_compilazione_child);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(istruzioni_per_la_compilazione_child)) {
				istruzioni_per_la_compilazione_child = (istruzioni_per_la_compilazione_child)session.get(istruzioni_per_la_compilazione_childImpl.class,
						istruzioni_per_la_compilazione_child.getPrimaryKeyObj());
			}

			if (istruzioni_per_la_compilazione_child != null) {
				session.delete(istruzioni_per_la_compilazione_child);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (istruzioni_per_la_compilazione_child != null) {
			clearCache(istruzioni_per_la_compilazione_child);
		}

		return istruzioni_per_la_compilazione_child;
	}

	@Override
	public istruzioni_per_la_compilazione_child updateImpl(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		istruzioni_per_la_compilazione_child = toUnwrappedModel(istruzioni_per_la_compilazione_child);

		boolean isNew = istruzioni_per_la_compilazione_child.isNew();

		istruzioni_per_la_compilazione_childModelImpl istruzioni_per_la_compilazione_childModelImpl =
			(istruzioni_per_la_compilazione_childModelImpl)istruzioni_per_la_compilazione_child;

		Session session = null;

		try {
			session = openSession();

			if (istruzioni_per_la_compilazione_child.isNew()) {
				session.save(istruzioni_per_la_compilazione_child);

				istruzioni_per_la_compilazione_child.setNew(false);
			}
			else {
				istruzioni_per_la_compilazione_child = (istruzioni_per_la_compilazione_child)session.merge(istruzioni_per_la_compilazione_child);
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
				!istruzioni_per_la_compilazione_childModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((istruzioni_per_la_compilazione_childModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISTRUZIONI_PER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						istruzioni_per_la_compilazione_childModelImpl.getOriginalIstruzioni_per_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISTRUZIONI_PER_ID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISTRUZIONI_PER_ID,
					args);

				args = new Object[] {
						istruzioni_per_la_compilazione_childModelImpl.getIstruzioni_per_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISTRUZIONI_PER_ID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISTRUZIONI_PER_ID,
					args);
			}
		}

		entityCache.putResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazione_childImpl.class,
			istruzioni_per_la_compilazione_child.getPrimaryKey(),
			istruzioni_per_la_compilazione_child, false);

		istruzioni_per_la_compilazione_child.resetOriginalValues();

		return istruzioni_per_la_compilazione_child;
	}

	protected istruzioni_per_la_compilazione_child toUnwrappedModel(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		if (istruzioni_per_la_compilazione_child instanceof istruzioni_per_la_compilazione_childImpl) {
			return istruzioni_per_la_compilazione_child;
		}

		istruzioni_per_la_compilazione_childImpl istruzioni_per_la_compilazione_childImpl =
			new istruzioni_per_la_compilazione_childImpl();

		istruzioni_per_la_compilazione_childImpl.setNew(istruzioni_per_la_compilazione_child.isNew());
		istruzioni_per_la_compilazione_childImpl.setPrimaryKey(istruzioni_per_la_compilazione_child.getPrimaryKey());

		istruzioni_per_la_compilazione_childImpl.setIns_id(istruzioni_per_la_compilazione_child.getIns_id());
		istruzioni_per_la_compilazione_childImpl.setInstruction(istruzioni_per_la_compilazione_child.getInstruction());
		istruzioni_per_la_compilazione_childImpl.setIstruzioni_per_id(istruzioni_per_la_compilazione_child.getIstruzioni_per_id());

		return istruzioni_per_la_compilazione_childImpl;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione_child with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child
	 * @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child findByPrimaryKey(
		Serializable primaryKey) throws NoSuch_childException {
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
			fetchByPrimaryKey(primaryKey);

		if (istruzioni_per_la_compilazione_child == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuch_childException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return istruzioni_per_la_compilazione_child;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione_child with the primary key or throws a {@link NoSuch_childException} if it could not be found.
	 *
	 * @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child
	 * @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child findByPrimaryKey(long Ins_id)
		throws NoSuch_childException {
		return findByPrimaryKey((Serializable)Ins_id);
	}

	/**
	 * Returns the istruzioni_per_la_compilazione_child with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child, or <code>null</code> if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
				istruzioni_per_la_compilazione_childImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
			(istruzioni_per_la_compilazione_child)serializable;

		if (istruzioni_per_la_compilazione_child == null) {
			Session session = null;

			try {
				session = openSession();

				istruzioni_per_la_compilazione_child = (istruzioni_per_la_compilazione_child)session.get(istruzioni_per_la_compilazione_childImpl.class,
						primaryKey);

				if (istruzioni_per_la_compilazione_child != null) {
					cacheResult(istruzioni_per_la_compilazione_child);
				}
				else {
					entityCache.putResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
						istruzioni_per_la_compilazione_childImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
					istruzioni_per_la_compilazione_childImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return istruzioni_per_la_compilazione_child;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione_child with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child, or <code>null</code> if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child fetchByPrimaryKey(long Ins_id) {
		return fetchByPrimaryKey((Serializable)Ins_id);
	}

	@Override
	public Map<Serializable, istruzioni_per_la_compilazione_child> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, istruzioni_per_la_compilazione_child> map = new HashMap<Serializable, istruzioni_per_la_compilazione_child>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
				fetchByPrimaryKey(primaryKey);

			if (istruzioni_per_la_compilazione_child != null) {
				map.put(primaryKey, istruzioni_per_la_compilazione_child);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
					istruzioni_per_la_compilazione_childImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(istruzioni_per_la_compilazione_child)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD_WHERE_PKS_IN);

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

			for (istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child : (List<istruzioni_per_la_compilazione_child>)q.list()) {
				map.put(istruzioni_per_la_compilazione_child.getPrimaryKeyObj(),
					istruzioni_per_la_compilazione_child);

				cacheResult(istruzioni_per_la_compilazione_child);

				uncachedPrimaryKeys.remove(istruzioni_per_la_compilazione_child.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(istruzioni_per_la_compilazione_childModelImpl.ENTITY_CACHE_ENABLED,
					istruzioni_per_la_compilazione_childImpl.class, primaryKey,
					nullModel);
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
	 * Returns all the istruzioni_per_la_compilazione_childs.
	 *
	 * @return the istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the istruzioni_per_la_compilazione_childs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	 * @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	 * @return the range of istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the istruzioni_per_la_compilazione_childs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	 * @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> findAll(int start,
		int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the istruzioni_per_la_compilazione_childs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	 * @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> findAll(int start,
		int end,
		OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator,
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

		List<istruzioni_per_la_compilazione_child> list = null;

		if (retrieveFromCache) {
			list = (List<istruzioni_per_la_compilazione_child>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD;

				if (pagination) {
					sql = sql.concat(istruzioni_per_la_compilazione_childModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<istruzioni_per_la_compilazione_child>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<istruzioni_per_la_compilazione_child>)QueryUtil.list(q,
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
	 * Removes all the istruzioni_per_la_compilazione_childs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child : findAll()) {
			remove(istruzioni_per_la_compilazione_child);
		}
	}

	/**
	 * Returns the number of istruzioni_per_la_compilazione_childs.
	 *
	 * @return the number of istruzioni_per_la_compilazione_childs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD);

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
		return istruzioni_per_la_compilazione_childModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the istruzioni_per_la_compilazione_child persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(istruzioni_per_la_compilazione_childImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD =
		"SELECT istruzioni_per_la_compilazione_child FROM istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child";
	private static final String _SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD_WHERE_PKS_IN =
		"SELECT istruzioni_per_la_compilazione_child FROM istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child WHERE Ins_id IN (";
	private static final String _SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD_WHERE =
		"SELECT istruzioni_per_la_compilazione_child FROM istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child WHERE ";
	private static final String _SQL_COUNT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD = "SELECT COUNT(istruzioni_per_la_compilazione_child) FROM istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child";
	private static final String _SQL_COUNT_ISTRUZIONI_PER_LA_COMPILAZIONE_CHILD_WHERE =
		"SELECT COUNT(istruzioni_per_la_compilazione_child) FROM istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "istruzioni_per_la_compilazione_child.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No istruzioni_per_la_compilazione_child exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No istruzioni_per_la_compilazione_child exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(istruzioni_per_la_compilazione_childPersistenceImpl.class);
}
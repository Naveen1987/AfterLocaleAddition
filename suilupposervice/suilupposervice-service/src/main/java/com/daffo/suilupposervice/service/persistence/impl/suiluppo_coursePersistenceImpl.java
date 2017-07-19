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

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_courseException;
import com.daffo.suilupposervice.model.impl.suiluppo_courseImpl;
import com.daffo.suilupposervice.model.impl.suiluppo_courseModelImpl;
import com.daffo.suilupposervice.model.suiluppo_course;
import com.daffo.suilupposervice.service.persistence.suiluppo_coursePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
 * The persistence implementation for the suiluppo_course service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_coursePersistence
 * @see com.daffo.suilupposervice.service.persistence.suiluppo_courseUtil
 * @generated
 */
@ProviderType
public class suiluppo_coursePersistenceImpl extends BasePersistenceImpl<suiluppo_course>
	implements suiluppo_coursePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link suiluppo_courseUtil} to access the suiluppo_course persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = suiluppo_courseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_courseModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_courseImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_courseModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_courseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_courseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public suiluppo_coursePersistenceImpl() {
		setModelClass(suiluppo_course.class);
	}

	/**
	 * Caches the suiluppo_course in the entity cache if it is enabled.
	 *
	 * @param suiluppo_course the suiluppo_course
	 */
	@Override
	public void cacheResult(suiluppo_course suiluppo_course) {
		entityCache.putResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_courseImpl.class, suiluppo_course.getPrimaryKey(),
			suiluppo_course);

		suiluppo_course.resetOriginalValues();
	}

	/**
	 * Caches the suiluppo_courses in the entity cache if it is enabled.
	 *
	 * @param suiluppo_courses the suiluppo_courses
	 */
	@Override
	public void cacheResult(List<suiluppo_course> suiluppo_courses) {
		for (suiluppo_course suiluppo_course : suiluppo_courses) {
			if (entityCache.getResult(
						suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_courseImpl.class,
						suiluppo_course.getPrimaryKey()) == null) {
				cacheResult(suiluppo_course);
			}
			else {
				suiluppo_course.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all suiluppo_courses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(suiluppo_courseImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the suiluppo_course.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(suiluppo_course suiluppo_course) {
		entityCache.removeResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_courseImpl.class, suiluppo_course.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<suiluppo_course> suiluppo_courses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (suiluppo_course suiluppo_course : suiluppo_courses) {
			entityCache.removeResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_courseImpl.class, suiluppo_course.getPrimaryKey());
		}
	}

	/**
	 * Creates a new suiluppo_course with the primary key. Does not add the suiluppo_course to the database.
	 *
	 * @param course_id the primary key for the new suiluppo_course
	 * @return the new suiluppo_course
	 */
	@Override
	public suiluppo_course create(long course_id) {
		suiluppo_course suiluppo_course = new suiluppo_courseImpl();

		suiluppo_course.setNew(true);
		suiluppo_course.setPrimaryKey(course_id);

		return suiluppo_course;
	}

	/**
	 * Removes the suiluppo_course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param course_id the primary key of the suiluppo_course
	 * @return the suiluppo_course that was removed
	 * @throws NoSuchsuiluppo_courseException if a suiluppo_course with the primary key could not be found
	 */
	@Override
	public suiluppo_course remove(long course_id)
		throws NoSuchsuiluppo_courseException {
		return remove((Serializable)course_id);
	}

	/**
	 * Removes the suiluppo_course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the suiluppo_course
	 * @return the suiluppo_course that was removed
	 * @throws NoSuchsuiluppo_courseException if a suiluppo_course with the primary key could not be found
	 */
	@Override
	public suiluppo_course remove(Serializable primaryKey)
		throws NoSuchsuiluppo_courseException {
		Session session = null;

		try {
			session = openSession();

			suiluppo_course suiluppo_course = (suiluppo_course)session.get(suiluppo_courseImpl.class,
					primaryKey);

			if (suiluppo_course == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsuiluppo_courseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(suiluppo_course);
		}
		catch (NoSuchsuiluppo_courseException nsee) {
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
	protected suiluppo_course removeImpl(suiluppo_course suiluppo_course) {
		suiluppo_course = toUnwrappedModel(suiluppo_course);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(suiluppo_course)) {
				suiluppo_course = (suiluppo_course)session.get(suiluppo_courseImpl.class,
						suiluppo_course.getPrimaryKeyObj());
			}

			if (suiluppo_course != null) {
				session.delete(suiluppo_course);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (suiluppo_course != null) {
			clearCache(suiluppo_course);
		}

		return suiluppo_course;
	}

	@Override
	public suiluppo_course updateImpl(suiluppo_course suiluppo_course) {
		suiluppo_course = toUnwrappedModel(suiluppo_course);

		boolean isNew = suiluppo_course.isNew();

		Session session = null;

		try {
			session = openSession();

			if (suiluppo_course.isNew()) {
				session.save(suiluppo_course);

				suiluppo_course.setNew(false);
			}
			else {
				suiluppo_course = (suiluppo_course)session.merge(suiluppo_course);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_courseImpl.class, suiluppo_course.getPrimaryKey(),
			suiluppo_course, false);

		suiluppo_course.resetOriginalValues();

		return suiluppo_course;
	}

	protected suiluppo_course toUnwrappedModel(suiluppo_course suiluppo_course) {
		if (suiluppo_course instanceof suiluppo_courseImpl) {
			return suiluppo_course;
		}

		suiluppo_courseImpl suiluppo_courseImpl = new suiluppo_courseImpl();

		suiluppo_courseImpl.setNew(suiluppo_course.isNew());
		suiluppo_courseImpl.setPrimaryKey(suiluppo_course.getPrimaryKey());

		suiluppo_courseImpl.setCourse_id(suiluppo_course.getCourse_id());
		suiluppo_courseImpl.setDocente(suiluppo_course.getDocente());
		suiluppo_courseImpl.setEvento_Progetto(suiluppo_course.getEvento_Progetto());
		suiluppo_courseImpl.setTitolo(suiluppo_course.getTitolo());
		suiluppo_courseImpl.setDescrizione(suiluppo_course.getDescrizione());
		suiluppo_courseImpl.setFigure_Professionali_Coinvolte(suiluppo_course.getFigure_Professionali_Coinvolte());
		suiluppo_courseImpl.setData_Inizio(suiluppo_course.getData_Inizio());
		suiluppo_courseImpl.setData_Fine(suiluppo_course.getData_Fine());
		suiluppo_courseImpl.setTot_Ore(suiluppo_course.getTot_Ore());
		suiluppo_courseImpl.setNr_Edizione(suiluppo_course.getNr_Edizione());
		suiluppo_courseImpl.setSede(suiluppo_course.getSede());
		suiluppo_courseImpl.setAbstract(suiluppo_course.getAbstract());
		suiluppo_courseImpl.setDispensa_corso(suiluppo_course.getDispensa_corso());
		suiluppo_courseImpl.setAmmessi_al_corso(suiluppo_course.getAmmessi_al_corso());
		suiluppo_courseImpl.setScadenza_Iscrizioni(suiluppo_course.getScadenza_Iscrizioni());
		suiluppo_courseImpl.setVisibile(suiluppo_course.getVisibile());
		suiluppo_courseImpl.setBloccato(suiluppo_course.getBloccato());

		return suiluppo_courseImpl;
	}

	/**
	 * Returns the suiluppo_course with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_course
	 * @return the suiluppo_course
	 * @throws NoSuchsuiluppo_courseException if a suiluppo_course with the primary key could not be found
	 */
	@Override
	public suiluppo_course findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsuiluppo_courseException {
		suiluppo_course suiluppo_course = fetchByPrimaryKey(primaryKey);

		if (suiluppo_course == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsuiluppo_courseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return suiluppo_course;
	}

	/**
	 * Returns the suiluppo_course with the primary key or throws a {@link NoSuchsuiluppo_courseException} if it could not be found.
	 *
	 * @param course_id the primary key of the suiluppo_course
	 * @return the suiluppo_course
	 * @throws NoSuchsuiluppo_courseException if a suiluppo_course with the primary key could not be found
	 */
	@Override
	public suiluppo_course findByPrimaryKey(long course_id)
		throws NoSuchsuiluppo_courseException {
		return findByPrimaryKey((Serializable)course_id);
	}

	/**
	 * Returns the suiluppo_course with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_course
	 * @return the suiluppo_course, or <code>null</code> if a suiluppo_course with the primary key could not be found
	 */
	@Override
	public suiluppo_course fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_courseImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		suiluppo_course suiluppo_course = (suiluppo_course)serializable;

		if (suiluppo_course == null) {
			Session session = null;

			try {
				session = openSession();

				suiluppo_course = (suiluppo_course)session.get(suiluppo_courseImpl.class,
						primaryKey);

				if (suiluppo_course != null) {
					cacheResult(suiluppo_course);
				}
				else {
					entityCache.putResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_courseImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_courseImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return suiluppo_course;
	}

	/**
	 * Returns the suiluppo_course with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param course_id the primary key of the suiluppo_course
	 * @return the suiluppo_course, or <code>null</code> if a suiluppo_course with the primary key could not be found
	 */
	@Override
	public suiluppo_course fetchByPrimaryKey(long course_id) {
		return fetchByPrimaryKey((Serializable)course_id);
	}

	@Override
	public Map<Serializable, suiluppo_course> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, suiluppo_course> map = new HashMap<Serializable, suiluppo_course>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			suiluppo_course suiluppo_course = fetchByPrimaryKey(primaryKey);

			if (suiluppo_course != null) {
				map.put(primaryKey, suiluppo_course);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_courseImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (suiluppo_course)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUILUPPO_COURSE_WHERE_PKS_IN);

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

			for (suiluppo_course suiluppo_course : (List<suiluppo_course>)q.list()) {
				map.put(suiluppo_course.getPrimaryKeyObj(), suiluppo_course);

				cacheResult(suiluppo_course);

				uncachedPrimaryKeys.remove(suiluppo_course.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(suiluppo_courseModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_courseImpl.class, primaryKey, nullModel);
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
	 * Returns all the suiluppo_courses.
	 *
	 * @return the suiluppo_courses
	 */
	@Override
	public List<suiluppo_course> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the suiluppo_courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_courses
	 * @param end the upper bound of the range of suiluppo_courses (not inclusive)
	 * @return the range of suiluppo_courses
	 */
	@Override
	public List<suiluppo_course> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_courses
	 * @param end the upper bound of the range of suiluppo_courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of suiluppo_courses
	 */
	@Override
	public List<suiluppo_course> findAll(int start, int end,
		OrderByComparator<suiluppo_course> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_courses
	 * @param end the upper bound of the range of suiluppo_courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of suiluppo_courses
	 */
	@Override
	public List<suiluppo_course> findAll(int start, int end,
		OrderByComparator<suiluppo_course> orderByComparator,
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

		List<suiluppo_course> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_course>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUILUPPO_COURSE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUILUPPO_COURSE;

				if (pagination) {
					sql = sql.concat(suiluppo_courseModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<suiluppo_course>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_course>)QueryUtil.list(q,
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
	 * Removes all the suiluppo_courses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (suiluppo_course suiluppo_course : findAll()) {
			remove(suiluppo_course);
		}
	}

	/**
	 * Returns the number of suiluppo_courses.
	 *
	 * @return the number of suiluppo_courses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUILUPPO_COURSE);

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
		return suiluppo_courseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the suiluppo_course persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(suiluppo_courseImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SUILUPPO_COURSE = "SELECT suiluppo_course FROM suiluppo_course suiluppo_course";
	private static final String _SQL_SELECT_SUILUPPO_COURSE_WHERE_PKS_IN = "SELECT suiluppo_course FROM suiluppo_course suiluppo_course WHERE course_id IN (";
	private static final String _SQL_COUNT_SUILUPPO_COURSE = "SELECT COUNT(suiluppo_course) FROM suiluppo_course suiluppo_course";
	private static final String _ORDER_BY_ENTITY_ALIAS = "suiluppo_course.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No suiluppo_course exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(suiluppo_coursePersistenceImpl.class);
}
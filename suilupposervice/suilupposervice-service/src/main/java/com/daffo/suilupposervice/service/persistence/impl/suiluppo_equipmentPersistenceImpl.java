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

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_equipmentException;
import com.daffo.suilupposervice.model.impl.suiluppo_equipmentImpl;
import com.daffo.suilupposervice.model.impl.suiluppo_equipmentModelImpl;
import com.daffo.suilupposervice.model.suiluppo_equipment;
import com.daffo.suilupposervice.service.persistence.suiluppo_equipmentPersistence;

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
 * The persistence implementation for the suiluppo_equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_equipmentPersistence
 * @see com.daffo.suilupposervice.service.persistence.suiluppo_equipmentUtil
 * @generated
 */
@ProviderType
public class suiluppo_equipmentPersistenceImpl extends BasePersistenceImpl<suiluppo_equipment>
	implements suiluppo_equipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link suiluppo_equipmentUtil} to access the suiluppo_equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = suiluppo_equipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equipmentModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_equipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equipmentModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_equipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public suiluppo_equipmentPersistenceImpl() {
		setModelClass(suiluppo_equipment.class);
	}

	/**
	 * Caches the suiluppo_equipment in the entity cache if it is enabled.
	 *
	 * @param suiluppo_equipment the suiluppo_equipment
	 */
	@Override
	public void cacheResult(suiluppo_equipment suiluppo_equipment) {
		entityCache.putResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equipmentImpl.class, suiluppo_equipment.getPrimaryKey(),
			suiluppo_equipment);

		suiluppo_equipment.resetOriginalValues();
	}

	/**
	 * Caches the suiluppo_equipments in the entity cache if it is enabled.
	 *
	 * @param suiluppo_equipments the suiluppo_equipments
	 */
	@Override
	public void cacheResult(List<suiluppo_equipment> suiluppo_equipments) {
		for (suiluppo_equipment suiluppo_equipment : suiluppo_equipments) {
			if (entityCache.getResult(
						suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_equipmentImpl.class,
						suiluppo_equipment.getPrimaryKey()) == null) {
				cacheResult(suiluppo_equipment);
			}
			else {
				suiluppo_equipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all suiluppo_equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(suiluppo_equipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the suiluppo_equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(suiluppo_equipment suiluppo_equipment) {
		entityCache.removeResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equipmentImpl.class, suiluppo_equipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<suiluppo_equipment> suiluppo_equipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (suiluppo_equipment suiluppo_equipment : suiluppo_equipments) {
			entityCache.removeResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_equipmentImpl.class, suiluppo_equipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new suiluppo_equipment with the primary key. Does not add the suiluppo_equipment to the database.
	 *
	 * @param equip_id the primary key for the new suiluppo_equipment
	 * @return the new suiluppo_equipment
	 */
	@Override
	public suiluppo_equipment create(long equip_id) {
		suiluppo_equipment suiluppo_equipment = new suiluppo_equipmentImpl();

		suiluppo_equipment.setNew(true);
		suiluppo_equipment.setPrimaryKey(equip_id);

		return suiluppo_equipment;
	}

	/**
	 * Removes the suiluppo_equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param equip_id the primary key of the suiluppo_equipment
	 * @return the suiluppo_equipment that was removed
	 * @throws NoSuchsuiluppo_equipmentException if a suiluppo_equipment with the primary key could not be found
	 */
	@Override
	public suiluppo_equipment remove(long equip_id)
		throws NoSuchsuiluppo_equipmentException {
		return remove((Serializable)equip_id);
	}

	/**
	 * Removes the suiluppo_equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the suiluppo_equipment
	 * @return the suiluppo_equipment that was removed
	 * @throws NoSuchsuiluppo_equipmentException if a suiluppo_equipment with the primary key could not be found
	 */
	@Override
	public suiluppo_equipment remove(Serializable primaryKey)
		throws NoSuchsuiluppo_equipmentException {
		Session session = null;

		try {
			session = openSession();

			suiluppo_equipment suiluppo_equipment = (suiluppo_equipment)session.get(suiluppo_equipmentImpl.class,
					primaryKey);

			if (suiluppo_equipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsuiluppo_equipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(suiluppo_equipment);
		}
		catch (NoSuchsuiluppo_equipmentException nsee) {
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
	protected suiluppo_equipment removeImpl(
		suiluppo_equipment suiluppo_equipment) {
		suiluppo_equipment = toUnwrappedModel(suiluppo_equipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(suiluppo_equipment)) {
				suiluppo_equipment = (suiluppo_equipment)session.get(suiluppo_equipmentImpl.class,
						suiluppo_equipment.getPrimaryKeyObj());
			}

			if (suiluppo_equipment != null) {
				session.delete(suiluppo_equipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (suiluppo_equipment != null) {
			clearCache(suiluppo_equipment);
		}

		return suiluppo_equipment;
	}

	@Override
	public suiluppo_equipment updateImpl(suiluppo_equipment suiluppo_equipment) {
		suiluppo_equipment = toUnwrappedModel(suiluppo_equipment);

		boolean isNew = suiluppo_equipment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (suiluppo_equipment.isNew()) {
				session.save(suiluppo_equipment);

				suiluppo_equipment.setNew(false);
			}
			else {
				suiluppo_equipment = (suiluppo_equipment)session.merge(suiluppo_equipment);
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

		entityCache.putResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_equipmentImpl.class, suiluppo_equipment.getPrimaryKey(),
			suiluppo_equipment, false);

		suiluppo_equipment.resetOriginalValues();

		return suiluppo_equipment;
	}

	protected suiluppo_equipment toUnwrappedModel(
		suiluppo_equipment suiluppo_equipment) {
		if (suiluppo_equipment instanceof suiluppo_equipmentImpl) {
			return suiluppo_equipment;
		}

		suiluppo_equipmentImpl suiluppo_equipmentImpl = new suiluppo_equipmentImpl();

		suiluppo_equipmentImpl.setNew(suiluppo_equipment.isNew());
		suiluppo_equipmentImpl.setPrimaryKey(suiluppo_equipment.getPrimaryKey());

		suiluppo_equipmentImpl.setEquip_id(suiluppo_equipment.getEquip_id());
		suiluppo_equipmentImpl.setEquip_name(suiluppo_equipment.getEquip_name());
		suiluppo_equipmentImpl.setEquip_quanity(suiluppo_equipment.getEquip_quanity());
		suiluppo_equipmentImpl.setEquip_description(suiluppo_equipment.getEquip_description());

		return suiluppo_equipmentImpl;
	}

	/**
	 * Returns the suiluppo_equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_equipment
	 * @return the suiluppo_equipment
	 * @throws NoSuchsuiluppo_equipmentException if a suiluppo_equipment with the primary key could not be found
	 */
	@Override
	public suiluppo_equipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsuiluppo_equipmentException {
		suiluppo_equipment suiluppo_equipment = fetchByPrimaryKey(primaryKey);

		if (suiluppo_equipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsuiluppo_equipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return suiluppo_equipment;
	}

	/**
	 * Returns the suiluppo_equipment with the primary key or throws a {@link NoSuchsuiluppo_equipmentException} if it could not be found.
	 *
	 * @param equip_id the primary key of the suiluppo_equipment
	 * @return the suiluppo_equipment
	 * @throws NoSuchsuiluppo_equipmentException if a suiluppo_equipment with the primary key could not be found
	 */
	@Override
	public suiluppo_equipment findByPrimaryKey(long equip_id)
		throws NoSuchsuiluppo_equipmentException {
		return findByPrimaryKey((Serializable)equip_id);
	}

	/**
	 * Returns the suiluppo_equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_equipment
	 * @return the suiluppo_equipment, or <code>null</code> if a suiluppo_equipment with the primary key could not be found
	 */
	@Override
	public suiluppo_equipment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_equipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		suiluppo_equipment suiluppo_equipment = (suiluppo_equipment)serializable;

		if (suiluppo_equipment == null) {
			Session session = null;

			try {
				session = openSession();

				suiluppo_equipment = (suiluppo_equipment)session.get(suiluppo_equipmentImpl.class,
						primaryKey);

				if (suiluppo_equipment != null) {
					cacheResult(suiluppo_equipment);
				}
				else {
					entityCache.putResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_equipmentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_equipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return suiluppo_equipment;
	}

	/**
	 * Returns the suiluppo_equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param equip_id the primary key of the suiluppo_equipment
	 * @return the suiluppo_equipment, or <code>null</code> if a suiluppo_equipment with the primary key could not be found
	 */
	@Override
	public suiluppo_equipment fetchByPrimaryKey(long equip_id) {
		return fetchByPrimaryKey((Serializable)equip_id);
	}

	@Override
	public Map<Serializable, suiluppo_equipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, suiluppo_equipment> map = new HashMap<Serializable, suiluppo_equipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			suiluppo_equipment suiluppo_equipment = fetchByPrimaryKey(primaryKey);

			if (suiluppo_equipment != null) {
				map.put(primaryKey, suiluppo_equipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_equipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (suiluppo_equipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUILUPPO_EQUIPMENT_WHERE_PKS_IN);

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

			for (suiluppo_equipment suiluppo_equipment : (List<suiluppo_equipment>)q.list()) {
				map.put(suiluppo_equipment.getPrimaryKeyObj(),
					suiluppo_equipment);

				cacheResult(suiluppo_equipment);

				uncachedPrimaryKeys.remove(suiluppo_equipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(suiluppo_equipmentModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_equipmentImpl.class, primaryKey, nullModel);
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
	 * Returns all the suiluppo_equipments.
	 *
	 * @return the suiluppo_equipments
	 */
	@Override
	public List<suiluppo_equipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the suiluppo_equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_equipments
	 * @param end the upper bound of the range of suiluppo_equipments (not inclusive)
	 * @return the range of suiluppo_equipments
	 */
	@Override
	public List<suiluppo_equipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_equipments
	 * @param end the upper bound of the range of suiluppo_equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of suiluppo_equipments
	 */
	@Override
	public List<suiluppo_equipment> findAll(int start, int end,
		OrderByComparator<suiluppo_equipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_equipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_equipments
	 * @param end the upper bound of the range of suiluppo_equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of suiluppo_equipments
	 */
	@Override
	public List<suiluppo_equipment> findAll(int start, int end,
		OrderByComparator<suiluppo_equipment> orderByComparator,
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

		List<suiluppo_equipment> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_equipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUILUPPO_EQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUILUPPO_EQUIPMENT;

				if (pagination) {
					sql = sql.concat(suiluppo_equipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<suiluppo_equipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_equipment>)QueryUtil.list(q,
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
	 * Removes all the suiluppo_equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (suiluppo_equipment suiluppo_equipment : findAll()) {
			remove(suiluppo_equipment);
		}
	}

	/**
	 * Returns the number of suiluppo_equipments.
	 *
	 * @return the number of suiluppo_equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUILUPPO_EQUIPMENT);

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
		return suiluppo_equipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the suiluppo_equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(suiluppo_equipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SUILUPPO_EQUIPMENT = "SELECT suiluppo_equipment FROM suiluppo_equipment suiluppo_equipment";
	private static final String _SQL_SELECT_SUILUPPO_EQUIPMENT_WHERE_PKS_IN = "SELECT suiluppo_equipment FROM suiluppo_equipment suiluppo_equipment WHERE equip_id IN (";
	private static final String _SQL_COUNT_SUILUPPO_EQUIPMENT = "SELECT COUNT(suiluppo_equipment) FROM suiluppo_equipment suiluppo_equipment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "suiluppo_equipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No suiluppo_equipment exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(suiluppo_equipmentPersistenceImpl.class);
}
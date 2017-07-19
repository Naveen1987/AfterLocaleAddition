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

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_roomException;
import com.daffo.suilupposervice.model.impl.suiluppo_roomImpl;
import com.daffo.suilupposervice.model.impl.suiluppo_roomModelImpl;
import com.daffo.suilupposervice.model.suiluppo_room;
import com.daffo.suilupposervice.service.persistence.suiluppo_roomPersistence;

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
 * The persistence implementation for the suiluppo_room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_roomPersistence
 * @see com.daffo.suilupposervice.service.persistence.suiluppo_roomUtil
 * @generated
 */
@ProviderType
public class suiluppo_roomPersistenceImpl extends BasePersistenceImpl<suiluppo_room>
	implements suiluppo_roomPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link suiluppo_roomUtil} to access the suiluppo_room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = suiluppo_roomImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_roomModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_roomImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_roomModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_roomImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_roomModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public suiluppo_roomPersistenceImpl() {
		setModelClass(suiluppo_room.class);
	}

	/**
	 * Caches the suiluppo_room in the entity cache if it is enabled.
	 *
	 * @param suiluppo_room the suiluppo_room
	 */
	@Override
	public void cacheResult(suiluppo_room suiluppo_room) {
		entityCache.putResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_roomImpl.class, suiluppo_room.getPrimaryKey(),
			suiluppo_room);

		suiluppo_room.resetOriginalValues();
	}

	/**
	 * Caches the suiluppo_rooms in the entity cache if it is enabled.
	 *
	 * @param suiluppo_rooms the suiluppo_rooms
	 */
	@Override
	public void cacheResult(List<suiluppo_room> suiluppo_rooms) {
		for (suiluppo_room suiluppo_room : suiluppo_rooms) {
			if (entityCache.getResult(
						suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_roomImpl.class, suiluppo_room.getPrimaryKey()) == null) {
				cacheResult(suiluppo_room);
			}
			else {
				suiluppo_room.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all suiluppo_rooms.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(suiluppo_roomImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the suiluppo_room.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(suiluppo_room suiluppo_room) {
		entityCache.removeResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_roomImpl.class, suiluppo_room.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<suiluppo_room> suiluppo_rooms) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (suiluppo_room suiluppo_room : suiluppo_rooms) {
			entityCache.removeResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_roomImpl.class, suiluppo_room.getPrimaryKey());
		}
	}

	/**
	 * Creates a new suiluppo_room with the primary key. Does not add the suiluppo_room to the database.
	 *
	 * @param roomID the primary key for the new suiluppo_room
	 * @return the new suiluppo_room
	 */
	@Override
	public suiluppo_room create(long roomID) {
		suiluppo_room suiluppo_room = new suiluppo_roomImpl();

		suiluppo_room.setNew(true);
		suiluppo_room.setPrimaryKey(roomID);

		return suiluppo_room;
	}

	/**
	 * Removes the suiluppo_room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomID the primary key of the suiluppo_room
	 * @return the suiluppo_room that was removed
	 * @throws NoSuchsuiluppo_roomException if a suiluppo_room with the primary key could not be found
	 */
	@Override
	public suiluppo_room remove(long roomID)
		throws NoSuchsuiluppo_roomException {
		return remove((Serializable)roomID);
	}

	/**
	 * Removes the suiluppo_room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the suiluppo_room
	 * @return the suiluppo_room that was removed
	 * @throws NoSuchsuiluppo_roomException if a suiluppo_room with the primary key could not be found
	 */
	@Override
	public suiluppo_room remove(Serializable primaryKey)
		throws NoSuchsuiluppo_roomException {
		Session session = null;

		try {
			session = openSession();

			suiluppo_room suiluppo_room = (suiluppo_room)session.get(suiluppo_roomImpl.class,
					primaryKey);

			if (suiluppo_room == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsuiluppo_roomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(suiluppo_room);
		}
		catch (NoSuchsuiluppo_roomException nsee) {
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
	protected suiluppo_room removeImpl(suiluppo_room suiluppo_room) {
		suiluppo_room = toUnwrappedModel(suiluppo_room);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(suiluppo_room)) {
				suiluppo_room = (suiluppo_room)session.get(suiluppo_roomImpl.class,
						suiluppo_room.getPrimaryKeyObj());
			}

			if (suiluppo_room != null) {
				session.delete(suiluppo_room);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (suiluppo_room != null) {
			clearCache(suiluppo_room);
		}

		return suiluppo_room;
	}

	@Override
	public suiluppo_room updateImpl(suiluppo_room suiluppo_room) {
		suiluppo_room = toUnwrappedModel(suiluppo_room);

		boolean isNew = suiluppo_room.isNew();

		Session session = null;

		try {
			session = openSession();

			if (suiluppo_room.isNew()) {
				session.save(suiluppo_room);

				suiluppo_room.setNew(false);
			}
			else {
				suiluppo_room = (suiluppo_room)session.merge(suiluppo_room);
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

		entityCache.putResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_roomImpl.class, suiluppo_room.getPrimaryKey(),
			suiluppo_room, false);

		suiluppo_room.resetOriginalValues();

		return suiluppo_room;
	}

	protected suiluppo_room toUnwrappedModel(suiluppo_room suiluppo_room) {
		if (suiluppo_room instanceof suiluppo_roomImpl) {
			return suiluppo_room;
		}

		suiluppo_roomImpl suiluppo_roomImpl = new suiluppo_roomImpl();

		suiluppo_roomImpl.setNew(suiluppo_room.isNew());
		suiluppo_roomImpl.setPrimaryKey(suiluppo_room.getPrimaryKey());

		suiluppo_roomImpl.setRoomID(suiluppo_room.getRoomID());
		suiluppo_roomImpl.setRoom_name(suiluppo_room.getRoom_name());
		suiluppo_roomImpl.setRoom_description(suiluppo_room.getRoom_description());

		return suiluppo_roomImpl;
	}

	/**
	 * Returns the suiluppo_room with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_room
	 * @return the suiluppo_room
	 * @throws NoSuchsuiluppo_roomException if a suiluppo_room with the primary key could not be found
	 */
	@Override
	public suiluppo_room findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsuiluppo_roomException {
		suiluppo_room suiluppo_room = fetchByPrimaryKey(primaryKey);

		if (suiluppo_room == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsuiluppo_roomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return suiluppo_room;
	}

	/**
	 * Returns the suiluppo_room with the primary key or throws a {@link NoSuchsuiluppo_roomException} if it could not be found.
	 *
	 * @param roomID the primary key of the suiluppo_room
	 * @return the suiluppo_room
	 * @throws NoSuchsuiluppo_roomException if a suiluppo_room with the primary key could not be found
	 */
	@Override
	public suiluppo_room findByPrimaryKey(long roomID)
		throws NoSuchsuiluppo_roomException {
		return findByPrimaryKey((Serializable)roomID);
	}

	/**
	 * Returns the suiluppo_room with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_room
	 * @return the suiluppo_room, or <code>null</code> if a suiluppo_room with the primary key could not be found
	 */
	@Override
	public suiluppo_room fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_roomImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		suiluppo_room suiluppo_room = (suiluppo_room)serializable;

		if (suiluppo_room == null) {
			Session session = null;

			try {
				session = openSession();

				suiluppo_room = (suiluppo_room)session.get(suiluppo_roomImpl.class,
						primaryKey);

				if (suiluppo_room != null) {
					cacheResult(suiluppo_room);
				}
				else {
					entityCache.putResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_roomImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_roomImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return suiluppo_room;
	}

	/**
	 * Returns the suiluppo_room with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roomID the primary key of the suiluppo_room
	 * @return the suiluppo_room, or <code>null</code> if a suiluppo_room with the primary key could not be found
	 */
	@Override
	public suiluppo_room fetchByPrimaryKey(long roomID) {
		return fetchByPrimaryKey((Serializable)roomID);
	}

	@Override
	public Map<Serializable, suiluppo_room> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, suiluppo_room> map = new HashMap<Serializable, suiluppo_room>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			suiluppo_room suiluppo_room = fetchByPrimaryKey(primaryKey);

			if (suiluppo_room != null) {
				map.put(primaryKey, suiluppo_room);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_roomImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (suiluppo_room)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUILUPPO_ROOM_WHERE_PKS_IN);

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

			for (suiluppo_room suiluppo_room : (List<suiluppo_room>)q.list()) {
				map.put(suiluppo_room.getPrimaryKeyObj(), suiluppo_room);

				cacheResult(suiluppo_room);

				uncachedPrimaryKeys.remove(suiluppo_room.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(suiluppo_roomModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_roomImpl.class, primaryKey, nullModel);
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
	 * Returns all the suiluppo_rooms.
	 *
	 * @return the suiluppo_rooms
	 */
	@Override
	public List<suiluppo_room> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the suiluppo_rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_rooms
	 * @param end the upper bound of the range of suiluppo_rooms (not inclusive)
	 * @return the range of suiluppo_rooms
	 */
	@Override
	public List<suiluppo_room> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_rooms
	 * @param end the upper bound of the range of suiluppo_rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of suiluppo_rooms
	 */
	@Override
	public List<suiluppo_room> findAll(int start, int end,
		OrderByComparator<suiluppo_room> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_rooms
	 * @param end the upper bound of the range of suiluppo_rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of suiluppo_rooms
	 */
	@Override
	public List<suiluppo_room> findAll(int start, int end,
		OrderByComparator<suiluppo_room> orderByComparator,
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

		List<suiluppo_room> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_room>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUILUPPO_ROOM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUILUPPO_ROOM;

				if (pagination) {
					sql = sql.concat(suiluppo_roomModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<suiluppo_room>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_room>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the suiluppo_rooms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (suiluppo_room suiluppo_room : findAll()) {
			remove(suiluppo_room);
		}
	}

	/**
	 * Returns the number of suiluppo_rooms.
	 *
	 * @return the number of suiluppo_rooms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUILUPPO_ROOM);

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
		return suiluppo_roomModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the suiluppo_room persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(suiluppo_roomImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SUILUPPO_ROOM = "SELECT suiluppo_room FROM suiluppo_room suiluppo_room";
	private static final String _SQL_SELECT_SUILUPPO_ROOM_WHERE_PKS_IN = "SELECT suiluppo_room FROM suiluppo_room suiluppo_room WHERE roomID IN (";
	private static final String _SQL_COUNT_SUILUPPO_ROOM = "SELECT COUNT(suiluppo_room) FROM suiluppo_room suiluppo_room";
	private static final String _ORDER_BY_ENTITY_ALIAS = "suiluppo_room.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No suiluppo_room exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(suiluppo_roomPersistenceImpl.class);
}
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

package com.roomservice.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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

import com.roomservice.exception.NoSuchBookedEquipmentException;

import com.roomservice.model.BookedEquipment;
import com.roomservice.model.impl.BookedEquipmentImpl;
import com.roomservice.model.impl.BookedEquipmentModelImpl;

import com.roomservice.service.persistence.BookedEquipmentPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the booked equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookedEquipmentPersistence
 * @see com.roomservice.service.persistence.BookedEquipmentUtil
 * @generated
 */
@ProviderType
public class BookedEquipmentPersistenceImpl extends BasePersistenceImpl<BookedEquipment>
	implements BookedEquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BookedEquipmentUtil} to access the booked equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BookedEquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentModelImpl.FINDER_CACHE_ENABLED,
			BookedEquipmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentModelImpl.FINDER_CACHE_ENABLED,
			BookedEquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BookedEquipmentPersistenceImpl() {
		setModelClass(BookedEquipment.class);
	}

	/**
	 * Caches the booked equipment in the entity cache if it is enabled.
	 *
	 * @param bookedEquipment the booked equipment
	 */
	@Override
	public void cacheResult(BookedEquipment bookedEquipment) {
		entityCache.putResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentImpl.class, bookedEquipment.getPrimaryKey(),
			bookedEquipment);

		bookedEquipment.resetOriginalValues();
	}

	/**
	 * Caches the booked equipments in the entity cache if it is enabled.
	 *
	 * @param bookedEquipments the booked equipments
	 */
	@Override
	public void cacheResult(List<BookedEquipment> bookedEquipments) {
		for (BookedEquipment bookedEquipment : bookedEquipments) {
			if (entityCache.getResult(
						BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						BookedEquipmentImpl.class,
						bookedEquipment.getPrimaryKey()) == null) {
				cacheResult(bookedEquipment);
			}
			else {
				bookedEquipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all booked equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BookedEquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the booked equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BookedEquipment bookedEquipment) {
		entityCache.removeResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentImpl.class, bookedEquipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BookedEquipment> bookedEquipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BookedEquipment bookedEquipment : bookedEquipments) {
			entityCache.removeResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				BookedEquipmentImpl.class, bookedEquipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new booked equipment with the primary key. Does not add the booked equipment to the database.
	 *
	 * @param booked_equip_id the primary key for the new booked equipment
	 * @return the new booked equipment
	 */
	@Override
	public BookedEquipment create(long booked_equip_id) {
		BookedEquipment bookedEquipment = new BookedEquipmentImpl();

		bookedEquipment.setNew(true);
		bookedEquipment.setPrimaryKey(booked_equip_id);

		return bookedEquipment;
	}

	/**
	 * Removes the booked equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param booked_equip_id the primary key of the booked equipment
	 * @return the booked equipment that was removed
	 * @throws NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	 */
	@Override
	public BookedEquipment remove(long booked_equip_id)
		throws NoSuchBookedEquipmentException {
		return remove((Serializable)booked_equip_id);
	}

	/**
	 * Removes the booked equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the booked equipment
	 * @return the booked equipment that was removed
	 * @throws NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	 */
	@Override
	public BookedEquipment remove(Serializable primaryKey)
		throws NoSuchBookedEquipmentException {
		Session session = null;

		try {
			session = openSession();

			BookedEquipment bookedEquipment = (BookedEquipment)session.get(BookedEquipmentImpl.class,
					primaryKey);

			if (bookedEquipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBookedEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bookedEquipment);
		}
		catch (NoSuchBookedEquipmentException nsee) {
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
	protected BookedEquipment removeImpl(BookedEquipment bookedEquipment) {
		bookedEquipment = toUnwrappedModel(bookedEquipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bookedEquipment)) {
				bookedEquipment = (BookedEquipment)session.get(BookedEquipmentImpl.class,
						bookedEquipment.getPrimaryKeyObj());
			}

			if (bookedEquipment != null) {
				session.delete(bookedEquipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bookedEquipment != null) {
			clearCache(bookedEquipment);
		}

		return bookedEquipment;
	}

	@Override
	public BookedEquipment updateImpl(BookedEquipment bookedEquipment) {
		bookedEquipment = toUnwrappedModel(bookedEquipment);

		boolean isNew = bookedEquipment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bookedEquipment.isNew()) {
				session.save(bookedEquipment);

				bookedEquipment.setNew(false);
			}
			else {
				bookedEquipment = (BookedEquipment)session.merge(bookedEquipment);
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

		entityCache.putResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
			BookedEquipmentImpl.class, bookedEquipment.getPrimaryKey(),
			bookedEquipment, false);

		bookedEquipment.resetOriginalValues();

		return bookedEquipment;
	}

	protected BookedEquipment toUnwrappedModel(BookedEquipment bookedEquipment) {
		if (bookedEquipment instanceof BookedEquipmentImpl) {
			return bookedEquipment;
		}

		BookedEquipmentImpl bookedEquipmentImpl = new BookedEquipmentImpl();

		bookedEquipmentImpl.setNew(bookedEquipment.isNew());
		bookedEquipmentImpl.setPrimaryKey(bookedEquipment.getPrimaryKey());

		bookedEquipmentImpl.setBooked_equip_id(bookedEquipment.getBooked_equip_id());
		bookedEquipmentImpl.setEquip_id(bookedEquipment.getEquip_id());
		bookedEquipmentImpl.setCourse_id(bookedEquipment.getCourse_id());
		bookedEquipmentImpl.setEquip_quantity(bookedEquipment.getEquip_quantity());
		bookedEquipmentImpl.setBooked_equip_status(bookedEquipment.isBooked_equip_status());
		bookedEquipmentImpl.setBooked_equip_date(bookedEquipment.getBooked_equip_date());

		return bookedEquipmentImpl;
	}

	/**
	 * Returns the booked equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the booked equipment
	 * @return the booked equipment
	 * @throws NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	 */
	@Override
	public BookedEquipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBookedEquipmentException {
		BookedEquipment bookedEquipment = fetchByPrimaryKey(primaryKey);

		if (bookedEquipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBookedEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bookedEquipment;
	}

	/**
	 * Returns the booked equipment with the primary key or throws a {@link NoSuchBookedEquipmentException} if it could not be found.
	 *
	 * @param booked_equip_id the primary key of the booked equipment
	 * @return the booked equipment
	 * @throws NoSuchBookedEquipmentException if a booked equipment with the primary key could not be found
	 */
	@Override
	public BookedEquipment findByPrimaryKey(long booked_equip_id)
		throws NoSuchBookedEquipmentException {
		return findByPrimaryKey((Serializable)booked_equip_id);
	}

	/**
	 * Returns the booked equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the booked equipment
	 * @return the booked equipment, or <code>null</code> if a booked equipment with the primary key could not be found
	 */
	@Override
	public BookedEquipment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
				BookedEquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		BookedEquipment bookedEquipment = (BookedEquipment)serializable;

		if (bookedEquipment == null) {
			Session session = null;

			try {
				session = openSession();

				bookedEquipment = (BookedEquipment)session.get(BookedEquipmentImpl.class,
						primaryKey);

				if (bookedEquipment != null) {
					cacheResult(bookedEquipment);
				}
				else {
					entityCache.putResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
						BookedEquipmentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					BookedEquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bookedEquipment;
	}

	/**
	 * Returns the booked equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param booked_equip_id the primary key of the booked equipment
	 * @return the booked equipment, or <code>null</code> if a booked equipment with the primary key could not be found
	 */
	@Override
	public BookedEquipment fetchByPrimaryKey(long booked_equip_id) {
		return fetchByPrimaryKey((Serializable)booked_equip_id);
	}

	@Override
	public Map<Serializable, BookedEquipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, BookedEquipment> map = new HashMap<Serializable, BookedEquipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			BookedEquipment bookedEquipment = fetchByPrimaryKey(primaryKey);

			if (bookedEquipment != null) {
				map.put(primaryKey, bookedEquipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					BookedEquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (BookedEquipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BOOKEDEQUIPMENT_WHERE_PKS_IN);

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

			for (BookedEquipment bookedEquipment : (List<BookedEquipment>)q.list()) {
				map.put(bookedEquipment.getPrimaryKeyObj(), bookedEquipment);

				cacheResult(bookedEquipment);

				uncachedPrimaryKeys.remove(bookedEquipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(BookedEquipmentModelImpl.ENTITY_CACHE_ENABLED,
					BookedEquipmentImpl.class, primaryKey, nullModel);
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
	 * Returns all the booked equipments.
	 *
	 * @return the booked equipments
	 */
	@Override
	public List<BookedEquipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the booked equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of booked equipments
	 * @param end the upper bound of the range of booked equipments (not inclusive)
	 * @return the range of booked equipments
	 */
	@Override
	public List<BookedEquipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the booked equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of booked equipments
	 * @param end the upper bound of the range of booked equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of booked equipments
	 */
	@Override
	public List<BookedEquipment> findAll(int start, int end,
		OrderByComparator<BookedEquipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the booked equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of booked equipments
	 * @param end the upper bound of the range of booked equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of booked equipments
	 */
	@Override
	public List<BookedEquipment> findAll(int start, int end,
		OrderByComparator<BookedEquipment> orderByComparator,
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

		List<BookedEquipment> list = null;

		if (retrieveFromCache) {
			list = (List<BookedEquipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BOOKEDEQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOOKEDEQUIPMENT;

				if (pagination) {
					sql = sql.concat(BookedEquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BookedEquipment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BookedEquipment>)QueryUtil.list(q,
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
	 * Removes all the booked equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BookedEquipment bookedEquipment : findAll()) {
			remove(bookedEquipment);
		}
	}

	/**
	 * Returns the number of booked equipments.
	 *
	 * @return the number of booked equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BOOKEDEQUIPMENT);

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
		return BookedEquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the booked equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(BookedEquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_BOOKEDEQUIPMENT = "SELECT bookedEquipment FROM BookedEquipment bookedEquipment";
	private static final String _SQL_SELECT_BOOKEDEQUIPMENT_WHERE_PKS_IN = "SELECT bookedEquipment FROM BookedEquipment bookedEquipment WHERE booked_equip_id IN (";
	private static final String _SQL_COUNT_BOOKEDEQUIPMENT = "SELECT COUNT(bookedEquipment) FROM BookedEquipment bookedEquipment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bookedEquipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BookedEquipment exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(BookedEquipmentPersistenceImpl.class);
}
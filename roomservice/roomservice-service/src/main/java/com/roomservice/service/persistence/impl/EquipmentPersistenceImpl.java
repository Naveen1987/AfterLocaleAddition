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

import com.roomservice.exception.NoSuchEquipmentException;

import com.roomservice.model.Equipment;
import com.roomservice.model.impl.EquipmentImpl;
import com.roomservice.model.impl.EquipmentModelImpl;

import com.roomservice.service.persistence.EquipmentPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EquipmentPersistence
 * @see com.roomservice.service.persistence.EquipmentUtil
 * @generated
 */
@ProviderType
public class EquipmentPersistenceImpl extends BasePersistenceImpl<Equipment>
	implements EquipmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EquipmentUtil} to access the equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EquipmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentModelImpl.FINDER_CACHE_ENABLED, EquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentModelImpl.FINDER_CACHE_ENABLED, EquipmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EquipmentPersistenceImpl() {
		setModelClass(Equipment.class);
	}

	/**
	 * Caches the equipment in the entity cache if it is enabled.
	 *
	 * @param equipment the equipment
	 */
	@Override
	public void cacheResult(Equipment equipment) {
		entityCache.putResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentImpl.class, equipment.getPrimaryKey(), equipment);

		equipment.resetOriginalValues();
	}

	/**
	 * Caches the equipments in the entity cache if it is enabled.
	 *
	 * @param equipments the equipments
	 */
	@Override
	public void cacheResult(List<Equipment> equipments) {
		for (Equipment equipment : equipments) {
			if (entityCache.getResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
						EquipmentImpl.class, equipment.getPrimaryKey()) == null) {
				cacheResult(equipment);
			}
			else {
				equipment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all equipments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EquipmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the equipment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Equipment equipment) {
		entityCache.removeResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentImpl.class, equipment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Equipment> equipments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Equipment equipment : equipments) {
			entityCache.removeResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
				EquipmentImpl.class, equipment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new equipment with the primary key. Does not add the equipment to the database.
	 *
	 * @param equip_id the primary key for the new equipment
	 * @return the new equipment
	 */
	@Override
	public Equipment create(long equip_id) {
		Equipment equipment = new EquipmentImpl();

		equipment.setNew(true);
		equipment.setPrimaryKey(equip_id);

		return equipment;
	}

	/**
	 * Removes the equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param equip_id the primary key of the equipment
	 * @return the equipment that was removed
	 * @throws NoSuchEquipmentException if a equipment with the primary key could not be found
	 */
	@Override
	public Equipment remove(long equip_id) throws NoSuchEquipmentException {
		return remove((Serializable)equip_id);
	}

	/**
	 * Removes the equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the equipment
	 * @return the equipment that was removed
	 * @throws NoSuchEquipmentException if a equipment with the primary key could not be found
	 */
	@Override
	public Equipment remove(Serializable primaryKey)
		throws NoSuchEquipmentException {
		Session session = null;

		try {
			session = openSession();

			Equipment equipment = (Equipment)session.get(EquipmentImpl.class,
					primaryKey);

			if (equipment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(equipment);
		}
		catch (NoSuchEquipmentException nsee) {
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
	protected Equipment removeImpl(Equipment equipment) {
		equipment = toUnwrappedModel(equipment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(equipment)) {
				equipment = (Equipment)session.get(EquipmentImpl.class,
						equipment.getPrimaryKeyObj());
			}

			if (equipment != null) {
				session.delete(equipment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (equipment != null) {
			clearCache(equipment);
		}

		return equipment;
	}

	@Override
	public Equipment updateImpl(Equipment equipment) {
		equipment = toUnwrappedModel(equipment);

		boolean isNew = equipment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (equipment.isNew()) {
				session.save(equipment);

				equipment.setNew(false);
			}
			else {
				equipment = (Equipment)session.merge(equipment);
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

		entityCache.putResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
			EquipmentImpl.class, equipment.getPrimaryKey(), equipment, false);

		equipment.resetOriginalValues();

		return equipment;
	}

	protected Equipment toUnwrappedModel(Equipment equipment) {
		if (equipment instanceof EquipmentImpl) {
			return equipment;
		}

		EquipmentImpl equipmentImpl = new EquipmentImpl();

		equipmentImpl.setNew(equipment.isNew());
		equipmentImpl.setPrimaryKey(equipment.getPrimaryKey());

		equipmentImpl.setEquip_id(equipment.getEquip_id());
		equipmentImpl.setEquipment_name(equipment.getEquipment_name());
		equipmentImpl.setEquip_quantity(equipment.getEquip_quantity());
		equipmentImpl.setEquip_description(equipment.getEquip_description());
		equipmentImpl.setEquip_status(equipment.isEquip_status());

		return equipmentImpl;
	}

	/**
	 * Returns the equipment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the equipment
	 * @return the equipment
	 * @throws NoSuchEquipmentException if a equipment with the primary key could not be found
	 */
	@Override
	public Equipment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEquipmentException {
		Equipment equipment = fetchByPrimaryKey(primaryKey);

		if (equipment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEquipmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return equipment;
	}

	/**
	 * Returns the equipment with the primary key or throws a {@link NoSuchEquipmentException} if it could not be found.
	 *
	 * @param equip_id the primary key of the equipment
	 * @return the equipment
	 * @throws NoSuchEquipmentException if a equipment with the primary key could not be found
	 */
	@Override
	public Equipment findByPrimaryKey(long equip_id)
		throws NoSuchEquipmentException {
		return findByPrimaryKey((Serializable)equip_id);
	}

	/**
	 * Returns the equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the equipment
	 * @return the equipment, or <code>null</code> if a equipment with the primary key could not be found
	 */
	@Override
	public Equipment fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
				EquipmentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Equipment equipment = (Equipment)serializable;

		if (equipment == null) {
			Session session = null;

			try {
				session = openSession();

				equipment = (Equipment)session.get(EquipmentImpl.class,
						primaryKey);

				if (equipment != null) {
					cacheResult(equipment);
				}
				else {
					entityCache.putResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
						EquipmentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
					EquipmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return equipment;
	}

	/**
	 * Returns the equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param equip_id the primary key of the equipment
	 * @return the equipment, or <code>null</code> if a equipment with the primary key could not be found
	 */
	@Override
	public Equipment fetchByPrimaryKey(long equip_id) {
		return fetchByPrimaryKey((Serializable)equip_id);
	}

	@Override
	public Map<Serializable, Equipment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Equipment> map = new HashMap<Serializable, Equipment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Equipment equipment = fetchByPrimaryKey(primaryKey);

			if (equipment != null) {
				map.put(primaryKey, equipment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
					EquipmentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Equipment)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EQUIPMENT_WHERE_PKS_IN);

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

			for (Equipment equipment : (List<Equipment>)q.list()) {
				map.put(equipment.getPrimaryKeyObj(), equipment);

				cacheResult(equipment);

				uncachedPrimaryKeys.remove(equipment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(EquipmentModelImpl.ENTITY_CACHE_ENABLED,
					EquipmentImpl.class, primaryKey, nullModel);
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
	 * Returns all the equipments.
	 *
	 * @return the equipments
	 */
	@Override
	public List<Equipment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of equipments
	 * @param end the upper bound of the range of equipments (not inclusive)
	 * @return the range of equipments
	 */
	@Override
	public List<Equipment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of equipments
	 * @param end the upper bound of the range of equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of equipments
	 */
	@Override
	public List<Equipment> findAll(int start, int end,
		OrderByComparator<Equipment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of equipments
	 * @param end the upper bound of the range of equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of equipments
	 */
	@Override
	public List<Equipment> findAll(int start, int end,
		OrderByComparator<Equipment> orderByComparator,
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

		List<Equipment> list = null;

		if (retrieveFromCache) {
			list = (List<Equipment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EQUIPMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EQUIPMENT;

				if (pagination) {
					sql = sql.concat(EquipmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Equipment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Equipment>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the equipments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Equipment equipment : findAll()) {
			remove(equipment);
		}
	}

	/**
	 * Returns the number of equipments.
	 *
	 * @return the number of equipments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EQUIPMENT);

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
		return EquipmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the equipment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(EquipmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_EQUIPMENT = "SELECT equipment FROM Equipment equipment";
	private static final String _SQL_SELECT_EQUIPMENT_WHERE_PKS_IN = "SELECT equipment FROM Equipment equipment WHERE equip_id IN (";
	private static final String _SQL_COUNT_EQUIPMENT = "SELECT COUNT(equipment) FROM Equipment equipment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "equipment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Equipment exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(EquipmentPersistenceImpl.class);
}
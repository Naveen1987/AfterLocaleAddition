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

package com.daffo.prontuario_drugservice.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.prontuario_drugservice.exception.NoSuchprontuario_drugException;
import com.daffo.prontuario_drugservice.model.impl.prontuario_drugImpl;
import com.daffo.prontuario_drugservice.model.impl.prontuario_drugModelImpl;
import com.daffo.prontuario_drugservice.model.prontuario_drug;
import com.daffo.prontuario_drugservice.service.persistence.prontuario_drugPersistence;

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
 * The persistence implementation for the prontuario_drug service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see prontuario_drugPersistence
 * @see com.daffo.prontuario_drugservice.service.persistence.prontuario_drugUtil
 * @generated
 */
@ProviderType
public class prontuario_drugPersistenceImpl extends BasePersistenceImpl<prontuario_drug>
	implements prontuario_drugPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link prontuario_drugUtil} to access the prontuario_drug persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = prontuario_drugImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugModelImpl.FINDER_CACHE_ENABLED,
			prontuario_drugImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugModelImpl.FINDER_CACHE_ENABLED,
			prontuario_drugImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public prontuario_drugPersistenceImpl() {
		setModelClass(prontuario_drug.class);
	}

	/**
	 * Caches the prontuario_drug in the entity cache if it is enabled.
	 *
	 * @param prontuario_drug the prontuario_drug
	 */
	@Override
	public void cacheResult(prontuario_drug prontuario_drug) {
		entityCache.putResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugImpl.class, prontuario_drug.getPrimaryKey(),
			prontuario_drug);

		prontuario_drug.resetOriginalValues();
	}

	/**
	 * Caches the prontuario_drugs in the entity cache if it is enabled.
	 *
	 * @param prontuario_drugs the prontuario_drugs
	 */
	@Override
	public void cacheResult(List<prontuario_drug> prontuario_drugs) {
		for (prontuario_drug prontuario_drug : prontuario_drugs) {
			if (entityCache.getResult(
						prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
						prontuario_drugImpl.class,
						prontuario_drug.getPrimaryKey()) == null) {
				cacheResult(prontuario_drug);
			}
			else {
				prontuario_drug.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all prontuario_drugs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(prontuario_drugImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the prontuario_drug.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(prontuario_drug prontuario_drug) {
		entityCache.removeResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugImpl.class, prontuario_drug.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<prontuario_drug> prontuario_drugs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (prontuario_drug prontuario_drug : prontuario_drugs) {
			entityCache.removeResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
				prontuario_drugImpl.class, prontuario_drug.getPrimaryKey());
		}
	}

	/**
	 * Creates a new prontuario_drug with the primary key. Does not add the prontuario_drug to the database.
	 *
	 * @param drug_id the primary key for the new prontuario_drug
	 * @return the new prontuario_drug
	 */
	@Override
	public prontuario_drug create(long drug_id) {
		prontuario_drug prontuario_drug = new prontuario_drugImpl();

		prontuario_drug.setNew(true);
		prontuario_drug.setPrimaryKey(drug_id);

		return prontuario_drug;
	}

	/**
	 * Removes the prontuario_drug with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drug_id the primary key of the prontuario_drug
	 * @return the prontuario_drug that was removed
	 * @throws NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	 */
	@Override
	public prontuario_drug remove(long drug_id)
		throws NoSuchprontuario_drugException {
		return remove((Serializable)drug_id);
	}

	/**
	 * Removes the prontuario_drug with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the prontuario_drug
	 * @return the prontuario_drug that was removed
	 * @throws NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	 */
	@Override
	public prontuario_drug remove(Serializable primaryKey)
		throws NoSuchprontuario_drugException {
		Session session = null;

		try {
			session = openSession();

			prontuario_drug prontuario_drug = (prontuario_drug)session.get(prontuario_drugImpl.class,
					primaryKey);

			if (prontuario_drug == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchprontuario_drugException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(prontuario_drug);
		}
		catch (NoSuchprontuario_drugException nsee) {
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
	protected prontuario_drug removeImpl(prontuario_drug prontuario_drug) {
		prontuario_drug = toUnwrappedModel(prontuario_drug);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(prontuario_drug)) {
				prontuario_drug = (prontuario_drug)session.get(prontuario_drugImpl.class,
						prontuario_drug.getPrimaryKeyObj());
			}

			if (prontuario_drug != null) {
				session.delete(prontuario_drug);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (prontuario_drug != null) {
			clearCache(prontuario_drug);
		}

		return prontuario_drug;
	}

	@Override
	public prontuario_drug updateImpl(prontuario_drug prontuario_drug) {
		prontuario_drug = toUnwrappedModel(prontuario_drug);

		boolean isNew = prontuario_drug.isNew();

		Session session = null;

		try {
			session = openSession();

			if (prontuario_drug.isNew()) {
				session.save(prontuario_drug);

				prontuario_drug.setNew(false);
			}
			else {
				prontuario_drug = (prontuario_drug)session.merge(prontuario_drug);
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

		entityCache.putResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
			prontuario_drugImpl.class, prontuario_drug.getPrimaryKey(),
			prontuario_drug, false);

		prontuario_drug.resetOriginalValues();

		return prontuario_drug;
	}

	protected prontuario_drug toUnwrappedModel(prontuario_drug prontuario_drug) {
		if (prontuario_drug instanceof prontuario_drugImpl) {
			return prontuario_drug;
		}

		prontuario_drugImpl prontuario_drugImpl = new prontuario_drugImpl();

		prontuario_drugImpl.setNew(prontuario_drug.isNew());
		prontuario_drugImpl.setPrimaryKey(prontuario_drug.getPrimaryKey());

		prontuario_drugImpl.setDrug_id(prontuario_drug.getDrug_id());
		prontuario_drugImpl.setGruppo(prontuario_drug.getGruppo());
		prontuario_drugImpl.setSottoGruppo(prontuario_drug.getSottoGruppo());
		prontuario_drugImpl.setCodice(prontuario_drug.getCodice());
		prontuario_drugImpl.setPrincipio_Attivo(prontuario_drug.getPrincipio_Attivo());
		prontuario_drugImpl.setNome_Commerciale(prontuario_drug.getNome_Commerciale());

		return prontuario_drugImpl;
	}

	/**
	 * Returns the prontuario_drug with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the prontuario_drug
	 * @return the prontuario_drug
	 * @throws NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	 */
	@Override
	public prontuario_drug findByPrimaryKey(Serializable primaryKey)
		throws NoSuchprontuario_drugException {
		prontuario_drug prontuario_drug = fetchByPrimaryKey(primaryKey);

		if (prontuario_drug == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchprontuario_drugException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return prontuario_drug;
	}

	/**
	 * Returns the prontuario_drug with the primary key or throws a {@link NoSuchprontuario_drugException} if it could not be found.
	 *
	 * @param drug_id the primary key of the prontuario_drug
	 * @return the prontuario_drug
	 * @throws NoSuchprontuario_drugException if a prontuario_drug with the primary key could not be found
	 */
	@Override
	public prontuario_drug findByPrimaryKey(long drug_id)
		throws NoSuchprontuario_drugException {
		return findByPrimaryKey((Serializable)drug_id);
	}

	/**
	 * Returns the prontuario_drug with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the prontuario_drug
	 * @return the prontuario_drug, or <code>null</code> if a prontuario_drug with the primary key could not be found
	 */
	@Override
	public prontuario_drug fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
				prontuario_drugImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		prontuario_drug prontuario_drug = (prontuario_drug)serializable;

		if (prontuario_drug == null) {
			Session session = null;

			try {
				session = openSession();

				prontuario_drug = (prontuario_drug)session.get(prontuario_drugImpl.class,
						primaryKey);

				if (prontuario_drug != null) {
					cacheResult(prontuario_drug);
				}
				else {
					entityCache.putResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
						prontuario_drugImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
					prontuario_drugImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return prontuario_drug;
	}

	/**
	 * Returns the prontuario_drug with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param drug_id the primary key of the prontuario_drug
	 * @return the prontuario_drug, or <code>null</code> if a prontuario_drug with the primary key could not be found
	 */
	@Override
	public prontuario_drug fetchByPrimaryKey(long drug_id) {
		return fetchByPrimaryKey((Serializable)drug_id);
	}

	@Override
	public Map<Serializable, prontuario_drug> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, prontuario_drug> map = new HashMap<Serializable, prontuario_drug>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			prontuario_drug prontuario_drug = fetchByPrimaryKey(primaryKey);

			if (prontuario_drug != null) {
				map.put(primaryKey, prontuario_drug);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
					prontuario_drugImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (prontuario_drug)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRONTUARIO_DRUG_WHERE_PKS_IN);

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

			for (prontuario_drug prontuario_drug : (List<prontuario_drug>)q.list()) {
				map.put(prontuario_drug.getPrimaryKeyObj(), prontuario_drug);

				cacheResult(prontuario_drug);

				uncachedPrimaryKeys.remove(prontuario_drug.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(prontuario_drugModelImpl.ENTITY_CACHE_ENABLED,
					prontuario_drugImpl.class, primaryKey, nullModel);
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
	 * Returns all the prontuario_drugs.
	 *
	 * @return the prontuario_drugs
	 */
	@Override
	public List<prontuario_drug> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the prontuario_drugs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prontuario_drugs
	 * @param end the upper bound of the range of prontuario_drugs (not inclusive)
	 * @return the range of prontuario_drugs
	 */
	@Override
	public List<prontuario_drug> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the prontuario_drugs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prontuario_drugs
	 * @param end the upper bound of the range of prontuario_drugs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of prontuario_drugs
	 */
	@Override
	public List<prontuario_drug> findAll(int start, int end,
		OrderByComparator<prontuario_drug> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the prontuario_drugs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prontuario_drugModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of prontuario_drugs
	 * @param end the upper bound of the range of prontuario_drugs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of prontuario_drugs
	 */
	@Override
	public List<prontuario_drug> findAll(int start, int end,
		OrderByComparator<prontuario_drug> orderByComparator,
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

		List<prontuario_drug> list = null;

		if (retrieveFromCache) {
			list = (List<prontuario_drug>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRONTUARIO_DRUG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRONTUARIO_DRUG;

				if (pagination) {
					sql = sql.concat(prontuario_drugModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<prontuario_drug>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<prontuario_drug>)QueryUtil.list(q,
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
	 * Removes all the prontuario_drugs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (prontuario_drug prontuario_drug : findAll()) {
			remove(prontuario_drug);
		}
	}

	/**
	 * Returns the number of prontuario_drugs.
	 *
	 * @return the number of prontuario_drugs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRONTUARIO_DRUG);

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
		return prontuario_drugModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the prontuario_drug persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(prontuario_drugImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PRONTUARIO_DRUG = "SELECT prontuario_drug FROM prontuario_drug prontuario_drug";
	private static final String _SQL_SELECT_PRONTUARIO_DRUG_WHERE_PKS_IN = "SELECT prontuario_drug FROM prontuario_drug prontuario_drug WHERE drug_id IN (";
	private static final String _SQL_COUNT_PRONTUARIO_DRUG = "SELECT COUNT(prontuario_drug) FROM prontuario_drug prontuario_drug";
	private static final String _ORDER_BY_ENTITY_ALIAS = "prontuario_drug.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No prontuario_drug exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(prontuario_drugPersistenceImpl.class);
}
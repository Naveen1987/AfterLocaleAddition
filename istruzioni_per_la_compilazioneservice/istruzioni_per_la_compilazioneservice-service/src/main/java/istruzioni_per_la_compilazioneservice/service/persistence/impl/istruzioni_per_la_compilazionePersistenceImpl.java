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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import istruzioni_per_la_compilazioneservice.exception.NoSuchistruzioni_per_la_compilazioneException;

import istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazioneImpl;
import istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazioneModelImpl;

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione;

import istruzioni_per_la_compilazioneservice.service.persistence.istruzioni_per_la_compilazionePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the istruzioni_per_la_compilazione service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazionePersistence
 * @see istruzioni_per_la_compilazioneservice.service.persistence.istruzioni_per_la_compilazioneUtil
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazionePersistenceImpl
	extends BasePersistenceImpl<istruzioni_per_la_compilazione>
	implements istruzioni_per_la_compilazionePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link istruzioni_per_la_compilazioneUtil} to access the istruzioni_per_la_compilazione persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = istruzioni_per_la_compilazioneImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazioneModelImpl.FINDER_CACHE_ENABLED,
			istruzioni_per_la_compilazioneImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazioneModelImpl.FINDER_CACHE_ENABLED,
			istruzioni_per_la_compilazioneImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazioneModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public istruzioni_per_la_compilazionePersistenceImpl() {
		setModelClass(istruzioni_per_la_compilazione.class);
	}

	/**
	 * Caches the istruzioni_per_la_compilazione in the entity cache if it is enabled.
	 *
	 * @param istruzioni_per_la_compilazione the istruzioni_per_la_compilazione
	 */
	@Override
	public void cacheResult(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		entityCache.putResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazioneImpl.class,
			istruzioni_per_la_compilazione.getPrimaryKey(),
			istruzioni_per_la_compilazione);

		istruzioni_per_la_compilazione.resetOriginalValues();
	}

	/**
	 * Caches the istruzioni_per_la_compilaziones in the entity cache if it is enabled.
	 *
	 * @param istruzioni_per_la_compilaziones the istruzioni_per_la_compilaziones
	 */
	@Override
	public void cacheResult(
		List<istruzioni_per_la_compilazione> istruzioni_per_la_compilaziones) {
		for (istruzioni_per_la_compilazione istruzioni_per_la_compilazione : istruzioni_per_la_compilaziones) {
			if (entityCache.getResult(
						istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
						istruzioni_per_la_compilazioneImpl.class,
						istruzioni_per_la_compilazione.getPrimaryKey()) == null) {
				cacheResult(istruzioni_per_la_compilazione);
			}
			else {
				istruzioni_per_la_compilazione.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all istruzioni_per_la_compilaziones.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(istruzioni_per_la_compilazioneImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the istruzioni_per_la_compilazione.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		entityCache.removeResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazioneImpl.class,
			istruzioni_per_la_compilazione.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<istruzioni_per_la_compilazione> istruzioni_per_la_compilaziones) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (istruzioni_per_la_compilazione istruzioni_per_la_compilazione : istruzioni_per_la_compilaziones) {
			entityCache.removeResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
				istruzioni_per_la_compilazioneImpl.class,
				istruzioni_per_la_compilazione.getPrimaryKey());
		}
	}

	/**
	 * Creates a new istruzioni_per_la_compilazione with the primary key. Does not add the istruzioni_per_la_compilazione to the database.
	 *
	 * @param Istruzioni_per_id the primary key for the new istruzioni_per_la_compilazione
	 * @return the new istruzioni_per_la_compilazione
	 */
	@Override
	public istruzioni_per_la_compilazione create(long Istruzioni_per_id) {
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione = new istruzioni_per_la_compilazioneImpl();

		istruzioni_per_la_compilazione.setNew(true);
		istruzioni_per_la_compilazione.setPrimaryKey(Istruzioni_per_id);

		return istruzioni_per_la_compilazione;
	}

	/**
	 * Removes the istruzioni_per_la_compilazione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	 * @return the istruzioni_per_la_compilazione that was removed
	 * @throws NoSuchistruzioni_per_la_compilazioneException if a istruzioni_per_la_compilazione with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione remove(long Istruzioni_per_id)
		throws NoSuchistruzioni_per_la_compilazioneException {
		return remove((Serializable)Istruzioni_per_id);
	}

	/**
	 * Removes the istruzioni_per_la_compilazione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the istruzioni_per_la_compilazione
	 * @return the istruzioni_per_la_compilazione that was removed
	 * @throws NoSuchistruzioni_per_la_compilazioneException if a istruzioni_per_la_compilazione with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione remove(Serializable primaryKey)
		throws NoSuchistruzioni_per_la_compilazioneException {
		Session session = null;

		try {
			session = openSession();

			istruzioni_per_la_compilazione istruzioni_per_la_compilazione = (istruzioni_per_la_compilazione)session.get(istruzioni_per_la_compilazioneImpl.class,
					primaryKey);

			if (istruzioni_per_la_compilazione == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchistruzioni_per_la_compilazioneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(istruzioni_per_la_compilazione);
		}
		catch (NoSuchistruzioni_per_la_compilazioneException nsee) {
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
	protected istruzioni_per_la_compilazione removeImpl(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		istruzioni_per_la_compilazione = toUnwrappedModel(istruzioni_per_la_compilazione);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(istruzioni_per_la_compilazione)) {
				istruzioni_per_la_compilazione = (istruzioni_per_la_compilazione)session.get(istruzioni_per_la_compilazioneImpl.class,
						istruzioni_per_la_compilazione.getPrimaryKeyObj());
			}

			if (istruzioni_per_la_compilazione != null) {
				session.delete(istruzioni_per_la_compilazione);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (istruzioni_per_la_compilazione != null) {
			clearCache(istruzioni_per_la_compilazione);
		}

		return istruzioni_per_la_compilazione;
	}

	@Override
	public istruzioni_per_la_compilazione updateImpl(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		istruzioni_per_la_compilazione = toUnwrappedModel(istruzioni_per_la_compilazione);

		boolean isNew = istruzioni_per_la_compilazione.isNew();

		Session session = null;

		try {
			session = openSession();

			if (istruzioni_per_la_compilazione.isNew()) {
				session.save(istruzioni_per_la_compilazione);

				istruzioni_per_la_compilazione.setNew(false);
			}
			else {
				istruzioni_per_la_compilazione = (istruzioni_per_la_compilazione)session.merge(istruzioni_per_la_compilazione);
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

		entityCache.putResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
			istruzioni_per_la_compilazioneImpl.class,
			istruzioni_per_la_compilazione.getPrimaryKey(),
			istruzioni_per_la_compilazione, false);

		istruzioni_per_la_compilazione.resetOriginalValues();

		return istruzioni_per_la_compilazione;
	}

	protected istruzioni_per_la_compilazione toUnwrappedModel(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione) {
		if (istruzioni_per_la_compilazione instanceof istruzioni_per_la_compilazioneImpl) {
			return istruzioni_per_la_compilazione;
		}

		istruzioni_per_la_compilazioneImpl istruzioni_per_la_compilazioneImpl = new istruzioni_per_la_compilazioneImpl();

		istruzioni_per_la_compilazioneImpl.setNew(istruzioni_per_la_compilazione.isNew());
		istruzioni_per_la_compilazioneImpl.setPrimaryKey(istruzioni_per_la_compilazione.getPrimaryKey());

		istruzioni_per_la_compilazioneImpl.setIstruzioni_per_id(istruzioni_per_la_compilazione.getIstruzioni_per_id());
		istruzioni_per_la_compilazioneImpl.setPurpose(istruzioni_per_la_compilazione.getPurpose());
		istruzioni_per_la_compilazioneImpl.setMainTitle(istruzioni_per_la_compilazione.getMainTitle());
		istruzioni_per_la_compilazioneImpl.setTilte(istruzioni_per_la_compilazione.getTilte());
		istruzioni_per_la_compilazioneImpl.setSubTitle(istruzioni_per_la_compilazione.getSubTitle());

		return istruzioni_per_la_compilazioneImpl;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the istruzioni_per_la_compilazione
	 * @return the istruzioni_per_la_compilazione
	 * @throws NoSuchistruzioni_per_la_compilazioneException if a istruzioni_per_la_compilazione with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchistruzioni_per_la_compilazioneException {
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione = fetchByPrimaryKey(primaryKey);

		if (istruzioni_per_la_compilazione == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchistruzioni_per_la_compilazioneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return istruzioni_per_la_compilazione;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione with the primary key or throws a {@link NoSuchistruzioni_per_la_compilazioneException} if it could not be found.
	 *
	 * @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	 * @return the istruzioni_per_la_compilazione
	 * @throws NoSuchistruzioni_per_la_compilazioneException if a istruzioni_per_la_compilazione with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione findByPrimaryKey(
		long Istruzioni_per_id)
		throws NoSuchistruzioni_per_la_compilazioneException {
		return findByPrimaryKey((Serializable)Istruzioni_per_id);
	}

	/**
	 * Returns the istruzioni_per_la_compilazione with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the istruzioni_per_la_compilazione
	 * @return the istruzioni_per_la_compilazione, or <code>null</code> if a istruzioni_per_la_compilazione with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
				istruzioni_per_la_compilazioneImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		istruzioni_per_la_compilazione istruzioni_per_la_compilazione = (istruzioni_per_la_compilazione)serializable;

		if (istruzioni_per_la_compilazione == null) {
			Session session = null;

			try {
				session = openSession();

				istruzioni_per_la_compilazione = (istruzioni_per_la_compilazione)session.get(istruzioni_per_la_compilazioneImpl.class,
						primaryKey);

				if (istruzioni_per_la_compilazione != null) {
					cacheResult(istruzioni_per_la_compilazione);
				}
				else {
					entityCache.putResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
						istruzioni_per_la_compilazioneImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
					istruzioni_per_la_compilazioneImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return istruzioni_per_la_compilazione;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	 * @return the istruzioni_per_la_compilazione, or <code>null</code> if a istruzioni_per_la_compilazione with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione fetchByPrimaryKey(
		long Istruzioni_per_id) {
		return fetchByPrimaryKey((Serializable)Istruzioni_per_id);
	}

	@Override
	public Map<Serializable, istruzioni_per_la_compilazione> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, istruzioni_per_la_compilazione> map = new HashMap<Serializable, istruzioni_per_la_compilazione>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			istruzioni_per_la_compilazione istruzioni_per_la_compilazione = fetchByPrimaryKey(primaryKey);

			if (istruzioni_per_la_compilazione != null) {
				map.put(primaryKey, istruzioni_per_la_compilazione);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
					istruzioni_per_la_compilazioneImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(istruzioni_per_la_compilazione)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_WHERE_PKS_IN);

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

			for (istruzioni_per_la_compilazione istruzioni_per_la_compilazione : (List<istruzioni_per_la_compilazione>)q.list()) {
				map.put(istruzioni_per_la_compilazione.getPrimaryKeyObj(),
					istruzioni_per_la_compilazione);

				cacheResult(istruzioni_per_la_compilazione);

				uncachedPrimaryKeys.remove(istruzioni_per_la_compilazione.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(istruzioni_per_la_compilazioneModelImpl.ENTITY_CACHE_ENABLED,
					istruzioni_per_la_compilazioneImpl.class, primaryKey,
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
	 * Returns all the istruzioni_per_la_compilaziones.
	 *
	 * @return the istruzioni_per_la_compilaziones
	 */
	@Override
	public List<istruzioni_per_la_compilazione> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the istruzioni_per_la_compilaziones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istruzioni_per_la_compilaziones
	 * @param end the upper bound of the range of istruzioni_per_la_compilaziones (not inclusive)
	 * @return the range of istruzioni_per_la_compilaziones
	 */
	@Override
	public List<istruzioni_per_la_compilazione> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the istruzioni_per_la_compilaziones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istruzioni_per_la_compilaziones
	 * @param end the upper bound of the range of istruzioni_per_la_compilaziones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of istruzioni_per_la_compilaziones
	 */
	@Override
	public List<istruzioni_per_la_compilazione> findAll(int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the istruzioni_per_la_compilaziones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istruzioni_per_la_compilaziones
	 * @param end the upper bound of the range of istruzioni_per_la_compilaziones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of istruzioni_per_la_compilaziones
	 */
	@Override
	public List<istruzioni_per_la_compilazione> findAll(int start, int end,
		OrderByComparator<istruzioni_per_la_compilazione> orderByComparator,
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

		List<istruzioni_per_la_compilazione> list = null;

		if (retrieveFromCache) {
			list = (List<istruzioni_per_la_compilazione>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE;

				if (pagination) {
					sql = sql.concat(istruzioni_per_la_compilazioneModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<istruzioni_per_la_compilazione>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<istruzioni_per_la_compilazione>)QueryUtil.list(q,
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
	 * Removes all the istruzioni_per_la_compilaziones from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (istruzioni_per_la_compilazione istruzioni_per_la_compilazione : findAll()) {
			remove(istruzioni_per_la_compilazione);
		}
	}

	/**
	 * Returns the number of istruzioni_per_la_compilaziones.
	 *
	 * @return the number of istruzioni_per_la_compilaziones
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ISTRUZIONI_PER_LA_COMPILAZIONE);

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
		return istruzioni_per_la_compilazioneModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the istruzioni_per_la_compilazione persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(istruzioni_per_la_compilazioneImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE = "SELECT istruzioni_per_la_compilazione FROM istruzioni_per_la_compilazione istruzioni_per_la_compilazione";
	private static final String _SQL_SELECT_ISTRUZIONI_PER_LA_COMPILAZIONE_WHERE_PKS_IN =
		"SELECT istruzioni_per_la_compilazione FROM istruzioni_per_la_compilazione istruzioni_per_la_compilazione WHERE Istruzioni_per_id IN (";
	private static final String _SQL_COUNT_ISTRUZIONI_PER_LA_COMPILAZIONE = "SELECT COUNT(istruzioni_per_la_compilazione) FROM istruzioni_per_la_compilazione istruzioni_per_la_compilazione";
	private static final String _ORDER_BY_ENTITY_ALIAS = "istruzioni_per_la_compilazione.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No istruzioni_per_la_compilazione exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(istruzioni_per_la_compilazionePersistenceImpl.class);
}
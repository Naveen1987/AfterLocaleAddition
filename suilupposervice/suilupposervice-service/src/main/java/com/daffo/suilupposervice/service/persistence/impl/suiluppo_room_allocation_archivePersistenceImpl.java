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

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocation_archiveException;
import com.daffo.suilupposervice.model.impl.suiluppo_room_allocation_archiveImpl;
import com.daffo.suilupposervice.model.impl.suiluppo_room_allocation_archiveModelImpl;
import com.daffo.suilupposervice.model.suiluppo_room_allocation_archive;
import com.daffo.suilupposervice.service.persistence.suiluppo_room_allocation_archivePersistence;

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
 * The persistence implementation for the suiluppo_room_allocation_archive service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see suiluppo_room_allocation_archivePersistence
 * @see com.daffo.suilupposervice.service.persistence.suiluppo_room_allocation_archiveUtil
 * @generated
 */
@ProviderType
public class suiluppo_room_allocation_archivePersistenceImpl
	extends BasePersistenceImpl<suiluppo_room_allocation_archive>
	implements suiluppo_room_allocation_archivePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link suiluppo_room_allocation_archiveUtil} to access the suiluppo_room_allocation_archive persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = suiluppo_room_allocation_archiveImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveModelImpl.FINDER_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public suiluppo_room_allocation_archivePersistenceImpl() {
		setModelClass(suiluppo_room_allocation_archive.class);
	}

	/**
	 * Caches the suiluppo_room_allocation_archive in the entity cache if it is enabled.
	 *
	 * @param suiluppo_room_allocation_archive the suiluppo_room_allocation_archive
	 */
	@Override
	public void cacheResult(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		entityCache.putResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			suiluppo_room_allocation_archive.getPrimaryKey(),
			suiluppo_room_allocation_archive);

		suiluppo_room_allocation_archive.resetOriginalValues();
	}

	/**
	 * Caches the suiluppo_room_allocation_archives in the entity cache if it is enabled.
	 *
	 * @param suiluppo_room_allocation_archives the suiluppo_room_allocation_archives
	 */
	@Override
	public void cacheResult(
		List<suiluppo_room_allocation_archive> suiluppo_room_allocation_archives) {
		for (suiluppo_room_allocation_archive suiluppo_room_allocation_archive : suiluppo_room_allocation_archives) {
			if (entityCache.getResult(
						suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_room_allocation_archiveImpl.class,
						suiluppo_room_allocation_archive.getPrimaryKey()) == null) {
				cacheResult(suiluppo_room_allocation_archive);
			}
			else {
				suiluppo_room_allocation_archive.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all suiluppo_room_allocation_archives.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(suiluppo_room_allocation_archiveImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the suiluppo_room_allocation_archive.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		entityCache.removeResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			suiluppo_room_allocation_archive.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<suiluppo_room_allocation_archive> suiluppo_room_allocation_archives) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (suiluppo_room_allocation_archive suiluppo_room_allocation_archive : suiluppo_room_allocation_archives) {
			entityCache.removeResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_room_allocation_archiveImpl.class,
				suiluppo_room_allocation_archive.getPrimaryKey());
		}
	}

	/**
	 * Creates a new suiluppo_room_allocation_archive with the primary key. Does not add the suiluppo_room_allocation_archive to the database.
	 *
	 * @param room_allocat_archive_id the primary key for the new suiluppo_room_allocation_archive
	 * @return the new suiluppo_room_allocation_archive
	 */
	@Override
	public suiluppo_room_allocation_archive create(long room_allocat_archive_id) {
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive = new suiluppo_room_allocation_archiveImpl();

		suiluppo_room_allocation_archive.setNew(true);
		suiluppo_room_allocation_archive.setPrimaryKey(room_allocat_archive_id);

		return suiluppo_room_allocation_archive;
	}

	/**
	 * Removes the suiluppo_room_allocation_archive with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive that was removed
	 * @throws NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	 */
	@Override
	public suiluppo_room_allocation_archive remove(long room_allocat_archive_id)
		throws NoSuchsuiluppo_room_allocation_archiveException {
		return remove((Serializable)room_allocat_archive_id);
	}

	/**
	 * Removes the suiluppo_room_allocation_archive with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive that was removed
	 * @throws NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	 */
	@Override
	public suiluppo_room_allocation_archive remove(Serializable primaryKey)
		throws NoSuchsuiluppo_room_allocation_archiveException {
		Session session = null;

		try {
			session = openSession();

			suiluppo_room_allocation_archive suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)session.get(suiluppo_room_allocation_archiveImpl.class,
					primaryKey);

			if (suiluppo_room_allocation_archive == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsuiluppo_room_allocation_archiveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(suiluppo_room_allocation_archive);
		}
		catch (NoSuchsuiluppo_room_allocation_archiveException nsee) {
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
	protected suiluppo_room_allocation_archive removeImpl(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		suiluppo_room_allocation_archive = toUnwrappedModel(suiluppo_room_allocation_archive);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(suiluppo_room_allocation_archive)) {
				suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)session.get(suiluppo_room_allocation_archiveImpl.class,
						suiluppo_room_allocation_archive.getPrimaryKeyObj());
			}

			if (suiluppo_room_allocation_archive != null) {
				session.delete(suiluppo_room_allocation_archive);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (suiluppo_room_allocation_archive != null) {
			clearCache(suiluppo_room_allocation_archive);
		}

		return suiluppo_room_allocation_archive;
	}

	@Override
	public suiluppo_room_allocation_archive updateImpl(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		suiluppo_room_allocation_archive = toUnwrappedModel(suiluppo_room_allocation_archive);

		boolean isNew = suiluppo_room_allocation_archive.isNew();

		Session session = null;

		try {
			session = openSession();

			if (suiluppo_room_allocation_archive.isNew()) {
				session.save(suiluppo_room_allocation_archive);

				suiluppo_room_allocation_archive.setNew(false);
			}
			else {
				suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)session.merge(suiluppo_room_allocation_archive);
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

		entityCache.putResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
			suiluppo_room_allocation_archiveImpl.class,
			suiluppo_room_allocation_archive.getPrimaryKey(),
			suiluppo_room_allocation_archive, false);

		suiluppo_room_allocation_archive.resetOriginalValues();

		return suiluppo_room_allocation_archive;
	}

	protected suiluppo_room_allocation_archive toUnwrappedModel(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive) {
		if (suiluppo_room_allocation_archive instanceof suiluppo_room_allocation_archiveImpl) {
			return suiluppo_room_allocation_archive;
		}

		suiluppo_room_allocation_archiveImpl suiluppo_room_allocation_archiveImpl =
			new suiluppo_room_allocation_archiveImpl();

		suiluppo_room_allocation_archiveImpl.setNew(suiluppo_room_allocation_archive.isNew());
		suiluppo_room_allocation_archiveImpl.setPrimaryKey(suiluppo_room_allocation_archive.getPrimaryKey());

		suiluppo_room_allocation_archiveImpl.setRoom_allocat_archive_id(suiluppo_room_allocation_archive.getRoom_allocat_archive_id());
		suiluppo_room_allocation_archiveImpl.setRoomID(suiluppo_room_allocation_archive.getRoomID());
		suiluppo_room_allocation_archiveImpl.setCourse_id(suiluppo_room_allocation_archive.getCourse_id());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_date(suiluppo_room_allocation_archive.getRoom_allocat_date());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_startTime(suiluppo_room_allocation_archive.getRoom_allocat_startTime());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_start(suiluppo_room_allocation_archive.getRoom_allocat_start());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_end(suiluppo_room_allocation_archive.getRoom_allocat_end());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_status(suiluppo_room_allocation_archive.getRoom_allocat_status());
		suiluppo_room_allocation_archiveImpl.setRoom_allocat_endTime(suiluppo_room_allocation_archive.getRoom_allocat_endTime());
		suiluppo_room_allocation_archiveImpl.setRoom_archive_date(suiluppo_room_allocation_archive.getRoom_archive_date());

		return suiluppo_room_allocation_archiveImpl;
	}

	/**
	 * Returns the suiluppo_room_allocation_archive with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive
	 * @throws NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	 */
	@Override
	public suiluppo_room_allocation_archive findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchsuiluppo_room_allocation_archiveException {
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive = fetchByPrimaryKey(primaryKey);

		if (suiluppo_room_allocation_archive == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsuiluppo_room_allocation_archiveException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return suiluppo_room_allocation_archive;
	}

	/**
	 * Returns the suiluppo_room_allocation_archive with the primary key or throws a {@link NoSuchsuiluppo_room_allocation_archiveException} if it could not be found.
	 *
	 * @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive
	 * @throws NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	 */
	@Override
	public suiluppo_room_allocation_archive findByPrimaryKey(
		long room_allocat_archive_id)
		throws NoSuchsuiluppo_room_allocation_archiveException {
		return findByPrimaryKey((Serializable)room_allocat_archive_id);
	}

	/**
	 * Returns the suiluppo_room_allocation_archive with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive, or <code>null</code> if a suiluppo_room_allocation_archive with the primary key could not be found
	 */
	@Override
	public suiluppo_room_allocation_archive fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
				suiluppo_room_allocation_archiveImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		suiluppo_room_allocation_archive suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)serializable;

		if (suiluppo_room_allocation_archive == null) {
			Session session = null;

			try {
				session = openSession();

				suiluppo_room_allocation_archive = (suiluppo_room_allocation_archive)session.get(suiluppo_room_allocation_archiveImpl.class,
						primaryKey);

				if (suiluppo_room_allocation_archive != null) {
					cacheResult(suiluppo_room_allocation_archive);
				}
				else {
					entityCache.putResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
						suiluppo_room_allocation_archiveImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_room_allocation_archiveImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return suiluppo_room_allocation_archive;
	}

	/**
	 * Returns the suiluppo_room_allocation_archive with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	 * @return the suiluppo_room_allocation_archive, or <code>null</code> if a suiluppo_room_allocation_archive with the primary key could not be found
	 */
	@Override
	public suiluppo_room_allocation_archive fetchByPrimaryKey(
		long room_allocat_archive_id) {
		return fetchByPrimaryKey((Serializable)room_allocat_archive_id);
	}

	@Override
	public Map<Serializable, suiluppo_room_allocation_archive> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, suiluppo_room_allocation_archive> map = new HashMap<Serializable, suiluppo_room_allocation_archive>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			suiluppo_room_allocation_archive suiluppo_room_allocation_archive = fetchByPrimaryKey(primaryKey);

			if (suiluppo_room_allocation_archive != null) {
				map.put(primaryKey, suiluppo_room_allocation_archive);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_room_allocation_archiveImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(suiluppo_room_allocation_archive)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE_WHERE_PKS_IN);

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

			for (suiluppo_room_allocation_archive suiluppo_room_allocation_archive : (List<suiluppo_room_allocation_archive>)q.list()) {
				map.put(suiluppo_room_allocation_archive.getPrimaryKeyObj(),
					suiluppo_room_allocation_archive);

				cacheResult(suiluppo_room_allocation_archive);

				uncachedPrimaryKeys.remove(suiluppo_room_allocation_archive.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(suiluppo_room_allocation_archiveModelImpl.ENTITY_CACHE_ENABLED,
					suiluppo_room_allocation_archiveImpl.class, primaryKey,
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
	 * Returns all the suiluppo_room_allocation_archives.
	 *
	 * @return the suiluppo_room_allocation_archives
	 */
	@Override
	public List<suiluppo_room_allocation_archive> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the suiluppo_room_allocation_archives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocation_archiveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_room_allocation_archives
	 * @param end the upper bound of the range of suiluppo_room_allocation_archives (not inclusive)
	 * @return the range of suiluppo_room_allocation_archives
	 */
	@Override
	public List<suiluppo_room_allocation_archive> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the suiluppo_room_allocation_archives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocation_archiveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_room_allocation_archives
	 * @param end the upper bound of the range of suiluppo_room_allocation_archives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of suiluppo_room_allocation_archives
	 */
	@Override
	public List<suiluppo_room_allocation_archive> findAll(int start, int end,
		OrderByComparator<suiluppo_room_allocation_archive> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the suiluppo_room_allocation_archives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link suiluppo_room_allocation_archiveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_room_allocation_archives
	 * @param end the upper bound of the range of suiluppo_room_allocation_archives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of suiluppo_room_allocation_archives
	 */
	@Override
	public List<suiluppo_room_allocation_archive> findAll(int start, int end,
		OrderByComparator<suiluppo_room_allocation_archive> orderByComparator,
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

		List<suiluppo_room_allocation_archive> list = null;

		if (retrieveFromCache) {
			list = (List<suiluppo_room_allocation_archive>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE;

				if (pagination) {
					sql = sql.concat(suiluppo_room_allocation_archiveModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<suiluppo_room_allocation_archive>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<suiluppo_room_allocation_archive>)QueryUtil.list(q,
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
	 * Removes all the suiluppo_room_allocation_archives from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (suiluppo_room_allocation_archive suiluppo_room_allocation_archive : findAll()) {
			remove(suiluppo_room_allocation_archive);
		}
	}

	/**
	 * Returns the number of suiluppo_room_allocation_archives.
	 *
	 * @return the number of suiluppo_room_allocation_archives
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE);

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
		return suiluppo_room_allocation_archiveModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the suiluppo_room_allocation_archive persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(suiluppo_room_allocation_archiveImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE = "SELECT suiluppo_room_allocation_archive FROM suiluppo_room_allocation_archive suiluppo_room_allocation_archive";
	private static final String _SQL_SELECT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE_WHERE_PKS_IN =
		"SELECT suiluppo_room_allocation_archive FROM suiluppo_room_allocation_archive suiluppo_room_allocation_archive WHERE room_allocat_archive_id IN (";
	private static final String _SQL_COUNT_SUILUPPO_ROOM_ALLOCATION_ARCHIVE = "SELECT COUNT(suiluppo_room_allocation_archive) FROM suiluppo_room_allocation_archive suiluppo_room_allocation_archive";
	private static final String _ORDER_BY_ENTITY_ALIAS = "suiluppo_room_allocation_archive.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No suiluppo_room_allocation_archive exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(suiluppo_room_allocation_archivePersistenceImpl.class);
}
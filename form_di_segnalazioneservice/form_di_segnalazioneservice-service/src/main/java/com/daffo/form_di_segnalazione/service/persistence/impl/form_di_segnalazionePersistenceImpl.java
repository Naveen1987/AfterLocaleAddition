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

package com.daffo.form_di_segnalazione.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.form_di_segnalazione.exception.NoSuchform_di_segnalazioneException;
import com.daffo.form_di_segnalazione.model.form_di_segnalazione;
import com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneImpl;
import com.daffo.form_di_segnalazione.model.impl.form_di_segnalazioneModelImpl;
import com.daffo.form_di_segnalazione.service.persistence.form_di_segnalazionePersistence;

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
 * The persistence implementation for the form_di_segnalazione service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see form_di_segnalazionePersistence
 * @see com.daffo.form_di_segnalazione.service.persistence.form_di_segnalazioneUtil
 * @generated
 */
@ProviderType
public class form_di_segnalazionePersistenceImpl extends BasePersistenceImpl<form_di_segnalazione>
	implements form_di_segnalazionePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link form_di_segnalazioneUtil} to access the form_di_segnalazione persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = form_di_segnalazioneImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
			form_di_segnalazioneModelImpl.FINDER_CACHE_ENABLED,
			form_di_segnalazioneImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
			form_di_segnalazioneModelImpl.FINDER_CACHE_ENABLED,
			form_di_segnalazioneImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
			form_di_segnalazioneModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public form_di_segnalazionePersistenceImpl() {
		setModelClass(form_di_segnalazione.class);
	}

	/**
	 * Caches the form_di_segnalazione in the entity cache if it is enabled.
	 *
	 * @param form_di_segnalazione the form_di_segnalazione
	 */
	@Override
	public void cacheResult(form_di_segnalazione form_di_segnalazione) {
		entityCache.putResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
			form_di_segnalazioneImpl.class,
			form_di_segnalazione.getPrimaryKey(), form_di_segnalazione);

		form_di_segnalazione.resetOriginalValues();
	}

	/**
	 * Caches the form_di_segnalaziones in the entity cache if it is enabled.
	 *
	 * @param form_di_segnalaziones the form_di_segnalaziones
	 */
	@Override
	public void cacheResult(List<form_di_segnalazione> form_di_segnalaziones) {
		for (form_di_segnalazione form_di_segnalazione : form_di_segnalaziones) {
			if (entityCache.getResult(
						form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
						form_di_segnalazioneImpl.class,
						form_di_segnalazione.getPrimaryKey()) == null) {
				cacheResult(form_di_segnalazione);
			}
			else {
				form_di_segnalazione.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all form_di_segnalaziones.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(form_di_segnalazioneImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the form_di_segnalazione.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(form_di_segnalazione form_di_segnalazione) {
		entityCache.removeResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
			form_di_segnalazioneImpl.class, form_di_segnalazione.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<form_di_segnalazione> form_di_segnalaziones) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (form_di_segnalazione form_di_segnalazione : form_di_segnalaziones) {
			entityCache.removeResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
				form_di_segnalazioneImpl.class,
				form_di_segnalazione.getPrimaryKey());
		}
	}

	/**
	 * Creates a new form_di_segnalazione with the primary key. Does not add the form_di_segnalazione to the database.
	 *
	 * @param Form_di_segnalazione_id the primary key for the new form_di_segnalazione
	 * @return the new form_di_segnalazione
	 */
	@Override
	public form_di_segnalazione create(long Form_di_segnalazione_id) {
		form_di_segnalazione form_di_segnalazione = new form_di_segnalazioneImpl();

		form_di_segnalazione.setNew(true);
		form_di_segnalazione.setPrimaryKey(Form_di_segnalazione_id);

		return form_di_segnalazione;
	}

	/**
	 * Removes the form_di_segnalazione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Form_di_segnalazione_id the primary key of the form_di_segnalazione
	 * @return the form_di_segnalazione that was removed
	 * @throws NoSuchform_di_segnalazioneException if a form_di_segnalazione with the primary key could not be found
	 */
	@Override
	public form_di_segnalazione remove(long Form_di_segnalazione_id)
		throws NoSuchform_di_segnalazioneException {
		return remove((Serializable)Form_di_segnalazione_id);
	}

	/**
	 * Removes the form_di_segnalazione with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the form_di_segnalazione
	 * @return the form_di_segnalazione that was removed
	 * @throws NoSuchform_di_segnalazioneException if a form_di_segnalazione with the primary key could not be found
	 */
	@Override
	public form_di_segnalazione remove(Serializable primaryKey)
		throws NoSuchform_di_segnalazioneException {
		Session session = null;

		try {
			session = openSession();

			form_di_segnalazione form_di_segnalazione = (form_di_segnalazione)session.get(form_di_segnalazioneImpl.class,
					primaryKey);

			if (form_di_segnalazione == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchform_di_segnalazioneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(form_di_segnalazione);
		}
		catch (NoSuchform_di_segnalazioneException nsee) {
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
	protected form_di_segnalazione removeImpl(
		form_di_segnalazione form_di_segnalazione) {
		form_di_segnalazione = toUnwrappedModel(form_di_segnalazione);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(form_di_segnalazione)) {
				form_di_segnalazione = (form_di_segnalazione)session.get(form_di_segnalazioneImpl.class,
						form_di_segnalazione.getPrimaryKeyObj());
			}

			if (form_di_segnalazione != null) {
				session.delete(form_di_segnalazione);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (form_di_segnalazione != null) {
			clearCache(form_di_segnalazione);
		}

		return form_di_segnalazione;
	}

	@Override
	public form_di_segnalazione updateImpl(
		form_di_segnalazione form_di_segnalazione) {
		form_di_segnalazione = toUnwrappedModel(form_di_segnalazione);

		boolean isNew = form_di_segnalazione.isNew();

		Session session = null;

		try {
			session = openSession();

			if (form_di_segnalazione.isNew()) {
				session.save(form_di_segnalazione);

				form_di_segnalazione.setNew(false);
			}
			else {
				form_di_segnalazione = (form_di_segnalazione)session.merge(form_di_segnalazione);
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

		entityCache.putResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
			form_di_segnalazioneImpl.class,
			form_di_segnalazione.getPrimaryKey(), form_di_segnalazione, false);

		form_di_segnalazione.resetOriginalValues();

		return form_di_segnalazione;
	}

	protected form_di_segnalazione toUnwrappedModel(
		form_di_segnalazione form_di_segnalazione) {
		if (form_di_segnalazione instanceof form_di_segnalazioneImpl) {
			return form_di_segnalazione;
		}

		form_di_segnalazioneImpl form_di_segnalazioneImpl = new form_di_segnalazioneImpl();

		form_di_segnalazioneImpl.setNew(form_di_segnalazione.isNew());
		form_di_segnalazioneImpl.setPrimaryKey(form_di_segnalazione.getPrimaryKey());

		form_di_segnalazioneImpl.setForm_di_segnalazione_id(form_di_segnalazione.getForm_di_segnalazione_id());
		form_di_segnalazioneImpl.setCODICE(form_di_segnalazione.getCODICE());
		form_di_segnalazioneImpl.setINIZIALI_1(form_di_segnalazione.getINIZIALI_1());
		form_di_segnalazioneImpl.setINIZIALI_1_a(form_di_segnalazione.getINIZIALI_1_a());
		form_di_segnalazioneImpl.setINIZIALI_1_b(form_di_segnalazione.getINIZIALI_1_b());
		form_di_segnalazioneImpl.setINIZIALI_1_c(form_di_segnalazione.getINIZIALI_1_c());
		form_di_segnalazioneImpl.setINIZIALI_1_d(form_di_segnalazione.getINIZIALI_1_d());
		form_di_segnalazioneImpl.setINIZIALI_1_e(form_di_segnalazione.getINIZIALI_1_e());
		form_di_segnalazioneImpl.setDATA_2(form_di_segnalazione.getDATA_2());
		form_di_segnalazioneImpl.setSESSO_3(form_di_segnalazione.getSESSO_3());
		form_di_segnalazioneImpl.setDATA_4(form_di_segnalazione.getDATA_4());
		form_di_segnalazioneImpl.setORIGINE_5(form_di_segnalazione.getORIGINE_5());
		form_di_segnalazioneImpl.setDESCRIZIONE_6(form_di_segnalazione.getDESCRIZIONE_6());
		form_di_segnalazioneImpl.setINDICARE_7_1(form_di_segnalazione.getINDICARE_7_1());
		form_di_segnalazioneImpl.setINDICARE_7_2(form_di_segnalazione.getINDICARE_7_2());
		form_di_segnalazioneImpl.setINDICARE_7_3(form_di_segnalazione.getINDICARE_7_3());
		form_di_segnalazioneImpl.setINDICARE_7_4(form_di_segnalazione.getINDICARE_7_4());
		form_di_segnalazioneImpl.setINDICARE_7_5(form_di_segnalazione.getINDICARE_7_5());
		form_di_segnalazioneImpl.setINDICARE_7_6(form_di_segnalazione.getINDICARE_7_6());
		form_di_segnalazioneImpl.setINDICARE_7_7(form_di_segnalazione.getINDICARE_7_7());
		form_di_segnalazioneImpl.setGRAVITA_8_1(form_di_segnalazione.getGRAVITA_8_1());
		form_di_segnalazioneImpl.setGRAVITA_8_2(form_di_segnalazione.getGRAVITA_8_2());
		form_di_segnalazioneImpl.setGRAVITA_8_3(form_di_segnalazione.getGRAVITA_8_3());
		form_di_segnalazioneImpl.setGRAVITA_8_4(form_di_segnalazione.getGRAVITA_8_4());
		form_di_segnalazioneImpl.setGRAVITA_8_5(form_di_segnalazione.getGRAVITA_8_5());
		form_di_segnalazioneImpl.setGRAVITA_8_6(form_di_segnalazione.getGRAVITA_8_6());
		form_di_segnalazioneImpl.setGRAVITA_8_7(form_di_segnalazione.getGRAVITA_8_7());
		form_di_segnalazioneImpl.setEVENTUALI_9(form_di_segnalazione.getEVENTUALI_9());
		form_di_segnalazioneImpl.setESITO_10(form_di_segnalazione.getESITO_10());
		form_di_segnalazioneImpl.setESITO_10_1(form_di_segnalazione.getESITO_10_1());
		form_di_segnalazioneImpl.setESITO_10_2(form_di_segnalazione.getESITO_10_2());
		form_di_segnalazioneImpl.setESITO_10_3(form_di_segnalazione.getESITO_10_3());
		form_di_segnalazioneImpl.setESITO_10_4(form_di_segnalazione.getESITO_10_4());
		form_di_segnalazioneImpl.setESITO_10_5(form_di_segnalazione.getESITO_10_5());
		form_di_segnalazioneImpl.setESITO_10_6(form_di_segnalazione.getESITO_10_6());
		form_di_segnalazioneImpl.setESITO_10_7(form_di_segnalazione.getESITO_10_7());
		form_di_segnalazioneImpl.setESITO_10_8(form_di_segnalazione.getESITO_10_8());
		form_di_segnalazioneImpl.setESITO_10_9(form_di_segnalazione.getESITO_10_9());
		form_di_segnalazioneImpl.setESITO_10_10(form_di_segnalazione.getESITO_10_10());
		form_di_segnalazioneImpl.setAZIONI_11(form_di_segnalazione.getAZIONI_11());
		form_di_segnalazioneImpl.setFARMACO_12_a(form_di_segnalazione.getFARMACO_12_a());
		form_di_segnalazioneImpl.setFARMACO_12_a_13(form_di_segnalazione.getFARMACO_12_a_13());
		form_di_segnalazioneImpl.setFARMACO_12_a_14(form_di_segnalazione.getFARMACO_12_a_14());
		form_di_segnalazioneImpl.setFARMACO_12_a_15(form_di_segnalazione.getFARMACO_12_a_15());
		form_di_segnalazioneImpl.setFARMACO_12_a_16_1(form_di_segnalazione.getFARMACO_12_a_16_1());
		form_di_segnalazioneImpl.setFARMACO_12_a_16_2(form_di_segnalazione.getFARMACO_12_a_16_2());
		form_di_segnalazioneImpl.setFARMACO_12_a_17(form_di_segnalazione.getFARMACO_12_a_17());
		form_di_segnalazioneImpl.setFARMACO_12_a_18(form_di_segnalazione.getFARMACO_12_a_18());
		form_di_segnalazioneImpl.setFARMACO_12_a_19(form_di_segnalazione.getFARMACO_12_a_19());
		form_di_segnalazioneImpl.setFARMACO_12_a_20(form_di_segnalazione.getFARMACO_12_a_20());
		form_di_segnalazioneImpl.setFARMACO_12_b(form_di_segnalazione.getFARMACO_12_b());
		form_di_segnalazioneImpl.setFARMACO_12_b_13(form_di_segnalazione.getFARMACO_12_b_13());
		form_di_segnalazioneImpl.setFARMACO_12_b_14(form_di_segnalazione.getFARMACO_12_b_14());
		form_di_segnalazioneImpl.setFARMACO_12_b_15(form_di_segnalazione.getFARMACO_12_b_15());
		form_di_segnalazioneImpl.setFARMACO_12_b_16_1(form_di_segnalazione.getFARMACO_12_b_16_1());
		form_di_segnalazioneImpl.setFARMACO_12_b_16_2(form_di_segnalazione.getFARMACO_12_b_16_2());
		form_di_segnalazioneImpl.setFARMACO_12_b_17(form_di_segnalazione.getFARMACO_12_b_17());
		form_di_segnalazioneImpl.setFARMACO_12_b_18(form_di_segnalazione.getFARMACO_12_b_18());
		form_di_segnalazioneImpl.setFARMACO_12_b_19(form_di_segnalazione.getFARMACO_12_b_19());
		form_di_segnalazioneImpl.setFARMACO_12_b_20(form_di_segnalazione.getFARMACO_12_b_20());
		form_di_segnalazioneImpl.setFARMACO_12_c(form_di_segnalazione.getFARMACO_12_c());
		form_di_segnalazioneImpl.setFARMACO_12_c_13(form_di_segnalazione.getFARMACO_12_c_13());
		form_di_segnalazioneImpl.setFARMACO_12_c_14(form_di_segnalazione.getFARMACO_12_c_14());
		form_di_segnalazioneImpl.setFARMACO_12_c_15(form_di_segnalazione.getFARMACO_12_c_15());
		form_di_segnalazioneImpl.setFARMACO_12_c_16_1(form_di_segnalazione.getFARMACO_12_c_16_1());
		form_di_segnalazioneImpl.setFARMACO_12_c_16_2(form_di_segnalazione.getFARMACO_12_c_16_2());
		form_di_segnalazioneImpl.setFARMACO_12_c_17(form_di_segnalazione.getFARMACO_12_c_17());
		form_di_segnalazioneImpl.setFARMACO_12_c_18(form_di_segnalazione.getFARMACO_12_c_18());
		form_di_segnalazioneImpl.setFARMACO_12_c_19(form_di_segnalazione.getFARMACO_12_c_19());
		form_di_segnalazioneImpl.setFARMACO_12_c_20(form_di_segnalazione.getFARMACO_12_c_20());
		form_di_segnalazioneImpl.setINDICAZIONI_21_a(form_di_segnalazione.getINDICAZIONI_21_a());
		form_di_segnalazioneImpl.setINDICAZIONI_21_b(form_di_segnalazione.getINDICAZIONI_21_b());
		form_di_segnalazioneImpl.setINDICAZIONI_21_c(form_di_segnalazione.getINDICAZIONI_21_c());
		form_di_segnalazioneImpl.setFARMACO_22_a(form_di_segnalazione.getFARMACO_22_a());
		form_di_segnalazioneImpl.setFARMACO_22_a_23(form_di_segnalazione.getFARMACO_22_a_23());
		form_di_segnalazioneImpl.setFARMACO_22_a_24(form_di_segnalazione.getFARMACO_22_a_24());
		form_di_segnalazioneImpl.setFARMACO_22_a_25(form_di_segnalazione.getFARMACO_22_a_25());
		form_di_segnalazioneImpl.setFARMACO_22_a_26_1(form_di_segnalazione.getFARMACO_22_a_26_1());
		form_di_segnalazioneImpl.setFARMACO_22_a_26_2(form_di_segnalazione.getFARMACO_22_a_26_2());
		form_di_segnalazioneImpl.setFARMACO_22_a_27(form_di_segnalazione.getFARMACO_22_a_27());
		form_di_segnalazioneImpl.setFARMACO_22_a_28(form_di_segnalazione.getFARMACO_22_a_28());
		form_di_segnalazioneImpl.setFARMACO_22_a_29(form_di_segnalazione.getFARMACO_22_a_29());
		form_di_segnalazioneImpl.setFARMACO_22_a_30(form_di_segnalazione.getFARMACO_22_a_30());
		form_di_segnalazioneImpl.setFARMACO_22_b(form_di_segnalazione.getFARMACO_22_b());
		form_di_segnalazioneImpl.setFARMACO_22_b_23(form_di_segnalazione.getFARMACO_22_b_23());
		form_di_segnalazioneImpl.setFARMACO_22_b_24(form_di_segnalazione.getFARMACO_22_b_24());
		form_di_segnalazioneImpl.setFARMACO_22_b_25(form_di_segnalazione.getFARMACO_22_b_25());
		form_di_segnalazioneImpl.setFARMACO_22_b_26_1(form_di_segnalazione.getFARMACO_22_b_26_1());
		form_di_segnalazioneImpl.setFARMACO_22_b_26_2(form_di_segnalazione.getFARMACO_22_b_26_2());
		form_di_segnalazioneImpl.setFARMACO_22_b_27(form_di_segnalazione.getFARMACO_22_b_27());
		form_di_segnalazioneImpl.setFARMACO_22_b_28(form_di_segnalazione.getFARMACO_22_b_28());
		form_di_segnalazioneImpl.setFARMACO_22_b_29(form_di_segnalazione.getFARMACO_22_b_29());
		form_di_segnalazioneImpl.setFARMACO_22_b_30(form_di_segnalazione.getFARMACO_22_b_30());
		form_di_segnalazioneImpl.setINDICAZIONI_31_a(form_di_segnalazione.getINDICAZIONI_31_a());
		form_di_segnalazioneImpl.setINDICAZIONI_31_b(form_di_segnalazione.getINDICAZIONI_31_b());
		form_di_segnalazioneImpl.setUSO_32(form_di_segnalazione.getUSO_32());
		form_di_segnalazioneImpl.setCONDIZIONI_33(form_di_segnalazione.getCONDIZIONI_33());
		form_di_segnalazioneImpl.setALTRE_34(form_di_segnalazione.getALTRE_34());
		form_di_segnalazioneImpl.setINDICARE_35_1(form_di_segnalazione.getINDICARE_35_1());
		form_di_segnalazioneImpl.setINDICARE_35_2(form_di_segnalazione.getINDICARE_35_2());
		form_di_segnalazioneImpl.setINDICARE_35_3(form_di_segnalazione.getINDICARE_35_3());
		form_di_segnalazioneImpl.setINDICARE_35_4(form_di_segnalazione.getINDICARE_35_4());
		form_di_segnalazioneImpl.setINDICARE_35_5(form_di_segnalazione.getINDICARE_35_5());
		form_di_segnalazioneImpl.setINDICARE_35_6(form_di_segnalazione.getINDICARE_35_6());
		form_di_segnalazioneImpl.setQUALIFICA_36_1(form_di_segnalazione.getQUALIFICA_36_1());
		form_di_segnalazioneImpl.setQUALIFICA_36_2(form_di_segnalazione.getQUALIFICA_36_2());
		form_di_segnalazioneImpl.setQUALIFICA_36_3(form_di_segnalazione.getQUALIFICA_36_3());
		form_di_segnalazioneImpl.setQUALIFICA_36_4(form_di_segnalazione.getQUALIFICA_36_4());
		form_di_segnalazioneImpl.setQUALIFICA_36_5(form_di_segnalazione.getQUALIFICA_36_5());
		form_di_segnalazioneImpl.setQUALIFICA_36_6(form_di_segnalazione.getQUALIFICA_36_6());
		form_di_segnalazioneImpl.setQUALIFICA_36_7(form_di_segnalazione.getQUALIFICA_36_7());
		form_di_segnalazioneImpl.setQUALIFICA_36_8(form_di_segnalazione.getQUALIFICA_36_8());
		form_di_segnalazioneImpl.setQUALIFICA_36_9(form_di_segnalazione.getQUALIFICA_36_9());
		form_di_segnalazioneImpl.setQUALIFICA_36_10(form_di_segnalazione.getQUALIFICA_36_10());
		form_di_segnalazioneImpl.setDATI_37_1(form_di_segnalazione.getDATI_37_1());
		form_di_segnalazioneImpl.setDATI_37_2(form_di_segnalazione.getDATI_37_2());
		form_di_segnalazioneImpl.setDATI_37_3(form_di_segnalazione.getDATI_37_3());
		form_di_segnalazioneImpl.setDATI_37_4(form_di_segnalazione.getDATI_37_4());
		form_di_segnalazioneImpl.setASL_38(form_di_segnalazione.getASL_38());
		form_di_segnalazioneImpl.setREGIONE_39(form_di_segnalazione.getREGIONE_39());
		form_di_segnalazioneImpl.setDATA_40(form_di_segnalazione.getDATA_40());
		form_di_segnalazioneImpl.setFIRMA_41(form_di_segnalazione.getFIRMA_41());

		return form_di_segnalazioneImpl;
	}

	/**
	 * Returns the form_di_segnalazione with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the form_di_segnalazione
	 * @return the form_di_segnalazione
	 * @throws NoSuchform_di_segnalazioneException if a form_di_segnalazione with the primary key could not be found
	 */
	@Override
	public form_di_segnalazione findByPrimaryKey(Serializable primaryKey)
		throws NoSuchform_di_segnalazioneException {
		form_di_segnalazione form_di_segnalazione = fetchByPrimaryKey(primaryKey);

		if (form_di_segnalazione == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchform_di_segnalazioneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return form_di_segnalazione;
	}

	/**
	 * Returns the form_di_segnalazione with the primary key or throws a {@link NoSuchform_di_segnalazioneException} if it could not be found.
	 *
	 * @param Form_di_segnalazione_id the primary key of the form_di_segnalazione
	 * @return the form_di_segnalazione
	 * @throws NoSuchform_di_segnalazioneException if a form_di_segnalazione with the primary key could not be found
	 */
	@Override
	public form_di_segnalazione findByPrimaryKey(long Form_di_segnalazione_id)
		throws NoSuchform_di_segnalazioneException {
		return findByPrimaryKey((Serializable)Form_di_segnalazione_id);
	}

	/**
	 * Returns the form_di_segnalazione with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the form_di_segnalazione
	 * @return the form_di_segnalazione, or <code>null</code> if a form_di_segnalazione with the primary key could not be found
	 */
	@Override
	public form_di_segnalazione fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
				form_di_segnalazioneImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		form_di_segnalazione form_di_segnalazione = (form_di_segnalazione)serializable;

		if (form_di_segnalazione == null) {
			Session session = null;

			try {
				session = openSession();

				form_di_segnalazione = (form_di_segnalazione)session.get(form_di_segnalazioneImpl.class,
						primaryKey);

				if (form_di_segnalazione != null) {
					cacheResult(form_di_segnalazione);
				}
				else {
					entityCache.putResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
						form_di_segnalazioneImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
					form_di_segnalazioneImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return form_di_segnalazione;
	}

	/**
	 * Returns the form_di_segnalazione with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Form_di_segnalazione_id the primary key of the form_di_segnalazione
	 * @return the form_di_segnalazione, or <code>null</code> if a form_di_segnalazione with the primary key could not be found
	 */
	@Override
	public form_di_segnalazione fetchByPrimaryKey(long Form_di_segnalazione_id) {
		return fetchByPrimaryKey((Serializable)Form_di_segnalazione_id);
	}

	@Override
	public Map<Serializable, form_di_segnalazione> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, form_di_segnalazione> map = new HashMap<Serializable, form_di_segnalazione>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			form_di_segnalazione form_di_segnalazione = fetchByPrimaryKey(primaryKey);

			if (form_di_segnalazione != null) {
				map.put(primaryKey, form_di_segnalazione);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
					form_di_segnalazioneImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (form_di_segnalazione)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FORM_DI_SEGNALAZIONE_WHERE_PKS_IN);

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

			for (form_di_segnalazione form_di_segnalazione : (List<form_di_segnalazione>)q.list()) {
				map.put(form_di_segnalazione.getPrimaryKeyObj(),
					form_di_segnalazione);

				cacheResult(form_di_segnalazione);

				uncachedPrimaryKeys.remove(form_di_segnalazione.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(form_di_segnalazioneModelImpl.ENTITY_CACHE_ENABLED,
					form_di_segnalazioneImpl.class, primaryKey, nullModel);
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
	 * Returns all the form_di_segnalaziones.
	 *
	 * @return the form_di_segnalaziones
	 */
	@Override
	public List<form_di_segnalazione> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the form_di_segnalaziones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link form_di_segnalazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form_di_segnalaziones
	 * @param end the upper bound of the range of form_di_segnalaziones (not inclusive)
	 * @return the range of form_di_segnalaziones
	 */
	@Override
	public List<form_di_segnalazione> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the form_di_segnalaziones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link form_di_segnalazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form_di_segnalaziones
	 * @param end the upper bound of the range of form_di_segnalaziones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of form_di_segnalaziones
	 */
	@Override
	public List<form_di_segnalazione> findAll(int start, int end,
		OrderByComparator<form_di_segnalazione> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the form_di_segnalaziones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link form_di_segnalazioneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of form_di_segnalaziones
	 * @param end the upper bound of the range of form_di_segnalaziones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of form_di_segnalaziones
	 */
	@Override
	public List<form_di_segnalazione> findAll(int start, int end,
		OrderByComparator<form_di_segnalazione> orderByComparator,
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

		List<form_di_segnalazione> list = null;

		if (retrieveFromCache) {
			list = (List<form_di_segnalazione>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FORM_DI_SEGNALAZIONE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FORM_DI_SEGNALAZIONE;

				if (pagination) {
					sql = sql.concat(form_di_segnalazioneModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<form_di_segnalazione>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<form_di_segnalazione>)QueryUtil.list(q,
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
	 * Removes all the form_di_segnalaziones from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (form_di_segnalazione form_di_segnalazione : findAll()) {
			remove(form_di_segnalazione);
		}
	}

	/**
	 * Returns the number of form_di_segnalaziones.
	 *
	 * @return the number of form_di_segnalaziones
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FORM_DI_SEGNALAZIONE);

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
		return form_di_segnalazioneModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the form_di_segnalazione persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(form_di_segnalazioneImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FORM_DI_SEGNALAZIONE = "SELECT form_di_segnalazione FROM form_di_segnalazione form_di_segnalazione";
	private static final String _SQL_SELECT_FORM_DI_SEGNALAZIONE_WHERE_PKS_IN = "SELECT form_di_segnalazione FROM form_di_segnalazione form_di_segnalazione WHERE Form_di_segnalazione_id IN (";
	private static final String _SQL_COUNT_FORM_DI_SEGNALAZIONE = "SELECT COUNT(form_di_segnalazione) FROM form_di_segnalazione form_di_segnalazione";
	private static final String _ORDER_BY_ENTITY_ALIAS = "form_di_segnalazione.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No form_di_segnalazione exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(form_di_segnalazionePersistenceImpl.class);
}
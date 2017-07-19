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

package com.daffo.suilupposervice.service.base;

import aQute.bnd.annotation.ProviderType;

import com.daffo.suilupposervice.model.suiluppo_room_allocation;
import com.daffo.suilupposervice.service.persistence.suiluppo_applicationPersistence;
import com.daffo.suilupposervice.service.persistence.suiluppo_coursePersistence;
import com.daffo.suilupposervice.service.persistence.suiluppo_equip_allocationPersistence;
import com.daffo.suilupposervice.service.persistence.suiluppo_equipmentPersistence;
import com.daffo.suilupposervice.service.persistence.suiluppo_roomPersistence;
import com.daffo.suilupposervice.service.persistence.suiluppo_room_allocationPersistence;
import com.daffo.suilupposervice.service.persistence.suiluppo_room_allocation_archivePersistence;
import com.daffo.suilupposervice.service.suiluppo_room_allocationLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the suiluppo_room_allocation local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.daffo.suilupposervice.service.impl.suiluppo_room_allocationLocalServiceImpl}.
 * </p>
 *
 * @author Naveen
 * @see com.daffo.suilupposervice.service.impl.suiluppo_room_allocationLocalServiceImpl
 * @see com.daffo.suilupposervice.service.suiluppo_room_allocationLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class suiluppo_room_allocationLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements suiluppo_room_allocationLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.daffo.suilupposervice.service.suiluppo_room_allocationLocalServiceUtil} to access the suiluppo_room_allocation local service.
	 */

	/**
	 * Adds the suiluppo_room_allocation to the database. Also notifies the appropriate model listeners.
	 *
	 * @param suiluppo_room_allocation the suiluppo_room_allocation
	 * @return the suiluppo_room_allocation that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public suiluppo_room_allocation addsuiluppo_room_allocation(
		suiluppo_room_allocation suiluppo_room_allocation) {
		suiluppo_room_allocation.setNew(true);

		return suiluppo_room_allocationPersistence.update(suiluppo_room_allocation);
	}

	/**
	 * Creates a new suiluppo_room_allocation with the primary key. Does not add the suiluppo_room_allocation to the database.
	 *
	 * @param room_allocat_id the primary key for the new suiluppo_room_allocation
	 * @return the new suiluppo_room_allocation
	 */
	@Override
	public suiluppo_room_allocation createsuiluppo_room_allocation(
		long room_allocat_id) {
		return suiluppo_room_allocationPersistence.create(room_allocat_id);
	}

	/**
	 * Deletes the suiluppo_room_allocation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param room_allocat_id the primary key of the suiluppo_room_allocation
	 * @return the suiluppo_room_allocation that was removed
	 * @throws PortalException if a suiluppo_room_allocation with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public suiluppo_room_allocation deletesuiluppo_room_allocation(
		long room_allocat_id) throws PortalException {
		return suiluppo_room_allocationPersistence.remove(room_allocat_id);
	}

	/**
	 * Deletes the suiluppo_room_allocation from the database. Also notifies the appropriate model listeners.
	 *
	 * @param suiluppo_room_allocation the suiluppo_room_allocation
	 * @return the suiluppo_room_allocation that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public suiluppo_room_allocation deletesuiluppo_room_allocation(
		suiluppo_room_allocation suiluppo_room_allocation) {
		return suiluppo_room_allocationPersistence.remove(suiluppo_room_allocation);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(suiluppo_room_allocation.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return suiluppo_room_allocationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return suiluppo_room_allocationPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return suiluppo_room_allocationPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return suiluppo_room_allocationPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return suiluppo_room_allocationPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public suiluppo_room_allocation fetchsuiluppo_room_allocation(
		long room_allocat_id) {
		return suiluppo_room_allocationPersistence.fetchByPrimaryKey(room_allocat_id);
	}

	/**
	 * Returns the suiluppo_room_allocation with the primary key.
	 *
	 * @param room_allocat_id the primary key of the suiluppo_room_allocation
	 * @return the suiluppo_room_allocation
	 * @throws PortalException if a suiluppo_room_allocation with the primary key could not be found
	 */
	@Override
	public suiluppo_room_allocation getsuiluppo_room_allocation(
		long room_allocat_id) throws PortalException {
		return suiluppo_room_allocationPersistence.findByPrimaryKey(room_allocat_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(suiluppo_room_allocationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(suiluppo_room_allocation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("room_allocat_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(suiluppo_room_allocationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(suiluppo_room_allocation.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"room_allocat_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(suiluppo_room_allocationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(suiluppo_room_allocation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("room_allocat_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return suiluppo_room_allocationLocalService.deletesuiluppo_room_allocation((suiluppo_room_allocation)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return suiluppo_room_allocationPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the suiluppo_room_allocations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.daffo.suilupposervice.model.impl.suiluppo_room_allocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of suiluppo_room_allocations
	 * @param end the upper bound of the range of suiluppo_room_allocations (not inclusive)
	 * @return the range of suiluppo_room_allocations
	 */
	@Override
	public List<suiluppo_room_allocation> getsuiluppo_room_allocations(
		int start, int end) {
		return suiluppo_room_allocationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of suiluppo_room_allocations.
	 *
	 * @return the number of suiluppo_room_allocations
	 */
	@Override
	public int getsuiluppo_room_allocationsCount() {
		return suiluppo_room_allocationPersistence.countAll();
	}

	/**
	 * Updates the suiluppo_room_allocation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param suiluppo_room_allocation the suiluppo_room_allocation
	 * @return the suiluppo_room_allocation that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public suiluppo_room_allocation updatesuiluppo_room_allocation(
		suiluppo_room_allocation suiluppo_room_allocation) {
		return suiluppo_room_allocationPersistence.update(suiluppo_room_allocation);
	}

	/**
	 * Returns the suiluppo_application local service.
	 *
	 * @return the suiluppo_application local service
	 */
	public com.daffo.suilupposervice.service.suiluppo_applicationLocalService getsuiluppo_applicationLocalService() {
		return suiluppo_applicationLocalService;
	}

	/**
	 * Sets the suiluppo_application local service.
	 *
	 * @param suiluppo_applicationLocalService the suiluppo_application local service
	 */
	public void setsuiluppo_applicationLocalService(
		com.daffo.suilupposervice.service.suiluppo_applicationLocalService suiluppo_applicationLocalService) {
		this.suiluppo_applicationLocalService = suiluppo_applicationLocalService;
	}

	/**
	 * Returns the suiluppo_application persistence.
	 *
	 * @return the suiluppo_application persistence
	 */
	public suiluppo_applicationPersistence getsuiluppo_applicationPersistence() {
		return suiluppo_applicationPersistence;
	}

	/**
	 * Sets the suiluppo_application persistence.
	 *
	 * @param suiluppo_applicationPersistence the suiluppo_application persistence
	 */
	public void setsuiluppo_applicationPersistence(
		suiluppo_applicationPersistence suiluppo_applicationPersistence) {
		this.suiluppo_applicationPersistence = suiluppo_applicationPersistence;
	}

	/**
	 * Returns the suiluppo_course local service.
	 *
	 * @return the suiluppo_course local service
	 */
	public com.daffo.suilupposervice.service.suiluppo_courseLocalService getsuiluppo_courseLocalService() {
		return suiluppo_courseLocalService;
	}

	/**
	 * Sets the suiluppo_course local service.
	 *
	 * @param suiluppo_courseLocalService the suiluppo_course local service
	 */
	public void setsuiluppo_courseLocalService(
		com.daffo.suilupposervice.service.suiluppo_courseLocalService suiluppo_courseLocalService) {
		this.suiluppo_courseLocalService = suiluppo_courseLocalService;
	}

	/**
	 * Returns the suiluppo_course persistence.
	 *
	 * @return the suiluppo_course persistence
	 */
	public suiluppo_coursePersistence getsuiluppo_coursePersistence() {
		return suiluppo_coursePersistence;
	}

	/**
	 * Sets the suiluppo_course persistence.
	 *
	 * @param suiluppo_coursePersistence the suiluppo_course persistence
	 */
	public void setsuiluppo_coursePersistence(
		suiluppo_coursePersistence suiluppo_coursePersistence) {
		this.suiluppo_coursePersistence = suiluppo_coursePersistence;
	}

	/**
	 * Returns the suiluppo_equip_allocation local service.
	 *
	 * @return the suiluppo_equip_allocation local service
	 */
	public com.daffo.suilupposervice.service.suiluppo_equip_allocationLocalService getsuiluppo_equip_allocationLocalService() {
		return suiluppo_equip_allocationLocalService;
	}

	/**
	 * Sets the suiluppo_equip_allocation local service.
	 *
	 * @param suiluppo_equip_allocationLocalService the suiluppo_equip_allocation local service
	 */
	public void setsuiluppo_equip_allocationLocalService(
		com.daffo.suilupposervice.service.suiluppo_equip_allocationLocalService suiluppo_equip_allocationLocalService) {
		this.suiluppo_equip_allocationLocalService = suiluppo_equip_allocationLocalService;
	}

	/**
	 * Returns the suiluppo_equip_allocation persistence.
	 *
	 * @return the suiluppo_equip_allocation persistence
	 */
	public suiluppo_equip_allocationPersistence getsuiluppo_equip_allocationPersistence() {
		return suiluppo_equip_allocationPersistence;
	}

	/**
	 * Sets the suiluppo_equip_allocation persistence.
	 *
	 * @param suiluppo_equip_allocationPersistence the suiluppo_equip_allocation persistence
	 */
	public void setsuiluppo_equip_allocationPersistence(
		suiluppo_equip_allocationPersistence suiluppo_equip_allocationPersistence) {
		this.suiluppo_equip_allocationPersistence = suiluppo_equip_allocationPersistence;
	}

	/**
	 * Returns the suiluppo_equipment local service.
	 *
	 * @return the suiluppo_equipment local service
	 */
	public com.daffo.suilupposervice.service.suiluppo_equipmentLocalService getsuiluppo_equipmentLocalService() {
		return suiluppo_equipmentLocalService;
	}

	/**
	 * Sets the suiluppo_equipment local service.
	 *
	 * @param suiluppo_equipmentLocalService the suiluppo_equipment local service
	 */
	public void setsuiluppo_equipmentLocalService(
		com.daffo.suilupposervice.service.suiluppo_equipmentLocalService suiluppo_equipmentLocalService) {
		this.suiluppo_equipmentLocalService = suiluppo_equipmentLocalService;
	}

	/**
	 * Returns the suiluppo_equipment persistence.
	 *
	 * @return the suiluppo_equipment persistence
	 */
	public suiluppo_equipmentPersistence getsuiluppo_equipmentPersistence() {
		return suiluppo_equipmentPersistence;
	}

	/**
	 * Sets the suiluppo_equipment persistence.
	 *
	 * @param suiluppo_equipmentPersistence the suiluppo_equipment persistence
	 */
	public void setsuiluppo_equipmentPersistence(
		suiluppo_equipmentPersistence suiluppo_equipmentPersistence) {
		this.suiluppo_equipmentPersistence = suiluppo_equipmentPersistence;
	}

	/**
	 * Returns the suiluppo_room local service.
	 *
	 * @return the suiluppo_room local service
	 */
	public com.daffo.suilupposervice.service.suiluppo_roomLocalService getsuiluppo_roomLocalService() {
		return suiluppo_roomLocalService;
	}

	/**
	 * Sets the suiluppo_room local service.
	 *
	 * @param suiluppo_roomLocalService the suiluppo_room local service
	 */
	public void setsuiluppo_roomLocalService(
		com.daffo.suilupposervice.service.suiluppo_roomLocalService suiluppo_roomLocalService) {
		this.suiluppo_roomLocalService = suiluppo_roomLocalService;
	}

	/**
	 * Returns the suiluppo_room persistence.
	 *
	 * @return the suiluppo_room persistence
	 */
	public suiluppo_roomPersistence getsuiluppo_roomPersistence() {
		return suiluppo_roomPersistence;
	}

	/**
	 * Sets the suiluppo_room persistence.
	 *
	 * @param suiluppo_roomPersistence the suiluppo_room persistence
	 */
	public void setsuiluppo_roomPersistence(
		suiluppo_roomPersistence suiluppo_roomPersistence) {
		this.suiluppo_roomPersistence = suiluppo_roomPersistence;
	}

	/**
	 * Returns the suiluppo_room_allocation local service.
	 *
	 * @return the suiluppo_room_allocation local service
	 */
	public suiluppo_room_allocationLocalService getsuiluppo_room_allocationLocalService() {
		return suiluppo_room_allocationLocalService;
	}

	/**
	 * Sets the suiluppo_room_allocation local service.
	 *
	 * @param suiluppo_room_allocationLocalService the suiluppo_room_allocation local service
	 */
	public void setsuiluppo_room_allocationLocalService(
		suiluppo_room_allocationLocalService suiluppo_room_allocationLocalService) {
		this.suiluppo_room_allocationLocalService = suiluppo_room_allocationLocalService;
	}

	/**
	 * Returns the suiluppo_room_allocation persistence.
	 *
	 * @return the suiluppo_room_allocation persistence
	 */
	public suiluppo_room_allocationPersistence getsuiluppo_room_allocationPersistence() {
		return suiluppo_room_allocationPersistence;
	}

	/**
	 * Sets the suiluppo_room_allocation persistence.
	 *
	 * @param suiluppo_room_allocationPersistence the suiluppo_room_allocation persistence
	 */
	public void setsuiluppo_room_allocationPersistence(
		suiluppo_room_allocationPersistence suiluppo_room_allocationPersistence) {
		this.suiluppo_room_allocationPersistence = suiluppo_room_allocationPersistence;
	}

	/**
	 * Returns the suiluppo_room_allocation_archive local service.
	 *
	 * @return the suiluppo_room_allocation_archive local service
	 */
	public com.daffo.suilupposervice.service.suiluppo_room_allocation_archiveLocalService getsuiluppo_room_allocation_archiveLocalService() {
		return suiluppo_room_allocation_archiveLocalService;
	}

	/**
	 * Sets the suiluppo_room_allocation_archive local service.
	 *
	 * @param suiluppo_room_allocation_archiveLocalService the suiluppo_room_allocation_archive local service
	 */
	public void setsuiluppo_room_allocation_archiveLocalService(
		com.daffo.suilupposervice.service.suiluppo_room_allocation_archiveLocalService suiluppo_room_allocation_archiveLocalService) {
		this.suiluppo_room_allocation_archiveLocalService = suiluppo_room_allocation_archiveLocalService;
	}

	/**
	 * Returns the suiluppo_room_allocation_archive persistence.
	 *
	 * @return the suiluppo_room_allocation_archive persistence
	 */
	public suiluppo_room_allocation_archivePersistence getsuiluppo_room_allocation_archivePersistence() {
		return suiluppo_room_allocation_archivePersistence;
	}

	/**
	 * Sets the suiluppo_room_allocation_archive persistence.
	 *
	 * @param suiluppo_room_allocation_archivePersistence the suiluppo_room_allocation_archive persistence
	 */
	public void setsuiluppo_room_allocation_archivePersistence(
		suiluppo_room_allocation_archivePersistence suiluppo_room_allocation_archivePersistence) {
		this.suiluppo_room_allocation_archivePersistence = suiluppo_room_allocation_archivePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.daffo.suilupposervice.model.suiluppo_room_allocation",
			suiluppo_room_allocationLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.daffo.suilupposervice.model.suiluppo_room_allocation");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return suiluppo_room_allocationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return suiluppo_room_allocation.class;
	}

	protected String getModelClassName() {
		return suiluppo_room_allocation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = suiluppo_room_allocationPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.daffo.suilupposervice.service.suiluppo_applicationLocalService.class)
	protected com.daffo.suilupposervice.service.suiluppo_applicationLocalService suiluppo_applicationLocalService;
	@BeanReference(type = suiluppo_applicationPersistence.class)
	protected suiluppo_applicationPersistence suiluppo_applicationPersistence;
	@BeanReference(type = com.daffo.suilupposervice.service.suiluppo_courseLocalService.class)
	protected com.daffo.suilupposervice.service.suiluppo_courseLocalService suiluppo_courseLocalService;
	@BeanReference(type = suiluppo_coursePersistence.class)
	protected suiluppo_coursePersistence suiluppo_coursePersistence;
	@BeanReference(type = com.daffo.suilupposervice.service.suiluppo_equip_allocationLocalService.class)
	protected com.daffo.suilupposervice.service.suiluppo_equip_allocationLocalService suiluppo_equip_allocationLocalService;
	@BeanReference(type = suiluppo_equip_allocationPersistence.class)
	protected suiluppo_equip_allocationPersistence suiluppo_equip_allocationPersistence;
	@BeanReference(type = com.daffo.suilupposervice.service.suiluppo_equipmentLocalService.class)
	protected com.daffo.suilupposervice.service.suiluppo_equipmentLocalService suiluppo_equipmentLocalService;
	@BeanReference(type = suiluppo_equipmentPersistence.class)
	protected suiluppo_equipmentPersistence suiluppo_equipmentPersistence;
	@BeanReference(type = com.daffo.suilupposervice.service.suiluppo_roomLocalService.class)
	protected com.daffo.suilupposervice.service.suiluppo_roomLocalService suiluppo_roomLocalService;
	@BeanReference(type = suiluppo_roomPersistence.class)
	protected suiluppo_roomPersistence suiluppo_roomPersistence;
	@BeanReference(type = suiluppo_room_allocationLocalService.class)
	protected suiluppo_room_allocationLocalService suiluppo_room_allocationLocalService;
	@BeanReference(type = suiluppo_room_allocationPersistence.class)
	protected suiluppo_room_allocationPersistence suiluppo_room_allocationPersistence;
	@BeanReference(type = com.daffo.suilupposervice.service.suiluppo_room_allocation_archiveLocalService.class)
	protected com.daffo.suilupposervice.service.suiluppo_room_allocation_archiveLocalService suiluppo_room_allocation_archiveLocalService;
	@BeanReference(type = suiluppo_room_allocation_archivePersistence.class)
	protected suiluppo_room_allocation_archivePersistence suiluppo_room_allocation_archivePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}
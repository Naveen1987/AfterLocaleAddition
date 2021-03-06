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

package com.roomservice.service.base;

import aQute.bnd.annotation.ProviderType;

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

import com.roomservice.model.BookedEquipment;

import com.roomservice.service.BookedEquipmentLocalService;
import com.roomservice.service.persistence.BookedEquipmentPersistence;
import com.roomservice.service.persistence.EquipmentPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the booked equipment local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.roomservice.service.impl.BookedEquipmentLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.roomservice.service.impl.BookedEquipmentLocalServiceImpl
 * @see com.roomservice.service.BookedEquipmentLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class BookedEquipmentLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements BookedEquipmentLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.roomservice.service.BookedEquipmentLocalServiceUtil} to access the booked equipment local service.
	 */

	/**
	 * Adds the booked equipment to the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookedEquipment the booked equipment
	 * @return the booked equipment that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BookedEquipment addBookedEquipment(BookedEquipment bookedEquipment) {
		bookedEquipment.setNew(true);

		return bookedEquipmentPersistence.update(bookedEquipment);
	}

	/**
	 * Creates a new booked equipment with the primary key. Does not add the booked equipment to the database.
	 *
	 * @param booked_equip_id the primary key for the new booked equipment
	 * @return the new booked equipment
	 */
	@Override
	public BookedEquipment createBookedEquipment(long booked_equip_id) {
		return bookedEquipmentPersistence.create(booked_equip_id);
	}

	/**
	 * Deletes the booked equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param booked_equip_id the primary key of the booked equipment
	 * @return the booked equipment that was removed
	 * @throws PortalException if a booked equipment with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public BookedEquipment deleteBookedEquipment(long booked_equip_id)
		throws PortalException {
		return bookedEquipmentPersistence.remove(booked_equip_id);
	}

	/**
	 * Deletes the booked equipment from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookedEquipment the booked equipment
	 * @return the booked equipment that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public BookedEquipment deleteBookedEquipment(
		BookedEquipment bookedEquipment) {
		return bookedEquipmentPersistence.remove(bookedEquipment);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(BookedEquipment.class,
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
		return bookedEquipmentPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.roomservice.model.impl.BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return bookedEquipmentPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.roomservice.model.impl.BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return bookedEquipmentPersistence.findWithDynamicQuery(dynamicQuery,
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
		return bookedEquipmentPersistence.countWithDynamicQuery(dynamicQuery);
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
		return bookedEquipmentPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public BookedEquipment fetchBookedEquipment(long booked_equip_id) {
		return bookedEquipmentPersistence.fetchByPrimaryKey(booked_equip_id);
	}

	/**
	 * Returns the booked equipment with the primary key.
	 *
	 * @param booked_equip_id the primary key of the booked equipment
	 * @return the booked equipment
	 * @throws PortalException if a booked equipment with the primary key could not be found
	 */
	@Override
	public BookedEquipment getBookedEquipment(long booked_equip_id)
		throws PortalException {
		return bookedEquipmentPersistence.findByPrimaryKey(booked_equip_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(bookedEquipmentLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(BookedEquipment.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("booked_equip_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(bookedEquipmentLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(BookedEquipment.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"booked_equip_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(bookedEquipmentLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(BookedEquipment.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("booked_equip_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return bookedEquipmentLocalService.deleteBookedEquipment((BookedEquipment)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return bookedEquipmentPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the booked equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.roomservice.model.impl.BookedEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of booked equipments
	 * @param end the upper bound of the range of booked equipments (not inclusive)
	 * @return the range of booked equipments
	 */
	@Override
	public List<BookedEquipment> getBookedEquipments(int start, int end) {
		return bookedEquipmentPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of booked equipments.
	 *
	 * @return the number of booked equipments
	 */
	@Override
	public int getBookedEquipmentsCount() {
		return bookedEquipmentPersistence.countAll();
	}

	/**
	 * Updates the booked equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param bookedEquipment the booked equipment
	 * @return the booked equipment that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public BookedEquipment updateBookedEquipment(
		BookedEquipment bookedEquipment) {
		return bookedEquipmentPersistence.update(bookedEquipment);
	}

	/**
	 * Returns the booked equipment local service.
	 *
	 * @return the booked equipment local service
	 */
	public BookedEquipmentLocalService getBookedEquipmentLocalService() {
		return bookedEquipmentLocalService;
	}

	/**
	 * Sets the booked equipment local service.
	 *
	 * @param bookedEquipmentLocalService the booked equipment local service
	 */
	public void setBookedEquipmentLocalService(
		BookedEquipmentLocalService bookedEquipmentLocalService) {
		this.bookedEquipmentLocalService = bookedEquipmentLocalService;
	}

	/**
	 * Returns the booked equipment persistence.
	 *
	 * @return the booked equipment persistence
	 */
	public BookedEquipmentPersistence getBookedEquipmentPersistence() {
		return bookedEquipmentPersistence;
	}

	/**
	 * Sets the booked equipment persistence.
	 *
	 * @param bookedEquipmentPersistence the booked equipment persistence
	 */
	public void setBookedEquipmentPersistence(
		BookedEquipmentPersistence bookedEquipmentPersistence) {
		this.bookedEquipmentPersistence = bookedEquipmentPersistence;
	}

	/**
	 * Returns the equipment local service.
	 *
	 * @return the equipment local service
	 */
	public com.roomservice.service.EquipmentLocalService getEquipmentLocalService() {
		return equipmentLocalService;
	}

	/**
	 * Sets the equipment local service.
	 *
	 * @param equipmentLocalService the equipment local service
	 */
	public void setEquipmentLocalService(
		com.roomservice.service.EquipmentLocalService equipmentLocalService) {
		this.equipmentLocalService = equipmentLocalService;
	}

	/**
	 * Returns the equipment persistence.
	 *
	 * @return the equipment persistence
	 */
	public EquipmentPersistence getEquipmentPersistence() {
		return equipmentPersistence;
	}

	/**
	 * Sets the equipment persistence.
	 *
	 * @param equipmentPersistence the equipment persistence
	 */
	public void setEquipmentPersistence(
		EquipmentPersistence equipmentPersistence) {
		this.equipmentPersistence = equipmentPersistence;
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
		persistedModelLocalServiceRegistry.register("com.roomservice.model.BookedEquipment",
			bookedEquipmentLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.roomservice.model.BookedEquipment");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return BookedEquipmentLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return BookedEquipment.class;
	}

	protected String getModelClassName() {
		return BookedEquipment.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = bookedEquipmentPersistence.getDataSource();

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

	@BeanReference(type = BookedEquipmentLocalService.class)
	protected BookedEquipmentLocalService bookedEquipmentLocalService;
	@BeanReference(type = BookedEquipmentPersistence.class)
	protected BookedEquipmentPersistence bookedEquipmentPersistence;
	@BeanReference(type = com.roomservice.service.EquipmentLocalService.class)
	protected com.roomservice.service.EquipmentLocalService equipmentLocalService;
	@BeanReference(type = EquipmentPersistence.class)
	protected EquipmentPersistence equipmentPersistence;
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
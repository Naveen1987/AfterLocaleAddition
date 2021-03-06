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

package istruzioni_per_la_compilazioneservice.service.base;

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

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child;

import istruzioni_per_la_compilazioneservice.service.istruzioni_per_la_compilazione_childLocalService;

import istruzioni_per_la_compilazioneservice.service.persistence.istruzioni_per_la_compilazionePersistence;
import istruzioni_per_la_compilazioneservice.service.persistence.istruzioni_per_la_compilazione_childPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the istruzioni_per_la_compilazione_child local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link istruzioni_per_la_compilazioneservice.service.impl.istruzioni_per_la_compilazione_childLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazioneservice.service.impl.istruzioni_per_la_compilazione_childLocalServiceImpl
 * @see istruzioni_per_la_compilazioneservice.service.istruzioni_per_la_compilazione_childLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class istruzioni_per_la_compilazione_childLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements istruzioni_per_la_compilazione_childLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link istruzioni_per_la_compilazioneservice.service.istruzioni_per_la_compilazione_childLocalServiceUtil} to access the istruzioni_per_la_compilazione_child local service.
	 */

	/**
	 * Adds the istruzioni_per_la_compilazione_child to the database. Also notifies the appropriate model listeners.
	 *
	 * @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public istruzioni_per_la_compilazione_child addistruzioni_per_la_compilazione_child(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		istruzioni_per_la_compilazione_child.setNew(true);

		return istruzioni_per_la_compilazione_childPersistence.update(istruzioni_per_la_compilazione_child);
	}

	/**
	 * Creates a new istruzioni_per_la_compilazione_child with the primary key. Does not add the istruzioni_per_la_compilazione_child to the database.
	 *
	 * @param Ins_id the primary key for the new istruzioni_per_la_compilazione_child
	 * @return the new istruzioni_per_la_compilazione_child
	 */
	@Override
	public istruzioni_per_la_compilazione_child createistruzioni_per_la_compilazione_child(
		long Ins_id) {
		return istruzioni_per_la_compilazione_childPersistence.create(Ins_id);
	}

	/**
	 * Deletes the istruzioni_per_la_compilazione_child with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child that was removed
	 * @throws PortalException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public istruzioni_per_la_compilazione_child deleteistruzioni_per_la_compilazione_child(
		long Ins_id) throws PortalException {
		return istruzioni_per_la_compilazione_childPersistence.remove(Ins_id);
	}

	/**
	 * Deletes the istruzioni_per_la_compilazione_child from the database. Also notifies the appropriate model listeners.
	 *
	 * @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public istruzioni_per_la_compilazione_child deleteistruzioni_per_la_compilazione_child(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		return istruzioni_per_la_compilazione_childPersistence.remove(istruzioni_per_la_compilazione_child);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(istruzioni_per_la_compilazione_child.class,
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
		return istruzioni_per_la_compilazione_childPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return istruzioni_per_la_compilazione_childPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return istruzioni_per_la_compilazione_childPersistence.findWithDynamicQuery(dynamicQuery,
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
		return istruzioni_per_la_compilazione_childPersistence.countWithDynamicQuery(dynamicQuery);
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
		return istruzioni_per_la_compilazione_childPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public istruzioni_per_la_compilazione_child fetchistruzioni_per_la_compilazione_child(
		long Ins_id) {
		return istruzioni_per_la_compilazione_childPersistence.fetchByPrimaryKey(Ins_id);
	}

	/**
	 * Returns the istruzioni_per_la_compilazione_child with the primary key.
	 *
	 * @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child
	 * @throws PortalException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	 */
	@Override
	public istruzioni_per_la_compilazione_child getistruzioni_per_la_compilazione_child(
		long Ins_id) throws PortalException {
		return istruzioni_per_la_compilazione_childPersistence.findByPrimaryKey(Ins_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(istruzioni_per_la_compilazione_childLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(istruzioni_per_la_compilazione_child.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Ins_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(istruzioni_per_la_compilazione_childLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(istruzioni_per_la_compilazione_child.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("Ins_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(istruzioni_per_la_compilazione_childLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(istruzioni_per_la_compilazione_child.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Ins_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return istruzioni_per_la_compilazione_childLocalService.deleteistruzioni_per_la_compilazione_child((istruzioni_per_la_compilazione_child)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return istruzioni_per_la_compilazione_childPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the istruzioni_per_la_compilazione_childs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazioneservice.model.impl.istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	 * @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	 * @return the range of istruzioni_per_la_compilazione_childs
	 */
	@Override
	public List<istruzioni_per_la_compilazione_child> getistruzioni_per_la_compilazione_childs(
		int start, int end) {
		return istruzioni_per_la_compilazione_childPersistence.findAll(start,
			end);
	}

	/**
	 * Returns the number of istruzioni_per_la_compilazione_childs.
	 *
	 * @return the number of istruzioni_per_la_compilazione_childs
	 */
	@Override
	public int getistruzioni_per_la_compilazione_childsCount() {
		return istruzioni_per_la_compilazione_childPersistence.countAll();
	}

	/**
	 * Updates the istruzioni_per_la_compilazione_child in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	 * @return the istruzioni_per_la_compilazione_child that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public istruzioni_per_la_compilazione_child updateistruzioni_per_la_compilazione_child(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		return istruzioni_per_la_compilazione_childPersistence.update(istruzioni_per_la_compilazione_child);
	}

	/**
	 * Returns the istruzioni_per_la_compilazione local service.
	 *
	 * @return the istruzioni_per_la_compilazione local service
	 */
	public istruzioni_per_la_compilazioneservice.service.istruzioni_per_la_compilazioneLocalService getistruzioni_per_la_compilazioneLocalService() {
		return istruzioni_per_la_compilazioneLocalService;
	}

	/**
	 * Sets the istruzioni_per_la_compilazione local service.
	 *
	 * @param istruzioni_per_la_compilazioneLocalService the istruzioni_per_la_compilazione local service
	 */
	public void setistruzioni_per_la_compilazioneLocalService(
		istruzioni_per_la_compilazioneservice.service.istruzioni_per_la_compilazioneLocalService istruzioni_per_la_compilazioneLocalService) {
		this.istruzioni_per_la_compilazioneLocalService = istruzioni_per_la_compilazioneLocalService;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione persistence.
	 *
	 * @return the istruzioni_per_la_compilazione persistence
	 */
	public istruzioni_per_la_compilazionePersistence getistruzioni_per_la_compilazionePersistence() {
		return istruzioni_per_la_compilazionePersistence;
	}

	/**
	 * Sets the istruzioni_per_la_compilazione persistence.
	 *
	 * @param istruzioni_per_la_compilazionePersistence the istruzioni_per_la_compilazione persistence
	 */
	public void setistruzioni_per_la_compilazionePersistence(
		istruzioni_per_la_compilazionePersistence istruzioni_per_la_compilazionePersistence) {
		this.istruzioni_per_la_compilazionePersistence = istruzioni_per_la_compilazionePersistence;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione_child local service.
	 *
	 * @return the istruzioni_per_la_compilazione_child local service
	 */
	public istruzioni_per_la_compilazione_childLocalService getistruzioni_per_la_compilazione_childLocalService() {
		return istruzioni_per_la_compilazione_childLocalService;
	}

	/**
	 * Sets the istruzioni_per_la_compilazione_child local service.
	 *
	 * @param istruzioni_per_la_compilazione_childLocalService the istruzioni_per_la_compilazione_child local service
	 */
	public void setistruzioni_per_la_compilazione_childLocalService(
		istruzioni_per_la_compilazione_childLocalService istruzioni_per_la_compilazione_childLocalService) {
		this.istruzioni_per_la_compilazione_childLocalService = istruzioni_per_la_compilazione_childLocalService;
	}

	/**
	 * Returns the istruzioni_per_la_compilazione_child persistence.
	 *
	 * @return the istruzioni_per_la_compilazione_child persistence
	 */
	public istruzioni_per_la_compilazione_childPersistence getistruzioni_per_la_compilazione_childPersistence() {
		return istruzioni_per_la_compilazione_childPersistence;
	}

	/**
	 * Sets the istruzioni_per_la_compilazione_child persistence.
	 *
	 * @param istruzioni_per_la_compilazione_childPersistence the istruzioni_per_la_compilazione_child persistence
	 */
	public void setistruzioni_per_la_compilazione_childPersistence(
		istruzioni_per_la_compilazione_childPersistence istruzioni_per_la_compilazione_childPersistence) {
		this.istruzioni_per_la_compilazione_childPersistence = istruzioni_per_la_compilazione_childPersistence;
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
		persistedModelLocalServiceRegistry.register("istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child",
			istruzioni_per_la_compilazione_childLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return istruzioni_per_la_compilazione_childLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return istruzioni_per_la_compilazione_child.class;
	}

	protected String getModelClassName() {
		return istruzioni_per_la_compilazione_child.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = istruzioni_per_la_compilazione_childPersistence.getDataSource();

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

	@BeanReference(type = istruzioni_per_la_compilazioneservice.service.istruzioni_per_la_compilazioneLocalService.class)
	protected istruzioni_per_la_compilazioneservice.service.istruzioni_per_la_compilazioneLocalService istruzioni_per_la_compilazioneLocalService;
	@BeanReference(type = istruzioni_per_la_compilazionePersistence.class)
	protected istruzioni_per_la_compilazionePersistence istruzioni_per_la_compilazionePersistence;
	@BeanReference(type = istruzioni_per_la_compilazione_childLocalService.class)
	protected istruzioni_per_la_compilazione_childLocalService istruzioni_per_la_compilazione_childLocalService;
	@BeanReference(type = istruzioni_per_la_compilazione_childPersistence.class)
	protected istruzioni_per_la_compilazione_childPersistence istruzioni_per_la_compilazione_childPersistence;
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
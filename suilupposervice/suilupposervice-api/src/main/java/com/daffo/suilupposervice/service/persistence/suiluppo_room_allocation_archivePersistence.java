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

package com.daffo.suilupposervice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.daffo.suilupposervice.exception.NoSuchsuiluppo_room_allocation_archiveException;
import com.daffo.suilupposervice.model.suiluppo_room_allocation_archive;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the suiluppo_room_allocation_archive service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Naveen
 * @see com.daffo.suilupposervice.service.persistence.impl.suiluppo_room_allocation_archivePersistenceImpl
 * @see suiluppo_room_allocation_archiveUtil
 * @generated
 */
@ProviderType
public interface suiluppo_room_allocation_archivePersistence
	extends BasePersistence<suiluppo_room_allocation_archive> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link suiluppo_room_allocation_archiveUtil} to access the suiluppo_room_allocation_archive persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the suiluppo_room_allocation_archive in the entity cache if it is enabled.
	*
	* @param suiluppo_room_allocation_archive the suiluppo_room_allocation_archive
	*/
	public void cacheResult(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive);

	/**
	* Caches the suiluppo_room_allocation_archives in the entity cache if it is enabled.
	*
	* @param suiluppo_room_allocation_archives the suiluppo_room_allocation_archives
	*/
	public void cacheResult(
		java.util.List<suiluppo_room_allocation_archive> suiluppo_room_allocation_archives);

	/**
	* Creates a new suiluppo_room_allocation_archive with the primary key. Does not add the suiluppo_room_allocation_archive to the database.
	*
	* @param room_allocat_archive_id the primary key for the new suiluppo_room_allocation_archive
	* @return the new suiluppo_room_allocation_archive
	*/
	public suiluppo_room_allocation_archive create(long room_allocat_archive_id);

	/**
	* Removes the suiluppo_room_allocation_archive with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	* @return the suiluppo_room_allocation_archive that was removed
	* @throws NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	*/
	public suiluppo_room_allocation_archive remove(long room_allocat_archive_id)
		throws NoSuchsuiluppo_room_allocation_archiveException;

	public suiluppo_room_allocation_archive updateImpl(
		suiluppo_room_allocation_archive suiluppo_room_allocation_archive);

	/**
	* Returns the suiluppo_room_allocation_archive with the primary key or throws a {@link NoSuchsuiluppo_room_allocation_archiveException} if it could not be found.
	*
	* @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	* @return the suiluppo_room_allocation_archive
	* @throws NoSuchsuiluppo_room_allocation_archiveException if a suiluppo_room_allocation_archive with the primary key could not be found
	*/
	public suiluppo_room_allocation_archive findByPrimaryKey(
		long room_allocat_archive_id)
		throws NoSuchsuiluppo_room_allocation_archiveException;

	/**
	* Returns the suiluppo_room_allocation_archive with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param room_allocat_archive_id the primary key of the suiluppo_room_allocation_archive
	* @return the suiluppo_room_allocation_archive, or <code>null</code> if a suiluppo_room_allocation_archive with the primary key could not be found
	*/
	public suiluppo_room_allocation_archive fetchByPrimaryKey(
		long room_allocat_archive_id);

	@Override
	public java.util.Map<java.io.Serializable, suiluppo_room_allocation_archive> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the suiluppo_room_allocation_archives.
	*
	* @return the suiluppo_room_allocation_archives
	*/
	public java.util.List<suiluppo_room_allocation_archive> findAll();

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
	public java.util.List<suiluppo_room_allocation_archive> findAll(int start,
		int end);

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
	public java.util.List<suiluppo_room_allocation_archive> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation_archive> orderByComparator);

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
	public java.util.List<suiluppo_room_allocation_archive> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<suiluppo_room_allocation_archive> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the suiluppo_room_allocation_archives from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of suiluppo_room_allocation_archives.
	*
	* @return the number of suiluppo_room_allocation_archives
	*/
	public int countAll();
}
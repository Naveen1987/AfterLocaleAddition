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

package istruzioni_per_la_compilazioneservice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import istruzioni_per_la_compilazioneservice.exception.NoSuch_childException;

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child;

/**
 * The persistence interface for the istruzioni_per_la_compilazione_child service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazioneservice.service.persistence.impl.istruzioni_per_la_compilazione_childPersistenceImpl
 * @see istruzioni_per_la_compilazione_childUtil
 * @generated
 */
@ProviderType
public interface istruzioni_per_la_compilazione_childPersistence
	extends BasePersistence<istruzioni_per_la_compilazione_child> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link istruzioni_per_la_compilazione_childUtil} to access the istruzioni_per_la_compilazione_child persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @return the matching istruzioni_per_la_compilazione_childs
	*/
	public java.util.List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id);

	/**
	* Returns a range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @return the range of matching istruzioni_per_la_compilazione_childs
	*/
	public java.util.List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end);

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching istruzioni_per_la_compilazione_childs
	*/
	public java.util.List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator);

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching istruzioni_per_la_compilazione_childs
	*/
	public java.util.List<istruzioni_per_la_compilazione_child> findByIstruzioni_per_id(
		long Istruzioni_per_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching istruzioni_per_la_compilazione_child
	* @throws NoSuch_childException if a matching istruzioni_per_la_compilazione_child could not be found
	*/
	public istruzioni_per_la_compilazione_child findByIstruzioni_per_id_First(
		long Istruzioni_per_id,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws NoSuch_childException;

	/**
	* Returns the first istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching istruzioni_per_la_compilazione_child, or <code>null</code> if a matching istruzioni_per_la_compilazione_child could not be found
	*/
	public istruzioni_per_la_compilazione_child fetchByIstruzioni_per_id_First(
		long Istruzioni_per_id,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator);

	/**
	* Returns the last istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching istruzioni_per_la_compilazione_child
	* @throws NoSuch_childException if a matching istruzioni_per_la_compilazione_child could not be found
	*/
	public istruzioni_per_la_compilazione_child findByIstruzioni_per_id_Last(
		long Istruzioni_per_id,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws NoSuch_childException;

	/**
	* Returns the last istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching istruzioni_per_la_compilazione_child, or <code>null</code> if a matching istruzioni_per_la_compilazione_child could not be found
	*/
	public istruzioni_per_la_compilazione_child fetchByIstruzioni_per_id_Last(
		long Istruzioni_per_id,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator);

	/**
	* Returns the istruzioni_per_la_compilazione_childs before and after the current istruzioni_per_la_compilazione_child in the ordered set where Istruzioni_per_id = &#63;.
	*
	* @param Ins_id the primary key of the current istruzioni_per_la_compilazione_child
	* @param Istruzioni_per_id the istruzioni_per_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next istruzioni_per_la_compilazione_child
	* @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	public istruzioni_per_la_compilazione_child[] findByIstruzioni_per_id_PrevAndNext(
		long Ins_id, long Istruzioni_per_id,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator)
		throws NoSuch_childException;

	/**
	* Removes all the istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63; from the database.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	*/
	public void removeByIstruzioni_per_id(long Istruzioni_per_id);

	/**
	* Returns the number of istruzioni_per_la_compilazione_childs where Istruzioni_per_id = &#63;.
	*
	* @param Istruzioni_per_id the istruzioni_per_id
	* @return the number of matching istruzioni_per_la_compilazione_childs
	*/
	public int countByIstruzioni_per_id(long Istruzioni_per_id);

	/**
	* Caches the istruzioni_per_la_compilazione_child in the entity cache if it is enabled.
	*
	* @param istruzioni_per_la_compilazione_child the istruzioni_per_la_compilazione_child
	*/
	public void cacheResult(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child);

	/**
	* Caches the istruzioni_per_la_compilazione_childs in the entity cache if it is enabled.
	*
	* @param istruzioni_per_la_compilazione_childs the istruzioni_per_la_compilazione_childs
	*/
	public void cacheResult(
		java.util.List<istruzioni_per_la_compilazione_child> istruzioni_per_la_compilazione_childs);

	/**
	* Creates a new istruzioni_per_la_compilazione_child with the primary key. Does not add the istruzioni_per_la_compilazione_child to the database.
	*
	* @param Ins_id the primary key for the new istruzioni_per_la_compilazione_child
	* @return the new istruzioni_per_la_compilazione_child
	*/
	public istruzioni_per_la_compilazione_child create(long Ins_id);

	/**
	* Removes the istruzioni_per_la_compilazione_child with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child that was removed
	* @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	public istruzioni_per_la_compilazione_child remove(long Ins_id)
		throws NoSuch_childException;

	public istruzioni_per_la_compilazione_child updateImpl(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child);

	/**
	* Returns the istruzioni_per_la_compilazione_child with the primary key or throws a {@link NoSuch_childException} if it could not be found.
	*
	* @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child
	* @throws NoSuch_childException if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	public istruzioni_per_la_compilazione_child findByPrimaryKey(long Ins_id)
		throws NoSuch_childException;

	/**
	* Returns the istruzioni_per_la_compilazione_child with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Ins_id the primary key of the istruzioni_per_la_compilazione_child
	* @return the istruzioni_per_la_compilazione_child, or <code>null</code> if a istruzioni_per_la_compilazione_child with the primary key could not be found
	*/
	public istruzioni_per_la_compilazione_child fetchByPrimaryKey(long Ins_id);

	@Override
	public java.util.Map<java.io.Serializable, istruzioni_per_la_compilazione_child> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the istruzioni_per_la_compilazione_childs.
	*
	* @return the istruzioni_per_la_compilazione_childs
	*/
	public java.util.List<istruzioni_per_la_compilazione_child> findAll();

	/**
	* Returns a range of all the istruzioni_per_la_compilazione_childs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @return the range of istruzioni_per_la_compilazione_childs
	*/
	public java.util.List<istruzioni_per_la_compilazione_child> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilazione_childs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of istruzioni_per_la_compilazione_childs
	*/
	public java.util.List<istruzioni_per_la_compilazione_child> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator);

	/**
	* Returns an ordered range of all the istruzioni_per_la_compilazione_childs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istruzioni_per_la_compilazione_childModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istruzioni_per_la_compilazione_childs
	* @param end the upper bound of the range of istruzioni_per_la_compilazione_childs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of istruzioni_per_la_compilazione_childs
	*/
	public java.util.List<istruzioni_per_la_compilazione_child> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione_child> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the istruzioni_per_la_compilazione_childs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of istruzioni_per_la_compilazione_childs.
	*
	* @return the number of istruzioni_per_la_compilazione_childs
	*/
	public int countAll();
}
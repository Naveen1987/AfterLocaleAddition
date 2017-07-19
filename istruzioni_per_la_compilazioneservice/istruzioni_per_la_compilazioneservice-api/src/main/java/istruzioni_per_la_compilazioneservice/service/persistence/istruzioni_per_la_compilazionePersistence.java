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

import istruzioni_per_la_compilazioneservice.exception.NoSuchistruzioni_per_la_compilazioneException;

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione;

/**
 * The persistence interface for the istruzioni_per_la_compilazione service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazioneservice.service.persistence.impl.istruzioni_per_la_compilazionePersistenceImpl
 * @see istruzioni_per_la_compilazioneUtil
 * @generated
 */
@ProviderType
public interface istruzioni_per_la_compilazionePersistence
	extends BasePersistence<istruzioni_per_la_compilazione> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link istruzioni_per_la_compilazioneUtil} to access the istruzioni_per_la_compilazione persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the istruzioni_per_la_compilazione in the entity cache if it is enabled.
	*
	* @param istruzioni_per_la_compilazione the istruzioni_per_la_compilazione
	*/
	public void cacheResult(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione);

	/**
	* Caches the istruzioni_per_la_compilaziones in the entity cache if it is enabled.
	*
	* @param istruzioni_per_la_compilaziones the istruzioni_per_la_compilaziones
	*/
	public void cacheResult(
		java.util.List<istruzioni_per_la_compilazione> istruzioni_per_la_compilaziones);

	/**
	* Creates a new istruzioni_per_la_compilazione with the primary key. Does not add the istruzioni_per_la_compilazione to the database.
	*
	* @param Istruzioni_per_id the primary key for the new istruzioni_per_la_compilazione
	* @return the new istruzioni_per_la_compilazione
	*/
	public istruzioni_per_la_compilazione create(long Istruzioni_per_id);

	/**
	* Removes the istruzioni_per_la_compilazione with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione that was removed
	* @throws NoSuchistruzioni_per_la_compilazioneException if a istruzioni_per_la_compilazione with the primary key could not be found
	*/
	public istruzioni_per_la_compilazione remove(long Istruzioni_per_id)
		throws NoSuchistruzioni_per_la_compilazioneException;

	public istruzioni_per_la_compilazione updateImpl(
		istruzioni_per_la_compilazione istruzioni_per_la_compilazione);

	/**
	* Returns the istruzioni_per_la_compilazione with the primary key or throws a {@link NoSuchistruzioni_per_la_compilazioneException} if it could not be found.
	*
	* @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione
	* @throws NoSuchistruzioni_per_la_compilazioneException if a istruzioni_per_la_compilazione with the primary key could not be found
	*/
	public istruzioni_per_la_compilazione findByPrimaryKey(
		long Istruzioni_per_id)
		throws NoSuchistruzioni_per_la_compilazioneException;

	/**
	* Returns the istruzioni_per_la_compilazione with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Istruzioni_per_id the primary key of the istruzioni_per_la_compilazione
	* @return the istruzioni_per_la_compilazione, or <code>null</code> if a istruzioni_per_la_compilazione with the primary key could not be found
	*/
	public istruzioni_per_la_compilazione fetchByPrimaryKey(
		long Istruzioni_per_id);

	@Override
	public java.util.Map<java.io.Serializable, istruzioni_per_la_compilazione> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the istruzioni_per_la_compilaziones.
	*
	* @return the istruzioni_per_la_compilaziones
	*/
	public java.util.List<istruzioni_per_la_compilazione> findAll();

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
	public java.util.List<istruzioni_per_la_compilazione> findAll(int start,
		int end);

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
	public java.util.List<istruzioni_per_la_compilazione> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione> orderByComparator);

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
	public java.util.List<istruzioni_per_la_compilazione> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<istruzioni_per_la_compilazione> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the istruzioni_per_la_compilaziones from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of istruzioni_per_la_compilaziones.
	*
	* @return the number of istruzioni_per_la_compilaziones
	*/
	public int countAll();
}
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

package com.daffo.suilupposervice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.daffo.suilupposervice.model.suiluppo_equipment;
import com.daffo.suilupposervice.model.suiluppo_equipmentModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the suiluppo_equipment service. Represents a row in the &quot;suiluppo_equipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link suiluppo_equipmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link suiluppo_equipmentImpl}.
 * </p>
 *
 * @author Naveen
 * @see suiluppo_equipmentImpl
 * @see suiluppo_equipment
 * @see suiluppo_equipmentModel
 * @generated
 */
@ProviderType
public class suiluppo_equipmentModelImpl extends BaseModelImpl<suiluppo_equipment>
	implements suiluppo_equipmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a suiluppo_equipment model instance should use the {@link suiluppo_equipment} interface instead.
	 */
	public static final String TABLE_NAME = "suiluppo_equipment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "equip_id", Types.BIGINT },
			{ "equip_name", Types.VARCHAR },
			{ "equip_quanity", Types.BIGINT },
			{ "equip_description", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("equip_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("equip_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equip_quanity", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("equip_description", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table suiluppo_equipment (equip_id LONG not null primary key,equip_name VARCHAR(75) null,equip_quanity LONG,equip_description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table suiluppo_equipment";
	public static final String ORDER_BY_JPQL = " ORDER BY suiluppo_equipment.equip_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY suiluppo_equipment.equip_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.daffo.suilupposervice.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.daffo.suilupposervice.model.suiluppo_equipment"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.daffo.suilupposervice.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.daffo.suilupposervice.model.suiluppo_equipment"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.daffo.suilupposervice.service.util.ServiceProps.get(
				"lock.expiration.time.com.daffo.suilupposervice.model.suiluppo_equipment"));

	public suiluppo_equipmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _equip_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEquip_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _equip_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return suiluppo_equipment.class;
	}

	@Override
	public String getModelClassName() {
		return suiluppo_equipment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("equip_id", getEquip_id());
		attributes.put("equip_name", getEquip_name());
		attributes.put("equip_quanity", getEquip_quanity());
		attributes.put("equip_description", getEquip_description());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long equip_id = (Long)attributes.get("equip_id");

		if (equip_id != null) {
			setEquip_id(equip_id);
		}

		String equip_name = (String)attributes.get("equip_name");

		if (equip_name != null) {
			setEquip_name(equip_name);
		}

		Long equip_quanity = (Long)attributes.get("equip_quanity");

		if (equip_quanity != null) {
			setEquip_quanity(equip_quanity);
		}

		String equip_description = (String)attributes.get("equip_description");

		if (equip_description != null) {
			setEquip_description(equip_description);
		}
	}

	@Override
	public long getEquip_id() {
		return _equip_id;
	}

	@Override
	public void setEquip_id(long equip_id) {
		_equip_id = equip_id;
	}

	@Override
	public String getEquip_name() {
		if (_equip_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _equip_name;
		}
	}

	@Override
	public void setEquip_name(String equip_name) {
		_equip_name = equip_name;
	}

	@Override
	public long getEquip_quanity() {
		return _equip_quanity;
	}

	@Override
	public void setEquip_quanity(long equip_quanity) {
		_equip_quanity = equip_quanity;
	}

	@Override
	public String getEquip_description() {
		if (_equip_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _equip_description;
		}
	}

	@Override
	public void setEquip_description(String equip_description) {
		_equip_description = equip_description;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			suiluppo_equipment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public suiluppo_equipment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (suiluppo_equipment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		suiluppo_equipmentImpl suiluppo_equipmentImpl = new suiluppo_equipmentImpl();

		suiluppo_equipmentImpl.setEquip_id(getEquip_id());
		suiluppo_equipmentImpl.setEquip_name(getEquip_name());
		suiluppo_equipmentImpl.setEquip_quanity(getEquip_quanity());
		suiluppo_equipmentImpl.setEquip_description(getEquip_description());

		suiluppo_equipmentImpl.resetOriginalValues();

		return suiluppo_equipmentImpl;
	}

	@Override
	public int compareTo(suiluppo_equipment suiluppo_equipment) {
		long primaryKey = suiluppo_equipment.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof suiluppo_equipment)) {
			return false;
		}

		suiluppo_equipment suiluppo_equipment = (suiluppo_equipment)obj;

		long primaryKey = suiluppo_equipment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<suiluppo_equipment> toCacheModel() {
		suiluppo_equipmentCacheModel suiluppo_equipmentCacheModel = new suiluppo_equipmentCacheModel();

		suiluppo_equipmentCacheModel.equip_id = getEquip_id();

		suiluppo_equipmentCacheModel.equip_name = getEquip_name();

		String equip_name = suiluppo_equipmentCacheModel.equip_name;

		if ((equip_name != null) && (equip_name.length() == 0)) {
			suiluppo_equipmentCacheModel.equip_name = null;
		}

		suiluppo_equipmentCacheModel.equip_quanity = getEquip_quanity();

		suiluppo_equipmentCacheModel.equip_description = getEquip_description();

		String equip_description = suiluppo_equipmentCacheModel.equip_description;

		if ((equip_description != null) && (equip_description.length() == 0)) {
			suiluppo_equipmentCacheModel.equip_description = null;
		}

		return suiluppo_equipmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{equip_id=");
		sb.append(getEquip_id());
		sb.append(", equip_name=");
		sb.append(getEquip_name());
		sb.append(", equip_quanity=");
		sb.append(getEquip_quanity());
		sb.append(", equip_description=");
		sb.append(getEquip_description());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.daffo.suilupposervice.model.suiluppo_equipment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>equip_id</column-name><column-value><![CDATA[");
		sb.append(getEquip_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equip_name</column-name><column-value><![CDATA[");
		sb.append(getEquip_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equip_quanity</column-name><column-value><![CDATA[");
		sb.append(getEquip_quanity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equip_description</column-name><column-value><![CDATA[");
		sb.append(getEquip_description());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = suiluppo_equipment.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			suiluppo_equipment.class
		};
	private long _equip_id;
	private String _equip_name;
	private long _equip_quanity;
	private String _equip_description;
	private suiluppo_equipment _escapedModel;
}
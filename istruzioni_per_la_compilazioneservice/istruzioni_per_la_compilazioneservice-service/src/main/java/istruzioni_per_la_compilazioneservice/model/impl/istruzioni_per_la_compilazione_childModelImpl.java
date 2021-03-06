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

package istruzioni_per_la_compilazioneservice.model.impl;

import aQute.bnd.annotation.ProviderType;

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

import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child;
import istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_childModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the istruzioni_per_la_compilazione_child service. Represents a row in the &quot;istruzioni_per_la_compilazione_child&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link istruzioni_per_la_compilazione_childModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link istruzioni_per_la_compilazione_childImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istruzioni_per_la_compilazione_childImpl
 * @see istruzioni_per_la_compilazione_child
 * @see istruzioni_per_la_compilazione_childModel
 * @generated
 */
@ProviderType
public class istruzioni_per_la_compilazione_childModelImpl extends BaseModelImpl<istruzioni_per_la_compilazione_child>
	implements istruzioni_per_la_compilazione_childModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a istruzioni_per_la_compilazione_child model instance should use the {@link istruzioni_per_la_compilazione_child} interface instead.
	 */
	public static final String TABLE_NAME = "istruzioni_per_la_compilazione_child";
	public static final Object[][] TABLE_COLUMNS = {
			{ "Ins_id", Types.BIGINT },
			{ "Instruction", Types.VARCHAR },
			{ "Istruzioni_per_id", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("Ins_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("Instruction", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Istruzioni_per_id", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table istruzioni_per_la_compilazione_child (Ins_id LONG not null primary key,Instruction VARCHAR(75) null,Istruzioni_per_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table istruzioni_per_la_compilazione_child";
	public static final String ORDER_BY_JPQL = " ORDER BY istruzioni_per_la_compilazione_child.Ins_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY istruzioni_per_la_compilazione_child.Ins_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(istruzioni_per_la_compilazioneservice.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(istruzioni_per_la_compilazioneservice.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(istruzioni_per_la_compilazioneservice.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child"),
			true);
	public static final long ISTRUZIONI_PER_ID_COLUMN_BITMASK = 1L;
	public static final long INS_ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(istruzioni_per_la_compilazioneservice.service.util.ServiceProps.get(
				"lock.expiration.time.istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child"));

	public istruzioni_per_la_compilazione_childModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _Ins_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIns_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Ins_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return istruzioni_per_la_compilazione_child.class;
	}

	@Override
	public String getModelClassName() {
		return istruzioni_per_la_compilazione_child.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Ins_id", getIns_id());
		attributes.put("Instruction", getInstruction());
		attributes.put("Istruzioni_per_id", getIstruzioni_per_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Ins_id = (Long)attributes.get("Ins_id");

		if (Ins_id != null) {
			setIns_id(Ins_id);
		}

		String Instruction = (String)attributes.get("Instruction");

		if (Instruction != null) {
			setInstruction(Instruction);
		}

		Long Istruzioni_per_id = (Long)attributes.get("Istruzioni_per_id");

		if (Istruzioni_per_id != null) {
			setIstruzioni_per_id(Istruzioni_per_id);
		}
	}

	@Override
	public long getIns_id() {
		return _Ins_id;
	}

	@Override
	public void setIns_id(long Ins_id) {
		_Ins_id = Ins_id;
	}

	@Override
	public String getInstruction() {
		if (_Instruction == null) {
			return StringPool.BLANK;
		}
		else {
			return _Instruction;
		}
	}

	@Override
	public void setInstruction(String Instruction) {
		_Instruction = Instruction;
	}

	@Override
	public long getIstruzioni_per_id() {
		return _Istruzioni_per_id;
	}

	@Override
	public void setIstruzioni_per_id(long Istruzioni_per_id) {
		_columnBitmask |= ISTRUZIONI_PER_ID_COLUMN_BITMASK;

		if (!_setOriginalIstruzioni_per_id) {
			_setOriginalIstruzioni_per_id = true;

			_originalIstruzioni_per_id = _Istruzioni_per_id;
		}

		_Istruzioni_per_id = Istruzioni_per_id;
	}

	public long getOriginalIstruzioni_per_id() {
		return _originalIstruzioni_per_id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			istruzioni_per_la_compilazione_child.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public istruzioni_per_la_compilazione_child toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (istruzioni_per_la_compilazione_child)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		istruzioni_per_la_compilazione_childImpl istruzioni_per_la_compilazione_childImpl =
			new istruzioni_per_la_compilazione_childImpl();

		istruzioni_per_la_compilazione_childImpl.setIns_id(getIns_id());
		istruzioni_per_la_compilazione_childImpl.setInstruction(getInstruction());
		istruzioni_per_la_compilazione_childImpl.setIstruzioni_per_id(getIstruzioni_per_id());

		istruzioni_per_la_compilazione_childImpl.resetOriginalValues();

		return istruzioni_per_la_compilazione_childImpl;
	}

	@Override
	public int compareTo(
		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child) {
		long primaryKey = istruzioni_per_la_compilazione_child.getPrimaryKey();

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

		if (!(obj instanceof istruzioni_per_la_compilazione_child)) {
			return false;
		}

		istruzioni_per_la_compilazione_child istruzioni_per_la_compilazione_child =
			(istruzioni_per_la_compilazione_child)obj;

		long primaryKey = istruzioni_per_la_compilazione_child.getPrimaryKey();

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
		istruzioni_per_la_compilazione_childModelImpl istruzioni_per_la_compilazione_childModelImpl =
			this;

		istruzioni_per_la_compilazione_childModelImpl._originalIstruzioni_per_id = istruzioni_per_la_compilazione_childModelImpl._Istruzioni_per_id;

		istruzioni_per_la_compilazione_childModelImpl._setOriginalIstruzioni_per_id = false;

		istruzioni_per_la_compilazione_childModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<istruzioni_per_la_compilazione_child> toCacheModel() {
		istruzioni_per_la_compilazione_childCacheModel istruzioni_per_la_compilazione_childCacheModel =
			new istruzioni_per_la_compilazione_childCacheModel();

		istruzioni_per_la_compilazione_childCacheModel.Ins_id = getIns_id();

		istruzioni_per_la_compilazione_childCacheModel.Instruction = getInstruction();

		String Instruction = istruzioni_per_la_compilazione_childCacheModel.Instruction;

		if ((Instruction != null) && (Instruction.length() == 0)) {
			istruzioni_per_la_compilazione_childCacheModel.Instruction = null;
		}

		istruzioni_per_la_compilazione_childCacheModel.Istruzioni_per_id = getIstruzioni_per_id();

		return istruzioni_per_la_compilazione_childCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{Ins_id=");
		sb.append(getIns_id());
		sb.append(", Instruction=");
		sb.append(getInstruction());
		sb.append(", Istruzioni_per_id=");
		sb.append(getIstruzioni_per_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"istruzioni_per_la_compilazioneservice.model.istruzioni_per_la_compilazione_child");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Ins_id</column-name><column-value><![CDATA[");
		sb.append(getIns_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Instruction</column-name><column-value><![CDATA[");
		sb.append(getInstruction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Istruzioni_per_id</column-name><column-value><![CDATA[");
		sb.append(getIstruzioni_per_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = istruzioni_per_la_compilazione_child.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			istruzioni_per_la_compilazione_child.class
		};
	private long _Ins_id;
	private String _Instruction;
	private long _Istruzioni_per_id;
	private long _originalIstruzioni_per_id;
	private boolean _setOriginalIstruzioni_per_id;
	private long _columnBitmask;
	private istruzioni_per_la_compilazione_child _escapedModel;
}
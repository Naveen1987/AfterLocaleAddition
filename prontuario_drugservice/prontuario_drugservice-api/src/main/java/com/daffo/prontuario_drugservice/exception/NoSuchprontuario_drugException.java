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
package com.daffo.prontuario_drugservice.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
@ProviderType
public class NoSuchprontuario_drugException extends NoSuchModelException {

	public NoSuchprontuario_drugException() {
	}

	public NoSuchprontuario_drugException(String msg) {
		super(msg);
	}

	public NoSuchprontuario_drugException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchprontuario_drugException(Throwable cause) {
		super(cause);
	}

}
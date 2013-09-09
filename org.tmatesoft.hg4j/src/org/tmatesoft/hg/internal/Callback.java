/*
 * Copyright (c) 2012 TMate Software Ltd
 *  
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@hg4j.com
 */
package org.tmatesoft.hg.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.tmatesoft.hg.core.HgCallbackTargetException;

/**
 * Marker to ease location of callback interfaces in the API.
 * 
 * All classes/interfaces supposed to be subclassed/implemented by users, with methods throwing {@link HgCallbackTargetException} shall bear the mark.
 * Besides, classes that are low-level callbacks (from {@link org.tmatesoft.hg.repo}) shall bear it, too.
 * 
 * @author Artem Tikhomirov
 * @author TMate Software Ltd.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.TYPE })
public @interface Callback {
}

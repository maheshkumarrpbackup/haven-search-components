/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.searchcomponents.core.config;

//TODO delete once we are on Java 8
public interface FieldValueParser<T> {
    T parse(final String value);
}
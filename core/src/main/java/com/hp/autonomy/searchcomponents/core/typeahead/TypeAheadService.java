/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.searchcomponents.core.typeahead;

import java.util.List;

@FunctionalInterface
public interface TypeAheadService<E extends Exception> {

    List<String> getSuggestions(String text) throws E;

}

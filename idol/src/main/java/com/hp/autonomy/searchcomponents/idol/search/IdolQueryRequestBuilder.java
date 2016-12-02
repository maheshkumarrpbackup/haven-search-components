/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.searchcomponents.idol.search;

import com.hp.autonomy.searchcomponents.core.search.QueryRequestBuilder;

/**
 * Builder for {@link IdolQueryRequest}
 */
public interface IdolQueryRequestBuilder extends IdolSearchRequestBuilder<IdolQueryRequest, IdolQueryRequestBuilder>, QueryRequestBuilder<IdolQueryRequest, IdolQueryRestrictions, IdolQueryRequestBuilder> {
}

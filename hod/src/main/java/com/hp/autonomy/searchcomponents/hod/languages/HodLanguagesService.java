/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.searchcomponents.hod.languages;

import com.hp.autonomy.searchcomponents.core.languages.LanguagesService;

/**
 * HoD extension to {@link LanguagesService}
 */
@SuppressWarnings("WeakerAccess")
public interface HodLanguagesService extends LanguagesService {
    /**
     * The only language supported by HoD
     */
    String THE_LANGUAGE = "English";
}

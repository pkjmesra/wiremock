/*
 * Copyright (C) 2011 Thomas Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.tomakehurst.wiremock.extension.responsetemplating.helpers;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;

import java.io.IOException;
import java.util.Date;

/**
 * This enum is implemented similar to the StringHelpers of handlebars.
 * It is basically a library of all available wiremock helpers
 */
public enum WireMockHelpers implements Helper<Object> {
    xPath {
        private HandlebarsXPathHelper helper = new HandlebarsXPathHelper();

        @Override
        public Object apply(final Object context, final Options options) throws IOException {
            return this.helper.apply(String.valueOf(context), options);
        }
    },
    soapXPath {
        private HandlebarsSoapHelper helper = new HandlebarsSoapHelper();

        @Override
        public Object apply(final Object context, final Options options) throws IOException {
            return this.helper.apply(String.valueOf(context), options);
        }
    },
    jsonPath {
        private HandlebarsJsonPathHelper helper = new HandlebarsJsonPathHelper();

        @Override
        public Object apply(final Object context, final Options options) throws IOException {
            return this.helper.apply(context, options);
        }
    },
    randomValue {
        private HandlebarsRandomValuesHelper helper = new HandlebarsRandomValuesHelper();

        @Override
        public Object apply(final Object context, final Options options) throws IOException {
            return this.helper.apply(null, options);
        }
    },
    hostname {
        private HostnameHelper helper = new HostnameHelper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return this.helper.apply(context, options);
        }
    },
    systemValue {
        private SystemValueHelper helper = new SystemValueHelper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return this.helper.apply(null, options);
        }
    },
    date {
        private HandlebarsCurrentDateHelper helper = new HandlebarsCurrentDateHelper();

        @Override
        public Object apply(final Object context, final Options options) throws IOException {
            Date dateContext = context instanceof Date ? (Date) context : null;
            return this.helper.apply(dateContext, options);
        }
    },
    now {
        private HandlebarsCurrentDateHelper helper = new HandlebarsCurrentDateHelper();

        @Override
        public Object apply(final Object context, final Options options) throws IOException {
            return this.helper.apply(null, options);
        }
    },
    parseDate {
        private ParseDateHelper helper = new ParseDateHelper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return helper.apply(context.toString(), options);
        }
    },

    trim {
        private StringTrimHelper helper = new StringTrimHelper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return helper.apply(context, options);
        }
    },

    base64 {
        private Base64Helper helper = new Base64Helper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return helper.apply(context, options);
        }
    },

    urlEncode {
        private UrlEncodingHelper helper = new UrlEncodingHelper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return helper.apply(context, options);
        }
    },

    formData {
        private FormDataHelper helper = new FormDataHelper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return helper.apply(context, options);
        }
    },

    regexExtract {
        private RegexExtractHelper helper = new RegexExtractHelper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return helper.apply(context, options);
        }
    },

    size {
        private SizeHelper helper = new SizeHelper();

        @Override
        public Object apply(Object context, Options options) throws IOException {
            return helper.apply(context, options);
        }
    }




}

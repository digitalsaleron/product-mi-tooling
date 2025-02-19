/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *
 */

package org.wso2.ei.dashboard.core.commons;

import java.io.File;

/**
 * Constants for the dashboard core.
 */
public final class Constants {

    private Constants() {

    }

    public static final String PROXY_SERVICES = "proxy-services";
    public static final String ENDPOINTS = "endpoints";
    public static final String INBOUND_ENDPOINTS = "inbound-endpoints";
    public static final String MESSAGE_STORES = "message-stores";
    public static final String MESSAGE_PROCESSORS = "message-processors";
    public static final String APIS = "apis";
    public static final String TEMPLATES = "templates";
    public static final String ENDPOINT_TEMPLATE = "templates_endpoint";
    public static final String SEQUENCE_TEMPLATE = "templates_sequence";
    public static final String SEQUENCES = "sequences";
    public static final String TASKS = "tasks";
    public static final String LOCAL_ENTRIES = "local-entries";
    public static final String CONNECTORS = "connectors";
    public static final String CARBON_APPLICATIONS = "applications";
    public static final String DATA_SERVICES = "data-services";
    public static final String DATA_SOURCES = "data-sources";

    public static final String SUCCESS_STATUS = "success";
    public static final String FAIL_STATUS = "fail";

    public static final String HEADER_VALUE_APPLICATION_JSON = "application/json";
    public static final String APPLICATION_X_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";

    public static final String DASHBOARD_HOME = System.getProperty("dashboard.home");
    public static final String HEARTBEAT_POOL_SIZE = System.getProperty("heartbeat_pool_size");
    public static final String DATABASE_URL = "jdbc:h2:mem:ei-dashboard-db;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM '"
                                              + Constants.DASHBOARD_HOME + File.separator + "dbscripts" + File.separator
                                              + "h2.sql'";
    public static final String DATABASE_USERNAME = "wso2carbon";
    public static final String DATABASE_PASSWORD = "wso2carbon";

    public static final String EMPTY_STRING = "";
    public static final String LIST_ATTRIBUTE = "list";

    public static final int TOKEN_CACHE_TIMEOUT = 60;

    public static final String JWKS_URI = "jwks_uri";
    public static final String INTROSPECTION_URI = "introspection_endpoint";
    public static final String USERINFO_URI = "userinfo_endpoint";

    public static final String TOKEN = "token";
    public static final String CLIENT_ID = "client_id";
    public static final String CLIENT_SECRET = "client_secret";
    public static final String ACTIVE = "active";
    public static final String SCOPE = "scope";
    public static final String ADMIN = "admin";

}

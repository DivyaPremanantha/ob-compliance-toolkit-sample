/**
 * Copyright (c) 2023, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.wso2.openbanking.fdx.identity.dcr.constants;


/**
 * Constants used for FDX specific validations.
 */
public class FDXValidationConstants {

    // dcr constants
    public static final String OPENID = "openid";
    public static final String OFFLINE_ACCESS = "offline_access";
    public static final String GRANT_TYPES = "grant_types";
    public static final String TOKEN_ENDPOINT_AUTH_METHOD = "token_endpoint_auth_method";

    public static final String SOFTWARE_REDIRECT_URIS = "software_redirect_uris";

    // dcr config constants
    public static final String DCR_MAXIMUM_DURATION_PERIOD = "DCR.MaximumDurationPeriod";

    public static final String DCR_MAXIMUM_LOOKBACK_PERIOD = "DCR.MaximumLookbackPeriod";

    public static final String DCR_DEFAULT_TOKEN_ENDPOINT_AUTH_METHOD = "DCR.DefaultTokenEndpointAuthMethod";
}
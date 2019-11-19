/*
 *
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.dromara.soul.common.http;

import java.util.Map;

import lombok.Data;

/**
 * Request
 * CreateDate: 2019/10/14 18:29
 *
 * @author sixh
 */
@Data
public class HttpSoulRequest {
    /**
     * Requested id;
     */
    private String id;

    private HttpMethod method;
    /**
     * json string.
     */
    private String body;
    /**
     * The Headers.
     */
    private Map<String, String> headers;

    private Map<String, String> params;

    private URL url;

    private HttpStatus status;
}

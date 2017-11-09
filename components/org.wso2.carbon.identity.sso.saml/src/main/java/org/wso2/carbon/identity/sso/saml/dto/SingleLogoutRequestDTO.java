/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.sso.saml.dto;

import java.io.Serializable;

public class SingleLogoutRequestDTO implements Serializable {

    private static final long serialVersionUID = -5086237688925774301L;

    private String singleLogoutRequestUrl;
    private String logoutRequest;
    private String rpSessionId;

    public String getSingleLogoutRequestURL() {
        return singleLogoutRequestUrl;
    }

    public void setSingleLogoutRequestURL(String singleLogoutRequestURL) {
        this.singleLogoutRequestUrl = singleLogoutRequestURL;
    }

    public String getLogoutRequest() {
        return logoutRequest;
    }

    public void setLogoutRequest(String logoutRequest) {
        this.logoutRequest = logoutRequest;
    }

    public String getRpSessionId() {
        return rpSessionId;
    }

    public void setRpSessionId(String rpSessionId) {
        this.rpSessionId = rpSessionId;
    }
}
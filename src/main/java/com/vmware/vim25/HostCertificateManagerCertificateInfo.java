package com.vmware.vim25;

import java.util.Calendar;

/**
 * Created by Michael Rice on Sun May 24 07:03:51 CDT 2015
 * <p/>
 * Copyright 2015 Michael Rice
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @since 6.0
 */

public class HostCertificateManagerCertificateInfo extends DynamicData {
    public String issuer;
    public Calendar notBefore;
    public Calendar notAfter;
    public String subject;
    public String status;

    public String getIssuer() {
        return this.issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Calendar getNotBefore() {
        return this.notBefore;
    }

    public void setNotBefore(Calendar notBefore) {
        this.notBefore = notBefore;
    }

    public Calendar getNotAfter() {
        return this.notAfter;
    }

    public void setNotAfter(Calendar notAfter) {
        this.notAfter = notAfter;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

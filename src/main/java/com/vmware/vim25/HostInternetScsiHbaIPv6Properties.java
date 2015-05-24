package com.vmware.vim25;

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

public class HostInternetScsiHbaIPv6Properties extends DynamicData {
    public HostInternetScsiHbaIscsiIpv6Address[] iscsiIpv6Address;
    public Boolean ipv6DhcpConfigurationEnabled;
    public Boolean ipv6LinkLocalAutoConfigurationEnabled;
    public Boolean ipv6RouterAdvertisementConfigurationEnabled;
    public String ipv6DefaultGateway;

    public HostInternetScsiHbaIscsiIpv6Address[] getIscsiIpv6Address() {
        return this.iscsiIpv6Address;
    }

    public void setIscsiIpv6Address(HostInternetScsiHbaIscsiIpv6Address[] iscsiIpv6Address) {
        this.iscsiIpv6Address = iscsiIpv6Address;
    }

    public Boolean getIpv6DhcpConfigurationEnabled() {
        return this.ipv6DhcpConfigurationEnabled;
    }

    public void setIpv6DhcpConfigurationEnabled(Boolean ipv6DhcpConfigurationEnabled) {
        this.ipv6DhcpConfigurationEnabled = ipv6DhcpConfigurationEnabled;
    }

    public Boolean getIpv6LinkLocalAutoConfigurationEnabled() {
        return this.ipv6LinkLocalAutoConfigurationEnabled;
    }

    public void setIpv6LinkLocalAutoConfigurationEnabled(Boolean ipv6LinkLocalAutoConfigurationEnabled) {
        this.ipv6LinkLocalAutoConfigurationEnabled = ipv6LinkLocalAutoConfigurationEnabled;
    }

    public Boolean getIpv6RouterAdvertisementConfigurationEnabled() {
        return this.ipv6RouterAdvertisementConfigurationEnabled;
    }

    public void setIpv6RouterAdvertisementConfigurationEnabled(Boolean ipv6RouterAdvertisementConfigurationEnabled) {
        this.ipv6RouterAdvertisementConfigurationEnabled = ipv6RouterAdvertisementConfigurationEnabled;
    }

    public String getIpv6DefaultGateway() {
        return this.ipv6DefaultGateway;
    }

    public void setIpv6DefaultGateway(String ipv6DefaultGateway) {
        this.ipv6DefaultGateway = ipv6DefaultGateway;
    }

}

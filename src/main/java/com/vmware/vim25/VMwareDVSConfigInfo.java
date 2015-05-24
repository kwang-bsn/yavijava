package com.vmware.vim25;

/**
 * Created by Michael Rice on Sun May 24 07:03:52 CDT 2015
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

public class VMwareDVSConfigInfo extends DVSConfigInfo {
    public VMwareVspanSession[] vspanSession;
    public VMwareDVSPvlanMapEntry[] pvlanConfig;
    public int maxMtu;
    public LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
    public VMwareIpfixConfig ipfixConfig;
    public VMwareDvsLacpGroupConfig[] lacpGroupConfig;
    public String lacpApiVersion;
    public String multicastFilteringMode;

    public VMwareVspanSession[] getVspanSession() {
        return this.vspanSession;
    }

    public void setVspanSession(VMwareVspanSession[] vspanSession) {
        this.vspanSession = vspanSession;
    }

    public VMwareDVSPvlanMapEntry[] getPvlanConfig() {
        return this.pvlanConfig;
    }

    public void setPvlanConfig(VMwareDVSPvlanMapEntry[] pvlanConfig) {
        this.pvlanConfig = pvlanConfig;
    }

    public int getMaxMtu() {
        return this.maxMtu;
    }

    public void setMaxMtu(int maxMtu) {
        this.maxMtu = maxMtu;
    }

    public LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
        return this.linkDiscoveryProtocolConfig;
    }

    public void setLinkDiscoveryProtocolConfig(LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
        this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
    }

    public VMwareIpfixConfig getIpfixConfig() {
        return this.ipfixConfig;
    }

    public void setIpfixConfig(VMwareIpfixConfig ipfixConfig) {
        this.ipfixConfig = ipfixConfig;
    }

    public VMwareDvsLacpGroupConfig[] getLacpGroupConfig() {
        return this.lacpGroupConfig;
    }

    public void setLacpGroupConfig(VMwareDvsLacpGroupConfig[] lacpGroupConfig) {
        this.lacpGroupConfig = lacpGroupConfig;
    }

    public String getLacpApiVersion() {
        return this.lacpApiVersion;
    }

    public void setLacpApiVersion(String lacpApiVersion) {
        this.lacpApiVersion = lacpApiVersion;
    }

    public String getMulticastFilteringMode() {
        return this.multicastFilteringMode;
    }

    public void setMulticastFilteringMode(String multicastFilteringMode) {
        this.multicastFilteringMode = multicastFilteringMode;
    }

}

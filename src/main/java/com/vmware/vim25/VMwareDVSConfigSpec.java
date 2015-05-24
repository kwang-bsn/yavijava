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

public class VMwareDVSConfigSpec extends DVSConfigSpec {
    public VMwareDVSPvlanConfigSpec[] pvlanConfigSpec;
    public VMwareDVSVspanConfigSpec[] vspanConfigSpec;
    public Integer maxMtu;
    public LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
    public VMwareIpfixConfig ipfixConfig;
    public String lacpApiVersion;
    public String multicastFilteringMode;

    public VMwareDVSPvlanConfigSpec[] getPvlanConfigSpec() {
        return this.pvlanConfigSpec;
    }

    public void setPvlanConfigSpec(VMwareDVSPvlanConfigSpec[] pvlanConfigSpec) {
        this.pvlanConfigSpec = pvlanConfigSpec;
    }

    public VMwareDVSVspanConfigSpec[] getVspanConfigSpec() {
        return this.vspanConfigSpec;
    }

    public void setVspanConfigSpec(VMwareDVSVspanConfigSpec[] vspanConfigSpec) {
        this.vspanConfigSpec = vspanConfigSpec;
    }

    public Integer getMaxMtu() {
        return this.maxMtu;
    }

    public void setMaxMtu(Integer maxMtu) {
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

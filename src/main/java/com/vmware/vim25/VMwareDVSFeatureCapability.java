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

public class VMwareDVSFeatureCapability extends DVSFeatureCapability {
    public Boolean vspanSupported;
    public Boolean lldpSupported;
    public Boolean ipfixSupported;
    public VMwareDvsIpfixCapability ipfixCapability;
    public Boolean multicastSnoopingSupported;
    public VMwareDVSVspanCapability vspanCapability;
    public VMwareDvsLacpCapability lacpCapability;

    public Boolean getVspanSupported() {
        return this.vspanSupported;
    }

    public void setVspanSupported(Boolean vspanSupported) {
        this.vspanSupported = vspanSupported;
    }

    public Boolean getLldpSupported() {
        return this.lldpSupported;
    }

    public void setLldpSupported(Boolean lldpSupported) {
        this.lldpSupported = lldpSupported;
    }

    public Boolean getIpfixSupported() {
        return this.ipfixSupported;
    }

    public void setIpfixSupported(Boolean ipfixSupported) {
        this.ipfixSupported = ipfixSupported;
    }

    public VMwareDvsIpfixCapability getIpfixCapability() {
        return this.ipfixCapability;
    }

    public void setIpfixCapability(VMwareDvsIpfixCapability ipfixCapability) {
        this.ipfixCapability = ipfixCapability;
    }

    public Boolean getMulticastSnoopingSupported() {
        return this.multicastSnoopingSupported;
    }

    public void setMulticastSnoopingSupported(Boolean multicastSnoopingSupported) {
        this.multicastSnoopingSupported = multicastSnoopingSupported;
    }

    public VMwareDVSVspanCapability getVspanCapability() {
        return this.vspanCapability;
    }

    public void setVspanCapability(VMwareDVSVspanCapability vspanCapability) {
        this.vspanCapability = vspanCapability;
    }

    public VMwareDvsLacpCapability getLacpCapability() {
        return this.lacpCapability;
    }

    public void setLacpCapability(VMwareDvsLacpCapability lacpCapability) {
        this.lacpCapability = lacpCapability;
    }

}

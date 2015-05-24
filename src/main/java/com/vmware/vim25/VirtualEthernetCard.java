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

public class VirtualEthernetCard extends VirtualDevice {
    public String addressType;
    public String macAddress;
    public Boolean wakeOnLanEnabled;
    public VirtualEthernetCardResourceAllocation resourceAllocation;
    public String externalId;
    public Boolean uptCompatibilityEnabled;

    public String getAddressType() {
        return this.addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Boolean getWakeOnLanEnabled() {
        return this.wakeOnLanEnabled;
    }

    public void setWakeOnLanEnabled(Boolean wakeOnLanEnabled) {
        this.wakeOnLanEnabled = wakeOnLanEnabled;
    }

    public VirtualEthernetCardResourceAllocation getResourceAllocation() {
        return this.resourceAllocation;
    }

    public void setResourceAllocation(VirtualEthernetCardResourceAllocation resourceAllocation) {
        this.resourceAllocation = resourceAllocation;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Boolean getUptCompatibilityEnabled() {
        return this.uptCompatibilityEnabled;
    }

    public void setUptCompatibilityEnabled(Boolean uptCompatibilityEnabled) {
        this.uptCompatibilityEnabled = uptCompatibilityEnabled;
    }

}

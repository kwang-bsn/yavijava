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

public class VsanHostConfigInfo extends DynamicData {
    public Boolean enabled;
    public ManagedObjectReference hostSystem;
    public VsanHostConfigInfoClusterInfo clusterInfo;
    public VsanHostConfigInfoStorageInfo storageInfo;
    public VsanHostConfigInfoNetworkInfo networkInfo;
    public VsanHostFaultDomainInfo faultDomainInfo;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ManagedObjectReference getHostSystem() {
        return this.hostSystem;
    }

    public void setHostSystem(ManagedObjectReference hostSystem) {
        this.hostSystem = hostSystem;
    }

    public VsanHostConfigInfoClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public void setClusterInfo(VsanHostConfigInfoClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

    public VsanHostConfigInfoStorageInfo getStorageInfo() {
        return this.storageInfo;
    }

    public void setStorageInfo(VsanHostConfigInfoStorageInfo storageInfo) {
        this.storageInfo = storageInfo;
    }

    public VsanHostConfigInfoNetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public void setNetworkInfo(VsanHostConfigInfoNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    public VsanHostFaultDomainInfo getFaultDomainInfo() {
        return this.faultDomainInfo;
    }

    public void setFaultDomainInfo(VsanHostFaultDomainInfo faultDomainInfo) {
        this.faultDomainInfo = faultDomainInfo;
    }

}

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

public class HostVirtualNicSpec extends DynamicData {
    public HostIpConfig ip;
    public String mac;
    public DistributedVirtualSwitchPortConnection distributedVirtualPort;
    public String portgroup;
    public Integer mtu;
    public Boolean tsoEnabled;
    public String netStackInstanceKey;
    public HostVirtualNicOpaqueNetworkSpec opaqueNetwork;
    public String externalId;
    public String pinnedPnic;

    public HostIpConfig getIp() {
        return this.ip;
    }

    public void setIp(HostIpConfig ip) {
        this.ip = ip;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public DistributedVirtualSwitchPortConnection getDistributedVirtualPort() {
        return this.distributedVirtualPort;
    }

    public void setDistributedVirtualPort(DistributedVirtualSwitchPortConnection distributedVirtualPort) {
        this.distributedVirtualPort = distributedVirtualPort;
    }

    public String getPortgroup() {
        return this.portgroup;
    }

    public void setPortgroup(String portgroup) {
        this.portgroup = portgroup;
    }

    public Integer getMtu() {
        return this.mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public Boolean getTsoEnabled() {
        return this.tsoEnabled;
    }

    public void setTsoEnabled(Boolean tsoEnabled) {
        this.tsoEnabled = tsoEnabled;
    }

    public String getNetStackInstanceKey() {
        return this.netStackInstanceKey;
    }

    public void setNetStackInstanceKey(String netStackInstanceKey) {
        this.netStackInstanceKey = netStackInstanceKey;
    }

    public HostVirtualNicOpaqueNetworkSpec getOpaqueNetwork() {
        return this.opaqueNetwork;
    }

    public void setOpaqueNetwork(HostVirtualNicOpaqueNetworkSpec opaqueNetwork) {
        this.opaqueNetwork = opaqueNetwork;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getPinnedPnic() {
        return this.pinnedPnic;
    }

    public void setPinnedPnic(String pinnedPnic) {
        this.pinnedPnic = pinnedPnic;
    }

}

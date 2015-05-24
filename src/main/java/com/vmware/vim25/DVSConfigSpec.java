package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DVSConfigSpec extends DynamicData {
    public String configVersion;
    public String name;
    public Integer numStandalonePorts;
    public Integer maxPorts;
    public DVSUplinkPortPolicy uplinkPortPolicy;
    public ManagedObjectReference[] uplinkPortgroup;
    public DVPortSetting defaultPortConfig;
    public DistributedVirtualSwitchHostMemberConfigSpec[] host;
    public String extensionKey;
    public String description;
    public DVSPolicy policy;
    public DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    public DVSContactInfo contact;
    public String switchIpAddress;
    public Integer defaultProxySwitchMaxNumPorts;
    public DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig;
    public String networkResourceControlVersion;

    public String getConfigVersion() {
        return this.configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumStandalonePorts() {
        return this.numStandalonePorts;
    }

    public void setNumStandalonePorts(Integer numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }

    public Integer getMaxPorts() {
        return this.maxPorts;
    }

    public void setMaxPorts(Integer maxPorts) {
        this.maxPorts = maxPorts;
    }

    public DVSUplinkPortPolicy getUplinkPortPolicy() {
        return this.uplinkPortPolicy;
    }

    public void setUplinkPortPolicy(DVSUplinkPortPolicy uplinkPortPolicy) {
        this.uplinkPortPolicy = uplinkPortPolicy;
    }

    public ManagedObjectReference[] getUplinkPortgroup() {
        return this.uplinkPortgroup;
    }

    public void setUplinkPortgroup(ManagedObjectReference[] uplinkPortgroup) {
        this.uplinkPortgroup = uplinkPortgroup;
    }

    public DVPortSetting getDefaultPortConfig() {
        return this.defaultPortConfig;
    }

    public void setDefaultPortConfig(DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }

    public DistributedVirtualSwitchHostMemberConfigSpec[] getHost() {
        return this.host;
    }

    public void setHost(DistributedVirtualSwitchHostMemberConfigSpec[] host) {
        this.host = host;
    }

    public String getExtensionKey() {
        return this.extensionKey;
    }

    public void setExtensionKey(String extensionKey) {
        this.extensionKey = extensionKey;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DVSPolicy getPolicy() {
        return this.policy;
    }

    public void setPolicy(DVSPolicy policy) {
        this.policy = policy;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return this.vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public DVSContactInfo getContact() {
        return this.contact;
    }

    public void setContact(DVSContactInfo contact) {
        this.contact = contact;
    }

    public String getSwitchIpAddress() {
        return this.switchIpAddress;
    }

    public void setSwitchIpAddress(String switchIpAddress) {
        this.switchIpAddress = switchIpAddress;
    }

    public Integer getDefaultProxySwitchMaxNumPorts() {
        return this.defaultProxySwitchMaxNumPorts;
    }

    public void setDefaultProxySwitchMaxNumPorts(Integer defaultProxySwitchMaxNumPorts) {
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
    }

    public DvsHostInfrastructureTrafficResource[] getInfrastructureTrafficResourceConfig() {
        return this.infrastructureTrafficResourceConfig;
    }

    public void setInfrastructureTrafficResourceConfig(DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig) {
        this.infrastructureTrafficResourceConfig = infrastructureTrafficResourceConfig;
    }

    public String getNetworkResourceControlVersion() {
        return this.networkResourceControlVersion;
    }

    public void setNetworkResourceControlVersion(String networkResourceControlVersion) {
        this.networkResourceControlVersion = networkResourceControlVersion;
    }

}

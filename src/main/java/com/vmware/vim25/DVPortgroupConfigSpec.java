package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DVPortgroupConfigSpec extends DynamicData {
    public String configVersion;
    public String name;
    public Integer numPorts;
    public String portNameFormat;
    public DVPortSetting defaultPortConfig;
    public String description;
    public String type;
    public ManagedObjectReference[] scope;
    public DVPortgroupPolicy policy;
    public DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    public Boolean autoExpand;
    public String vmVnicNetworkResourcePoolKey;

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

    public Integer getNumPorts() {
        return this.numPorts;
    }

    public void setNumPorts(Integer numPorts) {
        this.numPorts = numPorts;
    }

    public String getPortNameFormat() {
        return this.portNameFormat;
    }

    public void setPortNameFormat(String portNameFormat) {
        this.portNameFormat = portNameFormat;
    }

    public DVPortSetting getDefaultPortConfig() {
        return this.defaultPortConfig;
    }

    public void setDefaultPortConfig(DVPortSetting defaultPortConfig) {
        this.defaultPortConfig = defaultPortConfig;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ManagedObjectReference[] getScope() {
        return this.scope;
    }

    public void setScope(ManagedObjectReference[] scope) {
        this.scope = scope;
    }

    public DVPortgroupPolicy getPolicy() {
        return this.policy;
    }

    public void setPolicy(DVPortgroupPolicy policy) {
        this.policy = policy;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return this.vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public Boolean getAutoExpand() {
        return this.autoExpand;
    }

    public void setAutoExpand(Boolean autoExpand) {
        this.autoExpand = autoExpand;
    }

    public String getVmVnicNetworkResourcePoolKey() {
        return this.vmVnicNetworkResourcePoolKey;
    }

    public void setVmVnicNetworkResourcePoolKey(String vmVnicNetworkResourcePoolKey) {
        this.vmVnicNetworkResourcePoolKey = vmVnicNetworkResourcePoolKey;
    }
}

package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DVPortgroupConfigInfo extends DynamicData {
    public String key;
    public String name;
    public int numPorts;
    public ManagedObjectReference distributedVirtualSwitch;
    public DVPortSetting defaultPortConfig;
    public String description;
    public String type;
    public DVPortgroupPolicy policy;
    public String portNameFormat;
    public ManagedObjectReference[] scope;
    public DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    public String configVersion;
    public Boolean autoExpand;
    public String vmVnicNetworkResourcePoolKey;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPorts() {
        return this.numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public ManagedObjectReference getDistributedVirtualSwitch() {
        return this.distributedVirtualSwitch;
    }

    public void setDistributedVirtualSwitch(ManagedObjectReference distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
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

    public DVPortgroupPolicy getPolicy() {
        return this.policy;
    }

    public void setPolicy(DVPortgroupPolicy policy) {
        this.policy = policy;
    }

    public String getPortNameFormat() {
        return this.portNameFormat;
    }

    public void setPortNameFormat(String portNameFormat) {
        this.portNameFormat = portNameFormat;
    }

    public ManagedObjectReference[] getScope() {
        return this.scope;
    }

    public void setScope(ManagedObjectReference[] scope) {
        this.scope = scope;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return this.vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public String getConfigVersion() {
        return this.configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
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

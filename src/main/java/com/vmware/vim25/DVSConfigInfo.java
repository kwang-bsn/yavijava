package com.vmware.vim25;

import java.util.Calendar;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DVSConfigInfo extends DynamicData {
    public String uuid;
    public String name;
    public int numStandalonePorts;
    public int numPorts;
    public int maxPorts;
    public DVSUplinkPortPolicy uplinkPortPolicy;
    public ManagedObjectReference[] uplinkPortgroup;
    public DVPortSetting defaultPortConfig;
    public DistributedVirtualSwitchHostMember[] host;
    public DistributedVirtualSwitchProductSpec productInfo;
    public DistributedVirtualSwitchProductSpec targetInfo;
    public String extensionKey;
    public DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;
    public DVSPolicy policy;
    public String description;
    public String configVersion;
    public DVSContactInfo contact;
    public String switchIpAddress;
    public Calendar createTime;
    public Boolean networkResourceManagementEnabled;
    public Integer defaultProxySwitchMaxNumPorts;
    public DVSHealthCheckConfig[] healthCheckConfig;
    public DvsHostInfrastructureTrafficResource[] infrastructureTrafficResourceConfig;
    public String networkResourceControlVersion;
    public DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool;
    public Integer pnicCapacityRatioForReservation;

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumStandalonePorts() {
        return this.numStandalonePorts;
    }

    public void setNumStandalonePorts(int numStandalonePorts) {
        this.numStandalonePorts = numStandalonePorts;
    }

    public int getNumPorts() {
        return this.numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public int getMaxPorts() {
        return this.maxPorts;
    }

    public void setMaxPorts(int maxPorts) {
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

    public DistributedVirtualSwitchHostMember[] getHost() {
        return this.host;
    }

    public void setHost(DistributedVirtualSwitchHostMember[] host) {
        this.host = host;
    }

    public DistributedVirtualSwitchProductSpec getProductInfo() {
        return this.productInfo;
    }

    public void setProductInfo(DistributedVirtualSwitchProductSpec productInfo) {
        this.productInfo = productInfo;
    }

    public DistributedVirtualSwitchProductSpec getTargetInfo() {
        return this.targetInfo;
    }

    public void setTargetInfo(DistributedVirtualSwitchProductSpec targetInfo) {
        this.targetInfo = targetInfo;
    }

    public String getExtensionKey() {
        return this.extensionKey;
    }

    public void setExtensionKey(String extensionKey) {
        this.extensionKey = extensionKey;
    }

    public DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return this.vendorSpecificConfig;
    }

    public void setVendorSpecificConfig(DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public DVSPolicy getPolicy() {
        return this.policy;
    }

    public void setPolicy(DVSPolicy policy) {
        this.policy = policy;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConfigVersion() {
        return this.configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
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

    public Calendar getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Calendar createTime) {
        this.createTime = createTime;
    }

    public Boolean getNetworkResourceManagementEnabled() {
        return this.networkResourceManagementEnabled;
    }

    public void setNetworkResourceManagementEnabled(Boolean networkResourceManagementEnabled) {
        this.networkResourceManagementEnabled = networkResourceManagementEnabled;
    }

    public Integer getDefaultProxySwitchMaxNumPorts() {
        return this.defaultProxySwitchMaxNumPorts;
    }

    public void setDefaultProxySwitchMaxNumPorts(Integer defaultProxySwitchMaxNumPorts) {
        this.defaultProxySwitchMaxNumPorts = defaultProxySwitchMaxNumPorts;
    }

    public DVSHealthCheckConfig[] getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public void setHealthCheckConfig(DVSHealthCheckConfig[] healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
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

    public DVSVmVnicNetworkResourcePool[] getVmVnicNetworkResourcePool() {
        return this.vmVnicNetworkResourcePool;
    }

    public void setVmVnicNetworkResourcePool(DVSVmVnicNetworkResourcePool[] vmVnicNetworkResourcePool) {
        this.vmVnicNetworkResourcePool = vmVnicNetworkResourcePool;
    }

    public Integer getPnicCapacityRatioForReservation() {
        return this.pnicCapacityRatioForReservation;
    }

    public void setPnicCapacityRatioForReservation(Integer pnicCapacityRatioForReservation) {
        this.pnicCapacityRatioForReservation = pnicCapacityRatioForReservation;
    }

}

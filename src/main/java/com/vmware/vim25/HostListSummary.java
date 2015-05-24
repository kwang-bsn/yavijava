package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostListSummary extends DynamicData {
    public ManagedObjectReference host;
    public HostHardwareSummary hardware;
    public HostRuntimeInfo runtime;
    public HostConfigSummary config;
    public HostListSummaryQuickStats quickStats;
    public ManagedEntityStatus overallStatus;
    public boolean rebootRequired;
    public CustomFieldValue[] customValue;
    public String managementServerIp;
    public String maxEVCModeKey;
    public String currentEVCModeKey;
    public HostListSummaryGatewaySummary gateway;

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public HostHardwareSummary getHardware() {
        return this.hardware;
    }

    public void setHardware(HostHardwareSummary hardware) {
        this.hardware = hardware;
    }

    public HostRuntimeInfo getRuntime() {
        return this.runtime;
    }

    public void setRuntime(HostRuntimeInfo runtime) {
        this.runtime = runtime;
    }

    public HostConfigSummary getConfig() {
        return this.config;
    }

    public void setConfig(HostConfigSummary config) {
        this.config = config;
    }

    public HostListSummaryQuickStats getQuickStats() {
        return this.quickStats;
    }

    public void setQuickStats(HostListSummaryQuickStats quickStats) {
        this.quickStats = quickStats;
    }

    public ManagedEntityStatus getOverallStatus() {
        return this.overallStatus;
    }

    public void setOverallStatus(ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }

    public boolean getRebootRequired() {
        return this.rebootRequired;
    }

    public void setRebootRequired(boolean rebootRequired) {
        this.rebootRequired = rebootRequired;
    }

    public CustomFieldValue[] getCustomValue() {
        return this.customValue;
    }

    public void setCustomValue(CustomFieldValue[] customValue) {
        this.customValue = customValue;
    }

    public String getManagementServerIp() {
        return this.managementServerIp;
    }

    public void setManagementServerIp(String managementServerIp) {
        this.managementServerIp = managementServerIp;
    }

    public String getMaxEVCModeKey() {
        return this.maxEVCModeKey;
    }

    public void setMaxEVCModeKey(String maxEVCModeKey) {
        this.maxEVCModeKey = maxEVCModeKey;
    }

    public String getCurrentEVCModeKey() {
        return this.currentEVCModeKey;
    }

    public void setCurrentEVCModeKey(String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }

    public HostListSummaryGatewaySummary getGateway() {
        return this.gateway;
    }

    public void setGateway(HostListSummaryGatewaySummary gateway) {
        this.gateway = gateway;
    }

}

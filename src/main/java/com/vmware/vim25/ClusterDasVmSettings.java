package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class ClusterDasVmSettings extends DynamicData {
    public String restartPriority;
    public String isolationResponse;
    public ClusterVmToolsMonitoringSettings vmToolsMonitoringSettings;
    public ClusterVmComponentProtectionSettings vmComponentProtectionSettings;

    public String getRestartPriority() {
        return this.restartPriority;
    }

    public void setRestartPriority(String restartPriority) {
        this.restartPriority = restartPriority;
    }

    public String getIsolationResponse() {
        return this.isolationResponse;
    }

    public void setIsolationResponse(String isolationResponse) {
        this.isolationResponse = isolationResponse;
    }

    public ClusterVmToolsMonitoringSettings getVmToolsMonitoringSettings() {
        return this.vmToolsMonitoringSettings;
    }

    public void setVmToolsMonitoringSettings(ClusterVmToolsMonitoringSettings vmToolsMonitoringSettings) {
        this.vmToolsMonitoringSettings = vmToolsMonitoringSettings;
    }

    public ClusterVmComponentProtectionSettings getVmComponentProtectionSettings() {
        return this.vmComponentProtectionSettings;
    }

    public void setVmComponentProtectionSettings(ClusterVmComponentProtectionSettings vmComponentProtectionSettings) {
        this.vmComponentProtectionSettings = vmComponentProtectionSettings;
    }
}

package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class ClusterDasConfigInfo extends DynamicData {
    public Boolean enabled;
    public String vmMonitoring;
    public String hostMonitoring;
    public String vmComponentProtecting;
    public Integer failoverLevel;
    public ClusterDasAdmissionControlPolicy admissionControlPolicy;
    public Boolean admissionControlEnabled;
    public ClusterDasVmSettings defaultVmSettings;
    public OptionValue[] option;
    public ManagedObjectReference[] heartbeatDatastore;
    public String hBDatastoreCandidatePolicy;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getVmMonitoring() {
        return this.vmMonitoring;
    }

    public void setVmMonitoring(String vmMonitoring) {
        this.vmMonitoring = vmMonitoring;
    }

    public String getHostMonitoring() {
        return this.hostMonitoring;
    }

    public void setHostMonitoring(String hostMonitoring) {
        this.hostMonitoring = hostMonitoring;
    }

    public String getVmComponentProtecting() {
        return this.vmComponentProtecting;
    }

    public void setVmComponentProtecting(String vmComponentProtecting) {
        this.vmComponentProtecting = vmComponentProtecting;
    }

    public Integer getFailoverLevel() {
        return this.failoverLevel;
    }

    public void setFailoverLevel(Integer failoverLevel) {
        this.failoverLevel = failoverLevel;
    }

    public ClusterDasAdmissionControlPolicy getAdmissionControlPolicy() {
        return this.admissionControlPolicy;
    }

    public void setAdmissionControlPolicy(ClusterDasAdmissionControlPolicy admissionControlPolicy) {
        this.admissionControlPolicy = admissionControlPolicy;
    }

    public Boolean getAdmissionControlEnabled() {
        return this.admissionControlEnabled;
    }

    public void setAdmissionControlEnabled(Boolean admissionControlEnabled) {
        this.admissionControlEnabled = admissionControlEnabled;
    }

    public ClusterDasVmSettings getDefaultVmSettings() {
        return this.defaultVmSettings;
    }

    public void setDefaultVmSettings(ClusterDasVmSettings defaultVmSettings) {
        this.defaultVmSettings = defaultVmSettings;
    }

    public OptionValue[] getOption() {
        return this.option;
    }

    public void setOption(OptionValue[] option) {
        this.option = option;
    }

    public ManagedObjectReference[] getHeartbeatDatastore() {
        return this.heartbeatDatastore;
    }

    public void setHeartbeatDatastore(ManagedObjectReference[] heartbeatDatastore) {
        this.heartbeatDatastore = heartbeatDatastore;
    }

    public String getHBDatastoreCandidatePolicy() {
        return this.hBDatastoreCandidatePolicy;
    }

    public void setHBDatastoreCandidatePolicy(String hBDatastoreCandidatePolicy) {
        this.hBDatastoreCandidatePolicy = hBDatastoreCandidatePolicy;
    }

}

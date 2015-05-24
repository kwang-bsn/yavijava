package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class ClusterComputeResourceSummary extends ComputeResourceSummary {
    public int currentFailoverLevel;
    public ClusterDasAdmissionControlInfo admissionControlInfo;
    public int numVmotions;
    public Integer targetBalance;
    public Integer currentBalance;
    public ClusterUsageSummary usageSummary;
    public String currentEVCModeKey;
    public ClusterDasData dasData;

    public int getCurrentFailoverLevel() {
        return this.currentFailoverLevel;
    }

    public void setCurrentFailoverLevel(int currentFailoverLevel) {
        this.currentFailoverLevel = currentFailoverLevel;
    }

    public ClusterDasAdmissionControlInfo getAdmissionControlInfo() {
        return this.admissionControlInfo;
    }

    public void setAdmissionControlInfo(ClusterDasAdmissionControlInfo admissionControlInfo) {
        this.admissionControlInfo = admissionControlInfo;
    }

    public int getNumVmotions() {
        return this.numVmotions;
    }

    public void setNumVmotions(int numVmotions) {
        this.numVmotions = numVmotions;
    }

    public Integer getTargetBalance() {
        return this.targetBalance;
    }

    public void setTargetBalance(Integer targetBalance) {
        this.targetBalance = targetBalance;
    }

    public Integer getCurrentBalance() {
        return this.currentBalance;
    }

    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public ClusterUsageSummary getUsageSummary() {
        return this.usageSummary;
    }

    public void setUsageSummary(ClusterUsageSummary usageSummary) {
        this.usageSummary = usageSummary;
    }

    public String getCurrentEVCModeKey() {
        return this.currentEVCModeKey;
    }

    public void setCurrentEVCModeKey(String currentEVCModeKey) {
        this.currentEVCModeKey = currentEVCModeKey;
    }

    public ClusterDasData getDasData() {
        return this.dasData;
    }

    public void setDasData(ClusterDasData dasData) {
        this.dasData = dasData;
    }

}

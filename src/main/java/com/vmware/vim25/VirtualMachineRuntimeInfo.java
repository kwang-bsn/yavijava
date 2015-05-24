package com.vmware.vim25;

import java.util.Calendar;

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

public class VirtualMachineRuntimeInfo extends DynamicData {
    public VirtualMachineDeviceRuntimeInfo[] device;
    public ManagedObjectReference host;
    public VirtualMachineConnectionState connectionState;
    public VirtualMachinePowerState powerState;
    public VirtualMachineFaultToleranceState faultToleranceState;
    public VirtualMachineRuntimeInfoDasProtectionState dasVmProtection;
    public boolean toolsInstallerMounted;
    public Calendar suspendTime;
    public Calendar bootTime;
    public long suspendInterval;
    public VirtualMachineQuestionInfo question;
    public long memoryOverhead;
    public Integer maxCpuUsage;
    public Integer maxMemoryUsage;
    public int numMksConnections;
    public VirtualMachineRecordReplayState recordReplayState;
    public Boolean cleanPowerOff;
    public String needSecondaryReason;
    public Boolean onlineStandby;
    public String minRequiredEVCModeKey;
    public Boolean consolidationNeeded;
    public VirtualMachineFeatureRequirement[] offlineFeatureRequirement;
    public VirtualMachineFeatureRequirement[] featureRequirement;
    public HostFeatureMask[] featureMask;
    public long vFlashCacheAllocation;
    public Boolean paused;
    public Boolean snapshotInBackground;
    public Boolean quiescedForkParent;

    public VirtualMachineDeviceRuntimeInfo[] getDevice() {
        return this.device;
    }

    public void setDevice(VirtualMachineDeviceRuntimeInfo[] device) {
        this.device = device;
    }

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public VirtualMachineConnectionState getConnectionState() {
        return this.connectionState;
    }

    public void setConnectionState(VirtualMachineConnectionState connectionState) {
        this.connectionState = connectionState;
    }

    public VirtualMachinePowerState getPowerState() {
        return this.powerState;
    }

    public void setPowerState(VirtualMachinePowerState powerState) {
        this.powerState = powerState;
    }

    public VirtualMachineFaultToleranceState getFaultToleranceState() {
        return this.faultToleranceState;
    }

    public void setFaultToleranceState(VirtualMachineFaultToleranceState faultToleranceState) {
        this.faultToleranceState = faultToleranceState;
    }

    public VirtualMachineRuntimeInfoDasProtectionState getDasVmProtection() {
        return this.dasVmProtection;
    }

    public void setDasVmProtection(VirtualMachineRuntimeInfoDasProtectionState dasVmProtection) {
        this.dasVmProtection = dasVmProtection;
    }

    public boolean getToolsInstallerMounted() {
        return this.toolsInstallerMounted;
    }

    public void setToolsInstallerMounted(boolean toolsInstallerMounted) {
        this.toolsInstallerMounted = toolsInstallerMounted;
    }

    public Calendar getSuspendTime() {
        return this.suspendTime;
    }

    public void setSuspendTime(Calendar suspendTime) {
        this.suspendTime = suspendTime;
    }

    public Calendar getBootTime() {
        return this.bootTime;
    }

    public void setBootTime(Calendar bootTime) {
        this.bootTime = bootTime;
    }

    public long getSuspendInterval() {
        return this.suspendInterval;
    }

    public void setSuspendInterval(long suspendInterval) {
        this.suspendInterval = suspendInterval;
    }

    public VirtualMachineQuestionInfo getQuestion() {
        return this.question;
    }

    public void setQuestion(VirtualMachineQuestionInfo question) {
        this.question = question;
    }

    public long getMemoryOverhead() {
        return this.memoryOverhead;
    }

    public void setMemoryOverhead(long memoryOverhead) {
        this.memoryOverhead = memoryOverhead;
    }

    public Integer getMaxCpuUsage() {
        return this.maxCpuUsage;
    }

    public void setMaxCpuUsage(Integer maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
    }

    public Integer getMaxMemoryUsage() {
        return this.maxMemoryUsage;
    }

    public void setMaxMemoryUsage(Integer maxMemoryUsage) {
        this.maxMemoryUsage = maxMemoryUsage;
    }

    public int getNumMksConnections() {
        return this.numMksConnections;
    }

    public void setNumMksConnections(int numMksConnections) {
        this.numMksConnections = numMksConnections;
    }

    public VirtualMachineRecordReplayState getRecordReplayState() {
        return this.recordReplayState;
    }

    public void setRecordReplayState(VirtualMachineRecordReplayState recordReplayState) {
        this.recordReplayState = recordReplayState;
    }

    public Boolean getCleanPowerOff() {
        return this.cleanPowerOff;
    }

    public void setCleanPowerOff(Boolean cleanPowerOff) {
        this.cleanPowerOff = cleanPowerOff;
    }

    public String getNeedSecondaryReason() {
        return this.needSecondaryReason;
    }

    public void setNeedSecondaryReason(String needSecondaryReason) {
        this.needSecondaryReason = needSecondaryReason;
    }

    public Boolean getOnlineStandby() {
        return this.onlineStandby;
    }

    public void setOnlineStandby(Boolean onlineStandby) {
        this.onlineStandby = onlineStandby;
    }

    public String getMinRequiredEVCModeKey() {
        return this.minRequiredEVCModeKey;
    }

    public void setMinRequiredEVCModeKey(String minRequiredEVCModeKey) {
        this.minRequiredEVCModeKey = minRequiredEVCModeKey;
    }

    public Boolean getConsolidationNeeded() {
        return this.consolidationNeeded;
    }

    public void setConsolidationNeeded(Boolean consolidationNeeded) {
        this.consolidationNeeded = consolidationNeeded;
    }

    public VirtualMachineFeatureRequirement[] getOfflineFeatureRequirement() {
        return this.offlineFeatureRequirement;
    }

    public void setOfflineFeatureRequirement(VirtualMachineFeatureRequirement[] offlineFeatureRequirement) {
        this.offlineFeatureRequirement = offlineFeatureRequirement;
    }

    public VirtualMachineFeatureRequirement[] getFeatureRequirement() {
        return this.featureRequirement;
    }

    public void setFeatureRequirement(VirtualMachineFeatureRequirement[] featureRequirement) {
        this.featureRequirement = featureRequirement;
    }

    public HostFeatureMask[] getFeatureMask() {
        return this.featureMask;
    }

    public void setFeatureMask(HostFeatureMask[] featureMask) {
        this.featureMask = featureMask;
    }

    public long getVFlashCacheAllocation() {
        return this.vFlashCacheAllocation;
    }

    public void setVFlashCacheAllocation(long vFlashCacheAllocation) {
        this.vFlashCacheAllocation = vFlashCacheAllocation;
    }

    public Boolean getPaused() {
        return this.paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    public Boolean getSnapshotInBackground() {
        return this.snapshotInBackground;
    }

    public void setSnapshotInBackground(Boolean snapshotInBackground) {
        this.snapshotInBackground = snapshotInBackground;
    }

    public Boolean getQuiescedForkParent() {
        return this.quiescedForkParent;
    }

    public void setQuiescedForkParent(Boolean quiescedForkParent) {
        this.quiescedForkParent = quiescedForkParent;
    }

}

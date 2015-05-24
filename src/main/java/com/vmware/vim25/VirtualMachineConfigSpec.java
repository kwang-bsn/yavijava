package com.vmware.vim25;

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

public class VirtualMachineConfigSpec extends DynamicData {
    public String changeVersion;
    public String name;
    public String version;
    public String uuid;
    public String instanceUuid;
    public long[] npivNodeWorldWideName;
    public long[] npivPortWorldWideName;
    public String npivWorldWideNameType;
    public short npivDesiredNodeWwns;
    public short npivDesiredPortWwns;
    public Boolean npivTemporaryDisabled;
    public Boolean npivOnNonRdmDisks;
    public String npivWorldWideNameOp;
    public String locationId;
    public String guestId;
    public String alternateGuestName;
    public String annotation;
    public VirtualMachineFileInfo files;
    public ToolsConfigInfo tools;
    public VirtualMachineFlagInfo flags;
    public VirtualMachineConsolePreferences consolePreferences;
    public VirtualMachineDefaultPowerOpInfo powerOpInfo;
    public Integer numCPUs;
    public Integer numCoresPerSocket;
    public long memoryMB;
    public Boolean memoryHotAddEnabled;
    public Boolean cpuHotAddEnabled;
    public Boolean cpuHotRemoveEnabled;
    public Boolean virtualICH7MPresent;
    public Boolean virtualSMCPresent;
    public VirtualDeviceConfigSpec[] deviceChange;
    public ResourceAllocationInfo cpuAllocation;
    public ResourceAllocationInfo memoryAllocation;
    public LatencySensitivity latencySensitivity;
    public VirtualMachineAffinityInfo cpuAffinity;
    public VirtualMachineAffinityInfo memoryAffinity;
    public VirtualMachineNetworkShaperInfo networkShaper;
    public VirtualMachineCpuIdInfoSpec[] cpuFeatureMask;
    public OptionValue[] extraConfig;
    public String swapPlacement;
    public VirtualMachineBootOptions bootOptions;
    public VmConfigSpec vAppConfig;
    public FaultToleranceConfigInfo ftInfo;
    public ReplicationConfigSpec repConfig;
    public Boolean vAppConfigRemoved;
    public Boolean vAssertsEnabled;
    public Boolean changeTrackingEnabled;
    public String firmware;
    public Integer maxMksConnections;
    public Boolean guestAutoLockEnabled;
    public ManagedByInfo managedBy;
    public Boolean memoryReservationLockedToMax;
    public Boolean nestedHVEnabled;
    public Boolean vPMCEnabled;
    public ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    public VirtualMachineProfileSpec[] vmProfile;
    public Boolean messageBusTunnelEnabled;

    public String getChangeVersion() {
        return this.changeVersion;
    }

    public void setChangeVersion(String changeVersion) {
        this.changeVersion = changeVersion;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public long[] getNpivNodeWorldWideName() {
        return this.npivNodeWorldWideName;
    }

    public void setNpivNodeWorldWideName(long[] npivNodeWorldWideName) {
        this.npivNodeWorldWideName = npivNodeWorldWideName;
    }

    public long[] getNpivPortWorldWideName() {
        return this.npivPortWorldWideName;
    }

    public void setNpivPortWorldWideName(long[] npivPortWorldWideName) {
        this.npivPortWorldWideName = npivPortWorldWideName;
    }

    public String getNpivWorldWideNameType() {
        return this.npivWorldWideNameType;
    }

    public void setNpivWorldWideNameType(String npivWorldWideNameType) {
        this.npivWorldWideNameType = npivWorldWideNameType;
    }

    public short getNpivDesiredNodeWwns() {
        return this.npivDesiredNodeWwns;
    }

    public void setNpivDesiredNodeWwns(short npivDesiredNodeWwns) {
        this.npivDesiredNodeWwns = npivDesiredNodeWwns;
    }

    public short getNpivDesiredPortWwns() {
        return this.npivDesiredPortWwns;
    }

    public void setNpivDesiredPortWwns(short npivDesiredPortWwns) {
        this.npivDesiredPortWwns = npivDesiredPortWwns;
    }

    public Boolean getNpivTemporaryDisabled() {
        return this.npivTemporaryDisabled;
    }

    public void setNpivTemporaryDisabled(Boolean npivTemporaryDisabled) {
        this.npivTemporaryDisabled = npivTemporaryDisabled;
    }

    public Boolean getNpivOnNonRdmDisks() {
        return this.npivOnNonRdmDisks;
    }

    public void setNpivOnNonRdmDisks(Boolean npivOnNonRdmDisks) {
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
    }

    public String getNpivWorldWideNameOp() {
        return this.npivWorldWideNameOp;
    }

    public void setNpivWorldWideNameOp(String npivWorldWideNameOp) {
        this.npivWorldWideNameOp = npivWorldWideNameOp;
    }

    public String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getGuestId() {
        return this.guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getAlternateGuestName() {
        return this.alternateGuestName;
    }

    public void setAlternateGuestName(String alternateGuestName) {
        this.alternateGuestName = alternateGuestName;
    }

    public String getAnnotation() {
        return this.annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public VirtualMachineFileInfo getFiles() {
        return this.files;
    }

    public void setFiles(VirtualMachineFileInfo files) {
        this.files = files;
    }

    public ToolsConfigInfo getTools() {
        return this.tools;
    }

    public void setTools(ToolsConfigInfo tools) {
        this.tools = tools;
    }

    public VirtualMachineFlagInfo getFlags() {
        return this.flags;
    }

    public void setFlags(VirtualMachineFlagInfo flags) {
        this.flags = flags;
    }

    public VirtualMachineConsolePreferences getConsolePreferences() {
        return this.consolePreferences;
    }

    public void setConsolePreferences(VirtualMachineConsolePreferences consolePreferences) {
        this.consolePreferences = consolePreferences;
    }

    public VirtualMachineDefaultPowerOpInfo getPowerOpInfo() {
        return this.powerOpInfo;
    }

    public void setPowerOpInfo(VirtualMachineDefaultPowerOpInfo powerOpInfo) {
        this.powerOpInfo = powerOpInfo;
    }

    public Integer getNumCPUs() {
        return this.numCPUs;
    }

    public void setNumCPUs(Integer numCPUs) {
        this.numCPUs = numCPUs;
    }

    public Integer getNumCoresPerSocket() {
        return this.numCoresPerSocket;
    }

    public void setNumCoresPerSocket(Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
    }

    public long getMemoryMB() {
        return this.memoryMB;
    }

    public void setMemoryMB(long memoryMB) {
        this.memoryMB = memoryMB;
    }

    public Boolean getMemoryHotAddEnabled() {
        return this.memoryHotAddEnabled;
    }

    public void setMemoryHotAddEnabled(Boolean memoryHotAddEnabled) {
        this.memoryHotAddEnabled = memoryHotAddEnabled;
    }

    public Boolean getCpuHotAddEnabled() {
        return this.cpuHotAddEnabled;
    }

    public void setCpuHotAddEnabled(Boolean cpuHotAddEnabled) {
        this.cpuHotAddEnabled = cpuHotAddEnabled;
    }

    public Boolean getCpuHotRemoveEnabled() {
        return this.cpuHotRemoveEnabled;
    }

    public void setCpuHotRemoveEnabled(Boolean cpuHotRemoveEnabled) {
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
    }

    public Boolean getVirtualICH7MPresent() {
        return this.virtualICH7MPresent;
    }

    public void setVirtualICH7MPresent(Boolean virtualICH7MPresent) {
        this.virtualICH7MPresent = virtualICH7MPresent;
    }

    public Boolean getVirtualSMCPresent() {
        return this.virtualSMCPresent;
    }

    public void setVirtualSMCPresent(Boolean virtualSMCPresent) {
        this.virtualSMCPresent = virtualSMCPresent;
    }

    public VirtualDeviceConfigSpec[] getDeviceChange() {
        return this.deviceChange;
    }

    public void setDeviceChange(VirtualDeviceConfigSpec[] deviceChange) {
        this.deviceChange = deviceChange;
    }

    public ResourceAllocationInfo getCpuAllocation() {
        return this.cpuAllocation;
    }

    public void setCpuAllocation(ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }

    public ResourceAllocationInfo getMemoryAllocation() {
        return this.memoryAllocation;
    }

    public void setMemoryAllocation(ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

    public LatencySensitivity getLatencySensitivity() {
        return this.latencySensitivity;
    }

    public void setLatencySensitivity(LatencySensitivity latencySensitivity) {
        this.latencySensitivity = latencySensitivity;
    }

    public VirtualMachineAffinityInfo getCpuAffinity() {
        return this.cpuAffinity;
    }

    public void setCpuAffinity(VirtualMachineAffinityInfo cpuAffinity) {
        this.cpuAffinity = cpuAffinity;
    }

    public VirtualMachineAffinityInfo getMemoryAffinity() {
        return this.memoryAffinity;
    }

    public void setMemoryAffinity(VirtualMachineAffinityInfo memoryAffinity) {
        this.memoryAffinity = memoryAffinity;
    }

    public VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return this.networkShaper;
    }

    public void setNetworkShaper(VirtualMachineNetworkShaperInfo networkShaper) {
        this.networkShaper = networkShaper;
    }

    public VirtualMachineCpuIdInfoSpec[] getCpuFeatureMask() {
        return this.cpuFeatureMask;
    }

    public void setCpuFeatureMask(VirtualMachineCpuIdInfoSpec[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public OptionValue[] getExtraConfig() {
        return this.extraConfig;
    }

    public void setExtraConfig(OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public String getSwapPlacement() {
        return this.swapPlacement;
    }

    public void setSwapPlacement(String swapPlacement) {
        this.swapPlacement = swapPlacement;
    }

    public VirtualMachineBootOptions getBootOptions() {
        return this.bootOptions;
    }

    public void setBootOptions(VirtualMachineBootOptions bootOptions) {
        this.bootOptions = bootOptions;
    }

    public VmConfigSpec getVAppConfig() {
        return this.vAppConfig;
    }

    public void setVAppConfig(VmConfigSpec vAppConfig) {
        this.vAppConfig = vAppConfig;
    }

    public FaultToleranceConfigInfo getFtInfo() {
        return this.ftInfo;
    }

    public void setFtInfo(FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    public ReplicationConfigSpec getRepConfig() {
        return this.repConfig;
    }

    public void setRepConfig(ReplicationConfigSpec repConfig) {
        this.repConfig = repConfig;
    }

    public Boolean getVAppConfigRemoved() {
        return this.vAppConfigRemoved;
    }

    public void setVAppConfigRemoved(Boolean vAppConfigRemoved) {
        this.vAppConfigRemoved = vAppConfigRemoved;
    }

    public Boolean getVAssertsEnabled() {
        return this.vAssertsEnabled;
    }

    public void setVAssertsEnabled(Boolean vAssertsEnabled) {
        this.vAssertsEnabled = vAssertsEnabled;
    }

    public Boolean getChangeTrackingEnabled() {
        return this.changeTrackingEnabled;
    }

    public void setChangeTrackingEnabled(Boolean changeTrackingEnabled) {
        this.changeTrackingEnabled = changeTrackingEnabled;
    }

    public String getFirmware() {
        return this.firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public Integer getMaxMksConnections() {
        return this.maxMksConnections;
    }

    public void setMaxMksConnections(Integer maxMksConnections) {
        this.maxMksConnections = maxMksConnections;
    }

    public Boolean getGuestAutoLockEnabled() {
        return this.guestAutoLockEnabled;
    }

    public void setGuestAutoLockEnabled(Boolean guestAutoLockEnabled) {
        this.guestAutoLockEnabled = guestAutoLockEnabled;
    }

    public ManagedByInfo getManagedBy() {
        return this.managedBy;
    }

    public void setManagedBy(ManagedByInfo managedBy) {
        this.managedBy = managedBy;
    }

    public Boolean getMemoryReservationLockedToMax() {
        return this.memoryReservationLockedToMax;
    }

    public void setMemoryReservationLockedToMax(Boolean memoryReservationLockedToMax) {
        this.memoryReservationLockedToMax = memoryReservationLockedToMax;
    }

    public Boolean getNestedHVEnabled() {
        return this.nestedHVEnabled;
    }

    public void setNestedHVEnabled(Boolean nestedHVEnabled) {
        this.nestedHVEnabled = nestedHVEnabled;
    }

    public Boolean getVPMCEnabled() {
        return this.vPMCEnabled;
    }

    public void setVPMCEnabled(Boolean vPMCEnabled) {
        this.vPMCEnabled = vPMCEnabled;
    }

    public ScheduledHardwareUpgradeInfo getScheduledHardwareUpgradeInfo() {
        return this.scheduledHardwareUpgradeInfo;
    }

    public void setScheduledHardwareUpgradeInfo(ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo) {
        this.scheduledHardwareUpgradeInfo = scheduledHardwareUpgradeInfo;
    }

    public VirtualMachineProfileSpec[] getVmProfile() {
        return this.vmProfile;
    }

    public void setVmProfile(VirtualMachineProfileSpec[] vmProfile) {
        this.vmProfile = vmProfile;
    }

    public Boolean getMessageBusTunnelEnabled() {
        return this.messageBusTunnelEnabled;
    }

    public void setMessageBusTunnelEnabled(Boolean messageBusTunnelEnabled) {
        this.messageBusTunnelEnabled = messageBusTunnelEnabled;
    }

}

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

public class VirtualMachineConfigInfo extends DynamicData {
    public String changeVersion;
    public Calendar modified;
    public String name;
    public String guestFullName;
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
    public String locationId;
    public boolean template;
    public String guestId;
    public String alternateGuestName;
    public String annotation;
    public VirtualMachineFileInfo files;
    public ToolsConfigInfo tools;
    public VirtualMachineFlagInfo flags;
    public VirtualMachineConsolePreferences consolePreferences;
    public VirtualMachineDefaultPowerOpInfo defaultPowerOps;
    public VirtualHardware hardware;
    public ResourceAllocationInfo cpuAllocation;
    public ResourceAllocationInfo memoryAllocation;
    public LatencySensitivity latencySensitivity;
    public Boolean memoryHotAddEnabled;
    public Boolean cpuHotAddEnabled;
    public Boolean cpuHotRemoveEnabled;
    public long hotPlugMemoryLimit;
    public long hotPlugMemoryIncrementSize;
    public VirtualMachineAffinityInfo cpuAffinity;
    public VirtualMachineAffinityInfo memoryAffinity;
    public VirtualMachineNetworkShaperInfo networkShaper;
    public OptionValue[] extraConfig;
    public HostCpuIdInfo[] cpuFeatureMask;
    public VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl;
    public String swapPlacement;
    public VirtualMachineBootOptions bootOptions;
    public FaultToleranceConfigInfo ftInfo;
    public ReplicationConfigSpec repConfig;
    public VmConfigInfo vAppConfig;
    public Boolean vAssertsEnabled;
    public Boolean changeTrackingEnabled;
    public String firmware;
    public Integer maxMksConnections;
    public Boolean guestAutoLockEnabled;
    public ManagedByInfo managedBy;
    public Boolean memoryReservationLockedToMax;
    public VirtualMachineConfigInfoOverheadInfo initialOverhead;
    public Boolean nestedHVEnabled;
    public Boolean vPMCEnabled;
    public ScheduledHardwareUpgradeInfo scheduledHardwareUpgradeInfo;
    public VirtualMachineForkConfigInfo forkConfigInfo;
    public long vFlashCacheReservation;
    public byte[] vmxConfigChecksum;
    public Boolean messageBusTunnelEnabled;
    public String vmStorageObjectId;
    public String swapStorageObjectId;

    public String getChangeVersion() {
        return this.changeVersion;
    }

    public void setChangeVersion(String changeVersion) {
        this.changeVersion = changeVersion;
    }

    public Calendar getModified() {
        return this.modified;
    }

    public void setModified(Calendar modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuestFullName() {
        return this.guestFullName;
    }

    public void setGuestFullName(String guestFullName) {
        this.guestFullName = guestFullName;
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

    public String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public boolean getTemplate() {
        return this.template;
    }

    public void setTemplate(boolean template) {
        this.template = template;
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

    public VirtualMachineDefaultPowerOpInfo getDefaultPowerOps() {
        return this.defaultPowerOps;
    }

    public void setDefaultPowerOps(VirtualMachineDefaultPowerOpInfo defaultPowerOps) {
        this.defaultPowerOps = defaultPowerOps;
    }

    public VirtualHardware getHardware() {
        return this.hardware;
    }

    public void setHardware(VirtualHardware hardware) {
        this.hardware = hardware;
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

    public long getHotPlugMemoryLimit() {
        return this.hotPlugMemoryLimit;
    }

    public void setHotPlugMemoryLimit(long hotPlugMemoryLimit) {
        this.hotPlugMemoryLimit = hotPlugMemoryLimit;
    }

    public long getHotPlugMemoryIncrementSize() {
        return this.hotPlugMemoryIncrementSize;
    }

    public void setHotPlugMemoryIncrementSize(long hotPlugMemoryIncrementSize) {
        this.hotPlugMemoryIncrementSize = hotPlugMemoryIncrementSize;
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

    public OptionValue[] getExtraConfig() {
        return this.extraConfig;
    }

    public void setExtraConfig(OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public HostCpuIdInfo[] getCpuFeatureMask() {
        return this.cpuFeatureMask;
    }

    public void setCpuFeatureMask(HostCpuIdInfo[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public VirtualMachineConfigInfoDatastoreUrlPair[] getDatastoreUrl() {
        return this.datastoreUrl;
    }

    public void setDatastoreUrl(VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl) {
        this.datastoreUrl = datastoreUrl;
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

    public VmConfigInfo getVAppConfig() {
        return this.vAppConfig;
    }

    public void setVAppConfig(VmConfigInfo vAppConfig) {
        this.vAppConfig = vAppConfig;
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

    public VirtualMachineConfigInfoOverheadInfo getInitialOverhead() {
        return this.initialOverhead;
    }

    public void setInitialOverhead(VirtualMachineConfigInfoOverheadInfo initialOverhead) {
        this.initialOverhead = initialOverhead;
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

    public VirtualMachineForkConfigInfo getForkConfigInfo() {
        return this.forkConfigInfo;
    }

    public void setForkConfigInfo(VirtualMachineForkConfigInfo forkConfigInfo) {
        this.forkConfigInfo = forkConfigInfo;
    }

    public long getVFlashCacheReservation() {
        return this.vFlashCacheReservation;
    }

    public void setVFlashCacheReservation(long vFlashCacheReservation) {
        this.vFlashCacheReservation = vFlashCacheReservation;
    }

    public byte[] getVmxConfigChecksum() {
        return this.vmxConfigChecksum;
    }

    public void setVmxConfigChecksum(byte[] vmxConfigChecksum) {
        this.vmxConfigChecksum = vmxConfigChecksum;
    }

    public Boolean getMessageBusTunnelEnabled() {
        return this.messageBusTunnelEnabled;
    }

    public void setMessageBusTunnelEnabled(Boolean messageBusTunnelEnabled) {
        this.messageBusTunnelEnabled = messageBusTunnelEnabled;
    }

    public String getVmStorageObjectId() {
        return this.vmStorageObjectId;
    }

    public void setVmStorageObjectId(String vmStorageObjectId) {
        this.vmStorageObjectId = vmStorageObjectId;
    }

    public String getSwapStorageObjectId() {
        return this.swapStorageObjectId;
    }

    public void setSwapStorageObjectId(String swapStorageObjectId) {
        this.swapStorageObjectId = swapStorageObjectId;
    }

}

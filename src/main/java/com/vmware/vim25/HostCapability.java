package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostCapability extends DynamicData {
    public boolean recursiveResourcePoolsSupported;
    public boolean cpuMemoryResourceConfigurationSupported;
    public boolean rebootSupported;
    public boolean shutdownSupported;
    public boolean vmotionSupported;
    public boolean standbySupported;
    public Boolean ipmiSupported;
    public Integer maxSupportedVMs;
    public Integer maxRunningVMs;
    public Integer maxSupportedVcpus;
    public Integer maxRegisteredVMs;
    public boolean datastorePrincipalSupported;
    public boolean sanSupported;
    public boolean nfsSupported;
    public boolean iscsiSupported;
    public boolean vlanTaggingSupported;
    public boolean nicTeamingSupported;
    public boolean highGuestMemSupported;
    public boolean maintenanceModeSupported;
    public boolean suspendedRelocateSupported;
    public boolean restrictedSnapshotRelocateSupported;
    public boolean perVmSwapFiles;
    public boolean localSwapDatastoreSupported;
    public boolean unsharedSwapVMotionSupported;
    public boolean backgroundSnapshotsSupported;
    public boolean preAssignedPCIUnitNumbersSupported;
    public boolean screenshotSupported;
    public boolean scaledScreenshotSupported;
    public Boolean storageVMotionSupported;
    public Boolean vmotionWithStorageVMotionSupported;
    public Boolean vmotionAcrossNetworkSupported;
    public Integer maxNumDisksSVMotion;
    public Boolean hbrNicSelectionSupported;
    public Boolean vrNfcNicSelectionSupported;
    public Boolean recordReplaySupported;
    public Boolean ftSupported;
    public String replayUnsupportedReason;
    public String[] replayCompatibilityIssues;
    public Boolean smpFtSupported;
    public String[] ftCompatibilityIssues;
    public String[] smpFtCompatibilityIssues;
    public Integer maxVcpusPerFtVm;
    public Boolean loginBySSLThumbprintSupported;
    public Boolean cloneFromSnapshotSupported;
    public Boolean deltaDiskBackingsSupported;
    public Boolean perVMNetworkTrafficShapingSupported;
    public Boolean tpmSupported;
    public HostCpuIdInfo[] supportedCpuFeature;
    public Boolean virtualExecUsageSupported;
    public Boolean storageIORMSupported;
    public Boolean vmDirectPathGen2Supported;
    public String[] vmDirectPathGen2UnsupportedReason;
    public String vmDirectPathGen2UnsupportedReasonExtended;
    public Integer[] supportedVmfsMajorVersion;
    public Boolean vStorageCapable;
    public Boolean snapshotRelayoutSupported;
    public Boolean firewallIpRulesSupported;
    public Boolean servicePackageInfoSupported;
    public Integer maxHostRunningVms;
    public Integer maxHostSupportedVcpus;
    public Boolean vmfsDatastoreMountCapable;
    public Boolean eightPlusHostVmfsSharedAccessSupported;
    public Boolean nestedHVSupported;
    public Boolean vPMCSupported;
    public Boolean interVMCommunicationThroughVMCISupported;
    public Boolean scheduledHardwareUpgradeSupported;
    public Boolean featureCapabilitiesSupported;
    public Boolean latencySensitivitySupported;
    public Boolean storagePolicySupported;
    public Boolean accel3dSupported;
    public Boolean reliableMemoryAware;
    public Boolean multipleNetworkStackInstanceSupported;
    public Boolean messageBusProxySupported;
    public Boolean vsanSupported;
    public Boolean vFlashSupported;
    public Boolean hostAccessManagerSupported;
    public Boolean provisioningNicSelectionSupported;
    public Boolean nfs41Supported;
    public Boolean turnDiskLocatorLedSupported;
    public Boolean virtualVolumeDatastoreSupported;
    public Boolean markAsSsdSupported;
    public Boolean markAsLocalSupported;
    public Boolean smartCardAuthenticationSupported;

    public boolean getRecursiveResourcePoolsSupported() {
        return this.recursiveResourcePoolsSupported;
    }

    public void setRecursiveResourcePoolsSupported(boolean recursiveResourcePoolsSupported) {
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
    }

    public boolean getCpuMemoryResourceConfigurationSupported() {
        return this.cpuMemoryResourceConfigurationSupported;
    }

    public void setCpuMemoryResourceConfigurationSupported(boolean cpuMemoryResourceConfigurationSupported) {
        this.cpuMemoryResourceConfigurationSupported = cpuMemoryResourceConfigurationSupported;
    }

    public boolean getRebootSupported() {
        return this.rebootSupported;
    }

    public void setRebootSupported(boolean rebootSupported) {
        this.rebootSupported = rebootSupported;
    }

    public boolean getShutdownSupported() {
        return this.shutdownSupported;
    }

    public void setShutdownSupported(boolean shutdownSupported) {
        this.shutdownSupported = shutdownSupported;
    }

    public boolean getVmotionSupported() {
        return this.vmotionSupported;
    }

    public void setVmotionSupported(boolean vmotionSupported) {
        this.vmotionSupported = vmotionSupported;
    }

    public boolean getStandbySupported() {
        return this.standbySupported;
    }

    public void setStandbySupported(boolean standbySupported) {
        this.standbySupported = standbySupported;
    }

    public Boolean getIpmiSupported() {
        return this.ipmiSupported;
    }

    public void setIpmiSupported(Boolean ipmiSupported) {
        this.ipmiSupported = ipmiSupported;
    }

    public Integer getMaxSupportedVMs() {
        return this.maxSupportedVMs;
    }

    public void setMaxSupportedVMs(Integer maxSupportedVMs) {
        this.maxSupportedVMs = maxSupportedVMs;
    }

    public Integer getMaxRunningVMs() {
        return this.maxRunningVMs;
    }

    public void setMaxRunningVMs(Integer maxRunningVMs) {
        this.maxRunningVMs = maxRunningVMs;
    }

    public Integer getMaxSupportedVcpus() {
        return this.maxSupportedVcpus;
    }

    public void setMaxSupportedVcpus(Integer maxSupportedVcpus) {
        this.maxSupportedVcpus = maxSupportedVcpus;
    }

    public Integer getMaxRegisteredVMs() {
        return this.maxRegisteredVMs;
    }

    public void setMaxRegisteredVMs(Integer maxRegisteredVMs) {
        this.maxRegisteredVMs = maxRegisteredVMs;
    }

    public boolean getDatastorePrincipalSupported() {
        return this.datastorePrincipalSupported;
    }

    public void setDatastorePrincipalSupported(boolean datastorePrincipalSupported) {
        this.datastorePrincipalSupported = datastorePrincipalSupported;
    }

    public boolean getSanSupported() {
        return this.sanSupported;
    }

    public void setSanSupported(boolean sanSupported) {
        this.sanSupported = sanSupported;
    }

    public boolean getNfsSupported() {
        return this.nfsSupported;
    }

    public void setNfsSupported(boolean nfsSupported) {
        this.nfsSupported = nfsSupported;
    }

    public boolean getIscsiSupported() {
        return this.iscsiSupported;
    }

    public void setIscsiSupported(boolean iscsiSupported) {
        this.iscsiSupported = iscsiSupported;
    }

    public boolean getVlanTaggingSupported() {
        return this.vlanTaggingSupported;
    }

    public void setVlanTaggingSupported(boolean vlanTaggingSupported) {
        this.vlanTaggingSupported = vlanTaggingSupported;
    }

    public boolean getNicTeamingSupported() {
        return this.nicTeamingSupported;
    }

    public void setNicTeamingSupported(boolean nicTeamingSupported) {
        this.nicTeamingSupported = nicTeamingSupported;
    }

    public boolean getHighGuestMemSupported() {
        return this.highGuestMemSupported;
    }

    public void setHighGuestMemSupported(boolean highGuestMemSupported) {
        this.highGuestMemSupported = highGuestMemSupported;
    }

    public boolean getMaintenanceModeSupported() {
        return this.maintenanceModeSupported;
    }

    public void setMaintenanceModeSupported(boolean maintenanceModeSupported) {
        this.maintenanceModeSupported = maintenanceModeSupported;
    }

    public boolean getSuspendedRelocateSupported() {
        return this.suspendedRelocateSupported;
    }

    public void setSuspendedRelocateSupported(boolean suspendedRelocateSupported) {
        this.suspendedRelocateSupported = suspendedRelocateSupported;
    }

    public boolean getRestrictedSnapshotRelocateSupported() {
        return this.restrictedSnapshotRelocateSupported;
    }

    public void setRestrictedSnapshotRelocateSupported(boolean restrictedSnapshotRelocateSupported) {
        this.restrictedSnapshotRelocateSupported = restrictedSnapshotRelocateSupported;
    }

    public boolean getPerVmSwapFiles() {
        return this.perVmSwapFiles;
    }

    public void setPerVmSwapFiles(boolean perVmSwapFiles) {
        this.perVmSwapFiles = perVmSwapFiles;
    }

    public boolean getLocalSwapDatastoreSupported() {
        return this.localSwapDatastoreSupported;
    }

    public void setLocalSwapDatastoreSupported(boolean localSwapDatastoreSupported) {
        this.localSwapDatastoreSupported = localSwapDatastoreSupported;
    }

    public boolean getUnsharedSwapVMotionSupported() {
        return this.unsharedSwapVMotionSupported;
    }

    public void setUnsharedSwapVMotionSupported(boolean unsharedSwapVMotionSupported) {
        this.unsharedSwapVMotionSupported = unsharedSwapVMotionSupported;
    }

    public boolean getBackgroundSnapshotsSupported() {
        return this.backgroundSnapshotsSupported;
    }

    public void setBackgroundSnapshotsSupported(boolean backgroundSnapshotsSupported) {
        this.backgroundSnapshotsSupported = backgroundSnapshotsSupported;
    }

    public boolean getPreAssignedPCIUnitNumbersSupported() {
        return this.preAssignedPCIUnitNumbersSupported;
    }

    public void setPreAssignedPCIUnitNumbersSupported(boolean preAssignedPCIUnitNumbersSupported) {
        this.preAssignedPCIUnitNumbersSupported = preAssignedPCIUnitNumbersSupported;
    }

    public boolean getScreenshotSupported() {
        return this.screenshotSupported;
    }

    public void setScreenshotSupported(boolean screenshotSupported) {
        this.screenshotSupported = screenshotSupported;
    }

    public boolean getScaledScreenshotSupported() {
        return this.scaledScreenshotSupported;
    }

    public void setScaledScreenshotSupported(boolean scaledScreenshotSupported) {
        this.scaledScreenshotSupported = scaledScreenshotSupported;
    }

    public Boolean getStorageVMotionSupported() {
        return this.storageVMotionSupported;
    }

    public void setStorageVMotionSupported(Boolean storageVMotionSupported) {
        this.storageVMotionSupported = storageVMotionSupported;
    }

    public Boolean getVmotionWithStorageVMotionSupported() {
        return this.vmotionWithStorageVMotionSupported;
    }

    public void setVmotionWithStorageVMotionSupported(Boolean vmotionWithStorageVMotionSupported) {
        this.vmotionWithStorageVMotionSupported = vmotionWithStorageVMotionSupported;
    }

    public Boolean getVmotionAcrossNetworkSupported() {
        return this.vmotionAcrossNetworkSupported;
    }

    public void setVmotionAcrossNetworkSupported(Boolean vmotionAcrossNetworkSupported) {
        this.vmotionAcrossNetworkSupported = vmotionAcrossNetworkSupported;
    }

    public Integer getMaxNumDisksSVMotion() {
        return this.maxNumDisksSVMotion;
    }

    public void setMaxNumDisksSVMotion(Integer maxNumDisksSVMotion) {
        this.maxNumDisksSVMotion = maxNumDisksSVMotion;
    }

    public Boolean getHbrNicSelectionSupported() {
        return this.hbrNicSelectionSupported;
    }

    public void setHbrNicSelectionSupported(Boolean hbrNicSelectionSupported) {
        this.hbrNicSelectionSupported = hbrNicSelectionSupported;
    }

    public Boolean getVrNfcNicSelectionSupported() {
        return this.vrNfcNicSelectionSupported;
    }

    public void setVrNfcNicSelectionSupported(Boolean vrNfcNicSelectionSupported) {
        this.vrNfcNicSelectionSupported = vrNfcNicSelectionSupported;
    }

    public Boolean getRecordReplaySupported() {
        return this.recordReplaySupported;
    }

    public void setRecordReplaySupported(Boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }

    public Boolean getFtSupported() {
        return this.ftSupported;
    }

    public void setFtSupported(Boolean ftSupported) {
        this.ftSupported = ftSupported;
    }

    public String getReplayUnsupportedReason() {
        return this.replayUnsupportedReason;
    }

    public void setReplayUnsupportedReason(String replayUnsupportedReason) {
        this.replayUnsupportedReason = replayUnsupportedReason;
    }

    public String[] getReplayCompatibilityIssues() {
        return this.replayCompatibilityIssues;
    }

    public void setReplayCompatibilityIssues(String[] replayCompatibilityIssues) {
        this.replayCompatibilityIssues = replayCompatibilityIssues;
    }

    public Boolean getSmpFtSupported() {
        return this.smpFtSupported;
    }

    public void setSmpFtSupported(Boolean smpFtSupported) {
        this.smpFtSupported = smpFtSupported;
    }

    public String[] getFtCompatibilityIssues() {
        return this.ftCompatibilityIssues;
    }

    public void setFtCompatibilityIssues(String[] ftCompatibilityIssues) {
        this.ftCompatibilityIssues = ftCompatibilityIssues;
    }

    public String[] getSmpFtCompatibilityIssues() {
        return this.smpFtCompatibilityIssues;
    }

    public void setSmpFtCompatibilityIssues(String[] smpFtCompatibilityIssues) {
        this.smpFtCompatibilityIssues = smpFtCompatibilityIssues;
    }

    public Integer getMaxVcpusPerFtVm() {
        return this.maxVcpusPerFtVm;
    }

    public void setMaxVcpusPerFtVm(Integer maxVcpusPerFtVm) {
        this.maxVcpusPerFtVm = maxVcpusPerFtVm;
    }

    public Boolean getLoginBySSLThumbprintSupported() {
        return this.loginBySSLThumbprintSupported;
    }

    public void setLoginBySSLThumbprintSupported(Boolean loginBySSLThumbprintSupported) {
        this.loginBySSLThumbprintSupported = loginBySSLThumbprintSupported;
    }

    public Boolean getCloneFromSnapshotSupported() {
        return this.cloneFromSnapshotSupported;
    }

    public void setCloneFromSnapshotSupported(Boolean cloneFromSnapshotSupported) {
        this.cloneFromSnapshotSupported = cloneFromSnapshotSupported;
    }

    public Boolean getDeltaDiskBackingsSupported() {
        return this.deltaDiskBackingsSupported;
    }

    public void setDeltaDiskBackingsSupported(Boolean deltaDiskBackingsSupported) {
        this.deltaDiskBackingsSupported = deltaDiskBackingsSupported;
    }

    public Boolean getPerVMNetworkTrafficShapingSupported() {
        return this.perVMNetworkTrafficShapingSupported;
    }

    public void setPerVMNetworkTrafficShapingSupported(Boolean perVMNetworkTrafficShapingSupported) {
        this.perVMNetworkTrafficShapingSupported = perVMNetworkTrafficShapingSupported;
    }

    public Boolean getTpmSupported() {
        return this.tpmSupported;
    }

    public void setTpmSupported(Boolean tpmSupported) {
        this.tpmSupported = tpmSupported;
    }

    public HostCpuIdInfo[] getSupportedCpuFeature() {
        return this.supportedCpuFeature;
    }

    public void setSupportedCpuFeature(HostCpuIdInfo[] supportedCpuFeature) {
        this.supportedCpuFeature = supportedCpuFeature;
    }

    public Boolean getVirtualExecUsageSupported() {
        return this.virtualExecUsageSupported;
    }

    public void setVirtualExecUsageSupported(Boolean virtualExecUsageSupported) {
        this.virtualExecUsageSupported = virtualExecUsageSupported;
    }

    public Boolean getStorageIORMSupported() {
        return this.storageIORMSupported;
    }

    public void setStorageIORMSupported(Boolean storageIORMSupported) {
        this.storageIORMSupported = storageIORMSupported;
    }

    public Boolean getVmDirectPathGen2Supported() {
        return this.vmDirectPathGen2Supported;
    }

    public void setVmDirectPathGen2Supported(Boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }

    public String[] getVmDirectPathGen2UnsupportedReason() {
        return this.vmDirectPathGen2UnsupportedReason;
    }

    public void setVmDirectPathGen2UnsupportedReason(String[] vmDirectPathGen2UnsupportedReason) {
        this.vmDirectPathGen2UnsupportedReason = vmDirectPathGen2UnsupportedReason;
    }

    public String getVmDirectPathGen2UnsupportedReasonExtended() {
        return this.vmDirectPathGen2UnsupportedReasonExtended;
    }

    public void setVmDirectPathGen2UnsupportedReasonExtended(String vmDirectPathGen2UnsupportedReasonExtended) {
        this.vmDirectPathGen2UnsupportedReasonExtended = vmDirectPathGen2UnsupportedReasonExtended;
    }

    public Integer[] getSupportedVmfsMajorVersion() {
        return this.supportedVmfsMajorVersion;
    }

    public void setSupportedVmfsMajorVersion(Integer[] supportedVmfsMajorVersion) {
        this.supportedVmfsMajorVersion = supportedVmfsMajorVersion;
    }

    public Boolean getVStorageCapable() {
        return this.vStorageCapable;
    }

    public void setVStorageCapable(Boolean vStorageCapable) {
        this.vStorageCapable = vStorageCapable;
    }

    public Boolean getSnapshotRelayoutSupported() {
        return this.snapshotRelayoutSupported;
    }

    public void setSnapshotRelayoutSupported(Boolean snapshotRelayoutSupported) {
        this.snapshotRelayoutSupported = snapshotRelayoutSupported;
    }

    public Boolean getFirewallIpRulesSupported() {
        return this.firewallIpRulesSupported;
    }

    public void setFirewallIpRulesSupported(Boolean firewallIpRulesSupported) {
        this.firewallIpRulesSupported = firewallIpRulesSupported;
    }

    public Boolean getServicePackageInfoSupported() {
        return this.servicePackageInfoSupported;
    }

    public void setServicePackageInfoSupported(Boolean servicePackageInfoSupported) {
        this.servicePackageInfoSupported = servicePackageInfoSupported;
    }

    public Integer getMaxHostRunningVms() {
        return this.maxHostRunningVms;
    }

    public void setMaxHostRunningVms(Integer maxHostRunningVms) {
        this.maxHostRunningVms = maxHostRunningVms;
    }

    public Integer getMaxHostSupportedVcpus() {
        return this.maxHostSupportedVcpus;
    }

    public void setMaxHostSupportedVcpus(Integer maxHostSupportedVcpus) {
        this.maxHostSupportedVcpus = maxHostSupportedVcpus;
    }

    public Boolean getVmfsDatastoreMountCapable() {
        return this.vmfsDatastoreMountCapable;
    }

    public void setVmfsDatastoreMountCapable(Boolean vmfsDatastoreMountCapable) {
        this.vmfsDatastoreMountCapable = vmfsDatastoreMountCapable;
    }

    public Boolean getEightPlusHostVmfsSharedAccessSupported() {
        return this.eightPlusHostVmfsSharedAccessSupported;
    }

    public void setEightPlusHostVmfsSharedAccessSupported(Boolean eightPlusHostVmfsSharedAccessSupported) {
        this.eightPlusHostVmfsSharedAccessSupported = eightPlusHostVmfsSharedAccessSupported;
    }

    public Boolean getNestedHVSupported() {
        return this.nestedHVSupported;
    }

    public void setNestedHVSupported(Boolean nestedHVSupported) {
        this.nestedHVSupported = nestedHVSupported;
    }

    public Boolean getVPMCSupported() {
        return this.vPMCSupported;
    }

    public void setVPMCSupported(Boolean vPMCSupported) {
        this.vPMCSupported = vPMCSupported;
    }

    public Boolean getInterVMCommunicationThroughVMCISupported() {
        return this.interVMCommunicationThroughVMCISupported;
    }

    public void setInterVMCommunicationThroughVMCISupported(Boolean interVMCommunicationThroughVMCISupported) {
        this.interVMCommunicationThroughVMCISupported = interVMCommunicationThroughVMCISupported;
    }

    public Boolean getScheduledHardwareUpgradeSupported() {
        return this.scheduledHardwareUpgradeSupported;
    }

    public void setScheduledHardwareUpgradeSupported(Boolean scheduledHardwareUpgradeSupported) {
        this.scheduledHardwareUpgradeSupported = scheduledHardwareUpgradeSupported;
    }

    public Boolean getFeatureCapabilitiesSupported() {
        return this.featureCapabilitiesSupported;
    }

    public void setFeatureCapabilitiesSupported(Boolean featureCapabilitiesSupported) {
        this.featureCapabilitiesSupported = featureCapabilitiesSupported;
    }

    public Boolean getLatencySensitivitySupported() {
        return this.latencySensitivitySupported;
    }

    public void setLatencySensitivitySupported(Boolean latencySensitivitySupported) {
        this.latencySensitivitySupported = latencySensitivitySupported;
    }

    public Boolean getStoragePolicySupported() {
        return this.storagePolicySupported;
    }

    public void setStoragePolicySupported(Boolean storagePolicySupported) {
        this.storagePolicySupported = storagePolicySupported;
    }

    public Boolean getAccel3dSupported() {
        return this.accel3dSupported;
    }

    public void setAccel3dSupported(Boolean accel3dSupported) {
        this.accel3dSupported = accel3dSupported;
    }

    public Boolean getReliableMemoryAware() {
        return this.reliableMemoryAware;
    }

    public void setReliableMemoryAware(Boolean reliableMemoryAware) {
        this.reliableMemoryAware = reliableMemoryAware;
    }

    public Boolean getMultipleNetworkStackInstanceSupported() {
        return this.multipleNetworkStackInstanceSupported;
    }

    public void setMultipleNetworkStackInstanceSupported(Boolean multipleNetworkStackInstanceSupported) {
        this.multipleNetworkStackInstanceSupported = multipleNetworkStackInstanceSupported;
    }

    public Boolean getMessageBusProxySupported() {
        return this.messageBusProxySupported;
    }

    public void setMessageBusProxySupported(Boolean messageBusProxySupported) {
        this.messageBusProxySupported = messageBusProxySupported;
    }

    public Boolean getVsanSupported() {
        return this.vsanSupported;
    }

    public void setVsanSupported(Boolean vsanSupported) {
        this.vsanSupported = vsanSupported;
    }

    public Boolean getVFlashSupported() {
        return this.vFlashSupported;
    }

    public void setVFlashSupported(Boolean vFlashSupported) {
        this.vFlashSupported = vFlashSupported;
    }

    public Boolean getHostAccessManagerSupported() {
        return this.hostAccessManagerSupported;
    }

    public void setHostAccessManagerSupported(Boolean hostAccessManagerSupported) {
        this.hostAccessManagerSupported = hostAccessManagerSupported;
    }

    public Boolean getProvisioningNicSelectionSupported() {
        return this.provisioningNicSelectionSupported;
    }

    public void setProvisioningNicSelectionSupported(Boolean provisioningNicSelectionSupported) {
        this.provisioningNicSelectionSupported = provisioningNicSelectionSupported;
    }

    public Boolean getNfs41Supported() {
        return this.nfs41Supported;
    }

    public void setNfs41Supported(Boolean nfs41Supported) {
        this.nfs41Supported = nfs41Supported;
    }

    public Boolean getTurnDiskLocatorLedSupported() {
        return this.turnDiskLocatorLedSupported;
    }

    public void setTurnDiskLocatorLedSupported(Boolean turnDiskLocatorLedSupported) {
        this.turnDiskLocatorLedSupported = turnDiskLocatorLedSupported;
    }

    public Boolean getVirtualVolumeDatastoreSupported() {
        return this.virtualVolumeDatastoreSupported;
    }

    public void setVirtualVolumeDatastoreSupported(Boolean virtualVolumeDatastoreSupported) {
        this.virtualVolumeDatastoreSupported = virtualVolumeDatastoreSupported;
    }

    public Boolean getMarkAsSsdSupported() {
        return this.markAsSsdSupported;
    }

    public void setMarkAsSsdSupported(Boolean markAsSsdSupported) {
        this.markAsSsdSupported = markAsSsdSupported;
    }

    public Boolean getMarkAsLocalSupported() {
        return this.markAsLocalSupported;
    }

    public void setMarkAsLocalSupported(Boolean markAsLocalSupported) {
        this.markAsLocalSupported = markAsLocalSupported;
    }

    public Boolean getSmartCardAuthenticationSupported() {
        return this.smartCardAuthenticationSupported;
    }

    public void setSmartCardAuthenticationSupported(Boolean smartCardAuthenticationSupported) {
        this.smartCardAuthenticationSupported = smartCardAuthenticationSupported;
    }

}

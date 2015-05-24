package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostConfigInfo extends DynamicData {
    public ManagedObjectReference host;
    public AboutInfo product;
    public HostHyperThreadScheduleInfo hyperThread;
    public ServiceConsoleReservationInfo consoleReservation;
    public VirtualMachineMemoryReservationInfo virtualMachineReservation;
    public HostStorageDeviceInfo storageDevice;
    public HostMultipathStateInfo multipathState;
    public HostFileSystemVolumeInfo fileSystemVolume;
    public String[] systemFile;
    public HostNetworkInfo network;
    public HostVMotionInfo vmotion;
    public HostVirtualNicManagerInfo virtualNicManagerInfo;
    public HostNetCapabilities capabilities;
    public HostDatastoreSystemCapabilities datastoreCapabilities;
    public HostNetOffloadCapabilities offloadCapabilities;
    public HostServiceInfo service;
    public HostFirewallInfo firewall;
    public HostAutoStartManagerConfig autoStart;
    public HostDiagnosticPartition activeDiagnosticPartition;
    public OptionValue[] option;
    public OptionDef[] optionDef;
    public String datastorePrincipal;
    public ManagedObjectReference localSwapDatastore;
    public HostSystemSwapConfiguration systemSwapConfiguration;
    public HostSystemResourceInfo systemResources;
    public HostDateTimeInfo dateTimeInfo;
    public HostFlagInfo flags;
    public Boolean adminDisabled;
    public HostLockdownMode lockdownMode;
    public HostIpmiInfo ipmi;
    public HostSslThumbprintInfo sslThumbprintInfo;
    public HostSslThumbprintInfo[] sslThumbprintData;
    public byte[] certificate;
    public HostPciPassthruInfo[] pciPassthruInfo;
    public HostAuthenticationManagerInfo authenticationManagerInfo;
    public HostFeatureVersionInfo[] featureVersion;
    public PowerSystemCapability powerSystemCapability;
    public PowerSystemInfo powerSystemInfo;
    public HostCacheConfigurationInfo[] cacheConfigurationInfo;
    public Boolean wakeOnLanCapable;
    public HostFeatureCapability[] featureCapability;
    public HostFeatureCapability[] maskedFeatureCapability;
    public HostVFlashManagerVFlashConfigInfo vFlashConfigInfo;
    public VsanHostConfigInfo vsanHostConfig;
    public String[] domainList;
    public byte[] scriptCheckSum;
    public byte[] hostConfigCheckSum;
    public HostGraphicsInfo[] graphicsInfo;
    public String[] sharedPassthruGpuTypes;
    public HostIoFilterInfo[] ioFilterInfo;

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public AboutInfo getProduct() {
        return this.product;
    }

    public void setProduct(AboutInfo product) {
        this.product = product;
    }

    public HostHyperThreadScheduleInfo getHyperThread() {
        return this.hyperThread;
    }

    public void setHyperThread(HostHyperThreadScheduleInfo hyperThread) {
        this.hyperThread = hyperThread;
    }

    public ServiceConsoleReservationInfo getConsoleReservation() {
        return this.consoleReservation;
    }

    public void setConsoleReservation(ServiceConsoleReservationInfo consoleReservation) {
        this.consoleReservation = consoleReservation;
    }

    public VirtualMachineMemoryReservationInfo getVirtualMachineReservation() {
        return this.virtualMachineReservation;
    }

    public void setVirtualMachineReservation(VirtualMachineMemoryReservationInfo virtualMachineReservation) {
        this.virtualMachineReservation = virtualMachineReservation;
    }

    public HostStorageDeviceInfo getStorageDevice() {
        return this.storageDevice;
    }

    public void setStorageDevice(HostStorageDeviceInfo storageDevice) {
        this.storageDevice = storageDevice;
    }

    public HostMultipathStateInfo getMultipathState() {
        return this.multipathState;
    }

    public void setMultipathState(HostMultipathStateInfo multipathState) {
        this.multipathState = multipathState;
    }

    public HostFileSystemVolumeInfo getFileSystemVolume() {
        return this.fileSystemVolume;
    }

    public void setFileSystemVolume(HostFileSystemVolumeInfo fileSystemVolume) {
        this.fileSystemVolume = fileSystemVolume;
    }

    public String[] getSystemFile() {
        return this.systemFile;
    }

    public void setSystemFile(String[] systemFile) {
        this.systemFile = systemFile;
    }

    public HostNetworkInfo getNetwork() {
        return this.network;
    }

    public void setNetwork(HostNetworkInfo network) {
        this.network = network;
    }

    public HostVMotionInfo getVmotion() {
        return this.vmotion;
    }

    public void setVmotion(HostVMotionInfo vmotion) {
        this.vmotion = vmotion;
    }

    public HostVirtualNicManagerInfo getVirtualNicManagerInfo() {
        return this.virtualNicManagerInfo;
    }

    public void setVirtualNicManagerInfo(HostVirtualNicManagerInfo virtualNicManagerInfo) {
        this.virtualNicManagerInfo = virtualNicManagerInfo;
    }

    public HostNetCapabilities getCapabilities() {
        return this.capabilities;
    }

    public void setCapabilities(HostNetCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public HostDatastoreSystemCapabilities getDatastoreCapabilities() {
        return this.datastoreCapabilities;
    }

    public void setDatastoreCapabilities(HostDatastoreSystemCapabilities datastoreCapabilities) {
        this.datastoreCapabilities = datastoreCapabilities;
    }

    public HostNetOffloadCapabilities getOffloadCapabilities() {
        return this.offloadCapabilities;
    }

    public void setOffloadCapabilities(HostNetOffloadCapabilities offloadCapabilities) {
        this.offloadCapabilities = offloadCapabilities;
    }

    public HostServiceInfo getService() {
        return this.service;
    }

    public void setService(HostServiceInfo service) {
        this.service = service;
    }

    public HostFirewallInfo getFirewall() {
        return this.firewall;
    }

    public void setFirewall(HostFirewallInfo firewall) {
        this.firewall = firewall;
    }

    public HostAutoStartManagerConfig getAutoStart() {
        return this.autoStart;
    }

    public void setAutoStart(HostAutoStartManagerConfig autoStart) {
        this.autoStart = autoStart;
    }

    public HostDiagnosticPartition getActiveDiagnosticPartition() {
        return this.activeDiagnosticPartition;
    }

    public void setActiveDiagnosticPartition(HostDiagnosticPartition activeDiagnosticPartition) {
        this.activeDiagnosticPartition = activeDiagnosticPartition;
    }

    public OptionValue[] getOption() {
        return this.option;
    }

    public void setOption(OptionValue[] option) {
        this.option = option;
    }

    public OptionDef[] getOptionDef() {
        return this.optionDef;
    }

    public void setOptionDef(OptionDef[] optionDef) {
        this.optionDef = optionDef;
    }

    public String getDatastorePrincipal() {
        return this.datastorePrincipal;
    }

    public void setDatastorePrincipal(String datastorePrincipal) {
        this.datastorePrincipal = datastorePrincipal;
    }

    public ManagedObjectReference getLocalSwapDatastore() {
        return this.localSwapDatastore;
    }

    public void setLocalSwapDatastore(ManagedObjectReference localSwapDatastore) {
        this.localSwapDatastore = localSwapDatastore;
    }

    public HostSystemSwapConfiguration getSystemSwapConfiguration() {
        return this.systemSwapConfiguration;
    }

    public void setSystemSwapConfiguration(HostSystemSwapConfiguration systemSwapConfiguration) {
        this.systemSwapConfiguration = systemSwapConfiguration;
    }

    public HostSystemResourceInfo getSystemResources() {
        return this.systemResources;
    }

    public void setSystemResources(HostSystemResourceInfo systemResources) {
        this.systemResources = systemResources;
    }

    public HostDateTimeInfo getDateTimeInfo() {
        return this.dateTimeInfo;
    }

    public void setDateTimeInfo(HostDateTimeInfo dateTimeInfo) {
        this.dateTimeInfo = dateTimeInfo;
    }

    public HostFlagInfo getFlags() {
        return this.flags;
    }

    public void setFlags(HostFlagInfo flags) {
        this.flags = flags;
    }

    public Boolean getAdminDisabled() {
        return this.adminDisabled;
    }

    public void setAdminDisabled(Boolean adminDisabled) {
        this.adminDisabled = adminDisabled;
    }

    public HostLockdownMode getLockdownMode() {
        return this.lockdownMode;
    }

    public void setLockdownMode(HostLockdownMode lockdownMode) {
        this.lockdownMode = lockdownMode;
    }

    public HostIpmiInfo getIpmi() {
        return this.ipmi;
    }

    public void setIpmi(HostIpmiInfo ipmi) {
        this.ipmi = ipmi;
    }

    public HostSslThumbprintInfo getSslThumbprintInfo() {
        return this.sslThumbprintInfo;
    }

    public void setSslThumbprintInfo(HostSslThumbprintInfo sslThumbprintInfo) {
        this.sslThumbprintInfo = sslThumbprintInfo;
    }

    public HostSslThumbprintInfo[] getSslThumbprintData() {
        return this.sslThumbprintData;
    }

    public void setSslThumbprintData(HostSslThumbprintInfo[] sslThumbprintData) {
        this.sslThumbprintData = sslThumbprintData;
    }

    public byte[] getCertificate() {
        return this.certificate;
    }

    public void setCertificate(byte[] certificate) {
        this.certificate = certificate;
    }

    public HostPciPassthruInfo[] getPciPassthruInfo() {
        return this.pciPassthruInfo;
    }

    public void setPciPassthruInfo(HostPciPassthruInfo[] pciPassthruInfo) {
        this.pciPassthruInfo = pciPassthruInfo;
    }

    public HostAuthenticationManagerInfo getAuthenticationManagerInfo() {
        return this.authenticationManagerInfo;
    }

    public void setAuthenticationManagerInfo(HostAuthenticationManagerInfo authenticationManagerInfo) {
        this.authenticationManagerInfo = authenticationManagerInfo;
    }

    public HostFeatureVersionInfo[] getFeatureVersion() {
        return this.featureVersion;
    }

    public void setFeatureVersion(HostFeatureVersionInfo[] featureVersion) {
        this.featureVersion = featureVersion;
    }

    public PowerSystemCapability getPowerSystemCapability() {
        return this.powerSystemCapability;
    }

    public void setPowerSystemCapability(PowerSystemCapability powerSystemCapability) {
        this.powerSystemCapability = powerSystemCapability;
    }

    public PowerSystemInfo getPowerSystemInfo() {
        return this.powerSystemInfo;
    }

    public void setPowerSystemInfo(PowerSystemInfo powerSystemInfo) {
        this.powerSystemInfo = powerSystemInfo;
    }

    public HostCacheConfigurationInfo[] getCacheConfigurationInfo() {
        return this.cacheConfigurationInfo;
    }

    public void setCacheConfigurationInfo(HostCacheConfigurationInfo[] cacheConfigurationInfo) {
        this.cacheConfigurationInfo = cacheConfigurationInfo;
    }

    public Boolean getWakeOnLanCapable() {
        return this.wakeOnLanCapable;
    }

    public void setWakeOnLanCapable(Boolean wakeOnLanCapable) {
        this.wakeOnLanCapable = wakeOnLanCapable;
    }

    public HostFeatureCapability[] getFeatureCapability() {
        return this.featureCapability;
    }

    public void setFeatureCapability(HostFeatureCapability[] featureCapability) {
        this.featureCapability = featureCapability;
    }

    public HostFeatureCapability[] getMaskedFeatureCapability() {
        return this.maskedFeatureCapability;
    }

    public void setMaskedFeatureCapability(HostFeatureCapability[] maskedFeatureCapability) {
        this.maskedFeatureCapability = maskedFeatureCapability;
    }

    public HostVFlashManagerVFlashConfigInfo getVFlashConfigInfo() {
        return this.vFlashConfigInfo;
    }

    public void setVFlashConfigInfo(HostVFlashManagerVFlashConfigInfo vFlashConfigInfo) {
        this.vFlashConfigInfo = vFlashConfigInfo;
    }

    public VsanHostConfigInfo getVsanHostConfig() {
        return this.vsanHostConfig;
    }

    public void setVsanHostConfig(VsanHostConfigInfo vsanHostConfig) {
        this.vsanHostConfig = vsanHostConfig;
    }

    public String[] getDomainList() {
        return this.domainList;
    }

    public void setDomainList(String[] domainList) {
        this.domainList = domainList;
    }

    public byte[] getScriptCheckSum() {
        return this.scriptCheckSum;
    }

    public void setScriptCheckSum(byte[] scriptCheckSum) {
        this.scriptCheckSum = scriptCheckSum;
    }

    public byte[] getHostConfigCheckSum() {
        return this.hostConfigCheckSum;
    }

    public void setHostConfigCheckSum(byte[] hostConfigCheckSum) {
        this.hostConfigCheckSum = hostConfigCheckSum;
    }

    public HostGraphicsInfo[] getGraphicsInfo() {
        return this.graphicsInfo;
    }

    public void setGraphicsInfo(HostGraphicsInfo[] graphicsInfo) {
        this.graphicsInfo = graphicsInfo;
    }

    public String[] getSharedPassthruGpuTypes() {
        return this.sharedPassthruGpuTypes;
    }

    public void setSharedPassthruGpuTypes(String[] sharedPassthruGpuTypes) {
        this.sharedPassthruGpuTypes = sharedPassthruGpuTypes;
    }

    public HostIoFilterInfo[] getIoFilterInfo() {
        return this.ioFilterInfo;
    }

    public void setIoFilterInfo(HostIoFilterInfo[] ioFilterInfo) {
        this.ioFilterInfo = ioFilterInfo;
    }

}

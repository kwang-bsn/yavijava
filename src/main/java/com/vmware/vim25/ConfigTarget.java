package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class ConfigTarget extends DynamicData {
    public int numCpus;
    public int numCpuCores;
    public int numNumaNodes;
    public Boolean smcPresent;
    public VirtualMachineDatastoreInfo[] datastore;
    public VirtualMachineNetworkInfo[] network;
    public OpaqueNetworkTargetInfo[] opaqueNetwork;
    public DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup;
    public DistributedVirtualSwitchInfo[] distributedVirtualSwitch;
    public VirtualMachineCdromInfo[] cdRom;
    public VirtualMachineSerialInfo[] serial;
    public VirtualMachineParallelInfo[] parallel;
    public VirtualMachineSoundInfo[] sound;
    public VirtualMachineUsbInfo[] usb;
    public VirtualMachineFloppyInfo[] floppy;
    public VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo;
    public VirtualMachineScsiPassthroughInfo[] scsiPassthrough;
    public VirtualMachineScsiDiskDeviceInfo[] scsiDisk;
    public VirtualMachineIdeDiskDeviceInfo[] ideDisk;
    public int maxMemMBOptimalPerf;
    public ResourcePoolRuntimeInfo resourcePool;
    public Boolean autoVmotion;
    public VirtualMachinePciPassthroughInfo[] pciPassthrough;
    public VirtualMachineSriovInfo[] sriov;
    public VirtualMachineVFlashModuleInfo[] vFlashModule;
    public VirtualMachinePciSharedGpuPassthroughInfo[] sharedGpuPassthroughTypes;

    public int getNumCpus() {
        return this.numCpus;
    }

    public void setNumCpus(int numCpus) {
        this.numCpus = numCpus;
    }

    public int getNumCpuCores() {
        return this.numCpuCores;
    }

    public void setNumCpuCores(int numCpuCores) {
        this.numCpuCores = numCpuCores;
    }

    public int getNumNumaNodes() {
        return this.numNumaNodes;
    }

    public void setNumNumaNodes(int numNumaNodes) {
        this.numNumaNodes = numNumaNodes;
    }

    public Boolean getSmcPresent() {
        return this.smcPresent;
    }

    public void setSmcPresent(Boolean smcPresent) {
        this.smcPresent = smcPresent;
    }

    public VirtualMachineDatastoreInfo[] getDatastore() {
        return this.datastore;
    }

    public void setDatastore(VirtualMachineDatastoreInfo[] datastore) {
        this.datastore = datastore;
    }

    public VirtualMachineNetworkInfo[] getNetwork() {
        return this.network;
    }

    public void setNetwork(VirtualMachineNetworkInfo[] network) {
        this.network = network;
    }

    public OpaqueNetworkTargetInfo[] getOpaqueNetwork() {
        return this.opaqueNetwork;
    }

    public void setOpaqueNetwork(OpaqueNetworkTargetInfo[] opaqueNetwork) {
        this.opaqueNetwork = opaqueNetwork;
    }

    public DistributedVirtualPortgroupInfo[] getDistributedVirtualPortgroup() {
        return this.distributedVirtualPortgroup;
    }

    public void setDistributedVirtualPortgroup(DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
    }

    public DistributedVirtualSwitchInfo[] getDistributedVirtualSwitch() {
        return this.distributedVirtualSwitch;
    }

    public void setDistributedVirtualSwitch(DistributedVirtualSwitchInfo[] distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public VirtualMachineCdromInfo[] getCdRom() {
        return this.cdRom;
    }

    public void setCdRom(VirtualMachineCdromInfo[] cdRom) {
        this.cdRom = cdRom;
    }

    public VirtualMachineSerialInfo[] getSerial() {
        return this.serial;
    }

    public void setSerial(VirtualMachineSerialInfo[] serial) {
        this.serial = serial;
    }

    public VirtualMachineParallelInfo[] getParallel() {
        return this.parallel;
    }

    public void setParallel(VirtualMachineParallelInfo[] parallel) {
        this.parallel = parallel;
    }

    public VirtualMachineSoundInfo[] getSound() {
        return this.sound;
    }

    public void setSound(VirtualMachineSoundInfo[] sound) {
        this.sound = sound;
    }

    public VirtualMachineUsbInfo[] getUsb() {
        return this.usb;
    }

    public void setUsb(VirtualMachineUsbInfo[] usb) {
        this.usb = usb;
    }

    public VirtualMachineFloppyInfo[] getFloppy() {
        return this.floppy;
    }

    public void setFloppy(VirtualMachineFloppyInfo[] floppy) {
        this.floppy = floppy;
    }

    public VirtualMachineLegacyNetworkSwitchInfo[] getLegacyNetworkInfo() {
        return this.legacyNetworkInfo;
    }

    public void setLegacyNetworkInfo(VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo) {
        this.legacyNetworkInfo = legacyNetworkInfo;
    }

    public VirtualMachineScsiPassthroughInfo[] getScsiPassthrough() {
        return this.scsiPassthrough;
    }

    public void setScsiPassthrough(VirtualMachineScsiPassthroughInfo[] scsiPassthrough) {
        this.scsiPassthrough = scsiPassthrough;
    }

    public VirtualMachineScsiDiskDeviceInfo[] getScsiDisk() {
        return this.scsiDisk;
    }

    public void setScsiDisk(VirtualMachineScsiDiskDeviceInfo[] scsiDisk) {
        this.scsiDisk = scsiDisk;
    }

    public VirtualMachineIdeDiskDeviceInfo[] getIdeDisk() {
        return this.ideDisk;
    }

    public void setIdeDisk(VirtualMachineIdeDiskDeviceInfo[] ideDisk) {
        this.ideDisk = ideDisk;
    }

    public int getMaxMemMBOptimalPerf() {
        return this.maxMemMBOptimalPerf;
    }

    public void setMaxMemMBOptimalPerf(int maxMemMBOptimalPerf) {
        this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
    }

    public ResourcePoolRuntimeInfo getResourcePool() {
        return this.resourcePool;
    }

    public void setResourcePool(ResourcePoolRuntimeInfo resourcePool) {
        this.resourcePool = resourcePool;
    }

    public Boolean getAutoVmotion() {
        return this.autoVmotion;
    }

    public void setAutoVmotion(Boolean autoVmotion) {
        this.autoVmotion = autoVmotion;
    }

    public VirtualMachinePciPassthroughInfo[] getPciPassthrough() {
        return this.pciPassthrough;
    }

    public void setPciPassthrough(VirtualMachinePciPassthroughInfo[] pciPassthrough) {
        this.pciPassthrough = pciPassthrough;
    }

    public VirtualMachineSriovInfo[] getSriov() {
        return this.sriov;
    }

    public void setSriov(VirtualMachineSriovInfo[] sriov) {
        this.sriov = sriov;
    }

    public VirtualMachineVFlashModuleInfo[] getVFlashModule() {
        return this.vFlashModule;
    }

    public void setVFlashModule(VirtualMachineVFlashModuleInfo[] vFlashModule) {
        this.vFlashModule = vFlashModule;
    }

    public VirtualMachinePciSharedGpuPassthroughInfo[] getSharedGpuPassthroughTypes() {
        return this.sharedGpuPassthroughTypes;
    }

    public void setSharedGpuPassthroughTypes(VirtualMachinePciSharedGpuPassthroughInfo[] sharedGpuPassthroughTypes) {
        this.sharedGpuPassthroughTypes = sharedGpuPassthroughTypes;
    }

}

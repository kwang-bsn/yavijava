package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class GuestOsDescriptor extends DynamicData {
    public String id;
    public String family;
    public String fullName;
    public int supportedMaxCPUs;
    public Integer numSupportedPhysicalSockets;
    public Integer numSupportedCoresPerSocket;
    public int supportedMinMemMB;
    public int supportedMaxMemMB;
    public int recommendedMemMB;
    public int recommendedColorDepth;
    public String[] supportedDiskControllerList;
    public String recommendedSCSIController;
    public String recommendedDiskController;
    public int supportedNumDisks;
    public int recommendedDiskSizeMB;
    public String recommendedCdromController;
    public String[] supportedEthernetCard;
    public String recommendedEthernetCard;
    public Boolean supportsSlaveDisk;
    public HostCpuIdInfo[] cpuFeatureMask;
    public Boolean smcRequired;
    public boolean supportsWakeOnLan;
    public Boolean supportsVMI;
    public Boolean supportsMemoryHotAdd;
    public Boolean supportsCpuHotAdd;
    public Boolean supportsCpuHotRemove;
    public String[] supportedFirmware;
    public String recommendedFirmware;
    public String[] supportedUSBControllerList;
    public String recommendedUSBController;
    public Boolean supports3D;
    public Boolean recommended3D;
    public Boolean smcRecommended;
    public Boolean ich7mRecommended;
    public Boolean usbRecommended;
    public String supportLevel;
    public Boolean supportedForCreate;
    public IntOption vRAMSizeInKB;
    public Integer numSupportedFloppyDevices;
    public String[] wakeOnLanEthernetCard;
    public Boolean supportsPvscsiControllerForBoot;
    public Boolean diskUuidEnabled;
    public Boolean supportsHotPlugPCI;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSupportedMaxCPUs() {
        return this.supportedMaxCPUs;
    }

    public void setSupportedMaxCPUs(int supportedMaxCPUs) {
        this.supportedMaxCPUs = supportedMaxCPUs;
    }

    public Integer getNumSupportedPhysicalSockets() {
        return this.numSupportedPhysicalSockets;
    }

    public void setNumSupportedPhysicalSockets(Integer numSupportedPhysicalSockets) {
        this.numSupportedPhysicalSockets = numSupportedPhysicalSockets;
    }

    public Integer getNumSupportedCoresPerSocket() {
        return this.numSupportedCoresPerSocket;
    }

    public void setNumSupportedCoresPerSocket(Integer numSupportedCoresPerSocket) {
        this.numSupportedCoresPerSocket = numSupportedCoresPerSocket;
    }

    public int getSupportedMinMemMB() {
        return this.supportedMinMemMB;
    }

    public void setSupportedMinMemMB(int supportedMinMemMB) {
        this.supportedMinMemMB = supportedMinMemMB;
    }

    public int getSupportedMaxMemMB() {
        return this.supportedMaxMemMB;
    }

    public void setSupportedMaxMemMB(int supportedMaxMemMB) {
        this.supportedMaxMemMB = supportedMaxMemMB;
    }

    public int getRecommendedMemMB() {
        return this.recommendedMemMB;
    }

    public void setRecommendedMemMB(int recommendedMemMB) {
        this.recommendedMemMB = recommendedMemMB;
    }

    public int getRecommendedColorDepth() {
        return this.recommendedColorDepth;
    }

    public void setRecommendedColorDepth(int recommendedColorDepth) {
        this.recommendedColorDepth = recommendedColorDepth;
    }

    public String[] getSupportedDiskControllerList() {
        return this.supportedDiskControllerList;
    }

    public void setSupportedDiskControllerList(String[] supportedDiskControllerList) {
        this.supportedDiskControllerList = supportedDiskControllerList;
    }

    public String getRecommendedSCSIController() {
        return this.recommendedSCSIController;
    }

    public void setRecommendedSCSIController(String recommendedSCSIController) {
        this.recommendedSCSIController = recommendedSCSIController;
    }

    public String getRecommendedDiskController() {
        return this.recommendedDiskController;
    }

    public void setRecommendedDiskController(String recommendedDiskController) {
        this.recommendedDiskController = recommendedDiskController;
    }

    public int getSupportedNumDisks() {
        return this.supportedNumDisks;
    }

    public void setSupportedNumDisks(int supportedNumDisks) {
        this.supportedNumDisks = supportedNumDisks;
    }

    public int getRecommendedDiskSizeMB() {
        return this.recommendedDiskSizeMB;
    }

    public void setRecommendedDiskSizeMB(int recommendedDiskSizeMB) {
        this.recommendedDiskSizeMB = recommendedDiskSizeMB;
    }

    public String getRecommendedCdromController() {
        return this.recommendedCdromController;
    }

    public void setRecommendedCdromController(String recommendedCdromController) {
        this.recommendedCdromController = recommendedCdromController;
    }

    public String[] getSupportedEthernetCard() {
        return this.supportedEthernetCard;
    }

    public void setSupportedEthernetCard(String[] supportedEthernetCard) {
        this.supportedEthernetCard = supportedEthernetCard;
    }

    public String getRecommendedEthernetCard() {
        return this.recommendedEthernetCard;
    }

    public void setRecommendedEthernetCard(String recommendedEthernetCard) {
        this.recommendedEthernetCard = recommendedEthernetCard;
    }

    public Boolean getSupportsSlaveDisk() {
        return this.supportsSlaveDisk;
    }

    public void setSupportsSlaveDisk(Boolean supportsSlaveDisk) {
        this.supportsSlaveDisk = supportsSlaveDisk;
    }

    public HostCpuIdInfo[] getCpuFeatureMask() {
        return this.cpuFeatureMask;
    }

    public void setCpuFeatureMask(HostCpuIdInfo[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public Boolean getSmcRequired() {
        return this.smcRequired;
    }

    public void setSmcRequired(Boolean smcRequired) {
        this.smcRequired = smcRequired;
    }

    public boolean getSupportsWakeOnLan() {
        return this.supportsWakeOnLan;
    }

    public void setSupportsWakeOnLan(boolean supportsWakeOnLan) {
        this.supportsWakeOnLan = supportsWakeOnLan;
    }

    public Boolean getSupportsVMI() {
        return this.supportsVMI;
    }

    public void setSupportsVMI(Boolean supportsVMI) {
        this.supportsVMI = supportsVMI;
    }

    public Boolean getSupportsMemoryHotAdd() {
        return this.supportsMemoryHotAdd;
    }

    public void setSupportsMemoryHotAdd(Boolean supportsMemoryHotAdd) {
        this.supportsMemoryHotAdd = supportsMemoryHotAdd;
    }

    public Boolean getSupportsCpuHotAdd() {
        return this.supportsCpuHotAdd;
    }

    public void setSupportsCpuHotAdd(Boolean supportsCpuHotAdd) {
        this.supportsCpuHotAdd = supportsCpuHotAdd;
    }

    public Boolean getSupportsCpuHotRemove() {
        return this.supportsCpuHotRemove;
    }

    public void setSupportsCpuHotRemove(Boolean supportsCpuHotRemove) {
        this.supportsCpuHotRemove = supportsCpuHotRemove;
    }

    public String[] getSupportedFirmware() {
        return this.supportedFirmware;
    }

    public void setSupportedFirmware(String[] supportedFirmware) {
        this.supportedFirmware = supportedFirmware;
    }

    public String getRecommendedFirmware() {
        return this.recommendedFirmware;
    }

    public void setRecommendedFirmware(String recommendedFirmware) {
        this.recommendedFirmware = recommendedFirmware;
    }

    public String[] getSupportedUSBControllerList() {
        return this.supportedUSBControllerList;
    }

    public void setSupportedUSBControllerList(String[] supportedUSBControllerList) {
        this.supportedUSBControllerList = supportedUSBControllerList;
    }

    public String getRecommendedUSBController() {
        return this.recommendedUSBController;
    }

    public void setRecommendedUSBController(String recommendedUSBController) {
        this.recommendedUSBController = recommendedUSBController;
    }

    public Boolean getSupports3D() {
        return this.supports3D;
    }

    public void setSupports3D(Boolean supports3D) {
        this.supports3D = supports3D;
    }

    public Boolean getRecommended3D() {
        return this.recommended3D;
    }

    public void setRecommended3D(Boolean recommended3D) {
        this.recommended3D = recommended3D;
    }

    public Boolean getSmcRecommended() {
        return this.smcRecommended;
    }

    public void setSmcRecommended(Boolean smcRecommended) {
        this.smcRecommended = smcRecommended;
    }

    public Boolean getIch7mRecommended() {
        return this.ich7mRecommended;
    }

    public void setIch7mRecommended(Boolean ich7mRecommended) {
        this.ich7mRecommended = ich7mRecommended;
    }

    public Boolean getUsbRecommended() {
        return this.usbRecommended;
    }

    public void setUsbRecommended(Boolean usbRecommended) {
        this.usbRecommended = usbRecommended;
    }

    public String getSupportLevel() {
        return this.supportLevel;
    }

    public void setSupportLevel(String supportLevel) {
        this.supportLevel = supportLevel;
    }

    public Boolean getSupportedForCreate() {
        return this.supportedForCreate;
    }

    public void setSupportedForCreate(Boolean supportedForCreate) {
        this.supportedForCreate = supportedForCreate;
    }

    public IntOption getVRAMSizeInKB() {
        return this.vRAMSizeInKB;
    }

    public void setVRAMSizeInKB(IntOption vRAMSizeInKB) {
        this.vRAMSizeInKB = vRAMSizeInKB;
    }

    public Integer getNumSupportedFloppyDevices() {
        return this.numSupportedFloppyDevices;
    }

    public void setNumSupportedFloppyDevices(Integer numSupportedFloppyDevices) {
        this.numSupportedFloppyDevices = numSupportedFloppyDevices;
    }

    public String[] getWakeOnLanEthernetCard() {
        return this.wakeOnLanEthernetCard;
    }

    public void setWakeOnLanEthernetCard(String[] wakeOnLanEthernetCard) {
        this.wakeOnLanEthernetCard = wakeOnLanEthernetCard;
    }

    public Boolean getSupportsPvscsiControllerForBoot() {
        return this.supportsPvscsiControllerForBoot;
    }

    public void setSupportsPvscsiControllerForBoot(Boolean supportsPvscsiControllerForBoot) {
        this.supportsPvscsiControllerForBoot = supportsPvscsiControllerForBoot;
    }

    public Boolean getDiskUuidEnabled() {
        return this.diskUuidEnabled;
    }

    public void setDiskUuidEnabled(Boolean diskUuidEnabled) {
        this.diskUuidEnabled = diskUuidEnabled;
    }

    public Boolean getSupportsHotPlugPCI() {
        return this.supportsHotPlugPCI;
    }

    public void setSupportsHotPlugPCI(Boolean supportsHotPlugPCI) {
        this.supportsHotPlugPCI = supportsHotPlugPCI;
    }

}

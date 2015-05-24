package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class GuestInfo extends DynamicData {
    public VirtualMachineToolsStatus toolsStatus;
    public String toolsVersionStatus;
    public String toolsVersionStatus2;
    public String toolsRunningStatus;
    public String toolsVersion;
    public String guestId;
    public String guestFamily;
    public String guestFullName;
    public String hostName;
    public String ipAddress;
    public GuestNicInfo[] net;
    public GuestStackInfo[] ipStack;
    public GuestDiskInfo[] disk;
    public GuestScreenInfo screen;
    public String guestState;
    public String appHeartbeatStatus;
    public Boolean guestKernelCrashed;
    public String appState;
    public Boolean guestOperationsReady;
    public Boolean interactiveGuestOperationsReady;
    public Boolean guestStateChangeSupported;
    public GuestInfoNamespaceGenerationInfo[] generationInfo;

    public VirtualMachineToolsStatus getToolsStatus() {
        return this.toolsStatus;
    }

    public void setToolsStatus(VirtualMachineToolsStatus toolsStatus) {
        this.toolsStatus = toolsStatus;
    }

    public String getToolsVersionStatus() {
        return this.toolsVersionStatus;
    }

    public void setToolsVersionStatus(String toolsVersionStatus) {
        this.toolsVersionStatus = toolsVersionStatus;
    }

    public String getToolsVersionStatus2() {
        return this.toolsVersionStatus2;
    }

    public void setToolsVersionStatus2(String toolsVersionStatus2) {
        this.toolsVersionStatus2 = toolsVersionStatus2;
    }

    public String getToolsRunningStatus() {
        return this.toolsRunningStatus;
    }

    public void setToolsRunningStatus(String toolsRunningStatus) {
        this.toolsRunningStatus = toolsRunningStatus;
    }

    public String getToolsVersion() {
        return this.toolsVersion;
    }

    public void setToolsVersion(String toolsVersion) {
        this.toolsVersion = toolsVersion;
    }

    public String getGuestId() {
        return this.guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestFamily() {
        return this.guestFamily;
    }

    public void setGuestFamily(String guestFamily) {
        this.guestFamily = guestFamily;
    }

    public String getGuestFullName() {
        return this.guestFullName;
    }

    public void setGuestFullName(String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public GuestNicInfo[] getNet() {
        return this.net;
    }

    public void setNet(GuestNicInfo[] net) {
        this.net = net;
    }

    public GuestStackInfo[] getIpStack() {
        return this.ipStack;
    }

    public void setIpStack(GuestStackInfo[] ipStack) {
        this.ipStack = ipStack;
    }

    public GuestDiskInfo[] getDisk() {
        return this.disk;
    }

    public void setDisk(GuestDiskInfo[] disk) {
        this.disk = disk;
    }

    public GuestScreenInfo getScreen() {
        return this.screen;
    }

    public void setScreen(GuestScreenInfo screen) {
        this.screen = screen;
    }

    public String getGuestState() {
        return this.guestState;
    }

    public void setGuestState(String guestState) {
        this.guestState = guestState;
    }

    public String getAppHeartbeatStatus() {
        return this.appHeartbeatStatus;
    }

    public void setAppHeartbeatStatus(String appHeartbeatStatus) {
        this.appHeartbeatStatus = appHeartbeatStatus;
    }

    public Boolean getGuestKernelCrashed() {
        return this.guestKernelCrashed;
    }

    public void setGuestKernelCrashed(Boolean guestKernelCrashed) {
        this.guestKernelCrashed = guestKernelCrashed;
    }

    public String getAppState() {
        return this.appState;
    }

    public void setAppState(String appState) {
        this.appState = appState;
    }

    public Boolean getGuestOperationsReady() {
        return this.guestOperationsReady;
    }

    public void setGuestOperationsReady(Boolean guestOperationsReady) {
        this.guestOperationsReady = guestOperationsReady;
    }

    public Boolean getInteractiveGuestOperationsReady() {
        return this.interactiveGuestOperationsReady;
    }

    public void setInteractiveGuestOperationsReady(Boolean interactiveGuestOperationsReady) {
        this.interactiveGuestOperationsReady = interactiveGuestOperationsReady;
    }

    public Boolean getGuestStateChangeSupported() {
        return this.guestStateChangeSupported;
    }

    public void setGuestStateChangeSupported(Boolean guestStateChangeSupported) {
        this.guestStateChangeSupported = guestStateChangeSupported;
    }

    public GuestInfoNamespaceGenerationInfo[] getGenerationInfo() {
        return this.generationInfo;
    }

    public void setGenerationInfo(GuestInfoNamespaceGenerationInfo[] generationInfo) {
        this.generationInfo = generationInfo;
    }
}

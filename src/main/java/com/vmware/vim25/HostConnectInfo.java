package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostConnectInfo extends DynamicData {
    public String serverIp;
    public Boolean inDasCluster;
    public HostListSummary host;
    public VirtualMachineSummary[] vm;
    public Boolean vimAccountNameRequired;
    public Boolean clusterSupported;
    public HostConnectInfoNetworkInfo[] network;
    public HostDatastoreConnectInfo[] datastore;
    public HostLicenseConnectInfo license;
    public HostCapability capability;

    public String getServerIp() {
        return this.serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public Boolean getInDasCluster() {
        return this.inDasCluster;
    }

    public void setInDasCluster(Boolean inDasCluster) {
        this.inDasCluster = inDasCluster;
    }

    public HostListSummary getHost() {
        return this.host;
    }

    public void setHost(HostListSummary host) {
        this.host = host;
    }

    public VirtualMachineSummary[] getVm() {
        return this.vm;
    }

    public void setVm(VirtualMachineSummary[] vm) {
        this.vm = vm;
    }

    public Boolean getVimAccountNameRequired() {
        return this.vimAccountNameRequired;
    }

    public void setVimAccountNameRequired(Boolean vimAccountNameRequired) {
        this.vimAccountNameRequired = vimAccountNameRequired;
    }

    public Boolean getClusterSupported() {
        return this.clusterSupported;
    }

    public void setClusterSupported(Boolean clusterSupported) {
        this.clusterSupported = clusterSupported;
    }

    public HostConnectInfoNetworkInfo[] getNetwork() {
        return this.network;
    }

    public void setNetwork(HostConnectInfoNetworkInfo[] network) {
        this.network = network;
    }

    public HostDatastoreConnectInfo[] getDatastore() {
        return this.datastore;
    }

    public void setDatastore(HostDatastoreConnectInfo[] datastore) {
        this.datastore = datastore;
    }

    public HostLicenseConnectInfo getLicense() {
        return this.license;
    }

    public void setLicense(HostLicenseConnectInfo license) {
        this.license = license;
    }

    public HostCapability getCapability() {
        return this.capability;
    }

    public void setCapability(HostCapability capability) {
        this.capability = capability;
    }

}

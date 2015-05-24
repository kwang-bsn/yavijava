package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DVSNetworkResourceManagementCapability extends DynamicData {
    public boolean networkResourceManagementSupported;
    public int networkResourcePoolHighShareValue;
    public boolean qosSupported;
    public boolean userDefinedNetworkResourcePoolsSupported;
    public Boolean networkResourceControlVersion3Supported;

    public boolean getNetworkResourceManagementSupported() {
        return this.networkResourceManagementSupported;
    }

    public void setNetworkResourceManagementSupported(boolean networkResourceManagementSupported) {
        this.networkResourceManagementSupported = networkResourceManagementSupported;
    }

    public int getNetworkResourcePoolHighShareValue() {
        return this.networkResourcePoolHighShareValue;
    }

    public void setNetworkResourcePoolHighShareValue(int networkResourcePoolHighShareValue) {
        this.networkResourcePoolHighShareValue = networkResourcePoolHighShareValue;
    }

    public boolean getQosSupported() {
        return this.qosSupported;
    }

    public void setQosSupported(boolean qosSupported) {
        this.qosSupported = qosSupported;
    }

    public boolean getUserDefinedNetworkResourcePoolsSupported() {
        return this.userDefinedNetworkResourcePoolsSupported;
    }

    public void setUserDefinedNetworkResourcePoolsSupported(boolean userDefinedNetworkResourcePoolsSupported) {
        this.userDefinedNetworkResourcePoolsSupported = userDefinedNetworkResourcePoolsSupported;
    }

    public Boolean getNetworkResourceControlVersion3Supported() {
        return this.networkResourceControlVersion3Supported;
    }

    public void setNetworkResourceControlVersion3Supported(Boolean networkResourceControlVersion3Supported) {
        this.networkResourceControlVersion3Supported = networkResourceControlVersion3Supported;
    }

}

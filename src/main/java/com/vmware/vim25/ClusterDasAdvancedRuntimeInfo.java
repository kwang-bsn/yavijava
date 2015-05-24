package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class ClusterDasAdvancedRuntimeInfo extends DynamicData {
    public ClusterDasHostInfo dasHostInfo;
    public ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo vmcpSupported;
    public DasHeartbeatDatastoreInfo[] heartbeatDatastoreInfo;

    public ClusterDasHostInfo getDasHostInfo() {
        return this.dasHostInfo;
    }

    public void setDasHostInfo(ClusterDasHostInfo dasHostInfo) {
        this.dasHostInfo = dasHostInfo;
    }

    public ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo getVmcpSupported() {
        return this.vmcpSupported;
    }

    public void setVmcpSupported(ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo vmcpSupported) {
        this.vmcpSupported = vmcpSupported;
    }

    public DasHeartbeatDatastoreInfo[] getHeartbeatDatastoreInfo() {
        return this.heartbeatDatastoreInfo;
    }

    public void setHeartbeatDatastoreInfo(DasHeartbeatDatastoreInfo[] heartbeatDatastoreInfo) {
        this.heartbeatDatastoreInfo = heartbeatDatastoreInfo;
    }
}

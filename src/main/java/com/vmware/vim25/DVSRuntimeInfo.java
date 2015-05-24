package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DVSRuntimeInfo extends DynamicData {
    public HostMemberRuntimeInfo[] hostMemberRuntime;
    public DvsResourceRuntimeInfo resourceRuntimeInfo;

    public HostMemberRuntimeInfo[] getHostMemberRuntime() {
        return this.hostMemberRuntime;
    }

    public void setHostMemberRuntime(HostMemberRuntimeInfo[] hostMemberRuntime) {
        this.hostMemberRuntime = hostMemberRuntime;
    }

    public DvsResourceRuntimeInfo getResourceRuntimeInfo() {
        return this.resourceRuntimeInfo;
    }

    public void setResourceRuntimeInfo(DvsResourceRuntimeInfo resourceRuntimeInfo) {
        this.resourceRuntimeInfo = resourceRuntimeInfo;
    }

}

package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostNasVolume extends HostFileSystemVolume {
    public String remoteHost;
    public String remotePath;
    public String userName;
    public String[] remoteHostNames;
    public String securityType;
    public Boolean protocolEndpoint;

    public String getRemoteHost() {
        return this.remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public String getRemotePath() {
        return this.remotePath;
    }

    public void setRemotePath(String remotePath) {
        this.remotePath = remotePath;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String[] getRemoteHostNames() {
        return this.remoteHostNames;
    }

    public void setRemoteHostNames(String[] remoteHostNames) {
        this.remoteHostNames = remoteHostNames;
    }

    public String getSecurityType() {
        return this.securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public Boolean getProtocolEndpoint() {
        return this.protocolEndpoint;
    }

    public void setProtocolEndpoint(Boolean protocolEndpoint) {
        this.protocolEndpoint = protocolEndpoint;
    }

}

package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostConnectSpec extends DynamicData {
    public String hostName;
    public Integer port;
    public String sslThumbprint;
    public String userName;
    public String password;
    public ManagedObjectReference vmFolder;
    public boolean force;
    public String vimAccountName;
    public String vimAccountPassword;
    public String managementIp;
    public HostLockdownMode lockdownMode;
    public HostGatewaySpec hostGateway;

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getSslThumbprint() {
        return this.sslThumbprint;
    }

    public void setSslThumbprint(String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ManagedObjectReference getVmFolder() {
        return this.vmFolder;
    }

    public void setVmFolder(ManagedObjectReference vmFolder) {
        this.vmFolder = vmFolder;
    }

    public boolean getForce() {
        return this.force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    public String getVimAccountName() {
        return this.vimAccountName;
    }

    public void setVimAccountName(String vimAccountName) {
        this.vimAccountName = vimAccountName;
    }

    public String getVimAccountPassword() {
        return this.vimAccountPassword;
    }

    public void setVimAccountPassword(String vimAccountPassword) {
        this.vimAccountPassword = vimAccountPassword;
    }

    public String getManagementIp() {
        return this.managementIp;
    }

    public void setManagementIp(String managementIp) {
        this.managementIp = managementIp;
    }

    public HostLockdownMode getLockdownMode() {
        return this.lockdownMode;
    }

    public void setLockdownMode(HostLockdownMode lockdownMode) {
        this.lockdownMode = lockdownMode;
    }

    public HostGatewaySpec getHostGateway() {
        return this.hostGateway;
    }

    public void setHostGateway(HostGatewaySpec hostGateway) {
        this.hostGateway = hostGateway;
    }

}

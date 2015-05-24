package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostActiveDirectorySpec extends DynamicData {
    public String domainName;
    public String userName;
    public String password;
    public String camServer;
    public String thumbprint;
    public Boolean smartCardAuthenticationEnabled;
    public String[] smartCardTrustAnchors;

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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

    public String getCamServer() {
        return this.camServer;
    }

    public void setCamServer(String camServer) {
        this.camServer = camServer;
    }

    public String getThumbprint() {
        return this.thumbprint;
    }

    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }

    public Boolean getSmartCardAuthenticationEnabled() {
        return this.smartCardAuthenticationEnabled;
    }

    public void setSmartCardAuthenticationEnabled(Boolean smartCardAuthenticationEnabled) {
        this.smartCardAuthenticationEnabled = smartCardAuthenticationEnabled;
    }

    public String[] getSmartCardTrustAnchors() {
        return this.smartCardTrustAnchors;
    }

    public void setSmartCardTrustAnchors(String[] smartCardTrustAnchors) {
        this.smartCardTrustAnchors = smartCardTrustAnchors;
    }

}

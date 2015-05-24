package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostActiveDirectoryInfo extends HostDirectoryStoreInfo {
    public String joinedDomain;
    public String[] trustedDomain;
    public String domainMembershipStatus;
    public Boolean smartCardAuthenticationEnabled;

    public String getJoinedDomain() {
        return this.joinedDomain;
    }

    public void setJoinedDomain(String joinedDomain) {
        this.joinedDomain = joinedDomain;
    }

    public String[] getTrustedDomain() {
        return this.trustedDomain;
    }

    public void setTrustedDomain(String[] trustedDomain) {
        this.trustedDomain = trustedDomain;
    }

    public String getDomainMembershipStatus() {
        return this.domainMembershipStatus;
    }

    public void setDomainMembershipStatus(String domainMembershipStatus) {
        this.domainMembershipStatus = domainMembershipStatus;
    }

    public Boolean getSmartCardAuthenticationEnabled() {
        return this.smartCardAuthenticationEnabled;
    }

    public void setSmartCardAuthenticationEnabled(Boolean smartCardAuthenticationEnabled) {
        this.smartCardAuthenticationEnabled = smartCardAuthenticationEnabled;
    }

}

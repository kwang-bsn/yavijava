package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostInternetScsiHbaIPProperties extends DynamicData {
    public String mac;
    public String address;
    public boolean dhcpConfigurationEnabled;
    public String subnetMask;
    public String defaultGateway;
    public String primaryDnsServerAddress;
    public String alternateDnsServerAddress;
    public String ipv6Address;
    public String ipv6SubnetMask;
    public String ipv6DefaultGateway;
    public Boolean arpRedirectEnabled;
    public Integer mtu;
    public Boolean jumboFramesEnabled;
    public Boolean ipv4Enabled;
    public Boolean ipv6Enabled;
    public HostInternetScsiHbaIPv6Properties ipv6properties;

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getDhcpConfigurationEnabled() {
        return this.dhcpConfigurationEnabled;
    }

    public void setDhcpConfigurationEnabled(boolean dhcpConfigurationEnabled) {
        this.dhcpConfigurationEnabled = dhcpConfigurationEnabled;
    }

    public String getSubnetMask() {
        return this.subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public String getDefaultGateway() {
        return this.defaultGateway;
    }

    public void setDefaultGateway(String defaultGateway) {
        this.defaultGateway = defaultGateway;
    }

    public String getPrimaryDnsServerAddress() {
        return this.primaryDnsServerAddress;
    }

    public void setPrimaryDnsServerAddress(String primaryDnsServerAddress) {
        this.primaryDnsServerAddress = primaryDnsServerAddress;
    }

    public String getAlternateDnsServerAddress() {
        return this.alternateDnsServerAddress;
    }

    public void setAlternateDnsServerAddress(String alternateDnsServerAddress) {
        this.alternateDnsServerAddress = alternateDnsServerAddress;
    }

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public String getIpv6SubnetMask() {
        return this.ipv6SubnetMask;
    }

    public void setIpv6SubnetMask(String ipv6SubnetMask) {
        this.ipv6SubnetMask = ipv6SubnetMask;
    }

    public String getIpv6DefaultGateway() {
        return this.ipv6DefaultGateway;
    }

    public void setIpv6DefaultGateway(String ipv6DefaultGateway) {
        this.ipv6DefaultGateway = ipv6DefaultGateway;
    }

    public Boolean getArpRedirectEnabled() {
        return this.arpRedirectEnabled;
    }

    public void setArpRedirectEnabled(Boolean arpRedirectEnabled) {
        this.arpRedirectEnabled = arpRedirectEnabled;
    }

    public Integer getMtu() {
        return this.mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public Boolean getJumboFramesEnabled() {
        return this.jumboFramesEnabled;
    }

    public void setJumboFramesEnabled(Boolean jumboFramesEnabled) {
        this.jumboFramesEnabled = jumboFramesEnabled;
    }

    public Boolean getIpv4Enabled() {
        return this.ipv4Enabled;
    }

    public void setIpv4Enabled(Boolean ipv4Enabled) {
        this.ipv4Enabled = ipv4Enabled;
    }

    public Boolean getIpv6Enabled() {
        return this.ipv6Enabled;
    }

    public void setIpv6Enabled(Boolean ipv6Enabled) {
        this.ipv6Enabled = ipv6Enabled;
    }

    public HostInternetScsiHbaIPv6Properties getIpv6properties() {
        return this.ipv6properties;
    }

    public void setIpv6properties(HostInternetScsiHbaIPv6Properties ipv6properties) {
        this.ipv6properties = ipv6properties;
    }

}

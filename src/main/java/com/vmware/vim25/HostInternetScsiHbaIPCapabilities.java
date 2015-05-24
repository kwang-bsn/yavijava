package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class HostInternetScsiHbaIPCapabilities extends DynamicData {
    public boolean addressSettable;
    public boolean ipConfigurationMethodSettable;
    public boolean subnetMaskSettable;
    public boolean defaultGatewaySettable;
    public boolean primaryDnsServerAddressSettable;
    public boolean alternateDnsServerAddressSettable;
    public Boolean ipv6Supported;
    public Boolean arpRedirectSettable;
    public Boolean mtuSettable;
    public Boolean hostNameAsTargetAddress;
    public Boolean nameAliasSettable;
    public Boolean ipv4EnableSettable;
    public Boolean ipv6EnableSettable;
    public Boolean ipv6PrefixLengthSettable;
    public Integer ipv6PrefixLength;
    public Boolean ipv6DhcpConfigurationSettable;
    public Boolean ipv6LinkLocalAutoConfigurationSettable;
    public Boolean ipv6RouterAdvertisementConfigurationSettable;
    public Boolean ipv6DefaultGatewaySettable;
    public Integer ipv6MaxStaticAddressesSupported;

    public boolean getAddressSettable() {
        return this.addressSettable;
    }

    public void setAddressSettable(boolean addressSettable) {
        this.addressSettable = addressSettable;
    }

    public boolean getIpConfigurationMethodSettable() {
        return this.ipConfigurationMethodSettable;
    }

    public void setIpConfigurationMethodSettable(boolean ipConfigurationMethodSettable) {
        this.ipConfigurationMethodSettable = ipConfigurationMethodSettable;
    }

    public boolean getSubnetMaskSettable() {
        return this.subnetMaskSettable;
    }

    public void setSubnetMaskSettable(boolean subnetMaskSettable) {
        this.subnetMaskSettable = subnetMaskSettable;
    }

    public boolean getDefaultGatewaySettable() {
        return this.defaultGatewaySettable;
    }

    public void setDefaultGatewaySettable(boolean defaultGatewaySettable) {
        this.defaultGatewaySettable = defaultGatewaySettable;
    }

    public boolean getPrimaryDnsServerAddressSettable() {
        return this.primaryDnsServerAddressSettable;
    }

    public void setPrimaryDnsServerAddressSettable(boolean primaryDnsServerAddressSettable) {
        this.primaryDnsServerAddressSettable = primaryDnsServerAddressSettable;
    }

    public boolean getAlternateDnsServerAddressSettable() {
        return this.alternateDnsServerAddressSettable;
    }

    public void setAlternateDnsServerAddressSettable(boolean alternateDnsServerAddressSettable) {
        this.alternateDnsServerAddressSettable = alternateDnsServerAddressSettable;
    }

    public Boolean getIpv6Supported() {
        return this.ipv6Supported;
    }

    public void setIpv6Supported(Boolean ipv6Supported) {
        this.ipv6Supported = ipv6Supported;
    }

    public Boolean getArpRedirectSettable() {
        return this.arpRedirectSettable;
    }

    public void setArpRedirectSettable(Boolean arpRedirectSettable) {
        this.arpRedirectSettable = arpRedirectSettable;
    }

    public Boolean getMtuSettable() {
        return this.mtuSettable;
    }

    public void setMtuSettable(Boolean mtuSettable) {
        this.mtuSettable = mtuSettable;
    }

    public Boolean getHostNameAsTargetAddress() {
        return this.hostNameAsTargetAddress;
    }

    public void setHostNameAsTargetAddress(Boolean hostNameAsTargetAddress) {
        this.hostNameAsTargetAddress = hostNameAsTargetAddress;
    }

    public Boolean getNameAliasSettable() {
        return this.nameAliasSettable;
    }

    public void setNameAliasSettable(Boolean nameAliasSettable) {
        this.nameAliasSettable = nameAliasSettable;
    }

    public Boolean getIpv4EnableSettable() {
        return this.ipv4EnableSettable;
    }

    public void setIpv4EnableSettable(Boolean ipv4EnableSettable) {
        this.ipv4EnableSettable = ipv4EnableSettable;
    }

    public Boolean getIpv6EnableSettable() {
        return this.ipv6EnableSettable;
    }

    public void setIpv6EnableSettable(Boolean ipv6EnableSettable) {
        this.ipv6EnableSettable = ipv6EnableSettable;
    }

    public Boolean getIpv6PrefixLengthSettable() {
        return this.ipv6PrefixLengthSettable;
    }

    public void setIpv6PrefixLengthSettable(Boolean ipv6PrefixLengthSettable) {
        this.ipv6PrefixLengthSettable = ipv6PrefixLengthSettable;
    }

    public Integer getIpv6PrefixLength() {
        return this.ipv6PrefixLength;
    }

    public void setIpv6PrefixLength(Integer ipv6PrefixLength) {
        this.ipv6PrefixLength = ipv6PrefixLength;
    }

    public Boolean getIpv6DhcpConfigurationSettable() {
        return this.ipv6DhcpConfigurationSettable;
    }

    public void setIpv6DhcpConfigurationSettable(Boolean ipv6DhcpConfigurationSettable) {
        this.ipv6DhcpConfigurationSettable = ipv6DhcpConfigurationSettable;
    }

    public Boolean getIpv6LinkLocalAutoConfigurationSettable() {
        return this.ipv6LinkLocalAutoConfigurationSettable;
    }

    public void setIpv6LinkLocalAutoConfigurationSettable(Boolean ipv6LinkLocalAutoConfigurationSettable) {
        this.ipv6LinkLocalAutoConfigurationSettable = ipv6LinkLocalAutoConfigurationSettable;
    }

    public Boolean getIpv6RouterAdvertisementConfigurationSettable() {
        return this.ipv6RouterAdvertisementConfigurationSettable;
    }

    public void setIpv6RouterAdvertisementConfigurationSettable(Boolean ipv6RouterAdvertisementConfigurationSettable) {
        this.ipv6RouterAdvertisementConfigurationSettable = ipv6RouterAdvertisementConfigurationSettable;
    }

    public Boolean getIpv6DefaultGatewaySettable() {
        return this.ipv6DefaultGatewaySettable;
    }

    public void setIpv6DefaultGatewaySettable(Boolean ipv6DefaultGatewaySettable) {
        this.ipv6DefaultGatewaySettable = ipv6DefaultGatewaySettable;
    }

    public Integer getIpv6MaxStaticAddressesSupported() {
        return this.ipv6MaxStaticAddressesSupported;
    }

    public void setIpv6MaxStaticAddressesSupported(Integer ipv6MaxStaticAddressesSupported) {
        this.ipv6MaxStaticAddressesSupported = ipv6MaxStaticAddressesSupported;
    }

}

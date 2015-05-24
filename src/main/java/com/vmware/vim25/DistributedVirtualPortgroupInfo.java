package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DistributedVirtualPortgroupInfo extends DynamicData {
    public String switchName;
    public String switchUuid;
    public String portgroupName;
    public String portgroupKey;
    public String portgroupType;
    public boolean uplinkPortgroup;
    public ManagedObjectReference portgroup;
    public Boolean networkReservationSupported;

    public String getSwitchName() {
        return this.switchName;
    }

    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }

    public String getSwitchUuid() {
        return this.switchUuid;
    }

    public void setSwitchUuid(String switchUuid) {
        this.switchUuid = switchUuid;
    }

    public String getPortgroupName() {
        return this.portgroupName;
    }

    public void setPortgroupName(String portgroupName) {
        this.portgroupName = portgroupName;
    }

    public String getPortgroupKey() {
        return this.portgroupKey;
    }

    public void setPortgroupKey(String portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public String getPortgroupType() {
        return this.portgroupType;
    }

    public void setPortgroupType(String portgroupType) {
        this.portgroupType = portgroupType;
    }

    public boolean getUplinkPortgroup() {
        return this.uplinkPortgroup;
    }

    public void setUplinkPortgroup(boolean uplinkPortgroup) {
        this.uplinkPortgroup = uplinkPortgroup;
    }

    public ManagedObjectReference getPortgroup() {
        return this.portgroup;
    }

    public void setPortgroup(ManagedObjectReference portgroup) {
        this.portgroup = portgroup;
    }

    public Boolean getNetworkReservationSupported() {
        return this.networkReservationSupported;
    }

    public void setNetworkReservationSupported(Boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }

}

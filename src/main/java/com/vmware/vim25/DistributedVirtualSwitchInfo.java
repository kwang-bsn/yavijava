package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DistributedVirtualSwitchInfo extends DynamicData {
    public String switchName;
    public String switchUuid;
    public ManagedObjectReference distributedVirtualSwitch;
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

    public ManagedObjectReference getDistributedVirtualSwitch() {
        return this.distributedVirtualSwitch;
    }

    public void setDistributedVirtualSwitch(ManagedObjectReference distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public Boolean getNetworkReservationSupported() {
        return this.networkReservationSupported;
    }

    public void setNetworkReservationSupported(Boolean networkReservationSupported) {
        this.networkReservationSupported = networkReservationSupported;
    }

}

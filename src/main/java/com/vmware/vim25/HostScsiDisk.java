package com.vmware.vim25;

/**
 * Created by Michael Rice on Sun May 24 07:03:51 CDT 2015
 * <p/>
 * Copyright 2015 Michael Rice
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @since 6.0
 */

public class HostScsiDisk extends ScsiLun {
    public HostDiskDimensionsLba capacity;
    public String devicePath;
    public Boolean ssd;
    public Boolean localDisk;
    public String[] physicalLocation;
    public Boolean emulatedDIXDIFEnabled;
    public VsanHostVsanDiskInfo vsanDiskInfo;

    public HostDiskDimensionsLba getCapacity() {
        return this.capacity;
    }

    public void setCapacity(HostDiskDimensionsLba capacity) {
        this.capacity = capacity;
    }

    public String getDevicePath() {
        return this.devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public Boolean getSsd() {
        return this.ssd;
    }

    public void setSsd(Boolean ssd) {
        this.ssd = ssd;
    }

    public Boolean getLocalDisk() {
        return this.localDisk;
    }

    public void setLocalDisk(Boolean localDisk) {
        this.localDisk = localDisk;
    }

    public String[] getPhysicalLocation() {
        return this.physicalLocation;
    }

    public void setPhysicalLocation(String[] physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public Boolean getEmulatedDIXDIFEnabled() {
        return this.emulatedDIXDIFEnabled;
    }

    public void setEmulatedDIXDIFEnabled(Boolean emulatedDIXDIFEnabled) {
        this.emulatedDIXDIFEnabled = emulatedDIXDIFEnabled;
    }

    public VsanHostVsanDiskInfo getVsanDiskInfo() {
        return this.vsanDiskInfo;
    }

    public void setVsanDiskInfo(VsanHostVsanDiskInfo vsanDiskInfo) {
        this.vsanDiskInfo = vsanDiskInfo;
    }

}

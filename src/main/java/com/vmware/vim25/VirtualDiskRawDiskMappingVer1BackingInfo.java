package com.vmware.vim25;

/**
 * Created by Michael Rice on Sun May 24 07:03:52 CDT 2015
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

public class VirtualDiskRawDiskMappingVer1BackingInfo extends VirtualDeviceFileBackingInfo {
    public String lunUuid;
    public String deviceName;
    public String compatibilityMode;
    public String diskMode;
    public String uuid;
    public String contentId;
    public String changeId;
    public VirtualDiskRawDiskMappingVer1BackingInfo parent;
    public String sharing;

    public String getLunUuid() {
        return this.lunUuid;
    }

    public void setLunUuid(String lunUuid) {
        this.lunUuid = lunUuid;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getCompatibilityMode() {
        return this.compatibilityMode;
    }

    public void setCompatibilityMode(String compatibilityMode) {
        this.compatibilityMode = compatibilityMode;
    }

    public String getDiskMode() {
        return this.diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContentId() {
        return this.contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getChangeId() {
        return this.changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public VirtualDiskRawDiskMappingVer1BackingInfo getParent() {
        return this.parent;
    }

    public void setParent(VirtualDiskRawDiskMappingVer1BackingInfo parent) {
        this.parent = parent;
    }

    public String getSharing() {
        return this.sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

}

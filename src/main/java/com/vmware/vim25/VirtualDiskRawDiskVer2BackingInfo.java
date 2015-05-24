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

public class VirtualDiskRawDiskVer2BackingInfo extends VirtualDeviceDeviceBackingInfo {
    public String descriptorFileName;
    public String uuid;
    public String changeId;
    public String sharing;

    public String getDescriptorFileName() {
        return this.descriptorFileName;
    }

    public void setDescriptorFileName(String descriptorFileName) {
        this.descriptorFileName = descriptorFileName;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getChangeId() {
        return this.changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public String getSharing() {
        return this.sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

}

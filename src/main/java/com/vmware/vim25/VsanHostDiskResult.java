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

public class VsanHostDiskResult extends DynamicData {
    public HostScsiDisk disk;
    public String state;
    public String vsanUuid;
    public LocalizedMethodFault error;
    public Boolean degraded;

    public HostScsiDisk getDisk() {
        return this.disk;
    }

    public void setDisk(HostScsiDisk disk) {
        this.disk = disk;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVsanUuid() {
        return this.vsanUuid;
    }

    public void setVsanUuid(String vsanUuid) {
        this.vsanUuid = vsanUuid;
    }

    public LocalizedMethodFault getError() {
        return this.error;
    }

    public void setError(LocalizedMethodFault error) {
        this.error = error;
    }

    public Boolean getDegraded() {
        return this.degraded;
    }

    public void setDegraded(Boolean degraded) {
        this.degraded = degraded;
    }

}

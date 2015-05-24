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

public class ClusterVmComponentProtectionSettings extends DynamicData {
    public String vmStorageProtectionForAPD;
    public Boolean enableAPDTimeoutForHosts;
    public Integer vmTerminateDelayForAPDSec;
    public String vmReactionOnAPDCleared;
    public String vmStorageProtectionForPDL;

    public String getVmStorageProtectionForAPD() {
        return this.vmStorageProtectionForAPD;
    }

    public void setVmStorageProtectionForAPD(String vmStorageProtectionForAPD) {
        this.vmStorageProtectionForAPD = vmStorageProtectionForAPD;
    }

    public Boolean getEnableAPDTimeoutForHosts() {
        return this.enableAPDTimeoutForHosts;
    }

    public void setEnableAPDTimeoutForHosts(Boolean enableAPDTimeoutForHosts) {
        this.enableAPDTimeoutForHosts = enableAPDTimeoutForHosts;
    }

    public Integer getVmTerminateDelayForAPDSec() {
        return this.vmTerminateDelayForAPDSec;
    }

    public void setVmTerminateDelayForAPDSec(Integer vmTerminateDelayForAPDSec) {
        this.vmTerminateDelayForAPDSec = vmTerminateDelayForAPDSec;
    }

    public String getVmReactionOnAPDCleared() {
        return this.vmReactionOnAPDCleared;
    }

    public void setVmReactionOnAPDCleared(String vmReactionOnAPDCleared) {
        this.vmReactionOnAPDCleared = vmReactionOnAPDCleared;
    }

    public String getVmStorageProtectionForPDL() {
        return this.vmStorageProtectionForPDL;
    }

    public void setVmStorageProtectionForPDL(String vmStorageProtectionForPDL) {
        this.vmStorageProtectionForPDL = vmStorageProtectionForPDL;
    }

}

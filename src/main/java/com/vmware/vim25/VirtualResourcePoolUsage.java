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

public class VirtualResourcePoolUsage extends DynamicData {
    public String vrpId;
    public long cpuReservationMhz;
    public long memReservationMB;
    public long cpuReservationUsedMhz;
    public long memReservationUsedMB;

    public String getVrpId() {
        return this.vrpId;
    }

    public void setVrpId(String vrpId) {
        this.vrpId = vrpId;
    }

    public long getCpuReservationMhz() {
        return this.cpuReservationMhz;
    }

    public void setCpuReservationMhz(long cpuReservationMhz) {
        this.cpuReservationMhz = cpuReservationMhz;
    }

    public long getMemReservationMB() {
        return this.memReservationMB;
    }

    public void setMemReservationMB(long memReservationMB) {
        this.memReservationMB = memReservationMB;
    }

    public long getCpuReservationUsedMhz() {
        return this.cpuReservationUsedMhz;
    }

    public void setCpuReservationUsedMhz(long cpuReservationUsedMhz) {
        this.cpuReservationUsedMhz = cpuReservationUsedMhz;
    }

    public long getMemReservationUsedMB() {
        return this.memReservationUsedMB;
    }

    public void setMemReservationUsedMB(long memReservationUsedMB) {
        this.memReservationUsedMB = memReservationUsedMB;
    }

}

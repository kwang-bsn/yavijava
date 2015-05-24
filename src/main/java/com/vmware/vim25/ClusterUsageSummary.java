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

public class ClusterUsageSummary extends DynamicData {
    public int totalCpuCapacityMhz;
    public int totalMemCapacityMB;
    public int cpuReservationMhz;
    public int memReservationMB;
    public Integer poweredOffCpuReservationMhz;
    public Integer poweredOffMemReservationMB;
    public int cpuDemandMhz;
    public int memDemandMB;
    public long statsGenNumber;
    public int cpuEntitledMhz;
    public int memEntitledMB;
    public int poweredOffVmCount;
    public int totalVmCount;

    public int getTotalCpuCapacityMhz() {
        return this.totalCpuCapacityMhz;
    }

    public void setTotalCpuCapacityMhz(int totalCpuCapacityMhz) {
        this.totalCpuCapacityMhz = totalCpuCapacityMhz;
    }

    public int getTotalMemCapacityMB() {
        return this.totalMemCapacityMB;
    }

    public void setTotalMemCapacityMB(int totalMemCapacityMB) {
        this.totalMemCapacityMB = totalMemCapacityMB;
    }

    public int getCpuReservationMhz() {
        return this.cpuReservationMhz;
    }

    public void setCpuReservationMhz(int cpuReservationMhz) {
        this.cpuReservationMhz = cpuReservationMhz;
    }

    public int getMemReservationMB() {
        return this.memReservationMB;
    }

    public void setMemReservationMB(int memReservationMB) {
        this.memReservationMB = memReservationMB;
    }

    public Integer getPoweredOffCpuReservationMhz() {
        return this.poweredOffCpuReservationMhz;
    }

    public void setPoweredOffCpuReservationMhz(Integer poweredOffCpuReservationMhz) {
        this.poweredOffCpuReservationMhz = poweredOffCpuReservationMhz;
    }

    public Integer getPoweredOffMemReservationMB() {
        return this.poweredOffMemReservationMB;
    }

    public void setPoweredOffMemReservationMB(Integer poweredOffMemReservationMB) {
        this.poweredOffMemReservationMB = poweredOffMemReservationMB;
    }

    public int getCpuDemandMhz() {
        return this.cpuDemandMhz;
    }

    public void setCpuDemandMhz(int cpuDemandMhz) {
        this.cpuDemandMhz = cpuDemandMhz;
    }

    public int getMemDemandMB() {
        return this.memDemandMB;
    }

    public void setMemDemandMB(int memDemandMB) {
        this.memDemandMB = memDemandMB;
    }

    public long getStatsGenNumber() {
        return this.statsGenNumber;
    }

    public void setStatsGenNumber(long statsGenNumber) {
        this.statsGenNumber = statsGenNumber;
    }

    public int getCpuEntitledMhz() {
        return this.cpuEntitledMhz;
    }

    public void setCpuEntitledMhz(int cpuEntitledMhz) {
        this.cpuEntitledMhz = cpuEntitledMhz;
    }

    public int getMemEntitledMB() {
        return this.memEntitledMB;
    }

    public void setMemEntitledMB(int memEntitledMB) {
        this.memEntitledMB = memEntitledMB;
    }

    public int getPoweredOffVmCount() {
        return this.poweredOffVmCount;
    }

    public void setPoweredOffVmCount(int poweredOffVmCount) {
        this.poweredOffVmCount = poweredOffVmCount;
    }

    public int getTotalVmCount() {
        return this.totalVmCount;
    }

    public void setTotalVmCount(int totalVmCount) {
        this.totalVmCount = totalVmCount;
    }

}

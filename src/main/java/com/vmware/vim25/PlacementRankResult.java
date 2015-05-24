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

public class PlacementRankResult extends DynamicData {
    public String key;
    public ManagedObjectReference candidate;
    public long reservedSpaceMB;
    public long usedSpaceMB;
    public long totalSpaceMB;
    public double utilization;
    public LocalizedMethodFault[] faults;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ManagedObjectReference getCandidate() {
        return this.candidate;
    }

    public void setCandidate(ManagedObjectReference candidate) {
        this.candidate = candidate;
    }

    public long getReservedSpaceMB() {
        return this.reservedSpaceMB;
    }

    public void setReservedSpaceMB(long reservedSpaceMB) {
        this.reservedSpaceMB = reservedSpaceMB;
    }

    public long getUsedSpaceMB() {
        return this.usedSpaceMB;
    }

    public void setUsedSpaceMB(long usedSpaceMB) {
        this.usedSpaceMB = usedSpaceMB;
    }

    public long getTotalSpaceMB() {
        return this.totalSpaceMB;
    }

    public void setTotalSpaceMB(long totalSpaceMB) {
        this.totalSpaceMB = totalSpaceMB;
    }

    public double getUtilization() {
        return this.utilization;
    }

    public void setUtilization(double utilization) {
        this.utilization = utilization;
    }

    public LocalizedMethodFault[] getFaults() {
        return this.faults;
    }

    public void setFaults(LocalizedMethodFault[] faults) {
        this.faults = faults;
    }

}

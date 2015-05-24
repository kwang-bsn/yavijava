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

public class VRPEditSpec extends DynamicData {
    public String vrpId;
    public String description;
    public VrpResourceAllocationInfo cpuAllocation;
    public VrpResourceAllocationInfo memoryAllocation;
    public ManagedObjectReference[] addedHubs;
    public ManagedObjectReference[] removedHubs;
    public long changeVersion;

    public String getVrpId() {
        return this.vrpId;
    }

    public void setVrpId(String vrpId) {
        this.vrpId = vrpId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VrpResourceAllocationInfo getCpuAllocation() {
        return this.cpuAllocation;
    }

    public void setCpuAllocation(VrpResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }

    public VrpResourceAllocationInfo getMemoryAllocation() {
        return this.memoryAllocation;
    }

    public void setMemoryAllocation(VrpResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }

    public ManagedObjectReference[] getAddedHubs() {
        return this.addedHubs;
    }

    public void setAddedHubs(ManagedObjectReference[] addedHubs) {
        this.addedHubs = addedHubs;
    }

    public ManagedObjectReference[] getRemovedHubs() {
        return this.removedHubs;
    }

    public void setRemovedHubs(ManagedObjectReference[] removedHubs) {
        this.removedHubs = removedHubs;
    }

    public long getChangeVersion() {
        return this.changeVersion;
    }

    public void setChangeVersion(long changeVersion) {
        this.changeVersion = changeVersion;
    }

}

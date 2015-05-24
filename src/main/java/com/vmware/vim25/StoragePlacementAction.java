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

public class StoragePlacementAction extends ClusterAction {
    public ManagedObjectReference vm;
    public VirtualMachineRelocateSpec relocateSpec;
    public ManagedObjectReference destination;
    public float spaceUtilBefore;
    public float spaceDemandBefore;
    public float spaceUtilAfter;
    public float spaceDemandAfter;
    public float ioLatencyBefore;

    public ManagedObjectReference getVm() {
        return this.vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public VirtualMachineRelocateSpec getRelocateSpec() {
        return this.relocateSpec;
    }

    public void setRelocateSpec(VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }

    public ManagedObjectReference getDestination() {
        return this.destination;
    }

    public void setDestination(ManagedObjectReference destination) {
        this.destination = destination;
    }

    public float getSpaceUtilBefore() {
        return this.spaceUtilBefore;
    }

    public void setSpaceUtilBefore(float spaceUtilBefore) {
        this.spaceUtilBefore = spaceUtilBefore;
    }

    public float getSpaceDemandBefore() {
        return this.spaceDemandBefore;
    }

    public void setSpaceDemandBefore(float spaceDemandBefore) {
        this.spaceDemandBefore = spaceDemandBefore;
    }

    public float getSpaceUtilAfter() {
        return this.spaceUtilAfter;
    }

    public void setSpaceUtilAfter(float spaceUtilAfter) {
        this.spaceUtilAfter = spaceUtilAfter;
    }

    public float getSpaceDemandAfter() {
        return this.spaceDemandAfter;
    }

    public void setSpaceDemandAfter(float spaceDemandAfter) {
        this.spaceDemandAfter = spaceDemandAfter;
    }

    public float getIoLatencyBefore() {
        return this.ioLatencyBefore;
    }

    public void setIoLatencyBefore(float ioLatencyBefore) {
        this.ioLatencyBefore = ioLatencyBefore;
    }

}

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

public class PlacementAction extends ClusterAction {
    public ManagedObjectReference vm;
    public ManagedObjectReference targetHost;
    public VirtualMachineRelocateSpec relocateSpec;

    public ManagedObjectReference getVm() {
        return this.vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public ManagedObjectReference getTargetHost() {
        return this.targetHost;
    }

    public void setTargetHost(ManagedObjectReference targetHost) {
        this.targetHost = targetHost;
    }

    public VirtualMachineRelocateSpec getRelocateSpec() {
        return this.relocateSpec;
    }

    public void setRelocateSpec(VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }

}

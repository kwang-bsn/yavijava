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

public class PlacementSpec extends DynamicData {
    public VirtualMachineMovePriority priority;
    public ManagedObjectReference vm;
    public VirtualMachineConfigSpec configSpec;
    public VirtualMachineRelocateSpec relocateSpec;
    public ManagedObjectReference[] hosts;
    public ManagedObjectReference[] datastores;
    public ManagedObjectReference[] storagePods;
    public Boolean disallowPrerequisiteMoves;
    public ClusterRuleInfo[] rules;
    public String key;
    public String placementType;
    public VirtualMachineCloneSpec cloneSpec;
    public String cloneName;

    public VirtualMachineMovePriority getPriority() {
        return this.priority;
    }

    public void setPriority(VirtualMachineMovePriority priority) {
        this.priority = priority;
    }

    public ManagedObjectReference getVm() {
        return this.vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public VirtualMachineConfigSpec getConfigSpec() {
        return this.configSpec;
    }

    public void setConfigSpec(VirtualMachineConfigSpec configSpec) {
        this.configSpec = configSpec;
    }

    public VirtualMachineRelocateSpec getRelocateSpec() {
        return this.relocateSpec;
    }

    public void setRelocateSpec(VirtualMachineRelocateSpec relocateSpec) {
        this.relocateSpec = relocateSpec;
    }

    public ManagedObjectReference[] getHosts() {
        return this.hosts;
    }

    public void setHosts(ManagedObjectReference[] hosts) {
        this.hosts = hosts;
    }

    public ManagedObjectReference[] getDatastores() {
        return this.datastores;
    }

    public void setDatastores(ManagedObjectReference[] datastores) {
        this.datastores = datastores;
    }

    public ManagedObjectReference[] getStoragePods() {
        return this.storagePods;
    }

    public void setStoragePods(ManagedObjectReference[] storagePods) {
        this.storagePods = storagePods;
    }

    public Boolean getDisallowPrerequisiteMoves() {
        return this.disallowPrerequisiteMoves;
    }

    public void setDisallowPrerequisiteMoves(Boolean disallowPrerequisiteMoves) {
        this.disallowPrerequisiteMoves = disallowPrerequisiteMoves;
    }

    public ClusterRuleInfo[] getRules() {
        return this.rules;
    }

    public void setRules(ClusterRuleInfo[] rules) {
        this.rules = rules;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPlacementType() {
        return this.placementType;
    }

    public void setPlacementType(String placementType) {
        this.placementType = placementType;
    }

    public VirtualMachineCloneSpec getCloneSpec() {
        return this.cloneSpec;
    }

    public void setCloneSpec(VirtualMachineCloneSpec cloneSpec) {
        this.cloneSpec = cloneSpec;
    }

    public String getCloneName() {
        return this.cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

}

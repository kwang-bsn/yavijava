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

public class VirtualMachineRelocateSpec extends DynamicData {
    public ServiceLocator service;
    public ManagedObjectReference folder;
    public ManagedObjectReference datastore;
    public String diskMoveType;
    public ManagedObjectReference pool;
    public ManagedObjectReference host;
    public VirtualMachineRelocateSpecDiskLocator[] disk;
    public VirtualMachineRelocateTransformation transform;
    public VirtualDeviceConfigSpec[] deviceChange;
    public VirtualMachineProfileSpec[] profile;

    public ServiceLocator getService() {
        return this.service;
    }

    public void setService(ServiceLocator service) {
        this.service = service;
    }

    public ManagedObjectReference getFolder() {
        return this.folder;
    }

    public void setFolder(ManagedObjectReference folder) {
        this.folder = folder;
    }

    public ManagedObjectReference getDatastore() {
        return this.datastore;
    }

    public void setDatastore(ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public String getDiskMoveType() {
        return this.diskMoveType;
    }

    public void setDiskMoveType(String diskMoveType) {
        this.diskMoveType = diskMoveType;
    }

    public ManagedObjectReference getPool() {
        return this.pool;
    }

    public void setPool(ManagedObjectReference pool) {
        this.pool = pool;
    }

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public VirtualMachineRelocateSpecDiskLocator[] getDisk() {
        return this.disk;
    }

    public void setDisk(VirtualMachineRelocateSpecDiskLocator[] disk) {
        this.disk = disk;
    }

    public VirtualMachineRelocateTransformation getTransform() {
        return this.transform;
    }

    public void setTransform(VirtualMachineRelocateTransformation transform) {
        this.transform = transform;
    }

    public VirtualDeviceConfigSpec[] getDeviceChange() {
        return this.deviceChange;
    }

    public void setDeviceChange(VirtualDeviceConfigSpec[] deviceChange) {
        this.deviceChange = deviceChange;
    }

    public VirtualMachineProfileSpec[] getProfile() {
        return this.profile;
    }

    public void setProfile(VirtualMachineProfileSpec[] profile) {
        this.profile = profile;
    }

}

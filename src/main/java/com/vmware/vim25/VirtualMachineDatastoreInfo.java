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

public class VirtualMachineDatastoreInfo extends VirtualMachineTargetInfo {
    public DatastoreSummary datastore;
    public DatastoreCapability capability;
    public long maxFileSize;
    public long maxVirtualDiskCapacity;
    public long maxPhysicalRDMFileSize;
    public long maxVirtualRDMFileSize;
    public String mode;
    public String vStorageSupport;

    public DatastoreSummary getDatastore() {
        return this.datastore;
    }

    public void setDatastore(DatastoreSummary datastore) {
        this.datastore = datastore;
    }

    public DatastoreCapability getCapability() {
        return this.capability;
    }

    public void setCapability(DatastoreCapability capability) {
        this.capability = capability;
    }

    public long getMaxFileSize() {
        return this.maxFileSize;
    }

    public void setMaxFileSize(long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public long getMaxVirtualDiskCapacity() {
        return this.maxVirtualDiskCapacity;
    }

    public void setMaxVirtualDiskCapacity(long maxVirtualDiskCapacity) {
        this.maxVirtualDiskCapacity = maxVirtualDiskCapacity;
    }

    public long getMaxPhysicalRDMFileSize() {
        return this.maxPhysicalRDMFileSize;
    }

    public void setMaxPhysicalRDMFileSize(long maxPhysicalRDMFileSize) {
        this.maxPhysicalRDMFileSize = maxPhysicalRDMFileSize;
    }

    public long getMaxVirtualRDMFileSize() {
        return this.maxVirtualRDMFileSize;
    }

    public void setMaxVirtualRDMFileSize(long maxVirtualRDMFileSize) {
        this.maxVirtualRDMFileSize = maxVirtualRDMFileSize;
    }

    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getVStorageSupport() {
        return this.vStorageSupport;
    }

    public void setVStorageSupport(String vStorageSupport) {
        this.vStorageSupport = vStorageSupport;
    }

}

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

public class VirtualDisk extends VirtualDevice {
    public long capacityInKB;
    public long capacityInBytes;
    public SharesInfo shares;
    public StorageIOAllocationInfo storageIOAllocation;
    public String diskObjectId;
    public VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo;
    public String[] iofilter;

    public long getCapacityInKB() {
        return this.capacityInKB;
    }

    public void setCapacityInKB(long capacityInKB) {
        this.capacityInKB = capacityInKB;
    }

    public long getCapacityInBytes() {
        return this.capacityInBytes;
    }

    public void setCapacityInBytes(long capacityInBytes) {
        this.capacityInBytes = capacityInBytes;
    }

    public SharesInfo getShares() {
        return this.shares;
    }

    public void setShares(SharesInfo shares) {
        this.shares = shares;
    }

    public StorageIOAllocationInfo getStorageIOAllocation() {
        return this.storageIOAllocation;
    }

    public void setStorageIOAllocation(StorageIOAllocationInfo storageIOAllocation) {
        this.storageIOAllocation = storageIOAllocation;
    }

    public String getDiskObjectId() {
        return this.diskObjectId;
    }

    public void setDiskObjectId(String diskObjectId) {
        this.diskObjectId = diskObjectId;
    }

    public VirtualDiskVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
        return this.vFlashCacheConfigInfo;
    }

    public void setVFlashCacheConfigInfo(VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo) {
        this.vFlashCacheConfigInfo = vFlashCacheConfigInfo;
    }

    public String[] getIofilter() {
        return this.iofilter;
    }

    public void setIofilter(String[] iofilter) {
        this.iofilter = iofilter;
    }

}

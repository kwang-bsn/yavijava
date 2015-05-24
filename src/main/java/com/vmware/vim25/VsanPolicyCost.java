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

public class VsanPolicyCost extends DynamicData {
    public long changeDataSize;
    public long currentDataSize;
    public long tempDataSize;
    public long copyDataSize;
    public long changeFlashReadCacheSize;
    public long currentFlashReadCacheSize;
    public float currentDiskSpaceToAddressSpaceRatio;
    public float diskSpaceToAddressSpaceRatio;

    public long getChangeDataSize() {
        return this.changeDataSize;
    }

    public void setChangeDataSize(long changeDataSize) {
        this.changeDataSize = changeDataSize;
    }

    public long getCurrentDataSize() {
        return this.currentDataSize;
    }

    public void setCurrentDataSize(long currentDataSize) {
        this.currentDataSize = currentDataSize;
    }

    public long getTempDataSize() {
        return this.tempDataSize;
    }

    public void setTempDataSize(long tempDataSize) {
        this.tempDataSize = tempDataSize;
    }

    public long getCopyDataSize() {
        return this.copyDataSize;
    }

    public void setCopyDataSize(long copyDataSize) {
        this.copyDataSize = copyDataSize;
    }

    public long getChangeFlashReadCacheSize() {
        return this.changeFlashReadCacheSize;
    }

    public void setChangeFlashReadCacheSize(long changeFlashReadCacheSize) {
        this.changeFlashReadCacheSize = changeFlashReadCacheSize;
    }

    public long getCurrentFlashReadCacheSize() {
        return this.currentFlashReadCacheSize;
    }

    public void setCurrentFlashReadCacheSize(long currentFlashReadCacheSize) {
        this.currentFlashReadCacheSize = currentFlashReadCacheSize;
    }

    public float getCurrentDiskSpaceToAddressSpaceRatio() {
        return this.currentDiskSpaceToAddressSpaceRatio;
    }

    public void setCurrentDiskSpaceToAddressSpaceRatio(float currentDiskSpaceToAddressSpaceRatio) {
        this.currentDiskSpaceToAddressSpaceRatio = currentDiskSpaceToAddressSpaceRatio;
    }

    public float getDiskSpaceToAddressSpaceRatio() {
        return this.diskSpaceToAddressSpaceRatio;
    }

    public void setDiskSpaceToAddressSpaceRatio(float diskSpaceToAddressSpaceRatio) {
        this.diskSpaceToAddressSpaceRatio = diskSpaceToAddressSpaceRatio;
    }

}

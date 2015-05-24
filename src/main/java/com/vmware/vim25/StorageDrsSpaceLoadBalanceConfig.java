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

public class StorageDrsSpaceLoadBalanceConfig extends DynamicData {
    public String spaceThresholdMode;
    public Integer spaceUtilizationThreshold;
    public Integer freeSpaceThresholdGB;
    public Integer minSpaceUtilizationDifference;

    public String getSpaceThresholdMode() {
        return this.spaceThresholdMode;
    }

    public void setSpaceThresholdMode(String spaceThresholdMode) {
        this.spaceThresholdMode = spaceThresholdMode;
    }

    public Integer getSpaceUtilizationThreshold() {
        return this.spaceUtilizationThreshold;
    }

    public void setSpaceUtilizationThreshold(Integer spaceUtilizationThreshold) {
        this.spaceUtilizationThreshold = spaceUtilizationThreshold;
    }

    public Integer getFreeSpaceThresholdGB() {
        return this.freeSpaceThresholdGB;
    }

    public void setFreeSpaceThresholdGB(Integer freeSpaceThresholdGB) {
        this.freeSpaceThresholdGB = freeSpaceThresholdGB;
    }

    public Integer getMinSpaceUtilizationDifference() {
        return this.minSpaceUtilizationDifference;
    }

    public void setMinSpaceUtilizationDifference(Integer minSpaceUtilizationDifference) {
        this.minSpaceUtilizationDifference = minSpaceUtilizationDifference;
    }

}

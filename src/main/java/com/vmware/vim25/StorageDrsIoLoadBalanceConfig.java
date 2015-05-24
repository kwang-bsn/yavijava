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

public class StorageDrsIoLoadBalanceConfig extends DynamicData {
    public Integer reservablePercentThreshold;
    public Integer reservableIopsThreshold;
    public String reservableThresholdMode;
    public Integer ioLatencyThreshold;
    public Integer ioLoadImbalanceThreshold;

    public Integer getReservablePercentThreshold() {
        return this.reservablePercentThreshold;
    }

    public void setReservablePercentThreshold(Integer reservablePercentThreshold) {
        this.reservablePercentThreshold = reservablePercentThreshold;
    }

    public Integer getReservableIopsThreshold() {
        return this.reservableIopsThreshold;
    }

    public void setReservableIopsThreshold(Integer reservableIopsThreshold) {
        this.reservableIopsThreshold = reservableIopsThreshold;
    }

    public String getReservableThresholdMode() {
        return this.reservableThresholdMode;
    }

    public void setReservableThresholdMode(String reservableThresholdMode) {
        this.reservableThresholdMode = reservableThresholdMode;
    }

    public Integer getIoLatencyThreshold() {
        return this.ioLatencyThreshold;
    }

    public void setIoLatencyThreshold(Integer ioLatencyThreshold) {
        this.ioLatencyThreshold = ioLatencyThreshold;
    }

    public Integer getIoLoadImbalanceThreshold() {
        return this.ioLoadImbalanceThreshold;
    }

    public void setIoLoadImbalanceThreshold(Integer ioLoadImbalanceThreshold) {
        this.ioLoadImbalanceThreshold = ioLoadImbalanceThreshold;
    }

}

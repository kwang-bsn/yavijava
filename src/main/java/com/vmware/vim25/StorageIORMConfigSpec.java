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

public class StorageIORMConfigSpec extends DynamicData {
    public Boolean enabled;
    public String congestionThresholdMode;
    public Integer congestionThreshold;
    public Integer percentOfPeakThroughput;
    public Boolean statsCollectionEnabled;
    public Boolean reservationEnabled;
    public Boolean statsAggregationDisabled;
    public Integer reservableIopsThreshold;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getCongestionThresholdMode() {
        return this.congestionThresholdMode;
    }

    public void setCongestionThresholdMode(String congestionThresholdMode) {
        this.congestionThresholdMode = congestionThresholdMode;
    }

    public Integer getCongestionThreshold() {
        return this.congestionThreshold;
    }

    public void setCongestionThreshold(Integer congestionThreshold) {
        this.congestionThreshold = congestionThreshold;
    }

    public Integer getPercentOfPeakThroughput() {
        return this.percentOfPeakThroughput;
    }

    public void setPercentOfPeakThroughput(Integer percentOfPeakThroughput) {
        this.percentOfPeakThroughput = percentOfPeakThroughput;
    }

    public Boolean getStatsCollectionEnabled() {
        return this.statsCollectionEnabled;
    }

    public void setStatsCollectionEnabled(Boolean statsCollectionEnabled) {
        this.statsCollectionEnabled = statsCollectionEnabled;
    }

    public Boolean getReservationEnabled() {
        return this.reservationEnabled;
    }

    public void setReservationEnabled(Boolean reservationEnabled) {
        this.reservationEnabled = reservationEnabled;
    }

    public Boolean getStatsAggregationDisabled() {
        return this.statsAggregationDisabled;
    }

    public void setStatsAggregationDisabled(Boolean statsAggregationDisabled) {
        this.statsAggregationDisabled = statsAggregationDisabled;
    }

    public Integer getReservableIopsThreshold() {
        return this.reservableIopsThreshold;
    }

    public void setReservableIopsThreshold(Integer reservableIopsThreshold) {
        this.reservableIopsThreshold = reservableIopsThreshold;
    }

}

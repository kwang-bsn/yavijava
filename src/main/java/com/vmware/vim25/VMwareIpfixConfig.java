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

public class VMwareIpfixConfig extends DynamicData {
    public String collectorIpAddress;
    public Integer collectorPort;
    public long observationDomainId;
    public int activeFlowTimeout;
    public int idleFlowTimeout;
    public int samplingRate;
    public boolean internalFlowsOnly;

    public String getCollectorIpAddress() {
        return this.collectorIpAddress;
    }

    public void setCollectorIpAddress(String collectorIpAddress) {
        this.collectorIpAddress = collectorIpAddress;
    }

    public Integer getCollectorPort() {
        return this.collectorPort;
    }

    public void setCollectorPort(Integer collectorPort) {
        this.collectorPort = collectorPort;
    }

    public long getObservationDomainId() {
        return this.observationDomainId;
    }

    public void setObservationDomainId(long observationDomainId) {
        this.observationDomainId = observationDomainId;
    }

    public int getActiveFlowTimeout() {
        return this.activeFlowTimeout;
    }

    public void setActiveFlowTimeout(int activeFlowTimeout) {
        this.activeFlowTimeout = activeFlowTimeout;
    }

    public int getIdleFlowTimeout() {
        return this.idleFlowTimeout;
    }

    public void setIdleFlowTimeout(int idleFlowTimeout) {
        this.idleFlowTimeout = idleFlowTimeout;
    }

    public int getSamplingRate() {
        return this.samplingRate;
    }

    public void setSamplingRate(int samplingRate) {
        this.samplingRate = samplingRate;
    }

    public boolean getInternalFlowsOnly() {
        return this.internalFlowsOnly;
    }

    public void setInternalFlowsOnly(boolean internalFlowsOnly) {
        this.internalFlowsOnly = internalFlowsOnly;
    }

}

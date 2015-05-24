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

public class VirtualMachineFlagInfo extends DynamicData {
    public Boolean disableAcceleration;
    public Boolean enableLogging;
    public Boolean useToe;
    public Boolean runWithDebugInfo;
    public String monitorType;
    public String htSharing;
    public Boolean snapshotDisabled;
    public Boolean snapshotLocked;
    public Boolean diskUuidEnabled;
    public String virtualMmuUsage;
    public String virtualExecUsage;
    public String snapshotPowerOffBehavior;
    public Boolean recordReplayEnabled;
    public String faultToleranceType;

    public Boolean getDisableAcceleration() {
        return this.disableAcceleration;
    }

    public void setDisableAcceleration(Boolean disableAcceleration) {
        this.disableAcceleration = disableAcceleration;
    }

    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public void setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
    }

    public Boolean getUseToe() {
        return this.useToe;
    }

    public void setUseToe(Boolean useToe) {
        this.useToe = useToe;
    }

    public Boolean getRunWithDebugInfo() {
        return this.runWithDebugInfo;
    }

    public void setRunWithDebugInfo(Boolean runWithDebugInfo) {
        this.runWithDebugInfo = runWithDebugInfo;
    }

    public String getMonitorType() {
        return this.monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public String getHtSharing() {
        return this.htSharing;
    }

    public void setHtSharing(String htSharing) {
        this.htSharing = htSharing;
    }

    public Boolean getSnapshotDisabled() {
        return this.snapshotDisabled;
    }

    public void setSnapshotDisabled(Boolean snapshotDisabled) {
        this.snapshotDisabled = snapshotDisabled;
    }

    public Boolean getSnapshotLocked() {
        return this.snapshotLocked;
    }

    public void setSnapshotLocked(Boolean snapshotLocked) {
        this.snapshotLocked = snapshotLocked;
    }

    public Boolean getDiskUuidEnabled() {
        return this.diskUuidEnabled;
    }

    public void setDiskUuidEnabled(Boolean diskUuidEnabled) {
        this.diskUuidEnabled = diskUuidEnabled;
    }

    public String getVirtualMmuUsage() {
        return this.virtualMmuUsage;
    }

    public void setVirtualMmuUsage(String virtualMmuUsage) {
        this.virtualMmuUsage = virtualMmuUsage;
    }

    public String getVirtualExecUsage() {
        return this.virtualExecUsage;
    }

    public void setVirtualExecUsage(String virtualExecUsage) {
        this.virtualExecUsage = virtualExecUsage;
    }

    public String getSnapshotPowerOffBehavior() {
        return this.snapshotPowerOffBehavior;
    }

    public void setSnapshotPowerOffBehavior(String snapshotPowerOffBehavior) {
        this.snapshotPowerOffBehavior = snapshotPowerOffBehavior;
    }

    public Boolean getRecordReplayEnabled() {
        return this.recordReplayEnabled;
    }

    public void setRecordReplayEnabled(Boolean recordReplayEnabled) {
        this.recordReplayEnabled = recordReplayEnabled;
    }

    public String getFaultToleranceType() {
        return this.faultToleranceType;
    }

    public void setFaultToleranceType(String faultToleranceType) {
        this.faultToleranceType = faultToleranceType;
    }

}

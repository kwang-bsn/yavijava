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

public class VirtualDiskFlatVer2BackingInfo extends VirtualDeviceFileBackingInfo {
    public String diskMode;
    public Boolean split;
    public Boolean writeThrough;
    public Boolean thinProvisioned;
    public Boolean eagerlyScrub;
    public String uuid;
    public String contentId;
    public String changeId;
    public VirtualDiskFlatVer2BackingInfo parent;
    public String deltaDiskFormat;
    public Boolean digestEnabled;
    public Integer deltaGrainSize;
    public String deltaDiskFormatVariant;
    public String sharing;

    public String getDiskMode() {
        return this.diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public Boolean getSplit() {
        return this.split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public Boolean getWriteThrough() {
        return this.writeThrough;
    }

    public void setWriteThrough(Boolean writeThrough) {
        this.writeThrough = writeThrough;
    }

    public Boolean getThinProvisioned() {
        return this.thinProvisioned;
    }

    public void setThinProvisioned(Boolean thinProvisioned) {
        this.thinProvisioned = thinProvisioned;
    }

    public Boolean getEagerlyScrub() {
        return this.eagerlyScrub;
    }

    public void setEagerlyScrub(Boolean eagerlyScrub) {
        this.eagerlyScrub = eagerlyScrub;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContentId() {
        return this.contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getChangeId() {
        return this.changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public VirtualDiskFlatVer2BackingInfo getParent() {
        return this.parent;
    }

    public void setParent(VirtualDiskFlatVer2BackingInfo parent) {
        this.parent = parent;
    }

    public String getDeltaDiskFormat() {
        return this.deltaDiskFormat;
    }

    public void setDeltaDiskFormat(String deltaDiskFormat) {
        this.deltaDiskFormat = deltaDiskFormat;
    }

    public Boolean getDigestEnabled() {
        return this.digestEnabled;
    }

    public void setDigestEnabled(Boolean digestEnabled) {
        this.digestEnabled = digestEnabled;
    }

    public Integer getDeltaGrainSize() {
        return this.deltaGrainSize;
    }

    public void setDeltaGrainSize(Integer deltaGrainSize) {
        this.deltaGrainSize = deltaGrainSize;
    }

    public String getDeltaDiskFormatVariant() {
        return this.deltaDiskFormatVariant;
    }

    public void setDeltaDiskFormatVariant(String deltaDiskFormatVariant) {
        this.deltaDiskFormatVariant = deltaDiskFormatVariant;
    }

    public String getSharing() {
        return this.sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

}

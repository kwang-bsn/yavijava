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

public class ScsiLun extends HostDevice {
    public String key;
    public String uuid;
    public ScsiLunDescriptor[] descriptor;
    public String canonicalName;
    public String displayName;
    public String lunType;
    public String vendor;
    public String model;
    public String revision;
    public Integer scsiLevel;
    public String serialNumber;
    public ScsiLunDurableName durableName;
    public ScsiLunDurableName[] alternateName;
    public byte[] standardInquiry;
    public Integer queueDepth;
    public String[] operationalState;
    public ScsiLunCapabilities capabilities;
    public String vStorageSupport;
    public Boolean protocolEndpoint;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ScsiLunDescriptor[] getDescriptor() {
        return this.descriptor;
    }

    public void setDescriptor(ScsiLunDescriptor[] descriptor) {
        this.descriptor = descriptor;
    }

    public String getCanonicalName() {
        return this.canonicalName;
    }

    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLunType() {
        return this.lunType;
    }

    public void setLunType(String lunType) {
        this.lunType = lunType;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public Integer getScsiLevel() {
        return this.scsiLevel;
    }

    public void setScsiLevel(Integer scsiLevel) {
        this.scsiLevel = scsiLevel;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ScsiLunDurableName getDurableName() {
        return this.durableName;
    }

    public void setDurableName(ScsiLunDurableName durableName) {
        this.durableName = durableName;
    }

    public ScsiLunDurableName[] getAlternateName() {
        return this.alternateName;
    }

    public void setAlternateName(ScsiLunDurableName[] alternateName) {
        this.alternateName = alternateName;
    }

    public byte[] getStandardInquiry() {
        return this.standardInquiry;
    }

    public void setStandardInquiry(byte[] standardInquiry) {
        this.standardInquiry = standardInquiry;
    }

    public Integer getQueueDepth() {
        return this.queueDepth;
    }

    public void setQueueDepth(Integer queueDepth) {
        this.queueDepth = queueDepth;
    }

    public String[] getOperationalState() {
        return this.operationalState;
    }

    public void setOperationalState(String[] operationalState) {
        this.operationalState = operationalState;
    }

    public ScsiLunCapabilities getCapabilities() {
        return this.capabilities;
    }

    public void setCapabilities(ScsiLunCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public String getVStorageSupport() {
        return this.vStorageSupport;
    }

    public void setVStorageSupport(String vStorageSupport) {
        this.vStorageSupport = vStorageSupport;
    }

    public Boolean getProtocolEndpoint() {
        return this.protocolEndpoint;
    }

    public void setProtocolEndpoint(Boolean protocolEndpoint) {
        this.protocolEndpoint = protocolEndpoint;
    }

}

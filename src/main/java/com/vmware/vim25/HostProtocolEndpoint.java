package com.vmware.vim25;

/**
 * Created by Michael Rice on Sun May 24 07:03:51 CDT 2015
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

public class HostProtocolEndpoint extends DynamicData {
    public String peType;
    public String uuid;
    public ManagedObjectReference[] hostKey;
    public String storageArray;
    public String nfsServer;
    public String nfsDir;
    public String deviceId;

    public String getPeType() {
        return this.peType;
    }

    public void setPeType(String peType) {
        this.peType = peType;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ManagedObjectReference[] getHostKey() {
        return this.hostKey;
    }

    public void setHostKey(ManagedObjectReference[] hostKey) {
        this.hostKey = hostKey;
    }

    public String getStorageArray() {
        return this.storageArray;
    }

    public void setStorageArray(String storageArray) {
        this.storageArray = storageArray;
    }

    public String getNfsServer() {
        return this.nfsServer;
    }

    public void setNfsServer(String nfsServer) {
        this.nfsServer = nfsServer;
    }

    public String getNfsDir() {
        return this.nfsDir;
    }

    public void setNfsDir(String nfsDir) {
        this.nfsDir = nfsDir;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

}

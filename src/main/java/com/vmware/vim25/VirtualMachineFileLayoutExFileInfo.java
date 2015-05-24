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

public class VirtualMachineFileLayoutExFileInfo extends DynamicData {
    public int key;
    public String name;
    public String type;
    public long size;
    public long uniqueSize;
    public String backingObjectId;
    public Boolean accessible;

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getUniqueSize() {
        return this.uniqueSize;
    }

    public void setUniqueSize(long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public String getBackingObjectId() {
        return this.backingObjectId;
    }

    public void setBackingObjectId(String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }

    public Boolean getAccessible() {
        return this.accessible;
    }

    public void setAccessible(Boolean accessible) {
        this.accessible = accessible;
    }

}

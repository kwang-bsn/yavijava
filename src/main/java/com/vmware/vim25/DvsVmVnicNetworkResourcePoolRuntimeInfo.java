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

public class DvsVmVnicNetworkResourcePoolRuntimeInfo extends DynamicData {
    public String key;
    public String name;
    public Integer capacity;
    public Integer usage;
    public Integer available;
    public String status;
    public DvsVnicAllocatedResource[] allocatedResource;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getUsage() {
        return this.usage;
    }

    public void setUsage(Integer usage) {
        this.usage = usage;
    }

    public Integer getAvailable() {
        return this.available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DvsVnicAllocatedResource[] getAllocatedResource() {
        return this.allocatedResource;
    }

    public void setAllocatedResource(DvsVnicAllocatedResource[] allocatedResource) {
        this.allocatedResource = allocatedResource;
    }

}

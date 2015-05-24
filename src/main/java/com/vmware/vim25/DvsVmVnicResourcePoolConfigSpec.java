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

public class DvsVmVnicResourcePoolConfigSpec extends DynamicData {
    public String operation;
    public String key;
    public String configVersion;
    public DvsVmVnicResourceAllocation allocationInfo;
    public String name;
    public String description;

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getConfigVersion() {
        return this.configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public DvsVmVnicResourceAllocation getAllocationInfo() {
        return this.allocationInfo;
    }

    public void setAllocationInfo(DvsVmVnicResourceAllocation allocationInfo) {
        this.allocationInfo = allocationInfo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

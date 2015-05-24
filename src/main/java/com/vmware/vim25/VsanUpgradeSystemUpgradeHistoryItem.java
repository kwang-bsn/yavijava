package com.vmware.vim25;

import java.util.Calendar;

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

public class VsanUpgradeSystemUpgradeHistoryItem extends DynamicData {
    public Calendar timestamp;
    public ManagedObjectReference host;
    public String message;
    public ManagedObjectReference task;

    public Calendar getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    public ManagedObjectReference getHost() {
        return this.host;
    }

    public void setHost(ManagedObjectReference host) {
        this.host = host;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ManagedObjectReference getTask() {
        return this.task;
    }

    public void setTask(ManagedObjectReference task) {
        this.task = task;
    }

}

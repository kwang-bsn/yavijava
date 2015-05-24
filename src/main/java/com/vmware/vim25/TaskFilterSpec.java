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

public class TaskFilterSpec extends DynamicData {
    public TaskFilterSpecByEntity entity;
    public TaskFilterSpecByTime time;
    public TaskFilterSpecByUsername userName;
    public String[] activationId;
    public TaskInfoState[] state;
    public ManagedObjectReference alarm;
    public ManagedObjectReference scheduledTask;
    public Integer[] eventChainId;
    public String[] tag;
    public String[] parentTaskKey;
    public String[] rootTaskKey;

    public TaskFilterSpecByEntity getEntity() {
        return this.entity;
    }

    public void setEntity(TaskFilterSpecByEntity entity) {
        this.entity = entity;
    }

    public TaskFilterSpecByTime getTime() {
        return this.time;
    }

    public void setTime(TaskFilterSpecByTime time) {
        this.time = time;
    }

    public TaskFilterSpecByUsername getUserName() {
        return this.userName;
    }

    public void setUserName(TaskFilterSpecByUsername userName) {
        this.userName = userName;
    }

    public String[] getActivationId() {
        return this.activationId;
    }

    public void setActivationId(String[] activationId) {
        this.activationId = activationId;
    }

    public TaskInfoState[] getState() {
        return this.state;
    }

    public void setState(TaskInfoState[] state) {
        this.state = state;
    }

    public ManagedObjectReference getAlarm() {
        return this.alarm;
    }

    public void setAlarm(ManagedObjectReference alarm) {
        this.alarm = alarm;
    }

    public ManagedObjectReference getScheduledTask() {
        return this.scheduledTask;
    }

    public void setScheduledTask(ManagedObjectReference scheduledTask) {
        this.scheduledTask = scheduledTask;
    }

    public Integer[] getEventChainId() {
        return this.eventChainId;
    }

    public void setEventChainId(Integer[] eventChainId) {
        this.eventChainId = eventChainId;
    }

    public String[] getTag() {
        return this.tag;
    }

    public void setTag(String[] tag) {
        this.tag = tag;
    }

    public String[] getParentTaskKey() {
        return this.parentTaskKey;
    }

    public void setParentTaskKey(String[] parentTaskKey) {
        this.parentTaskKey = parentTaskKey;
    }

    public String[] getRootTaskKey() {
        return this.rootTaskKey;
    }

    public void setRootTaskKey(String[] rootTaskKey) {
        this.rootTaskKey = rootTaskKey;
    }

}

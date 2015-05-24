package com.vmware.vim25;

import java.util.Calendar;

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

public class TaskInfo extends DynamicData {
    public String key;
    public ManagedObjectReference task;
    public LocalizableMessage description;
    public String name;
    public String descriptionId;
    public ManagedObjectReference entity;
    public String entityName;
    public ManagedObjectReference[] locked;
    public TaskInfoState state;
    public boolean cancelled;
    public boolean cancelable;
    public LocalizedMethodFault error;
    public Object result;
    public Integer progress;
    public TaskReason reason;
    public Calendar queueTime;
    public Calendar startTime;
    public Calendar completeTime;
    public int eventChainId;
    public String changeTag;
    public String parentTaskKey;
    public String rootTaskKey;
    public String activationId;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ManagedObjectReference getTask() {
        return this.task;
    }

    public void setTask(ManagedObjectReference task) {
        this.task = task;
    }

    public LocalizableMessage getDescription() {
        return this.description;
    }

    public void setDescription(LocalizableMessage description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptionId() {
        return this.descriptionId;
    }

    public void setDescriptionId(String descriptionId) {
        this.descriptionId = descriptionId;
    }

    public ManagedObjectReference getEntity() {
        return this.entity;
    }

    public void setEntity(ManagedObjectReference entity) {
        this.entity = entity;
    }

    public String getEntityName() {
        return this.entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public ManagedObjectReference[] getLocked() {
        return this.locked;
    }

    public void setLocked(ManagedObjectReference[] locked) {
        this.locked = locked;
    }

    public TaskInfoState getState() {
        return this.state;
    }

    public void setState(TaskInfoState state) {
        this.state = state;
    }

    public boolean getCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean getCancelable() {
        return this.cancelable;
    }

    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }

    public LocalizedMethodFault getError() {
        return this.error;
    }

    public void setError(LocalizedMethodFault error) {
        this.error = error;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Integer getProgress() {
        return this.progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public TaskReason getReason() {
        return this.reason;
    }

    public void setReason(TaskReason reason) {
        this.reason = reason;
    }

    public Calendar getQueueTime() {
        return this.queueTime;
    }

    public void setQueueTime(Calendar queueTime) {
        this.queueTime = queueTime;
    }

    public Calendar getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getCompleteTime() {
        return this.completeTime;
    }

    public void setCompleteTime(Calendar completeTime) {
        this.completeTime = completeTime;
    }

    public int getEventChainId() {
        return this.eventChainId;
    }

    public void setEventChainId(int eventChainId) {
        this.eventChainId = eventChainId;
    }

    public String getChangeTag() {
        return this.changeTag;
    }

    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag;
    }

    public String getParentTaskKey() {
        return this.parentTaskKey;
    }

    public void setParentTaskKey(String parentTaskKey) {
        this.parentTaskKey = parentTaskKey;
    }

    public String getRootTaskKey() {
        return this.rootTaskKey;
    }

    public void setRootTaskKey(String rootTaskKey) {
        this.rootTaskKey = rootTaskKey;
    }

    public String getActivationId() {
        return this.activationId;
    }

    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

}

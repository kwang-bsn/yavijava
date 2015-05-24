package com.vmware.vim25;

import java.util.Calendar;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class AlarmState extends DynamicData {
    public String key;
    public ManagedObjectReference entity;
    public ManagedObjectReference alarm;
    public ManagedEntityStatus overallStatus;
    public Calendar time;
    public Boolean acknowledged;
    public String acknowledgedByUser;
    public Calendar acknowledgedTime;
    public Integer eventKey;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ManagedObjectReference getEntity() {
        return this.entity;
    }

    public void setEntity(ManagedObjectReference entity) {
        this.entity = entity;
    }

    public ManagedObjectReference getAlarm() {
        return this.alarm;
    }

    public void setAlarm(ManagedObjectReference alarm) {
        this.alarm = alarm;
    }

    public ManagedEntityStatus getOverallStatus() {
        return this.overallStatus;
    }

    public void setOverallStatus(ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }

    public Calendar getTime() {
        return this.time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public Boolean getAcknowledged() {
        return this.acknowledged;
    }

    public void setAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public String getAcknowledgedByUser() {
        return this.acknowledgedByUser;
    }

    public void setAcknowledgedByUser(String acknowledgedByUser) {
        this.acknowledgedByUser = acknowledgedByUser;
    }

    public Calendar getAcknowledgedTime() {
        return this.acknowledgedTime;
    }

    public void setAcknowledgedTime(Calendar acknowledgedTime) {
        this.acknowledgedTime = acknowledgedTime;
    }

    public Integer getEventKey() {
        return this.eventKey;
    }

    public void setEventKey(Integer eventKey) {
        this.eventKey = eventKey;
    }

}

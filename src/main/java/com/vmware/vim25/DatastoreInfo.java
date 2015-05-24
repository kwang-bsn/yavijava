package com.vmware.vim25;

import java.util.Calendar;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

public class DatastoreInfo extends DynamicData {
    public String name;
    public String url;
    public long freeSpace;
    public long maxFileSize;
    public long maxVirtualDiskCapacity;
    public long maxMemoryFileSize;
    public Calendar timestamp;
    public String containerId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getFreeSpace() {
        return this.freeSpace;
    }

    public void setFreeSpace(long freeSpace) {
        this.freeSpace = freeSpace;
    }

    public long getMaxFileSize() {
        return this.maxFileSize;
    }

    public void setMaxFileSize(long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public long getMaxVirtualDiskCapacity() {
        return this.maxVirtualDiskCapacity;
    }

    public void setMaxVirtualDiskCapacity(long maxVirtualDiskCapacity) {
        this.maxVirtualDiskCapacity = maxVirtualDiskCapacity;
    }

    public long getMaxMemoryFileSize() {
        return this.maxMemoryFileSize;
    }

    public void setMaxMemoryFileSize(long maxMemoryFileSize) {
        this.maxMemoryFileSize = maxMemoryFileSize;
    }

    public Calendar getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    public String getContainerId() {
        return this.containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

}

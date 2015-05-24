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

public class ReplicationConfigSpec extends DynamicData {
    public long generation;
    public String vmReplicationId;
    public String destination;
    public int port;
    public long rpo;
    public boolean quiesceGuestEnabled;
    public boolean paused;
    public boolean oppUpdatesEnabled;
    public Boolean netCompressionEnabled;
    public ReplicationInfoDiskSettings[] disk;

    public long getGeneration() {
        return this.generation;
    }

    public void setGeneration(long generation) {
        this.generation = generation;
    }

    public String getVmReplicationId() {
        return this.vmReplicationId;
    }

    public void setVmReplicationId(String vmReplicationId) {
        this.vmReplicationId = vmReplicationId;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getRpo() {
        return this.rpo;
    }

    public void setRpo(long rpo) {
        this.rpo = rpo;
    }

    public boolean getQuiesceGuestEnabled() {
        return this.quiesceGuestEnabled;
    }

    public void setQuiesceGuestEnabled(boolean quiesceGuestEnabled) {
        this.quiesceGuestEnabled = quiesceGuestEnabled;
    }

    public boolean getPaused() {
        return this.paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public boolean getOppUpdatesEnabled() {
        return this.oppUpdatesEnabled;
    }

    public void setOppUpdatesEnabled(boolean oppUpdatesEnabled) {
        this.oppUpdatesEnabled = oppUpdatesEnabled;
    }

    public Boolean getNetCompressionEnabled() {
        return this.netCompressionEnabled;
    }

    public void setNetCompressionEnabled(Boolean netCompressionEnabled) {
        this.netCompressionEnabled = netCompressionEnabled;
    }

    public ReplicationInfoDiskSettings[] getDisk() {
        return this.disk;
    }

    public void setDisk(ReplicationInfoDiskSettings[] disk) {
        this.disk = disk;
    }

}

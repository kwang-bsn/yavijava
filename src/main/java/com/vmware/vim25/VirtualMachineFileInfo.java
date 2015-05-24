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

public class VirtualMachineFileInfo extends DynamicData {
    public String vmPathName;
    public String snapshotDirectory;
    public String suspendDirectory;
    public String logDirectory;
    public String ftMetadataDirectory;

    public String getVmPathName() {
        return this.vmPathName;
    }

    public void setVmPathName(String vmPathName) {
        this.vmPathName = vmPathName;
    }

    public String getSnapshotDirectory() {
        return this.snapshotDirectory;
    }

    public void setSnapshotDirectory(String snapshotDirectory) {
        this.snapshotDirectory = snapshotDirectory;
    }

    public String getSuspendDirectory() {
        return this.suspendDirectory;
    }

    public void setSuspendDirectory(String suspendDirectory) {
        this.suspendDirectory = suspendDirectory;
    }

    public String getLogDirectory() {
        return this.logDirectory;
    }

    public void setLogDirectory(String logDirectory) {
        this.logDirectory = logDirectory;
    }

    public String getFtMetadataDirectory() {
        return this.ftMetadataDirectory;
    }

    public void setFtMetadataDirectory(String ftMetadataDirectory) {
        this.ftMetadataDirectory = ftMetadataDirectory;
    }

}

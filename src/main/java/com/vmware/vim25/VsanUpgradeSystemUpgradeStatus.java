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

public class VsanUpgradeSystemUpgradeStatus extends DynamicData {
    public boolean inProgress;
    public VsanUpgradeSystemUpgradeHistoryItem[] history;
    public Boolean aborted;
    public Boolean completed;
    public Integer progress;

    public boolean getInProgress() {
        return this.inProgress;
    }

    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    public VsanUpgradeSystemUpgradeHistoryItem[] getHistory() {
        return this.history;
    }

    public void setHistory(VsanUpgradeSystemUpgradeHistoryItem[] history) {
        this.history = history;
    }

    public Boolean getAborted() {
        return this.aborted;
    }

    public void setAborted(Boolean aborted) {
        this.aborted = aborted;
    }

    public Boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Integer getProgress() {
        return this.progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

}

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

public class HostProfileCompleteConfigSpec extends HostProfileConfigSpec {
    public HostApplyProfile applyProfile;
    public ComplianceProfile customComplyProfile;
    public boolean disabledExpressionListChanged;
    public String[] disabledExpressionList;
    public ManagedObjectReference validatorHost;
    public Boolean validating;

    public HostApplyProfile getApplyProfile() {
        return this.applyProfile;
    }

    public void setApplyProfile(HostApplyProfile applyProfile) {
        this.applyProfile = applyProfile;
    }

    public ComplianceProfile getCustomComplyProfile() {
        return this.customComplyProfile;
    }

    public void setCustomComplyProfile(ComplianceProfile customComplyProfile) {
        this.customComplyProfile = customComplyProfile;
    }

    public boolean getDisabledExpressionListChanged() {
        return this.disabledExpressionListChanged;
    }

    public void setDisabledExpressionListChanged(boolean disabledExpressionListChanged) {
        this.disabledExpressionListChanged = disabledExpressionListChanged;
    }

    public String[] getDisabledExpressionList() {
        return this.disabledExpressionList;
    }

    public void setDisabledExpressionList(String[] disabledExpressionList) {
        this.disabledExpressionList = disabledExpressionList;
    }

    public ManagedObjectReference getValidatorHost() {
        return this.validatorHost;
    }

    public void setValidatorHost(ManagedObjectReference validatorHost) {
        this.validatorHost = validatorHost;
    }

    public Boolean getValidating() {
        return this.validating;
    }

    public void setValidating(Boolean validating) {
        this.validating = validating;
    }

}

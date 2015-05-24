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

public class StorageDrsPodConfigInfo extends DynamicData {
    public boolean enabled;
    public boolean ioLoadBalanceEnabled;
    public String defaultVmBehavior;
    public Integer loadBalanceInterval;
    public Boolean defaultIntraVmAffinity;
    public StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig;
    public StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig;
    public StorageDrsAutomationConfig automationOverrides;
    public ClusterRuleInfo[] rule;
    public OptionValue[] option;

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getIoLoadBalanceEnabled() {
        return this.ioLoadBalanceEnabled;
    }

    public void setIoLoadBalanceEnabled(boolean ioLoadBalanceEnabled) {
        this.ioLoadBalanceEnabled = ioLoadBalanceEnabled;
    }

    public String getDefaultVmBehavior() {
        return this.defaultVmBehavior;
    }

    public void setDefaultVmBehavior(String defaultVmBehavior) {
        this.defaultVmBehavior = defaultVmBehavior;
    }

    public Integer getLoadBalanceInterval() {
        return this.loadBalanceInterval;
    }

    public void setLoadBalanceInterval(Integer loadBalanceInterval) {
        this.loadBalanceInterval = loadBalanceInterval;
    }

    public Boolean getDefaultIntraVmAffinity() {
        return this.defaultIntraVmAffinity;
    }

    public void setDefaultIntraVmAffinity(Boolean defaultIntraVmAffinity) {
        this.defaultIntraVmAffinity = defaultIntraVmAffinity;
    }

    public StorageDrsSpaceLoadBalanceConfig getSpaceLoadBalanceConfig() {
        return this.spaceLoadBalanceConfig;
    }

    public void setSpaceLoadBalanceConfig(StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig) {
        this.spaceLoadBalanceConfig = spaceLoadBalanceConfig;
    }

    public StorageDrsIoLoadBalanceConfig getIoLoadBalanceConfig() {
        return this.ioLoadBalanceConfig;
    }

    public void setIoLoadBalanceConfig(StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig) {
        this.ioLoadBalanceConfig = ioLoadBalanceConfig;
    }

    public StorageDrsAutomationConfig getAutomationOverrides() {
        return this.automationOverrides;
    }

    public void setAutomationOverrides(StorageDrsAutomationConfig automationOverrides) {
        this.automationOverrides = automationOverrides;
    }

    public ClusterRuleInfo[] getRule() {
        return this.rule;
    }

    public void setRule(ClusterRuleInfo[] rule) {
        this.rule = rule;
    }

    public OptionValue[] getOption() {
        return this.option;
    }

    public void setOption(OptionValue[] option) {
        this.option = option;
    }

}

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

public class VirtualEthernetCardOption extends VirtualDeviceOption {
    public ChoiceOption supportedOUI;
    public ChoiceOption macType;
    public BoolOption wakeOnLanEnabled;
    public Boolean vmDirectPathGen2Supported;
    public BoolOption uptCompatibilityEnabled;

    public ChoiceOption getSupportedOUI() {
        return this.supportedOUI;
    }

    public void setSupportedOUI(ChoiceOption supportedOUI) {
        this.supportedOUI = supportedOUI;
    }

    public ChoiceOption getMacType() {
        return this.macType;
    }

    public void setMacType(ChoiceOption macType) {
        this.macType = macType;
    }

    public BoolOption getWakeOnLanEnabled() {
        return this.wakeOnLanEnabled;
    }

    public void setWakeOnLanEnabled(BoolOption wakeOnLanEnabled) {
        this.wakeOnLanEnabled = wakeOnLanEnabled;
    }

    public Boolean getVmDirectPathGen2Supported() {
        return this.vmDirectPathGen2Supported;
    }

    public void setVmDirectPathGen2Supported(Boolean vmDirectPathGen2Supported) {
        this.vmDirectPathGen2Supported = vmDirectPathGen2Supported;
    }

    public BoolOption getUptCompatibilityEnabled() {
        return this.uptCompatibilityEnabled;
    }

    public void setUptCompatibilityEnabled(BoolOption uptCompatibilityEnabled) {
        this.uptCompatibilityEnabled = uptCompatibilityEnabled;
    }

}

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

public class VirtualMachineBootOptions extends DynamicData {
    public long bootDelay;
    public Boolean enterBIOSSetup;
    public Boolean bootRetryEnabled;
    public long bootRetryDelay;
    public VirtualMachineBootOptionsBootableDevice[] bootOrder;
    public String networkBootProtocol;

    public long getBootDelay() {
        return this.bootDelay;
    }

    public void setBootDelay(long bootDelay) {
        this.bootDelay = bootDelay;
    }

    public Boolean getEnterBIOSSetup() {
        return this.enterBIOSSetup;
    }

    public void setEnterBIOSSetup(Boolean enterBIOSSetup) {
        this.enterBIOSSetup = enterBIOSSetup;
    }

    public Boolean getBootRetryEnabled() {
        return this.bootRetryEnabled;
    }

    public void setBootRetryEnabled(Boolean bootRetryEnabled) {
        this.bootRetryEnabled = bootRetryEnabled;
    }

    public long getBootRetryDelay() {
        return this.bootRetryDelay;
    }

    public void setBootRetryDelay(long bootRetryDelay) {
        this.bootRetryDelay = bootRetryDelay;
    }

    public VirtualMachineBootOptionsBootableDevice[] getBootOrder() {
        return this.bootOrder;
    }

    public void setBootOrder(VirtualMachineBootOptionsBootableDevice[] bootOrder) {
        this.bootOrder = bootOrder;
    }

    public String getNetworkBootProtocol() {
        return this.networkBootProtocol;
    }

    public void setNetworkBootProtocol(String networkBootProtocol) {
        this.networkBootProtocol = networkBootProtocol;
    }

}

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

public class VirtualMachineVMCIDeviceOptionFilterSpecOption extends DynamicData {
    public ChoiceOption action;
    public ChoiceOption protocol;
    public ChoiceOption direction;
    public LongOption lowerDstPortBoundary;
    public LongOption upperDstPortBoundary;

    public ChoiceOption getAction() {
        return this.action;
    }

    public void setAction(ChoiceOption action) {
        this.action = action;
    }

    public ChoiceOption getProtocol() {
        return this.protocol;
    }

    public void setProtocol(ChoiceOption protocol) {
        this.protocol = protocol;
    }

    public ChoiceOption getDirection() {
        return this.direction;
    }

    public void setDirection(ChoiceOption direction) {
        this.direction = direction;
    }

    public LongOption getLowerDstPortBoundary() {
        return this.lowerDstPortBoundary;
    }

    public void setLowerDstPortBoundary(LongOption lowerDstPortBoundary) {
        this.lowerDstPortBoundary = lowerDstPortBoundary;
    }

    public LongOption getUpperDstPortBoundary() {
        return this.upperDstPortBoundary;
    }

    public void setUpperDstPortBoundary(LongOption upperDstPortBoundary) {
        this.upperDstPortBoundary = upperDstPortBoundary;
    }

}

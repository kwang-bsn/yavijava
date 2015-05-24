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

public class VirtualVideoCardOption extends VirtualDeviceOption {
    public LongOption videoRamSizeInKB;
    public IntOption numDisplays;
    public BoolOption useAutoDetect;
    public BoolOption support3D;
    public BoolOption use3dRendererSupported;
    public LongOption graphicsMemorySizeInKB;
    public BoolOption graphicsMemorySizeSupported;

    public LongOption getVideoRamSizeInKB() {
        return this.videoRamSizeInKB;
    }

    public void setVideoRamSizeInKB(LongOption videoRamSizeInKB) {
        this.videoRamSizeInKB = videoRamSizeInKB;
    }

    public IntOption getNumDisplays() {
        return this.numDisplays;
    }

    public void setNumDisplays(IntOption numDisplays) {
        this.numDisplays = numDisplays;
    }

    public BoolOption getUseAutoDetect() {
        return this.useAutoDetect;
    }

    public void setUseAutoDetect(BoolOption useAutoDetect) {
        this.useAutoDetect = useAutoDetect;
    }

    public BoolOption getSupport3D() {
        return this.support3D;
    }

    public void setSupport3D(BoolOption support3D) {
        this.support3D = support3D;
    }

    public BoolOption getUse3dRendererSupported() {
        return this.use3dRendererSupported;
    }

    public void setUse3dRendererSupported(BoolOption use3dRendererSupported) {
        this.use3dRendererSupported = use3dRendererSupported;
    }

    public LongOption getGraphicsMemorySizeInKB() {
        return this.graphicsMemorySizeInKB;
    }

    public void setGraphicsMemorySizeInKB(LongOption graphicsMemorySizeInKB) {
        this.graphicsMemorySizeInKB = graphicsMemorySizeInKB;
    }

    public BoolOption getGraphicsMemorySizeSupported() {
        return this.graphicsMemorySizeSupported;
    }

    public void setGraphicsMemorySizeSupported(BoolOption graphicsMemorySizeSupported) {
        this.graphicsMemorySizeSupported = graphicsMemorySizeSupported;
    }

}

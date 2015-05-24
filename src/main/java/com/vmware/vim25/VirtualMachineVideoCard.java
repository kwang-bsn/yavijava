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

public class VirtualMachineVideoCard extends VirtualDevice {
    public long videoRamSizeInKB;
    public Integer numDisplays;
    public Boolean useAutoDetect;
    public Boolean enable3DSupport;
    public String use3dRenderer;
    public long graphicsMemorySizeInKB;

    public long getVideoRamSizeInKB() {
        return this.videoRamSizeInKB;
    }

    public void setVideoRamSizeInKB(long videoRamSizeInKB) {
        this.videoRamSizeInKB = videoRamSizeInKB;
    }

    public Integer getNumDisplays() {
        return this.numDisplays;
    }

    public void setNumDisplays(Integer numDisplays) {
        this.numDisplays = numDisplays;
    }

    public Boolean getUseAutoDetect() {
        return this.useAutoDetect;
    }

    public void setUseAutoDetect(Boolean useAutoDetect) {
        this.useAutoDetect = useAutoDetect;
    }

    public Boolean getEnable3DSupport() {
        return this.enable3DSupport;
    }

    public void setEnable3DSupport(Boolean enable3DSupport) {
        this.enable3DSupport = enable3DSupport;
    }

    public String getUse3dRenderer() {
        return this.use3dRenderer;
    }

    public void setUse3dRenderer(String use3dRenderer) {
        this.use3dRenderer = use3dRenderer;
    }

    public long getGraphicsMemorySizeInKB() {
        return this.graphicsMemorySizeInKB;
    }

    public void setGraphicsMemorySizeInKB(long graphicsMemorySizeInKB) {
        this.graphicsMemorySizeInKB = graphicsMemorySizeInKB;
    }

}

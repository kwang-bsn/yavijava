package com.vmware.vim25;

import java.util.Calendar;

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

public class GuestRegKeySpec extends DynamicData {
    public GuestRegKeyNameSpec keyName;
    public String classType;
    public Calendar lastWritten;

    public GuestRegKeyNameSpec getKeyName() {
        return this.keyName;
    }

    public void setKeyName(GuestRegKeyNameSpec keyName) {
        this.keyName = keyName;
    }

    public String getClassType() {
        return this.classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Calendar getLastWritten() {
        return this.lastWritten;
    }

    public void setLastWritten(Calendar lastWritten) {
        this.lastWritten = lastWritten;
    }

}

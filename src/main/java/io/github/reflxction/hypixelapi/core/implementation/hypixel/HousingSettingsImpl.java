/*
 * * Copyright 2018-2019 github.com/ReflxctionDev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.reflxction.hypixelapi.core.implementation.hypixel;

import io.github.reflxction.hypixelapi.hypixel.HousingSettings;

/**
 * Class implementation for {@link HousingSettings}
 */
public class HousingSettingsImpl implements HousingSettings {

    private boolean border;

    private int visibility;

    public HousingSettingsImpl(boolean border, int visibility) {
        this.border = border;
        this.visibility = visibility;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public boolean isBorder() {
        return border;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public int getVisibility() {
        return visibility;
    }

    @Override
    public String toString() {
        return "HousingSettingsImpl{" +
                "border=" + border +
                ", visibility=" + visibility +
                '}';
    }
}

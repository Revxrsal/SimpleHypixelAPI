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

import com.google.gson.annotations.SerializedName;
import io.github.reflxction.hypixelapi.hypixel.AchievementTotem;

import java.util.List;
import java.util.Map;

/**
 * Class implementation for {@link AchievementTotem}
 */
public class AchievementTotemImpl implements AchievementTotem {

    private boolean canCustomize;

    @SerializedName("allowed_max_height")
    private int allowedMaxHeight;

    private List<String> unlockedParts;

    private Map<String, String> selectedParts;

    private List<String> unlockedColors;

    private Map<String, String> selectedColors;

    /**
     * Whether or not the totem can be customized
     *
     * @return Whether or not the totem can be customized
     */
    @Override
    public boolean canCustomize() {
        return canCustomize;
    }

    /**
     * Returns the max height for the totem
     *
     * @return The max height for the totem
     */
    @Override
    public int getAllowedMaxHeight() {
        return allowedMaxHeight;
    }

    /**
     * Returns a list of the unlocked parts of the totem
     *
     * @return A list of the unlocked parts of the totem
     */
    @Override
    public List<String> getUnlockedParts() {
        return unlockedParts;
    }

    /**
     * Returns a list of the selected parts of the totem
     *
     * @return A list of the selected parts of the totem
     */
    @Override
    public Map<String, String> getSelectedParts() {
        return selectedParts;
    }


    /**
     * Returns a list of the unlocked colors of the totem
     *
     * @return A list of the unlocked colors of the totem
     */
    @Override
    public List<String> getUnlockedColors() {
        return unlockedColors;
    }

    /**
     * Returns a list of the selected colors of the totem
     *
     * @return A list of the selected colors of the totem
     */
    @Override
    public Map<String, String> getSelectedColors() {
        return selectedColors ;
    }
}

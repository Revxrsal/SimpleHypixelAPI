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
package io.github.reflxction.hypixelapi.hypixel;

import java.util.List;
import java.util.Map;

/**
 * Represents an achievement totem
 */
public interface AchievementTotem {

    /**
     * Whether or not the totem can be customized
     *
     * @return Whether or not the totem can be customized
     */
    boolean canCustomize();

    /**
     * Returns the max height for the totem
     *
     * @return The max height for the totem
     */
    int getAllowedMaxHeight();

    /**
     * Returns a list of the unlocked parts of the totem
     *
     * @return A list of the unlocked parts of the totem
     */
    List<String> getUnlockedParts();

    /**
     * Returns a list of the selected parts of the totem
     *
     * @return A list of the selected parts of the totem
     */
    Map<String, String> getSelectedParts();

    /**
     * Returns a list of the unlocked colors of the totem
     *
     * @return A list of the unlocked colors of the totem
     */
    List<String> getUnlockedColors();

    /**
     * Returns a list of the selected colors of the totem
     *
     * @return A list of the selected colors of the totem
     */
    Map<String, String> getSelectedColors();

}

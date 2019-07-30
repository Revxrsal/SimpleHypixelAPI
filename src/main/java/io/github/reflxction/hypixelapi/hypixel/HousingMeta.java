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
import java.util.UUID;

/**
 * Contains all the Housing meta exposed in the API
 */
public interface HousingMeta {

    /**
     * Returns the housing packages
     *
     * @return The housing packages
     */
    List<String> getPackages();

    /**
     * Returns the allowed blocks in the housing, as in the "block ID:block data" format
     *
     * @return The allowed blocks
     */
    List<String> getAllowedBlocks();

    /**
     * Returns the tutorial step of the housing
     *
     * @return The tutorial step
     */
    String getTutorialStep();

    /**
     * Returns the housing settings
     *
     * @return The housing settings
     */
    HousingSettings getPlayerSettings();

    /**
     * Returns a list of UUIDs that were given cookies
     *
     * @return A list of UUIDs that were given cookies
     */
    List<UUID> getGivenCookies();

}

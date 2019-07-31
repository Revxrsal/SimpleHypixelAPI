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

import io.github.reflxction.hypixelapi.hypixel.HousingMeta;
import io.github.reflxction.hypixelapi.hypixel.HousingSettings;

import java.util.List;
import java.util.UUID;

/**
 * Class implementation for {@link HousingMeta}
 */
public class HousingMetaImpl implements HousingMeta {

    private List<String> packages;

    private List<String> allowedBlocks;

    private String tutorialStep;

    private HousingSettings playerSettings;

    private List<UUID> givenCookies;

    /**
     * Returns the housing packages
     *
     * @return The housing packages
     */
    @Override
    public List<String> getPackages() {
        return packages;
    }

    /**
     * Returns the allowed blocks in the housing, as in the "block ID:block data" format
     *
     * @return The allowed blocks
     */
    @Override
    public List<String> getAllowedBlocks() {
        return allowedBlocks;
    }

    /**
     * Returns the tutorial step of the housing
     *
     * @return The tutorial step
     */
    @Override
    public String getTutorialStep() {
        return tutorialStep;
    }

    /**
     * Returns the housing settings
     *
     * @return The housing settings
     */
    @Override
    public HousingSettings getPlayerSettings() {
        return playerSettings;
    }

    /**
     * Returns a list of UUIDs that were given cookies
     *
     * @return A list of UUIDs that were given cookies
     */
    @Override
    public List<UUID> getGivenCookies() {
        return givenCookies;
    }

    @Override
    public String toString() {
        return "HousingMetaImpl{" +
                "packages=" + packages +
                ", allowedBlocks=" + allowedBlocks +
                ", tutorialStep='" + tutorialStep + '\'' +
                ", playerSettings=" + playerSettings +
                ", givenCookies=" + givenCookies +
                '}';
    }
}

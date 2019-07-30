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

import io.github.reflxction.hypixelapi.core.utils.GameType;

import java.util.Date;
import java.util.UUID;

/**
 * Represents a game booster
 */
public interface Booster {

    /**
     * Returns the ID of the booster
     *
     * @return The booster ID
     */
    String getId();

    /**
     * Returns the UUID of the player who purchased this booster
     *
     * @return The UUID of the player who purchased this booster
     */
    UUID getPurchaserUUID();

    /**
     * Returns the booster multiplier
     *
     * @return The booster multiplier
     */
    double getMultiplier();

    /**
     * Returns the original length for the booster (e.g 1 day)
     *
     * @return The original booster length
     */
    long getOriginalLength();

    /**
     * Returns the game type of the booster
     *
     * @return The game type of the booster
     */
    GameType getGameType();

    /**
     * Returns the activation date of this booster
     *
     * @return The activation date of this booster
     */
    Date getActivationDate();

}

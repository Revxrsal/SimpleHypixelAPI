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
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.hypixel.Booster;

import java.util.Date;
import java.util.UUID;

/**
 * Class implementation for {@link Booster}
 */
public class BoosterImpl implements Booster {

    @SerializedName("_id")
    private String id;

    private UUID purchaserUuid;

    private int amount;

    private long originalLength;

    private GameType gameType;

    //private List<UUID> stacked;

    private Date dateActivated;

    /**
     * Returns the ID of the booster
     *
     * @return The booster ID
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Returns the UUID of the player who purchased this booster
     *
     * @return The UUID of the player who purchased this booster
     */
    @Override
    public UUID getPurchaserUUID() {
        return purchaserUuid;
    }

    /**
     * Returns the booster multiplier
     *
     * @return The booster multiplier
     */
    @Override
    public double getMultiplier() {
        return amount;
    }

    /**
     * Returns the original length for the booster (e.g 1 day)
     *
     * @return The original booster length
     */
    @Override
    public long getOriginalLength() {
        return originalLength;
    }

    /**
     * Returns the game type of the booster
     *
     * @return The game type of the booster
     */
    @Override
    public GameType getGameType() {
        return gameType;
    }

    /**
     * Returns the deactivation date of this booster
     *
     * @return The deactivation date of this booster
     */
    @Override
    public Date getActivationDate() {
        return dateActivated;
    }

}

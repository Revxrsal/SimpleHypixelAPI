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
import io.github.reflxction.hypixelapi.hypixel.HypixelKey;
import io.github.reflxction.hypixelapi.core.utils.UUIDUtils;

import java.util.UUID;

/**
 * Class implementation for {@link HypixelKey}
 */
public class HypixelKeyImpl implements HypixelKey {

    @SerializedName("ownerUuid")
    private String id;

    private String key;

    private int totalQueries;

    protected UUID ownerUUID;

    @SerializedName("queriesInPastMin")
    private int queriesInPastMinute;

    /**
     * Returns the UUID of the owner of this key
     *
     * @return The UUID of this key's owner
     */
    @Override
    public UUID getOwnerUUID() {
        return ownerUUID;
    }

    /**
     * Returns the key as a string
     *
     * @return The API key
     */
    @Override
    public String getKey() {
        return key;
    }

    /**
     * Returns the total queries since the creation of this API key
     *
     * @return The total queries.
     */
    @Override
    public int getTotalQueries() {
        return totalQueries;
    }

    /**
     * Returns the amount of queries in the last minute by this key
     *
     * @return The queries in the last minute
     */
    @Override
    public int getQueriesInLastMinute() {
        return queriesInPastMinute;
    }

    /**
     * Returns the original UUID. This gets converted to a {@link UUID} after deserializing
     *
     * @return The UUID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the owner UUID
     *
     * @return This object
     */
    public HypixelKey owner() {
        this.ownerUUID = UUIDUtils.fromString(id);
        return this;
    }

}

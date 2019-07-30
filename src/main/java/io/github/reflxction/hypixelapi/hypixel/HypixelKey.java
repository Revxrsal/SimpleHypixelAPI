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

import java.util.UUID;

/**
 * Contains all information exposed from the <i>key</i> command from the Hypixel API.
 */
public interface HypixelKey {

    /**
     * Returns the UUID of the owner of this key
     *
     * @return The UUID of this key's owner
     */
    UUID getOwnerUUID();

    /**
     * Returns the key as a string
     *
     * @return The API key
     */
    String getKey();

    /**
     * Returns the total queries since the creation of this API key
     *
     * @return The total queries.
     */
    int getTotalQueries();

    /**
     * Returns the amount of queries in the last minute by this key
     *
     * @return The queries in the last minute
     */
    int getQueriesInLastMinute();

}

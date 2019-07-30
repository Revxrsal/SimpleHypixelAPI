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
package io.github.reflxction.hypixelapi.guild;

import java.util.Date;

/**
 * Represents a guild rank
 *
 * @see Guild
 * @see GuildMember
 */
public interface GuildRank {

    /**
     * Returns the name of the rank
     *
     * @return The name of the rank
     */
    String getName();

    /**
     * Whether is the rank default or not (members get it automatically)
     *
     * @return Whether is the rank default or not
     */
    boolean isDefault();

    /**
     * Returns the tag of the rank
     *
     * @return The tag of the rank
     */
    String getTag();

    /**
     * Returns the creation date of this rank
     *
     * @return The creation date of this rank
     */
    Date getCreationDate();

    /**
     * Returns the priority of the rank (in /guild list and /guild online).
     *
     * @return The rank priority
     */
    int getPriority();

}

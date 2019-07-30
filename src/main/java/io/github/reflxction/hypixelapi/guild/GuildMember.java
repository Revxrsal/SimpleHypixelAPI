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
import java.util.UUID;

/**
 * Represents a guild member
 *
 * @see Guild
 * @see GuildRank
 */
public interface GuildMember {

    /**
     * Returns the member UUID
     *
     * @return The member UUID
     */
    UUID getUUID();

    /**
     * Returns the name of the member rank
     *
     * @return The name of the member rank
     */
    String getRank();

    /**
     * Returns the date the player joined at
     *
     * @return The date the player joined at
     */
    Date getJoiningDate();

    /**
     * Returns the total quest participation for this member
     *
     * @return the total quest participation for this member
     */
    int getQuestParticipation();

}

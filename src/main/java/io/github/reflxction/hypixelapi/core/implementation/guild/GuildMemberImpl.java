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
package io.github.reflxction.hypixelapi.core.implementation.guild;

import io.github.reflxction.hypixelapi.guild.GuildMember;

import java.util.Date;
import java.util.UUID;

/**
 * Class implementation for {@link GuildMember}
 */
public class GuildMemberImpl implements GuildMember {

    private UUID uuid;

    private String rank;

    private Date joined;

    private int questParticipation;

    /**
     * Returns the member UUID
     *
     * @return The member UUID
     */
    @Override
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Returns the name of the member rank
     *
     * @return The name of the member rank
     */
    @Override
    public String getRank() {
        return rank;
    }

    /**
     * Returns the date the player joined at
     *
     * @return The date the player joined at
     */
    @Override
    public Date getJoiningDate() {
        return joined;
    }

    /**
     * Returns the total quest participation for this member
     *
     * @return the total quest participation for this member
     */
    @Override
    public int getQuestParticipation() {
        return questParticipation;
    }
}

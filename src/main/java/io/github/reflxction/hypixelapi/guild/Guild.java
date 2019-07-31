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

import io.github.reflxction.hypixelapi.core.utils.GameType;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Represents a Hypixel guild
 *
 * @see GuildMember
 * @see GuildRank
 */
public interface Guild {

    /**
     * Returns the ID of the guild
     *
     * @return The guild ID
     */
    String getId();

    /**
     * Returns the guild name
     *
     * @return The guild name
     * @see #getNameLower()
     */
    String getName();

    /**
     * Returns the lowercase name of the guild. For the correct case, use {@link #getName()}
     *
     * @return The guild name in lower case
     * @see #getName()
     */
    String getNameLower();

    /**
     * Returns the current coins of the guild
     *
     * @return The current coins of the guild
     */
    int getCoins();

    /**
     * Returns the total coins gained by the guild from its creation time to now
     *
     * @return The total coins gained by the guild from its creation time to now
     */
    int getCoinsEver();

    /**
     * Returns the date this guild was created
     *
     * @return The creation date of this guild
     */
    Date getCreationDate();

    /**
     * Returns the list of guild members
     *
     * @return The list of guild members
     */
    List<GuildMember> getMembers();

    /**
     * Returns the guild banner
     *
     * @return The guild banner
     */
    GuildBanner getBanner();

    /**
     * Whether is the guild joinable (does not require an invitation to join) or not
     *
     * @return Whether is the guild joinable or not
     */
    boolean isJoinable();

    /**
     * Whether is the guild publicly listed or not
     *
     * @return Whether is the guild publicly listed or not
     */
    boolean isPubliclyListed();

    /**
     * Returns the guild tag
     *
     * @return The guild tag
     */
    String getTag();

    /**
     * Returns the achievements completed by the guild
     *
     * @return The achievements completed by the guild
     */
    Map<String, Integer> getAchievements();

    /**
     * Returns the current guild experience
     *
     * @return The current guild experience
     */
    long getExperience();

    /**
     * Returns a list of all guild ranks
     *
     * @return A list of all guild ranks
     */
    List<GuildRank> getRanks();

    /**
     * Returns the legacy rating for the guild
     *
     * @return The legacy rating
     */
    int getLegacyRating();

    /**
     * Returns The list of the preferred games of the guild, which are set by the guild master.
     *
     * @return The list of preferred games
     */
    List<GameType> getPreferredGames();

    /**
     * Returns the chat mute time (in minutes). 0 if the guild chat is not muted
     *
     * @return The chat mute time
     */
    long getChatMute();

    /**
     * Returns the guild description
     *
     * @return The guild description
     */
    String getDescription();

    /**
     * Returns the GEXP gained by every game
     *
     * @return The GEXP gained by every game
     */
    Map<GameType, Integer> getGuildExpByGameType();

}

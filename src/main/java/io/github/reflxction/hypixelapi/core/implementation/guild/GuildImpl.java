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

import com.google.gson.annotations.SerializedName;
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.guild.Guild;
import io.github.reflxction.hypixelapi.guild.GuildBanner;
import io.github.reflxction.hypixelapi.guild.GuildMember;
import io.github.reflxction.hypixelapi.guild.GuildRank;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Class implementation for {@link Guild}
 */
public class GuildImpl implements Guild {

    @SerializedName("_id")
    private String id;

    private String name, name_lower;

    private int coins;

    private int coinsEver;

    @SerializedName("created")
    private Date creationDate;

    private GuildBannerImpl banner;

    private List<GuildMember> members;

    private boolean joinable;

    private boolean publiclyListed;

    private String tag;

    Map<String, Integer> achievements;

    private long exp;

    private List<GuildRank> ranks;

    private int legacyRanking;

    private List<GameType> preferredGames;

    private long chatMute;

    private String tagColor;

    private String description;

    private Map<GameType, Integer> guildExpByGameType;

    /**
     * Returns the ID of the guild
     *
     * @return The guild ID
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Returns the guild name
     *
     * @return The guild name
     * @see #getNameLower()
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns the lowercase name of the guild. For the correct case, use {@link #getName()}
     *
     * @return The guild name in lower case
     * @see #getName()
     */
    @Override
    public String getNameLower() {
        return name_lower;
    }

    /**
     * Returns the current coins of the guild
     *
     * @return The current coins of the guild
     */
    @Override
    public int getCoins() {
        return coins;
    }

    /**
     * Returns the total coins gained by the guild from its creation time to now
     *
     * @return The total coins gained by the guild from its creation time to now
     */
    @Override
    public int getCoinsEver() {
        return coinsEver;
    }

    /**
     * Returns the date this guild was created
     *
     * @return The creation date of this guild
     */
    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Returns the list of guild members
     *
     * @return The list of guild members
     */
    @Override
    public List<GuildMember> getMembers() {
        return members;
    }

    /**
     * Returns the guild banner
     *
     * @return The guild banner
     */
    @Override
    public GuildBanner getBanner() {
        return banner;
    }

    /**
     * Whether is the guild joinable (does not require an invitation to join) or not
     *
     * @return Whether is the guild joinable or not
     */
    @Override
    public boolean isJoinable() {
        return joinable;
    }

    /**
     * Whether is the guild publicly listed or not
     *
     * @return Whether is the guild publicly listed or not
     */
    @Override
    public boolean isPubliclyListed() {
        return publiclyListed;
    }

    /**
     * Returns the guild tag
     *
     * @return The guild tag
     */
    @Override
    public String getTag() {
        return tag;
    }

    /**
     * Returns the achievements completed by the guild
     *
     * @return The achievements completed by the guild
     */
    @Override
    public Map<String, Integer> getAchievements() {
        return achievements;
    }

    /**
     * Returns the current guild experience
     *
     * @return The current guild experience
     */
    @Override
    public long getExperience() {
        return exp;
    }

    /**
     * Returns a list of all guild ranks
     *
     * @return A list of all guild ranks
     */
    @Override
    public List<GuildRank> getRanks() {
        return ranks;
    }

    /**
     * Returns the legacy rating for the guild
     *
     * @return The legacy rating
     */
    @Override
    public int getLegacyRating() {
        return legacyRanking;
    }

    /**
     * Returns The list of the preferred games of the guild, which are set by the guild master.
     *
     * @return The list of preferred games
     */
    @Override
    public List<GameType> getPreferredGames() {
        return preferredGames;
    }

    /**
     * Returns the chat mute time (in minutes). 0 if the guild chat is not muted
     *
     * @return The chat mute time
     */
    @Override
    public long getChatMute() {
        return chatMute;
    }

    /**
     * Returns the guild description
     *
     * @return The guild description
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * Returns the GEXP gained by every game
     *
     * @return The GEXP gained by every game
     */
    @Override
    public Map<GameType, Integer> getGuildExpByGameType() {
        return guildExpByGameType;
    }

    @Override
    public String toString() {
        return "GuildImpl{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", name_lower='" + name_lower + '\'' +
                ", coins=" + coins +
                ", coinsEver=" + coinsEver +
                ", creationDate=" + creationDate +
                ", banner=" + banner +
                ", members=" + members +
                ", joinable=" + joinable +
                ", publiclyListed=" + publiclyListed +
                ", tag='" + tag + '\'' +
                ", achievements=" + achievements +
                ", exp=" + exp +
                ", ranks=" + ranks +
                ", legacyRanking=" + legacyRanking +
                ", preferredGames=" + preferredGames +
                ", chatMute=" + chatMute +
                ", tagColor='" + tagColor + '\'' +
                ", description='" + description + '\'' +
                ", guildExpByGameType=" + guildExpByGameType +
                '}';
    }
}

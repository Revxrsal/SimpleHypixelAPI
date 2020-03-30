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
package io.github.reflxction.hypixelapi.core.implementation;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import io.github.reflxction.hypixelapi.HypixelAPI;
import io.github.reflxction.hypixelapi.core.http.RequestFactory;
import io.github.reflxction.hypixelapi.core.implementation.game.GameCountsResponseImpl;
import io.github.reflxction.hypixelapi.core.implementation.game.LeaderboardImpl;
import io.github.reflxction.hypixelapi.core.implementation.guild.GuildImpl;
import io.github.reflxction.hypixelapi.core.implementation.hypixel.BoosterImpl;
import io.github.reflxction.hypixelapi.core.implementation.hypixel.HypixelKeyImpl;
import io.github.reflxction.hypixelapi.core.implementation.hypixel.WatchdogStatisticsImpl;
import io.github.reflxction.hypixelapi.core.implementation.player.*;
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.game.GameCountsResponse;
import io.github.reflxction.hypixelapi.game.Leaderboard;
import io.github.reflxction.hypixelapi.guild.Guild;
import io.github.reflxction.hypixelapi.hypixel.Booster;
import io.github.reflxction.hypixelapi.hypixel.HypixelKey;
import io.github.reflxction.hypixelapi.hypixel.WatchdogStatistics;
import io.github.reflxction.hypixelapi.player.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static io.github.reflxction.hypixelapi.core.adapters.GsonProfiles.MAIN;

/**
 * Class implementation for {@link HypixelAPI}
 */
public class HypixelAPIImpl implements HypixelAPI {

    private static final Type BOOSTERS_TYPE = new TypeToken<List<BoosterImpl>>() {
    }.getType();

    private static final Type FRIENDS_TYPE = new TypeToken<List<FriendImpl>>() {
    }.getType();

    private static final Type LEADERBOARDS_TYPE = new TypeToken<Map<GameType, List<LeaderboardImpl>>>() {
    }.getType();

    private static final Type RECENT_GAMES_TYPE = new TypeToken<List<RecentGameImpl>>() {
    }.getType();

    private static final String SPACE_ENCODING = "%20";

    /**
     * The request factory
     */
    private final RequestFactory factory;

    /**
     * Initiates a new API instance
     *
     * @param apiKey The API key which sends requests
     */
    public HypixelAPIImpl(String apiKey) {
        factory = new RequestFactory(apiKey);
    }

    /**
     * Returns a list of all active boosters
     *
     * @return A list of all active boosters
     */
    @Override
    public List<Booster> getBoosters() {
        JsonObject object = factory.getBoosters();
        return MAIN.fromJson(object.get("boosters"), BOOSTERS_TYPE);
    }

    /**
     * Returns a {@link HypixelPlayer} from the given name
     *
     * @param name Player name
     * @return The player instance
     */
    @Override
    public HypixelPlayer getPlayer(String name) {
        return MAIN.fromJson(factory.getPlayerByName(name).get("player"), HypixelPlayerImpl.class);
    }

    /**
     * Returns a {@link HypixelPlayer} from the given UUID.
     *
     * @param uuid The player's UUID
     * @return The player instance
     */
    @Override
    public HypixelPlayer getPlayer(UUID uuid) {
        return MAIN.fromJson(factory.getPlayerByUUID(uuid.toString()).get("player"), HypixelPlayerImpl.class);
    }

    /**
     * Returns the ID of the given guild name. This can be used to fetch data from {@link #getGuild(String)} which takes
     * a String parameter (The guild ID)
     *
     * @param guildName Name of the guild to fetch the ID of.
     * @return The ID of the given guild name.
     */
    @Override
    public String getGuildId(String guildName) {
        return factory.getFindGuild(guildName.replace(" ", SPACE_ENCODING)).get("guild").getAsString();
    }

    /**
     * Returns the {@link Guild} of the specified player.
     *
     * @param playerUUID UUID of the player
     * @return The ID of the given guild name.
     */
    @Override
    public Guild getGuild(UUID playerUUID) {
        return MAIN.fromJson(factory.getGuild(playerUUID).get("guild"), GuildImpl.class);
    }

    /**
     * Returns a {@link Guild} from the given ID. IDs can be fetched from {@link #getGuildId(String)}
     *
     * @param guildID ID of the guild to fetch from
     * @return Name of the guild
     */
    @Override
    public Guild getGuild(String guildID) {
        return MAIN.fromJson(factory.getGuild(guildID).get("guild"), GuildImpl.class);
    }

    /**
     * Returns the list of friends of the given UUID
     *
     * @param uuid UUID to fetch from
     * @return The friends of the player
     */
    @Override
    public List<Friend> getFriends(UUID uuid) {
        return MAIN.fromJson(factory.getFriends(uuid.toString()).get("records").getAsJsonArray(), FRIENDS_TYPE);
    }

    /**
     * Returns information about the currently used API key such as total queries and the key owner.
     *
     * @return Information about the API key
     */
    @Override
    public HypixelKey getKey() {
        return MAIN.fromJson(factory.getKey().get("record"), HypixelKeyImpl.class).owner();
    }

    /**
     * Returns a map of all leaderboards of games
     *
     * @return A map of all leaderboards of games
     */
    @Override
    public Map<GameType, List<Leaderboard>> getLeaderboards() {
        return MAIN.fromJson(factory.getLeaderboards().get("leaderboards"), LEADERBOARDS_TYPE);
    }

    /**
     * Returns the total online players on the Hypixel Network.
     *
     * @return The total online players.
     */
    @Override
    public int getPlayerCount() {
        return factory.getPlayerCount().get("playerCount").getAsInt();
    }

    /**
     * Returns session information about the given UUID
     *
     * @param uuid UUID to fetch from
     * @return Session information
     */
    @Override
    public Session getSession(UUID uuid) {
        return MAIN.fromJson(factory.getSession(uuid.toString()).get("session"), SessionImpl.class);
    }

    /**
     * Returns Watchdog's statistics such as total bans by staff and total watchdog bans.
     *
     * @return Watchdog's statistics.
     */
    @Override
    public WatchdogStatistics getWatchdogStatistics() {
        JsonObject object = factory.getWatchdogStats();
        object.remove("success");
        return MAIN.fromJson(object, WatchdogStatisticsImpl.class);
    }

    @Override
    public PlayerStatus getStatus(UUID uuid) {
        return MAIN.fromJson(factory.getStatus(uuid.toString()).get("session"), PlayerStatusImpl.class);
    }

    /**
     * Returns recent games of a player. A maximum of 100 games are returned and recent
     * games are only stored for up to 3 days at this time.
     *
     * @param uuid UUID to fetch from
     * @return The player's latest game
     */
    @Override
    public List<RecentGame> getRecentGames(UUID uuid) {
        return MAIN.fromJson(factory.getRecentGames(uuid.toString()).get("games"), RECENT_GAMES_TYPE);
    }

    /**
     * Returns the game counts, each game with its sub-modes, with the number of players playing in each mode, and in each
     * sub-mode.
     *
     * @return The games counts
     */
    @Override
    public GameCountsResponse getGameCounts() {
        return new GameCountsResponseImpl(factory.getGameCounts());
    }
}

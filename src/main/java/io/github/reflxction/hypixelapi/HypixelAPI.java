/*
 * * Copyright 2018 github.com/ReflxctionDev
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
package io.github.reflxction.hypixelapi;

import io.github.reflxction.hypixelapi.core.http.RequestFactory;
import io.github.reflxction.hypixelapi.core.implementation.HypixelAPIImpl;
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.game.Leaderboard;
import io.github.reflxction.hypixelapi.guild.Guild;
import io.github.reflxction.hypixelapi.hypixel.Booster;
import io.github.reflxction.hypixelapi.hypixel.HypixelKey;
import io.github.reflxction.hypixelapi.hypixel.WatchdogStatistics;
import io.github.reflxction.hypixelapi.player.Friend;
import io.github.reflxction.hypixelapi.player.HypixelPlayer;
import io.github.reflxction.hypixelapi.player.Session;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * HypixelAPI: A full wrapper which allows access to all the exposed data in the Hypixel API endpoints.
 */
public interface HypixelAPI {

    /**
     * Returns a list of all active boosters
     *
     * @return A list of all active boosters
     */
    List<Booster> getBoosters();

    /**
     * Returns a {@link HypixelPlayer} from the given name
     *
     * @param name Player name
     * @return The player instance
     * @see #getPlayer(UUID)
     */
    HypixelPlayer getPlayer(String name);

    /**
     * Returns a {@link HypixelPlayer} from the given UUID.
     *
     * @param uuid The player's UUID
     * @return The player instance
     */
    HypixelPlayer getPlayer(UUID uuid);

    /**
     * Returns the ID of the given guild name. This can be used to fetch data from {@link #getGuild(String)} which takes
     * a String parameter (The guild ID)
     *
     * @param guildName Name of the guild to fetch the ID of.
     * @return The ID of the given guild name.
     */
    String getGuildId(String guildName);

    /**
     * Returns a {@link Guild} from the given ID. IDs can be fetched from {@link #getGuildId(String)}
     *
     * @param guildID ID of the guild to fetch from
     * @return Name of the guild
     */
    Guild getGuild(String guildID);

    /**
     * Returns the list of friends of the given UUID
     *
     * @param uuid UUID to fetch from
     * @return The friends of the player
     */
    List<Friend> getFriends(UUID uuid);

    /**
     * Returns information about the currently used API key such as total queries and the key owner.
     *
     * @return Information about the API key
     */
    HypixelKey getKey();

    /**
     * Returns a map of all leaderboards of games
     *
     * @return A map of all leaderboards of games
     */
    Map<GameType, List<Leaderboard>> getLeaderboards();

    /**
     * Returns the total online players on the Hypixel Network.
     *
     * @return The total online players.
     */
    int getPlayerCount();

    /**
     * Returns session information about the given UUID
     *
     * @param uuid UUID to fetch from
     * @return Session information
     */
    Session getSession(UUID uuid);

    /**
     * Returns Watchdog's statistics such as total bans by staff and total watchdog bans.
     *
     * @return Watchdog's statistics.
     */
    WatchdogStatistics getWatchdogStatistics();

    /**
     * Creates a new Hypixel API instance with the given API key
     *
     * @param apiKey API key to send requests on
     * @return The API instance
     */
    static HypixelAPI create(String apiKey) {
        return new HypixelAPIImpl(apiKey);
    }

    /**
     * Shuts the HTTP client down. Since the client is asynchronous, it should be closed to avoid using extra resources.
     * <p>
     * This is to be invoked on application shutdown.
     *
     * @throws IOException If there were exceptions while closing the request client
     */
    static void shutdown() throws IOException {
        RequestFactory.close();
    }
}

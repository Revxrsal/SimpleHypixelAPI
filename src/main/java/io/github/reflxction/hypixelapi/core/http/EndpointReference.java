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
package io.github.reflxction.hypixelapi.core.http;

/**
 * A simple utility which contains all endpoints reference for the Hypixel API.
 */
public class EndpointReference {

    /**
     * The base API endpoint
     */
    private static final String BASE_API_ENDPOINT = "https://api.hypixel.net/";

    /**
     * The API endpoint for boosters
     */
    private static final String BOOSTERS_ENDPOINT = BASE_API_ENDPOINT + "boosters?key=%s";

    /**
     * The API endpoint for getting guilds' IDs
     */
    private static final String FIND_GUILD_ENDPOINT = BASE_API_ENDPOINT + "findGuild?key=%s&byName=%s";

    /**
     * The API endpoint for getting guilds' IDs from player names
     */
    private static final String FIND_GUILD_UUID_ENDPOINT = BASE_API_ENDPOINT + "findGuild?key=%s&byUuid=%s";

    /**
     * The API endpoint for friends
     */
    private static final String FRIENDS_ENDPOINT = BASE_API_ENDPOINT + "friends?key=%s&uuid=%s";

    /**
     * The API endpoint for guilds
     */
    private static final String GUILD_ENDPOINT = BASE_API_ENDPOINT + "guild?key=%s&id=%s";

    /**
     * The API endpoint for keys
     */
    private static final String KEY_ENDPOINT = BASE_API_ENDPOINT + "key?key=%s";

    /**
     * The API endpoint for the leaderboards
     */
    private static final String LEADERBOARDS_ENDPOINT = BASE_API_ENDPOINT + "leaderboards?key=%s";

    /**
     * The API endpoint for player (which uses the name parameter)
     */
    private static final String PLAYER_BY_NAME_ENDPOINT = BASE_API_ENDPOINT + "player?key=%s&name=%s";

    /**
     * The API endpoint for player (which uses the UUID parameter)
     */
    private static final String PLAYER_BY_UUID_ENDPOINT = BASE_API_ENDPOINT + "player?key=%s&uuid=%s";

    /**
     * The API endpoint for fetching player counts
     */
    private static final String PLAYER_COUNT_ENDPOINT = BASE_API_ENDPOINT + "playerCount?key=%s";

    /**
     * The API endpoint for
     */
    private static final String SESSION_ENDPOINT = BASE_API_ENDPOINT + "session?key=%s&uuid=%s";

    /**
     * The API endpoint for boosters
     */
    private static final String WATCHDOG_ENDPOINT = BASE_API_ENDPOINT + "watchdogstats?key=%s";

    /**
     * Returns the API endpoint for fetching boosters, using the given key
     *
     * @param key Key to use
     * @return The formatted endpoint
     */
    public static String getBoostersEndpoint(String key) {
        return String.format(BOOSTERS_ENDPOINT, key);
    }

    /**
     * Returns the API endpoint for fetching guild IDs, using the given key and name
     *
     * @param key  Key to use
     * @param name Name of the guild
     * @return The formatted endpoint
     */
    public static String getFindGuildEndpoint(String key, String name) {
        return String.format(FIND_GUILD_ENDPOINT, key, name);
    }

    /**
     * Returns the API endpoint for fetching guild IDs, using the given key and name
     *
     * @param key  Key to use
     * @param uuid Name of the guild
     * @return The formatted endpoint
     */
    public static String getFindGuildByUUIDEndpoint(String key, String uuid) {
        return String.format(FIND_GUILD_UUID_ENDPOINT, key, uuid);
    }

    /**
     * Returns the API endpoint for fetching player friends, using the given key and UUID
     *
     * @param key  Key to use
     * @param uuid The player UUID
     * @return The formatted endpoint
     */
    public static String getFriendsEndpoint(String key, String uuid) {
        return String.format(FRIENDS_ENDPOINT, key, uuid);
    }

    /**
     * Returns the API endpoint for fetching guilds, using the given key and ID
     *
     * @param key Key to use
     * @param id  The guild ID
     * @return The formatted endpoint
     */
    public static String getGuildEndpoint(String key, String id) {
        return String.format(GUILD_ENDPOINT, key, id);
    }

    /**
     * Returns the API endpoint for fetching boosters, using the given key
     *
     * @param key Key to use
     * @return The formatted endpoint
     */
    public static String getKeyEndpoint(String key) {
        return String.format(KEY_ENDPOINT, key);
    }

    /**
     * Returns the API endpoint for fetching leaderboards, using the given key
     *
     * @param key Key to use
     * @return The formatted endpoint
     */
    public static String getLeaderboardsEndpoint(String key) {
        return String.format(LEADERBOARDS_ENDPOINT, key);
    }

    /**
     * Returns the API endpoint for retrieving player data, using the given key and the player name
     *
     * @param key  Key to use
     * @param name Name of the player
     * @return The formatted endpoint
     */
    public static String getPlayerByNameEndpoint(String key, String name) {
        return String.format(PLAYER_BY_NAME_ENDPOINT, key, name);
    }

    /**
     * Returns the API endpoint for retrieving player UUIDs, using the given key and the player UUID
     *
     * @param key  Key to use
     * @param uuid UUID of the player
     * @return The formatted endpoint
     */
    public static String getPlayerByUUIDEndpoint(String key, String uuid) {
        return String.format(PLAYER_BY_UUID_ENDPOINT, key, uuid);
    }

    /**
     * Returns the API endpoint for fetching the online players, using the given key
     *
     * @param key Key to use
     * @return The formatted endpoint
     */
    public static String getPlayerCountEndpoint(String key) {
        return String.format(PLAYER_COUNT_ENDPOINT, key);
    }


    /**
     * Returns the API endpoint for fetching sessions, using the given key and UUID
     *
     * @param key  Key to use
     * @param uuid UUID of the player
     * @return The formatted endpoint
     */
    public static String getSessionEndpoint(String key, String uuid) {
        return String.format(SESSION_ENDPOINT, key, uuid);
    }

    /**
     * Returns the API endpoint for fetching watchdog statistics, using the given key
     *
     * @param key Key to use
     * @return The formatted endpoint
     */
    public static String getWatchdogEndpoint(String key) {
        return String.format(WATCHDOG_ENDPOINT, key);
    }

}
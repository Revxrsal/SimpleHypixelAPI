/*
 * * Copyright 2019-2020 github.com/ReflxctionDev
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
package io.github.reflxction.hypixelapi.core.implementation.game;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import io.github.reflxction.hypixelapi.core.adapters.GsonProfiles;
import io.github.reflxction.hypixelapi.game.GameCount;
import io.github.reflxction.hypixelapi.game.GameCountsResponse;

import java.lang.reflect.Type;
import java.util.Map;

public class GameCountsResponseImpl implements GameCountsResponse {

    private static final Type GAMES_TYPE = new TypeToken<Map<String, GameCountImpl>>() {
    }.getType();

    private Map<String, GameCount> games;
    private int playerCount;

    public GameCountsResponseImpl(JsonObject data) {
        playerCount = data.get("playerCount").getAsInt();
        games = GsonProfiles.MAIN.fromJson(data.get("games"), GAMES_TYPE);
    }

    /**
     * Returns the game counts data of each game
     *
     * @return The game count
     */
    @Override
    public Map<String, GameCount> getGames() {
        return games;
    }

    /**
     * Returns the total amount of players playing in all games
     *
     * @return The total amount of players
     */
    @Override public int getPlayerCount() {
        return playerCount;
    }

    @Override public String toString() {
        return "GameCountsResponseImpl{" +
                "games=" + games +
                ", playerCount=" + playerCount +
                '}';
    }
}

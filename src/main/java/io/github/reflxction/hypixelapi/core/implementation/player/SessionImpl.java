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
package io.github.reflxction.hypixelapi.core.implementation.player;

import com.google.gson.annotations.SerializedName;
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.player.Session;

import java.util.List;
import java.util.UUID;

/**
 * Class implementation for {@link Session}
 */
public class SessionImpl implements Session {

    @SerializedName("_id")
    private String id;

    private GameType gameType;

    private String server;

    private List<UUID> players;

    /**
     * Returns the session ID
     *
     * @return The session ID
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Returns the current game type the player is playing
     *
     * @return The current game type
     */
    @Override
    public GameType getCurrentGameType() {
        return gameType;
    }

    /**
     * Returns the name of the server the player is playing on, e.g "mini98D".
     *
     * @return The name of the server
     */
    @Override
    public String getServer() {
        return server;
    }

    /**
     * Returns the list of players who are in this world as well
     *
     * @return The list of players who are in this world as well
     */
    @Override
    public List<UUID> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "SessionImpl{" +
                "id='" + id + '\'' +
                ", gameType=" + gameType +
                ", server='" + server + '\'' +
                ", players=" + players +
                '}';
    }
}

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
package io.github.reflxction.hypixelapi.player;

import io.github.reflxction.hypixelapi.core.utils.GameType;

import java.util.List;
import java.util.UUID;

/**
 * Represents a player session
 */
public interface Session {

    /**
     * Returns the session ID
     *
     * @return The session ID
     */
    String getId();

    /**
     * Returns the current game type the player is playing
     *
     * @return The current game type
     */
    GameType getCurrentGameType();

    /**
     * Returns the name of the server the player is playing on, e.g "mini98D".
     *
     * @return The name of the server
     */
    String getServer();

    /**
     * Returns the list of players who are in this world as well
     *
     * @return The list of players who are in this world as well
     */
    List<UUID> getPlayers();

}

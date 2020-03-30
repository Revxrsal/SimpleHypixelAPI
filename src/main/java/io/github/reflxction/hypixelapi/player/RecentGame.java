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
package io.github.reflxction.hypixelapi.player;

import io.github.reflxction.hypixelapi.core.utils.GameType;

import java.util.Date;

/**
 * Represents a recent game of a player. Games are stored up to 3 days, with a maximum of 100 games stored
 * per player.
 */
public interface RecentGame {

    /**
     * Returns the time and date of this game
     *
     * @return The game date
     */
    Date getGameTime();

    /**
     * Returns the game type of this game
     *
     * @return The game type
     */
    GameType getGameType();

    /**
     * Returns the mode of the game they are playing. For example, {@code "solo_insane"} would be
     * returned if they are playing Skywars Solo Insane.
     *
     * @return The game mode
     */
    String getMode();

    /**
     * Returns the map they are playing in.
     *
     * @return The map.
     */
    String getMap();

}

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
package io.github.reflxction.hypixelapi.core.implementation.player;

import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.player.RecentGame;

import java.util.Date;

public class RecentGameImpl implements RecentGame {

    private Date date;
    private GameType gameType;
    private String mode;
    private String map;

    /**
     * Returns the time and date of this game
     *
     * @return The game date
     */
    @Override public Date getGameTime() {
        return date;
    }

    /**
     * Returns the game type of this game
     *
     * @return The game type
     */
    @Override public GameType getGameType() {
        return gameType;
    }

    /**
     * Returns the mode of the game they are playing. For example, {@code "solo_insane"} would be
     * returned if they are playing Skywars Solo Insane.
     *
     * @return The game mode
     */
    @Override public String getMode() {
        return mode;
    }

    /**
     * Returns the map they are playing in.
     *
     * @return The map.
     */
    @Override public String getMap() {
        return map;
    }

    @Override public String toString() {
        return "RecentGameImpl{" +
                "date=" + date +
                ", gameType=" + gameType +
                ", mode='" + mode + '\'' +
                ", map='" + map + '\'' +
                '}';
    }
}

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

import io.github.reflxction.hypixelapi.game.GameCount;

import java.util.Map;

public class GameCountImpl implements GameCount {

    private Map<String, Integer> modes;
    private int players;

    /**
     * Returns a map which contains each sub-mode of this game type, as well as
     * the count of each sub-mode
     *
     * @return The modes with a count mapped to each sub-mode.
     */
    @Override
    public Map<String, Integer> getModes() {
        return modes;
    }

    /**
     * Returns the total amount of players in this game type
     *
     * @return The total players for the GameType
     */
    @Override public int getPlayers() {
        return players;
    }

    @Override public String toString() {
        return "GameCountImpl{" +
                "modes=" + modes +
                ", players=" + players +
                '}';
    }
}

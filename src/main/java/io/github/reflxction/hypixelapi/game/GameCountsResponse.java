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
package io.github.reflxction.hypixelapi.game;

import java.util.Map;

/**
 * Represents the total response of the {@code gameCounts} method.
 */
public interface GameCountsResponse {

    /**
     * Returns the game counts data of each game
     *
     * @return The game count
     */
    Map<String, GameCount> getGames();

    /**
     * Returns the total amount of players playing in all games
     *
     * @return The total amount of players
     */
    int getPlayerCount();

}

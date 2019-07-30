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
package io.github.reflxction.hypixelapi.game;

import java.util.List;
import java.util.UUID;

/**
 * Represents a game leaderboard
 */
public interface Leaderboard {

    /**
     * Returns the title of the leaderboard
     *
     * @return The title of the leaderboard
     */
    String getTitle();

    /**
     * Returns the leaderboard path (e.g wins in TNT run)
     *
     * @return The leaderboard path
     */
    String getPath();

    /**
     * Returns the leaderboard prefix (e.g "Overall")
     *
     * @return The leaderboard prefix
     */
    String getPrefix();

    /**
     * Returns the count of the leaderboard (???)
     *
     * @return The leaderboard count
     */
    int getCount();

    /**
     * Returns the X, Y and Z axises of the leaderboard, in "X,Y,Z" format. (e.g "2554,56,715")
     *
     * @return The location of the leaderboard
     */
    String getLocation();

    /**
     * Returns The list of UUIDs who are on the leaderboard
     *
     * @return The list of UUIDs who are on the leaderboard
     */
    List<UUID> getLeaders();

}

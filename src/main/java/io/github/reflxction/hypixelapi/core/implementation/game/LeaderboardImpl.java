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
package io.github.reflxction.hypixelapi.core.implementation.game;

import io.github.reflxction.hypixelapi.game.Leaderboard;

import java.util.List;
import java.util.UUID;

/**
 * Class implementation for {@link Leaderboard}
 */
public class LeaderboardImpl implements Leaderboard {

    private String title;

    private String path;

    private String prefix;

    private int count;

    private String location;

    private List<UUID> leaders;

    /**
     * Returns the title of the leaderboard
     *
     * @return The title of the leaderboard
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * Returns the leaderboard path (e.g wins in TNT run)
     *
     * @return The leaderboard path
     */
    @Override
    public String getPath() {
        return path;
    }

    /**
     * Returns the leaderboard prefix (e.g "Overall")
     *
     * @return The leaderboard prefix
     */
    @Override
    public String getPrefix() {
        return prefix;
    }

    /**
     * Returns the count of the leaderboard (???)
     *
     * @return The leaderboard count
     */
    @Override
    public int getCount() {
        return count;
    }

    /**
     * Returns the X, Y and Z axises of the leaderboard, in "X,Y,Z" format. (e.g "2554,56,715")
     *
     * @return The location of the leaderboard
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     * Returns The list of UUIDs who are on the leaderboard
     *
     * @return The list of UUIDs who are on the leaderboard
     */
    @Override
    public List<UUID> getLeaders() {
        return leaders;
    }

    @Override
    public String toString() {
        return "LeaderboardImpl{" +
                "title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", prefix='" + prefix + '\'' +
                ", count=" + count +
                ", location='" + location + '\'' +
                ", leaders=" + leaders +
                '}';
    }
}

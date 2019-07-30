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

import com.google.gson.annotations.SerializedName;
import io.github.reflxction.hypixelapi.game.TournamentData;

import java.util.Date;

/**
 * Class implementation for {@link TournamentData}
 */
public class TournamentDataImpl implements TournamentData {

    private int playtime;

    @SerializedName("tributes_earned")
    private int tributesEarned;

    @SerializedName("first_win")
    private Date firstWin;

    /**
     * Returns the playtime in minutes
     *
     * @return The playtime in minutes
     */
    @Override
    public int getPlaytime() {
        return playtime;
    }

    /**
     * Returns the total earned tributes in that tournament
     *
     * @return The total earned tributes
     */
    @Override
    public int getTributesEarned() {
        return tributesEarned;
    }

    /**
     * Returns the date of the first win
     *
     * @return The date of the first win
     */
    @Override
    public Date getFirstWin() {
        return firstWin;
    }
}

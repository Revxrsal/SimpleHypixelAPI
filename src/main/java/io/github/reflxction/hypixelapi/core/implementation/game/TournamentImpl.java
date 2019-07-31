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
import io.github.reflxction.hypixelapi.game.Tournament;
import io.github.reflxction.hypixelapi.game.TournamentData;

import java.util.Date;
import java.util.Map;

/**
 * Class implementation for {@link Tournament}
 */
public class TournamentImpl implements Tournament {

    @SerializedName("first_lobby_join")
    private Date firstLobbyJoin;

    private Map<String, TournamentData> tournamentData;

    @SerializedName("total_tributes")
    private int totalTributes;

    /**
     * Returns the date of joining a tournament lobby for the first time
     *
     * @return The date of joining a tournament lobby for the first time
     */
    @Override
    public Date getFirstLobbyJoin() {
        return firstLobbyJoin;
    }

    /**
     * Returns the tournament data such as the playtime, tributes earned, etc.
     *
     * @return The tournament data
     */
    @Override
    public Map<String, TournamentData> getTournamentData() {
        return tournamentData;
    }

    /**
     * Returns the totally gained tributes from the tournaments
     *
     * @return The totally gained tributes from the tournaments
     */
    @Override
    public int getTotalTributes() {
        return totalTributes;
    }

    @Override
    public String toString() {
        return "TournamentImpl{" +
                "firstLobbyJoin=" + firstLobbyJoin +
                ", tournamentData=" + tournamentData +
                ", totalTributes=" + totalTributes +
                '}';
    }
}

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

import java.util.Date;
import java.util.Map;

/**
 * Contains tournament information exposed in the API
 */
public interface Tournament {

    /**
     * Returns the date of joining a tournament lobby for the first time
     *
     * @return The date of joining a tournament lobby for the first time
     */
    Date getFirstLobbyJoin();

    /**
     * Returns the tournament data such as the playtime, tributes earned, etc.
     *
     * The String parameter is the tournament name, e.g "bedwars4s_0", and the {@link TournamentData} is the information
     *
     * @return The tournament data
     */
    Map<String, TournamentData> getTournamentData();

    /**
     * Returns the totally gained tributes from the tournaments
     *
     * @return The totally gained tributes from the tournaments
     */
    int getTotalTributes();

}

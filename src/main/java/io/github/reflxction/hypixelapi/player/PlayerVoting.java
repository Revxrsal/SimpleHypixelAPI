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

import java.util.Date;

/**
 * Contains all the voting information of the player
 */
public interface PlayerVoting {

    /**
     * Returns the total votes done by the player
     *
     * @return The total votes
     */
    int getTotal();

    /**
     * Returns the total votes from MinecraftServers.org
     *
     * @return The total votes from MinecraftServers.org
     */
    int getTotalMCSorg();

    /**
     * ???
     *
     * @return ???
     */
    int getSecondaryMCSorg();

    /**
     * Returns the date the player last voted on MinecraftServers.org
     *
     * @return The date the player last voted on MinecraftServers.org
     */
    Date getLastMCSorg();

    /**
     * Returns the date the player last voted
     *
     * @return The date the player last voted
     */
    Date getLastVote();

    /**
     * Returns the amount of votes done by the player today
     *
     * @return ???
     */
    int getVotesToday();

}

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
package io.github.reflxction.hypixelapi.core.implementation.player;

import com.google.gson.annotations.SerializedName;
import io.github.reflxction.hypixelapi.player.PlayerVoting;

import java.util.Date;

/**
 * Class implementation for {@link PlayerVoting}
 */
public class PlayerVotingImpl implements PlayerVoting {

    private int total;

    @SerializedName("total_mcsorg")
    private int totalMcsorg;

    @SerializedName("secondary_mcsorg")
    private int secondaryMcsorg;

    @SerializedName("last_mcsorg")
    private Date lastMcsorg;

    @SerializedName("last_vote")
    private Date lastVote;

    private int votesToday;

    /**
     * Returns the total votes done by the player
     *
     * @return The total votes
     */
    @Override
    public int getTotal() {
        return total;
    }

    /**
     * Returns the total votes from MinecraftServers.org
     *
     * @return The total votes from MinecraftServers.org
     */
    @Override
    public int getTotalMCSorg() {
        return totalMcsorg;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public int getSecondaryMCSorg() {
        return secondaryMcsorg;
    }

    /**
     * Returns the date the player last voted on MinecraftServers.org
     *
     * @return The date the player last voted on MinecraftServers.org
     */
    @Override
    public Date getLastMCSorg() {
        return lastMcsorg;
    }

    /**
     * Returns the date the player last voted
     *
     * @return The date the player last voted
     */
    @Override
    public Date getLastVote() {
        return lastVote;
    }

    /**
     * Returns the amount of votes done by the player today
     *
     * @return ???
     */
    @Override
    public int getVotesToday() {
        return votesToday;
    }

    @Override
    public String toString() {
        return "PlayerVotingImpl{" +
                "total=" + total +
                ", totalMcsorg=" + totalMcsorg +
                ", secondaryMcsorg=" + secondaryMcsorg +
                ", lastMcsorg=" + lastMcsorg +
                ", lastVote=" + lastVote +
                ", votesToday=" + votesToday +
                '}';
    }
}

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
package io.github.reflxction.hypixelapi.statistics

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Represents all the *Paintball* statistics of a player.
 */
class PaintballStatistics {

    val adrenaline: Int = 0

    val coins: Int = 0

    val deaths: Int = 0

    val endurance: Int = 0

    @SerializedName("forcefieldTime")
    val forcefieldtime: Int = 0

    val fortune: Int = 0

    val godfather: Int = 0

    val kills: Int = 0

    val killstreaks: Int = 0

    val packages: List<String> = Collections.emptyList()

    @SerializedName("shots_fired")
    val shotsFired: Int = 0

    val superluck: Int = 0

    val transfusion: Int = 0

    val wins: Int = 0

    @SerializedName("votes_Outback")
    val votesOutback: Int = 0

    @SerializedName("votes_Herobrine")
    val votesHerobrine: Int = 0

    @SerializedName("votes_Victorian")
    val votesVictorian: Int = 0

    @SerializedName("votes_Juice")
    val votesJuice: Int = 0

    @SerializedName("votes_Boletus")
    val votesBoletus: Int = 0

    @SerializedName("votes_Mansion")
    val votesMansion: Int = 0

    @SerializedName("votes_Swamps")
    val votesSwamps: Int = 0

    @SerializedName("votes_LaLaLand")
    val votesLalaland: Int = 0

    @SerializedName("votes_Market")
    val votesMarket: Int = 0

    @SerializedName("votes_Egypt")
    val votesEgypt: Int = 0

    @SerializedName("votes_Octagon")
    val votesOctagon: Int = 0

    @SerializedName("votes_Babyland")
    val votesBabyland: Int = 0

    @SerializedName("votes_Courtyard")
    val votesCourtyard: Int = 0

    @SerializedName("votes_Oh Canada!")
    val votesOhCanada: Int = 0

    @SerializedName("weekly_kills_a")
    val weeklyKillsA: Int = 0

    @SerializedName("monthly_kills_a")
    val monthlyKillsA: Int = 0

    @SerializedName("weekly_kills_b")
    val weeklyKillsB: Int = 0

    @SerializedName("monthly_kills_b")
    val monthlyKillsB: Int = 0

    @SerializedName("votes_Siege")
    val votesSiege: Int = 0

    val hat: String = ""

}

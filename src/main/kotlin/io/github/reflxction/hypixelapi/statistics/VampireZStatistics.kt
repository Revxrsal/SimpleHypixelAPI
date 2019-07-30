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
 * Represents all the *VampireZ* statistics of a player.
 */
class VampireZStatistics {

    val blood: Boolean = false

    val coins: Int = 0

    @SerializedName("gold_booster")
    val goldBooster: Int = 0

    @SerializedName("gold_starter")
    val goldStarter: Int = 0

    @SerializedName("human_deaths")
    val humanDeaths: Int = 0

    @SerializedName("human_kills")
    val humanKills: Int = 0

    @SerializedName("human_wins")
    val humanWins: Int = 0

    @SerializedName("vampire_deaths")
    val vampireDeaths: Int = 0

    @SerializedName("vampire_kills")
    val vampireKills: Int = 0

    @SerializedName("zombie_kills")
    val zombieKills: Int = 0

    val fireproofing: Int = 0

    @SerializedName("most_vampire_kills")
    val mostVampireKills: Int = 0

    val transfusion: Int = 0

    @SerializedName("zombie_doubler")
    val zombieDoubler: Int = 0

    @SerializedName("vampire_doubler")
    val vampireDoubler: Int = 0

    @SerializedName("baby_hater")
    val babyHater: Int = 0

    @SerializedName("explosive_killer")
    val explosiveKiller: Int = 0

    @SerializedName("advanced_swag")
    val advancedSwag: Int = 0

    val packages: List<String> = Collections.emptyList()

    val constitution: Int = 0

    @SerializedName("wave_booster")
    val waveBooster: Int = 0

    @SerializedName("kill_booster")
    val killBooster: Int = 0

    @SerializedName("drain_punch")
    val drainPunch: Int = 0

    @SerializedName("terror_level")
    val terrorLevel: Int = 0

    @SerializedName("final_breath")
    val finalBreath: Int = 0

    @SerializedName("blood_drinker")
    val bloodDrinker: Int = 0

    @SerializedName("vampiric_scream")
    val vampiricScream: Int = 0

    val hellborn: Int = 0

    @SerializedName("blood_booster")
    val bloodBooster: Int = 0

    @SerializedName("vampiric_minion")
    val vampiricMinion: Int = 0

    @SerializedName("loot_drops")
    val lootDrops: Int = 0

    @SerializedName("basic_swag")
    val basicSwag: Int = 0

    @SerializedName("expert_swag")
    val expertSwag: Int = 0

    val renfield: Int = 0

    @SerializedName("votes_Erias")
    val votesErias: Int = 0

    @SerializedName("votes_Village")
    val votesVillage: Int = 0

    @SerializedName("monthly_human_wins_a")
    val monthlyHumanWinsA: Int = 0

    @SerializedName("weekly_human_wins_a")
    val weeklyHumanWinsA: Int = 0

    @SerializedName("votes_Plundered")
    val votesPlundered: Int = 0

    @SerializedName("weekly_human_wins_b")
    val weeklyHumanWinsB: Int = 0

    @SerializedName("van_helsing")
    val vanHelsing: Int = 0

    @SerializedName("votes_Church")
    val votesChurch: Int = 0

    @SerializedName("votes_Cavern")
    val votesCavern: Int = 0

    @SerializedName("monthly_human_wins_b")
    val monthlyHumanWinsB: Int = 0

    val foresight: Int = 0

    val theology: Int = 0

    @SerializedName("votes_Dark Valley")
    val votesDarkValley: Int = 0

    @SerializedName("votes_Overhill")
    val votesOverhill: Int = 0

    @SerializedName("votes_Kudong")
    val votesKudong: Int = 0

    @SerializedName("votes_Pyramids")
    val votesPyramids: Int = 0

    @SerializedName("gold_bought")
    val goldBought: Int = 0

    @SerializedName("combatTracker")
    val combattracker: Boolean = false

    @SerializedName("frankensteins_monster")
    val frankensteinsMonster: Int = 0

    @SerializedName("monthly_vampire_wins_b")
    val monthlyVampireWinsB: Int = 0

    @SerializedName("weekly_vampire_wins_b")
    val weeklyVampireWinsB: Int = 0

    @SerializedName("weekly_vampire_wins_a")
    val weeklyVampireWinsA: Int = 0

    @SerializedName("monthly_vampire_wins_a")
    val monthlyVampireWinsA: Int = 0

    @SerializedName("updated_stats")
    val updatedStats: Boolean = false

    @SerializedName("vampire_wins")
    val vampireWins: Int = 0

    @SerializedName("no_starting_compass")
    val noStartingCompass: Boolean = false

    @SerializedName("no_starting_gear")
    val noStartingGear: Boolean = false

    @SerializedName("vamp_color")
    val vampColor: String = ""
}

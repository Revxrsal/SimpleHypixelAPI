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
 * Represents all the *Arena Brawl* statistics of a player.
 */
@StatisticName("Arena")
class ArenaStatistics {

    val rating: Int = 0

    @SerializedName("win_streaks_4v4")
    val winStreaks4v4: Int = 0

    @SerializedName("games_4v4")
    val games4v4: Int = 0

    val coins: Int = 0

    @SerializedName("deaths_4v4")
    val deaths4v4: Int = 0

    @SerializedName("losses_4v4")
    val losses4v4: Int = 0

    @SerializedName("damage_4v4")
    val damage4v4: Int = 0

    @SerializedName("win_streaks_2v2")
    val winStreaks2v2: Int = 0

    @SerializedName("deaths_2v2")
    val deaths2v2: Int = 0

    @SerializedName("losses_2v2")
    val losses2v2: Int = 0

    @SerializedName("damage_2v2")
    val damage2v2: Int = 0

    @SerializedName("healed_2v2")
    val healed2v2: Int = 0

    @SerializedName("games_2v2")
    val games2v2: Int = 0

    @SerializedName("games_1v1")
    val games1v1: Int = 0

    @SerializedName("win_streaks_1v1")
    val winStreaks1v1: Int = 0

    @SerializedName("wins_1v1")
    val wins1v1: Int = 0

    val packages: List<String> = Collections.emptyList()

    val offensive: String = ""

    @SerializedName("deaths_1v1")
    val deaths1v1: Int = 0

    @SerializedName("damage_1v1")
    val damage1v1: Int = 0

    @SerializedName("losses_1v1")
    val losses1v1: Int = 0

    @SerializedName("healed_4v4")
    val healed4v4: Int = 0

    @SerializedName("wins_4v4")
    val wins4v4: Int = 0

    @SerializedName("kills_2v2")
    val kills2v2: Int = 0

    @SerializedName("wins_2v2")
    val wins2v2: Int = 0

    @SerializedName("kills_4v4")
    val kills4v4: Int = 0

    @SerializedName("coins_spent")
    val coinsSpent: Int = 0

    val keys: Int = 0

    @SerializedName("magical_chest")
    val magicalChest: Int = 0

    val utility: String = ""

    @SerializedName("kills_1v1")
    val kills1v1: Int = 0

    @SerializedName("healed_1v1")
    val healed1v1: Int = 0

    val support: String = ""

    val penalty: Int = 0

    @SerializedName("selected_sword")
    val selectedSword: String = ""

    val ultimate: String = ""

    @SerializedName("lvl_damage")
    val lvlDamage: Int = 0

    @SerializedName("lvl_health")
    val lvlHealth: Int = 0

    @SerializedName("lvl_energy")
    val lvlEnergy: Int = 0

    @SerializedName("lvl_cooldown")
    val lvlCooldown: Int = 0

    @SerializedName("rune_level_energy")
    val runeLevelEnergy: Int = 0

    @SerializedName("rune_level_speed")
    val runeLevelSpeed: Int = 0

    @SerializedName("rune_level_slowing")
    val runeLevelSlowing: Int = 0

    @SerializedName("rune_level_damage")
    val runeLevelDamage: Int = 0

    val wins: Int = 0

    @SerializedName("pregame_armor")
    val pregameArmor: Boolean = false

    @SerializedName("rune_level_tank")
    val runeLevelTank: Int = 0

    @SerializedName("shortened_prefix")
    val shortenedPrefix: Boolean = false

    @SerializedName("active_melee_trail")
    val activeMeleeTrail: String = ""

    @SerializedName("active_kill_effect")
    val activeKillEffect: String = ""

    @SerializedName("Arena_arena_rating_11_18_rating")
    val arenaArenaRating1118Rating: Int = 0

    @SerializedName("Arena_arena_rating_11_18_position")
    val arenaArenaRating1118Position: Int = 0

    @SerializedName("prefix_color")
    val prefixColor: String = ""

    @SerializedName("Arena_arena_rating_12_18_position")
    val arenaArenaRating1218Position: Int = 0

    @SerializedName("Arena_arena_rating_12_18_rating")
    val arenaArenaRating1218Rating: Int = 0

    val hat: String = ""

    @SerializedName("Arena_arena_rating_1_19_rating")
    val arenaArenaRating119Rating: Int = 0

    @SerializedName("Arena_arena_rating_1_19_position")
    val arenaArenaRating119Position: Int = 0

    @SerializedName("active_rune")
    val activeRune: String = ""

    @SerializedName("Arena_arena_rating_2_19_rating")
    val arenaArenaRating219Rating: Int = 0

    @SerializedName("Arena_arena_rating_2_19_position")
    val arenaArenaRating219Position: Int = 0

    @SerializedName("Arena_arena_rating_3_19_rating")
    val arenaArenaRating319Rating: Int = 0

    @SerializedName("Arena_arena_rating_3_19_position")
    val arenaArenaRating319Position: Int = 0

    @SerializedName("Arena_arena_rating_4_19_rating")
    val arenaArenaRating419Rating: Int = 0

    @SerializedName("Arena_arena_rating_4_19_position")
    val arenaArenaRating419Position: Int = 0

    @SerializedName("Arena_arena_rating_5_19_position")
    val arenaArenaRating519Position: Int = 0

    @SerializedName("Arena_arena_rating_5_19_rating")
    val arenaArenaRating519Rating: Int = 0

    @SerializedName("Arena_arena_rating_6_19_rating")
    val arenaArenaRating619Rating: Int = 0

    @SerializedName("Arena_arena_rating_6_19_position")
    val arenaArenaRating619Position: Int = 0
}

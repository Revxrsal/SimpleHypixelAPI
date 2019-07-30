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
 * Represents all the *Turbo Kart Racers* statistics of a player.
 */
@StatisticName("GingerBread")
class TKRStatistics {

    @SerializedName("frame_active")
    val frameActive: String = ""

    @SerializedName("engine_active")
    val engineActive: String = ""

    @SerializedName("booster_active")
    val boosterActive: String = ""

    @SerializedName("helmet_active")
    val helmetActive: String = ""

    val packages: List<String> = Collections.emptyList()

    @SerializedName("jacket_active")
    val jacketActive: String = ""

    @SerializedName("shoes_active")
    val shoesActive: String = ""

    @SerializedName("pants_active")
    val pantsActive: String = ""

    @SerializedName("skin_active")
    val skinActive: String = ""

    val horn: String = ""

    @SerializedName("box_pickups")
    val boxPickups: Int = 0

    @SerializedName("laps_completed")
    val lapsCompleted: Int = 0

    @SerializedName("coins_picked_up")
    val coinsPickedUp: Int = 0

    val coins: Int = 0

    @SerializedName("banana_hits_received")
    val bananaHitsReceived: Int = 0

    val parts: String = ""

    @SerializedName("banana_hits_sent")
    val bananaHitsSent: Int = 0

    @SerializedName("silver_trophy")
    val silverTrophy: Int = 0

    val wins: Int = 0

    @SerializedName("blue_torpedo_hit")
    val blueTorpedoHit: Int = 0

    @SerializedName("gold_trophy")
    val goldTrophy: Int = 0

    @SerializedName("bronze_trophy")
    val bronzeTrophy: Int = 0

    @SerializedName("gold_trophy_canyon")
    val goldTrophyCanyon: Int = 0

    @SerializedName("silver_trophy_weekly_b")
    val silverTrophyWeeklyB: Int = 0

    @SerializedName("silver_trophy_monthly_b")
    val silverTrophyMonthlyB: Int = 0

    @SerializedName("silver_trophy_canyon")
    val silverTrophyCanyon: Int = 0

    @SerializedName("bronze_trophy_weekly_b")
    val bronzeTrophyWeeklyB: Int = 0

    @SerializedName("bronze_trophy_monthly_b")
    val bronzeTrophyMonthlyB: Int = 0

    @SerializedName("bronze_trophy_canyon")
    val bronzeTrophyCanyon: Int = 0

    @SerializedName("box_pickups_weekly_a")
    val boxPickupsWeeklyA: Int = 0

    @SerializedName("box_pickups_weekly_b")
    val boxPickupsWeeklyB: Int = 0

    @SerializedName("box_pickups_monthly_b")
    val boxPickupsMonthlyB: Int = 0

    @SerializedName("box_pickups_olympus")
    val boxPickupsOlympus: Int = 0

    @SerializedName("box_pickups_junglerush")
    val boxPickupsJunglerush: Int = 0

    @SerializedName("box_pickups_hypixelgp")
    val boxPickupsHypixelgp: Int = 0

    @SerializedName("box_pickups_retro")
    val boxPickupsRetro: Int = 0

    @SerializedName("box_pickups_canyon")
    val boxPickupsCanyon: Int = 0

    @SerializedName("olympus_plays")
    val olympusPlays: Int = 0

    @SerializedName("junglerush_plays")
    val junglerushPlays: Int = 0

    @SerializedName("hypixelgp_plays")
    val hypixelgpPlays: Int = 0

    @SerializedName("retro_plays")
    val retroPlays: Int = 0

    @SerializedName("canyon_plays")
    val canyonPlays: Int = 0

    @SerializedName("particle_trail")
    val particleTrail: String = ""

    @SerializedName("bronze_trophy_weekly_a")
    val bronzeTrophyWeeklyA: Int = 0

    @SerializedName("silver_trophy_weekly_a")
    val silverTrophyWeeklyA: Int = 0

    @SerializedName("box_pickups_monthly_a")
    val boxPickupsMonthlyA: Int = 0

    @SerializedName("silver_trophy_monthly_a")
    val silverTrophyMonthlyA: Int = 0

    @SerializedName("bronze_trophy_monthly_a")
    val bronzeTrophyMonthlyA: Int = 0

    @SerializedName("bronze_trophy_junglerush")
    val bronzeTrophyJunglerush: Int = 0

    @SerializedName("silver_trophy_olympus")
    val silverTrophyOlympus: Int = 0

    @SerializedName("gold_trophy_junglerush")
    val goldTrophyJunglerush: Int = 0

    @SerializedName("gold_trophy_hypixelgp")
    val goldTrophyHypixelgp: Int = 0

    @SerializedName("bronze_trophy_retro")
    val bronzeTrophyRetro: Int = 0

    @SerializedName("gold_trophy_olympus")
    val goldTrophyOlympus: Int = 0

    @SerializedName("silver_trophy_junglerush")
    val silverTrophyJunglerush: Int = 0

    @SerializedName("silver_trophy_hypixelgp")
    val silverTrophyHypixelgp: Int = 0

    @SerializedName("silver_trophy_retro")
    val silverTrophyRetro: Int = 0

    @SerializedName("gold_trophy_retro")
    val goldTrophyRetro: Int = 0

    @SerializedName("bronze_trophy_hypixelgp")
    val bronzeTrophyHypixelgp: Int = 0

    @SerializedName("bronze_trophy_olympus")
    val bronzeTrophyOlympus: Int = 0

    @SerializedName("gold_trophy_monthly_b")
    val goldTrophyMonthlyB: Int = 0

    @SerializedName("gold_trophy_weekly_b")
    val goldTrophyWeeklyB: Int = 0

    @SerializedName("gold_trophy_weekly_a")
    val goldTrophyWeeklyA: Int = 0

    @SerializedName("gold_trophy_monthly_a")
    val goldTrophyMonthlyA: Int = 0

    @SerializedName("lobby_resource_pack")
    val lobbyResourcePack: Boolean = false

    @SerializedName("grand_prix")
    val grandPrix: Boolean = false

    @SerializedName("grand_prix_tokens")
    val grandPrixTokens: Int = 0

    @SerializedName("GingerBread_tkr_points__10_2018_position")
    val gingerbreadTkrPoints102018Position: Int = 0

    @SerializedName("GingerBread_tkr_points__10_2018_points")
    val gingerbreadTkrPoints102018Points: Int = 0

    @SerializedName("GingerBread_tkr_points__11_2018_position")
    val gingerbreadTkrPoints112018Position: Int = 0

    @SerializedName("GingerBread_tkr_points__11_2018_points")
    val gingerbreadTkrPoints112018Points: Int = 0

    @SerializedName("GingerBread_tkr_points__12_2018_position")
    val gingerbreadTkrPoints122018Position: Int = 0

    @SerializedName("GingerBread_tkr_points__12_2018_points")
    val gingerbreadTkrPoints122018Points: Int = 0

    @SerializedName("GingerBread_tkr_points__1_2019_points")
    val gingerbreadTkrPoints12019Points: Int = 0

    @SerializedName("GingerBread_tkr_points__1_2019_position")
    val gingerbreadTkrPoints12019Position: Int = 0

    @SerializedName("GingerBread_tkr_points__2_2019_position")
    val gingerbreadTkrPoints22019Position: Int = 0

    @SerializedName("GingerBread_tkr_points__2_2019_points")
    val gingerbreadTkrPoints22019Points: Int = 0

    @SerializedName("GingerBread_tkr_points__3_2019_position")
    val gingerbreadTkrPoints32019Position: Int = 0

    @SerializedName("GingerBread_tkr_points__3_2019_points")
    val gingerbreadTkrPoints32019Points: Int = 0

    @SerializedName("GingerBread_tkr_points__4_2019_position")
    val gingerbreadTkrPoints42019Position: Int = 0

    @SerializedName("GingerBread_tkr_points__4_2019_points")
    val gingerbreadTkrPoints42019Points: Int = 0

    @SerializedName("GingerBread_tkr_points__5_2019_position")
    val gingerbreadTkrPoints52019Position: Int = 0

    @SerializedName("GingerBread_tkr_points__5_2019_points")
    val gingerbreadTkrPoints52019Points: Int = 0

    @SerializedName("GingerBread_tkr_points__6_2019_points")
    val gingerbreadTkrPoints62019Points: Int = 0

    @SerializedName("GingerBread_tkr_points__6_2019_position")
    val gingerbreadTkrPoints62019Position: Int = 0

}

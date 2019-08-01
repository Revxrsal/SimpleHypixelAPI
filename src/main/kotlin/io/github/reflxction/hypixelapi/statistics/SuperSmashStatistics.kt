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
 * Represents all the *Super Smash Heroes* statistics of a player.
 */
class SuperSmashStatistics {

    @SerializedName("lastLevel_THE_BULK")
    val lastlevelTheBulk: Int = 0

    @SerializedName("active_class")
    val activeClass: String = ""

    @SerializedName("win_streak")
    val winStreak: Int = 0

    @SerializedName("class_stats")
    val classStats: Map<String, Any> = Collections.emptyMap()

    @SerializedName("deaths_2v2")
    val deaths2v2: Int = 0

    @SerializedName("damage_dealt")
    val damageDealt: Int = 0

    @SerializedName("losses_2v2")
    val losses2v2: Int = 0

    @SerializedName("losses_weekly_a")
    val lossesWeeklyA: Int = 0

    @SerializedName("games_weekly_a")
    val gamesWeeklyA: Int = 0

    @SerializedName("losses_monthly_b")
    val lossesMonthlyB: Int = 0

    val losses: Int = 0

    @SerializedName("games_2v2")
    val games2v2: Int = 0

    @SerializedName("games_monthly_b")
    val gamesMonthlyB: Int = 0

    @SerializedName("smashed_2v2")
    val smashed2v2: Int = 0

    @SerializedName("damage_dealt_2v2")
    val damageDealt2v2: Int = 0

    val smashed: Int = 0

    val deaths: Int = 0

    val games: Int = 0

    val coins: Int = 0

    @SerializedName("kills_monthly_b")
    val killsMonthlyB: Int = 0

    val kills: Int = 0

    @SerializedName("losses_normal")
    val lossesNormal: Int = 0

    @SerializedName("kills_weekly_a")
    val killsWeeklyA: Int = 0

    @SerializedName("smashed_normal")
    val smashedNormal: Int = 0

    val quits: Int = 0

    @SerializedName("deaths_normal")
    val deathsNormal: Int = 0

    @SerializedName("games_normal")
    val gamesNormal: Int = 0

    @SerializedName("kills_normal")
    val killsNormal: Int = 0

    @SerializedName("damage_dealt_normal")
    val damageDealtNormal: Int = 0

    @SerializedName("damage_dealt_teams")
    val damageDealtTeams: Int = 0

    val smasher: Int = 0

    @SerializedName("losses_teams")
    val lossesTeams: Int = 0

    @SerializedName("smashed_teams")
    val smashedTeams: Int = 0

    @SerializedName("kills_teams")
    val killsTeams: Int = 0

    @SerializedName("smasher_teams")
    val smasherTeams: Int = 0

    @SerializedName("deaths_teams")
    val deathsTeams: Int = 0

    @SerializedName("games_teams")
    val gamesTeams: Int = 0

    @SerializedName("xp_THE_BULK")
    val xpTheBulk: Int = 0

    @SerializedName("kills_2v2")
    val kills2v2: Int = 0

    @SerializedName("smasher_2v2")
    val smasher2v2: Int = 0

    val smashLevel: Int = 0

    @SerializedName("smash_level_total")
    val smashLevelTotal: Int = 0

    @SerializedName("xp_BOTMUN")
    val xpBotmun: Int = 0

    @SerializedName("lastLevel_BOTMUN")
    val lastlevelBotmun: Int = 0

    @SerializedName("xp_CAKE_MONSTER")
    val xpCakeMonster: Int = 0

    @SerializedName("lastLevel_CAKE_MONSTER")
    val lastlevelCakeMonster: Int = 0

    @SerializedName("xp_GENERAL_CLUCK")
    val xpGeneralCluck: Int = 0

    @SerializedName("lastLevel_GENERAL_CLUCK")
    val lastlevelGeneralCluck: Int = 0

    @SerializedName("games_monthly_a")
    val gamesMonthlyA: Int = 0

    @SerializedName("kills_monthly_a")
    val killsMonthlyA: Int = 0

    @SerializedName("losses_monthly_a")
    val lossesMonthlyA: Int = 0

    @SerializedName("smasher_normal")
    val smasherNormal: Int = 0

    @SerializedName("wins_2v2")
    val wins2v2: Int = 0

    val wins: Int = 0

    @SerializedName("wins_weekly_a")
    val winsWeeklyA: Int = 0

    @SerializedName("wins_monthly_a")
    val winsMonthlyA: Int = 0

    @SerializedName("games_weekly_b")
    val gamesWeeklyB: Int = 0

    @SerializedName("wins_weekly_b")
    val winsWeeklyB: Int = 0

    @SerializedName("kills_weekly_b")
    val killsWeeklyB: Int = 0

    @SerializedName("losses_weekly_b")
    val lossesWeeklyB: Int = 0

    @SerializedName("wins_normal")
    val winsNormal: Int = 0

    @SerializedName("pg_THE_BULK")
    val pgTheBulk: Int = 0

    val classes: Map<String, Any> = Collections.emptyMap()

    @SerializedName("xp_SKULLFIRE")
    val xpSkullfire: Int = 0

    @SerializedName("lastLevel_SKULLFIRE")
    val lastlevelSkullfire: Int = 0

    @SerializedName("wins_monthly_b")
    val winsMonthlyB: Int = 0

    @SerializedName("wins_teams")
    val winsTeams: Int = 0

    @SerializedName("assists_normal")
    val assistsNormal: Int = 0

    @SerializedName("friend_losses")
    val friendLosses: Int = 0

    @SerializedName("friend_wins")
    val friendWins: Int = 0

    @SerializedName("friend_wins_normal")
    val friendWinsNormal: Int = 0

    val assists: Int = 0

    @SerializedName("friend_losses_normal")
    val friendLossesNormal: Int = 0

    @SerializedName("FRIENDS_gamesDay")
    val friendsGamesday: Int = 0

    @SerializedName("FRIENDS_firstGame")
    val friendsFirstgame: Int = 0

    @SerializedName("masterArmor_THE_BULK")
    val masterArmorTheBulk: Boolean = false

    @SerializedName("pg_SKULLFIRE")
    val pgSkullfire: Int = 0

    @SerializedName("xp_DUSK_CRAWLER")
    val xpDuskCrawler: Int = 0

    @SerializedName("lastLevel_DUSK_CRAWLER")
    val lastlevelDuskCrawler: Int = 0

    @SerializedName("masterArmor_SKULLFIRE")
    val masterArmorSkullfire: Boolean = false

    @SerializedName("xp_TINMAN")
    val xpTinman: Int = 0

    @SerializedName("lastLevel_TINMAN")
    val lastlevelTinman: Int = 0

    @SerializedName("pg_TINMAN")
    val pgTinman: Int = 0

    @SerializedName("masterArmor_TINMAN")
    val masterArmorTinman: Boolean = false

    @SerializedName("votes_Mosaic")
    val votesMosaic: Int = 0

    @SerializedName("lastLevel_SHOOP_DA_WHOOP")
    val lastlevelShoopDaWhoop: Int = 0

    @SerializedName("xp_SHOOP_DA_WHOOP")
    val xpShoopDaWhoop: Int = 0

    @SerializedName("pg_SHOOP_DA_WHOOP")
    val pgShoopDaWhoop: Int = 0

    @SerializedName("masterArmor_SHOOP_DA_WHOOP")
    val masterArmorShoopDaWhoop: Boolean = false

    @SerializedName("xp_MARAUDER")
    val xpMarauder: Int = 0

    @SerializedName("lastLevel_MARAUDER")
    val lastlevelMarauder: Int = 0

    @SerializedName("xp_FROSTY")
    val xpFrosty: Int = 0

    @SerializedName("lastLevel_FROSTY")
    val lastlevelFrosty: Int = 0

    @SerializedName("xp_PUG")
    val xpPug: Int = 0

    @SerializedName("lastLevel_PUG")
    val lastlevelPug: Int = 0

    @SerializedName("xp_SPODERMAN")
    val xpSpoderman: Int = 0

    @SerializedName("lastLevel_SPODERMAN")
    val lastlevelSpoderman: Int = 0

    @SerializedName("xp_SERGEANT_SHIELD")
    val xpSergeantShield: Int = 0

    @SerializedName("lastLevel_SERGEANT_SHIELD")
    val lastlevelSergeantShield: Int = 0

    @SerializedName("lastLevel_GOKU")
    val lastlevelGoku: Int = 0

    @SerializedName("xp_GOKU")
    val xpGoku: Int = 0

    @SerializedName("lastLevel_SANIC")
    val lastlevelSanic: Int = 0

    @SerializedName("xp_SANIC")
    val xpSanic: Int = 0

    @SerializedName("lastLevel_GREEN_HOOD")
    val lastlevelGreenHood: Int = 0

    @SerializedName("xp_GREEN_HOOD")
    val xpGreenHood: Int = 0

    @SerializedName("pg_GENERAL_CLUCK")
    val pgGeneralCluck: Int = 0

    @SerializedName("pg_CAKE_MONSTER")
    val pgCakeMonster: Int = 0

    @SerializedName("pg_BOTMUN")
    val pgBotmun: Int = 0

    @SerializedName("pg_MARAUDER")
    val pgMarauder: Int = 0

    @SerializedName("pg_SPODERMAN")
    val pgSpoderman: Int = 0

    @SerializedName("pg_PUG")
    val pgPug: Int = 0

    @SerializedName("pg_FROSTY")
    val pgFrosty: Int = 0

    @SerializedName("pg_SERGEANT_SHIELD")
    val pgSergeantShield: Int = 0

    @SerializedName("pg_GOKU")
    val pgGoku: Int = 0

    @SerializedName("pg_SANIC")
    val pgSanic: Int = 0

    @SerializedName("pg_DUSK_CRAWLER")
    val pgDuskCrawler: Int = 0

    @SerializedName("pg_GREEN_HOOD")
    val pgGreenHood: Int = 0

    @SerializedName("masterArmor_GREEN_HOOD")
    val masterArmorGreenHood: Boolean = false

    @SerializedName("ONE_V_JUAN_firstGame")
    val oneVJuanFirstgame: Int = 0

    @SerializedName("ONE_V_JUAN_gamesDay")
    val oneVJuanGamesday: Int = 0

    @SerializedName("one_v_one_losses_normal")
    val oneVOneLossesNormal: Int = 0

    @SerializedName("one_v_one_losses")
    val oneVOneLosses: Int = 0

    @SerializedName("one_v_one_wins")
    val oneVOneWins: Int = 0

    @SerializedName("one_v_one_wins_normal")
    val oneVOneWinsNormal: Int = 0

    @SerializedName("masterArmor_FROSTY")
    val masterArmorFrosty: Boolean = false

    @SerializedName("masterArmor_SERGEANT_SHIELD")
    val masterArmorSergeantShield: Boolean = false

    @SerializedName("masterArmor_GENERAL_CLUCK")
    val masterArmorGeneralCluck: Boolean = false

    @SerializedName("masterArmor_SANIC")
    val masterArmorSanic: Boolean = false

    @SerializedName("masterArmor_DUSK_CRAWLER")
    val masterArmorDuskCrawler: Boolean = false

    @SerializedName("votes_Triplets")
    val votesTriplets: Int = 0

    @SerializedName("votes_Shard")
    val votesShard: Int = 0

    @SerializedName("votes_Gunmetal")
    val votesGunmetal: Int = 0

    @SerializedName("votes_Color Clash")
    val votesColorClash: Int = 0

    @SerializedName("votes_Cosmos")
    val votesCosmos: Int = 0

    @SerializedName("votes_Apex")
    val votesApex: Int = 0

    @SerializedName("votes_Harmony")
    val votesHarmony: Int = 0

    @SerializedName("masterArmor_GOKU")
    val masterArmorGoku: Boolean = false

    @SerializedName("votes_Marshland")
    val votesMarshland: Int = 0

    @SerializedName("votes_Strawberry Towers")
    val votesStrawberryTowers: Int = 0

    @SerializedName("votes_Courtyard")
    val votesCourtyard: Int = 0

    @SerializedName("votes_Skyline")
    val votesSkyline: Int = 0

    @SerializedName("votes_Circled")
    val votesCircled: Int = 0

    @SerializedName("votes_Toybox")
    val votesToybox: Int = 0

    @SerializedName("votes_Grove")
    val votesGrove: Int = 0

    @SerializedName("votes_Reconcile")
    val votesReconcile: Int = 0

    @SerializedName("votes_Dojo")
    val votesDojo: Int = 0

    @SerializedName("votes_Swift")
    val votesSwift: Int = 0

    @SerializedName("votes_Luxor")
    val votesLuxor: Int = 0

    @SerializedName("votes_Grave")
    val votesGrave: Int = 0

    @SerializedName("votes_Bastion")
    val votesBastion: Int = 0

    @SerializedName("votes_Sparta")
    val votesSparta: Int = 0

    @SerializedName("votes_Cobalt")
    val votesCobalt: Int = 0

    @SerializedName("votes_Solaris Templum")
    val votesSolarisTemplum: Int = 0

    @SerializedName("votes_Agora")
    val votesAgora: Int = 0

    @SerializedName("votes_Bawk")
    val votesBawk: Int = 0

    @SerializedName("votes_Gateway")
    val votesGateway: Int = 0

    @SerializedName("votes_Blossom")
    val votesBlossom: Int = 0

    @SerializedName("votes_Equinox")
    val votesEquinox: Int = 0

    @SerializedName("expBooster_purchases_100_plays")
    val expBoosterPurchases100Plays: Int = 0

    @SerializedName("expired_booster")
    val expiredBooster: Boolean = false

    @SerializedName("masterArmor_SPODERMAN")
    val masterArmorSpoderman: Boolean = false

    @SerializedName("masterArmor_MARAUDER")
    val masterArmorMarauder: Boolean = false

    @SerializedName("masterArmor_BOTMUN")
    val masterArmorBotmun: Boolean = false

    @SerializedName("masterArmor_CAKE_MONSTER")
    val masterArmorCakeMonster: Boolean = false

    @SerializedName("masterArmor_PUG")
    val masterArmorPug: Boolean = false
}

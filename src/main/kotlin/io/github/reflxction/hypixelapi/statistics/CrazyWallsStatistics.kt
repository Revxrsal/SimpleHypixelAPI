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
 * Represents all the *Crazy Walls* statistics of a player.
 */
@StatisticName("TrueCombat")
class CrazyWallsStatistics {

    val packages: List<String> = Collections.emptyList()

    @SerializedName("win_streak")
    val winStreak: Int = 0

    val games: Int = 0

    @SerializedName("crazywalls_losses_solo_chaos")
    val crazywallsLossesSoloChaos: Int = 0

    @SerializedName("crazywalls_games_solo_chaos")
    val crazywallsGamesSoloChaos: Int = 0

    val deaths: Int = 0

    val coins: Int = 0

    val losses: Int = 0

    @SerializedName("crazywalls_deaths_solo_chaos")
    val crazywallsDeathsSoloChaos: Int = 0

    @SerializedName("survived_players")
    val survivedPlayers: Int = 0

    @SerializedName("items_enchanted")
    val itemsEnchanted: Int = 0

    @SerializedName("crazywalls_kills_weekly_b_solo_chaos")
    val crazywallsKillsWeeklyBSoloChaos: Int = 0

    @SerializedName("arrows_shot")
    val arrowsShot: Int = 0

    val kills: Int = 0

    @SerializedName("crazywalls_kills_solo_chaos")
    val crazywallsKillsSoloChaos: Int = 0

    @SerializedName("crazywalls_kills_monthly_a_solo_chaos")
    val crazywallsKillsMonthlyASoloChaos: Int = 0

    @SerializedName("crazywalls_kills_monthly_a_team_chaos")
    val crazywallsKillsMonthlyATeamChaos: Int = 0

    @SerializedName("crazywalls_games_team_chaos")
    val crazywallsGamesTeamChaos: Int = 0

    @SerializedName("crazywalls_losses_team_chaos")
    val crazywallsLossesTeamChaos: Int = 0

    @SerializedName("crazywalls_kills_weekly_b_team_chaos")
    val crazywallsKillsWeeklyBTeamChaos: Int = 0

    @SerializedName("skulls_gathered")
    val skullsGathered: Int = 0

    @SerializedName("crazywalls_deaths_team_chaos")
    val crazywallsDeathsTeamChaos: Int = 0

    @SerializedName("crazywalls_kills_team_chaos")
    val crazywallsKillsTeamChaos: Int = 0

    @SerializedName("golden_skulls")
    val goldenSkulls: Int = 0

    @SerializedName("votes_Mars")
    val votesMars: Int = 0

    @SerializedName("giant_zombie")
    val giantZombie: Int = 0

    @SerializedName("team_blazing_arrow")
    val teamBlazingArrow: Int = 0

    @SerializedName("solo_chaos_tomb_robber")
    val soloChaosTombRobber: Int = 0

    @SerializedName("crazywalls_kills_weekly_a_solo_chaos")
    val crazywallsKillsWeeklyASoloChaos: Int = 0

    @SerializedName("crazywalls_kills_weekly_a_team_chaos")
    val crazywallsKillsWeeklyATeamChaos: Int = 0

    @SerializedName("crazywalls_losses_solo")
    val crazywallsLossesSolo: Int = 0

    @SerializedName("crazywalls_deaths_solo")
    val crazywallsDeathsSolo: Int = 0

    @SerializedName("crazywalls_games_solo")
    val crazywallsGamesSolo: Int = 0

    @SerializedName("votes_Mushrooms")
    val votesMushrooms: Int = 0

    @SerializedName("crazywalls_wins_solo_chaos")
    val crazywallsWinsSoloChaos: Int = 0

    val wins: Int = 0

    @SerializedName("votes_Shed")
    val votesShed: Int = 0

    @SerializedName("solo_chaos_rusher")
    val soloChaosRusher: Int = 0

    @SerializedName("votes_Crypt")
    val votesCrypt: Int = 0

    @SerializedName("activeKit_Team")
    val activekitTeam: String = ""

    @SerializedName("crazywalls_deaths_team")
    val crazywallsDeathsTeam: Int = 0

    @SerializedName("crazywalls_losses_team")
    val crazywallsLossesTeam: Int = 0

    @SerializedName("crazywalls_games_team")
    val crazywallsGamesTeam: Int = 0

    @SerializedName("team_bounty_hunter")
    val teamBountyHunter: Int = 0

    @SerializedName("team_swiftness")
    val teamSwiftness: Int = 0

    @SerializedName("team_adrenaline")
    val teamAdrenaline: Int = 0

    @SerializedName("activeKit_Solo")
    val activekitSolo: String = ""

    @SerializedName("crazywalls_kills_weekly_b_solo")
    val crazywallsKillsWeeklyBSolo: Int = 0

    @SerializedName("crazywalls_kills_solo")
    val crazywallsKillsSolo: Int = 0

    @SerializedName("crazywalls_kills_monthly_a_solo")
    val crazywallsKillsMonthlyASolo: Int = 0

    @SerializedName("votes_Garden")
    val votesGarden: Int = 0

    @SerializedName("votes_Org'ul")
    val votesOrgul: Int = 0

    @SerializedName("giant_zombie_legendaries")
    val giantZombieLegendaries: Int = 0

    @SerializedName("solo_chaos_businessman")
    val soloChaosBusinessman: Int = 0

    @SerializedName("solo_chaos_bounty_hunter")
    val soloChaosBountyHunter: Int = 0

    @SerializedName("giant_zombie_rares")
    val giantZombieRares: Int = 0

    @SerializedName("solo_berserk")
    val soloBerserk: Int = 0

    @SerializedName("kit_basic_chaos_archer")
    val kitBasicChaosArcher: Int = 0

    @SerializedName("kit_basic_chaos_knight")
    val kitBasicChaosKnight: Int = 0

    @SerializedName("activeKit_Solo_chaos")
    val activekitSoloChaos: String = ""

    @SerializedName("votes_Dwarven")
    val votesDwarven: Int = 0

    @SerializedName("gold_dust")
    val goldDust: Int = 0

    @SerializedName("team_vampirism")
    val teamVampirism: Int = 0

    @SerializedName("activeKit_Team_chaos")
    val activekitTeamChaos: String = ""

    @SerializedName("solo_vampirism")
    val soloVampirism: Int = 0

    @SerializedName("solo_chaos_berserk")
    val soloChaosBerserk: Int = 0

    @SerializedName("solo_chaos_super_luck")
    val soloChaosSuperLuck: Int = 0

    @SerializedName("solo_precision")
    val soloPrecision: Int = 0

    @SerializedName("team_precision")
    val teamPrecision: Int = 0

    @SerializedName("solo_chaos_blazing_arrow")
    val soloChaosBlazingArrow: Int = 0

    @SerializedName("solo_chaos_adrenaline")
    val soloChaosAdrenaline: Int = 0

    @SerializedName("solo_rusher")
    val soloRusher: Int = 0

    @SerializedName("kills_weekly_b")
    val killsWeeklyB: Int = 0

    @SerializedName("crazywalls_kills_monthly_b_solo_chaos")
    val crazywallsKillsMonthlyBSoloChaos: Int = 0

    @SerializedName("kills_monthly_b")
    val killsMonthlyB: Int = 0

    @SerializedName("solo_swiftness")
    val soloSwiftness: Int = 0

    @SerializedName("solo_blazing_arrow")
    val soloBlazingArrow: Int = 0

    @SerializedName("crazywalls_kills_monthly_b_solo")
    val crazywallsKillsMonthlyBSolo: Int = 0

    @SerializedName("team_rusher")
    val teamRusher: Int = 0

    @SerializedName("team_berserk")
    val teamBerserk: Int = 0

    @SerializedName("team_smart_mining")
    val teamSmartMining: Int = 0

    @SerializedName("arrows_hit")
    val arrowsHit: Int = 0

    @SerializedName("kills_weekly_a")
    val killsWeeklyA: Int = 0

    @SerializedName("crazywalls_kills_monthly_b_team_chaos")
    val crazywallsKillsMonthlyBTeamChaos: Int = 0

    @SerializedName("crazywalls_kills_monthly_b_team")
    val crazywallsKillsMonthlyBTeam: Int = 0

    @SerializedName("crazywalls_kills_team")
    val crazywallsKillsTeam: Int = 0

    @SerializedName("crazywalls_kills_weekly_a_team")
    val crazywallsKillsWeeklyATeam: Int = 0

    @SerializedName("votes_Egypt")
    val votesEgypt: Int = 0

    @SerializedName("team_last_stand")
    val teamLastStand: Int = 0

    @SerializedName("solo_adrenaline")
    val soloAdrenaline: Int = 0

    @SerializedName("kills_monthly_a")
    val killsMonthlyA: Int = 0

    @SerializedName("crazywalls_kills_monthly_a_team")
    val crazywallsKillsMonthlyATeam: Int = 0

    @SerializedName("votes_Jungle")
    val votesJungle: Int = 0

    @SerializedName("crazywalls_wins_team_chaos")
    val crazywallsWinsTeamChaos: Int = 0

    @SerializedName("solo_speed_mining")
    val soloSpeedMining: Int = 0

    @SerializedName("votes_Nether")
    val votesNether: Int = 0

    @SerializedName("solo_bounty_hunter")
    val soloBountyHunter: Int = 0

    @SerializedName("solo_lucky_drops")
    val soloLuckyDrops: Int = 0

    @SerializedName("kit_basic_chaos_looter")
    val kitBasicChaosLooter: Int = 0

    @SerializedName("solo_chaos_vampirism")
    val soloChaosVampirism: Int = 0

    @SerializedName("team_tomb_robber")
    val teamTombRobber: Int = 0

    @SerializedName("crafting_lucky_gold_ingots")
    val craftingLuckyGoldIngots: Int = 0

    @SerializedName("crafting_lucky_enchanted_book_sharpness")
    val craftingLuckyEnchantedBookSharpness: Int = 0

    @SerializedName("crafting_lucky_rejuvenate")
    val craftingLuckyRejuvenate: Int = 0

    @SerializedName("crafting_lucky_brawler")
    val craftingLuckyBrawler: Int = 0

    @SerializedName("crafting_lucky_ender_pearls")
    val craftingLuckyEnderPearls: Int = 0

    @SerializedName("votes_Town Square")
    val votesTownSquare: Int = 0

    @SerializedName("solo_smart_mining")
    val soloSmartMining: Int = 0

    @SerializedName("team_knowledge")
    val teamKnowledge: Int = 0

    @SerializedName("votes_Blacksmith")
    val votesBlacksmith: Int = 0

    @SerializedName("solo_chaos_knowledge")
    val soloChaosKnowledge: Int = 0

    @SerializedName("votes_Shrine")
    val votesShrine: Int = 0

    @SerializedName("crafting_lucky_cobwebs")
    val craftingLuckyCobwebs: Int = 0

    @SerializedName("kit_basic_chaos_gladiator")
    val kitBasicChaosGladiator: Int = 0

    @SerializedName("solo_chaos_annoy-o-mite")
    val soloChaosAnnoyOMite: Int = 0

    @SerializedName("votes_Winter")
    val votesWinter: Int = 0

    @SerializedName("solo_knowledge")
    val soloKnowledge: Int = 0

    @SerializedName("crafting_lucky_enchanted_book_power")
    val craftingLuckyEnchantedBookPower: Int = 0

    @SerializedName("crafting_lucky_eagle_eye")
    val craftingLuckyEagleEye: Int = 0

    @SerializedName("crazywalls_kills_weekly_b_team")
    val crazywallsKillsWeeklyBTeam: Int = 0

    @SerializedName("crazywalls_wins_team")
    val crazywallsWinsTeam: Int = 0

    @SerializedName("crafting_lucky_lava_bucket")
    val craftingLuckyLavaBucket: Int = 0

    @SerializedName("crafting_normal_enchanted_book_protection")
    val craftingNormalEnchantedBookProtection: Int = 0

    @SerializedName("crafting_normal_enchanted_book_sharpness")
    val craftingNormalEnchantedBookSharpness: Int = 0

    @SerializedName("crafting_normal_enchanted_book_power")
    val craftingNormalEnchantedBookPower: Int = 0

    @SerializedName("crafting_normal_gold_ingots")
    val craftingNormalGoldIngots: Int = 0

    @SerializedName("solo_tomb_robber")
    val soloTombRobber: Int = 0

    @SerializedName("kit_basic_chaos_armorer")
    val kitBasicChaosArmorer: Int = 0

    @SerializedName("crafting_normal_heal_potion")
    val craftingNormalHealPotion: Int = 0

    @SerializedName("team_annoy-o-mite")
    val teamAnnoyOMite: Int = 0

    @SerializedName("crafting_normal_random_item")
    val craftingNormalRandomItem: Int = 0

    @SerializedName("crafting_normal_cobwebs")
    val craftingNormalCobwebs: Int = 0

    @SerializedName("crafting_normal_lava_bucket")
    val craftingNormalLavaBucket: Int = 0

    @SerializedName("crafting_normal_enchanted_book_punch")
    val craftingNormalEnchantedBookPunch: Int = 0

    @SerializedName("solo_annoy-o-mite")
    val soloAnnoyOMite: Int = 0

    @SerializedName("show_noob_holograms")
    val showNoobHolograms: Boolean = false

    @SerializedName("team_speed_mining")
    val teamSpeedMining: Int = 0

    @SerializedName("kit_basic_chaos_weaponsmith")
    val kitBasicChaosWeaponsmith: Int = 0

    @SerializedName("team_group_heal")
    val teamGroupHeal: Int = 0

    @SerializedName("team_smarty_pants")
    val teamSmartyPants: Int = 0

    @SerializedName("crafting_lucky_enchanted_book_punch")
    val craftingLuckyEnchantedBookPunch: Int = 0

    @SerializedName("solo_chaos_speed_mining")
    val soloChaosSpeedMining: Int = 0

    @SerializedName("solo_chaos_smarty_pants")
    val soloChaosSmartyPants: Int = 0

    @SerializedName("solo_smarty_pants")
    val soloSmartyPants: Int = 0

    @SerializedName("solo_chaos_treasure_hunter")
    val soloChaosTreasureHunter: Int = 0

    @SerializedName("solo_scavenger")
    val soloScavenger: Int = 0

    @SerializedName("crazywalls_wins_solo")
    val crazywallsWinsSolo: Int = 0

    @SerializedName("crazywalls_kills_weekly_a_solo")
    val crazywallsKillsWeeklyASolo: Int = 0

    @SerializedName("team_scavenger")
    val teamScavenger: Int = 0
}

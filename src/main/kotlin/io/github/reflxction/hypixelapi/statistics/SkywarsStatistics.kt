/*
 * * Copyright 2019 github.com/ReflxctionDev
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
 * Represents all *SkyWars* statistics for a player
 */
class SkywarsStatistics {

    val packages: List<Any> = Collections.emptyList()

    @SerializedName("activeKit_TEAM")
    val activekitTeam: String = ""

    @SerializedName("soul_well")
    val soulWell: Int = 0

    val usedSoulWell: Boolean = false

    @SerializedName("win_streak")
    val winStreak: Int = 0

    val losses: Int = 0

    @SerializedName("survived_players")
    val survivedPlayers: Int = 0

    @SerializedName("kills_kit_mining_team_default")
    val killsKitMiningTeamDefault: Int = 0

    @SerializedName("kills_team")
    val killsTeam: Int = 0

    @SerializedName("blocks_broken")
    val blocksBroken: Int = 0

    @SerializedName("blocks_placed")
    val blocksPlaced: Int = 0

    @SerializedName("deaths_team_normal")
    val deathsTeamNormal: Int = 0

    @SerializedName("survived_players_kit_mining_team_default")
    val survivedPlayersKitMiningTeamDefault: Int = 0

    val coins: Int = 0

    @SerializedName("survived_players_team")
    val survivedPlayersTeam: Int = 0

    @SerializedName("souls_gathered")
    val soulsGathered: Int = 0

    @SerializedName("losses_kit_mining_team_default")
    val lossesKitMiningTeamDefault: Int = 0

    @SerializedName("losses_team_normal")
    val lossesTeamNormal: Int = 0

    @SerializedName("kills_team_normal")
    val killsTeamNormal: Int = 0

    val deaths: Int = 0

    val quits: Int = 0

    @SerializedName("deaths_kit_mining_team_default")
    val deathsKitMiningTeamDefault: Int = 0

    @SerializedName("losses_team")
    val lossesTeam: Int = 0

    val souls: Int = 0

    val kills: Int = 0

    @SerializedName("deaths_team")
    val deathsTeam: Int = 0

    @SerializedName("kills_solo_insane")
    val killsSoloInsane: Int = 0

    @SerializedName("deaths_solo_insane")
    val deathsSoloInsane: Int = 0

    @SerializedName("losses_solo")
    val lossesSolo: Int = 0

    @SerializedName("survived_players_kit_basic_solo_default")
    val survivedPlayersKitBasicSoloDefault: Int = 0

    @SerializedName("deaths_kit_basic_solo_default")
    val deathsKitBasicSoloDefault: Int = 0

    @SerializedName("kills_kit_basic_solo_default")
    val killsKitBasicSoloDefault: Int = 0

    @SerializedName("deaths_solo")
    val deathsSolo: Int = 0

    @SerializedName("kills_solo")
    val killsSolo: Int = 0

    @SerializedName("survived_players_solo")
    val survivedPlayersSolo: Int = 0

    @SerializedName("losses_solo_insane")
    val lossesSoloInsane: Int = 0

    @SerializedName("losses_kit_basic_solo_default")
    val lossesKitBasicSoloDefault: Int = 0

    @SerializedName("deaths_kit_supporting_team_ecologist")
    val deathsKitSupportingTeamEcologist: Int = 0

    @SerializedName("kills_kit_supporting_team_ecologist")
    val killsKitSupportingTeamEcologist: Int = 0

    @SerializedName("deaths_team_insane")
    val deathsTeamInsane: Int = 0

    @SerializedName("survived_players_kit_supporting_team_ecologist")
    val survivedPlayersKitSupportingTeamEcologist: Int = 0

    @SerializedName("kills_team_insane")
    val killsTeamInsane: Int = 0

    @SerializedName("losses_team_insane")
    val lossesTeamInsane: Int = 0

    @SerializedName("losses_kit_supporting_team_ecologist")
    val lossesKitSupportingTeamEcologist: Int = 0

    @SerializedName("egg_thrown")
    val eggThrown: Int = 0

    @SerializedName("deaths_solo_normal")
    val deathsSoloNormal: Int = 0

    @SerializedName("losses_solo_normal")
    val lossesSoloNormal: Int = 0

    val games: Int = 0

    @SerializedName("games_kit_supporting_team_ecologist")
    val gamesKitSupportingTeamEcologist: Int = 0

    @SerializedName("games_team")
    val gamesTeam: Int = 0

    @SerializedName("arrows_hit")
    val arrowsHit: Int = 0

    @SerializedName("arrows_shot")
    val arrowsShot: Int = 0

    @SerializedName("assists_team")
    val assistsTeam: Int = 0

    @SerializedName("assists_kit_supporting_team_ecologist")
    val assistsKitSupportingTeamEcologist: Int = 0

    val assists: Int = 0

    @SerializedName("mega_rusher")
    val megaRusher: Int = 0

    @SerializedName("paid_souls")
    val paidSouls: Int = 0

    @SerializedName("assists_kit_mega_mega_default")
    val assistsKitMegaMegaDefault: Int = 0

    @SerializedName("losses_mega_normal")
    val lossesMegaNormal: Int = 0

    @SerializedName("losses_mega")
    val lossesMega: Int = 0

    @SerializedName("losses_kit_mega_mega_default")
    val lossesKitMegaMegaDefault: Int = 0

    @SerializedName("survived_players_mega")
    val survivedPlayersMega: Int = 0

    @SerializedName("kills_mega")
    val killsMega: Int = 0

    @SerializedName("deaths_kit_mega_mega_default")
    val deathsKitMegaMegaDefault: Int = 0

    @SerializedName("kills_kit_mega_mega_default")
    val killsKitMegaMegaDefault: Int = 0

    @SerializedName("deaths_mega")
    val deathsMega: Int = 0

    @SerializedName("deaths_mega_normal")
    val deathsMegaNormal: Int = 0

    @SerializedName("assists_mega")
    val assistsMega: Int = 0

    @SerializedName("survived_players_kit_mega_mega_default")
    val survivedPlayersKitMegaMegaDefault: Int = 0

    @SerializedName("kills_mega_normal")
    val killsMegaNormal: Int = 0

    @SerializedName("team_instant_smelting")
    val teamInstantSmelting: Int = 0

    @SerializedName("mega_ender_mastery")
    val megaEnderMastery: Int = 0

    @SerializedName("activeKit_MEGA")
    val activekitMega: String = ""

    @SerializedName("activeKit_SOLO")
    val activekitSolo: String = ""

    @SerializedName("losses_kit_basic_solo_ecologist")
    val lossesKitBasicSoloEcologist: Int = 0

    @SerializedName("survived_players_kit_basic_solo_ecologist")
    val survivedPlayersKitBasicSoloEcologist: Int = 0

    @SerializedName("deaths_kit_basic_solo_ecologist")
    val deathsKitBasicSoloEcologist: Int = 0

    @SerializedName("kills_kit_basic_solo_ecologist")
    val killsKitBasicSoloEcologist: Int = 0

    @SerializedName("kills_solo_normal")
    val killsSoloNormal: Int = 0

    @SerializedName("wins_kit_supporting_team_ecologist")
    val winsKitSupportingTeamEcologist: Int = 0

    @SerializedName("wins_team_insane")
    val winsTeamInsane: Int = 0

    val wins: Int = 0

    @SerializedName("wins_team")
    val winsTeam: Int = 0

    @SerializedName("votes_Steampunk")
    val votesSteampunk: Int = 0

    @SerializedName("enderpearls_thrown")
    val enderpearlsThrown: Int = 0

    @SerializedName("items_enchanted")
    val itemsEnchanted: Int = 0

    @SerializedName("deaths_kit_supporting_team_healer")
    val deathsKitSupportingTeamHealer: Int = 0

    @SerializedName("losses_kit_supporting_team_healer")
    val lossesKitSupportingTeamHealer: Int = 0

    @SerializedName("survived_players_kit_supporting_team_healer")
    val survivedPlayersKitSupportingTeamHealer: Int = 0

    @SerializedName("assists_kit_supporting_team_healer")
    val assistsKitSupportingTeamHealer: Int = 0

    @SerializedName("soul_well_legendaries")
    val soulWellLegendaries: Int = 0

    @SerializedName("kills_kit_supporting_team_healer")
    val killsKitSupportingTeamHealer: Int = 0

    @SerializedName("games_kit_basic_solo_ecologist")
    val gamesKitBasicSoloEcologist: Int = 0

    @SerializedName("games_solo")
    val gamesSolo: Int = 0

    @SerializedName("deaths_kit_basic_solo_armorsmith")
    val deathsKitBasicSoloArmorsmith: Int = 0

    @SerializedName("kills_kit_basic_solo_armorsmith")
    val killsKitBasicSoloArmorsmith: Int = 0

    @SerializedName("games_kit_basic_solo_armorsmith")
    val gamesKitBasicSoloArmorsmith: Int = 0

    @SerializedName("losses_kit_basic_solo_armorsmith")
    val lossesKitBasicSoloArmorsmith: Int = 0

    @SerializedName("survived_players_kit_basic_solo_armorsmith")
    val survivedPlayersKitBasicSoloArmorsmith: Int = 0

    @SerializedName("wins_kit_basic_solo_armorsmith")
    val winsKitBasicSoloArmorsmith: Int = 0

    @SerializedName("wins_solo_insane")
    val winsSoloInsane: Int = 0

    @SerializedName("wins_solo")
    val winsSolo: Int = 0

    @SerializedName("votes_Frostbite")
    val votesFrostbite: Int = 0

    @SerializedName("votes_Atuin")
    val votesAtuin: Int = 0

    @SerializedName("soul_well_rares")
    val soulWellRares: Int = 0

    @SerializedName("mega_arrow_recovery")
    val megaArrowRecovery: Int = 0

    @SerializedName("assists_kit_basic_solo_armorsmith")
    val assistsKitBasicSoloArmorsmith: Int = 0

    @SerializedName("assists_solo")
    val assistsSolo: Int = 0

    @SerializedName("games_kit_supporting_team_healer")
    val gamesKitSupportingTeamHealer: Int = 0

    @SerializedName("wins_kit_supporting_team_healer")
    val winsKitSupportingTeamHealer: Int = 0

    @SerializedName("votes_Toadstool")
    val votesToadstool: Int = 0

    @SerializedName("votes_Elven")
    val votesElven: Int = 0

    @SerializedName("votes_Congo")
    val votesCongo: Int = 0

    @SerializedName("votes_Shire")
    val votesShire: Int = 0

    @SerializedName("votes_Dwarven")
    val votesDwarven: Int = 0

    @SerializedName("team_mining_expertise")
    val teamMiningExpertise: Int = 0

    @SerializedName("votes_Tribal")
    val votesTribal: Int = 0

    @SerializedName("votes_Dragonice")
    val votesDragonice: Int = 0

    @SerializedName("refill_chest_destroy")
    val refillChestDestroy: Int = 0

    @SerializedName("votes_LongIsland")
    val votesLongisland: Int = 0

    @SerializedName("mega_juggernaut")
    val megaJuggernaut: Int = 0

    @SerializedName("survived_players_kit_attacking_team_knight")
    val survivedPlayersKitAttackingTeamKnight: Int = 0

    @SerializedName("deaths_kit_attacking_team_knight")
    val deathsKitAttackingTeamKnight: Int = 0

    @SerializedName("kills_kit_attacking_team_knight")
    val killsKitAttackingTeamKnight: Int = 0

    @SerializedName("losses_kit_attacking_team_knight")
    val lossesKitAttackingTeamKnight: Int = 0

    @SerializedName("losses_kit_defending_team_armorer")
    val lossesKitDefendingTeamArmorer: Int = 0

    @SerializedName("assists_kit_defending_team_armorer")
    val assistsKitDefendingTeamArmorer: Int = 0

    @SerializedName("survived_players_kit_defending_team_armorer")
    val survivedPlayersKitDefendingTeamArmorer: Int = 0

    @SerializedName("deaths_kit_defending_team_armorer")
    val deathsKitDefendingTeamArmorer: Int = 0

    @SerializedName("kills_kit_defending_team_armorer")
    val killsKitDefendingTeamArmorer: Int = 0

    @SerializedName("deaths_kit_attacking_team_hunter")
    val deathsKitAttackingTeamHunter: Int = 0

    @SerializedName("losses_kit_attacking_team_hunter")
    val lossesKitAttackingTeamHunter: Int = 0

    @SerializedName("survived_players_kit_attacking_team_hunter")
    val survivedPlayersKitAttackingTeamHunter: Int = 0

    @SerializedName("survived_players_kit_supporting_team_armorsmith")
    val survivedPlayersKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("losses_kit_supporting_team_armorsmith")
    val lossesKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("deaths_kit_supporting_team_armorsmith")
    val deathsKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("kills_kit_supporting_team_armorsmith")
    val killsKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("assists_kit_supporting_team_armorsmith")
    val assistsKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("votes_Overfall")
    val votesOverfall: Int = 0

    @SerializedName("votes_Entangled")
    val votesEntangled: Int = 0

    @SerializedName("votes_Jinzhou")
    val votesJinzhou: Int = 0

    @SerializedName("assists_kit_basic_solo_ecologist")
    val assistsKitBasicSoloEcologist: Int = 0

    @SerializedName("wins_kit_basic_solo_ecologist")
    val winsKitBasicSoloEcologist: Int = 0

    @SerializedName("votes_Siege")
    val votesSiege: Int = 0

    @SerializedName("solo_mining_expertise")
    val soloMiningExpertise: Int = 0

    @SerializedName("votes_Shattered")
    val votesShattered: Int = 0

    @SerializedName("mega_mining_expertise")
    val megaMiningExpertise: Int = 0

    @SerializedName("votes_Temple")
    val votesTemple: Int = 0

    @SerializedName("team_ender_mastery")
    val teamEnderMastery: Int = 0

    @SerializedName("solo_instant_smelting")
    val soloInstantSmelting: Int = 0

    @SerializedName("assists_kit_attacking_team_knight")
    val assistsKitAttackingTeamKnight: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_farmer")
    val survivedPlayersKitAdvancedSoloFarmer: Int = 0

    @SerializedName("losses_kit_advanced_solo_farmer")
    val lossesKitAdvancedSoloFarmer: Int = 0

    @SerializedName("deaths_kit_advanced_solo_farmer")
    val deathsKitAdvancedSoloFarmer: Int = 0

    @SerializedName("kills_kit_advanced_solo_farmer")
    val killsKitAdvancedSoloFarmer: Int = 0

    @SerializedName("games_kit_advanced_solo_farmer")
    val gamesKitAdvancedSoloFarmer: Int = 0

    @SerializedName("wins_kit_advanced_solo_farmer")
    val winsKitAdvancedSoloFarmer: Int = 0

    @SerializedName("votes_Canopy")
    val votesCanopy: Int = 0

    @SerializedName("solo_resistance_boost")
    val soloResistanceBoost: Int = 0

    @SerializedName("survived_players_kit_attacking_team_scout")
    val survivedPlayersKitAttackingTeamScout: Int = 0

    @SerializedName("kills_kit_attacking_team_scout")
    val killsKitAttackingTeamScout: Int = 0

    @SerializedName("losses_kit_attacking_team_scout")
    val lossesKitAttackingTeamScout: Int = 0

    @SerializedName("deaths_kit_attacking_team_scout")
    val deathsKitAttackingTeamScout: Int = 0

    @SerializedName("wins_kit_attacking_team_scout")
    val winsKitAttackingTeamScout: Int = 0

    @SerializedName("games_kit_attacking_team_scout")
    val gamesKitAttackingTeamScout: Int = 0

    @SerializedName("solo_bulldozer")
    val soloBulldozer: Int = 0

    @SerializedName("team_speed_boost")
    val teamSpeedBoost: Int = 0

    @SerializedName("kit_mega_mega_scout")
    val kitMegaMegaScout: Int = 0

    @SerializedName("team_arrow_recovery")
    val teamArrowRecovery: Int = 0

    @SerializedName("wins_kit_attacking_team_knight")
    val winsKitAttackingTeamKnight: Int = 0

    @SerializedName("games_kit_attacking_team_knight")
    val gamesKitAttackingTeamKnight: Int = 0

    @SerializedName("wins_kit_supporting_team_armorsmith")
    val winsKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("games_kit_supporting_team_armorsmith")
    val gamesKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("deaths_kit_advanced_solo_knight")
    val deathsKitAdvancedSoloKnight: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_knight")
    val survivedPlayersKitAdvancedSoloKnight: Int = 0

    @SerializedName("losses_kit_advanced_solo_knight")
    val lossesKitAdvancedSoloKnight: Int = 0

    @SerializedName("kills_kit_advanced_solo_knight")
    val killsKitAdvancedSoloKnight: Int = 0

    @SerializedName("games_kit_advanced_solo_knight")
    val gamesKitAdvancedSoloKnight: Int = 0

    @SerializedName("wins_kit_advanced_solo_knight")
    val winsKitAdvancedSoloKnight: Int = 0

    @SerializedName("losses_kit_basic_solo_snowman")
    val lossesKitBasicSoloSnowman: Int = 0

    @SerializedName("survived_players_kit_basic_solo_snowman")
    val survivedPlayersKitBasicSoloSnowman: Int = 0

    @SerializedName("kills_kit_basic_solo_snowman")
    val killsKitBasicSoloSnowman: Int = 0

    @SerializedName("deaths_kit_basic_solo_snowman")
    val deathsKitBasicSoloSnowman: Int = 0

    @SerializedName("assists_kit_basic_solo_snowman")
    val assistsKitBasicSoloSnowman: Int = 0

    @SerializedName("wins_kit_basic_solo_snowman")
    val winsKitBasicSoloSnowman: Int = 0

    @SerializedName("games_kit_basic_solo_snowman")
    val gamesKitBasicSoloSnowman: Int = 0

    @SerializedName("survived_players_kit_mega_mega_scout")
    val survivedPlayersKitMegaMegaScout: Int = 0

    @SerializedName("deaths_kit_mega_mega_scout")
    val deathsKitMegaMegaScout: Int = 0

    @SerializedName("losses_kit_mega_mega_scout")
    val lossesKitMegaMegaScout: Int = 0

    @SerializedName("xezbeth_luck")
    val xezbethLuck: Int = 0

    @SerializedName("losses_kit_basic_solo_speleologist")
    val lossesKitBasicSoloSpeleologist: Int = 0

    @SerializedName("kills_kit_basic_solo_speleologist")
    val killsKitBasicSoloSpeleologist: Int = 0

    @SerializedName("deaths_kit_basic_solo_speleologist")
    val deathsKitBasicSoloSpeleologist: Int = 0

    @SerializedName("survived_players_kit_basic_solo_speleologist")
    val survivedPlayersKitBasicSoloSpeleologist: Int = 0

    @SerializedName("assists_kit_basic_solo_speleologist")
    val assistsKitBasicSoloSpeleologist: Int = 0

    @SerializedName("games_kit_basic_solo_speleologist")
    val gamesKitBasicSoloSpeleologist: Int = 0

    @SerializedName("wins_kit_basic_solo_speleologist")
    val winsKitBasicSoloSpeleologist: Int = 0

    @SerializedName("solo_ender_mastery")
    val soloEnderMastery: Int = 0

    @SerializedName("votes_Strata")
    val votesStrata: Int = 0

    @SerializedName("assists_kit_advanced_solo_farmer")
    val assistsKitAdvancedSoloFarmer: Int = 0

    @SerializedName("kit_mega_mega_cannoneer")
    val kitMegaMegaCannoneer: Int = 0

    @SerializedName("survived_players_kit_mega_mega_cannoneer")
    val survivedPlayersKitMegaMegaCannoneer: Int = 0

    @SerializedName("losses_kit_mega_mega_cannoneer")
    val lossesKitMegaMegaCannoneer: Int = 0

    @SerializedName("deaths_kit_mega_mega_cannoneer")
    val deathsKitMegaMegaCannoneer: Int = 0

    @SerializedName("team_resistance_boost")
    val teamResistanceBoost: Int = 0

    @SerializedName("team_blazing_arrows")
    val teamBlazingArrows: Int = 0

    @SerializedName("deaths_kit_basic_solo_troll")
    val deathsKitBasicSoloTroll: Int = 0

    @SerializedName("kills_kit_basic_solo_troll")
    val killsKitBasicSoloTroll: Int = 0

    @SerializedName("losses_kit_basic_solo_troll")
    val lossesKitBasicSoloTroll: Int = 0

    @SerializedName("survived_players_kit_basic_solo_troll")
    val survivedPlayersKitBasicSoloTroll: Int = 0

    @SerializedName("kills_kit_mining_team_speleologist")
    val killsKitMiningTeamSpeleologist: Int = 0

    @SerializedName("survived_players_kit_mining_team_speleologist")
    val survivedPlayersKitMiningTeamSpeleologist: Int = 0

    @SerializedName("deaths_kit_mining_team_speleologist")
    val deathsKitMiningTeamSpeleologist: Int = 0

    @SerializedName("losses_kit_mining_team_speleologist")
    val lossesKitMiningTeamSpeleologist: Int = 0

    @SerializedName("survived_players_kit_mining_team_cannoneer")
    val survivedPlayersKitMiningTeamCannoneer: Int = 0

    @SerializedName("kills_kit_mining_team_cannoneer")
    val killsKitMiningTeamCannoneer: Int = 0

    @SerializedName("losses_kit_mining_team_cannoneer")
    val lossesKitMiningTeamCannoneer: Int = 0

    @SerializedName("deaths_kit_mining_team_cannoneer")
    val deathsKitMiningTeamCannoneer: Int = 0

    @SerializedName("assists_kit_mining_team_cannoneer")
    val assistsKitMiningTeamCannoneer: Int = 0

    @SerializedName("solo_juggernaut")
    val soloJuggernaut: Int = 0

    @SerializedName("assists_kit_mining_team_speleologist")
    val assistsKitMiningTeamSpeleologist: Int = 0

    @SerializedName("assists_kit_basic_solo_troll")
    val assistsKitBasicSoloTroll: Int = 0

    @SerializedName("votes_Skychurch")
    val votesSkychurch: Int = 0

    @SerializedName("assists_kit_mega_mega_cannoneer")
    val assistsKitMegaMegaCannoneer: Int = 0

    @SerializedName("kills_kit_mega_mega_cannoneer")
    val killsKitMegaMegaCannoneer: Int = 0

    @SerializedName("kills_kit_mega_mega_scout")
    val killsKitMegaMegaScout: Int = 0

    @SerializedName("losses_kit_advanced_solo_enchanter")
    val lossesKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("deaths_kit_advanced_solo_enchanter")
    val deathsKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_enchanter")
    val survivedPlayersKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("solo_marksmanship")
    val soloMarksmanship: Int = 0

    @SerializedName("wins_kit_basic_solo_troll")
    val winsKitBasicSoloTroll: Int = 0

    @SerializedName("games_kit_basic_solo_troll")
    val gamesKitBasicSoloTroll: Int = 0

    @SerializedName("kit_mega_mega_armorer")
    val kitMegaMegaArmorer: Int = 0

    @SerializedName("losses_kit_mega_mega_armorer")
    val lossesKitMegaMegaArmorer: Int = 0

    @SerializedName("survived_players_kit_mega_mega_armorer")
    val survivedPlayersKitMegaMegaArmorer: Int = 0

    @SerializedName("deaths_kit_mega_mega_armorer")
    val deathsKitMegaMegaArmorer: Int = 0

    @SerializedName("kills_kit_mega_mega_armorer")
    val killsKitMegaMegaArmorer: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_hunter")
    val survivedPlayersKitAdvancedSoloHunter: Int = 0

    @SerializedName("deaths_kit_advanced_solo_hunter")
    val deathsKitAdvancedSoloHunter: Int = 0

    @SerializedName("kills_kit_advanced_solo_hunter")
    val killsKitAdvancedSoloHunter: Int = 0

    @SerializedName("losses_kit_advanced_solo_hunter")
    val lossesKitAdvancedSoloHunter: Int = 0

    @SerializedName("games_kit_defending_team_armorer")
    val gamesKitDefendingTeamArmorer: Int = 0

    @SerializedName("kit_mega_mega_baseball-player")
    val kitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("survived_players_kit_mega_mega_baseball-player")
    val survivedPlayersKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("wins_mega_normal")
    val winsMegaNormal: Int = 0

    @SerializedName("deaths_kit_mega_mega_baseball-player")
    val deathsKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("wins_kit_mega_mega_baseball-player")
    val winsKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("wins_mega")
    val winsMega: Int = 0

    @SerializedName("wins_solo_normal")
    val winsSoloNormal: Int = 0

    @SerializedName("survived_players_kit_basic_solo_fisherman")
    val survivedPlayersKitBasicSoloFisherman: Int = 0

    @SerializedName("deaths_kit_basic_solo_fisherman")
    val deathsKitBasicSoloFisherman: Int = 0

    @SerializedName("losses_kit_basic_solo_fisherman")
    val lossesKitBasicSoloFisherman: Int = 0

    @SerializedName("kills_kit_basic_solo_fisherman")
    val killsKitBasicSoloFisherman: Int = 0

    @SerializedName("games_kit_basic_solo_fisherman")
    val gamesKitBasicSoloFisherman: Int = 0

    @SerializedName("wins_kit_basic_solo_fisherman")
    val winsKitBasicSoloFisherman: Int = 0

    @SerializedName("games_kit_mining_team_speleologist")
    val gamesKitMiningTeamSpeleologist: Int = 0

    @SerializedName("wins_kit_mining_team_speleologist")
    val winsKitMiningTeamSpeleologist: Int = 0

    @SerializedName("losses_kit_advanced_solo_armorer")
    val lossesKitAdvancedSoloArmorer: Int = 0

    @SerializedName("kills_kit_advanced_solo_armorer")
    val killsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_armorer")
    val survivedPlayersKitAdvancedSoloArmorer: Int = 0

    @SerializedName("deaths_kit_advanced_solo_armorer")
    val deathsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("losses_kit_mega_mega_baseball-player")
    val lossesKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("extra_wheels")
    val extraWheels: Int = 0

    @SerializedName("losses_kit_advanced_solo_pyro")
    val lossesKitAdvancedSoloPyro: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_pyro")
    val survivedPlayersKitAdvancedSoloPyro: Int = 0

    @SerializedName("deaths_kit_advanced_solo_pyro")
    val deathsKitAdvancedSoloPyro: Int = 0

    @SerializedName("wins_kit_advanced_solo_pyro")
    val winsKitAdvancedSoloPyro: Int = 0

    @SerializedName("games_kit_advanced_solo_pyro")
    val gamesKitAdvancedSoloPyro: Int = 0

    @SerializedName("kills_kit_advanced_solo_pyro")
    val killsKitAdvancedSoloPyro: Int = 0

    @SerializedName("assists_kit_advanced_solo_pyro")
    val assistsKitAdvancedSoloPyro: Int = 0

    @SerializedName("solo_arrow_recovery")
    val soloArrowRecovery: Int = 0

    @SerializedName("mega_blazing_arrows")
    val megaBlazingArrows: Int = 0

    @SerializedName("assists_kit_basic_solo_fisherman")
    val assistsKitBasicSoloFisherman: Int = 0

    @SerializedName("mega_tank")
    val megaTank: Int = 0

    @SerializedName("kit_mega_mega_knight")
    val kitMegaMegaKnight: Int = 0

    @SerializedName("kills_kit_attacking_team_snowman")
    val killsKitAttackingTeamSnowman: Int = 0

    @SerializedName("survived_players_kit_attacking_team_snowman")
    val survivedPlayersKitAttackingTeamSnowman: Int = 0

    @SerializedName("deaths_kit_attacking_team_snowman")
    val deathsKitAttackingTeamSnowman: Int = 0

    @SerializedName("losses_kit_attacking_team_snowman")
    val lossesKitAttackingTeamSnowman: Int = 0

    @SerializedName("survived_players_kit_defending_team_guardian")
    val survivedPlayersKitDefendingTeamGuardian: Int = 0

    @SerializedName("losses_kit_defending_team_guardian")
    val lossesKitDefendingTeamGuardian: Int = 0

    @SerializedName("kills_kit_defending_team_guardian")
    val killsKitDefendingTeamGuardian: Int = 0

    @SerializedName("deaths_kit_defending_team_guardian")
    val deathsKitDefendingTeamGuardian: Int = 0

    @SerializedName("assists_kit_defending_team_guardian")
    val assistsKitDefendingTeamGuardian: Int = 0

    @SerializedName("survived_players_kit_defending_team_baseball-player")
    val survivedPlayersKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("losses_kit_defending_team_baseball-player")
    val lossesKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("deaths_kit_defending_team_baseball-player")
    val deathsKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("kills_kit_defending_team_baseball-player")
    val killsKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("assists_kit_defending_team_baseball-player")
    val assistsKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("wins_kit_defending_team_baseball-player")
    val winsKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("games_kit_defending_team_baseball-player")
    val gamesKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("kit_mega_mega_armorsmith")
    val kitMegaMegaArmorsmith: Int = 0

    @SerializedName("kills_kit_supporting_team_enchanter")
    val killsKitSupportingTeamEnchanter: Int = 0

    @SerializedName("survived_players_kit_supporting_team_enchanter")
    val survivedPlayersKitSupportingTeamEnchanter: Int = 0

    @SerializedName("deaths_kit_supporting_team_enchanter")
    val deathsKitSupportingTeamEnchanter: Int = 0

    @SerializedName("losses_kit_supporting_team_enchanter")
    val lossesKitSupportingTeamEnchanter: Int = 0

    @SerializedName("wins_team_normal")
    val winsTeamNormal: Int = 0

    @SerializedName("team_juggernaut")
    val teamJuggernaut: Int = 0

    @SerializedName("votes_Chronos")
    val votesChronos: Int = 0

    @SerializedName("assists_kit_advanced_solo_knight")
    val assistsKitAdvancedSoloKnight: Int = 0

    @SerializedName("solo_blazing_arrows")
    val soloBlazingArrows: Int = 0

    @SerializedName("kit_mega_mega_healer")
    val kitMegaMegaHealer: Int = 0

    @SerializedName("wins_kit_defending_team_armorer")
    val winsKitDefendingTeamArmorer: Int = 0

    @SerializedName("solo_speed_boost")
    val soloSpeedBoost: Int = 0

    @SerializedName("kills_monthly_b")
    val killsMonthlyB: Int = 0

    @SerializedName("kills_weekly_b")
    val killsWeeklyB: Int = 0

    @SerializedName("games_mega")
    val gamesMega: Int = 0

    @SerializedName("wins_kit_mega_mega_armorer")
    val winsKitMegaMegaArmorer: Int = 0

    @SerializedName("games_kit_mega_mega_armorer")
    val gamesKitMegaMegaArmorer: Int = 0

    @SerializedName("assists_kit_mega_mega_armorer")
    val assistsKitMegaMegaArmorer: Int = 0

    @SerializedName("kills_weekly_a")
    val killsWeeklyA: Int = 0

    @SerializedName("games_kit_basic_solo_default")
    val gamesKitBasicSoloDefault: Int = 0

    @SerializedName("wins_kit_basic_solo_default")
    val winsKitBasicSoloDefault: Int = 0

    @SerializedName("assists_kit_basic_solo_default")
    val assistsKitBasicSoloDefault: Int = 0

    @SerializedName("games_kit_mining_team_cannoneer")
    val gamesKitMiningTeamCannoneer: Int = 0

    @SerializedName("wins_kit_mining_team_cannoneer")
    val winsKitMiningTeamCannoneer: Int = 0

    @SerializedName("assists_kit_advanced_solo_armorer")
    val assistsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("wins_kit_advanced_solo_armorer")
    val winsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("games_kit_advanced_solo_armorer")
    val gamesKitAdvancedSoloArmorer: Int = 0

    @SerializedName("kills_monthly_a")
    val killsMonthlyA: Int = 0

    @SerializedName("kills_kit_advanced_solo_enchanter")
    val killsKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("harvesting_season")
    val harvestingSeason: Int = 0

    @SerializedName("kit_mega_mega_paladin")
    val kitMegaMegaPaladin: Int = 0

    @SerializedName("deaths_kit_mega_mega_knight")
    val deathsKitMegaMegaKnight: Int = 0

    @SerializedName("survived_players_kit_mega_mega_knight")
    val survivedPlayersKitMegaMegaKnight: Int = 0

    @SerializedName("losses_kit_mega_mega_knight")
    val lossesKitMegaMegaKnight: Int = 0

    @SerializedName("kills_kit_mega_mega_knight")
    val killsKitMegaMegaKnight: Int = 0

    @SerializedName("losses_kit_advanced_solo_cannoneer")
    val lossesKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("deaths_kit_advanced_solo_cannoneer")
    val deathsKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_cannoneer")
    val survivedPlayersKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("wins_kit_advanced_solo_cannoneer")
    val winsKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("assists_kit_advanced_solo_cannoneer")
    val assistsKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("kills_kit_advanced_solo_cannoneer")
    val killsKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("games_kit_advanced_solo_cannoneer")
    val gamesKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("games_kit_advanced_solo_enchanter")
    val gamesKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("wins_kit_mega_mega_knight")
    val winsKitMegaMegaKnight: Int = 0

    @SerializedName("assists_kit_mega_mega_knight")
    val assistsKitMegaMegaKnight: Int = 0

    @SerializedName("activeKit_RANKED")
    val activekitRanked: String = ""

    @SerializedName("winstreak_ranked")
    val winstreakRanked: Int = 0

    val killstreak: Int = 0

    @SerializedName("games_ranked")
    val gamesRanked: Int = 0

    @SerializedName("wins_ranked_normal")
    val winsRankedNormal: Int = 0

    @SerializedName("kills_kit_ranked_ranked_default")
    val killsKitRankedRankedDefault: Int = 0

    @SerializedName("kills_ranked_normal")
    val killsRankedNormal: Int = 0

    @SerializedName("killstreak_ranked")
    val killstreakRanked: Int = 0

    @SerializedName("games_kit_ranked_ranked_default")
    val gamesKitRankedRankedDefault: Int = 0

    @SerializedName("survived_players_ranked")
    val survivedPlayersRanked: Int = 0

    @SerializedName("kills_ranked")
    val killsRanked: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_default")
    val killstreakKitRankedRankedDefault: Int = 0

    val winstreak: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_default")
    val winstreakKitRankedRankedDefault: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_default")
    val survivedPlayersKitRankedRankedDefault: Int = 0

    @SerializedName("wins_kit_ranked_ranked_default")
    val winsKitRankedRankedDefault: Int = 0

    @SerializedName("wins_ranked")
    val winsRanked: Int = 0

    val highestKillstreak: Int = 0

    val highestWinstreak: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_default")
    val deathsKitRankedRankedDefault: Int = 0

    @SerializedName("losses_ranked")
    val lossesRanked: Int = 0

    @SerializedName("deaths_ranked_normal")
    val deathsRankedNormal: Int = 0

    @SerializedName("losses_kit_ranked_ranked_default")
    val lossesKitRankedRankedDefault: Int = 0

    @SerializedName("losses_ranked_normal")
    val lossesRankedNormal: Int = 0

    @SerializedName("deaths_ranked")
    val deathsRanked: Int = 0

    @SerializedName("assists_ranked")
    val assistsRanked: Int = 0

    @SerializedName("assists_kit_ranked_ranked_default")
    val assistsKitRankedRankedDefault: Int = 0

    @SerializedName("ranked_instant_smelting")
    val rankedInstantSmelting: Int = 0

    @SerializedName("team_nourishment")
    val teamNourishment: Int = 0

    @SerializedName("team_savior")
    val teamSavior: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_champion")
    val survivedPlayersKitRankedRankedChampion: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_champion")
    val killstreakKitRankedRankedChampion: Int = 0

    @SerializedName("wins_kit_ranked_ranked_champion")
    val winsKitRankedRankedChampion: Int = 0

    @SerializedName("kills_kit_ranked_ranked_champion")
    val killsKitRankedRankedChampion: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_champion")
    val winstreakKitRankedRankedChampion: Int = 0

    @SerializedName("games_kit_ranked_ranked_champion")
    val gamesKitRankedRankedChampion: Int = 0

    @SerializedName("losses_kit_ranked_ranked_champion")
    val lossesKitRankedRankedChampion: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_champion")
    val deathsKitRankedRankedChampion: Int = 0

    @SerializedName("mega_instant_smelting")
    val megaInstantSmelting: Int = 0

    @SerializedName("solo_knowledge")
    val soloKnowledge: Int = 0

    @SerializedName("killstreak_solo")
    val killstreakSolo: Int = 0

    @SerializedName("winstreak_kit_basic_solo_speleologist")
    val winstreakKitBasicSoloSpeleologist: Int = 0

    @SerializedName("winstreak_solo")
    val winstreakSolo: Int = 0

    @SerializedName("killstreak_kit_basic_solo_speleologist")
    val killstreakKitBasicSoloSpeleologist: Int = 0

    @SerializedName("killstreak_kit_basic_solo_armorsmith")
    val killstreakKitBasicSoloArmorsmith: Int = 0

    @SerializedName("winstreak_kit_basic_solo_armorsmith")
    val winstreakKitBasicSoloArmorsmith: Int = 0

    @SerializedName("winstreak_kit_advanced_solo_knight")
    val winstreakKitAdvancedSoloKnight: Int = 0

    @SerializedName("killstreak_kit_advanced_solo_knight")
    val killstreakKitAdvancedSoloKnight: Int = 0

    @SerializedName("mega_nourishment")
    val megaNourishment: Int = 0

    @SerializedName("assists_kit_ranked_ranked_champion")
    val assistsKitRankedRankedChampion: Int = 0

    @SerializedName("winstreak_kit_advanced_solo_pyro")
    val winstreakKitAdvancedSoloPyro: Int = 0

    @SerializedName("killstreak_kit_advanced_solo_pyro")
    val killstreakKitAdvancedSoloPyro: Int = 0

    @SerializedName("killstreak_kit_advanced_solo_farmer")
    val killstreakKitAdvancedSoloFarmer: Int = 0

    @SerializedName("winstreak_kit_advanced_solo_farmer")
    val winstreakKitAdvancedSoloFarmer: Int = 0

    @SerializedName("winstreak_kit_advanced_solo_cannoneer")
    val winstreakKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("killstreak_kit_advanced_solo_cannoneer")
    val killstreakKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("wins_kit_supporting_team_enchanter")
    val winsKitSupportingTeamEnchanter: Int = 0

    @SerializedName("games_kit_supporting_team_enchanter")
    val gamesKitSupportingTeamEnchanter: Int = 0

    @SerializedName("killstreak_kit_supporting_team_enchanter")
    val killstreakKitSupportingTeamEnchanter: Int = 0

    @SerializedName("killstreak_team")
    val killstreakTeam: Int = 0

    @SerializedName("winstreak_team")
    val winstreakTeam: Int = 0

    @SerializedName("winstreak_kit_supporting_team_enchanter")
    val winstreakKitSupportingTeamEnchanter: Int = 0

    @SerializedName("killstreak_kit_supporting_team_armorsmith")
    val killstreakKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("winstreak_kit_supporting_team_armorsmith")
    val winstreakKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("winstreak_kit_basic_solo_ecologist")
    val winstreakKitBasicSoloEcologist: Int = 0

    @SerializedName("killstreak_kit_basic_solo_ecologist")
    val killstreakKitBasicSoloEcologist: Int = 0

    @SerializedName("killstreak_kit_basic_solo_fisherman")
    val killstreakKitBasicSoloFisherman: Int = 0

    @SerializedName("winstreak_kit_basic_solo_fisherman")
    val winstreakKitBasicSoloFisherman: Int = 0

    @SerializedName("losses_kit_basic_solo_rookie")
    val lossesKitBasicSoloRookie: Int = 0

    @SerializedName("survived_players_kit_basic_solo_rookie")
    val survivedPlayersKitBasicSoloRookie: Int = 0

    @SerializedName("kills_kit_basic_solo_rookie")
    val killsKitBasicSoloRookie: Int = 0

    @SerializedName("deaths_kit_basic_solo_rookie")
    val deathsKitBasicSoloRookie: Int = 0

    @SerializedName("games_kit_basic_solo_rookie")
    val gamesKitBasicSoloRookie: Int = 0

    @SerializedName("wins_kit_basic_solo_rookie")
    val winsKitBasicSoloRookie: Int = 0

    @SerializedName("winstreak_kit_basic_solo_rookie")
    val winstreakKitBasicSoloRookie: Int = 0

    @SerializedName("killstreak_kit_basic_solo_rookie")
    val killstreakKitBasicSoloRookie: Int = 0

    @SerializedName("assists_kit_basic_solo_rookie")
    val assistsKitBasicSoloRookie: Int = 0

    @SerializedName("killstreak_kit_mega_mega_armorer")
    val killstreakKitMegaMegaArmorer: Int = 0

    @SerializedName("winstreak_kit_mega_mega_armorer")
    val winstreakKitMegaMegaArmorer: Int = 0

    @SerializedName("winstreak_mega")
    val winstreakMega: Int = 0

    @SerializedName("killstreak_mega")
    val killstreakMega: Int = 0

    @SerializedName("killstreak_kit_defending_team_armorer")
    val killstreakKitDefendingTeamArmorer: Int = 0

    @SerializedName("winstreak_kit_defending_team_armorer")
    val winstreakKitDefendingTeamArmorer: Int = 0

    @SerializedName("killstreak_kit_attacking_team_knight")
    val killstreakKitAttackingTeamKnight: Int = 0

    @SerializedName("winstreak_kit_attacking_team_knight")
    val winstreakKitAttackingTeamKnight: Int = 0

    @SerializedName("team_fat")
    val teamFat: Int = 0

    @SerializedName("solo_revenge")
    val soloRevenge: Int = 0

    @SerializedName("team_knowledge")
    val teamKnowledge: Int = 0

    @SerializedName("solo_nourishment")
    val soloNourishment: Int = 0

    @SerializedName("killstreak_kit_basic_solo_default")
    val killstreakKitBasicSoloDefault: Int = 0

    @SerializedName("winstreak_kit_basic_solo_default")
    val winstreakKitBasicSoloDefault: Int = 0

    @SerializedName("killstreak_kit_mining_team_speleologist")
    val killstreakKitMiningTeamSpeleologist: Int = 0

    @SerializedName("winstreak_kit_mining_team_speleologist")
    val winstreakKitMiningTeamSpeleologist: Int = 0

    @SerializedName("winstreak_kit_advanced_solo_armorer")
    val winstreakKitAdvancedSoloArmorer: Int = 0

    @SerializedName("killstreak_kit_advanced_solo_armorer")
    val killstreakKitAdvancedSoloArmorer: Int = 0

    @SerializedName("winstreak_kit_basic_solo_snowman")
    val winstreakKitBasicSoloSnowman: Int = 0

    @SerializedName("killstreak_kit_basic_solo_snowman")
    val killstreakKitBasicSoloSnowman: Int = 0

    @SerializedName("deaths_kit_attacking_team_enderman")
    val deathsKitAttackingTeamEnderman: Int = 0

    @SerializedName("losses_kit_attacking_team_enderman")
    val lossesKitAttackingTeamEnderman: Int = 0

    @SerializedName("survived_players_kit_attacking_team_enderman")
    val survivedPlayersKitAttackingTeamEnderman: Int = 0

    @SerializedName("assists_kit_attacking_team_enderman")
    val assistsKitAttackingTeamEnderman: Int = 0

    @SerializedName("killstreak_kit_mega_mega_knight")
    val killstreakKitMegaMegaKnight: Int = 0

    @SerializedName("winstreak_kit_mega_mega_knight")
    val winstreakKitMegaMegaKnight: Int = 0

    @SerializedName("games_kit_mega_mega_knight")
    val gamesKitMegaMegaKnight: Int = 0

    @SerializedName("winstreak_kit_basic_solo_troll")
    val winstreakKitBasicSoloTroll: Int = 0

    @SerializedName("killstreak_kit_basic_solo_troll")
    val killstreakKitBasicSoloTroll: Int = 0

    @SerializedName("votes_Haunted")
    val votesHaunted: Int = 0

    @SerializedName("solo_annoy-o-mite")
    val soloAnnoyOMite: Int = 0

    @SerializedName("winstreak_kit_defending_team_baseball-player")
    val winstreakKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("killstreak_kit_defending_team_baseball-player")
    val killstreakKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("solo_fat")
    val soloFat: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_armorer")
    val deathsKitRankedRankedArmorer: Int = 0

    @SerializedName("losses_kit_ranked_ranked_armorer")
    val lossesKitRankedRankedArmorer: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_armorer")
    val survivedPlayersKitRankedRankedArmorer: Int = 0

    @SerializedName("kills_kit_ranked_ranked_armorer")
    val killsKitRankedRankedArmorer: Int = 0

    @SerializedName("wins_kit_ranked_ranked_armorer")
    val winsKitRankedRankedArmorer: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_armorer")
    val winstreakKitRankedRankedArmorer: Int = 0

    @SerializedName("games_kit_ranked_ranked_armorer")
    val gamesKitRankedRankedArmorer: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_armorer")
    val killstreakKitRankedRankedArmorer: Int = 0

    @SerializedName("kills_kit_attacking_team_enderman")
    val killsKitAttackingTeamEnderman: Int = 0

    @SerializedName("wins_kit_advanced_solo_enchanter")
    val winsKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("winstreak_kit_advanced_solo_enchanter")
    val winstreakKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("killstreak_kit_advanced_solo_enchanter")
    val killstreakKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("assists_kit_advanced_solo_enchanter")
    val assistsKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("mystery_boxes_season_one")
    val mysteryBoxesSeasonOne: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_pyromancer")
    val deathsKitRankedRankedPyromancer: Int = 0

    @SerializedName("losses_kit_ranked_ranked_pyromancer")
    val lossesKitRankedRankedPyromancer: Int = 0

    @SerializedName("winstreak_kit_mining_team_cannoneer")
    val winstreakKitMiningTeamCannoneer: Int = 0

    @SerializedName("killstreak_kit_mining_team_cannoneer")
    val killstreakKitMiningTeamCannoneer: Int = 0

    @SerializedName("killstreak_kit_supporting_team_healer")
    val killstreakKitSupportingTeamHealer: Int = 0

    @SerializedName("winstreak_kit_supporting_team_healer")
    val winstreakKitSupportingTeamHealer: Int = 0

    @SerializedName("winstreak_kit_advanced_solo_enderman")
    val winstreakKitAdvancedSoloEnderman: Int = 0

    @SerializedName("wins_kit_advanced_solo_enderman")
    val winsKitAdvancedSoloEnderman: Int = 0

    @SerializedName("kills_kit_advanced_solo_enderman")
    val killsKitAdvancedSoloEnderman: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_enderman")
    val survivedPlayersKitAdvancedSoloEnderman: Int = 0

    @SerializedName("games_kit_advanced_solo_enderman")
    val gamesKitAdvancedSoloEnderman: Int = 0

    @SerializedName("killstreak_kit_advanced_solo_enderman")
    val killstreakKitAdvancedSoloEnderman: Int = 0

    @SerializedName("losses_kit_advanced_solo_enderman")
    val lossesKitAdvancedSoloEnderman: Int = 0

    @SerializedName("deaths_kit_advanced_solo_enderman")
    val deathsKitAdvancedSoloEnderman: Int = 0

    @SerializedName("deaths_kit_enderchest_solo_enderchest")
    val deathsKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("losses_kit_enderchest_solo_enderchest")
    val lossesKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("survived_players_kit_enderchest_solo_enderchest")
    val survivedPlayersKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("games_kit_enderchest_solo_enderchest")
    val gamesKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("kills_kit_enderchest_solo_enderchest")
    val killsKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("winstreak_kit_enderchest_solo_enderchest")
    val winstreakKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("wins_kit_enderchest_solo_enderchest")
    val winsKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("killstreak_kit_enderchest_solo_enderchest")
    val killstreakKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("assists_kit_enderchest_solo_enderchest")
    val assistsKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("games_kit_defending_team_guardian")
    val gamesKitDefendingTeamGuardian: Int = 0

    @SerializedName("losses_kit_supporting_team_rookie")
    val lossesKitSupportingTeamRookie: Int = 0

    @SerializedName("survived_players_kit_supporting_team_rookie")
    val survivedPlayersKitSupportingTeamRookie: Int = 0

    @SerializedName("deaths_kit_supporting_team_rookie")
    val deathsKitSupportingTeamRookie: Int = 0

    @SerializedName("kills_kit_supporting_team_rookie")
    val killsKitSupportingTeamRookie: Int = 0

    @SerializedName("assists_kit_ranked_ranked_armorer")
    val assistsKitRankedRankedArmorer: Int = 0

    @SerializedName("assists_kit_advanced_solo_enderman")
    val assistsKitAdvancedSoloEnderman: Int = 0

    @SerializedName("winstreak_kit_supporting_team_rookie")
    val winstreakKitSupportingTeamRookie: Int = 0

    @SerializedName("wins_kit_supporting_team_rookie")
    val winsKitSupportingTeamRookie: Int = 0

    @SerializedName("games_kit_supporting_team_rookie")
    val gamesKitSupportingTeamRookie: Int = 0

    @SerializedName("assists_kit_supporting_team_rookie")
    val assistsKitSupportingTeamRookie: Int = 0

    @SerializedName("killstreak_kit_supporting_team_rookie")
    val killstreakKitSupportingTeamRookie: Int = 0

    @SerializedName("wins_kit_attacking_team_enderman")
    val winsKitAttackingTeamEnderman: Int = 0

    @SerializedName("games_kit_attacking_team_enderman")
    val gamesKitAttackingTeamEnderman: Int = 0

    @SerializedName("winstreak_kit_attacking_team_enderman")
    val winstreakKitAttackingTeamEnderman: Int = 0

    @SerializedName("games_kit_ranked_ranked_pyromancer")
    val gamesKitRankedRankedPyromancer: Int = 0

    @SerializedName("kills_kit_ranked_ranked_pyromancer")
    val killsKitRankedRankedPyromancer: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_pyromancer")
    val survivedPlayersKitRankedRankedPyromancer: Int = 0

    @SerializedName("losses_kit_ranked_ranked_athlete")
    val lossesKitRankedRankedAthlete: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_athlete")
    val deathsKitRankedRankedAthlete: Int = 0

    @SerializedName("team_annoy-o-mite")
    val teamAnnoyOMite: Int = 0

    @SerializedName("mega_notoriety")
    val megaNotoriety: Int = 0

    @SerializedName("kills_kit_ranked_ranked_athlete")
    val killsKitRankedRankedAthlete: Int = 0

    @SerializedName("wins_kit_ranked_ranked_athlete")
    val winsKitRankedRankedAthlete: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_athlete")
    val survivedPlayersKitRankedRankedAthlete: Int = 0

    @SerializedName("games_kit_ranked_ranked_athlete")
    val gamesKitRankedRankedAthlete: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_athlete")
    val killstreakKitRankedRankedAthlete: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_athlete")
    val winstreakKitRankedRankedAthlete: Int = 0

    @SerializedName("games_kit_ranked_ranked_scout")
    val gamesKitRankedRankedScout: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_scout")
    val survivedPlayersKitRankedRankedScout: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_scout")
    val winstreakKitRankedRankedScout: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_scout")
    val killstreakKitRankedRankedScout: Int = 0

    @SerializedName("kills_kit_ranked_ranked_scout")
    val killsKitRankedRankedScout: Int = 0

    @SerializedName("wins_kit_ranked_ranked_scout")
    val winsKitRankedRankedScout: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_scout")
    val deathsKitRankedRankedScout: Int = 0

    @SerializedName("losses_kit_ranked_ranked_scout")
    val lossesKitRankedRankedScout: Int = 0

    @SerializedName("assists_kit_ranked_ranked_scout")
    val assistsKitRankedRankedScout: Int = 0

    val activeVictoryDance: String = ""

    @SerializedName("votes_Agni Temple")
    val votesAgniTemple: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_pyromancer")
    val killstreakKitRankedRankedPyromancer: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_pyromancer")
    val winstreakKitRankedRankedPyromancer: Int = 0

    @SerializedName("wins_kit_ranked_ranked_pyromancer")
    val winsKitRankedRankedPyromancer: Int = 0

    @SerializedName("assists_kit_attacking_team_snowman")
    val assistsKitAttackingTeamSnowman: Int = 0

    @SerializedName("team_marksmanship")
    val teamMarksmanship: Int = 0

    @SerializedName("votes_Eirene")
    val votesEirene: Int = 0

    @SerializedName("losses_kit_mega_mega_armorsmith")
    val lossesKitMegaMegaArmorsmith: Int = 0

    @SerializedName("deaths_kit_mega_mega_armorsmith")
    val deathsKitMegaMegaArmorsmith: Int = 0

    @SerializedName("survived_players_kit_mega_mega_armorsmith")
    val survivedPlayersKitMegaMegaArmorsmith: Int = 0

    @SerializedName("assists_kit_ranked_ranked_pyromancer")
    val assistsKitRankedRankedPyromancer: Int = 0

    @SerializedName("assists_kit_mega_mega_armorsmith")
    val assistsKitMegaMegaArmorsmith: Int = 0

    @SerializedName("games_kit_mega_mega_cannoneer")
    val gamesKitMegaMegaCannoneer: Int = 0

    @SerializedName("winstreak_kit_mega_mega_cannoneer")
    val winstreakKitMegaMegaCannoneer: Int = 0

    @SerializedName("wins_kit_mega_mega_cannoneer")
    val winsKitMegaMegaCannoneer: Int = 0

    @SerializedName("assists_kit_mega_mega_paladin")
    val assistsKitMegaMegaPaladin: Int = 0

    @SerializedName("games_kit_mega_mega_paladin")
    val gamesKitMegaMegaPaladin: Int = 0

    @SerializedName("kills_kit_mega_mega_paladin")
    val killsKitMegaMegaPaladin: Int = 0

    @SerializedName("wins_kit_mega_mega_paladin")
    val winsKitMegaMegaPaladin: Int = 0

    @SerializedName("survived_players_kit_mega_mega_paladin")
    val survivedPlayersKitMegaMegaPaladin: Int = 0

    @SerializedName("killstreak_kit_mega_mega_paladin")
    val killstreakKitMegaMegaPaladin: Int = 0

    @SerializedName("winstreak_kit_mega_mega_paladin")
    val winstreakKitMegaMegaPaladin: Int = 0

    @SerializedName("killstreak_kit_mega_mega_cannoneer")
    val killstreakKitMegaMegaCannoneer: Int = 0

    val activeKillEffect: String = ""

    @SerializedName("deaths_kit_ranked_ranked_healer")
    val deathsKitRankedRankedHealer: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_healer")
    val survivedPlayersKitRankedRankedHealer: Int = 0

    @SerializedName("losses_kit_ranked_ranked_healer")
    val lossesKitRankedRankedHealer: Int = 0

    @SerializedName("games_kit_ranked_ranked_healer")
    val gamesKitRankedRankedHealer: Int = 0

    @SerializedName("kills_kit_ranked_ranked_healer")
    val killsKitRankedRankedHealer: Int = 0

    @SerializedName("games_kit_blacksmith_ranked_blacksmith")
    val gamesKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("killstreak_kit_blacksmith_ranked_blacksmith")
    val killstreakKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("wins_kit_blacksmith_ranked_blacksmith")
    val winsKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("survived_players_kit_blacksmith_ranked_blacksmith")
    val survivedPlayersKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("winstreak_kit_blacksmith_ranked_blacksmith")
    val winstreakKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("kills_kit_blacksmith_ranked_blacksmith")
    val killsKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("losses_kit_blacksmith_ranked_blacksmith")
    val lossesKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("deaths_kit_blacksmith_ranked_blacksmith")
    val deathsKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("assists_kit_attacking_team_scout")
    val assistsKitAttackingTeamScout: Int = 0

    val activeProjectileTrail: String = ""

    @SerializedName("mega_marksmanship")
    val megaMarksmanship: Int = 0

    @SerializedName("votes_Birdhouse")
    val votesBirdhouse: Int = 0

    @SerializedName("games_kit_ranked_ranked_bowman")
    val gamesKitRankedRankedBowman: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_bowman")
    val survivedPlayersKitRankedRankedBowman: Int = 0

    @SerializedName("kills_kit_ranked_ranked_bowman")
    val killsKitRankedRankedBowman: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_bowman")
    val deathsKitRankedRankedBowman: Int = 0

    @SerializedName("losses_kit_ranked_ranked_bowman")
    val lossesKitRankedRankedBowman: Int = 0

    @SerializedName("votes_Sanctum")
    val votesSanctum: Int = 0

    @SerializedName("games_kit_attacking_team_snowman")
    val gamesKitAttackingTeamSnowman: Int = 0

    @SerializedName("quickjoin_uses_total")
    val quickjoinUsesTotal: Int = 0

    @SerializedName("quickjoin_uses_Martian")
    val quickjoinUsesMartian: Int = 0

    @SerializedName("quickjoin_uses_Jinzhou")
    val quickjoinUsesJinzhou: Int = 0

    @SerializedName("quickjoin_uses_Sentinel")
    val quickjoinUsesSentinel: Int = 0

    @SerializedName("quickjoin_uses_Aegis")
    val quickjoinUsesAegis: Int = 0

    @SerializedName("quickjoin_uses_Tribute")
    val quickjoinUsesTribute: Int = 0

    @SerializedName("quickjoin_uses_random")
    val quickjoinUsesRandom: Int = 0

    @SerializedName("quickjoin_uses_Plateau")
    val quickjoinUsesPlateau: Int = 0

    @SerializedName("quickjoin_uses_Onionring 2")
    val quickjoinUsesOnionring2: Int = 0

    @SerializedName("quickjoin_uses_Temple")
    val quickjoinUsesTemple: Int = 0

    @SerializedName("quickjoin_uses_LongIsland")
    val quickjoinUsesLongisland: Int = 0

    @SerializedName("quickjoin_uses_Dwarven")
    val quickjoinUsesDwarven: Int = 0

    @SerializedName("quickjoin_uses_Crumble")
    val quickjoinUsesCrumble: Int = 0

    @SerializedName("quickjoin_uses_Frostbite")
    val quickjoinUsesFrostbite: Int = 0

    @SerializedName("quickjoin_uses_Sanctum")
    val quickjoinUsesSanctum: Int = 0

    @SerializedName("quickjoin_uses_Shire")
    val quickjoinUsesShire: Int = 0

    @SerializedName("quickjoin_uses_Tundra")
    val quickjoinUsesTundra: Int = 0

    @SerializedName("quickjoin_uses_Towers")
    val quickjoinUsesTowers: Int = 0

    @SerializedName("quickjoin_uses_Railroad")
    val quickjoinUsesRailroad: Int = 0

    @SerializedName("quickjoin_uses_Siege")
    val quickjoinUsesSiege: Int = 0

    @SerializedName("quickjoin_uses_Tiki")
    val quickjoinUsesTiki: Int = 0

    @SerializedName("quickjoin_uses_Strata")
    val quickjoinUsesStrata: Int = 0

    @SerializedName("quickjoin_uses_Atuin")
    val quickjoinUsesAtuin: Int = 0

    @SerializedName("quickjoin_uses_Tribal")
    val quickjoinUsesTribal: Int = 0

    @SerializedName("quickjoin_uses_Entangled")
    val quickjoinUsesEntangled: Int = 0

    @SerializedName("votes_Meteor")
    val votesMeteor: Int = 0

    @SerializedName("losses_kit_basic_solo_pharaoh")
    val lossesKitBasicSoloPharaoh: Int = 0

    @SerializedName("deaths_kit_basic_solo_pharaoh")
    val deathsKitBasicSoloPharaoh: Int = 0

    @SerializedName("assists_kit_ranked_ranked_athlete")
    val assistsKitRankedRankedAthlete: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_healer")
    val winstreakKitRankedRankedHealer: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_healer")
    val killstreakKitRankedRankedHealer: Int = 0

    @SerializedName("wins_kit_ranked_ranked_healer")
    val winsKitRankedRankedHealer: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_magician")
    val deathsKitRankedRankedMagician: Int = 0

    @SerializedName("losses_kit_ranked_ranked_magician")
    val lossesKitRankedRankedMagician: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_magician")
    val survivedPlayersKitRankedRankedMagician: Int = 0

    @SerializedName("games_kit_ranked_ranked_magician")
    val gamesKitRankedRankedMagician: Int = 0

    @SerializedName("wins_kit_ranked_ranked_magician")
    val winsKitRankedRankedMagician: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_magician")
    val winstreakKitRankedRankedMagician: Int = 0

    @SerializedName("kills_kit_ranked_ranked_magician")
    val killsKitRankedRankedMagician: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_magician")
    val killstreakKitRankedRankedMagician: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_armorer")
    val fastestWinKitRankedRankedArmorer: Int = 0

    @SerializedName("fastest_win")
    val fastestWin: Int = 0

    @SerializedName("fastest_win_ranked")
    val fastestWinRanked: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_armorer")
    val meleeKillsKitRankedRankedArmorer: Int = 0

    @SerializedName("chests_opened_ranked")
    val chestsOpenedRanked: Int = 0

    @SerializedName("time_played_ranked")
    val timePlayedRanked: Int = 0

    @SerializedName("void_kills")
    val voidKills: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_armorer")
    val timePlayedKitRankedRankedArmorer: Int = 0

    @SerializedName("chests_opened")
    val chestsOpened: Int = 0

    @SerializedName("melee_kills_ranked")
    val meleeKillsRanked: Int = 0

    @SerializedName("melee_kills")
    val meleeKills: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_armorer")
    val voidKillsKitRankedRankedArmorer: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_armorer")
    val chestsOpenedKitRankedRankedArmorer: Int = 0

    @SerializedName("void_kills_ranked")
    val voidKillsRanked: Int = 0

    @SerializedName("time_played")
    val timePlayed: Int = 0

    @SerializedName("most_kills_game")
    val mostKillsGame: Int = 0

    @SerializedName("most_kills_game_ranked")
    val mostKillsGameRanked: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_armorer")
    val mostKillsGameKitRankedRankedArmorer: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_champion")
    val chestsOpenedKitRankedRankedChampion: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_champion")
    val timePlayedKitRankedRankedChampion: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_scout")
    val mostKillsGameKitRankedRankedScout: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_scout")
    val timePlayedKitRankedRankedScout: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_scout")
    val chestsOpenedKitRankedRankedScout: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_scout")
    val meleeKillsKitRankedRankedScout: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_champion")
    val mostKillsGameKitRankedRankedChampion: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_champion")
    val meleeKillsKitRankedRankedChampion: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_scout")
    val fastestWinKitRankedRankedScout: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_scout")
    val voidKillsKitRankedRankedScout: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_pyromancer")
    val fastestWinKitRankedRankedPyromancer: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_pyromancer")
    val meleeKillsKitRankedRankedPyromancer: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_pyromancer")
    val mostKillsGameKitRankedRankedPyromancer: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_pyromancer")
    val timePlayedKitRankedRankedPyromancer: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_pyromancer")
    val chestsOpenedKitRankedRankedPyromancer: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_pyromancer")
    val voidKillsKitRankedRankedPyromancer: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_champion")
    val voidKillsKitRankedRankedChampion: Int = 0

    @SerializedName("mega_lucky_charm")
    val megaLuckyCharm: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_champion")
    val fastestWinKitRankedRankedChampion: Int = 0

    @SerializedName("survived_players_kit_basic_solo_scout")
    val survivedPlayersKitBasicSoloScout: Int = 0

    @SerializedName("chests_opened_solo")
    val chestsOpenedSolo: Int = 0

    @SerializedName("losses_kit_basic_solo_scout")
    val lossesKitBasicSoloScout: Int = 0

    @SerializedName("time_played_solo")
    val timePlayedSolo: Int = 0

    @SerializedName("deaths_kit_basic_solo_scout")
    val deathsKitBasicSoloScout: Int = 0

    @SerializedName("time_played_kit_basic_solo_scout")
    val timePlayedKitBasicSoloScout: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_scout")
    val chestsOpenedKitBasicSoloScout: Int = 0

    @SerializedName("time_played_team")
    val timePlayedTeam: Int = 0

    @SerializedName("time_played_kit_defending_team_armorer")
    val timePlayedKitDefendingTeamArmorer: Int = 0

    @SerializedName("melee_kills_team")
    val meleeKillsTeam: Int = 0

    @SerializedName("chests_opened_kit_mining_team_speleologist")
    val chestsOpenedKitMiningTeamSpeleologist: Int = 0

    @SerializedName("void_kills_kit_mining_team_speleologist")
    val voidKillsKitMiningTeamSpeleologist: Int = 0

    @SerializedName("most_kills_game_team")
    val mostKillsGameTeam: Int = 0

    @SerializedName("melee_kills_kit_mining_team_speleologist")
    val meleeKillsKitMiningTeamSpeleologist: Int = 0

    @SerializedName("time_played_kit_mining_team_speleologist")
    val timePlayedKitMiningTeamSpeleologist: Int = 0

    @SerializedName("most_kills_game_kit_mining_team_speleologist")
    val mostKillsGameKitMiningTeamSpeleologist: Int = 0

    @SerializedName("chests_opened_team")
    val chestsOpenedTeam: Int = 0

    @SerializedName("void_kills_team")
    val voidKillsTeam: Int = 0

    @SerializedName("most_kills_game_kit_defending_team_armorer")
    val mostKillsGameKitDefendingTeamArmorer: Int = 0

    @SerializedName("chests_opened_kit_defending_team_armorer")
    val chestsOpenedKitDefendingTeamArmorer: Int = 0

    @SerializedName("void_kills_kit_defending_team_armorer")
    val voidKillsKitDefendingTeamArmorer: Int = 0

    @SerializedName("fastest_win_team")
    val fastestWinTeam: Int = 0

    @SerializedName("fastest_win_kit_mining_team_speleologist")
    val fastestWinKitMiningTeamSpeleologist: Int = 0

    @SerializedName("longest_bow_shot_team")
    val longestBowShotTeam: Int = 0

    @SerializedName("longest_bow_shot")
    val longestBowShot: Int = 0

    @SerializedName("longest_bow_shot_kit_mining_team_speleologist")
    val longestBowShotKitMiningTeamSpeleologist: Int = 0

    @SerializedName("arrows_hit_kit_mining_team_speleologist")
    val arrowsHitKitMiningTeamSpeleologist: Int = 0

    @SerializedName("arrows_shot_team")
    val arrowsShotTeam: Int = 0

    @SerializedName("arrows_hit_team")
    val arrowsHitTeam: Int = 0

    @SerializedName("arrows_shot_kit_mining_team_speleologist")
    val arrowsShotKitMiningTeamSpeleologist: Int = 0

    @SerializedName("time_played_kit_attacking_team_knight")
    val timePlayedKitAttackingTeamKnight: Int = 0

    @SerializedName("void_kills_kit_attacking_team_knight")
    val voidKillsKitAttackingTeamKnight: Int = 0

    @SerializedName("most_kills_game_kit_attacking_team_knight")
    val mostKillsGameKitAttackingTeamKnight: Int = 0

    @SerializedName("chests_opened_kit_attacking_team_knight")
    val chestsOpenedKitAttackingTeamKnight: Int = 0

    @SerializedName("melee_kills_kit_attacking_team_knight")
    val meleeKillsKitAttackingTeamKnight: Int = 0

    @SerializedName("melee_kills_solo")
    val meleeKillsSolo: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_armorer")
    val chestsOpenedKitAdvancedSoloArmorer: Int = 0

    @SerializedName("most_kills_game_kit_advanced_solo_armorer")
    val mostKillsGameKitAdvancedSoloArmorer: Int = 0

    @SerializedName("most_kills_game_solo")
    val mostKillsGameSolo: Int = 0

    @SerializedName("melee_kills_kit_advanced_solo_armorer")
    val meleeKillsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("time_played_kit_advanced_solo_armorer")
    val timePlayedKitAdvancedSoloArmorer: Int = 0

    @SerializedName("fastest_win_kit_defending_team_armorer")
    val fastestWinKitDefendingTeamArmorer: Int = 0

    @SerializedName("melee_kills_kit_defending_team_armorer")
    val meleeKillsKitDefendingTeamArmorer: Int = 0

    @SerializedName("most_kills_game_kit_advanced_solo_knight")
    val mostKillsGameKitAdvancedSoloKnight: Int = 0

    @SerializedName("time_played_kit_advanced_solo_knight")
    val timePlayedKitAdvancedSoloKnight: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_knight")
    val chestsOpenedKitAdvancedSoloKnight: Int = 0

    @SerializedName("melee_kills_kit_advanced_solo_knight")
    val meleeKillsKitAdvancedSoloKnight: Int = 0

    @SerializedName("kills_kit_basic_solo_scout")
    val killsKitBasicSoloScout: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_scout")
    val mostKillsGameKitBasicSoloScout: Int = 0

    @SerializedName("void_kills_solo")
    val voidKillsSolo: Int = 0

    @SerializedName("void_kills_kit_basic_solo_scout")
    val voidKillsKitBasicSoloScout: Int = 0

    @SerializedName("fastest_win_kit_basic_solo_scout")
    val fastestWinKitBasicSoloScout: Int = 0

    @SerializedName("fastest_win_solo")
    val fastestWinSolo: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_scout")
    val meleeKillsKitBasicSoloScout: Int = 0

    @SerializedName("wins_kit_basic_solo_scout")
    val winsKitBasicSoloScout: Int = 0

    @SerializedName("winstreak_kit_basic_solo_scout")
    val winstreakKitBasicSoloScout: Int = 0

    @SerializedName("killstreak_kit_basic_solo_scout")
    val killstreakKitBasicSoloScout: Int = 0

    @SerializedName("games_kit_basic_solo_scout")
    val gamesKitBasicSoloScout: Int = 0

    @SerializedName("assists_kit_basic_solo_scout")
    val assistsKitBasicSoloScout: Int = 0

    @SerializedName("longest_bow_shot_kit_basic_solo_scout")
    val longestBowShotKitBasicSoloScout: Int = 0

    @SerializedName("longest_bow_shot_solo")
    val longestBowShotSolo: Int = 0

    @SerializedName("arrows_hit_solo")
    val arrowsHitSolo: Int = 0

    @SerializedName("arrows_shot_kit_basic_solo_scout")
    val arrowsShotKitBasicSoloScout: Int = 0

    @SerializedName("arrows_hit_kit_basic_solo_scout")
    val arrowsHitKitBasicSoloScout: Int = 0

    @SerializedName("arrows_shot_solo")
    val arrowsShotSolo: Int = 0

    @SerializedName("mega_bridger")
    val megaBridger: Int = 0

    @SerializedName("team_bridger")
    val teamBridger: Int = 0

    @SerializedName("most_kills_game_kit_supporting_team_armorsmith")
    val mostKillsGameKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("chests_opened_kit_supporting_team_armorsmith")
    val chestsOpenedKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("time_played_kit_supporting_team_armorsmith")
    val timePlayedKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("melee_kills_kit_supporting_team_armorsmith")
    val meleeKillsKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("time_played_kit_mega_mega_cannoneer")
    val timePlayedKitMegaMegaCannoneer: Int = 0

    @SerializedName("chests_opened_mega")
    val chestsOpenedMega: Int = 0

    @SerializedName("time_played_mega")
    val timePlayedMega: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_cannoneer")
    val chestsOpenedKitMegaMegaCannoneer: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_armorer")
    val meleeKillsKitMegaMegaArmorer: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_armorer")
    val chestsOpenedKitMegaMegaArmorer: Int = 0

    @SerializedName("most_kills_game_mega")
    val mostKillsGameMega: Int = 0

    @SerializedName("melee_kills_mega")
    val meleeKillsMega: Int = 0

    @SerializedName("most_kills_game_kit_mega_mega_armorer")
    val mostKillsGameKitMegaMegaArmorer: Int = 0

    @SerializedName("void_kills_mega")
    val voidKillsMega: Int = 0

    @SerializedName("void_kills_kit_mega_mega_armorer")
    val voidKillsKitMegaMegaArmorer: Int = 0

    @SerializedName("time_played_kit_mega_mega_armorer")
    val timePlayedKitMegaMegaArmorer: Int = 0

    @SerializedName("most_kills_game_kit_mega_mega_cannoneer")
    val mostKillsGameKitMegaMegaCannoneer: Int = 0

    @SerializedName("mob_kills")
    val mobKills: Int = 0

    @SerializedName("mob_kills_mega")
    val mobKillsMega: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_cannoneer")
    val meleeKillsKitMegaMegaCannoneer: Int = 0

    @SerializedName("mob_kills_kit_mega_mega_cannoneer")
    val mobKillsKitMegaMegaCannoneer: Int = 0

    @SerializedName("fastest_win_kit_advanced_solo_armorer")
    val fastestWinKitAdvancedSoloArmorer: Int = 0

    @SerializedName("void_kills_kit_advanced_solo_armorer")
    val voidKillsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_magician")
    val timePlayedKitRankedRankedMagician: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_magician")
    val chestsOpenedKitRankedRankedMagician: Int = 0

    @SerializedName("longest_bow_shot_kit_advanced_solo_knight")
    val longestBowShotKitAdvancedSoloKnight: Int = 0

    @SerializedName("arrows_hit_kit_advanced_solo_knight")
    val arrowsHitKitAdvancedSoloKnight: Int = 0

    @SerializedName("arrows_shot_kit_advanced_solo_knight")
    val arrowsShotKitAdvancedSoloKnight: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_speleologist")
    val meleeKillsKitBasicSoloSpeleologist: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_speleologist")
    val mostKillsGameKitBasicSoloSpeleologist: Int = 0

    @SerializedName("time_played_kit_basic_solo_speleologist")
    val timePlayedKitBasicSoloSpeleologist: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_speleologist")
    val chestsOpenedKitBasicSoloSpeleologist: Int = 0

    @SerializedName("longest_bow_shot_kit_advanced_solo_armorer")
    val longestBowShotKitAdvancedSoloArmorer: Int = 0

    @SerializedName("arrows_hit_kit_advanced_solo_armorer")
    val arrowsHitKitAdvancedSoloArmorer: Int = 0

    @SerializedName("arrows_shot_kit_advanced_solo_armorer")
    val arrowsShotKitAdvancedSoloArmorer: Int = 0

    @SerializedName("void_kills_kit_advanced_solo_knight")
    val voidKillsKitAdvancedSoloKnight: Int = 0

    @SerializedName("solo_lucky_charm")
    val soloLuckyCharm: Int = 0

    @SerializedName("kit_ranked_ranked_armorer_inventory_auto_equip_armor")
    val kitRankedRankedArmorerInventoryAutoEquipArmor: Boolean = false

    @SerializedName("kit_ranked_ranked_armorer_inventory")
    val kitRankedRankedArmorerInventory: Map<String, Any> = Collections.emptyMap()

    @SerializedName("kit_ranked_ranked_champion_inventory")
    val kitRankedRankedChampionInventory: Map<String, Any> = Collections.emptyMap()

    @SerializedName("fastest_win_kit_basic_solo_energix")
    val fastestWinKitBasicSoloEnergix: Int = 0

    @SerializedName("kills_kit_basic_solo_energix")
    val killsKitBasicSoloEnergix: Int = 0

    @SerializedName("void_kills_kit_basic_solo_energix")
    val voidKillsKitBasicSoloEnergix: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_energix")
    val mostKillsGameKitBasicSoloEnergix: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_energix")
    val chestsOpenedKitBasicSoloEnergix: Int = 0

    @SerializedName("killstreak_kit_basic_solo_energix")
    val killstreakKitBasicSoloEnergix: Int = 0

    @SerializedName("time_played_kit_basic_solo_energix")
    val timePlayedKitBasicSoloEnergix: Int = 0

    @SerializedName("survived_players_kit_basic_solo_energix")
    val survivedPlayersKitBasicSoloEnergix: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_energix")
    val meleeKillsKitBasicSoloEnergix: Int = 0

    @SerializedName("wins_kit_basic_solo_energix")
    val winsKitBasicSoloEnergix: Int = 0

    @SerializedName("games_kit_basic_solo_energix")
    val gamesKitBasicSoloEnergix: Int = 0

    @SerializedName("winstreak_kit_basic_solo_energix")
    val winstreakKitBasicSoloEnergix: Int = 0

    @SerializedName("deaths_kit_basic_solo_energix")
    val deathsKitBasicSoloEnergix: Int = 0

    @SerializedName("losses_kit_basic_solo_energix")
    val lossesKitBasicSoloEnergix: Int = 0

    @SerializedName("arrows_shot_ranked")
    val arrowsShotRanked: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_armorer")
    val arrowsShotKitRankedRankedArmorer: Int = 0

    @SerializedName("team_lucky_charm")
    val teamLuckyCharm: Int = 0

    @SerializedName("longest_bow_shot_kit_defending_team_armorer")
    val longestBowShotKitDefendingTeamArmorer: Int = 0

    @SerializedName("arrows_hit_kit_defending_team_armorer")
    val arrowsHitKitDefendingTeamArmorer: Int = 0

    @SerializedName("arrows_shot_kit_defending_team_armorer")
    val arrowsShotKitDefendingTeamArmorer: Int = 0

    @SerializedName("chests_opened_kit_mining_team_cannoneer")
    val chestsOpenedKitMiningTeamCannoneer: Int = 0

    @SerializedName("time_played_kit_mining_team_cannoneer")
    val timePlayedKitMiningTeamCannoneer: Int = 0

    @SerializedName("time_played_kit_attacking_team_snowman")
    val timePlayedKitAttackingTeamSnowman: Int = 0

    @SerializedName("chests_opened_kit_attacking_team_snowman")
    val chestsOpenedKitAttackingTeamSnowman: Int = 0

    @SerializedName("melee_kills_kit_attacking_team_snowman")
    val meleeKillsKitAttackingTeamSnowman: Int = 0

    @SerializedName("most_kills_game_kit_attacking_team_snowman")
    val mostKillsGameKitAttackingTeamSnowman: Int = 0

    @SerializedName("most_kills_game_kit_mining_team_cannoneer")
    val mostKillsGameKitMiningTeamCannoneer: Int = 0

    @SerializedName("void_kills_kit_mining_team_cannoneer")
    val voidKillsKitMiningTeamCannoneer: Int = 0

    @SerializedName("fastest_win_kit_attacking_team_knight")
    val fastestWinKitAttackingTeamKnight: Int = 0

    @SerializedName("arrows_shot_kit_basic_solo_energix")
    val arrowsShotKitBasicSoloEnergix: Int = 0

    @SerializedName("assists_kit_basic_solo_energix")
    val assistsKitBasicSoloEnergix: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_magician")
    val fastestWinKitRankedRankedMagician: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_magician")
    val mostKillsGameKitRankedRankedMagician: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_magician")
    val meleeKillsKitRankedRankedMagician: Int = 0

    @SerializedName("time_played_kit_basic_solo_grenade")
    val timePlayedKitBasicSoloGrenade: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_grenade")
    val mostKillsGameKitBasicSoloGrenade: Int = 0

    @SerializedName("kills_kit_basic_solo_grenade")
    val killsKitBasicSoloGrenade: Int = 0

    @SerializedName("survived_players_kit_basic_solo_grenade")
    val survivedPlayersKitBasicSoloGrenade: Int = 0

    @SerializedName("deaths_kit_basic_solo_grenade")
    val deathsKitBasicSoloGrenade: Int = 0

    @SerializedName("losses_kit_basic_solo_grenade")
    val lossesKitBasicSoloGrenade: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_grenade")
    val chestsOpenedKitBasicSoloGrenade: Int = 0

    @SerializedName("fastest_win_kit_advanced_solo_knight")
    val fastestWinKitAdvancedSoloKnight: Int = 0

    @SerializedName("mob_kills_kit_advanced_solo_armorer")
    val mobKillsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("mob_kills_solo")
    val mobKillsSolo: Int = 0

    @SerializedName("fastest_win_kit_advanced_solo_enderman")
    val fastestWinKitAdvancedSoloEnderman: Int = 0

    @SerializedName("most_kills_game_kit_advanced_solo_enderman")
    val mostKillsGameKitAdvancedSoloEnderman: Int = 0

    @SerializedName("time_played_kit_advanced_solo_enderman")
    val timePlayedKitAdvancedSoloEnderman: Int = 0

    @SerializedName("void_kills_kit_advanced_solo_enderman")
    val voidKillsKitAdvancedSoloEnderman: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_enderman")
    val chestsOpenedKitAdvancedSoloEnderman: Int = 0

    @SerializedName("melee_kills_kit_advanced_solo_enderman")
    val meleeKillsKitAdvancedSoloEnderman: Int = 0

    @SerializedName("longest_bow_shot_kit_basic_solo_energix")
    val longestBowShotKitBasicSoloEnergix: Int = 0

    @SerializedName("arrows_hit_kit_basic_solo_energix")
    val arrowsHitKitBasicSoloEnergix: Int = 0

    @SerializedName("solo_bridger")
    val soloBridger: Int = 0

    @SerializedName("time_played_kit_advanced_solo_cannoneer")
    val timePlayedKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_cannoneer")
    val chestsOpenedKitAdvancedSoloCannoneer: Int = 0

    @SerializedName("time_played_kit_basic_solo_troll")
    val timePlayedKitBasicSoloTroll: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_troll")
    val chestsOpenedKitBasicSoloTroll: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_troll")
    val meleeKillsKitBasicSoloTroll: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_troll")
    val mostKillsGameKitBasicSoloTroll: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_armorsmith")
    val chestsOpenedKitBasicSoloArmorsmith: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_armorsmith")
    val mostKillsGameKitBasicSoloArmorsmith: Int = 0

    @SerializedName("void_kills_kit_basic_solo_armorsmith")
    val voidKillsKitBasicSoloArmorsmith: Int = 0

    @SerializedName("time_played_kit_basic_solo_armorsmith")
    val timePlayedKitBasicSoloArmorsmith: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_armorsmith")
    val meleeKillsKitBasicSoloArmorsmith: Int = 0

    @SerializedName("void_kills_kit_basic_solo_speleologist")
    val voidKillsKitBasicSoloSpeleologist: Int = 0

    @SerializedName("fastest_win_kit_basic_solo_speleologist")
    val fastestWinKitBasicSoloSpeleologist: Int = 0

    @SerializedName("most_kills_game_kit_enderchest_solo_enderchest")
    val mostKillsGameKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("melee_kills_kit_enderchest_solo_enderchest")
    val meleeKillsKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("time_played_kit_enderchest_solo_enderchest")
    val timePlayedKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("chests_opened_kit_enderchest_solo_enderchest")
    val chestsOpenedKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("fastest_win_kit_enderchest_solo_enderchest")
    val fastestWinKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("void_kills_kit_enderchest_solo_enderchest")
    val voidKillsKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("arrows_shot_kit_enderchest_solo_enderchest")
    val arrowsShotKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("longest_bow_shot_kit_enderchest_solo_enderchest")
    val longestBowShotKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("arrows_hit_kit_enderchest_solo_enderchest")
    val arrowsHitKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("void_kills_kit_mega_mega_cannoneer")
    val voidKillsKitMegaMegaCannoneer: Int = 0

    @SerializedName("fastest_win_kit_mega_mega_knight")
    val fastestWinKitMegaMegaKnight: Int = 0

    @SerializedName("fastest_win_mega")
    val fastestWinMega: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_knight")
    val chestsOpenedKitMegaMegaKnight: Int = 0

    @SerializedName("time_played_kit_mega_mega_knight")
    val timePlayedKitMegaMegaKnight: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_ecologist")
    val mostKillsGameKitBasicSoloEcologist: Int = 0

    @SerializedName("time_played_kit_basic_solo_ecologist")
    val timePlayedKitBasicSoloEcologist: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_ecologist")
    val chestsOpenedKitBasicSoloEcologist: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_ecologist")
    val meleeKillsKitBasicSoloEcologist: Int = 0

    @SerializedName("void_kills_kit_basic_solo_ecologist")
    val voidKillsKitBasicSoloEcologist: Int = 0

    @SerializedName("longest_bow_shot_kit_advanced_solo_enderman")
    val longestBowShotKitAdvancedSoloEnderman: Int = 0

    @SerializedName("arrows_shot_kit_advanced_solo_enderman")
    val arrowsShotKitAdvancedSoloEnderman: Int = 0

    @SerializedName("arrows_hit_kit_advanced_solo_enderman")
    val arrowsHitKitAdvancedSoloEnderman: Int = 0

    @SerializedName("mob_kills_kit_enderchest_solo_enderchest")
    val mobKillsKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_farmer")
    val chestsOpenedKitAdvancedSoloFarmer: Int = 0

    @SerializedName("time_played_kit_advanced_solo_farmer")
    val timePlayedKitAdvancedSoloFarmer: Int = 0

    @SerializedName("fastest_win_kit_advanced_solo_farmer")
    val fastestWinKitAdvancedSoloFarmer: Int = 0

    @SerializedName("most_kills_game_kit_advanced_solo_farmer")
    val mostKillsGameKitAdvancedSoloFarmer: Int = 0

    @SerializedName("melee_kills_kit_advanced_solo_farmer")
    val meleeKillsKitAdvancedSoloFarmer: Int = 0

    @SerializedName("void_kills_kit_advanced_solo_farmer")
    val voidKillsKitAdvancedSoloFarmer: Int = 0

    @SerializedName("void_kills_kit_advanced_solo_pyro")
    val voidKillsKitAdvancedSoloPyro: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_pyro")
    val chestsOpenedKitAdvancedSoloPyro: Int = 0

    @SerializedName("most_kills_game_kit_advanced_solo_pyro")
    val mostKillsGameKitAdvancedSoloPyro: Int = 0

    @SerializedName("melee_kills_kit_advanced_solo_pyro")
    val meleeKillsKitAdvancedSoloPyro: Int = 0

    @SerializedName("time_played_kit_advanced_solo_pyro")
    val timePlayedKitAdvancedSoloPyro: Int = 0

    @SerializedName("fastest_win_kit_advanced_solo_pyro")
    val fastestWinKitAdvancedSoloPyro: Int = 0

    @SerializedName("fastest_win_kit_mega_mega_cannoneer")
    val fastestWinKitMegaMegaCannoneer: Int = 0

    @SerializedName("longest_bow_shot_ranked")
    val longestBowShotRanked: Int = 0

    @SerializedName("longest_bow_shot_kit_ranked_ranked_scout")
    val longestBowShotKitRankedRankedScout: Int = 0

    @SerializedName("arrows_hit_ranked")
    val arrowsHitRanked: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_scout")
    val arrowsShotKitRankedRankedScout: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_scout")
    val arrowsHitKitRankedRankedScout: Int = 0

    @SerializedName("mob_kills_ranked")
    val mobKillsRanked: Int = 0

    @SerializedName("mob_kills_kit_ranked_ranked_champion")
    val mobKillsKitRankedRankedChampion: Int = 0

    @SerializedName("kit_mega_mega_cannoneer_inventory")
    val kitMegaMegaCannoneerInventory: Map<String, Any> = Collections.emptyMap()

    @SerializedName("assists_kit_ranked_ranked_magician")
    val assistsKitRankedRankedMagician: Int = 0

    @SerializedName("mob_kills_kit_ranked_ranked_scout")
    val mobKillsKitRankedRankedScout: Int = 0

    @SerializedName("chests_opened_kit_defending_team_guardian")
    val chestsOpenedKitDefendingTeamGuardian: Int = 0

    @SerializedName("most_kills_game_kit_defending_team_guardian")
    val mostKillsGameKitDefendingTeamGuardian: Int = 0

    @SerializedName("void_kills_kit_defending_team_guardian")
    val voidKillsKitDefendingTeamGuardian: Int = 0

    @SerializedName("time_played_kit_defending_team_guardian")
    val timePlayedKitDefendingTeamGuardian: Int = 0

    @SerializedName("melee_kills_kit_defending_team_guardian")
    val meleeKillsKitDefendingTeamGuardian: Int = 0

    @SerializedName("fastest_win_kit_basic_solo_ecologist")
    val fastestWinKitBasicSoloEcologist: Int = 0

    @SerializedName("longest_bow_shot_kit_ranked_ranked_champion")
    val longestBowShotKitRankedRankedChampion: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_champion")
    val arrowsShotKitRankedRankedChampion: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_champion")
    val arrowsHitKitRankedRankedChampion: Int = 0

    @SerializedName("void_kills_kit_blacksmith_ranked_blacksmith")
    val voidKillsKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("most_kills_game_kit_blacksmith_ranked_blacksmith")
    val mostKillsGameKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("time_played_kit_blacksmith_ranked_blacksmith")
    val timePlayedKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("chests_opened_kit_blacksmith_ranked_blacksmith")
    val chestsOpenedKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("fastest_win_kit_blacksmith_ranked_blacksmith")
    val fastestWinKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("melee_kills_kit_blacksmith_ranked_blacksmith")
    val meleeKillsKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("mob_kills_kit_ranked_ranked_armorer")
    val mobKillsKitRankedRankedArmorer: Int = 0

    @SerializedName("mob_kills_kit_ranked_ranked_pyromancer")
    val mobKillsKitRankedRankedPyromancer: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_magician")
    val voidKillsKitRankedRankedMagician: Int = 0

    @SerializedName("quickjoin_uses_Festive Shire")
    val quickjoinUsesFestiveShire: Int = 0

    @SerializedName("mega_environmental_expert")
    val megaEnvironmentalExpert: Int = 0

    @SerializedName("deaths_kit_attacking_team_energix")
    val deathsKitAttackingTeamEnergix: Int = 0

    @SerializedName("losses_kit_attacking_team_energix")
    val lossesKitAttackingTeamEnergix: Int = 0

    @SerializedName("survived_players_kit_attacking_team_energix")
    val survivedPlayersKitAttackingTeamEnergix: Int = 0

    @SerializedName("chests_opened_kit_attacking_team_energix")
    val chestsOpenedKitAttackingTeamEnergix: Int = 0

    @SerializedName("time_played_kit_attacking_team_energix")
    val timePlayedKitAttackingTeamEnergix: Int = 0

    @SerializedName("longest_bow_shot_kit_mega_mega_cannoneer")
    val longestBowShotKitMegaMegaCannoneer: Int = 0

    @SerializedName("longest_bow_shot_mega")
    val longestBowShotMega: Int = 0

    @SerializedName("arrows_hit_kit_mega_mega_cannoneer")
    val arrowsHitKitMegaMegaCannoneer: Int = 0

    @SerializedName("arrows_shot_mega")
    val arrowsShotMega: Int = 0

    @SerializedName("arrows_shot_kit_mega_mega_cannoneer")
    val arrowsShotKitMegaMegaCannoneer: Int = 0

    @SerializedName("arrows_hit_mega")
    val arrowsHitMega: Int = 0

    @SerializedName("fastest_win_kit_mega_mega_armorer")
    val fastestWinKitMegaMegaArmorer: Int = 0

    @SerializedName("longest_bow_shot_kit_mega_mega_armorer")
    val longestBowShotKitMegaMegaArmorer: Int = 0

    @SerializedName("arrows_hit_kit_mega_mega_armorer")
    val arrowsHitKitMegaMegaArmorer: Int = 0

    @SerializedName("arrows_shot_kit_mega_mega_armorer")
    val arrowsShotKitMegaMegaArmorer: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_knight")
    val meleeKillsKitMegaMegaKnight: Int = 0

    @SerializedName("most_kills_game_kit_mega_mega_knight")
    val mostKillsGameKitMegaMegaKnight: Int = 0

    @SerializedName("time_played_kit_defending_team_baseball-player")
    val timePlayedKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("chests_opened_kit_defending_team_baseball-player")
    val chestsOpenedKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("most_kills_game_kit_defending_team_baseball-player")
    val mostKillsGameKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("void_kills_kit_defending_team_baseball-player")
    val voidKillsKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("fastest_win_kit_attacking_team_energix")
    val fastestWinKitAttackingTeamEnergix: Int = 0

    @SerializedName("winstreak_kit_attacking_team_energix")
    val winstreakKitAttackingTeamEnergix: Int = 0

    @SerializedName("void_kills_kit_attacking_team_energix")
    val voidKillsKitAttackingTeamEnergix: Int = 0

    @SerializedName("killstreak_kit_attacking_team_energix")
    val killstreakKitAttackingTeamEnergix: Int = 0

    @SerializedName("melee_kills_kit_attacking_team_energix")
    val meleeKillsKitAttackingTeamEnergix: Int = 0

    @SerializedName("games_kit_attacking_team_energix")
    val gamesKitAttackingTeamEnergix: Int = 0

    @SerializedName("most_kills_game_kit_attacking_team_energix")
    val mostKillsGameKitAttackingTeamEnergix: Int = 0

    @SerializedName("wins_kit_attacking_team_energix")
    val winsKitAttackingTeamEnergix: Int = 0

    @SerializedName("kills_kit_attacking_team_energix")
    val killsKitAttackingTeamEnergix: Int = 0

    @SerializedName("assists_kit_attacking_team_energix")
    val assistsKitAttackingTeamEnergix: Int = 0

    @SerializedName("quickjoin_uses_Aquarius")
    val quickjoinUsesAquarius: Int = 0

    @SerializedName("mob_kills_kit_mega_mega_armorer")
    val mobKillsKitMegaMegaArmorer: Int = 0

    @SerializedName("chests_opened_kit_attacking_team_scout")
    val chestsOpenedKitAttackingTeamScout: Int = 0

    @SerializedName("time_played_kit_attacking_team_scout")
    val timePlayedKitAttackingTeamScout: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_athlete")
    val timePlayedKitRankedRankedAthlete: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_athlete")
    val mostKillsGameKitRankedRankedAthlete: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_athlete")
    val meleeKillsKitRankedRankedAthlete: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_athlete")
    val chestsOpenedKitRankedRankedAthlete: Int = 0

    @SerializedName("longest_bow_shot_kit_basic_solo_rookie")
    val longestBowShotKitBasicSoloRookie: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_rookie")
    val mostKillsGameKitBasicSoloRookie: Int = 0

    @SerializedName("void_kills_kit_basic_solo_rookie")
    val voidKillsKitBasicSoloRookie: Int = 0

    @SerializedName("time_played_kit_basic_solo_rookie")
    val timePlayedKitBasicSoloRookie: Int = 0

    @SerializedName("arrows_shot_kit_basic_solo_rookie")
    val arrowsShotKitBasicSoloRookie: Int = 0

    @SerializedName("arrows_hit_kit_basic_solo_rookie")
    val arrowsHitKitBasicSoloRookie: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_rookie")
    val chestsOpenedKitBasicSoloRookie: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_rookie")
    val meleeKillsKitBasicSoloRookie: Int = 0

    @SerializedName("melee_kills_kit_attacking_team_enderman")
    val meleeKillsKitAttackingTeamEnderman: Int = 0

    @SerializedName("void_kills_kit_attacking_team_enderman")
    val voidKillsKitAttackingTeamEnderman: Int = 0

    @SerializedName("time_played_kit_attacking_team_enderman")
    val timePlayedKitAttackingTeamEnderman: Int = 0

    @SerializedName("chests_opened_kit_attacking_team_enderman")
    val chestsOpenedKitAttackingTeamEnderman: Int = 0

    @SerializedName("most_kills_game_kit_attacking_team_enderman")
    val mostKillsGameKitAttackingTeamEnderman: Int = 0

    @SerializedName("melee_kills_kit_attacking_team_scout")
    val meleeKillsKitAttackingTeamScout: Int = 0

    @SerializedName("void_kills_kit_attacking_team_scout")
    val voidKillsKitAttackingTeamScout: Int = 0

    @SerializedName("most_kills_game_kit_attacking_team_scout")
    val mostKillsGameKitAttackingTeamScout: Int = 0

    @SerializedName("time_played_kit_mining_team_default")
    val timePlayedKitMiningTeamDefault: Int = 0

    @SerializedName("chests_opened_kit_mining_team_default")
    val chestsOpenedKitMiningTeamDefault: Int = 0

    @SerializedName("quickjoin_uses_Festive Tribute")
    val quickjoinUsesFestiveTribute: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_default")
    val chestsOpenedKitBasicSoloDefault: Int = 0

    @SerializedName("time_played_kit_basic_solo_default")
    val timePlayedKitBasicSoloDefault: Int = 0

    @SerializedName("void_kills_kit_basic_solo_snowman")
    val voidKillsKitBasicSoloSnowman: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_snowman")
    val meleeKillsKitBasicSoloSnowman: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_snowman")
    val chestsOpenedKitBasicSoloSnowman: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_snowman")
    val mostKillsGameKitBasicSoloSnowman: Int = 0

    @SerializedName("time_played_kit_basic_solo_snowman")
    val timePlayedKitBasicSoloSnowman: Int = 0

    @SerializedName("void_kills_kit_mega_mega_knight")
    val voidKillsKitMegaMegaKnight: Int = 0

    @SerializedName("mob_kills_kit_basic_solo_scout")
    val mobKillsKitBasicSoloScout: Int = 0

    @SerializedName("time_played_kit_mega_mega_baseball-player")
    val timePlayedKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("solo_environmental_expert")
    val soloEnvironmentalExpert: Int = 0

    @SerializedName("team_environmental_expert")
    val teamEnvironmentalExpert: Int = 0

    @SerializedName("mob_kills_kit_defending_team_armorer")
    val mobKillsKitDefendingTeamArmorer: Int = 0

    @SerializedName("mob_kills_team")
    val mobKillsTeam: Int = 0

    @SerializedName("longest_bow_shot_kit_ranked_ranked_armorer")
    val longestBowShotKitRankedRankedArmorer: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_armorer")
    val arrowsHitKitRankedRankedArmorer: Int = 0

    @SerializedName("fastest_win_kit_basic_solo_armorsmith")
    val fastestWinKitBasicSoloArmorsmith: Int = 0

    @SerializedName("time_played_kit_advanced_solo_enchanter")
    val timePlayedKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("most_kills_game_kit_advanced_solo_enchanter")
    val mostKillsGameKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("melee_kills_kit_advanced_solo_enchanter")
    val meleeKillsKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_enchanter")
    val chestsOpenedKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("quickjoin_uses_Aegis 2017")
    val quickjoinUsesAegis2017: Int = 0

    @SerializedName("quickjoin_uses_Onionring 2017")
    val quickjoinUsesOnionring2017: Int = 0

    @SerializedName("fastest_win_kit_advanced_solo_enchanter")
    val fastestWinKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("kills_kit_basic_solo_pharaoh")
    val killsKitBasicSoloPharaoh: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_pharaoh")
    val mostKillsGameKitBasicSoloPharaoh: Int = 0

    @SerializedName("void_kills_kit_basic_solo_pharaoh")
    val voidKillsKitBasicSoloPharaoh: Int = 0

    @SerializedName("games_kit_basic_solo_pharaoh")
    val gamesKitBasicSoloPharaoh: Int = 0

    @SerializedName("time_played_kit_basic_solo_pharaoh")
    val timePlayedKitBasicSoloPharaoh: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_pharaoh")
    val chestsOpenedKitBasicSoloPharaoh: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_pharaoh")
    val meleeKillsKitBasicSoloPharaoh: Int = 0

    @SerializedName("survived_players_kit_basic_solo_pharaoh")
    val survivedPlayersKitBasicSoloPharaoh: Int = 0

    @SerializedName("assists_kit_basic_solo_pharaoh")
    val assistsKitBasicSoloPharaoh: Int = 0

    @SerializedName("fastest_win_kit_basic_solo_pharaoh")
    val fastestWinKitBasicSoloPharaoh: Int = 0

    @SerializedName("wins_kit_basic_solo_pharaoh")
    val winsKitBasicSoloPharaoh: Int = 0

    @SerializedName("winstreak_kit_basic_solo_pharaoh")
    val winstreakKitBasicSoloPharaoh: Int = 0

    @SerializedName("killstreak_kit_basic_solo_pharaoh")
    val killstreakKitBasicSoloPharaoh: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_bowman")
    val timePlayedKitRankedRankedBowman: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_bowman")
    val chestsOpenedKitRankedRankedBowman: Int = 0

    @SerializedName("quickjoin_uses_Fossil")
    val quickjoinUsesFossil: Int = 0

    @SerializedName("longest_bow_shot_kit_attacking_team_knight")
    val longestBowShotKitAttackingTeamKnight: Int = 0

    @SerializedName("arrows_hit_kit_attacking_team_knight")
    val arrowsHitKitAttackingTeamKnight: Int = 0

    @SerializedName("arrows_shot_kit_attacking_team_knight")
    val arrowsShotKitAttackingTeamKnight: Int = 0

    @SerializedName("quickjoin_uses_Elven")
    val quickjoinUsesElven: Int = 0

    @SerializedName("void_kills_kit_advanced_solo_enchanter")
    val voidKillsKitAdvancedSoloEnchanter: Int = 0

    @SerializedName("chests_opened_kit_supporting_team_healer")
    val chestsOpenedKitSupportingTeamHealer: Int = 0

    @SerializedName("time_played_kit_supporting_team_healer")
    val timePlayedKitSupportingTeamHealer: Int = 0

    @SerializedName("melee_kills_kit_supporting_team_healer")
    val meleeKillsKitSupportingTeamHealer: Int = 0

    @SerializedName("most_kills_game_kit_supporting_team_healer")
    val mostKillsGameKitSupportingTeamHealer: Int = 0

    @SerializedName("losses_kit_basic_solo_princess")
    val lossesKitBasicSoloPrincess: Int = 0

    @SerializedName("kills_kit_basic_solo_princess")
    val killsKitBasicSoloPrincess: Int = 0

    @SerializedName("time_played_kit_basic_solo_princess")
    val timePlayedKitBasicSoloPrincess: Int = 0

    @SerializedName("survived_players_kit_basic_solo_princess")
    val survivedPlayersKitBasicSoloPrincess: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_princess")
    val chestsOpenedKitBasicSoloPrincess: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_princess")
    val mostKillsGameKitBasicSoloPrincess: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_princess")
    val meleeKillsKitBasicSoloPrincess: Int = 0

    @SerializedName("deaths_kit_basic_solo_princess")
    val deathsKitBasicSoloPrincess: Int = 0

    @SerializedName("fastest_win_kit_mining_team_cannoneer")
    val fastestWinKitMiningTeamCannoneer: Int = 0

    val lastMode: String = ""

    @SerializedName("games_played_skywars")
    val gamesPlayedSkywars: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_healer")
    val chestsOpenedKitMegaMegaHealer: Int = 0

    @SerializedName("time_played_kit_mega_mega_healer")
    val timePlayedKitMegaMegaHealer: Int = 0

    @SerializedName("deaths_kit_mega_mega_healer")
    val deathsKitMegaMegaHealer: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_healer")
    val meleeKillsKitMegaMegaHealer: Int = 0

    @SerializedName("games_kit_mega_mega_healer")
    val gamesKitMegaMegaHealer: Int = 0

    @SerializedName("most_kills_game_kit_mega_mega_healer")
    val mostKillsGameKitMegaMegaHealer: Int = 0

    @SerializedName("losses_kit_mega_mega_healer")
    val lossesKitMegaMegaHealer: Int = 0

    @SerializedName("kills_kit_mega_mega_healer")
    val killsKitMegaMegaHealer: Int = 0

    @SerializedName("void_kills_kit_mega_mega_healer")
    val voidKillsKitMegaMegaHealer: Int = 0

    @SerializedName("survived_players_kit_mega_mega_healer")
    val survivedPlayersKitMegaMegaHealer: Int = 0

    @SerializedName("assists_kit_mega_mega_healer")
    val assistsKitMegaMegaHealer: Int = 0

    @SerializedName("fastest_win_kit_mega_mega_healer")
    val fastestWinKitMegaMegaHealer: Int = 0

    @SerializedName("wins_kit_mega_mega_healer")
    val winsKitMegaMegaHealer: Int = 0

    @SerializedName("killstreak_kit_mega_mega_healer")
    val killstreakKitMegaMegaHealer: Int = 0

    @SerializedName("winstreak_kit_mega_mega_healer")
    val winstreakKitMegaMegaHealer: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_default")
    val timePlayedKitRankedRankedDefault: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_default")
    val voidKillsKitRankedRankedDefault: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_default")
    val chestsOpenedKitRankedRankedDefault: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_default")
    val mostKillsGameKitRankedRankedDefault: Int = 0

    @SerializedName("quickjoin_uses_Steampunk")
    val quickjoinUsesSteampunk: Int = 0

    @SerializedName("fastest_win_kit_supporting_team_armorsmith")
    val fastestWinKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_bowman")
    val arrowsShotKitRankedRankedBowman: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_bowman")
    val mostKillsGameKitRankedRankedBowman: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_bowman")
    val voidKillsKitRankedRankedBowman: Int = 0

    @SerializedName("deaths_kit_basic_solo_frog")
    val deathsKitBasicSoloFrog: Int = 0

    @SerializedName("survived_players_kit_basic_solo_frog")
    val survivedPlayersKitBasicSoloFrog: Int = 0

    @SerializedName("void_kills_kit_basic_solo_frog")
    val voidKillsKitBasicSoloFrog: Int = 0

    @SerializedName("time_played_kit_basic_solo_frog")
    val timePlayedKitBasicSoloFrog: Int = 0

    @SerializedName("losses_kit_basic_solo_frog")
    val lossesKitBasicSoloFrog: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_frog")
    val chestsOpenedKitBasicSoloFrog: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_frog")
    val mostKillsGameKitBasicSoloFrog: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_frog")
    val meleeKillsKitBasicSoloFrog: Int = 0

    @SerializedName("kills_kit_basic_solo_frog")
    val killsKitBasicSoloFrog: Int = 0

    @SerializedName("fastest_win_kit_mega_mega_default")
    val fastestWinKitMegaMegaDefault: Int = 0

    @SerializedName("wins_kit_mega_mega_default")
    val winsKitMegaMegaDefault: Int = 0

    @SerializedName("winstreak_kit_mega_mega_default")
    val winstreakKitMegaMegaDefault: Int = 0

    @SerializedName("time_played_kit_mega_mega_default")
    val timePlayedKitMegaMegaDefault: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_default")
    val chestsOpenedKitMegaMegaDefault: Int = 0

    @SerializedName("games_kit_mega_mega_default")
    val gamesKitMegaMegaDefault: Int = 0

    @SerializedName("losses_kit_attacking_team_grenade")
    val lossesKitAttackingTeamGrenade: Int = 0

    @SerializedName("survived_players_kit_attacking_team_grenade")
    val survivedPlayersKitAttackingTeamGrenade: Int = 0

    @SerializedName("time_played_kit_attacking_team_grenade")
    val timePlayedKitAttackingTeamGrenade: Int = 0

    @SerializedName("deaths_kit_attacking_team_grenade")
    val deathsKitAttackingTeamGrenade: Int = 0

    @SerializedName("kit_mega_mega_armorer_inventory_auto_equip_armor")
    val kitMegaMegaArmorerInventoryAutoEquipArmor: Boolean = false

    @SerializedName("kit_mega_mega_armorer_inventory")
    val kitMegaMegaArmorerInventory: Map<String, Any> = Collections.emptyMap()

    @SerializedName("arrows_shot_kit_basic_solo_ecologist")
    val arrowsShotKitBasicSoloEcologist: Int = 0

    @SerializedName("void_kills_kit_basic_solo_grenade")
    val voidKillsKitBasicSoloGrenade: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_default")
    val mostKillsGameKitBasicSoloDefault: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_default")
    val meleeKillsKitBasicSoloDefault: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_baseball-player")
    val chestsOpenedKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_healer")
    val timePlayedKitRankedRankedHealer: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_healer")
    val chestsOpenedKitRankedRankedHealer: Int = 0

    @SerializedName("time_played_kit_mega_mega_armorsmith")
    val timePlayedKitMegaMegaArmorsmith: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_armorsmith")
    val chestsOpenedKitMegaMegaArmorsmith: Int = 0

    @SerializedName("fastest_win_kit_mega_mega_armorsmith")
    val fastestWinKitMegaMegaArmorsmith: Int = 0

    @SerializedName("kills_kit_mega_mega_armorsmith")
    val killsKitMegaMegaArmorsmith: Int = 0

    @SerializedName("killstreak_kit_mega_mega_armorsmith")
    val killstreakKitMegaMegaArmorsmith: Int = 0

    @SerializedName("games_kit_mega_mega_armorsmith")
    val gamesKitMegaMegaArmorsmith: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_armorsmith")
    val meleeKillsKitMegaMegaArmorsmith: Int = 0

    @SerializedName("void_kills_kit_mega_mega_armorsmith")
    val voidKillsKitMegaMegaArmorsmith: Int = 0

    @SerializedName("most_kills_game_kit_mega_mega_armorsmith")
    val mostKillsGameKitMegaMegaArmorsmith: Int = 0

    @SerializedName("wins_kit_mega_mega_armorsmith")
    val winsKitMegaMegaArmorsmith: Int = 0

    @SerializedName("winstreak_kit_mega_mega_armorsmith")
    val winstreakKitMegaMegaArmorsmith: Int = 0

    @SerializedName("time_played_kit_basic_solo_fisherman")
    val timePlayedKitBasicSoloFisherman: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_fisherman")
    val chestsOpenedKitBasicSoloFisherman: Int = 0

    @SerializedName("fastest_win_kit_defending_team_frog")
    val fastestWinKitDefendingTeamFrog: Int = 0

    @SerializedName("kills_kit_defending_team_frog")
    val killsKitDefendingTeamFrog: Int = 0

    @SerializedName("void_kills_kit_defending_team_frog")
    val voidKillsKitDefendingTeamFrog: Int = 0

    @SerializedName("winstreak_kit_defending_team_frog")
    val winstreakKitDefendingTeamFrog: Int = 0

    @SerializedName("survived_players_kit_defending_team_frog")
    val survivedPlayersKitDefendingTeamFrog: Int = 0

    @SerializedName("games_kit_defending_team_frog")
    val gamesKitDefendingTeamFrog: Int = 0

    @SerializedName("time_played_kit_defending_team_frog")
    val timePlayedKitDefendingTeamFrog: Int = 0

    @SerializedName("wins_kit_defending_team_frog")
    val winsKitDefendingTeamFrog: Int = 0

    @SerializedName("melee_kills_kit_defending_team_frog")
    val meleeKillsKitDefendingTeamFrog: Int = 0

    @SerializedName("killstreak_kit_defending_team_frog")
    val killstreakKitDefendingTeamFrog: Int = 0

    @SerializedName("chests_opened_kit_defending_team_frog")
    val chestsOpenedKitDefendingTeamFrog: Int = 0

    @SerializedName("most_kills_game_kit_defending_team_frog")
    val mostKillsGameKitDefendingTeamFrog: Int = 0

    @SerializedName("fastest_win_kit_basic_solo_fisherman")
    val fastestWinKitBasicSoloFisherman: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_fisherman")
    val meleeKillsKitBasicSoloFisherman: Int = 0

    @SerializedName("most_kills_game_kit_basic_solo_fisherman")
    val mostKillsGameKitBasicSoloFisherman: Int = 0

    @SerializedName("void_kills_kit_basic_solo_fisherman")
    val voidKillsKitBasicSoloFisherman: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_default")
    val meleeKillsKitMegaMegaDefault: Int = 0

    @SerializedName("most_kills_game_kit_mega_mega_default")
    val mostKillsGameKitMegaMegaDefault: Int = 0

    @SerializedName("fastest_win_kit_attacking_team_grenade")
    val fastestWinKitAttackingTeamGrenade: Int = 0

    @SerializedName("assists_kit_attacking_team_grenade")
    val assistsKitAttackingTeamGrenade: Int = 0

    @SerializedName("kills_kit_attacking_team_grenade")
    val killsKitAttackingTeamGrenade: Int = 0

    @SerializedName("wins_kit_attacking_team_grenade")
    val winsKitAttackingTeamGrenade: Int = 0

    @SerializedName("most_kills_game_kit_attacking_team_grenade")
    val mostKillsGameKitAttackingTeamGrenade: Int = 0

    @SerializedName("winstreak_kit_attacking_team_grenade")
    val winstreakKitAttackingTeamGrenade: Int = 0

    @SerializedName("games_kit_attacking_team_grenade")
    val gamesKitAttackingTeamGrenade: Int = 0

    @SerializedName("chests_opened_kit_attacking_team_grenade")
    val chestsOpenedKitAttackingTeamGrenade: Int = 0

    @SerializedName("killstreak_kit_attacking_team_grenade")
    val killstreakKitAttackingTeamGrenade: Int = 0

    @SerializedName("melee_kills_kit_attacking_team_grenade")
    val meleeKillsKitAttackingTeamGrenade: Int = 0

    @SerializedName("deaths_kit_defending_team_batguy")
    val deathsKitDefendingTeamBatguy: Int = 0

    @SerializedName("time_played_kit_defending_team_batguy")
    val timePlayedKitDefendingTeamBatguy: Int = 0

    @SerializedName("survived_players_kit_defending_team_batguy")
    val survivedPlayersKitDefendingTeamBatguy: Int = 0

    @SerializedName("assists_kit_defending_team_batguy")
    val assistsKitDefendingTeamBatguy: Int = 0

    @SerializedName("losses_kit_defending_team_batguy")
    val lossesKitDefendingTeamBatguy: Int = 0

    @SerializedName("most_kills_game_kit_supporting_team_ecologist")
    val mostKillsGameKitSupportingTeamEcologist: Int = 0

    @SerializedName("void_kills_kit_supporting_team_ecologist")
    val voidKillsKitSupportingTeamEcologist: Int = 0

    @SerializedName("chests_opened_kit_supporting_team_ecologist")
    val chestsOpenedKitSupportingTeamEcologist: Int = 0

    @SerializedName("time_played_kit_supporting_team_ecologist")
    val timePlayedKitSupportingTeamEcologist: Int = 0

    @SerializedName("mob_kills_kit_supporting_team_armorsmith")
    val mobKillsKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_default")
    val fastestWinKitRankedRankedDefault: Int = 0

    @SerializedName("fastest_win_kit_basic_solo_frog")
    val fastestWinKitBasicSoloFrog: Int = 0

    @SerializedName("winstreak_kit_basic_solo_frog")
    val winstreakKitBasicSoloFrog: Int = 0

    @SerializedName("games_kit_basic_solo_frog")
    val gamesKitBasicSoloFrog: Int = 0

    @SerializedName("killstreak_kit_basic_solo_frog")
    val killstreakKitBasicSoloFrog: Int = 0

    @SerializedName("wins_kit_basic_solo_frog")
    val winsKitBasicSoloFrog: Int = 0

    @SerializedName("longest_bow_shot_kit_ranked_ranked_magician")
    val longestBowShotKitRankedRankedMagician: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_magician")
    val arrowsHitKitRankedRankedMagician: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_magician")
    val arrowsShotKitRankedRankedMagician: Int = 0

    @SerializedName("deaths_kit_defending_team_frog")
    val deathsKitDefendingTeamFrog: Int = 0

    @SerializedName("losses_kit_defending_team_frog")
    val lossesKitDefendingTeamFrog: Int = 0

    @SerializedName("assists_kit_defending_team_frog")
    val assistsKitDefendingTeamFrog: Int = 0

    @SerializedName("melee_kills_kit_basic_solo_grenade")
    val meleeKillsKitBasicSoloGrenade: Int = 0

    @SerializedName("games_kit_basic_solo_grenade")
    val gamesKitBasicSoloGrenade: Int = 0

    @SerializedName("fastest_win_kit_basic_solo_grenade")
    val fastestWinKitBasicSoloGrenade: Int = 0

    @SerializedName("winstreak_kit_basic_solo_grenade")
    val winstreakKitBasicSoloGrenade: Int = 0

    @SerializedName("wins_kit_basic_solo_grenade")
    val winsKitBasicSoloGrenade: Int = 0

    @SerializedName("killstreak_kit_basic_solo_grenade")
    val killstreakKitBasicSoloGrenade: Int = 0

    @SerializedName("assists_kit_basic_solo_frog")
    val assistsKitBasicSoloFrog: Int = 0

    @SerializedName("void_kills_kit_attacking_team_snowman")
    val voidKillsKitAttackingTeamSnowman: Int = 0

    val activeDeathCry: String = ""

    @SerializedName("longest_bow_shot_kit_ranked_ranked_pyromancer")
    val longestBowShotKitRankedRankedPyromancer: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_pyromancer")
    val arrowsShotKitRankedRankedPyromancer: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_pyromancer")
    val arrowsHitKitRankedRankedPyromancer: Int = 0

    @SerializedName("assists_kit_blacksmith_ranked_blacksmith")
    val assistsKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("mob_kills_kit_mega_mega_knight")
    val mobKillsKitMegaMegaKnight: Int = 0

    @SerializedName("games_kit_basic_solo_princess")
    val gamesKitBasicSoloPrincess: Int = 0

    @SerializedName("longest_bow_shot_kit_attacking_team_scout")
    val longestBowShotKitAttackingTeamScout: Int = 0

    @SerializedName("fastest_win_kit_attacking_team_scout")
    val fastestWinKitAttackingTeamScout: Int = 0

    @SerializedName("arrows_shot_kit_attacking_team_scout")
    val arrowsShotKitAttackingTeamScout: Int = 0

    @SerializedName("winstreak_kit_attacking_team_scout")
    val winstreakKitAttackingTeamScout: Int = 0

    @SerializedName("killstreak_kit_attacking_team_scout")
    val killstreakKitAttackingTeamScout: Int = 0

    @SerializedName("arrows_hit_kit_attacking_team_scout")
    val arrowsHitKitAttackingTeamScout: Int = 0

    @SerializedName("votes_Coherence")
    val votesCoherence: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_default")
    val meleeKillsKitRankedRankedDefault: Int = 0

    @SerializedName("void_kills_kit_supporting_team_healer")
    val voidKillsKitSupportingTeamHealer: Int = 0

    @SerializedName("fastest_win_kit_mega_mega_paladin")
    val fastestWinKitMegaMegaPaladin: Int = 0

    @SerializedName("deaths_kit_mega_mega_paladin")
    val deathsKitMegaMegaPaladin: Int = 0

    @SerializedName("most_kills_game_kit_mega_mega_paladin")
    val mostKillsGameKitMegaMegaPaladin: Int = 0

    @SerializedName("time_played_kit_mega_mega_paladin")
    val timePlayedKitMegaMegaPaladin: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_paladin")
    val meleeKillsKitMegaMegaPaladin: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_paladin")
    val chestsOpenedKitMegaMegaPaladin: Int = 0

    @SerializedName("longest_bow_shot_kit_ranked_ranked_healer")
    val longestBowShotKitRankedRankedHealer: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_healer")
    val fastestWinKitRankedRankedHealer: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_healer")
    val arrowsHitKitRankedRankedHealer: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_healer")
    val voidKillsKitRankedRankedHealer: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_healer")
    val arrowsShotKitRankedRankedHealer: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_healer")
    val meleeKillsKitRankedRankedHealer: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_healer")
    val mostKillsGameKitRankedRankedHealer: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_athlete")
    val fastestWinKitRankedRankedAthlete: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_athlete")
    val voidKillsKitRankedRankedAthlete: Int = 0

    @SerializedName("votes_Reef")
    val votesReef: Int = 0

    @SerializedName("most_kills_game_kit_mega_mega_baseball-player")
    val mostKillsGameKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_baseball-player")
    val meleeKillsKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("kills_kit_mega_mega_baseball-player")
    val killsKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("void_kills_kit_mega_mega_baseball-player")
    val voidKillsKitMegaMegaBaseballPlayer: Int = 0

    @SerializedName("longest_bow_shot_kit_blacksmith_ranked_blacksmith")
    val longestBowShotKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("arrows_shot_kit_blacksmith_ranked_blacksmith")
    val arrowsShotKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("arrows_hit_kit_blacksmith_ranked_blacksmith")
    val arrowsHitKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("votes_Fortress")
    val votesFortress: Int = 0

    @SerializedName("kit_mega_mega_fisherman")
    val kitMegaMegaFisherman: Int = 0

    @SerializedName("tnt_madness_explained_last")
    val tntMadnessExplainedLast: Int = 0

    @SerializedName("tnt_madness_explained")
    val tntMadnessExplained: Int = 0

    @SerializedName("win_streak_lab")
    val winStreakLab: Int = 0

    @SerializedName("survived_players_lab_solo")
    val survivedPlayersLabSolo: Int = 0

    @SerializedName("void_kills_lab")
    val voidKillsLab: Int = 0

    @SerializedName("souls_gathered_lab")
    val soulsGatheredLab: Int = 0

    @SerializedName("survived_players_lab")
    val survivedPlayersLab: Int = 0

    @SerializedName("coins_gained_lab")
    val coinsGainedLab: Int = 0

    @SerializedName("losses_lab_kit_advanced_solo_armorer")
    val lossesLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("kills_lab")
    val killsLab: Int = 0

    @SerializedName("losses_lab_solo")
    val lossesLabSolo: Int = 0

    @SerializedName("survived_players_lab_kit_advanced_solo_armorer")
    val survivedPlayersLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("kills_lab_solo")
    val killsLabSolo: Int = 0

    @SerializedName("chests_opened_lab_solo")
    val chestsOpenedLabSolo: Int = 0

    @SerializedName("deaths_lab")
    val deathsLab: Int = 0

    @SerializedName("deaths_lab_solo")
    val deathsLabSolo: Int = 0

    @SerializedName("time_played_lab_solo")
    val timePlayedLabSolo: Int = 0

    @SerializedName("time_played_lab")
    val timePlayedLab: Int = 0

    @SerializedName("deaths_lab_kit_advanced_solo_armorer")
    val deathsLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("kills_lab_kit_advanced_solo_armorer")
    val killsLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("chests_opened_lab_kit_advanced_solo_armorer")
    val chestsOpenedLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("void_kills_lab_kit_advanced_solo_armorer")
    val voidKillsLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("chests_opened_lab")
    val chestsOpenedLab: Int = 0

    @SerializedName("time_played_lab_kit_advanced_solo_armorer")
    val timePlayedLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("losses_lab")
    val lossesLab: Int = 0

    @SerializedName("void_kills_lab_solo")
    val voidKillsLabSolo: Int = 0

    @SerializedName("quits_lab")
    val quitsLab: Int = 0

    @SerializedName("souls_lab")
    val soulsLab: Int = 0

    @SerializedName("activeKit_TEAMS")
    val activekitTeams: String = ""

    @SerializedName("most_kills_game_kit_mega_mega_scout")
    val mostKillsGameKitMegaMegaScout: Int = 0

    @SerializedName("time_played_kit_mega_mega_scout")
    val timePlayedKitMegaMegaScout: Int = 0

    @SerializedName("melee_kills_kit_mega_mega_scout")
    val meleeKillsKitMegaMegaScout: Int = 0

    @SerializedName("void_kills_kit_mega_mega_scout")
    val voidKillsKitMegaMegaScout: Int = 0

    @SerializedName("chests_opened_kit_mega_mega_scout")
    val chestsOpenedKitMegaMegaScout: Int = 0

    @SerializedName("fastest_win_kit_mega_mega_scout")
    val fastestWinKitMegaMegaScout: Int = 0

    @SerializedName("wins_kit_mega_mega_scout")
    val winsKitMegaMegaScout: Int = 0

    @SerializedName("games_kit_mega_mega_scout")
    val gamesKitMegaMegaScout: Int = 0

    @SerializedName("winstreak_kit_mega_mega_scout")
    val winstreakKitMegaMegaScout: Int = 0

    @SerializedName("mob_kills_kit_mega_mega_scout")
    val mobKillsKitMegaMegaScout: Int = 0

    @SerializedName("killstreak_kit_mega_mega_scout")
    val killstreakKitMegaMegaScout: Int = 0

    @SerializedName("assists_kit_mega_mega_scout")
    val assistsKitMegaMegaScout: Int = 0

    @SerializedName("mega_black_magic")
    val megaBlackMagic: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_hound")
    val deathsKitRankedRankedHound: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_hound")
    val chestsOpenedKitRankedRankedHound: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_hound")
    val mostKillsGameKitRankedRankedHound: Int = 0

    @SerializedName("games_kit_ranked_ranked_hound")
    val gamesKitRankedRankedHound: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_hound")
    val survivedPlayersKitRankedRankedHound: Int = 0

    @SerializedName("kills_kit_ranked_ranked_hound")
    val killsKitRankedRankedHound: Int = 0

    @SerializedName("losses_kit_ranked_ranked_hound")
    val lossesKitRankedRankedHound: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_hound")
    val timePlayedKitRankedRankedHound: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_bowman")
    val meleeKillsKitRankedRankedBowman: Int = 0

    @SerializedName("quickjoin_uses_Firelink Shrine")
    val quickjoinUsesFirelinkShrine: Int = 0

    @SerializedName("longest_bow_kill")
    val longestBowKill: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_champion")
    val longestBowKillKitRankedRankedChampion: Int = 0

    @SerializedName("longest_bow_kill_ranked")
    val longestBowKillRanked: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_scout")
    val longestBowKillKitRankedRankedScout: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_armorer")
    val longestBowKillKitRankedRankedArmorer: Int = 0

    @SerializedName("longest_bow_kill_kit_advanced_solo_armorer")
    val longestBowKillKitAdvancedSoloArmorer: Int = 0

    @SerializedName("longest_bow_kill_solo")
    val longestBowKillSolo: Int = 0

    @SerializedName("longest_bow_kill_kit_blacksmith_ranked_blacksmith")
    val longestBowKillKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_hound")
    val fastestWinKitRankedRankedHound: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_hound")
    val voidKillsKitRankedRankedHound: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_hound")
    val killstreakKitRankedRankedHound: Int = 0

    @SerializedName("wins_kit_ranked_ranked_hound")
    val winsKitRankedRankedHound: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_hound")
    val winstreakKitRankedRankedHound: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_magician")
    val longestBowKillKitRankedRankedMagician: Int = 0

    @SerializedName("longest_bow_kill_kit_attacking_team_scout")
    val longestBowKillKitAttackingTeamScout: Int = 0

    @SerializedName("longest_bow_kill_team")
    val longestBowKillTeam: Int = 0

    @SerializedName("longest_bow_kill_kit_mega_mega_scout")
    val longestBowKillKitMegaMegaScout: Int = 0

    @SerializedName("longest_bow_kill_mega")
    val longestBowKillMega: Int = 0

    @SerializedName("longest_bow_kill_kit_attacking_team_knight")
    val longestBowKillKitAttackingTeamKnight: Int = 0

    @SerializedName("longest_bow_kill_kit_defending_team_armorer")
    val longestBowKillKitDefendingTeamArmorer: Int = 0

    @SerializedName("longest_bow_kill_kit_mining_team_speleologist")
    val longestBowKillKitMiningTeamSpeleologist: Int = 0

    @SerializedName("longest_bow_kill_kit_basic_solo_scout")
    val longestBowKillKitBasicSoloScout: Int = 0

    @SerializedName("longest_bow_kill_kit_enderchest_solo_enderchest")
    val longestBowKillKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("inGamePresentsCap_2017_1")
    val ingamepresentscap20171: Int = 0

    @SerializedName("inGamePresentsCap_2017_2")
    val ingamepresentscap20172: Int = 0

    @SerializedName("inGamePresentsCap_2017_3")
    val ingamepresentscap20173: Int = 0

    @SerializedName("inGamePresentsCap_2017_4")
    val ingamepresentscap20174: Int = 0

    @SerializedName("inGamePresentsCap_2017_5")
    val ingamepresentscap20175: Int = 0

    @SerializedName("inGamePresentsCap_2017_6")
    val ingamepresentscap20176: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_default")
    val longestBowKillKitRankedRankedDefault: Int = 0

    @SerializedName("inGamePresentsCap_2017_7")
    val ingamepresentscap20177: Int = 0

    @SerializedName("inGamePresentsCap_2017_8")
    val ingamepresentscap20178: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_pyromancer")
    val longestBowKillKitRankedRankedPyromancer: Int = 0

    @SerializedName("inGamePresentsCap_2017_9")
    val ingamepresentscap20179: Int = 0

    @SerializedName("inGamePresentsCap_2017_10")
    val ingamepresentscap201710: Int = 0

    @SerializedName("inGamePresentsCap_2017_11")
    val ingamepresentscap201711: Int = 0

    @SerializedName("inGamePresentsCap_2017_12")
    val ingamepresentscap201712: Int = 0

    @SerializedName("inGamePresentsCap_2017_13")
    val ingamepresentscap201713: Int = 0

    @SerializedName("inGamePresentsCap_2017_14")
    val ingamepresentscap201714: Int = 0

    @SerializedName("inGamePresentsCap_2017_15")
    val ingamepresentscap201715: Int = 0

    @SerializedName("inGamePresentsCap_2017_16")
    val ingamepresentscap201716: Int = 0

    @SerializedName("inGamePresentsCap_2017_17")
    val ingamepresentscap201717: Int = 0

    @SerializedName("inGamePresentsCap_2017_18")
    val ingamepresentscap201718: Int = 0

    @SerializedName("inGamePresentsCap_2017_20")
    val ingamepresentscap201720: Int = 0

    @SerializedName("inGamePresentsCap_2017_21")
    val ingamepresentscap201721: Int = 0

    @SerializedName("inGamePresentsCap_2017_22")
    val ingamepresentscap201722: Int = 0

    @SerializedName("inGamePresentsCap_2017_23")
    val ingamepresentscap201723: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_hound")
    val longestBowKillKitRankedRankedHound: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_hound")
    val meleeKillsKitRankedRankedHound: Int = 0

    @SerializedName("inGamePresentsCap_2017_24")
    val ingamepresentscap201724: Int = 0

    @SerializedName("longest_bow_kill_kit_mega_mega_armorer")
    val longestBowKillKitMegaMegaArmorer: Int = 0

    @SerializedName("inGamePresentsCap_2017_25")
    val ingamepresentscap201725: Int = 0

    @SerializedName("longest_bow_kill_kit_basic_solo_speleologist")
    val longestBowKillKitBasicSoloSpeleologist: Int = 0

    @SerializedName("inGamePresentsCap_2017_26")
    val ingamepresentscap201726: Int = 0

    @SerializedName("quickjoin_uses_Plathohoho")
    val quickjoinUsesPlathohoho: Int = 0

    @SerializedName("longest_bow_kill_kit_defending_team_frog")
    val longestBowKillKitDefendingTeamFrog: Int = 0

    @SerializedName("longest_bow_kill_kit_mega_mega_knight")
    val longestBowKillKitMegaMegaKnight: Int = 0

    @SerializedName("rush_explained")
    val rushExplained: Int = 0

    @SerializedName("rush_explained_last")
    val rushExplainedLast: Int = 0

    @SerializedName("slime_explained_last")
    val slimeExplainedLast: Int = 0

    @SerializedName("slime_explained")
    val slimeExplained: Int = 0

    @SerializedName("longest_bow_kill_lab_solo")
    val longestBowKillLabSolo: Int = 0

    @SerializedName("longest_bow_kill_lab_kit_enderchest_solo_enderchest")
    val longestBowKillLabKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("longest_bow_kill_lab")
    val longestBowKillLab: Int = 0

    @SerializedName("survived_players_lab_kit_enderchest_solo_enderchest")
    val survivedPlayersLabKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("blocks_placed_lab")
    val blocksPlacedLab: Int = 0

    @SerializedName("melee_kills_lab_solo")
    val meleeKillsLabSolo: Int = 0

    @SerializedName("chests_opened_lab_kit_enderchest_solo_enderchest")
    val chestsOpenedLabKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("kills_lab_kit_enderchest_solo_enderchest")
    val killsLabKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("melee_kills_lab_kit_enderchest_solo_enderchest")
    val meleeKillsLabKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("losses_lab_kit_enderchest_solo_enderchest")
    val lossesLabKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("deaths_lab_kit_enderchest_solo_enderchest")
    val deathsLabKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("melee_kills_lab")
    val meleeKillsLab: Int = 0

    @SerializedName("time_played_lab_kit_enderchest_solo_enderchest")
    val timePlayedLabKitEnderchestSoloEnderchest: Int = 0

    @SerializedName("inGamePresentsCap_2017_27")
    val ingamepresentscap201727: Int = 0

    @SerializedName("longest_bow_kill_kit_attacking_team_grenade")
    val longestBowKillKitAttackingTeamGrenade: Int = 0

    @SerializedName("void_kills_kit_attacking_team_grenade")
    val voidKillsKitAttackingTeamGrenade: Int = 0

    @SerializedName("inGamePresentsCap_2017_28")
    val ingamepresentscap201728: Int = 0

    @SerializedName("inGamePresentsCap_2017_29")
    val ingamepresentscap201729: Int = 0

    @SerializedName("inGamePresentsCap_2017_30")
    val ingamepresentscap201730: Int = 0

    @SerializedName("inGamePresentsCap_2017_31")
    val ingamepresentscap201731: Int = 0

    @SerializedName("inGamePresentsCap_2018_1")
    val ingamepresentscap20181: Int = 0

    @SerializedName("assists_kit_ranked_ranked_hound")
    val assistsKitRankedRankedHound: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_paladin")
    val longestBowKillKitRankedRankedPaladin: Int = 0

    @SerializedName("survived_players_kit_ranked_ranked_paladin")
    val survivedPlayersKitRankedRankedPaladin: Int = 0

    @SerializedName("losses_kit_ranked_ranked_paladin")
    val lossesKitRankedRankedPaladin: Int = 0

    @SerializedName("chests_opened_kit_ranked_ranked_paladin")
    val chestsOpenedKitRankedRankedPaladin: Int = 0

    @SerializedName("most_kills_game_kit_ranked_ranked_paladin")
    val mostKillsGameKitRankedRankedPaladin: Int = 0

    @SerializedName("melee_kills_kit_ranked_ranked_paladin")
    val meleeKillsKitRankedRankedPaladin: Int = 0

    @SerializedName("deaths_kit_ranked_ranked_paladin")
    val deathsKitRankedRankedPaladin: Int = 0

    @SerializedName("kills_kit_ranked_ranked_paladin")
    val killsKitRankedRankedPaladin: Int = 0

    @SerializedName("time_played_kit_ranked_ranked_paladin")
    val timePlayedKitRankedRankedPaladin: Int = 0

    @SerializedName("active_deathcry")
    val activeDeathcry: String = ""

    @SerializedName("active_killeffect")
    val activeKilleffect: String = ""

    @SerializedName("active_cage")
    val activeCage: String = ""

    @SerializedName("active_victorydance")
    val activeVictorydance: String = ""

    @SerializedName("active_projectiletrail")
    val activeProjectiletrail: String = ""

    val freeLootChestNpc: Int = 0

    @SerializedName("skywars_chests")
    val skywarsChests: Int = 0

    @SerializedName("SkyWars_openedRares")
    val skywarsOpenedrares: Int = 0

    @SerializedName("SkyWars_openedCommons")
    val skywarsOpenedcommons: Int = 0

    @SerializedName("skywars_chest_history")
    val skywarsChestHistory: List<Any> = Collections.emptyList()

    @SerializedName("SkyWars_openedChests")
    val skywarsOpenedchests: Int = 0

    @SerializedName("cosmetic_tokens")
    val cosmeticTokens: Int = 0

    @SerializedName("active_killmessages")
    val activeKillmessages: String = ""

    @SerializedName("longest_bow_kill_kit_basic_solo_frog")
    val longestBowKillKitBasicSoloFrog: Int = 0

    @SerializedName("SkyWars_openedEpics")
    val skywarsOpenedepics: Int = 0

    @SerializedName("skywars_easter_boxes")
    val skywarsEasterBoxes: Int = 0

    @SerializedName("chest_history_new")
    val chestHistoryNew: List<Any> = Collections.emptyList()

    @SerializedName("lucky_explained_last")
    val luckyExplainedLast: Int = 0

    @SerializedName("lucky_explained")
    val luckyExplained: Int = 0

    @SerializedName("survived_players_lab_team")
    val survivedPlayersLabTeam: Int = 0

    @SerializedName("chests_opened_lab_team")
    val chestsOpenedLabTeam: Int = 0

    @SerializedName("time_played_lab_team")
    val timePlayedLabTeam: Int = 0

    @SerializedName("chests_opened_lab_kit_defending_team_armorer")
    val chestsOpenedLabKitDefendingTeamArmorer: Int = 0

    @SerializedName("losses_lab_kit_defending_team_armorer")
    val lossesLabKitDefendingTeamArmorer: Int = 0

    @SerializedName("losses_lab_team")
    val lossesLabTeam: Int = 0

    @SerializedName("deaths_lab_kit_defending_team_armorer")
    val deathsLabKitDefendingTeamArmorer: Int = 0

    @SerializedName("deaths_lab_team")
    val deathsLabTeam: Int = 0

    @SerializedName("survived_players_lab_kit_defending_team_armorer")
    val survivedPlayersLabKitDefendingTeamArmorer: Int = 0

    @SerializedName("time_played_lab_kit_defending_team_armorer")
    val timePlayedLabKitDefendingTeamArmorer: Int = 0

    @SerializedName("melee_kills_lab_team")
    val meleeKillsLabTeam: Int = 0

    @SerializedName("kills_lab_team")
    val killsLabTeam: Int = 0

    @SerializedName("kills_lab_kit_defending_team_armorer")
    val killsLabKitDefendingTeamArmorer: Int = 0

    @SerializedName("melee_kills_lab_kit_defending_team_armorer")
    val meleeKillsLabKitDefendingTeamArmorer: Int = 0

    @SerializedName("SkyWars_skywars_rating_3_18_rating")
    val skywarsSkywarsRating318Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_3_18_position")
    val skywarsSkywarsRating318Position: Int = 0

    @SerializedName("SkyWars_openedLegendaries")
    val skywarsOpenedlegendaries: Int = 0

    @SerializedName("longest_bow_kill_kit_advanced_solo_knight")
    val longestBowKillKitAdvancedSoloKnight: Int = 0

    @SerializedName("blocks_broken_lab")
    val blocksBrokenLab: Int = 0

    @SerializedName("mob_kills_lab_solo")
    val mobKillsLabSolo: Int = 0

    @SerializedName("mob_kills_lab")
    val mobKillsLab: Int = 0

    @SerializedName("mob_kills_lab_kit_advanced_solo_armorer")
    val mobKillsLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("melee_kills_lab_kit_advanced_solo_armorer")
    val meleeKillsLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("refill_chest_destroy_lab")
    val refillChestDestroyLab: Int = 0

    @SerializedName("SkyWars_skywars_rating_4_18_position")
    val skywarsSkywarsRating418Position: Int = 0

    @SerializedName("SkyWars_skywars_rating_4_18_rating")
    val skywarsSkywarsRating418Rating: Int = 0

    @SerializedName("bow_kills_ranked")
    val bowKillsRanked: Int = 0

    @SerializedName("bow_kills")
    val bowKills: Int = 0

    @SerializedName("bow_kills_kit_ranked_ranked_scout")
    val bowKillsKitRankedRankedScout: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_athlete")
    val longestBowKillKitRankedRankedAthlete: Int = 0

    @SerializedName("bow_kills_kit_ranked_ranked_armorer")
    val bowKillsKitRankedRankedArmorer: Int = 0

    @SerializedName("games_kit_ranked_ranked_paladin")
    val gamesKitRankedRankedPaladin: Int = 0

    @SerializedName("assists_kit_ranked_ranked_paladin")
    val assistsKitRankedRankedPaladin: Int = 0

    @SerializedName("void_kills_kit_ranked_ranked_paladin")
    val voidKillsKitRankedRankedPaladin: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_healer")
    val longestBowKillKitRankedRankedHealer: Int = 0

    @SerializedName("hunters_vs_beasts_explained")
    val huntersVsBeastsExplained: Int = 0

    @SerializedName("hunters_vs_beasts_explained_last")
    val huntersVsBeastsExplainedLast: Int = 0

    @SerializedName("beast_chance")
    val beastChance: Int = 0

    @SerializedName("wins_lab")
    val winsLab: Int = 0

    @SerializedName("games_lab")
    val gamesLab: Int = 0

    @SerializedName("lab_win_hunters_vs_beasts_lab_kit_advanced_solo_armorer")
    val labWinHuntersVsBeastsLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("lab_win_hunters_vs_beasts_lab_solo")
    val labWinHuntersVsBeastsLabSolo: Int = 0

    @SerializedName("winstreak_lab")
    val winstreakLab: Int = 0

    @SerializedName("games_lab_solo")
    val gamesLabSolo: Int = 0

    @SerializedName("egg_thrown_lab")
    val eggThrownLab: Int = 0

    @SerializedName("lab_win_hunters_vs_beasts_lab")
    val labWinHuntersVsBeastsLab: Int = 0

    @SerializedName("games_lab_kit_advanced_solo_armorer")
    val gamesLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("winstreak_lab_solo")
    val winstreakLabSolo: Int = 0

    @SerializedName("wins_lab_kit_advanced_solo_armorer")
    val winsLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("wins_lab_solo")
    val winsLabSolo: Int = 0

    @SerializedName("enderpearls_thrown_lab")
    val enderpearlsThrownLab: Int = 0

    @SerializedName("winstreak_lab_kit_advanced_solo_armorer")
    val winstreakLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("assists_lab")
    val assistsLab: Int = 0

    @SerializedName("assists_lab_kit_advanced_solo_armorer")
    val assistsLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("assists_lab_solo")
    val assistsLabSolo: Int = 0

    @SerializedName("fastest_win_lab_solo")
    val fastestWinLabSolo: Int = 0

    @SerializedName("fastest_win_lab")
    val fastestWinLab: Int = 0

    @SerializedName("fastest_win_lab_kit_advanced_solo_armorer")
    val fastestWinLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("killstreak_lab")
    val killstreakLab: Int = 0

    @SerializedName("killstreak_lab_kit_advanced_solo_armorer")
    val killstreakLabKitAdvancedSoloArmorer: Int = 0

    @SerializedName("killstreak_lab_solo")
    val killstreakLabSolo: Int = 0

    @SerializedName("activeKit_MEGA_DOUBLES_random")
    val activekitMegaDoublesRandom: Boolean = false

    @SerializedName("activeKit_MEGA_DOUBLES")
    val activekitMegaDoubles: String = ""

    @SerializedName("activeKit_TEAMS_random")
    val activekitTeamsRandom: Boolean = false

    @SerializedName("activeKit_SOLO_random")
    val activekitSoloRandom: Boolean = false

    @SerializedName("bow_kills_solo")
    val bowKillsSolo: Int = 0

    @SerializedName("bow_kills_kit_advanced_solo_armorer")
    val bowKillsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("quickjoin_uses_Hibiscus")
    val quickjoinUsesHibiscus: Int = 0

    @SerializedName("longest_bow_kill_kit_attacking_team_sloth")
    val longestBowKillKitAttackingTeamSloth: Int = 0

    @SerializedName("most_kills_game_kit_attacking_team_sloth")
    val mostKillsGameKitAttackingTeamSloth: Int = 0

    @SerializedName("kills_kit_attacking_team_sloth")
    val killsKitAttackingTeamSloth: Int = 0

    @SerializedName("void_kills_kit_attacking_team_sloth")
    val voidKillsKitAttackingTeamSloth: Int = 0

    @SerializedName("time_played_kit_attacking_team_sloth")
    val timePlayedKitAttackingTeamSloth: Int = 0

    @SerializedName("losses_kit_attacking_team_sloth")
    val lossesKitAttackingTeamSloth: Int = 0

    @SerializedName("survived_players_kit_attacking_team_sloth")
    val survivedPlayersKitAttackingTeamSloth: Int = 0

    @SerializedName("deaths_kit_attacking_team_sloth")
    val deathsKitAttackingTeamSloth: Int = 0

    @SerializedName("chests_opened_kit_attacking_team_sloth")
    val chestsOpenedKitAttackingTeamSloth: Int = 0

    @SerializedName("melee_kills_kit_attacking_team_sloth")
    val meleeKillsKitAttackingTeamSloth: Int = 0

    @SerializedName("games_kit_attacking_team_sloth")
    val gamesKitAttackingTeamSloth: Int = 0

    @SerializedName("longest_bow_kill_kit_defending_team_baseball-player")
    val longestBowKillKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("melee_kills_kit_defending_team_baseball-player")
    val meleeKillsKitDefendingTeamBaseballPlayer: Int = 0

    @SerializedName("survived_players_mega_doubles")
    val survivedPlayersMegaDoubles: Int = 0

    @SerializedName("losses_mega_doubles")
    val lossesMegaDoubles: Int = 0

    @SerializedName("time_played_mega_doubles")
    val timePlayedMegaDoubles: Int = 0

    @SerializedName("losses_mega_doubles_normal")
    val lossesMegaDoublesNormal: Int = 0

    @SerializedName("chests_opened_mega_doubles")
    val chestsOpenedMegaDoubles: Int = 0

    @SerializedName("deaths_mega_doubles")
    val deathsMegaDoubles: Int = 0

    @SerializedName("deaths_mega_doubles_normal")
    val deathsMegaDoublesNormal: Int = 0

    @SerializedName("kills_mega_doubles_normal")
    val killsMegaDoublesNormal: Int = 0

    @SerializedName("melee_kills_mega_doubles")
    val meleeKillsMegaDoubles: Int = 0

    @SerializedName("kills_mega_doubles")
    val killsMegaDoubles: Int = 0

    @SerializedName("void_kills_mega_doubles")
    val voidKillsMegaDoubles: Int = 0

    @SerializedName("bow_kills_team")
    val bowKillsTeam: Int = 0

    @SerializedName("bow_kills_kit_defending_team_armorer")
    val bowKillsKitDefendingTeamArmorer: Int = 0

    @SerializedName("fastest_win_kit_supporting_team_enchanter")
    val fastestWinKitSupportingTeamEnchanter: Int = 0

    @SerializedName("most_kills_game_kit_supporting_team_enchanter")
    val mostKillsGameKitSupportingTeamEnchanter: Int = 0

    @SerializedName("longest_bow_kill_kit_supporting_team_enchanter")
    val longestBowKillKitSupportingTeamEnchanter: Int = 0

    @SerializedName("chests_opened_kit_supporting_team_enchanter")
    val chestsOpenedKitSupportingTeamEnchanter: Int = 0

    @SerializedName("melee_kills_kit_supporting_team_enchanter")
    val meleeKillsKitSupportingTeamEnchanter: Int = 0

    @SerializedName("time_played_kit_supporting_team_enchanter")
    val timePlayedKitSupportingTeamEnchanter: Int = 0

    @SerializedName("quickjoin_uses_Clearing")
    val quickjoinUsesClearing: Int = 0

    @SerializedName("games_mega_doubles")
    val gamesMegaDoubles: Int = 0

    @SerializedName("winstreak_mega_doubles")
    val winstreakMegaDoubles: Int = 0

    @SerializedName("wins_mega_doubles_normal")
    val winsMegaDoublesNormal: Int = 0

    @SerializedName("killstreak_mega_doubles")
    val killstreakMegaDoubles: Int = 0

    @SerializedName("wins_mega_doubles")
    val winsMegaDoubles: Int = 0

    @SerializedName("fastest_win_mega_doubles")
    val fastestWinMegaDoubles: Int = 0

    @SerializedName("assists_mega_doubles")
    val assistsMegaDoubles: Int = 0

    @SerializedName("longest_bow_kill_kit_mining_team_cannoneer")
    val longestBowKillKitMiningTeamCannoneer: Int = 0

    @SerializedName("melee_kills_kit_mining_team_cannoneer")
    val meleeKillsKitMiningTeamCannoneer: Int = 0

    @SerializedName("assists_kit_attacking_team_sloth")
    val assistsKitAttackingTeamSloth: Int = 0

    @SerializedName("most_kills_game_kit_advanced_solo_salmon")
    val mostKillsGameKitAdvancedSoloSalmon: Int = 0

    @SerializedName("longest_bow_shot_kit_advanced_solo_salmon")
    val longestBowShotKitAdvancedSoloSalmon: Int = 0

    @SerializedName("longest_bow_kill_kit_advanced_solo_salmon")
    val longestBowKillKitAdvancedSoloSalmon: Int = 0

    @SerializedName("deaths_kit_advanced_solo_salmon")
    val deathsKitAdvancedSoloSalmon: Int = 0

    @SerializedName("kills_kit_advanced_solo_salmon")
    val killsKitAdvancedSoloSalmon: Int = 0

    @SerializedName("melee_kills_kit_advanced_solo_salmon")
    val meleeKillsKitAdvancedSoloSalmon: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_salmon")
    val chestsOpenedKitAdvancedSoloSalmon: Int = 0

    @SerializedName("survived_players_kit_advanced_solo_salmon")
    val survivedPlayersKitAdvancedSoloSalmon: Int = 0

    @SerializedName("time_played_kit_advanced_solo_salmon")
    val timePlayedKitAdvancedSoloSalmon: Int = 0

    @SerializedName("losses_kit_advanced_solo_salmon")
    val lossesKitAdvancedSoloSalmon: Int = 0

    @SerializedName("games_kit_advanced_solo_salmon")
    val gamesKitAdvancedSoloSalmon: Int = 0

    @SerializedName("arrows_shot_kit_advanced_solo_salmon")
    val arrowsShotKitAdvancedSoloSalmon: Int = 0

    @SerializedName("arrows_hit_kit_advanced_solo_salmon")
    val arrowsHitKitAdvancedSoloSalmon: Int = 0

    @SerializedName("assists_kit_advanced_solo_salmon")
    val assistsKitAdvancedSoloSalmon: Int = 0

    @SerializedName("void_kills_kit_advanced_solo_salmon")
    val voidKillsKitAdvancedSoloSalmon: Int = 0

    @SerializedName("longest_bow_kill_mega_doubles")
    val longestBowKillMegaDoubles: Int = 0

    @SerializedName("kit_mega_mega_scout_inventory_auto_equip_armor")
    val kitMegaMegaScoutInventoryAutoEquipArmor: Boolean = false

    @SerializedName("kit_mega_mega_scout_inventory")
    val kitMegaMegaScoutInventory: Map<String, Any> = Collections.emptyMap()

    @SerializedName("quickjoin_uses_Arule")
    val quickjoinUsesArule: Int = 0

    @SerializedName("quickjoin_uses_Mothership")
    val quickjoinUsesMothership: Int = 0

    @SerializedName("mob_kills_mega_doubles")
    val mobKillsMegaDoubles: Int = 0

    @SerializedName("longest_bow_shot_mega_doubles")
    val longestBowShotMegaDoubles: Int = 0

    @SerializedName("longest_bow_shot_kit_mega_mega_scout")
    val longestBowShotKitMegaMegaScout: Int = 0

    @SerializedName("arrows_shot_mega_doubles")
    val arrowsShotMegaDoubles: Int = 0

    @SerializedName("arrows_hit_mega_doubles")
    val arrowsHitMegaDoubles: Int = 0

    @SerializedName("arrows_hit_kit_mega_mega_scout")
    val arrowsHitKitMegaMegaScout: Int = 0

    @SerializedName("arrows_shot_kit_mega_mega_scout")
    val arrowsShotKitMegaMegaScout: Int = 0

    @SerializedName("quickjoin_uses_Memorial")
    val quickjoinUsesMemorial: Int = 0

    @SerializedName("losses_kit_mega_mega_paladin")
    val lossesKitMegaMegaPaladin: Int = 0

    @SerializedName("longest_bow_kill_kit_supporting_team_armorsmith")
    val longestBowKillKitSupportingTeamArmorsmith: Int = 0

    @SerializedName("activeKit_RANKED_random")
    val activekitRankedRandom: Boolean = false

    val privategames: Map<String, Any> = Collections.emptyMap()

    @SerializedName("SkyWars_skywars_rating_8_18_rating")
    val skywarsSkywarsRating818Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_8_18_position")
    val skywarsSkywarsRating818Position: Int = 0

    @SerializedName("votes_Boomerang")
    val votesBoomerang: Int = 0

    @SerializedName("longest_bow_shot_kit_ranked_ranked_default")
    val longestBowShotKitRankedRankedDefault: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_default")
    val arrowsShotKitRankedRankedDefault: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_default")
    val arrowsHitKitRankedRankedDefault: Int = 0

    @SerializedName("votes_Pitfall")
    val votesPitfall: Int = 0

    @SerializedName("votes_Magnus")
    val votesMagnus: Int = 0

    @SerializedName("lab_hvb_beast_wins_lab")
    val labHvbBeastWinsLab: Int = 0

    @SerializedName("SkyWars_skywars_rating_9_18_rating")
    val skywarsSkywarsRating918Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_9_18_position")
    val skywarsSkywarsRating918Position: Int = 0

    @SerializedName("votes_Courtyard")
    val votesCourtyard: Int = 0

    @SerializedName("longest_bow_shot_kit_ranked_ranked_athlete")
    val longestBowShotKitRankedRankedAthlete: Int = 0

    @SerializedName("arrows_shot_kit_ranked_ranked_athlete")
    val arrowsShotKitRankedRankedAthlete: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_athlete")
    val arrowsHitKitRankedRankedAthlete: Int = 0

    @SerializedName("bow_kills_kit_blacksmith_ranked_blacksmith")
    val bowKillsKitBlacksmithRankedBlacksmith: Int = 0

    @SerializedName("votes_Foundation")
    val votesFoundation: Int = 0

    @SerializedName("votes_Sawmill")
    val votesSawmill: Int = 0

    @SerializedName("quickjoin_uses_Mythos")
    val quickjoinUsesMythos: Int = 0

    @SerializedName("SkyWars_skywars_rating_10_18_rating")
    val skywarsSkywarsRating1018Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_10_18_position")
    val skywarsSkywarsRating1018Position: Int = 0

    @SerializedName("quickjoin_uses_Mythic")
    val quickjoinUsesMythic: Int = 0

    @SerializedName("bow_kills_kit_ranked_ranked_champion")
    val bowKillsKitRankedRankedChampion: Int = 0

    @SerializedName("mob_kills_kit_advanced_solo_knight")
    val mobKillsKitAdvancedSoloKnight: Int = 0

    @SerializedName("quickjoin_uses_Canopy")
    val quickjoinUsesCanopy: Int = 0

    @SerializedName("SkyWars_skywars_rating_11_18_rating")
    val skywarsSkywarsRating1118Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_11_18_position")
    val skywarsSkywarsRating1118Position: Int = 0

    @SerializedName("skywars_experience")
    val skywarsExperience: Int = 0

    @SerializedName("team_bulldozer")
    val teamBulldozer: Int = 0

    @SerializedName("selected_prestige_icon")
    val selectedPrestigeIcon: String = ""

    @SerializedName("most_kills_game_kit_basic_solo_disco")
    val mostKillsGameKitBasicSoloDisco: Int = 0

    @SerializedName("survived_players_kit_basic_solo_disco")
    val survivedPlayersKitBasicSoloDisco: Int = 0

    @SerializedName("deaths_kit_basic_solo_disco")
    val deathsKitBasicSoloDisco: Int = 0

    @SerializedName("kills_kit_basic_solo_disco")
    val killsKitBasicSoloDisco: Int = 0

    @SerializedName("losses_kit_basic_solo_disco")
    val lossesKitBasicSoloDisco: Int = 0

    @SerializedName("chests_opened_kit_basic_solo_disco")
    val chestsOpenedKitBasicSoloDisco: Int = 0

    @SerializedName("time_played_kit_basic_solo_disco")
    val timePlayedKitBasicSoloDisco: Int = 0

    @SerializedName("inGamePresentsCap_2018_26")
    val ingamepresentscap201826: Int = 0

    @SerializedName("inGamePresentsCap_2018_27")
    val ingamepresentscap201827: Int = 0

    @SerializedName("longest_bow_kill_kit_supporting_team_ecologist")
    val longestBowKillKitSupportingTeamEcologist: Int = 0

    @SerializedName("heads_divine_kit_supporting_team_ecologist")
    val headsDivineKitSupportingTeamEcologist: Int = 0

    @SerializedName("melee_kills_kit_supporting_team_ecologist")
    val meleeKillsKitSupportingTeamEcologist: Int = 0

    val heads: Int = 0

    @SerializedName("heads_divine")
    val headsDivine: Int = 0

    @SerializedName("heads_divine_solo")
    val headsDivineSolo: Int = 0

    @SerializedName("heads_solo")
    val headsSolo: Int = 0

    @SerializedName("heads_kit_supporting_team_ecologist")
    val headsKitSupportingTeamEcologist: Int = 0

    @SerializedName("chests_opened_kit_enderchest_team_enderchest")
    val chestsOpenedKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("survived_players_kit_enderchest_team_enderchest")
    val survivedPlayersKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("time_played_kit_enderchest_team_enderchest")
    val timePlayedKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("games_kit_enderchest_team_enderchest")
    val gamesKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("deaths_kit_enderchest_team_enderchest")
    val deathsKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("losses_kit_enderchest_team_enderchest")
    val lossesKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("fastest_win_kit_ranked_ranked_bowman")
    val fastestWinKitRankedRankedBowman: Int = 0

    @SerializedName("longest_bow_kill_kit_ranked_ranked_bowman")
    val longestBowKillKitRankedRankedBowman: Int = 0

    @SerializedName("wins_kit_ranked_ranked_bowman")
    val winsKitRankedRankedBowman: Int = 0

    @SerializedName("winstreak_kit_ranked_ranked_bowman")
    val winstreakKitRankedRankedBowman: Int = 0

    @SerializedName("killstreak_kit_ranked_ranked_bowman")
    val killstreakKitRankedRankedBowman: Int = 0

    @SerializedName("inGamePresentsCap_2019_1")
    val ingamepresentscap20191: Int = 0

    @SerializedName("inGamePresentsCap_2019_6")
    val ingamepresentscap20196: Int = 0

    @SerializedName("heads_eww_kit_advanced_solo_knight")
    val headsEwwKitAdvancedSoloKnight: Int = 0

    @SerializedName("heads_eww_team")
    val headsEwwTeam: Int = 0

    @SerializedName("heads_tasty_team")
    val headsTastyTeam: Int = 0

    @SerializedName("heads_tasty_kit_advanced_solo_knight")
    val headsTastyKitAdvancedSoloKnight: Int = 0

    @SerializedName("heads_meh")
    val headsMeh: Int = 0

    @SerializedName("heads_kit_advanced_solo_knight")
    val headsKitAdvancedSoloKnight: Int = 0

    @SerializedName("heads_meh_kit_advanced_solo_knight")
    val headsMehKitAdvancedSoloKnight: Int = 0

    @SerializedName("heads_yucky_team")
    val headsYuckyTeam: Int = 0

    @SerializedName("heads_divine_team")
    val headsDivineTeam: Int = 0

    @SerializedName("heads_succulent_team")
    val headsSucculentTeam: Int = 0

    @SerializedName("heads_succulent_kit_advanced_solo_knight")
    val headsSucculentKitAdvancedSoloKnight: Int = 0

    @SerializedName("heads_succulent")
    val headsSucculent: Int = 0

    @SerializedName("heads_meh_team")
    val headsMehTeam: Int = 0

    @SerializedName("heads_yucky_kit_advanced_solo_knight")
    val headsYuckyKitAdvancedSoloKnight: Int = 0

    @SerializedName("heads_yucky")
    val headsYucky: Int = 0

    @SerializedName("heads_eww")
    val headsEww: Int = 0

    @SerializedName("heads_tasty")
    val headsTasty: Int = 0

    @SerializedName("heads_team")
    val headsTeam: Int = 0

    @SerializedName("heads_divine_kit_advanced_solo_knight")
    val headsDivineKitAdvancedSoloKnight: Int = 0

    @SerializedName("head_collection")
    val headCollection: Map<String, Any> = Collections.emptyMap()

    @SerializedName("heads_salty")
    val headsSalty: Int = 0

    @SerializedName("heads_salty_team")
    val headsSaltyTeam: Int = 0

    @SerializedName("heads_salty_kit_advanced_solo_knight")
    val headsSaltyKitAdvancedSoloKnight: Int = 0

    @SerializedName("active_sprays")
    val activeSprays: String = ""

    @SerializedName("active_balloon")
    val activeBalloon: String = ""

    @SerializedName("time_played_kit_advanced_solo_hunter")
    val timePlayedKitAdvancedSoloHunter: Int = 0

    @SerializedName("chests_opened_kit_advanced_solo_hunter")
    val chestsOpenedKitAdvancedSoloHunter: Int = 0

    @SerializedName("bow_kills_kit_advanced_solo_knight")
    val bowKillsKitAdvancedSoloKnight: Int = 0

    @SerializedName("longest_bow_shot_kit_basic_solo_frog")
    val longestBowShotKitBasicSoloFrog: Int = 0

    @SerializedName("arrows_shot_kit_basic_solo_frog")
    val arrowsShotKitBasicSoloFrog: Int = 0

    @SerializedName("arrows_hit_kit_basic_solo_frog")
    val arrowsHitKitBasicSoloFrog: Int = 0

    @SerializedName("mob_kills_kit_basic_solo_frog")
    val mobKillsKitBasicSoloFrog: Int = 0

    @SerializedName("bow_kills_kit_basic_solo_frog")
    val bowKillsKitBasicSoloFrog: Int = 0

    @SerializedName("challenge_attempts_rookie_kit_advanced_solo_armorer")
    val challengeAttemptsRookieKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_attempts_half_health")
    val challengeAttemptsHalfHealth: Int = 0

    @SerializedName("challenge_attempts_rookie_solo")
    val challengeAttemptsRookieSolo: Int = 0

    @SerializedName("challenge_attempts_kit_advanced_solo_armorer")
    val challengeAttemptsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_attempts_uhc_kit_advanced_solo_armorer")
    val challengeAttemptsUhcKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_attempts_half_health_solo")
    val challengeAttemptsHalfHealthSolo: Int = 0

    @SerializedName("challenge_attempts_paper_kit_advanced_solo_armorer")
    val challengeAttemptsPaperKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_attempts_paper")
    val challengeAttemptsPaper: Int = 0

    @SerializedName("challenge_attempts_uhc_solo")
    val challengeAttemptsUhcSolo: Int = 0

    @SerializedName("challenge_attempts_4_solo")
    val challengeAttempts4Solo: Int = 0

    @SerializedName("challenge_attempts_uhc")
    val challengeAttemptsUhc: Int = 0

    @SerializedName("challenge_attempts_paper_solo")
    val challengeAttemptsPaperSolo: Int = 0

    @SerializedName("challenge_attempts_solo")
    val challengeAttemptsSolo: Int = 0

    @SerializedName("challenge_attempts_4")
    val challengeAttempts4: Int = 0

    @SerializedName("challenge_attempts_4_kit_advanced_solo_armorer")
    val challengeAttempts4KitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_attempts_rookie")
    val challengeAttemptsRookie: Int = 0

    @SerializedName("challenge_attempts_half_health_kit_advanced_solo_armorer")
    val challengeAttemptsHalfHealthKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_attempts")
    val challengeAttempts: Int = 0

    @SerializedName("challenge_attempts_4_kit_basic_solo_speleologist")
    val challengeAttempts4KitBasicSoloSpeleologist: Int = 0

    @SerializedName("challenge_attempts_uhc_kit_basic_solo_speleologist")
    val challengeAttemptsUhcKitBasicSoloSpeleologist: Int = 0

    @SerializedName("challenge_attempts_rookie_kit_basic_solo_speleologist")
    val challengeAttemptsRookieKitBasicSoloSpeleologist: Int = 0

    @SerializedName("challenge_attempts_half_health_kit_basic_solo_speleologist")
    val challengeAttemptsHalfHealthKitBasicSoloSpeleologist: Int = 0

    @SerializedName("challenge_attempts_paper_kit_basic_solo_speleologist")
    val challengeAttemptsPaperKitBasicSoloSpeleologist: Int = 0

    @SerializedName("challenge_attempts_kit_basic_solo_speleologist")
    val challengeAttemptsKitBasicSoloSpeleologist: Int = 0

    @SerializedName("heads_eww_solo")
    val headsEwwSolo: Int = 0

    @SerializedName("heads_eww_kit_advanced_solo_armorer")
    val headsEwwKitAdvancedSoloArmorer: Int = 0

    @SerializedName("heads_kit_advanced_solo_armorer")
    val headsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_wins_half_health_kit_advanced_solo_armorer")
    val challengeWinsHalfHealthKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_wins_3_solo")
    val challengeWins3Solo: Int = 0

    @SerializedName("challenge_wins_rookie_kit_advanced_solo_armorer")
    val challengeWinsRookieKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_attempts_3_solo")
    val challengeAttempts3Solo: Int = 0

    @SerializedName("challenge_wins_half_health")
    val challengeWinsHalfHealth: Int = 0

    @SerializedName("challenge_wins_rookie_solo")
    val challengeWinsRookieSolo: Int = 0

    @SerializedName("challenge_wins_uhc")
    val challengeWinsUhc: Int = 0

    @SerializedName("challenge_wins_half_health_solo")
    val challengeWinsHalfHealthSolo: Int = 0

    @SerializedName("challenge_wins_uhc_solo")
    val challengeWinsUhcSolo: Int = 0

    @SerializedName("challenge_wins_3_kit_advanced_solo_armorer")
    val challengeWins3KitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_wins")
    val challengeWins: Int = 0

    @SerializedName("challenge_wins_rookie")
    val challengeWinsRookie: Int = 0

    @SerializedName("challenge_attempts_3")
    val challengeAttempts3: Int = 0

    @SerializedName("challenge_wins_kit_advanced_solo_armorer")
    val challengeWinsKitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_wins_solo")
    val challengeWinsSolo: Int = 0

    @SerializedName("challenge_attempts_3_kit_advanced_solo_armorer")
    val challengeAttempts3KitAdvancedSoloArmorer: Int = 0

    @SerializedName("challenge_wins_3")
    val challengeWins3: Int = 0

    @SerializedName("challenge_wins_uhc_kit_advanced_solo_armorer")
    val challengeWinsUhcKitAdvancedSoloArmorer: Int = 0

    @SerializedName("heads_heavenly")
    val headsHeavenly: Int = 0

    @SerializedName("heads_succulent_solo")
    val headsSucculentSolo: Int = 0

    @SerializedName("heads_succulent_kit_advanced_solo_armorer")
    val headsSucculentKitAdvancedSoloArmorer: Int = 0

    @SerializedName("heads_heavenly_kit_advanced_solo_armorer")
    val headsHeavenlyKitAdvancedSoloArmorer: Int = 0

    @SerializedName("heads_decent_kit_advanced_solo_armorer")
    val headsDecentKitAdvancedSoloArmorer: Int = 0

    @SerializedName("heads_decent")
    val headsDecent: Int = 0

    @SerializedName("heads_decent_solo")
    val headsDecentSolo: Int = 0

    @SerializedName("heads_heavenly_solo")
    val headsHeavenlySolo: Int = 0

    @SerializedName("heads_heavenly_kit_advanced_solo_knight")
    val headsHeavenlyKitAdvancedSoloKnight: Int = 0

    @SerializedName("heads_decent_kit_advanced_solo_knight")
    val headsDecentKitAdvancedSoloKnight: Int = 0

    @SerializedName("heads_heavenly_team")
    val headsHeavenlyTeam: Int = 0

    @SerializedName("heads_decent_team")
    val headsDecentTeam: Int = 0

    @SerializedName("most_kills_game_kit_mining_team_default")
    val mostKillsGameKitMiningTeamDefault: Int = 0

    @SerializedName("longest_bow_kill_kit_mining_team_default")
    val longestBowKillKitMiningTeamDefault: Int = 0

    @SerializedName("games_kit_mining_team_default")
    val gamesKitMiningTeamDefault: Int = 0

    @SerializedName("void_kills_kit_mining_team_default")
    val voidKillsKitMiningTeamDefault: Int = 0

    @SerializedName("melee_kills_kit_mining_team_default")
    val meleeKillsKitMiningTeamDefault: Int = 0

    @SerializedName("heads_yucky_solo")
    val headsYuckySolo: Int = 0

    @SerializedName("heads_kit_attacking_team_scout")
    val headsKitAttackingTeamScout: Int = 0

    @SerializedName("heads_yucky_kit_attacking_team_scout")
    val headsYuckyKitAttackingTeamScout: Int = 0

    @SerializedName("longest_bow_kill_kit_enderchest_team_enderchest")
    val longestBowKillKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("most_kills_game_kit_enderchest_team_enderchest")
    val mostKillsGameKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("fastest_win_kit_enderchest_team_enderchest")
    val fastestWinKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("melee_kills_kit_enderchest_team_enderchest")
    val meleeKillsKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("void_kills_kit_enderchest_team_enderchest")
    val voidKillsKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("wins_kit_enderchest_team_enderchest")
    val winsKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("killstreak_kit_enderchest_team_enderchest")
    val killstreakKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("winstreak_kit_enderchest_team_enderchest")
    val winstreakKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("kills_kit_enderchest_team_enderchest")
    val killsKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("assists_kit_enderchest_team_enderchest")
    val assistsKitEnderchestTeamEnderchest: Int = 0

    @SerializedName("quickjoin_uses_Redfang")
    val quickjoinUsesRedfang: Int = 0

    @SerializedName("quickjoin_uses_Embercell")
    val quickjoinUsesEmbercell: Int = 0

    @SerializedName("SkyWars_skywars_rating_1_19_rating")
    val skywarsSkywarsRating119Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_1_19_position")
    val skywarsSkywarsRating119Position: Int = 0

    @SerializedName("hide_skywars_level")
    val hideSkywarsLevel: Boolean = false

    @SerializedName("mob_kills_kit_defending_team_frog")
    val mobKillsKitDefendingTeamFrog: Int = 0

    @SerializedName("activeKit_MEGA_random")
    val activekitMegaRandom: Boolean = false

    @SerializedName("arrows_shot_kit_mega_mega_knight")
    val arrowsShotKitMegaMegaKnight: Int = 0

    @SerializedName("longest_bow_shot_kit_mega_mega_knight")
    val longestBowShotKitMegaMegaKnight: Int = 0

    @SerializedName("arrows_hit_kit_mega_mega_knight")
    val arrowsHitKitMegaMegaKnight: Int = 0

    @SerializedName("heads_tasty_solo")
    val headsTastySolo: Int = 0

    @SerializedName("heads_divine_kit_advanced_solo_armorer")
    val headsDivineKitAdvancedSoloArmorer: Int = 0

    @SerializedName("heads_tasty_kit_advanced_solo_armorer")
    val headsTastyKitAdvancedSoloArmorer: Int = 0

    @SerializedName("quickjoin_uses_Mushy")
    val quickjoinUsesMushy: Int = 0

    @SerializedName("heads_kit_basic_solo_frog")
    val headsKitBasicSoloFrog: Int = 0

    @SerializedName("heads_salty_kit_basic_solo_frog")
    val headsSaltyKitBasicSoloFrog: Int = 0

    @SerializedName("heads_decent_kit_attacking_team_scout")
    val headsDecentKitAttackingTeamScout: Int = 0

    @SerializedName("heads_heavenly_kit_attacking_team_scout")
    val headsHeavenlyKitAttackingTeamScout: Int = 0

    @SerializedName("SkyWars_skywars_rating_12_18_rating")
    val skywarsSkywarsRating1218Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_12_18_position")
    val skywarsSkywarsRating1218Position: Int = 0

    @SerializedName("SkyWars_skywars_rating_2_19_rating")
    val skywarsSkywarsRating219Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_2_19_position")
    val skywarsSkywarsRating219Position: Int = 0

    @SerializedName("longest_bow_kill_kit_attacking_team_enderman")
    val longestBowKillKitAttackingTeamEnderman: Int = 0

    val levelFormatted: String = ""

    @SerializedName("activeKit_TEAMS_tourney_random")
    val activekitTeamsTourneyRandom: Boolean = false

    @SerializedName("activeKit_TEAMS_tourney")
    val activekitTeamsTourney: String = ""

    @SerializedName("tourney_sw_crazy_solo_0_win_streak")
    val tourneySwCrazySolo0WinStreak: Int = 0

    @SerializedName("deaths_crazytourney")
    val deathsCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_melee_kills")
    val tourneySwCrazySolo0MeleeKills: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_quits")
    val tourneySwCrazySolo0Quits: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_chests_opened")
    val tourneySwCrazySolo0ChestsOpened: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_kills")
    val tourneySwCrazySolo0Kills: Int = 0

    @SerializedName("kills_crazytourney")
    val killsCrazytourney: Int = 0

    @SerializedName("time_played_crazytourney")
    val timePlayedCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_survived_players")
    val tourneySwCrazySolo0SurvivedPlayers: Int = 0

    @SerializedName("chests_opened_crazytourney")
    val chestsOpenedCrazytourney: Int = 0

    @SerializedName("melee_kills_crazytourney")
    val meleeKillsCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_blocks_placed")
    val tourneySwCrazySolo0BlocksPlaced: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_coins")
    val tourneySwCrazySolo0Coins: Int = 0

    @SerializedName("losses_crazytourney_normal")
    val lossesCrazytourneyNormal: Int = 0

    @SerializedName("void_kills_crazytourney")
    val voidKillsCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_void_kills")
    val tourneySwCrazySolo0VoidKills: Int = 0

    @SerializedName("losses_crazytourney")
    val lossesCrazytourney: Int = 0

    @SerializedName("survived_players_crazytourney")
    val survivedPlayersCrazytourney: Int = 0

    @SerializedName("kills_crazytourney_normal")
    val killsCrazytourneyNormal: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_time_played")
    val tourneySwCrazySolo0TimePlayed: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_losses")
    val tourneySwCrazySolo0Losses: Int = 0

    @SerializedName("deaths_crazytourney_normal")
    val deathsCrazytourneyNormal: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_deaths")
    val tourneySwCrazySolo0Deaths: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_coins_gained")
    val tourneySwCrazySolo0CoinsGained: Int = 0

    @SerializedName("killstreak_crazytourney")
    val killstreakCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_winstreak")
    val tourneySwCrazySolo0Winstreak: Int = 0

    @SerializedName("games_crazytourney")
    val gamesCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_killstreak")
    val tourneySwCrazySolo0Killstreak: Int = 0

    @SerializedName("wins_crazytourney_normal")
    val winsCrazytourneyNormal: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_games")
    val tourneySwCrazySolo0Games: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_wins")
    val tourneySwCrazySolo0Wins: Int = 0

    @SerializedName("winstreak_crazytourney")
    val winstreakCrazytourney: Int = 0

    @SerializedName("wins_crazytourney")
    val winsCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_assists")
    val tourneySwCrazySolo0Assists: Int = 0

    @SerializedName("assists_crazytourney")
    val assistsCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_enderpearls_thrown")
    val tourneySwCrazySolo0EnderpearlsThrown: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_blocks_broken")
    val tourneySwCrazySolo0BlocksBroken: Int = 0

    @SerializedName("longest_bow_kill_crazytourney")
    val longestBowKillCrazytourney: Int = 0

    @SerializedName("tourney_sw_crazy_solo_0_longest_bow_kill")
    val tourneySwCrazySolo0LongestBowKill: Int = 0

    @SerializedName("longest_bow_shot_kit_ranked_ranked_bowman")
    val longestBowShotKitRankedRankedBowman: Int = 0

    @SerializedName("arrows_hit_kit_ranked_ranked_bowman")
    val arrowsHitKitRankedRankedBowman: Int = 0

    @SerializedName("win_streak_tourney")
    val winStreakTourney: Int = 0

    @SerializedName("deaths_tourney_kit_defending_team_frog")
    val deathsTourneyKitDefendingTeamFrog: Int = 0

    @SerializedName("time_played_tourney")
    val timePlayedTourney: Int = 0

    @SerializedName("survived_players_tourney_kit_defending_team_frog")
    val survivedPlayersTourneyKitDefendingTeamFrog: Int = 0

    @SerializedName("time_played_tourney_kit_defending_team_frog")
    val timePlayedTourneyKitDefendingTeamFrog: Int = 0

    @SerializedName("kills_tourney_crazytourney")
    val killsTourneyCrazytourney: Int = 0

    @SerializedName("losses_tourney_crazytourney")
    val lossesTourneyCrazytourney: Int = 0

    @SerializedName("survived_players_tourney_crazytourney")
    val survivedPlayersTourneyCrazytourney: Int = 0

    @SerializedName("chests_opened_tourney_kit_defending_team_frog")
    val chestsOpenedTourneyKitDefendingTeamFrog: Int = 0

    @SerializedName("blocks_placed_tourney")
    val blocksPlacedTourney: Int = 0

    @SerializedName("losses_tourney")
    val lossesTourney: Int = 0

    @SerializedName("melee_kills_tourney_kit_defending_team_frog")
    val meleeKillsTourneyKitDefendingTeamFrog: Int = 0

    @SerializedName("blocks_broken_tourney")
    val blocksBrokenTourney: Int = 0

    @SerializedName("coins_gained_tourney")
    val coinsGainedTourney: Int = 0

    @SerializedName("kills_tourney")
    val killsTourney: Int = 0

    @SerializedName("quits_tourney")
    val quitsTourney: Int = 0

    @SerializedName("chests_opened_tourney_crazytourney")
    val chestsOpenedTourneyCrazytourney: Int = 0

    @SerializedName("time_played_tourney_crazytourney")
    val timePlayedTourneyCrazytourney: Int = 0

    @SerializedName("kills_tourney_kit_defending_team_frog")
    val killsTourneyKitDefendingTeamFrog: Int = 0

    @SerializedName("melee_kills_tourney_crazytourney")
    val meleeKillsTourneyCrazytourney: Int = 0

    @SerializedName("deaths_tourney")
    val deathsTourney: Int = 0

    @SerializedName("deaths_tourney_crazytourney")
    val deathsTourneyCrazytourney: Int = 0

    @SerializedName("survived_players_tourney")
    val survivedPlayersTourney: Int = 0

    @SerializedName("chests_opened_tourney")
    val chestsOpenedTourney: Int = 0

    @SerializedName("melee_kills_tourney")
    val meleeKillsTourney: Int = 0

    @SerializedName("losses_tourney_kit_defending_team_frog")
    val lossesTourneyKitDefendingTeamFrog: Int = 0

    @SerializedName("fastest_win_kit_attacking_team_enderman")
    val fastestWinKitAttackingTeamEnderman: Int = 0

    @SerializedName("killstreak_kit_attacking_team_enderman")
    val killstreakKitAttackingTeamEnderman: Int = 0

    @SerializedName("assists_tourney_crazytourney")
    val assistsTourneyCrazytourney: Int = 0

    @SerializedName("assists_tourney")
    val assistsTourney: Int = 0

    @SerializedName("assists_tourney_kit_defending_team_frog")
    val assistsTourneyKitDefendingTeamFrog: Int = 0

    @SerializedName("bow_kills_kit_mega_mega_knight")
    val bowKillsKitMegaMegaKnight: Int = 0

    @SerializedName("bow_kills_mega_doubles")
    val bowKillsMegaDoubles: Int = 0

    @SerializedName("fastest_win_kit_advanced_solo_salmon")
    val fastestWinKitAdvancedSoloSalmon: Int = 0

    @SerializedName("killstreak_kit_advanced_solo_salmon")
    val killstreakKitAdvancedSoloSalmon: Int = 0

    @SerializedName("winstreak_kit_advanced_solo_salmon")
    val winstreakKitAdvancedSoloSalmon: Int = 0

    @SerializedName("wins_kit_advanced_solo_salmon")
    val winsKitAdvancedSoloSalmon: Int = 0

    @SerializedName("SkyWars_skywars_rating_3_19_rating")
    val skywarsSkywarsRating319Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_3_19_position")
    val skywarsSkywarsRating319Position: Int = 0

    @SerializedName("quickjoin_uses_Winterhelm")
    val quickjoinUsesWinterhelm: Int = 0

    @SerializedName("heads_salty_kit_advanced_solo_armorer")
    val headsSaltyKitAdvancedSoloArmorer: Int = 0

    @SerializedName("heads_salty_solo")
    val headsSaltySolo: Int = 0

    @SerializedName("quickjoin_uses_Farmers Dozen")
    val quickjoinUsesFarmersDozen: Int = 0

    @SerializedName("SkyWars_skywars_rating_4_19_position")
    val skywarsSkywarsRating419Position: Int = 0

    @SerializedName("SkyWars_skywars_rating_4_19_rating")
    val skywarsSkywarsRating419Rating: Int = 0

    @SerializedName("kit_ranked_ranked_scout_inventory")
    val kitRankedRankedScoutInventory: Map<String, Any> = Collections.emptyMap()

    @SerializedName("heads_yucky_kit_advanced_solo_armorer")
    val headsYuckyKitAdvancedSoloArmorer: Int = 0

    @SerializedName("heads_meh_solo")
    val headsMehSolo: Int = 0

    @SerializedName("heads_meh_kit_advanced_solo_armorer")
    val headsMehKitAdvancedSoloArmorer: Int = 0

    @SerializedName("quickjoin_uses_Skychurch")
    val quickjoinUsesSkychurch: Int = 0

    @SerializedName("SkyWars_skywars_rating_5_19_position")
    val skywarsSkywarsRating519Position: Int = 0

    @SerializedName("SkyWars_skywars_rating_5_19_rating")
    val skywarsSkywarsRating519Rating: Int = 0

    @SerializedName("longest_bow_kill_kit_basic_solo_ecologist")
    val longestBowKillKitBasicSoloEcologist: Int = 0

    @SerializedName("fastest_win_kit_supporting_team_ecologist")
    val fastestWinKitSupportingTeamEcologist: Int = 0

    @SerializedName("winstreak_kit_supporting_team_ecologist")
    val winstreakKitSupportingTeamEcologist: Int = 0

    @SerializedName("killstreak_kit_supporting_team_ecologist")
    val killstreakKitSupportingTeamEcologist: Int = 0

    @SerializedName("SkyWars_skywars_rating_6_19_rating")
    val skywarsSkywarsRating619Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_6_19_position")
    val skywarsSkywarsRating619Position: Int = 0

    @SerializedName("heads_divine_kit_attacking_team_scout")
    val headsDivineKitAttackingTeamScout: Int = 0

    @SerializedName("heads_succulent_kit_attacking_team_scout")
    val headsSucculentKitAttackingTeamScout: Int = 0

    @SerializedName("heads_tasty_kit_attacking_team_scout")
    val headsTastyKitAttackingTeamScout: Int = 0

    @SerializedName("heads_eww_kit_attacking_team_scout")
    val headsEwwKitAttackingTeamScout: Int = 0

    @SerializedName("bow_kills_kit_ranked_ranked_bowman")
    val bowKillsKitRankedRankedBowman: Int = 0

    @SerializedName("mob_kills_kit_attacking_team_scout")
    val mobKillsKitAttackingTeamScout: Int = 0

    @SerializedName("heads_meh_kit_attacking_team_scout")
    val headsMehKitAttackingTeamScout: Int = 0

    @SerializedName("heads_salty_kit_attacking_team_scout")
    val headsSaltyKitAttackingTeamScout: Int = 0

    @SerializedName("heads_divine_kit_defending_team_frog")
    val headsDivineKitDefendingTeamFrog: Int = 0

    @SerializedName("heads_kit_defending_team_frog")
    val headsKitDefendingTeamFrog: Int = 0

    @SerializedName("heads_succulent_kit_defending_team_frog")
    val headsSucculentKitDefendingTeamFrog: Int = 0

    @SerializedName("heads_yucky_kit_defending_team_frog")
    val headsYuckyKitDefendingTeamFrog: Int = 0

    @SerializedName("kit_defending_team_frog_inventory_auto_equip_armor")
    val kitDefendingTeamFrogInventoryAutoEquipArmor: Boolean = false

    @SerializedName("kit_defending_team_frog_inventory")
    val kitDefendingTeamFrogInventory: Map<String, Any> = Collections.emptyMap()

    @SerializedName("arrows_hit_kit_defending_team_frog")
    val arrowsHitKitDefendingTeamFrog: Int = 0

    @SerializedName("arrows_shot_kit_defending_team_frog")
    val arrowsShotKitDefendingTeamFrog: Int = 0

    @SerializedName("bow_kills_kit_defending_team_frog")
    val bowKillsKitDefendingTeamFrog: Int = 0

    @SerializedName("longest_bow_shot_kit_defending_team_frog")
    val longestBowShotKitDefendingTeamFrog: Int = 0

    @SerializedName("heads_eww_kit_defending_team_frog")
    val headsEwwKitDefendingTeamFrog: Int = 0

    @SerializedName("heads_salty_kit_defending_team_frog")
    val headsSaltyKitDefendingTeamFrog: Int = 0

    @SerializedName("heads_tasty_kit_defending_team_frog")
    val headsTastyKitDefendingTeamFrog: Int = 0

    @SerializedName("SkyWars_skywars_rating_7_19_rating")
    val skywarsSkywarsRating719Rating: Int = 0

    @SerializedName("SkyWars_skywars_rating_7_19_position")
    val skywarsSkywarsRating719Position: Int = 0

}

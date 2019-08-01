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
 * Represents all the *Duels* statistics of a player.
 */
class DuelsStatistics {

    @SerializedName("games_played_duels")
    val gamesPlayedDuels: Int = 0

    @SerializedName("bow_duel_layout_1")
    val bowDuelLayout1: Map<String, Any> = Collections.emptyMap()

    @SerializedName("classic_duel_layout_1")
    val classicDuelLayout1: Map<String, Any> = Collections.emptyMap()

    @SerializedName("op_duel_layout_1")
    val opDuelLayout1: Map<String, Any> = Collections.emptyMap()

    @SerializedName("uhc_duel_layout_1")
    val uhcDuelLayout1: Map<String, Any> = Collections.emptyMap()

    @SerializedName("potion_duel_layout_1")
    val potionDuelLayout1: Map<String, Any> = Collections.emptyMap()

    @SerializedName("sw_duel_layout_armorer_1")
    val swDuelLayoutArmorer1: Map<String, Any> = Collections.emptyMap()

    @SerializedName("combo_duel_layout_1")
    val comboDuelLayout1: Map<String, Any> = Collections.emptyMap()

    @SerializedName("duels_recently_played")
    val duelsRecentlyPlayed: String = ""

    @SerializedName("rematch_option_1")
    val rematchOption1: String = ""

    @SerializedName("duels_winstreak_best_uhc_duel")
    val duelsWinstreakBestUhcDuel: Int = 0

    @SerializedName("kit_menu_option")
    val kitMenuOption: String = ""

    @SerializedName("sw_duels_kit")
    val swDuelsKit: String = ""

    @SerializedName("show_lb_option")
    val showLbOption: String = ""

    @SerializedName("duels_winstreak_best_sw_duel")
    val duelsWinstreakBestSwDuel: Int = 0

    @SerializedName("duels_winstreak_best_classic_duel")
    val duelsWinstreakBestClassicDuel: Int = 0

    @SerializedName("bow_duel_layout_2")
    val bowDuelLayout2: Map<String, Any> = Collections.emptyMap()

    @SerializedName("classic_duel_layout_2")
    val classicDuelLayout2: Map<String, Any> = Collections.emptyMap()

    @SerializedName("uhc_duel_layout_2")
    val uhcDuelLayout2: Map<String, Any> = Collections.emptyMap()

    @SerializedName("op_duel_layout_2")
    val opDuelLayout2: Map<String, Any> = Collections.emptyMap()

    @SerializedName("potion_duel_layout_2")
    val potionDuelLayout2: Map<String, Any> = Collections.emptyMap()

    @SerializedName("combo_duel_layout_2")
    val comboDuelLayout2: Map<String, Any> = Collections.emptyMap()

    @SerializedName("sw_duel_layout_scout_2")
    val swDuelLayoutScout2: Map<String, Any> = Collections.emptyMap()

    @SerializedName("bow_duel_layout_4")
    val bowDuelLayout4: Map<String, Any> = Collections.emptyMap()

    @SerializedName("classic_duel_layout_4")
    val classicDuelLayout4: Map<String, Any> = Collections.emptyMap()

    @SerializedName("op_duel_layout_4")
    val opDuelLayout4: Map<String, Any> = Collections.emptyMap()

    @SerializedName("uhc_duel_layout_4")
    val uhcDuelLayout4: Map<String, Any> = Collections.emptyMap()

    @SerializedName("potion_duel_layout_4")
    val potionDuelLayout4: Map<String, Any> = Collections.emptyMap()

    @SerializedName("duels_winstreak_best_uhc_doubles")
    val duelsWinstreakBestUhcDoubles: Int = 0

    @SerializedName("bow_duel_layout_5")
    val bowDuelLayout5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("classic_duel_layout_5")
    val classicDuelLayout5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("op_duel_layout_5")
    val opDuelLayout5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("uhc_duel_layout_5")
    val uhcDuelLayout5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("potion_duel_layout_5")
    val potionDuelLayout5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("sw_duel_layout_scout_5")
    val swDuelLayoutScout5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("combo_duel_layout_5")
    val comboDuelLayout5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("duels_winstreak_op_doubles")
    val duelsWinstreakOpDoubles: Int = 0

    @SerializedName("duels_winstreak_best_op_doubles")
    val duelsWinstreakBestOpDoubles: Int = 0

    @SerializedName("duels_winstreak_uhc_duel")
    val duelsWinstreakUhcDuel: Int = 0

    @SerializedName("classic_duel_rounds_played")
    val classicDuelRoundsPlayed: Int = 0

    @SerializedName("classic_duel_melee_hits")
    val classicDuelMeleeHits: Int = 0

    @SerializedName("melee_swings")
    val meleeSwings: Int = 0

    @SerializedName("melee_hits")
    val meleeHits: Int = 0

    val wins: Int = 0

    @SerializedName("rounds_played")
    val roundsPlayed: Int = 0

    @SerializedName("classic_duel_kills")
    val classicDuelKills: Int = 0

    @SerializedName("classic_duel_health_regenerated")
    val classicDuelHealthRegenerated: Int = 0

    val kills: Int = 0

    @SerializedName("classic_duel_damage_dealt")
    val classicDuelDamageDealt: Int = 0

    @SerializedName("health_regenerated")
    val healthRegenerated: Int = 0

    @SerializedName("damage_dealt")
    val damageDealt: Int = 0

    @SerializedName("classic_duel_melee_swings")
    val classicDuelMeleeSwings: Int = 0

    @SerializedName("classic_duel_wins")
    val classicDuelWins: Int = 0

    @SerializedName("bow_shots")
    val bowShots: Int = 0

    @SerializedName("bow_hits")
    val bowHits: Int = 0

    @SerializedName("classic_duel_bow_hits")
    val classicDuelBowHits: Int = 0

    @SerializedName("classic_duel_bow_shots")
    val classicDuelBowShots: Int = 0

    @SerializedName("uhc_duel_health_regenerated")
    val uhcDuelHealthRegenerated: Int = 0

    val losses: Int = 0

    @SerializedName("uhc_duel_losses")
    val uhcDuelLosses: Int = 0

    @SerializedName("uhc_duel_melee_swings")
    val uhcDuelMeleeSwings: Int = 0

    @SerializedName("uhc_duel_rounds_played")
    val uhcDuelRoundsPlayed: Int = 0

    @SerializedName("uhc_duel_deaths")
    val uhcDuelDeaths: Int = 0

    val deaths: Int = 0

    @SerializedName("uhc_duel_damage_dealt")
    val uhcDuelDamageDealt: Int = 0

    @SerializedName("uhc_duel_melee_hits")
    val uhcDuelMeleeHits: Int = 0

    @SerializedName("classic_duel_losses")
    val classicDuelLosses: Int = 0

    @SerializedName("classic_duel_deaths")
    val classicDuelDeaths: Int = 0

    @SerializedName("uhc_duel_bow_shots")
    val uhcDuelBowShots: Int = 0

    @SerializedName("uhc_duel_kills")
    val uhcDuelKills: Int = 0

    @SerializedName("uhc_duel_wins")
    val uhcDuelWins: Int = 0

    @SerializedName("op_duel_damage_dealt")
    val opDuelDamageDealt: Int = 0

    @SerializedName("op_duel_kills")
    val opDuelKills: Int = 0

    @SerializedName("op_duel_melee_swings")
    val opDuelMeleeSwings: Int = 0

    @SerializedName("op_duel_melee_hits")
    val opDuelMeleeHits: Int = 0

    @SerializedName("op_duel_bow_shots")
    val opDuelBowShots: Int = 0

    @SerializedName("op_duel_health_regenerated")
    val opDuelHealthRegenerated: Int = 0

    @SerializedName("op_duel_wins")
    val opDuelWins: Int = 0

    @SerializedName("op_duel_rounds_played")
    val opDuelRoundsPlayed: Int = 0

    @SerializedName("op_duel_bow_hits")
    val opDuelBowHits: Int = 0

    @SerializedName("bow_duel_melee_hits")
    val bowDuelMeleeHits: Int = 0

    @SerializedName("bow_duel_deaths")
    val bowDuelDeaths: Int = 0

    @SerializedName("bow_duel_health_regenerated")
    val bowDuelHealthRegenerated: Int = 0

    @SerializedName("bow_duel_losses")
    val bowDuelLosses: Int = 0

    @SerializedName("bow_duel_rounds_played")
    val bowDuelRoundsPlayed: Int = 0

    @SerializedName("bow_duel_melee_swings")
    val bowDuelMeleeSwings: Int = 0

    @SerializedName("uhc_duel_bow_hits")
    val uhcDuelBowHits: Int = 0

    @SerializedName("duels_winstreak_best_combo_duel")
    val duelsWinstreakBestComboDuel: Int = 0

    @SerializedName("combo_duel_melee_hits")
    val comboDuelMeleeHits: Int = 0

    @SerializedName("combo_duel_wins")
    val comboDuelWins: Int = 0

    @SerializedName("combo_duel_rounds_played")
    val comboDuelRoundsPlayed: Int = 0

    @SerializedName("combo_duel_health_regenerated")
    val comboDuelHealthRegenerated: Int = 0

    @SerializedName("combo_duel_damage_dealt")
    val comboDuelDamageDealt: Int = 0

    @SerializedName("combo_duel_melee_swings")
    val comboDuelMeleeSwings: Int = 0

    @SerializedName("combo_duel_kills")
    val comboDuelKills: Int = 0

    @SerializedName("combo_duel_bow_hits")
    val comboDuelBowHits: Int = 0

    @SerializedName("op_duel_deaths")
    val opDuelDeaths: Int = 0

    @SerializedName("op_duel_losses")
    val opDuelLosses: Int = 0

    @SerializedName("duels_winstreak_best_op_duel")
    val duelsWinstreakBestOpDuel: Int = 0

    @SerializedName("sw_duel_health_regenerated")
    val swDuelHealthRegenerated: Int = 0

    @SerializedName("sw_duel_kills")
    val swDuelKills: Int = 0

    @SerializedName("sw_duel_damage_dealt")
    val swDuelDamageDealt: Int = 0

    @SerializedName("sw_duel_rounds_played")
    val swDuelRoundsPlayed: Int = 0

    @SerializedName("sw_duel_melee_hits")
    val swDuelMeleeHits: Int = 0

    @SerializedName("sw_duel_melee_swings")
    val swDuelMeleeSwings: Int = 0

    @SerializedName("sw_duel_wins")
    val swDuelWins: Int = 0

    @SerializedName("sw_duel_losses")
    val swDuelLosses: Int = 0

    @SerializedName("sw_duel_deaths")
    val swDuelDeaths: Int = 0

    @SerializedName("potion_duel_wins")
    val potionDuelWins: Int = 0

    @SerializedName("potion_duel_melee_swings")
    val potionDuelMeleeSwings: Int = 0

    @SerializedName("potion_duel_rounds_played")
    val potionDuelRoundsPlayed: Int = 0

    @SerializedName("potion_duel_melee_hits")
    val potionDuelMeleeHits: Int = 0

    @SerializedName("potion_duel_damage_dealt")
    val potionDuelDamageDealt: Int = 0

    @SerializedName("potion_duel_health_regenerated")
    val potionDuelHealthRegenerated: Int = 0

    @SerializedName("potion_duel_heal_pots_used")
    val potionDuelHealPotsUsed: Int = 0

    @SerializedName("potion_duel_kills")
    val potionDuelKills: Int = 0

    @SerializedName("heal_pots_used")
    val healPotsUsed: Int = 0

    @SerializedName("sw_duel_bow_hits")
    val swDuelBowHits: Int = 0

    @SerializedName("sw_doubles_melee_swings")
    val swDoublesMeleeSwings: Int = 0

    @SerializedName("sw_doubles_health_regenerated")
    val swDoublesHealthRegenerated: Int = 0

    @SerializedName("sw_doubles_kills")
    val swDoublesKills: Int = 0

    @SerializedName("sw_doubles_melee_hits")
    val swDoublesMeleeHits: Int = 0

    @SerializedName("sw_doubles_rounds_played")
    val swDoublesRoundsPlayed: Int = 0

    @SerializedName("sw_doubles_wins")
    val swDoublesWins: Int = 0

    @SerializedName("sw_doubles_damage_dealt")
    val swDoublesDamageDealt: Int = 0

    @SerializedName("duels_winstreak_best_sw_doubles")
    val duelsWinstreakBestSwDoubles: Int = 0

    @SerializedName("sw_doubles_bow_hits")
    val swDoublesBowHits: Int = 0

    @SerializedName("sw_doubles_deaths")
    val swDoublesDeaths: Int = 0

    @SerializedName("sw_doubles_losses")
    val swDoublesLosses: Int = 0

    @SerializedName("sw_doubles_bow_shots")
    val swDoublesBowShots: Int = 0

    @SerializedName("sw_duel_bow_shots")
    val swDuelBowShots: Int = 0

    @SerializedName("selected_1")
    val selected1: String = ""

    @SerializedName("selected_2")
    val selected2: String = ""

    @SerializedName("current_winstreak")
    val currentWinstreak: Int = 0

    @SerializedName("best_overall_winstreak")
    val bestOverallWinstreak: Int = 0

    @SerializedName("current_classic_winstreak")
    val currentClassicWinstreak: Int = 0

    @SerializedName("best_classic_winstreak")
    val bestClassicWinstreak: Int = 0

    @SerializedName("classic_duel")
    val classicDuel: Boolean = false

    @SerializedName("current_skywars_winstreak")
    val currentSkywarsWinstreak: Int = 0

    @SerializedName("best_skywars_winstreak")
    val bestSkywarsWinstreak: Int = 0

    @SerializedName("kit_wins")
    val kitWins: Int = 0

    @SerializedName("scout_kit_wins")
    val scoutKitWins: Int = 0

    @SerializedName("sw_doubles_kit_wins")
    val swDoublesKitWins: Int = 0

    @SerializedName("sw_doubles_scout_kit_wins")
    val swDoublesScoutKitWins: Int = 0

    @SerializedName("sw_tournament_health_regenerated")
    val swTournamentHealthRegenerated: Int = 0

    @SerializedName("sw_tournament_rounds_played")
    val swTournamentRoundsPlayed: Int = 0

    @SerializedName("sw_tournament_melee_hits")
    val swTournamentMeleeHits: Int = 0

    @SerializedName("sw_tournament_damage_dealt")
    val swTournamentDamageDealt: Int = 0

    @SerializedName("sw_tournament_melee_swings")
    val swTournamentMeleeSwings: Int = 0

    @SerializedName("sw_duel_kit_wins")
    val swDuelKitWins: Int = 0

    @SerializedName("sw_duel_scout_kit_wins")
    val swDuelScoutKitWins: Int = 0

    @SerializedName("bowspleef_duel_rounds_played")
    val bowspleefDuelRoundsPlayed: Int = 0

    @SerializedName("sw_doubles_hunter_kit_wins")
    val swDoublesHunterKitWins: Int = 0

    @SerializedName("hunter_kit_wins")
    val hunterKitWins: Int = 0

    @SerializedName("sw_tournament_kills")
    val swTournamentKills: Int = 0

    @SerializedName("blitz_duels_kit")
    val blitzDuelsKit: String = ""

    @SerializedName("blitz_duel_melee_swings")
    val blitzDuelMeleeSwings: Int = 0

    @SerializedName("blitz_duel_rounds_played")
    val blitzDuelRoundsPlayed: Int = 0

    @SerializedName("blitz_duel_health_regenerated")
    val blitzDuelHealthRegenerated: Int = 0

    @SerializedName("current_bow_winstreak")
    val currentBowWinstreak: Int = 0

    @SerializedName("bow_duel_bow_hits")
    val bowDuelBowHits: Int = 0

    @SerializedName("bow_duel_bow_shots")
    val bowDuelBowShots: Int = 0

    @SerializedName("bow_duel_damage_dealt")
    val bowDuelDamageDealt: Int = 0

    @SerializedName("best_bow_winstreak")
    val bestBowWinstreak: Int = 0

    @SerializedName("duels_winstreak_best_bow_duel")
    val duelsWinstreakBestBowDuel: Int = 0

    @SerializedName("bow_duel_wins")
    val bowDuelWins: Int = 0

    @SerializedName("bow_duel_kills")
    val bowDuelKills: Int = 0

    @SerializedName("chat_enabled")
    val chatEnabled: String = ""

    @SerializedName("sw_doubles_armorer_kit_wins")
    val swDoublesArmorerKitWins: Int = 0

    @SerializedName("armorer_kit_wins")
    val armorerKitWins: Int = 0

    @SerializedName("duels_winstreak_best_null")
    val duelsWinstreakBestNull: Int = 0

    @SerializedName("sw_duel_armorer_kit_wins")
    val swDuelArmorerKitWins: Int = 0

    @SerializedName("sw_duel_layout_armorer_5")
    val swDuelLayoutArmorer5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("best_uhc_winstreak")
    val bestUhcWinstreak: Int = 0

    @SerializedName("current_uhc_winstreak")
    val currentUhcWinstreak: Int = 0

    @SerializedName("uhc_doubles_kills")
    val uhcDoublesKills: Int = 0

    @SerializedName("uhc_doubles_bow_shots")
    val uhcDoublesBowShots: Int = 0

    @SerializedName("uhc_doubles_rounds_played")
    val uhcDoublesRoundsPlayed: Int = 0

    @SerializedName("uhc_doubles_melee_swings")
    val uhcDoublesMeleeSwings: Int = 0

    @SerializedName("uhc_doubles_health_regenerated")
    val uhcDoublesHealthRegenerated: Int = 0

    @SerializedName("uhc_doubles_melee_hits")
    val uhcDoublesMeleeHits: Int = 0

    @SerializedName("uhc_doubles_damage_dealt")
    val uhcDoublesDamageDealt: Int = 0

    @SerializedName("uhc_doubles_wins")
    val uhcDoublesWins: Int = 0

    @SerializedName("uhc_doubles_bow_hits")
    val uhcDoublesBowHits: Int = 0

    @SerializedName("sw_tournament_deaths")
    val swTournamentDeaths: Int = 0

    @SerializedName("sw_tournament_bow_hits")
    val swTournamentBowHits: Int = 0

    @SerializedName("sw_tournament_bow_shots")
    val swTournamentBowShots: Int = 0

    @SerializedName("current_no_debuff_winstreak")
    val currentNoDebuffWinstreak: Int = 0

    @SerializedName("best_no_debuff_winstreak")
    val bestNoDebuffWinstreak: Int = 0

    @SerializedName("duels_winstreak_best_potion_duel")
    val duelsWinstreakBestPotionDuel: Int = 0

    @SerializedName("sw_duel_layout_hellhound_5")
    val swDuelLayoutHellhound5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("sw_duel_layout_champion_5")
    val swDuelLayoutChampion5: Map<String, Any> = Collections.emptyMap()

    @SerializedName("blitz_duel_melee_hits")
    val blitzDuelMeleeHits: Int = 0

    @SerializedName("blitz_duel_damage_dealt")
    val blitzDuelDamageDealt: Int = 0

    @SerializedName("uhc_doubles_losses")
    val uhcDoublesLosses: Int = 0

    @SerializedName("uhc_doubles_deaths")
    val uhcDoublesDeaths: Int = 0

    @SerializedName("uhc_four_health_regenerated")
    val uhcFourHealthRegenerated: Int = 0

    @SerializedName("uhc_four_melee_swings")
    val uhcFourMeleeSwings: Int = 0

    @SerializedName("uhc_four_bow_hits")
    val uhcFourBowHits: Int = 0

    @SerializedName("uhc_four_melee_hits")
    val uhcFourMeleeHits: Int = 0

    @SerializedName("uhc_four_rounds_played")
    val uhcFourRoundsPlayed: Int = 0

    @SerializedName("uhc_four_damage_dealt")
    val uhcFourDamageDealt: Int = 0

    @SerializedName("uhc_four_bow_shots")
    val uhcFourBowShots: Int = 0

    @SerializedName("op_doubles_health_regenerated")
    val opDoublesHealthRegenerated: Int = 0

    @SerializedName("op_doubles_melee_hits")
    val opDoublesMeleeHits: Int = 0

    @SerializedName("op_doubles_damage_dealt")
    val opDoublesDamageDealt: Int = 0

    @SerializedName("op_doubles_rounds_played")
    val opDoublesRoundsPlayed: Int = 0

    @SerializedName("op_doubles_melee_swings")
    val opDoublesMeleeSwings: Int = 0

    @SerializedName("mw_duels_class")
    val mwDuelsClass: String = ""

    @SerializedName("mw_doubles_melee_hits")
    val mwDoublesMeleeHits: Int = 0

    @SerializedName("mw_doubles_health_regenerated")
    val mwDoublesHealthRegenerated: Int = 0

    @SerializedName("mw_doubles_damage_dealt")
    val mwDoublesDamageDealt: Int = 0

    @SerializedName("mw_doubles_melee_swings")
    val mwDoublesMeleeSwings: Int = 0

    @SerializedName("mw_doubles_rounds_played")
    val mwDoublesRoundsPlayed: Int = 0

    val coins: Int = 0

    val packages: List<Any> = Collections.emptyList()

    @SerializedName("active_killmessages")
    val activeKillmessages: String = ""

    @SerializedName("best_sumo_winstreak")
    val bestSumoWinstreak: Int = 0

    @SerializedName("current_sumo_winstreak")
    val currentSumoWinstreak: Int = 0

    @SerializedName("sumo_duel_melee_swings")
    val sumoDuelMeleeSwings: Int = 0

    @SerializedName("sumo_duel_wins")
    val sumoDuelWins: Int = 0

    @SerializedName("sumo_duel_rounds_played")
    val sumoDuelRoundsPlayed: Int = 0

    @SerializedName("sumo_duel_melee_hits")
    val sumoDuelMeleeHits: Int = 0

    @SerializedName("sumo_duel_losses")
    val sumoDuelLosses: Int = 0

    @SerializedName("sumo_duel_deaths")
    val sumoDuelDeaths: Int = 0

    @SerializedName("duels_winstreak_best_sumo_duel")
    val duelsWinstreakBestSumoDuel: Int = 0

    @SerializedName("sw_duels_kit_new")
    val swDuelsKitNew: String = ""

    @SerializedName("sumo_tournament_deaths")
    val sumoTournamentDeaths: Int = 0

    @SerializedName("sumo_tournament_rounds_played")
    val sumoTournamentRoundsPlayed: Int = 0

    @SerializedName("sumo_tournament_melee_hits")
    val sumoTournamentMeleeHits: Int = 0

    @SerializedName("sumo_tournament_melee_swings")
    val sumoTournamentMeleeSwings: Int = 0

    @SerializedName("sumo_tournament_losses")
    val sumoTournamentLosses: Int = 0

    @SerializedName("sumo_tournament_wins")
    val sumoTournamentWins: Int = 0

    @SerializedName("duels_chests")
    val duelsChests: Int = 0

    @SerializedName("sw_duel_champion_kit_wins")
    val swDuelChampionKitWins: Int = 0

    @SerializedName("champion_kit_wins")
    val championKitWins: Int = 0

    @SerializedName("Duels_openedCommons")
    val duelsOpenedcommons: Int = 0

    @SerializedName("Duels_openedChests")
    val duelsOpenedchests: Int = 0

    @SerializedName("duels_chest_history")
    val duelsChestHistory: List<Any> = Collections.emptyList()

    @SerializedName("Duels_openedRares")
    val duelsOpenedrares: Int = 0

    @SerializedName("active_emblem")
    val activeEmblem: String = ""

    @SerializedName("current_op_winstreak")
    val currentOpWinstreak: Int = 0

    @SerializedName("best_op_winstreak")
    val bestOpWinstreak: Int = 0

    @SerializedName("current_blitz_winstreak")
    val currentBlitzWinstreak: Int = 0

    @SerializedName("blitz_duel_losses")
    val blitzDuelLosses: Int = 0

    @SerializedName("blitz_duel_deaths")
    val blitzDuelDeaths: Int = 0

    @SerializedName("best_blitz_winstreak")
    val bestBlitzWinstreak: Int = 0

    @SerializedName("duels_winstreak_best_blitz_duel")
    val duelsWinstreakBestBlitzDuel: Int = 0

    @SerializedName("pigman_kit_wins")
    val pigmanKitWins: Int = 0

    @SerializedName("blitz_duel_kit_wins")
    val blitzDuelKitWins: Int = 0

    @SerializedName("blitz_duel_wins")
    val blitzDuelWins: Int = 0

    @SerializedName("blitz_duel_kills")
    val blitzDuelKills: Int = 0

    @SerializedName("blitz_duel_pigman_kit_wins")
    val blitzDuelPigmanKitWins: Int = 0

    @SerializedName("best_combo_winstreak")
    val bestComboWinstreak: Int = 0

    @SerializedName("current_combo_winstreak")
    val currentComboWinstreak: Int = 0

    @SerializedName("current_tnt_games_winstreak")
    val currentTntGamesWinstreak: Int = 0

    @SerializedName("bowspleef_duel_deaths")
    val bowspleefDuelDeaths: Int = 0

    @SerializedName("bowspleef_duel_losses")
    val bowspleefDuelLosses: Int = 0

    @SerializedName("sumo_duel_kills")
    val sumoDuelKills: Int = 0

    @SerializedName("Duels_openedLegendaries")
    val duelsOpenedlegendaries: Int = 0

    @SerializedName("sumo_tournament_kills")
    val sumoTournamentKills: Int = 0

    @SerializedName("potion_duel_deaths")
    val potionDuelDeaths: Int = 0

    @SerializedName("potion_duel_losses")
    val potionDuelLosses: Int = 0

    @SerializedName("active_weaponpacks")
    val activeWeaponpacks: String = ""

    @SerializedName("combo_duel_losses")
    val comboDuelLosses: Int = 0

    @SerializedName("combo_duel_deaths")
    val comboDuelDeaths: Int = 0

    @SerializedName("hellhound_kit_wins")
    val hellhoundKitWins: Int = 0

    @SerializedName("sw_doubles_hellhound_kit_wins")
    val swDoublesHellhoundKitWins: Int = 0

    @SerializedName("salmon_kit_wins")
    val salmonKitWins: Int = 0

    @SerializedName("sw_doubles_salmon_kit_wins")
    val swDoublesSalmonKitWins: Int = 0

    @SerializedName("active_victory_dance")
    val activeVictoryDance: String = ""

    @SerializedName("active_kill_effect")
    val activeKillEffect: String = ""

    @SerializedName("uhc_doubles")
    val uhcDoubles: Boolean = false

    @SerializedName("uhc_four")
    val uhcFour: Boolean = false

    @SerializedName("mw_duel")
    val mwDuel: Boolean = false

    @SerializedName("op_doubles")
    val opDoubles: Boolean = false

    @SerializedName("sw_doubles")
    val swDoubles: Boolean = false

    @SerializedName("Duels_openedEpics")
    val duelsOpenedepics: Int = 0

    @SerializedName("sw_tournament_losses")
    val swTournamentLosses: Int = 0

    @SerializedName("mw_duel_melee_swings")
    val mwDuelMeleeSwings: Int = 0

    @SerializedName("mw_duel_melee_hits")
    val mwDuelMeleeHits: Int = 0

    @SerializedName("mw_duel_health_regenerated")
    val mwDuelHealthRegenerated: Int = 0

    @SerializedName("mw_duel_rounds_played")
    val mwDuelRoundsPlayed: Int = 0

    @SerializedName("mw_duel_damage_dealt")
    val mwDuelDamageDealt: Int = 0

    @SerializedName("mw_duel_bow_shots")
    val mwDuelBowShots: Int = 0

    @SerializedName("sw_tournament_wins")
    val swTournamentWins: Int = 0

    @SerializedName("selected_1_new")
    val selected1New: String = ""

    @SerializedName("selected_2_new")
    val selected2New: String = ""

    @SerializedName("active_projectile_trail")
    val activeProjectileTrail: String = ""

    @SerializedName("mw_doubles")
    val mwDoubles: Boolean = false

    @SerializedName("combo_duel")
    val comboDuel: Boolean = false

    @SerializedName("potion_duel")
    val potionDuel: Boolean = false

    @SerializedName("op_duel")
    val opDuel: Boolean = false

    @SerializedName("sw_duel_bowman_kit_wins")
    val swDuelBowmanKitWins: Int = 0

    @SerializedName("bowman_kit_wins")
    val bowmanKitWins: Int = 0

    @SerializedName("custom_titles")
    val customTitles: List<Any> = Collections.emptyList()

    @SerializedName("special_challenger")
    val specialChallenger: Boolean = false

    @SerializedName("tnt_games_rookie_title_prestige")
    val tntGamesRookieTitlePrestige: Int = 0

    @SerializedName("skywars_legend_title_prestige")
    val skywarsLegendTitlePrestige: Int = 0

    @SerializedName("bow_rookie_title_prestige")
    val bowRookieTitlePrestige: Int = 0

    @SerializedName("no_debuff_rookie_title_prestige")
    val noDebuffRookieTitlePrestige: Int = 0

    @SerializedName("all_modes_godlike_title_prestige")
    val allModesGodlikeTitlePrestige: Int = 0

    @SerializedName("uhc_gold_title_prestige")
    val uhcGoldTitlePrestige: Int = 0

    @SerializedName("mega_walls_rookie_title_prestige")
    val megaWallsRookieTitlePrestige: Int = 0

    @SerializedName("combo_iron_title_prestige")
    val comboIronTitlePrestige: Int = 0

    @SerializedName("classic_grandmaster_title_prestige")
    val classicGrandmasterTitlePrestige: Int = 0

    @SerializedName("tournament_iron_title_prestige")
    val tournamentIronTitlePrestige: Int = 0

    @SerializedName("blitz_rookie_title_prestige")
    val blitzRookieTitlePrestige: Int = 0

    @SerializedName("sumo_godlike_title_prestige")
    val sumoGodlikeTitlePrestige: Int = 0

    @SerializedName("op_gold_title_prestige")
    val opGoldTitlePrestige: Int = 0

    @SerializedName("progress_mode")
    val progressMode: String = ""

    @SerializedName("equipped_custom_titles")
    val equippedCustomTitles: String = ""

    @SerializedName("maps_won_on")
    val mapsWonOn: List<Any> = Collections.emptyList()

    @SerializedName("golden_apples_eaten")
    val goldenApplesEaten: Int = 0

    @SerializedName("combo_duel_golden_apples_eaten")
    val comboDuelGoldenApplesEaten: Int = 0

    @SerializedName("sw_duels_kit_new2")
    val swDuelsKitNew2: String = ""

    @SerializedName("blocks_placed")
    val blocksPlaced: Int = 0

    @SerializedName("sw_tournament_blocks_placed")
    val swTournamentBlocksPlaced: Int = 0

    @SerializedName("uhc_duel_blocks_placed")
    val uhcDuelBlocksPlaced: Int = 0

    @SerializedName("uhc_duel_golden_apples_eaten")
    val uhcDuelGoldenApplesEaten: Int = 0

    @SerializedName("sw_duel_blocks_placed")
    val swDuelBlocksPlaced: Int = 0

    @SerializedName("sw_doubles_blocks_placed")
    val swDoublesBlocksPlaced: Int = 0

    @SerializedName("blitz_duel")
    val blitzDuel: Boolean = false

    @SerializedName("challenges_enabled")
    val challengesEnabled: Boolean = false

    @SerializedName("uhc_doubles_blocks_placed")
    val uhcDoublesBlocksPlaced: Int = 0

    @SerializedName("uhc_doubles_golden_apples_eaten")
    val uhcDoublesGoldenApplesEaten: Int = 0

    @SerializedName("best_tnt_games_winstreak")
    val bestTntGamesWinstreak: Int = 0

    @SerializedName("bowspleef_duel_wins")
    val bowspleefDuelWins: Int = 0

    @SerializedName("duels_winstreak_best_bowspleef_duel")
    val duelsWinstreakBestBowspleefDuel: Int = 0

    @SerializedName("bridge_rookie_title_prestige")
    val bridgeRookieTitlePrestige: Int = 0

    @SerializedName("bridge_four_goals")
    val bridgeFourGoals: Int = 0

    @SerializedName("bridge_doubles_wins")
    val bridgeDoublesWins: Int = 0

    @SerializedName("bridge_3v3v3v3_deaths")
    val bridge3v3v3v3Deaths: Int = 0

    @SerializedName("bridge_four_wins")
    val bridgeFourWins: Int = 0

    @SerializedName("bridge_duel_wins")
    val bridgeDuelWins: Int = 0

    @SerializedName("bridge_duel_deaths")
    val bridgeDuelDeaths: Int = 0

    @SerializedName("bridge_3v3v3v3_losses")
    val bridge3v3v3v3Losses: Int = 0

    @SerializedName("bridge_3v3v3v3_rounds_played")
    val bridge3v3v3v3RoundsPlayed: Int = 0

    @SerializedName("bridge_doubles_deaths")
    val bridgeDoublesDeaths: Int = 0

    @SerializedName("bridge_3v3v3v3_wins")
    val bridge3v3v3v3Wins: Int = 0

    @SerializedName("bridge_four_deaths")
    val bridgeFourDeaths: Int = 0

    val goals: Int = 0

    @SerializedName("bridge_duel_goals")
    val bridgeDuelGoals: Int = 0

    @SerializedName("bridge_doubles_goals")
    val bridgeDoublesGoals: Int = 0

    @SerializedName("bridge_four_rounds_played")
    val bridgeFourRoundsPlayed: Int = 0

    @SerializedName("bridge_four_kills")
    val bridgeFourKills: Int = 0

    @SerializedName("bridge_doubles_rounds_played")
    val bridgeDoublesRoundsPlayed: Int = 0

    @SerializedName("bridge_doubles_kills")
    val bridgeDoublesKills: Int = 0

    @SerializedName("bridge_3v3v3v3_kills")
    val bridge3v3v3v3Kills: Int = 0

    @SerializedName("bridge_doubles_losses")
    val bridgeDoublesLosses: Int = 0

    @SerializedName("bridge_duel_kills")
    val bridgeDuelKills: Int = 0

    @SerializedName("bridge_3v3v3v3_goals")
    val bridge3v3v3v3Goals: Int = 0

    @SerializedName("bridge_duel_rounds_played")
    val bridgeDuelRoundsPlayed: Int = 0

    @SerializedName("best_winstreak_mode_classic_duel")
    val bestWinstreakModeClassicDuel: Int = 0

    @SerializedName("current_winstreak_mode_classic_duel")
    val currentWinstreakModeClassicDuel: Int = 0

    @SerializedName("layout_bow_duel_layout")
    val layoutBowDuelLayout: Map<String, Any> = Collections.emptyMap()

    @SerializedName("layout_classic_duel_layout")
    val layoutClassicDuelLayout: Map<String, Any> = Collections.emptyMap()

    @SerializedName("layout_op_duel_layout")
    val layoutOpDuelLayout: Map<String, Any> = Collections.emptyMap()

    @SerializedName("current_winstreak_mode_uhc_duel")
    val currentWinstreakModeUhcDuel: Int = 0

    @SerializedName("best_winstreak_mode_uhc_duel")
    val bestWinstreakModeUhcDuel: Int = 0

    @SerializedName("best_winstreak_mode_sumo_duel")
    val bestWinstreakModeSumoDuel: Int = 0

    @SerializedName("current_winstreak_mode_sumo_duel")
    val currentWinstreakModeSumoDuel: Int = 0

    @SerializedName("status_field")
    val statusField: String = ""

    @SerializedName("leaderboardPage_win_streak")
    val leaderboardpageWinStreak: Int = 0

    @SerializedName("best_winstreak_mode_sw_doubles")
    val bestWinstreakModeSwDoubles: Int = 0

    @SerializedName("current_winstreak_mode_sw_doubles")
    val currentWinstreakModeSwDoubles: Int = 0

    @SerializedName("current_winstreak_mode_op_duel")
    val currentWinstreakModeOpDuel: Int = 0

    @SerializedName("best_winstreak_mode_op_duel")
    val bestWinstreakModeOpDuel: Int = 0

    @SerializedName("current_winstreak_mode_bridge_duel")
    val currentWinstreakModeBridgeDuel: Int = 0

    @SerializedName("best_winstreak_mode_bridge_duel")
    val bestWinstreakModeBridgeDuel: Int = 0

    @SerializedName("current_bridge_winstreak")
    val currentBridgeWinstreak: Int = 0

    val bridgeMapWins: List<Any> = Collections.emptyList()

    @SerializedName("best_bridge_winstreak")
    val bestBridgeWinstreak: Int = 0

    @SerializedName("bridge_duel_health_regenerated")
    val bridgeDuelHealthRegenerated: Int = 0

    @SerializedName("bridge_duel_damage_dealt")
    val bridgeDuelDamageDealt: Int = 0

    @SerializedName("bridge_duel_melee_hits")
    val bridgeDuelMeleeHits: Int = 0

    @SerializedName("bridge_duel_blocks_placed")
    val bridgeDuelBlocksPlaced: Int = 0

    @SerializedName("bridge_duel_melee_swings")
    val bridgeDuelMeleeSwings: Int = 0

    @SerializedName("bridge_duel_bow_hits")
    val bridgeDuelBowHits: Int = 0

    @SerializedName("bridge_duel_bow_shots")
    val bridgeDuelBowShots: Int = 0

    @SerializedName("duels_winstreak_best_bridge_duel")
    val duelsWinstreakBestBridgeDuel: Int = 0

    @SerializedName("layout_bridge_duel_layout")
    val layoutBridgeDuelLayout: Map<String, Any> = Collections.emptyMap()

    @SerializedName("current_winstreak_mode_potion_duel")
    val currentWinstreakModePotionDuel: Int = 0

    @SerializedName("best_winstreak_mode_potion_duel")
    val bestWinstreakModePotionDuel: Int = 0

    @SerializedName("current_winstreak_mode_combo_duel")
    val currentWinstreakModeComboDuel: Int = 0

    @SerializedName("best_winstreak_mode_combo_duel")
    val bestWinstreakModeComboDuel: Int = 0

    @SerializedName("best_winstreak_mode_uhc_doubles")
    val bestWinstreakModeUhcDoubles: Int = 0

    @SerializedName("current_winstreak_mode_uhc_doubles")
    val currentWinstreakModeUhcDoubles: Int = 0

    @SerializedName("bridge_duel_losses")
    val bridgeDuelLosses: Int = 0

    @SerializedName("current_winstreak_mode_bridge_3v3v3v3")
    val currentWinstreakModeBridge3v3v3v3: Int = 0

    @SerializedName("best_winstreak_mode_bridge_3v3v3v3")
    val bestWinstreakModeBridge3v3v3v3: Int = 0

    @SerializedName("bridge_3v3v3v3_bow_hits")
    val bridge3v3v3v3BowHits: Int = 0

    @SerializedName("bridge_3v3v3v3_melee_hits")
    val bridge3v3v3v3MeleeHits: Int = 0

    @SerializedName("bridge_3v3v3v3_blocks_placed")
    val bridge3v3v3v3BlocksPlaced: Int = 0

    @SerializedName("bridge_3v3v3v3_melee_swings")
    val bridge3v3v3v3MeleeSwings: Int = 0

    @SerializedName("bridge_3v3v3v3_bridge_deaths")
    val bridge3v3v3v3BridgeDeaths: Int = 0

    @SerializedName("bridge_3v3v3v3_bow_shots")
    val bridge3v3v3v3BowShots: Int = 0

    @SerializedName("bridge_3v3v3v3_health_regenerated")
    val bridge3v3v3v3HealthRegenerated: Int = 0

    @SerializedName("bridge_3v3v3v3_bridge_kills")
    val bridge3v3v3v3BridgeKills: Int = 0

    @SerializedName("bridge_kills")
    val bridgeKills: Int = 0

    @SerializedName("bridge_deaths")
    val bridgeDeaths: Int = 0

    @SerializedName("bridge_3v3v3v3_damage_dealt")
    val bridge3v3v3v3DamageDealt: Int = 0

    @SerializedName("uhc_four_golden_apples_eaten")
    val uhcFourGoldenApplesEaten: Int = 0

    @SerializedName("uhc_four_blocks_placed")
    val uhcFourBlocksPlaced: Int = 0

    @SerializedName("best_winstreak_mode_sw_duel")
    val bestWinstreakModeSwDuel: Int = 0

    @SerializedName("current_winstreak_mode_sw_duel")
    val currentWinstreakModeSwDuel: Int = 0

    @SerializedName("combo_gold_title_prestige")
    val comboGoldTitlePrestige: Int = 0

    @SerializedName("tournament_gold_title_prestige")
    val tournamentGoldTitlePrestige: Int = 0

    @SerializedName("current_winstreak_mode_bow_duel")
    val currentWinstreakModeBowDuel: Int = 0

    @SerializedName("best_winstreak_mode_bow_duel")
    val bestWinstreakModeBowDuel: Int = 0

    @SerializedName("active_hat")
    val activeHat: String = ""

    @SerializedName("active_cosmetictitle")
    val activeCosmetictitle: String = ""

    @SerializedName("layout_combo_duel_layout")
    val layoutComboDuelLayout: Map<String, Any> = Collections.emptyMap()

    @SerializedName("sw_duels_kit_new3")
    val swDuelsKitNew3: String = ""

    @SerializedName("bowspleef_duel_bow_shots")
    val bowspleefDuelBowShots: Int = 0

    @SerializedName("combo_diamond_title_prestige")
    val comboDiamondTitlePrestige: Int = 0

    @SerializedName("current_mega_walls_winstreak")
    val currentMegaWallsWinstreak: Int = 0

    @SerializedName("current_winstreak_mode_mw_duel")
    val currentWinstreakModeMwDuel: Int = 0

    @SerializedName("mw_duel_losses")
    val mwDuelLosses: Int = 0

    @SerializedName("mw_duel_deaths")
    val mwDuelDeaths: Int = 0

    val matchHistory2: List<Any> = Collections.emptyList()

    @SerializedName("season_1_reward_fixes")
    val season1RewardFixes: Boolean = false

    @SerializedName("layout_sw_duel_champion")
    val layoutSwDuelChampion: Map<String, Any> = Collections.emptyMap()

    @SerializedName("layout_sw_duel_blacksmith")
    val layoutSwDuelBlacksmith: Map<String, Any> = Collections.emptyMap()

    @SerializedName("bridge_duel_bridge_deaths")
    val bridgeDuelBridgeDeaths: Int = 0

    @SerializedName("bridge_duel_bridge_kills")
    val bridgeDuelBridgeKills: Int = 0

    @SerializedName("current_winstreak_mode_bridge_four")
    val currentWinstreakModeBridgeFour: Int = 0

    @SerializedName("bridge_four_bridge_deaths")
    val bridgeFourBridgeDeaths: Int = 0

    @SerializedName("bridge_four_damage_dealt")
    val bridgeFourDamageDealt: Int = 0

    @SerializedName("bridge_four_bridge_kills")
    val bridgeFourBridgeKills: Int = 0

    @SerializedName("bridge_four_blocks_placed")
    val bridgeFourBlocksPlaced: Int = 0

    @SerializedName("bridge_four_bow_shots")
    val bridgeFourBowShots: Int = 0

    @SerializedName("bridge_four_losses")
    val bridgeFourLosses: Int = 0

    @SerializedName("bridge_four_melee_swings")
    val bridgeFourMeleeSwings: Int = 0

    @SerializedName("bridge_four_health_regenerated")
    val bridgeFourHealthRegenerated: Int = 0

    @SerializedName("bridge_four_melee_hits")
    val bridgeFourMeleeHits: Int = 0

    @SerializedName("best_winstreak_mode_bridge_four")
    val bestWinstreakModeBridgeFour: Int = 0

    @SerializedName("leaderboardPage_wins")
    val leaderboardpageWins: Int = 0

    @SerializedName("mw_duel_bow_hits")
    val mwDuelBowHits: Int = 0

    @SerializedName("best_winstreak_mode_bridge_doubles")
    val bestWinstreakModeBridgeDoubles: Int = 0

    @SerializedName("current_winstreak_mode_bridge_doubles")
    val currentWinstreakModeBridgeDoubles: Int = 0

    @SerializedName("bridge_doubles_damage_dealt")
    val bridgeDoublesDamageDealt: Int = 0

    @SerializedName("bridge_doubles_bridge_kills")
    val bridgeDoublesBridgeKills: Int = 0

    @SerializedName("bridge_doubles_health_regenerated")
    val bridgeDoublesHealthRegenerated: Int = 0

    @SerializedName("bridge_doubles_blocks_placed")
    val bridgeDoublesBlocksPlaced: Int = 0

    @SerializedName("bridge_doubles_bow_shots")
    val bridgeDoublesBowShots: Int = 0

    @SerializedName("bridge_doubles_melee_swings")
    val bridgeDoublesMeleeSwings: Int = 0

    @SerializedName("bridge_doubles_bow_hits")
    val bridgeDoublesBowHits: Int = 0

    @SerializedName("bridge_doubles_melee_hits")
    val bridgeDoublesMeleeHits: Int = 0

    @SerializedName("duels_winstreak_best_bridge_doubles")
    val duelsWinstreakBestBridgeDoubles: Int = 0

    @SerializedName("bridge_doubles_bridge_deaths")
    val bridgeDoublesBridgeDeaths: Int = 0

    @SerializedName("active_goal")
    val activeGoal: String = ""

    @SerializedName("active_cage")
    val activeCage: String = ""

    @SerializedName("layout_sw_duel_armorer")
    val layoutSwDuelArmorer: Map<String, Any> = Collections.emptyMap()

    @SerializedName("layout_sw_duel_kit_ranked_ranked_armorer")
    val layoutSwDuelKitRankedRankedArmorer: Map<String, Any> = Collections.emptyMap()

    @SerializedName("mw_duel_blocks_placed")
    val mwDuelBlocksPlaced: Int = 0

    @SerializedName("duels_recently_played2")
    val duelsRecentlyPlayed2: String = ""

    @SerializedName("layout_uhc_duel_layout")
    val layoutUhcDuelLayout: Map<String, Any> = Collections.emptyMap()

    @SerializedName("bridge_2v2v2v2_health_regenerated")
    val bridge2v2v2v2HealthRegenerated: Int = 0

    @SerializedName("bridge_2v2v2v2_blocks_placed")
    val bridge2v2v2v2BlocksPlaced: Int = 0

    @SerializedName("bridge_2v2v2v2_rounds_played")
    val bridge2v2v2v2RoundsPlayed: Int = 0

    @SerializedName("bridge_2v2v2v2_melee_swings")
    val bridge2v2v2v2MeleeSwings: Int = 0

    @SerializedName("bridge_2v2v2v2_bow_shots")
    val bridge2v2v2v2BowShots: Int = 0

    @SerializedName("bridge_2v2v2v2_melee_hits")
    val bridge2v2v2v2MeleeHits: Int = 0

    @SerializedName("bridge_2v2v2v2_damage_dealt")
    val bridge2v2v2v2DamageDealt: Int = 0

    @SerializedName("bridge_four_bow_hits")
    val bridgeFourBowHits: Int = 0

    @SerializedName("bridge_iron_title_prestige")
    val bridgeIronTitlePrestige: Int = 0

    @SerializedName("blitz_duel_blocks_placed")
    val blitzDuelBlocksPlaced: Int = 0
}

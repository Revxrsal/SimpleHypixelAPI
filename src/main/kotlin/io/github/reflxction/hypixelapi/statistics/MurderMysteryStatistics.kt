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
 * Represents all the *Murder Mystery* statistics of a player.
 */
class MurderMysteryStatistics {

    @SerializedName("murdermystery_books")
    val murderMysteryBooks: List<Any> = Collections.emptyList()

    val wasSpecialRoleLastGame: Boolean = false

    @SerializedName("detective_chance")
    val detectiveChance: Int = 0

    @SerializedName("murderer_chance")
    val murdererChance: Int = 0

    @SerializedName("coins_pickedup_MURDER_CLASSIC")
    val coinsPickedupMurderClassic: Int = 0

    val wins: Int = 0

    @SerializedName("games_ancient_tomb")
    val gamesAncientTomb: Int = 0

    val coins: Int = 0

    @SerializedName("games_ancient_tomb_MURDER_CLASSIC")
    val gamesAncientTombMurderClassic: Int = 0

    @SerializedName("wins_ancient_tomb_MURDER_CLASSIC")
    val winsAncientTombMurderClassic: Int = 0

    @SerializedName("coins_pickedup_ancient_tomb_MURDER_CLASSIC")
    val coinsPickedupAncientTombMurderClassic: Int = 0

    val games: Int = 0

    @SerializedName("games_MURDER_CLASSIC")
    val gamesMurderClassic: Int = 0

    @SerializedName("coins_pickedup")
    val coinsPickedup: Int = 0

    @SerializedName("coins_pickedup_ancient_tomb")
    val coinsPickedupAncientTomb: Int = 0

    @SerializedName("wins_MURDER_CLASSIC")
    val winsMurderClassic: Int = 0

    @SerializedName("wins_ancient_tomb")
    val winsAncientTomb: Int = 0

    @SerializedName("wins_hollywood")
    val winsHollywood: Int = 0

    @SerializedName("wins_hollywood_MURDER_CLASSIC")
    val winsHollywoodMurderClassic: Int = 0

    @SerializedName("coins_pickedup_hollywood_MURDER_CLASSIC")
    val coinsPickedupHollywoodMurderClassic: Int = 0

    @SerializedName("coins_pickedup_hollywood")
    val coinsPickedupHollywood: Int = 0

    @SerializedName("games_hollywood")
    val gamesHollywood: Int = 0

    @SerializedName("games_hollywood_MURDER_CLASSIC")
    val gamesHollywoodMurderClassic: Int = 0

    @SerializedName("games_towerfall_MURDER_CLASSIC")
    val gamesTowerfallMurderClassic: Int = 0

    @SerializedName("coins_pickedup_towerfall")
    val coinsPickedupTowerfall: Int = 0

    @SerializedName("games_towerfall")
    val gamesTowerfall: Int = 0

    @SerializedName("wins_towerfall_MURDER_CLASSIC")
    val winsTowerfallMurderClassic: Int = 0

    @SerializedName("deaths_towerfall_MURDER_CLASSIC")
    val deathsTowerfallMurderClassic: Int = 0

    val deaths: Int = 0

    @SerializedName("deaths_towerfall")
    val deathsTowerfall: Int = 0

    @SerializedName("wins_towerfall")
    val winsTowerfall: Int = 0

    @SerializedName("deaths_MURDER_CLASSIC")
    val deathsMurderClassic: Int = 0

    @SerializedName("coins_pickedup_towerfall_MURDER_CLASSIC")
    val coinsPickedupTowerfallMurderClassic: Int = 0

    @SerializedName("granted_chests")
    val grantedChests: Int = 0

    @SerializedName("mm_chests")
    val mmChests: Int = 0

    @SerializedName("deaths_headquarters")
    val deathsHeadquarters: Int = 0

    @SerializedName("games_headquarters_MURDER_CLASSIC")
    val gamesHeadquartersMurderClassic: Int = 0

    @SerializedName("deaths_headquarters_MURDER_CLASSIC")
    val deathsHeadquartersMurderClassic: Int = 0

    @SerializedName("coins_pickedup_headquarters")
    val coinsPickedupHeadquarters: Int = 0

    @SerializedName("games_headquarters")
    val gamesHeadquarters: Int = 0

    @SerializedName("coins_pickedup_headquarters_MURDER_CLASSIC")
    val coinsPickedupHeadquartersMurderClassic: Int = 0

    @SerializedName("wins_transport")
    val winsTransport: Int = 0

    @SerializedName("coins_pickedup_transport")
    val coinsPickedupTransport: Int = 0

    @SerializedName("wins_transport_MURDER_CLASSIC")
    val winsTransportMurderClassic: Int = 0

    @SerializedName("games_transport_MURDER_CLASSIC")
    val gamesTransportMurderClassic: Int = 0

    @SerializedName("games_transport")
    val gamesTransport: Int = 0

    @SerializedName("coins_pickedup_transport_MURDER_CLASSIC")
    val coinsPickedupTransportMurderClassic: Int = 0

    @SerializedName("games_gold_rush_MURDER_CLASSIC")
    val gamesGoldRushMurderClassic: Int = 0

    @SerializedName("deaths_gold_rush")
    val deathsGoldRush: Int = 0

    @SerializedName("deaths_gold_rush_MURDER_CLASSIC")
    val deathsGoldRushMurderClassic: Int = 0

    @SerializedName("coins_pickedup_gold_rush")
    val coinsPickedupGoldRush: Int = 0

    @SerializedName("games_gold_rush")
    val gamesGoldRush: Int = 0

    @SerializedName("coins_pickedup_gold_rush_MURDER_CLASSIC")
    val coinsPickedupGoldRushMurderClassic: Int = 0

    @SerializedName("wins_library_MURDER_CLASSIC")
    val winsLibraryMurderClassic: Int = 0

    @SerializedName("wins_library")
    val winsLibrary: Int = 0

    @SerializedName("games_library_MURDER_CLASSIC")
    val gamesLibraryMurderClassic: Int = 0

    @SerializedName("coins_pickedup_library")
    val coinsPickedupLibrary: Int = 0

    @SerializedName("coins_pickedup_library_MURDER_CLASSIC")
    val coinsPickedupLibraryMurderClassic: Int = 0

    @SerializedName("games_library")
    val gamesLibrary: Int = 0

    @SerializedName("knife_kills_MURDER_CLASSIC")
    val knifeKillsMurderClassic: Int = 0

    @SerializedName("knife_kills_hollywood")
    val knifeKillsHollywood: Int = 0

    @SerializedName("kills_hollywood")
    val killsHollywood: Int = 0

    @SerializedName("kills_hollywood_MURDER_CLASSIC")
    val killsHollywoodMurderClassic: Int = 0

    @SerializedName("knife_kills_hollywood_MURDER_CLASSIC")
    val knifeKillsHollywoodMurderClassic: Int = 0

    @SerializedName("kills_MURDER_CLASSIC")
    val killsMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_MURDER_CLASSIC")
    val killsAsMurdererMurderClassic: Int = 0

    @SerializedName("kills_as_murderer")
    val killsAsMurderer: Int = 0

    @SerializedName("knife_kills")
    val knifeKills: Int = 0

    @SerializedName("kills_as_murderer_hollywood_MURDER_CLASSIC")
    val killsAsMurdererHollywoodMurderClassic: Int = 0

    val kills: Int = 0

    @SerializedName("kills_as_murderer_hollywood")
    val killsAsMurdererHollywood: Int = 0

    @SerializedName("deaths_hollywood_MURDER_CLASSIC")
    val deathsHollywoodMurderClassic: Int = 0

    @SerializedName("deaths_hollywood")
    val deathsHollywood: Int = 0

    @SerializedName("deaths_hypixel_world")
    val deathsHypixelWorld: Int = 0

    @SerializedName("games_hypixel_world_MURDER_CLASSIC")
    val gamesHypixelWorldMurderClassic: Int = 0

    @SerializedName("deaths_hypixel_world_MURDER_CLASSIC")
    val deathsHypixelWorldMurderClassic: Int = 0

    @SerializedName("wins_hypixel_world_MURDER_CLASSIC")
    val winsHypixelWorldMurderClassic: Int = 0

    @SerializedName("games_hypixel_world")
    val gamesHypixelWorld: Int = 0

    @SerializedName("coins_pickedup_hypixel_world_MURDER_CLASSIC")
    val coinsPickedupHypixelWorldMurderClassic: Int = 0

    @SerializedName("coins_pickedup_hypixel_world")
    val coinsPickedupHypixelWorld: Int = 0

    @SerializedName("wins_hypixel_world")
    val winsHypixelWorld: Int = 0

    @SerializedName("deaths_ancient_tomb_MURDER_CLASSIC")
    val deathsAncientTombMurderClassic: Int = 0

    @SerializedName("deaths_ancient_tomb")
    val deathsAncientTomb: Int = 0

    @SerializedName("wins_gold_rush_MURDER_CLASSIC")
    val winsGoldRushMurderClassic: Int = 0

    @SerializedName("wins_gold_rush")
    val winsGoldRush: Int = 0

    @SerializedName("coins_pickedup_cruise_ship_MURDER_CLASSIC")
    val coinsPickedupCruiseShipMurderClassic: Int = 0

    @SerializedName("games_cruise_ship_MURDER_CLASSIC")
    val gamesCruiseShipMurderClassic: Int = 0

    @SerializedName("deaths_cruise_ship_MURDER_CLASSIC")
    val deathsCruiseShipMurderClassic: Int = 0

    @SerializedName("coins_pickedup_cruise_ship")
    val coinsPickedupCruiseShip: Int = 0

    @SerializedName("games_cruise_ship")
    val gamesCruiseShip: Int = 0

    @SerializedName("deaths_cruise_ship")
    val deathsCruiseShip: Int = 0

    @SerializedName("wins_cruise_ship_MURDER_CLASSIC")
    val winsCruiseShipMurderClassic: Int = 0

    @SerializedName("wins_cruise_ship")
    val winsCruiseShip: Int = 0

    @SerializedName("quickjoin_uses_total")
    val quickjoinUsesTotal: Int = 0

    @SerializedName("quickjoin_uses_Towerfall")
    val quickjoinUsesTowerfall: Int = 0

    @SerializedName("deaths_transport_MURDER_CLASSIC")
    val deathsTransportMurderClassic: Int = 0

    @SerializedName("deaths_transport")
    val deathsTransport: Int = 0

    @SerializedName("bow_kills")
    val bowKills: Int = 0

    @SerializedName("bow_kills_ancient_tomb")
    val bowKillsAncientTomb: Int = 0

    @SerializedName("bow_kills_ancient_tomb_MURDER_CLASSIC")
    val bowKillsAncientTombMurderClassic: Int = 0

    @SerializedName("kills_ancient_tomb_MURDER_CLASSIC")
    val killsAncientTombMurderClassic: Int = 0

    @SerializedName("bow_kills_MURDER_CLASSIC")
    val bowKillsMurderClassic: Int = 0

    @SerializedName("kills_ancient_tomb")
    val killsAncientTomb: Int = 0

    @SerializedName("deaths_MURDER_INFECTION")
    val deathsMurderInfection: Int = 0

    @SerializedName("games_MURDER_INFECTION")
    val gamesMurderInfection: Int = 0

    @SerializedName("deaths_towerfall_MURDER_INFECTION")
    val deathsTowerfallMurderInfection: Int = 0

    @SerializedName("games_towerfall_MURDER_INFECTION")
    val gamesTowerfallMurderInfection: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_cruise_ship_MURDER_INFECTION")
    val longestTimeAsSurvivorSecondsCruiseShipMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_cruise_ship_MURDER_INFECTION")
    val totalTimeSurvivedSecondsCruiseShipMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds")
    val totalTimeSurvivedSeconds: Int = 0

    @SerializedName("longest_time_as_survivor_seconds")
    val longestTimeAsSurvivorSeconds: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_cruise_ship")
    val longestTimeAsSurvivorSecondsCruiseShip: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_MURDER_INFECTION")
    val longestTimeAsSurvivorSecondsMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_cruise_ship")
    val totalTimeSurvivedSecondsCruiseShip: Int = 0

    @SerializedName("total_time_survived_seconds_MURDER_INFECTION")
    val totalTimeSurvivedSecondsMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_cruise_ship")
    val killsAsSurvivorCruiseShip: Int = 0

    @SerializedName("games_cruise_ship_MURDER_INFECTION")
    val gamesCruiseShipMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_MURDER_INFECTION")
    val killsAsSurvivorMurderInfection: Int = 0

    @SerializedName("kills_as_survivor")
    val killsAsSurvivor: Int = 0

    @SerializedName("kills_as_survivor_cruise_ship_MURDER_INFECTION")
    val killsAsSurvivorCruiseShipMurderInfection: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_library")
    val longestTimeAsSurvivorSecondsLibrary: Int = 0

    @SerializedName("total_time_survived_seconds_library_MURDER_INFECTION")
    val totalTimeSurvivedSecondsLibraryMurderInfection: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_library_MURDER_INFECTION")
    val longestTimeAsSurvivorSecondsLibraryMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_library")
    val totalTimeSurvivedSecondsLibrary: Int = 0

    @SerializedName("last_one_alive_library_MURDER_INFECTION")
    val lastOneAliveLibraryMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_library_MURDER_INFECTION")
    val killsAsSurvivorLibraryMurderInfection: Int = 0

    @SerializedName("last_one_alive_MURDER_INFECTION")
    val lastOneAliveMurderInfection: Int = 0

    @SerializedName("last_one_alive")
    val lastOneAlive: Int = 0

    @SerializedName("games_library_MURDER_INFECTION")
    val gamesLibraryMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_library")
    val killsAsSurvivorLibrary: Int = 0

    @SerializedName("last_one_alive_library")
    val lastOneAliveLibrary: Int = 0

    @SerializedName("kills_as_infected_MURDER_INFECTION")
    val killsAsInfectedMurderInfection: Int = 0

    @SerializedName("kills_as_infected")
    val killsAsInfected: Int = 0

    @SerializedName("kills_as_infected_cruise_ship")
    val killsAsInfectedCruiseShip: Int = 0

    @SerializedName("kills_as_infected_cruise_ship_MURDER_INFECTION")
    val killsAsInfectedCruiseShipMurderInfection: Int = 0

    @SerializedName("deaths_library_MURDER_CLASSIC")
    val deathsLibraryMurderClassic: Int = 0

    @SerializedName("deaths_library")
    val deathsLibrary: Int = 0

    @SerializedName("kills_gold_rush_MURDER_CLASSIC")
    val killsGoldRushMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_gold_rush_MURDER_CLASSIC")
    val killsAsMurdererGoldRushMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_gold_rush")
    val killsAsMurdererGoldRush: Int = 0

    @SerializedName("kills_gold_rush")
    val killsGoldRush: Int = 0

    @SerializedName("knife_kills_gold_rush")
    val knifeKillsGoldRush: Int = 0

    @SerializedName("knife_kills_gold_rush_MURDER_CLASSIC")
    val knifeKillsGoldRushMurderClassic: Int = 0

    @SerializedName("wins_headquarters_MURDER_CLASSIC")
    val winsHeadquartersMurderClassic: Int = 0

    @SerializedName("wins_headquarters")
    val winsHeadquarters: Int = 0

    @SerializedName("coins_pickedup_archives")
    val coinsPickedupArchives: Int = 0

    @SerializedName("wins_archives_MURDER_CLASSIC")
    val winsArchivesMurderClassic: Int = 0

    @SerializedName("games_archives_MURDER_CLASSIC")
    val gamesArchivesMurderClassic: Int = 0

    @SerializedName("coins_pickedup_archives_MURDER_CLASSIC")
    val coinsPickedupArchivesMurderClassic: Int = 0

    @SerializedName("games_archives")
    val gamesArchives: Int = 0

    @SerializedName("wins_archives")
    val winsArchives: Int = 0

    @SerializedName("deaths_archives_MURDER_CLASSIC")
    val deathsArchivesMurderClassic: Int = 0

    @SerializedName("deaths_archives")
    val deathsArchives: Int = 0

    @SerializedName("quickjoin_uses_Transport")
    val quickjoinUsesTransport: Int = 0

    @SerializedName("bow_kills_hollywood_MURDER_CLASSIC")
    val bowKillsHollywoodMurderClassic: Int = 0

    @SerializedName("bow_kills_hollywood")
    val bowKillsHollywood: Int = 0

    @SerializedName("kills_as_murderer_headquarters_MURDER_CLASSIC")
    val killsAsMurdererHeadquartersMurderClassic: Int = 0

    @SerializedName("kills_headquarters")
    val killsHeadquarters: Int = 0

    @SerializedName("knife_kills_headquarters")
    val knifeKillsHeadquarters: Int = 0

    @SerializedName("kills_as_murderer_headquarters")
    val killsAsMurdererHeadquarters: Int = 0

    @SerializedName("knife_kills_headquarters_MURDER_CLASSIC")
    val knifeKillsHeadquartersMurderClassic: Int = 0

    @SerializedName("kills_headquarters_MURDER_CLASSIC")
    val killsHeadquartersMurderClassic: Int = 0

    @SerializedName("kills_transport_MURDER_CLASSIC")
    val killsTransportMurderClassic: Int = 0

    @SerializedName("knife_kills_transport_MURDER_CLASSIC")
    val knifeKillsTransportMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills")
    val thrownKnifeKills: Int = 0

    @SerializedName("kills_as_murderer_transport")
    val killsAsMurdererTransport: Int = 0

    @SerializedName("thrown_knife_kills_MURDER_CLASSIC")
    val thrownKnifeKillsMurderClassic: Int = 0

    @SerializedName("kills_transport")
    val killsTransport: Int = 0

    @SerializedName("knife_kills_transport")
    val knifeKillsTransport: Int = 0

    @SerializedName("thrown_knife_kills_transport_MURDER_CLASSIC")
    val thrownKnifeKillsTransportMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_transport")
    val thrownKnifeKillsTransport: Int = 0

    @SerializedName("kills_as_murderer_transport_MURDER_CLASSIC")
    val killsAsMurdererTransportMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_archives")
    val killsAsMurdererArchives: Int = 0

    @SerializedName("knife_kills_archives")
    val knifeKillsArchives: Int = 0

    @SerializedName("kills_archives")
    val killsArchives: Int = 0

    @SerializedName("kills_archives_MURDER_CLASSIC")
    val killsArchivesMurderClassic: Int = 0

    @SerializedName("knife_kills_archives_MURDER_CLASSIC")
    val knifeKillsArchivesMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_archives_MURDER_CLASSIC")
    val killsAsMurdererArchivesMurderClassic: Int = 0

    @SerializedName("detective_wins_library")
    val detectiveWinsLibrary: Int = 0

    @SerializedName("detective_wins")
    val detectiveWins: Int = 0

    @SerializedName("detective_wins_MURDER_CLASSIC")
    val detectiveWinsMurderClassic: Int = 0

    @SerializedName("detective_wins_library_MURDER_CLASSIC")
    val detectiveWinsLibraryMurderClassic: Int = 0

    @SerializedName("detective_wins_hollywood")
    val detectiveWinsHollywood: Int = 0

    @SerializedName("detective_wins_hollywood_MURDER_CLASSIC")
    val detectiveWinsHollywoodMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_towerfall_MURDER_CLASSIC")
    val killsAsMurdererTowerfallMurderClassic: Int = 0

    @SerializedName("knife_kills_towerfall")
    val knifeKillsTowerfall: Int = 0

    @SerializedName("kills_towerfall")
    val killsTowerfall: Int = 0

    @SerializedName("knife_kills_towerfall_MURDER_CLASSIC")
    val knifeKillsTowerfallMurderClassic: Int = 0

    @SerializedName("kills_towerfall_MURDER_CLASSIC")
    val killsTowerfallMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_towerfall")
    val killsAsMurdererTowerfall: Int = 0

    @SerializedName("detective_wins_gold_rush_MURDER_CLASSIC")
    val detectiveWinsGoldRushMurderClassic: Int = 0

    @SerializedName("detective_wins_gold_rush")
    val detectiveWinsGoldRush: Int = 0

    @SerializedName("knife_kills_hypixel_world")
    val knifeKillsHypixelWorld: Int = 0

    @SerializedName("kills_as_murderer_hypixel_world")
    val killsAsMurdererHypixelWorld: Int = 0

    @SerializedName("kills_as_murderer_hypixel_world_MURDER_CLASSIC")
    val killsAsMurdererHypixelWorldMurderClassic: Int = 0

    @SerializedName("kills_hypixel_world_MURDER_CLASSIC")
    val killsHypixelWorldMurderClassic: Int = 0

    @SerializedName("kills_hypixel_world")
    val killsHypixelWorld: Int = 0

    @SerializedName("knife_kills_hypixel_world_MURDER_CLASSIC")
    val knifeKillsHypixelWorldMurderClassic: Int = 0

    @SerializedName("bow_kills_towerfall")
    val bowKillsTowerfall: Int = 0

    @SerializedName("was_hero")
    val wasHero: Int = 0

    @SerializedName("was_hero_MURDER_CLASSIC")
    val wasHeroMurderClassic: Int = 0

    @SerializedName("was_hero_towerfall")
    val wasHeroTowerfall: Int = 0

    @SerializedName("bow_kills_towerfall_MURDER_CLASSIC")
    val bowKillsTowerfallMurderClassic: Int = 0

    @SerializedName("was_hero_towerfall_MURDER_CLASSIC")
    val wasHeroTowerfallMurderClassic: Int = 0

    @SerializedName("detective_wins_hypixel_world")
    val detectiveWinsHypixelWorld: Int = 0

    @SerializedName("detective_wins_hypixel_world_MURDER_CLASSIC")
    val detectiveWinsHypixelWorldMurderClassic: Int = 0

    @SerializedName("quickjoin_uses_Archives")
    val quickjoinUsesArchives: Int = 0

    @SerializedName("kills_cruise_ship")
    val killsCruiseShip: Int = 0

    @SerializedName("kills_as_murderer_cruise_ship")
    val killsAsMurdererCruiseShip: Int = 0

    @SerializedName("kills_as_murderer_cruise_ship_MURDER_CLASSIC")
    val killsAsMurdererCruiseShipMurderClassic: Int = 0

    @SerializedName("knife_kills_cruise_ship_MURDER_CLASSIC")
    val knifeKillsCruiseShipMurderClassic: Int = 0

    @SerializedName("knife_kills_cruise_ship")
    val knifeKillsCruiseShip: Int = 0

    @SerializedName("kills_cruise_ship_MURDER_CLASSIC")
    val killsCruiseShipMurderClassic: Int = 0

    @SerializedName("detective_wins_archives_MURDER_CLASSIC")
    val detectiveWinsArchivesMurderClassic: Int = 0

    @SerializedName("detective_wins_archives")
    val detectiveWinsArchives: Int = 0

    @SerializedName("was_hero_hollywood")
    val wasHeroHollywood: Int = 0

    @SerializedName("was_hero_hollywood_MURDER_CLASSIC")
    val wasHeroHollywoodMurderClassic: Int = 0

    val packages: List<Any> = Collections.emptyList()

    @SerializedName("detective_wins_cruise_ship")
    val detectiveWinsCruiseShip: Int = 0

    @SerializedName("detective_wins_cruise_ship_MURDER_CLASSIC")
    val detectiveWinsCruiseShipMurderClassic: Int = 0

    @SerializedName("kills_library_MURDER_CLASSIC")
    val killsLibraryMurderClassic: Int = 0

    @SerializedName("knife_kills_library_MURDER_CLASSIC")
    val knifeKillsLibraryMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_library")
    val thrownKnifeKillsLibrary: Int = 0

    @SerializedName("kills_as_murderer_library")
    val killsAsMurdererLibrary: Int = 0

    @SerializedName("knife_kills_library")
    val knifeKillsLibrary: Int = 0

    @SerializedName("kills_as_murderer_library_MURDER_CLASSIC")
    val killsAsMurdererLibraryMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_library_MURDER_CLASSIC")
    val thrownKnifeKillsLibraryMurderClassic: Int = 0

    @SerializedName("kills_library")
    val killsLibrary: Int = 0

    @SerializedName("quickjoin_uses_Hypixel World")
    val quickjoinUsesHypixelWorld: Int = 0

    @SerializedName("kills_as_murderer_ancient_tomb_MURDER_CLASSIC")
    val killsAsMurdererAncientTombMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_ancient_tomb")
    val killsAsMurdererAncientTomb: Int = 0

    @SerializedName("thrown_knife_kills_ancient_tomb_MURDER_CLASSIC")
    val thrownKnifeKillsAncientTombMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_ancient_tomb")
    val thrownKnifeKillsAncientTomb: Int = 0

    @SerializedName("detective_wins_ancient_tomb_MURDER_CLASSIC")
    val detectiveWinsAncientTombMurderClassic: Int = 0

    @SerializedName("detective_wins_ancient_tomb")
    val detectiveWinsAncientTomb: Int = 0

    @SerializedName("thrown_knife_kills_archives")
    val thrownKnifeKillsArchives: Int = 0

    @SerializedName("thrown_knife_kills_archives_MURDER_CLASSIC")
    val thrownKnifeKillsArchivesMurderClassic: Int = 0

    @SerializedName("bow_kills_archives")
    val bowKillsArchives: Int = 0

    @SerializedName("bow_kills_archives_MURDER_CLASSIC")
    val bowKillsArchivesMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_headquarters_MURDER_CLASSIC")
    val thrownKnifeKillsHeadquartersMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_headquarters")
    val thrownKnifeKillsHeadquarters: Int = 0

    @SerializedName("detective_wins_headquarters_MURDER_CLASSIC")
    val detectiveWinsHeadquartersMurderClassic: Int = 0

    @SerializedName("detective_wins_headquarters")
    val detectiveWinsHeadquarters: Int = 0

    @SerializedName("knife_kills_ancient_tomb_MURDER_CLASSIC")
    val knifeKillsAncientTombMurderClassic: Int = 0

    @SerializedName("knife_kills_ancient_tomb")
    val knifeKillsAncientTomb: Int = 0

    @SerializedName("detective_wins_towerfall")
    val detectiveWinsTowerfall: Int = 0

    @SerializedName("detective_wins_towerfall_MURDER_CLASSIC")
    val detectiveWinsTowerfallMurderClassic: Int = 0

    @SerializedName("bow_kills_transport_MURDER_CLASSIC")
    val bowKillsTransportMurderClassic: Int = 0

    @SerializedName("bow_kills_transport")
    val bowKillsTransport: Int = 0

    @SerializedName("total_time_survived_seconds_gold_rush")
    val totalTimeSurvivedSecondsGoldRush: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_gold_rush")
    val longestTimeAsSurvivorSecondsGoldRush: Int = 0

    @SerializedName("total_time_survived_seconds_gold_rush_MURDER_INFECTION")
    val totalTimeSurvivedSecondsGoldRushMurderInfection: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_gold_rush_MURDER_INFECTION")
    val longestTimeAsSurvivorSecondsGoldRushMurderInfection: Int = 0

    @SerializedName("games_gold_rush_MURDER_INFECTION")
    val gamesGoldRushMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_gold_rush")
    val killsAsSurvivorGoldRush: Int = 0

    @SerializedName("kills_as_survivor_gold_rush_MURDER_INFECTION")
    val killsAsSurvivorGoldRushMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_ancient_tomb")
    val totalTimeSurvivedSecondsAncientTomb: Int = 0

    @SerializedName("total_time_survived_seconds_ancient_tomb_MURDER_INFECTION")
    val totalTimeSurvivedSecondsAncientTombMurderInfection: Int = 0

    @SerializedName("kills_as_infected_ancient_tomb_MURDER_INFECTION")
    val killsAsInfectedAncientTombMurderInfection: Int = 0

    @SerializedName("games_ancient_tomb_MURDER_INFECTION")
    val gamesAncientTombMurderInfection: Int = 0

    @SerializedName("kills_as_infected_ancient_tomb")
    val killsAsInfectedAncientTomb: Int = 0

    @SerializedName("total_time_survived_seconds_towerfall")
    val totalTimeSurvivedSecondsTowerfall: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_towerfall_MURDER_INFECTION")
    val longestTimeAsSurvivorSecondsTowerfallMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_towerfall_MURDER_INFECTION")
    val totalTimeSurvivedSecondsTowerfallMurderInfection: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_towerfall")
    val longestTimeAsSurvivorSecondsTowerfall: Int = 0

    @SerializedName("total_time_survived_seconds_hollywood_MURDER_INFECTION")
    val totalTimeSurvivedSecondsHollywoodMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_hollywood")
    val totalTimeSurvivedSecondsHollywood: Int = 0

    @SerializedName("games_hollywood_MURDER_INFECTION")
    val gamesHollywoodMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_hollywood")
    val killsAsSurvivorHollywood: Int = 0

    @SerializedName("kills_as_survivor_hollywood_MURDER_INFECTION")
    val killsAsSurvivorHollywoodMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_hypixel_world_MURDER_INFECTION")
    val totalTimeSurvivedSecondsHypixelWorldMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_hypixel_world")
    val totalTimeSurvivedSecondsHypixelWorld: Int = 0

    @SerializedName("games_hypixel_world_MURDER_INFECTION")
    val gamesHypixelWorldMurderInfection: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_hollywood")
    val longestTimeAsSurvivorSecondsHollywood: Int = 0

    @SerializedName("longest_time_as_survivor_seconds_hollywood_MURDER_INFECTION")
    val longestTimeAsSurvivorSecondsHollywoodMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_transport_MURDER_INFECTION")
    val totalTimeSurvivedSecondsTransportMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_transport")
    val totalTimeSurvivedSecondsTransport: Int = 0

    @SerializedName("kills_as_survivor_transport_MURDER_INFECTION")
    val killsAsSurvivorTransportMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_transport")
    val killsAsSurvivorTransport: Int = 0

    @SerializedName("last_one_alive_transport")
    val lastOneAliveTransport: Int = 0

    @SerializedName("games_transport_MURDER_INFECTION")
    val gamesTransportMurderInfection: Int = 0

    @SerializedName("last_one_alive_transport_MURDER_INFECTION")
    val lastOneAliveTransportMurderInfection: Int = 0

    @SerializedName("kills_as_infected_library")
    val killsAsInfectedLibrary: Int = 0

    @SerializedName("kills_as_infected_library_MURDER_INFECTION")
    val killsAsInfectedLibraryMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_towerfall_MURDER_INFECTION")
    val killsAsSurvivorTowerfallMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_towerfall")
    val killsAsSurvivorTowerfall: Int = 0

    @SerializedName("was_hero_transport")
    val wasHeroTransport: Int = 0

    @SerializedName("was_hero_transport_MURDER_CLASSIC")
    val wasHeroTransportMurderClassic: Int = 0

    @SerializedName("survivor_wins")
    val survivorWins: Int = 0

    @SerializedName("survivor_wins_hollywood")
    val survivorWinsHollywood: Int = 0

    @SerializedName("survivor_wins_hollywood_MURDER_INFECTION")
    val survivorWinsHollywoodMurderInfection: Int = 0

    @SerializedName("survivor_wins_MURDER_INFECTION")
    val survivorWinsMurderInfection: Int = 0

    @SerializedName("last_one_alive_towerfall_MURDER_INFECTION")
    val lastOneAliveTowerfallMurderInfection: Int = 0

    @SerializedName("last_one_alive_towerfall")
    val lastOneAliveTowerfall: Int = 0

    @SerializedName("kills_as_infected_hypixel_world")
    val killsAsInfectedHypixelWorld: Int = 0

    @SerializedName("kills_as_infected_hypixel_world_MURDER_INFECTION")
    val killsAsInfectedHypixelWorldMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_ancient_tomb_MURDER_INFECTION")
    val killsAsSurvivorAncientTombMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_ancient_tomb")
    val killsAsSurvivorAncientTomb: Int = 0

    @SerializedName("games_MURDER_ASSASSINS")
    val gamesMurderAssassins: Int = 0

    @SerializedName("deaths_ancient_tomb_MURDER_ASSASSINS")
    val deathsAncientTombMurderAssassins: Int = 0

    @SerializedName("games_ancient_tomb_MURDER_ASSASSINS")
    val gamesAncientTombMurderAssassins: Int = 0

    @SerializedName("deaths_MURDER_ASSASSINS")
    val deathsMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_MURDER_ASSASSINS")
    val coinsPickedupMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_ancient_tomb_MURDER_ASSASSINS")
    val coinsPickedupAncientTombMurderAssassins: Int = 0

    @SerializedName("games_transport_MURDER_ASSASSINS")
    val gamesTransportMurderAssassins: Int = 0

    @SerializedName("deaths_transport_MURDER_ASSASSINS")
    val deathsTransportMurderAssassins: Int = 0

    @SerializedName("wins_ancient_tomb_MURDER_ASSASSINS")
    val winsAncientTombMurderAssassins: Int = 0

    @SerializedName("wins_MURDER_ASSASSINS")
    val winsMurderAssassins: Int = 0

    @SerializedName("games_gold_rush_MURDER_ASSASSINS")
    val gamesGoldRushMurderAssassins: Int = 0

    @SerializedName("deaths_gold_rush_MURDER_ASSASSINS")
    val deathsGoldRushMurderAssassins: Int = 0

    @SerializedName("wins_gold_rush_MURDER_ASSASSINS")
    val winsGoldRushMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_gold_rush_MURDER_ASSASSINS")
    val coinsPickedupGoldRushMurderAssassins: Int = 0

    @SerializedName("kills_as_infected_hollywood_MURDER_INFECTION")
    val killsAsInfectedHollywoodMurderInfection: Int = 0

    @SerializedName("kills_as_infected_hollywood")
    val killsAsInfectedHollywood: Int = 0

    @SerializedName("total_time_survived_seconds_archives_MURDER_INFECTION")
    val totalTimeSurvivedSecondsArchivesMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_archives")
    val totalTimeSurvivedSecondsArchives: Int = 0

    @SerializedName("games_archives_MURDER_INFECTION")
    val gamesArchivesMurderInfection: Int = 0

    @SerializedName("kills_as_infected_archives")
    val killsAsInfectedArchives: Int = 0

    @SerializedName("kills_as_infected_archives_MURDER_INFECTION")
    val killsAsInfectedArchivesMurderInfection: Int = 0

    @SerializedName("last_one_alive_gold_rush")
    val lastOneAliveGoldRush: Int = 0

    @SerializedName("last_one_alive_gold_rush_MURDER_INFECTION")
    val lastOneAliveGoldRushMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_headquarters_MURDER_INFECTION")
    val totalTimeSurvivedSecondsHeadquartersMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_headquarters")
    val totalTimeSurvivedSecondsHeadquarters: Int = 0

    @SerializedName("games_headquarters_MURDER_INFECTION")
    val gamesHeadquartersMurderInfection: Int = 0

    @SerializedName("kills_as_infected_gold_rush")
    val killsAsInfectedGoldRush: Int = 0

    @SerializedName("kills_as_infected_gold_rush_MURDER_INFECTION")
    val killsAsInfectedGoldRushMurderInfection: Int = 0

    @SerializedName("deaths_library_MURDER_INFECTION")
    val deathsLibraryMurderInfection: Int = 0

    @SerializedName("survivor_wins_library_MURDER_INFECTION")
    val survivorWinsLibraryMurderInfection: Int = 0

    @SerializedName("survivor_wins_library")
    val survivorWinsLibrary: Int = 0

    @SerializedName("kills_as_survivor_headquarters_MURDER_INFECTION")
    val killsAsSurvivorHeadquartersMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_headquarters")
    val killsAsSurvivorHeadquarters: Int = 0

    @SerializedName("kills_as_survivor_hypixel_world")
    val killsAsSurvivorHypixelWorld: Int = 0

    @SerializedName("kills_as_survivor_hypixel_world_MURDER_INFECTION")
    val killsAsSurvivorHypixelWorldMurderInfection: Int = 0

    @SerializedName("last_one_alive_hollywood_MURDER_INFECTION")
    val lastOneAliveHollywoodMurderInfection: Int = 0

    @SerializedName("last_one_alive_hollywood")
    val lastOneAliveHollywood: Int = 0

    @SerializedName("bow_kills_hypixel_world_MURDER_CLASSIC")
    val bowKillsHypixelWorldMurderClassic: Int = 0

    @SerializedName("bow_kills_hypixel_world")
    val bowKillsHypixelWorld: Int = 0

    @SerializedName("kills_as_survivor_archives_MURDER_INFECTION")
    val killsAsSurvivorArchivesMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_archives")
    val killsAsSurvivorArchives: Int = 0

    @SerializedName("games_headquarters_MURDER_ASSASSINS")
    val gamesHeadquartersMurderAssassins: Int = 0

    @SerializedName("deaths_headquarters_MURDER_ASSASSINS")
    val deathsHeadquartersMurderAssassins: Int = 0

    @SerializedName("kills_headquarters_MURDER_ASSASSINS")
    val killsHeadquartersMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_headquarters_MURDER_ASSASSINS")
    val coinsPickedupHeadquartersMurderAssassins: Int = 0

    @SerializedName("knife_kills_MURDER_ASSASSINS")
    val knifeKillsMurderAssassins: Int = 0

    @SerializedName("kills_MURDER_ASSASSINS")
    val killsMurderAssassins: Int = 0

    @SerializedName("knife_kills_headquarters_MURDER_ASSASSINS")
    val knifeKillsHeadquartersMurderAssassins: Int = 0

    @SerializedName("deaths_hypixel_world_MURDER_ASSASSINS")
    val deathsHypixelWorldMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_hypixel_world_MURDER_ASSASSINS")
    val coinsPickedupHypixelWorldMurderAssassins: Int = 0

    @SerializedName("games_hypixel_world_MURDER_ASSASSINS")
    val gamesHypixelWorldMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_transport_MURDER_ASSASSINS")
    val coinsPickedupTransportMurderAssassins: Int = 0

    @SerializedName("kills_transport_MURDER_ASSASSINS")
    val killsTransportMurderAssassins: Int = 0

    @SerializedName("wins_transport_MURDER_ASSASSINS")
    val winsTransportMurderAssassins: Int = 0

    @SerializedName("knife_kills_transport_MURDER_ASSASSINS")
    val knifeKillsTransportMurderAssassins: Int = 0

    @SerializedName("kills_as_infected_towerfall")
    val killsAsInfectedTowerfall: Int = 0

    @SerializedName("kills_as_infected_towerfall_MURDER_INFECTION")
    val killsAsInfectedTowerfallMurderInfection: Int = 0

    @SerializedName("games_library_MURDER_ASSASSINS")
    val gamesLibraryMurderAssassins: Int = 0

    @SerializedName("wins_library_MURDER_ASSASSINS")
    val winsLibraryMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_library_MURDER_ASSASSINS")
    val coinsPickedupLibraryMurderAssassins: Int = 0

    @SerializedName("games_hollywood_MURDER_ASSASSINS")
    val gamesHollywoodMurderAssassins: Int = 0

    @SerializedName("deaths_hollywood_MURDER_ASSASSINS")
    val deathsHollywoodMurderAssassins: Int = 0

    @SerializedName("wins_headquarters_MURDER_ASSASSINS")
    val winsHeadquartersMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_hollywood_MURDER_ASSASSINS")
    val coinsPickedupHollywoodMurderAssassins: Int = 0

    @SerializedName("deaths_library_MURDER_ASSASSINS")
    val deathsLibraryMurderAssassins: Int = 0

    @SerializedName("survivor_wins_gold_rush")
    val survivorWinsGoldRush: Int = 0

    @SerializedName("survivor_wins_gold_rush_MURDER_INFECTION")
    val survivorWinsGoldRushMurderInfection: Int = 0

    @SerializedName("wins_hypixel_world_MURDER_ASSASSINS")
    val winsHypixelWorldMurderAssassins: Int = 0

    @SerializedName("knife_kills_ancient_tomb_MURDER_ASSASSINS")
    val knifeKillsAncientTombMurderAssassins: Int = 0

    @SerializedName("kills_ancient_tomb_MURDER_ASSASSINS")
    val killsAncientTombMurderAssassins: Int = 0

    @SerializedName("bow_kills_library_MURDER_CLASSIC")
    val bowKillsLibraryMurderClassic: Int = 0

    @SerializedName("bow_kills_library")
    val bowKillsLibrary: Int = 0

    @SerializedName("kills_as_infected_headquarters_MURDER_INFECTION")
    val killsAsInfectedHeadquartersMurderInfection: Int = 0

    @SerializedName("kills_as_infected_headquarters")
    val killsAsInfectedHeadquarters: Int = 0

    @SerializedName("thrown_knife_kills_hollywood")
    val thrownKnifeKillsHollywood: Int = 0

    @SerializedName("thrown_knife_kills_hollywood_MURDER_CLASSIC")
    val thrownKnifeKillsHollywoodMurderClassic: Int = 0

    @SerializedName("survivor_wins_headquarters_MURDER_INFECTION")
    val survivorWinsHeadquartersMurderInfection: Int = 0

    @SerializedName("survivor_wins_headquarters")
    val survivorWinsHeadquarters: Int = 0

    @SerializedName("survivor_wins_hypixel_world")
    val survivorWinsHypixelWorld: Int = 0

    @SerializedName("survivor_wins_hypixel_world_MURDER_INFECTION")
    val survivorWinsHypixelWorldMurderInfection: Int = 0

    @SerializedName("last_one_alive_ancient_tomb")
    val lastOneAliveAncientTomb: Int = 0

    @SerializedName("last_one_alive_ancient_tomb_MURDER_INFECTION")
    val lastOneAliveAncientTombMurderInfection: Int = 0

    @SerializedName("deaths_hypixel_world_MURDER_INFECTION")
    val deathsHypixelWorldMurderInfection: Int = 0

    @SerializedName("last_one_alive_hypixel_world")
    val lastOneAliveHypixelWorld: Int = 0

    @SerializedName("last_one_alive_hypixel_world_MURDER_INFECTION")
    val lastOneAliveHypixelWorldMurderInfection: Int = 0

    @SerializedName("mm_christmas_chests")
    val mmChristmasChests: Int = 0

    @SerializedName("survivor_wins_towerfall")
    val survivorWinsTowerfall: Int = 0

    @SerializedName("survivor_wins_towerfall_MURDER_INFECTION")
    val survivorWinsTowerfallMurderInfection: Int = 0

    @SerializedName("last_one_alive_archives_MURDER_INFECTION")
    val lastOneAliveArchivesMurderInfection: Int = 0

    @SerializedName("last_one_alive_archives")
    val lastOneAliveArchives: Int = 0

    @SerializedName("last_one_alive_headquarters")
    val lastOneAliveHeadquarters: Int = 0

    @SerializedName("last_one_alive_headquarters_MURDER_INFECTION")
    val lastOneAliveHeadquartersMurderInfection: Int = 0

    @SerializedName("kills_as_infected_transport")
    val killsAsInfectedTransport: Int = 0

    @SerializedName("kills_as_infected_transport_MURDER_INFECTION")
    val killsAsInfectedTransportMurderInfection: Int = 0

    @SerializedName("games_cruise_ship_MURDER_ASSASSINS")
    val gamesCruiseShipMurderAssassins: Int = 0

    @SerializedName("deaths_cruise_ship_MURDER_ASSASSINS")
    val deathsCruiseShipMurderAssassins: Int = 0

    @SerializedName("detective_wins_transport")
    val detectiveWinsTransport: Int = 0

    @SerializedName("detective_wins_transport_MURDER_CLASSIC")
    val detectiveWinsTransportMurderClassic: Int = 0

    @SerializedName("last_one_alive_cruise_ship")
    val lastOneAliveCruiseShip: Int = 0

    @SerializedName("last_one_alive_cruise_ship_MURDER_INFECTION")
    val lastOneAliveCruiseShipMurderInfection: Int = 0

    @SerializedName("was_hero_ancient_tomb")
    val wasHeroAncientTomb: Int = 0

    @SerializedName("was_hero_ancient_tomb_MURDER_CLASSIC")
    val wasHeroAncientTombMurderClassic: Int = 0

    @SerializedName("survivor_wins_transport_MURDER_INFECTION")
    val survivorWinsTransportMurderInfection: Int = 0

    @SerializedName("survivor_wins_transport")
    val survivorWinsTransport: Int = 0

    @SerializedName("survivor_wins_archives_MURDER_INFECTION")
    val survivorWinsArchivesMurderInfection: Int = 0

    @SerializedName("survivor_wins_archives")
    val survivorWinsArchives: Int = 0

    @SerializedName("knife_kills_gold_rush_MURDER_ASSASSINS")
    val knifeKillsGoldRushMurderAssassins: Int = 0

    @SerializedName("kills_gold_rush_MURDER_ASSASSINS")
    val killsGoldRushMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_cruise_ship_MURDER_ASSASSINS")
    val coinsPickedupCruiseShipMurderAssassins: Int = 0

    @SerializedName("deaths_archives_MURDER_ASSASSINS")
    val deathsArchivesMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_archives_MURDER_ASSASSINS")
    val coinsPickedupArchivesMurderAssassins: Int = 0

    @SerializedName("games_archives_MURDER_ASSASSINS")
    val gamesArchivesMurderAssassins: Int = 0

    @SerializedName("survivor_wins_cruise_ship_MURDER_INFECTION")
    val survivorWinsCruiseShipMurderInfection: Int = 0

    @SerializedName("survivor_wins_cruise_ship")
    val survivorWinsCruiseShip: Int = 0

    @SerializedName("wins_MURDER_HARDCORE")
    val winsMurderHardcore: Int = 0

    @SerializedName("games_towerfall_MURDER_HARDCORE")
    val gamesTowerfallMurderHardcore: Int = 0

    @SerializedName("games_MURDER_HARDCORE")
    val gamesMurderHardcore: Int = 0

    @SerializedName("wins_towerfall_MURDER_HARDCORE")
    val winsTowerfallMurderHardcore: Int = 0

    @SerializedName("wins_archives_MURDER_HARDCORE")
    val winsArchivesMurderHardcore: Int = 0

    @SerializedName("games_archives_MURDER_HARDCORE")
    val gamesArchivesMurderHardcore: Int = 0

    @SerializedName("coins_pickedup_archives_MURDER_HARDCORE")
    val coinsPickedupArchivesMurderHardcore: Int = 0

    @SerializedName("coins_pickedup_MURDER_HARDCORE")
    val coinsPickedupMurderHardcore: Int = 0

    @SerializedName("deaths_MURDER_HARDCORE")
    val deathsMurderHardcore: Int = 0

    @SerializedName("deaths_archives_MURDER_HARDCORE")
    val deathsArchivesMurderHardcore: Int = 0

    @SerializedName("wins_archives_MURDER_ASSASSINS")
    val winsArchivesMurderAssassins: Int = 0

    @SerializedName("knife_kills_library_MURDER_ASSASSINS")
    val knifeKillsLibraryMurderAssassins: Int = 0

    @SerializedName("kills_library_MURDER_ASSASSINS")
    val killsLibraryMurderAssassins: Int = 0

    @SerializedName("games_towerfall_MURDER_ASSASSINS")
    val gamesTowerfallMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_towerfall_MURDER_ASSASSINS")
    val coinsPickedupTowerfallMurderAssassins: Int = 0

    @SerializedName("deaths_towerfall_MURDER_ASSASSINS")
    val deathsTowerfallMurderAssassins: Int = 0

    @SerializedName("knife_kills_towerfall_MURDER_ASSASSINS")
    val knifeKillsTowerfallMurderAssassins: Int = 0

    @SerializedName("kills_towerfall_MURDER_ASSASSINS")
    val killsTowerfallMurderAssassins: Int = 0

    @SerializedName("MurderMystery_openedRares")
    val murderMysteryOpenedRares: Int = 0

    @SerializedName("MurderMystery_openedCommons")
    val murderMysteryOpenedCommons: Int = 0

    @SerializedName("MurderMystery_openedChests")
    val murderMysteryOpenedchests: Int = 0

    @SerializedName("chest_history_new")
    val chestHistoryNew: List<Any> = Collections.emptyList()

    @SerializedName("kills_hypixel_world_MURDER_ASSASSINS")
    val killsHypixelWorldMurderAssassins: Int = 0

    @SerializedName("knife_kills_hypixel_world_MURDER_ASSASSINS")
    val knifeKillsHypixelWorldMurderAssassins: Int = 0

    @SerializedName("quickjoin_uses_Gold Rush")
    val quickjoinUsesGoldRush: Int = 0

    @SerializedName("murderer_wins_cruise_ship")
    val murdererWinsCruiseShip: Int = 0

    @SerializedName("murderer_wins_cruise_ship_MURDER_CLASSIC")
    val murdererWinsCruiseShipMurderClassic: Int = 0

    @SerializedName("murderer_wins_MURDER_CLASSIC")
    val murdererWinsMurderClassic: Int = 0

    @SerializedName("murderer_wins")
    val murdererWins: Int = 0

    @SerializedName("wins_hollywood_MURDER_ASSASSINS")
    val winsHollywoodMurderAssassins: Int = 0

    @SerializedName("kills_hollywood_MURDER_ASSASSINS")
    val killsHollywoodMurderAssassins: Int = 0

    @SerializedName("knife_kills_hollywood_MURDER_ASSASSINS")
    val knifeKillsHollywoodMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_MURDER_ASSASSINS")
    val thrownKnifeKillsMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_library_MURDER_ASSASSINS")
    val thrownKnifeKillsLibraryMurderAssassins: Int = 0

    @SerializedName("games_ancient_tomb_MURDER_HARDCORE")
    val gamesAncientTombMurderHardcore: Int = 0

    @SerializedName("wins_ancient_tomb_MURDER_HARDCORE")
    val winsAncientTombMurderHardcore: Int = 0

    @SerializedName("detective_wins_MURDER_HARDCORE")
    val detectiveWinsMurderHardcore: Int = 0

    @SerializedName("detective_wins_archives_MURDER_HARDCORE")
    val detectiveWinsArchivesMurderHardcore: Int = 0

    @SerializedName("coins_pickedup_cruise_ship_MURDER_HARDCORE")
    val coinsPickedupCruiseShipMurderHardcore: Int = 0

    @SerializedName("games_cruise_ship_MURDER_HARDCORE")
    val gamesCruiseShipMurderHardcore: Int = 0

    @SerializedName("wins_cruise_ship_MURDER_HARDCORE")
    val winsCruiseShipMurderHardcore: Int = 0

    @SerializedName("active_kill_note")
    val activeKillNote: String = ""

    @SerializedName("survivor_wins_ancient_tomb")
    val survivorWinsAncientTomb: Int = 0

    @SerializedName("survivor_wins_ancient_tomb_MURDER_INFECTION")
    val survivorWinsAncientTombMurderInfection: Int = 0

    @SerializedName("MurderMystery_openedLegendaries")
    val murderMysteryOpenedLegendaries: Int = 0

    @SerializedName("MurderMystery_openedEpics")
    val murderMysteryOpenedEpics: Int = 0

    @SerializedName("trap_kills_towerfall_MURDER_INFECTION")
    val trapKillsTowerfallMurderInfection: Int = 0

    @SerializedName("trap_kills_towerfall")
    val trapKillsTowerfall: Int = 0

    @SerializedName("trap_kills_MURDER_INFECTION")
    val trapKillsMurderInfection: Int = 0

    @SerializedName("kills_MURDER_INFECTION")
    val killsMurderInfection: Int = 0

    @SerializedName("trap_kills")
    val trapKills: Int = 0

    @SerializedName("kills_towerfall_MURDER_INFECTION")
    val killsTowerfallMurderInfection: Int = 0

    @SerializedName("active_victory_dance")
    val activeVictoryDance: String = ""

    @SerializedName("active_gesture")
    val activeGesture: String = ""

    @SerializedName("games_mountain_MURDER_SHOWDOWN")
    val gamesMountainMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_mountain")
    val coinsPickedupMountain: Int = 0

    @SerializedName("coins_pickedup_mountain_MURDER_SHOWDOWN")
    val coinsPickedupMountainMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_MURDER_SHOWDOWN")
    val coinsPickedupMurderShowdown: Int = 0

    @SerializedName("games_mountain")
    val gamesMountain: Int = 0

    @SerializedName("games_MURDER_SHOWDOWN")
    val gamesMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_archives_MURDER_SHOWDOWN")
    val coinsPickedupArchivesMurderShowdown: Int = 0

    @SerializedName("games_archives_MURDER_SHOWDOWN")
    val gamesArchivesMurderShowdown: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_MURDER_SHOWDOWN")
    val quickestShowdownWinTimeSecondsMurderShowdown: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_transport")
    val quickestShowdownWinTimeSecondsTransport: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds")
    val quickestShowdownWinTimeSeconds: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_transport_MURDER_SHOWDOWN")
    val quickestShowdownWinTimeSecondsTransportMurderShowdown: Int = 0

    @SerializedName("wins_transport_MURDER_SHOWDOWN")
    val winsTransportMurderShowdown: Int = 0

    @SerializedName("kills_MURDER_SHOWDOWN")
    val killsMurderShowdown: Int = 0

    @SerializedName("games_transport_MURDER_SHOWDOWN")
    val gamesTransportMurderShowdown: Int = 0

    @SerializedName("knife_kills_MURDER_SHOWDOWN")
    val knifeKillsMurderShowdown: Int = 0

    @SerializedName("wins_MURDER_SHOWDOWN")
    val winsMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_transport_MURDER_SHOWDOWN")
    val coinsPickedupTransportMurderShowdown: Int = 0

    @SerializedName("kills_transport_MURDER_SHOWDOWN")
    val killsTransportMurderShowdown: Int = 0

    @SerializedName("knife_kills_transport_MURDER_SHOWDOWN")
    val knifeKillsTransportMurderShowdown: Int = 0

    @SerializedName("kills_mountain")
    val killsMountain: Int = 0

    @SerializedName("knife_kills_mountain_MURDER_SHOWDOWN")
    val knifeKillsMountainMurderShowdown: Int = 0

    @SerializedName("kills_mountain_MURDER_SHOWDOWN")
    val killsMountainMurderShowdown: Int = 0

    @SerializedName("knife_kills_mountain")
    val knifeKillsMountain: Int = 0

    @SerializedName("wins_mountain")
    val winsMountain: Int = 0

    @SerializedName("wins_mountain_MURDER_SHOWDOWN")
    val winsMountainMurderShowdown: Int = 0

    @SerializedName("bow_kills_mountain")
    val bowKillsMountain: Int = 0

    @SerializedName("bow_kills_mountain_MURDER_SHOWDOWN")
    val bowKillsMountainMurderShowdown: Int = 0

    @SerializedName("bow_kills_MURDER_SHOWDOWN")
    val bowKillsMurderShowdown: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_ancient_tomb")
    val quickestShowdownWinTimeSecondsAncientTomb: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_ancient_tomb_MURDER_SHOWDOWN")
    val quickestShowdownWinTimeSecondsAncientTombMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_ancient_tomb_MURDER_SHOWDOWN")
    val coinsPickedupAncientTombMurderShowdown: Int = 0

    @SerializedName("games_ancient_tomb_MURDER_SHOWDOWN")
    val gamesAncientTombMurderShowdown: Int = 0

    @SerializedName("bow_kills_ancient_tomb_MURDER_SHOWDOWN")
    val bowKillsAncientTombMurderShowdown: Int = 0

    @SerializedName("kills_ancient_tomb_MURDER_SHOWDOWN")
    val killsAncientTombMurderShowdown: Int = 0

    @SerializedName("wins_ancient_tomb_MURDER_SHOWDOWN")
    val winsAncientTombMurderShowdown: Int = 0

    @SerializedName("games_hollywood_MURDER_SHOWDOWN")
    val gamesHollywoodMurderShowdown: Int = 0

    @SerializedName("wins_hollywood_MURDER_SHOWDOWN")
    val winsHollywoodMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_hollywood_MURDER_SHOWDOWN")
    val coinsPickedupHollywoodMurderShowdown: Int = 0

    @SerializedName("kills_archives_MURDER_SHOWDOWN")
    val killsArchivesMurderShowdown: Int = 0

    @SerializedName("wins_archives_MURDER_SHOWDOWN")
    val winsArchivesMurderShowdown: Int = 0

    @SerializedName("knife_kills_archives_MURDER_SHOWDOWN")
    val knifeKillsArchivesMurderShowdown: Int = 0

    @SerializedName("bow_kills_archives_MURDER_SHOWDOWN")
    val bowKillsArchivesMurderShowdown: Int = 0

    @SerializedName("knife_kills_cruise_ship_MURDER_SHOWDOWN")
    val knifeKillsCruiseShipMurderShowdown: Int = 0

    @SerializedName("games_cruise_ship_MURDER_SHOWDOWN")
    val gamesCruiseShipMurderShowdown: Int = 0

    @SerializedName("kills_cruise_ship_MURDER_SHOWDOWN")
    val killsCruiseShipMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_cruise_ship_MURDER_SHOWDOWN")
    val coinsPickedupCruiseShipMurderShowdown: Int = 0

    @SerializedName("kills_library_MURDER_SHOWDOWN")
    val killsLibraryMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_library_MURDER_SHOWDOWN")
    val coinsPickedupLibraryMurderShowdown: Int = 0

    @SerializedName("games_library_MURDER_SHOWDOWN")
    val gamesLibraryMurderShowdown: Int = 0

    @SerializedName("bow_kills_library_MURDER_SHOWDOWN")
    val bowKillsLibraryMurderShowdown: Int = 0

    @SerializedName("wins_library_MURDER_SHOWDOWN")
    val winsLibraryMurderShowdown: Int = 0

    @SerializedName("knife_kills_library_MURDER_SHOWDOWN")
    val knifeKillsLibraryMurderShowdown: Int = 0

    @SerializedName("bow_kills_cruise_ship_MURDER_SHOWDOWN")
    val bowKillsCruiseShipMurderShowdown: Int = 0

    @SerializedName("bow_kills_cruise_ship")
    val bowKillsCruiseShip: Int = 0

    @SerializedName("wins_cruise_ship_MURDER_SHOWDOWN")
    val winsCruiseShipMurderShowdown: Int = 0

    @SerializedName("games_towerfall_MURDER_SHOWDOWN")
    val gamesTowerfallMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_towerfall_MURDER_SHOWDOWN")
    val coinsPickedupTowerfallMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_headquarters_MURDER_SHOWDOWN")
    val coinsPickedupHeadquartersMurderShowdown: Int = 0

    @SerializedName("knife_kills_headquarters_MURDER_SHOWDOWN")
    val knifeKillsHeadquartersMurderShowdown: Int = 0

    @SerializedName("games_headquarters_MURDER_SHOWDOWN")
    val gamesHeadquartersMurderShowdown: Int = 0

    @SerializedName("kills_headquarters_MURDER_SHOWDOWN")
    val killsHeadquartersMurderShowdown: Int = 0

    @SerializedName("wins_towerfall_MURDER_SHOWDOWN")
    val winsTowerfallMurderShowdown: Int = 0

    @SerializedName("wins_headquarters_MURDER_SHOWDOWN")
    val winsHeadquartersMurderShowdown: Int = 0

    @SerializedName("bow_kills_transport_MURDER_SHOWDOWN")
    val bowKillsTransportMurderShowdown: Int = 0

    @SerializedName("bow_kills_headquarters_MURDER_SHOWDOWN")
    val bowKillsHeadquartersMurderShowdown: Int = 0

    @SerializedName("bow_kills_headquarters")
    val bowKillsHeadquarters: Int = 0

    @SerializedName("coins_pickedup_mountain_MURDER_CLASSIC")
    val coinsPickedupMountainMurderClassic: Int = 0

    @SerializedName("games_mountain_MURDER_CLASSIC")
    val gamesMountainMurderClassic: Int = 0

    @SerializedName("wins_mountain_MURDER_CLASSIC")
    val winsMountainMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_cruise_ship")
    val thrownKnifeKillsCruiseShip: Int = 0

    @SerializedName("thrown_knife_kills_cruise_ship_MURDER_CLASSIC")
    val thrownKnifeKillsCruiseShipMurderClassic: Int = 0

    @SerializedName("was_hero_library_MURDER_CLASSIC")
    val wasHeroLibraryMurderClassic: Int = 0

    @SerializedName("was_hero_library")
    val wasHeroLibrary: Int = 0

    @SerializedName("kills_mountain_MURDER_CLASSIC")
    val killsMountainMurderClassic: Int = 0

    @SerializedName("deaths_mountain")
    val deathsMountain: Int = 0

    @SerializedName("thrown_knife_kills_mountain")
    val thrownKnifeKillsMountain: Int = 0

    @SerializedName("kills_as_murderer_mountain_MURDER_CLASSIC")
    val killsAsMurdererMountainMurderClassic: Int = 0

    @SerializedName("knife_kills_mountain_MURDER_CLASSIC")
    val knifeKillsMountainMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_mountain_MURDER_CLASSIC")
    val thrownKnifeKillsMountainMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_mountain")
    val killsAsMurdererMountain: Int = 0

    @SerializedName("deaths_mountain_MURDER_CLASSIC")
    val deathsMountainMurderClassic: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_MURDER_CLASSIC")
    val quickestDetectiveWinTimeSecondsMurderClassic: Int = 0

    @SerializedName("quickest_detective_win_time_seconds")
    val quickestDetectiveWinTimeSeconds: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_headquarters_MURDER_CLASSIC")
    val quickestDetectiveWinTimeSecondsHeadquartersMurderClassic: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_headquarters")
    val quickestDetectiveWinTimeSecondsHeadquarters: Int = 0

    @SerializedName("trap_kills_MURDER_CLASSIC")
    val trapKillsMurderClassic: Int = 0

    @SerializedName("trap_kills_towerfall_MURDER_CLASSIC")
    val trapKillsTowerfallMurderClassic: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds")
    val quickestMurdererWinTimeSeconds: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_ancient_tomb_MURDER_CLASSIC")
    val quickestMurdererWinTimeSecondsAncientTombMurderClassic: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_ancient_tomb")
    val quickestMurdererWinTimeSecondsAncientTomb: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_MURDER_CLASSIC")
    val quickestMurdererWinTimeSecondsMurderClassic: Int = 0

    @SerializedName("murderer_wins_ancient_tomb_MURDER_CLASSIC")
    val murdererWinsAncientTombMurderClassic: Int = 0

    @SerializedName("murderer_wins_ancient_tomb")
    val murdererWinsAncientTomb: Int = 0

    @SerializedName("was_hero_cruise_ship_MURDER_CLASSIC")
    val wasHeroCruiseShipMurderClassic: Int = 0

    @SerializedName("was_hero_cruise_ship")
    val wasHeroCruiseShip: Int = 0

    @SerializedName("bow_kills_cruise_ship_MURDER_CLASSIC")
    val bowKillsCruiseShipMurderClassic: Int = 0

    @SerializedName("detective_wins_mountain")
    val detectiveWinsMountain: Int = 0

    @SerializedName("detective_wins_mountain_MURDER_CLASSIC")
    val detectiveWinsMountainMurderClassic: Int = 0

    @SerializedName("quickjoin_uses_Mountain")
    val quickjoinUsesMountain: Int = 0

    @SerializedName("bow_kills_mountain_MURDER_CLASSIC")
    val bowKillsMountainMurderClassic: Int = 0

    @SerializedName("was_hero_mountain")
    val wasHeroMountain: Int = 0

    @SerializedName("was_hero_mountain_MURDER_CLASSIC")
    val wasHeroMountainMurderClassic: Int = 0

    val showqueuebook: Boolean = false

    @SerializedName("deaths_mountain_MURDER_SHOWDOWN")
    val deathsMountainMurderShowdown: Int = 0

    @SerializedName("deaths_MURDER_SHOWDOWN")
    val deathsMurderShowdown: Int = 0

    @SerializedName("knife_kills_ancient_tomb_MURDER_SHOWDOWN")
    val knifeKillsAncientTombMurderShowdown: Int = 0

    @SerializedName("deaths_ancient_tomb_MURDER_SHOWDOWN")
    val deathsAncientTombMurderShowdown: Int = 0

    @SerializedName("deaths_archives_MURDER_SHOWDOWN")
    val deathsArchivesMurderShowdown: Int = 0

    @SerializedName("games_gold_rush_MURDER_SHOWDOWN")
    val gamesGoldRushMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_gold_rush_MURDER_SHOWDOWN")
    val coinsPickedupGoldRushMurderShowdown: Int = 0

    @SerializedName("deaths_gold_rush_MURDER_SHOWDOWN")
    val deathsGoldRushMurderShowdown: Int = 0

    @SerializedName("deaths_hollywood_MURDER_SHOWDOWN")
    val deathsHollywoodMurderShowdown: Int = 0

    @SerializedName("knife_kills_hollywood_MURDER_SHOWDOWN")
    val knifeKillsHollywoodMurderShowdown: Int = 0

    @SerializedName("kills_hollywood_MURDER_SHOWDOWN")
    val killsHollywoodMurderShowdown: Int = 0

    @SerializedName("kills_hypixel_world_MURDER_SHOWDOWN")
    val killsHypixelWorldMurderShowdown: Int = 0

    @SerializedName("games_hypixel_world_MURDER_SHOWDOWN")
    val gamesHypixelWorldMurderShowdown: Int = 0

    @SerializedName("knife_kills_hypixel_world_MURDER_SHOWDOWN")
    val knifeKillsHypixelWorldMurderShowdown: Int = 0

    @SerializedName("deaths_hypixel_world_MURDER_SHOWDOWN")
    val deathsHypixelWorldMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_hypixel_world_MURDER_SHOWDOWN")
    val coinsPickedupHypixelWorldMurderShowdown: Int = 0

    @SerializedName("knife_kills_gold_rush_MURDER_SHOWDOWN")
    val knifeKillsGoldRushMurderShowdown: Int = 0

    @SerializedName("kills_gold_rush_MURDER_SHOWDOWN")
    val killsGoldRushMurderShowdown: Int = 0

    @SerializedName("bow_kills_hollywood_MURDER_SHOWDOWN")
    val bowKillsHollywoodMurderShowdown: Int = 0

    @SerializedName("bow_kills_hypixel_world_MURDER_SHOWDOWN")
    val bowKillsHypixelWorldMurderShowdown: Int = 0

    @SerializedName("deaths_library_MURDER_SHOWDOWN")
    val deathsLibraryMurderShowdown: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_mountain_MURDER_CLASSIC")
    val quickestDetectiveWinTimeSecondsMountainMurderClassic: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_mountain")
    val quickestDetectiveWinTimeSecondsMountain: Int = 0

    @SerializedName("thrown_knife_kills_hypixel_world")
    val thrownKnifeKillsHypixelWorld: Int = 0

    @SerializedName("thrown_knife_kills_hypixel_world_MURDER_CLASSIC")
    val thrownKnifeKillsHypixelWorldMurderClassic: Int = 0

    @SerializedName("deaths_cruise_ship_MURDER_SHOWDOWN")
    val deathsCruiseShipMurderShowdown: Int = 0

    @SerializedName("deaths_transport_MURDER_SHOWDOWN")
    val deathsTransportMurderShowdown: Int = 0

    @SerializedName("deaths_towerfall_MURDER_SHOWDOWN")
    val deathsTowerfallMurderShowdown: Int = 0

    @SerializedName("knife_kills_towerfall_MURDER_SHOWDOWN")
    val knifeKillsTowerfallMurderShowdown: Int = 0

    @SerializedName("kills_towerfall_MURDER_SHOWDOWN")
    val killsTowerfallMurderShowdown: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_towerfall")
    val quickestShowdownWinTimeSecondsTowerfall: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_towerfall_MURDER_SHOWDOWN")
    val quickestShowdownWinTimeSecondsTowerfallMurderShowdown: Int = 0

    @SerializedName("thrown_knife_kills_gold_rush")
    val thrownKnifeKillsGoldRush: Int = 0

    @SerializedName("thrown_knife_kills_gold_rush_MURDER_CLASSIC")
    val thrownKnifeKillsGoldRushMurderClassic: Int = 0

    @SerializedName("total_time_survived_seconds_mountain_MURDER_INFECTION")
    val totalTimeSurvivedSecondsMountainMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_mountain")
    val totalTimeSurvivedSecondsMountain: Int = 0

    @SerializedName("games_mountain_MURDER_INFECTION")
    val gamesMountainMurderInfection: Int = 0

    @SerializedName("kills_as_infected_mountain")
    val killsAsInfectedMountain: Int = 0

    @SerializedName("kills_as_infected_mountain_MURDER_INFECTION")
    val killsAsInfectedMountainMurderInfection: Int = 0

    @SerializedName("deaths_mountain_MURDER_INFECTION")
    val deathsMountainMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_mountain")
    val killsAsSurvivorMountain: Int = 0

    @SerializedName("kills_as_survivor_mountain_MURDER_INFECTION")
    val killsAsSurvivorMountainMurderInfection: Int = 0

    @SerializedName("last_one_alive_mountain")
    val lastOneAliveMountain: Int = 0

    @SerializedName("last_one_alive_mountain_MURDER_INFECTION")
    val lastOneAliveMountainMurderInfection: Int = 0

    @SerializedName("survivor_wins_mountain_MURDER_INFECTION")
    val survivorWinsMountainMurderInfection: Int = 0

    @SerializedName("survivor_wins_mountain")
    val survivorWinsMountain: Int = 0

    @SerializedName("was_hero_hypixel_world_MURDER_CLASSIC")
    val wasHeroHypixelWorldMurderClassic: Int = 0

    @SerializedName("was_hero_hypixel_world")
    val wasHeroHypixelWorld: Int = 0

    @SerializedName("wins_hypixel_world_MURDER_SHOWDOWN")
    val winsHypixelWorldMurderShowdown: Int = 0

    @SerializedName("showdown_potg_mountain_MURDER_SHOWDOWN")
    val showdownPotgMountainMurderShowdown: Int = 0

    @SerializedName("showdown_potg")
    val showdownPotg: Int = 0

    @SerializedName("showdown_potg_MURDER_SHOWDOWN")
    val showdownPotgMurderShowdown: Int = 0

    @SerializedName("showdown_potg_mountain")
    val showdownPotgMountain: Int = 0

    @SerializedName("bow_kills_towerfall_MURDER_SHOWDOWN")
    val bowKillsTowerfallMurderShowdown: Int = 0

    @SerializedName("deaths_headquarters_MURDER_SHOWDOWN")
    val deathsHeadquartersMurderShowdown: Int = 0

    @SerializedName("showdown_potg_library_MURDER_SHOWDOWN")
    val showdownPotgLibraryMurderShowdown: Int = 0

    @SerializedName("showdown_potg_library")
    val showdownPotgLibrary: Int = 0

    @SerializedName("bow_kills_gold_rush_MURDER_SHOWDOWN")
    val bowKillsGoldRushMurderShowdown: Int = 0

    @SerializedName("bow_kills_gold_rush")
    val bowKillsGoldRush: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_headquarters_MURDER_CLASSIC")
    val quickestMurdererWinTimeSecondsHeadquartersMurderClassic: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_headquarters")
    val quickestMurdererWinTimeSecondsHeadquarters: Int = 0

    @SerializedName("murderer_wins_headquarters")
    val murdererWinsHeadquarters: Int = 0

    @SerializedName("murderer_wins_headquarters_MURDER_CLASSIC")
    val murdererWinsHeadquartersMurderClassic: Int = 0

    @SerializedName("was_hero_archives")
    val wasHeroArchives: Int = 0

    @SerializedName("was_hero_archives_MURDER_CLASSIC")
    val wasHeroArchivesMurderClassic: Int = 0

    @SerializedName("wins_gold_rush_MURDER_SHOWDOWN")
    val winsGoldRushMurderShowdown: Int = 0

    @SerializedName("thrown_knife_kills_towerfall")
    val thrownKnifeKillsTowerfall: Int = 0

    @SerializedName("thrown_knife_kills_towerfall_MURDER_CLASSIC")
    val thrownKnifeKillsTowerfallMurderClassic: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_hollywood")
    val quickestMurdererWinTimeSecondsHollywood: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_hollywood_MURDER_CLASSIC")
    val quickestMurdererWinTimeSecondsHollywoodMurderClassic: Int = 0

    @SerializedName("murderer_wins_hollywood")
    val murdererWinsHollywood: Int = 0

    @SerializedName("murderer_wins_hollywood_MURDER_CLASSIC")
    val murdererWinsHollywoodMurderClassic: Int = 0

    @SerializedName("active_knife_skin")
    val activeKnifeSkin: String = ""

    @SerializedName("bow_kills_headquarters_MURDER_CLASSIC")
    val bowKillsHeadquartersMurderClassic: Int = 0

    @SerializedName("showdown_potg_hypixel_world_MURDER_SHOWDOWN")
    val showdownPotgHypixelWorldMurderShowdown: Int = 0

    @SerializedName("showdown_potg_hypixel_world")
    val showdownPotgHypixelWorld: Int = 0

    @SerializedName("showdown_potg_transport")
    val showdownPotgTransport: Int = 0

    @SerializedName("showdown_potg_transport_MURDER_SHOWDOWN")
    val showdownPotgTransportMurderShowdown: Int = 0

    @SerializedName("showdown_potg_archives_MURDER_SHOWDOWN")
    val showdownPotgArchivesMurderShowdown: Int = 0

    @SerializedName("showdown_potg_archives")
    val showdownPotgArchives: Int = 0

    @SerializedName("bow_kills_gold_rush_MURDER_CLASSIC")
    val bowKillsGoldRushMurderClassic: Int = 0

    @SerializedName("was_hero_gold_rush_MURDER_CLASSIC")
    val wasHeroGoldRushMurderClassic: Int = 0

    @SerializedName("was_hero_gold_rush")
    val wasHeroGoldRush: Int = 0

    @SerializedName("showdown_potg_hollywood")
    val showdownPotgHollywood: Int = 0

    @SerializedName("showdown_potg_hollywood_MURDER_SHOWDOWN")
    val showdownPotgHollywoodMurderShowdown: Int = 0

    @SerializedName("was_hero_headquarters")
    val wasHeroHeadquarters: Int = 0

    @SerializedName("was_hero_headquarters_MURDER_CLASSIC")
    val wasHeroHeadquartersMurderClassic: Int = 0

    @SerializedName("showdown_potg_gold_rush")
    val showdownPotgGoldRush: Int = 0

    @SerializedName("showdown_potg_gold_rush_MURDER_SHOWDOWN")
    val showdownPotgGoldRushMurderShowdown: Int = 0

    @SerializedName("showdown_potg_ancient_tomb_MURDER_SHOWDOWN")
    val showdownPotgAncientTombMurderShowdown: Int = 0

    @SerializedName("showdown_potg_ancient_tomb")
    val showdownPotgAncientTomb: Int = 0

    @SerializedName("suicides_MURDER_CLASSIC")
    val suicidesMurderClassic: Int = 0

    @SerializedName("suicides_library")
    val suicidesLibrary: Int = 0

    val suicides: Int = 0

    @SerializedName("suicides_library_MURDER_CLASSIC")
    val suicidesLibraryMurderClassic: Int = 0

    @SerializedName("showdown_potg_headquarters")
    val showdownPotgHeadquarters: Int = 0

    @SerializedName("showdown_potg_headquarters_MURDER_SHOWDOWN")
    val showdownPotgHeadquartersMurderShowdown: Int = 0

    @SerializedName("showdown_potg_towerfall_MURDER_SHOWDOWN")
    val showdownPotgTowerfallMurderShowdown: Int = 0

    @SerializedName("showdown_potg_towerfall")
    val showdownPotgTowerfall: Int = 0

    @SerializedName("showdown_potg_cruise_ship")
    val showdownPotgCruiseShip: Int = 0

    @SerializedName("showdown_potg_cruise_ship_MURDER_SHOWDOWN")
    val showdownPotgCruiseShipMurderShowdown: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_gold_rush")
    val quickestDetectiveWinTimeSecondsGoldRush: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_gold_rush_MURDER_CLASSIC")
    val quickestDetectiveWinTimeSecondsGoldRushMurderClassic: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_hypixel_world_MURDER_CLASSIC")
    val quickestDetectiveWinTimeSecondsHypixelWorldMurderClassic: Int = 0

    @SerializedName("quickest_detective_win_time_seconds_hypixel_world")
    val quickestDetectiveWinTimeSecondsHypixelWorld: Int = 0

    @SerializedName("kills_cruise_ship_MURDER_ASSASSINS")
    val killsCruiseShipMurderAssassins: Int = 0

    @SerializedName("knife_kills_cruise_ship_MURDER_ASSASSINS")
    val knifeKillsCruiseShipMurderAssassins: Int = 0

    @SerializedName("bow_kills_towerfall_MURDER_ASSASSINS")
    val bowKillsTowerfallMurderAssassins: Int = 0

    @SerializedName("bow_kills_MURDER_ASSASSINS")
    val bowKillsMurderAssassins: Int = 0

    @SerializedName("deaths_mountain_MURDER_ASSASSINS")
    val deathsMountainMurderAssassins: Int = 0

    @SerializedName("games_mountain_MURDER_ASSASSINS")
    val gamesMountainMurderAssassins: Int = 0

    @SerializedName("murderer_wins_towerfall_MURDER_CLASSIC")
    val murdererWinsTowerfallMurderClassic: Int = 0

    @SerializedName("murderer_wins_towerfall")
    val murdererWinsTowerfall: Int = 0

    @SerializedName("coins_pickedup_mountain_MURDER_ASSASSINS")
    val coinsPickedupMountainMurderAssassins: Int = 0

    @SerializedName("knife_kills_archives_MURDER_ASSASSINS")
    val knifeKillsArchivesMurderAssassins: Int = 0

    @SerializedName("kills_archives_MURDER_ASSASSINS")
    val killsArchivesMurderAssassins: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_towerfall_MURDER_CLASSIC")
    val quickestMurdererWinTimeSecondsTowerfallMurderClassic: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_towerfall")
    val quickestMurdererWinTimeSecondsTowerfall: Int = 0

    @SerializedName("active_projectile_trail")
    val activeProjectileTrail: String = ""

    @SerializedName("kills_mountain_MURDER_ASSASSINS")
    val killsMountainMurderAssassins: Int = 0

    @SerializedName("knife_kills_mountain_MURDER_ASSASSINS")
    val knifeKillsMountainMurderAssassins: Int = 0

    @SerializedName("murderer_wins_library_MURDER_CLASSIC")
    val murdererWinsLibraryMurderClassic: Int = 0

    @SerializedName("murderer_wins_library")
    val murdererWinsLibrary: Int = 0

    @SerializedName("thrown_knife_kills_hollywood_MURDER_ASSASSINS")
    val thrownKnifeKillsHollywoodMurderAssassins: Int = 0

    @SerializedName("wins_mountain_MURDER_ASSASSINS")
    val winsMountainMurderAssassins: Int = 0

    @SerializedName("active_animated_hat")
    val activeAnimatedHat: String = ""

    @SerializedName("murderer_wins_transport")
    val murdererWinsTransport: Int = 0

    @SerializedName("murderer_wins_transport_MURDER_CLASSIC")
    val murdererWinsTransportMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_cruise_ship_MURDER_ASSASSINS")
    val thrownKnifeKillsCruiseShipMurderAssassins: Int = 0

    @SerializedName("wins_cruise_ship_MURDER_ASSASSINS")
    val winsCruiseShipMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_hypixel_world_MURDER_ASSASSINS")
    val thrownKnifeKillsHypixelWorldMurderAssassins: Int = 0

    @SerializedName("quickjoin_uses_Headquarters")
    val quickjoinUsesHeadquarters: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_headquarters")
    val quickestShowdownWinTimeSecondsHeadquarters: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_headquarters_MURDER_SHOWDOWN")
    val quickestShowdownWinTimeSecondsHeadquartersMurderShowdown: Int = 0

    @SerializedName("thrown_knife_kills_towerfall_MURDER_ASSASSINS")
    val thrownKnifeKillsTowerfallMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_headquarters_MURDER_ASSASSINS")
    val thrownKnifeKillsHeadquartersMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_archives_MURDER_ASSASSINS")
    val thrownKnifeKillsArchivesMurderAssassins: Int = 0

    @SerializedName("quickjoin_uses_Ancient Tomb")
    val quickjoinUsesAncientTomb: Int = 0

    @SerializedName("thrown_knife_kills_mountain_MURDER_ASSASSINS")
    val thrownKnifeKillsMountainMurderAssassins: Int = 0

    @SerializedName("quickjoin_uses_Hollywood")
    val quickjoinUsesHollywood: Int = 0

    @SerializedName("quickjoin_uses_Library")
    val quickjoinUsesLibrary: Int = 0

    @SerializedName("murderer_wins_gold_rush_MURDER_CLASSIC")
    val murdererWinsGoldRushMurderClassic: Int = 0

    @SerializedName("murderer_wins_gold_rush")
    val murdererWinsGoldRush: Int = 0

    @SerializedName("thrown_knife_kills_ancient_tomb_MURDER_ASSASSINS")
    val thrownKnifeKillsAncientTombMurderAssassins: Int = 0

    @SerializedName("murderer_wins_archives")
    val murdererWinsArchives: Int = 0

    @SerializedName("murderer_wins_archives_MURDER_CLASSIC")
    val murdererWinsArchivesMurderClassic: Int = 0

    @SerializedName("active_last_words")
    val activeLastWords: String = ""

    @SerializedName("murderer_wins_hypixel_world_MURDER_CLASSIC")
    val murdererWinsHypixelWorldMurderClassic: Int = 0

    @SerializedName("murderer_wins_hypixel_world")
    val murdererWinsHypixelWorld: Int = 0

    @SerializedName("thrown_knife_kills_gold_rush_MURDER_ASSASSINS")
    val thrownKnifeKillsGoldRushMurderAssassins: Int = 0

    @SerializedName("murderer_wins_mountain")
    val murdererWinsMountain: Int = 0

    @SerializedName("murderer_wins_mountain_MURDER_CLASSIC")
    val murdererWinsMountainMurderClassic: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_archives")
    val quickestMurdererWinTimeSecondsArchives: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_archives_MURDER_CLASSIC")
    val quickestMurdererWinTimeSecondsArchivesMurderClassic: Int = 0

    @SerializedName("knife_kills_aquarium")
    val knifeKillsAquarium: Int = 0

    @SerializedName("kills_aquarium")
    val killsAquarium: Int = 0

    @SerializedName("bow_kills_aquarium_MURDER_SHOWDOWN")
    val bowKillsAquariumMurderShowdown: Int = 0

    @SerializedName("bow_kills_aquarium")
    val bowKillsAquarium: Int = 0

    @SerializedName("deaths_aquarium_MURDER_SHOWDOWN")
    val deathsAquariumMurderShowdown: Int = 0

    @SerializedName("deaths_aquarium")
    val deathsAquarium: Int = 0

    @SerializedName("coins_pickedup_aquarium")
    val coinsPickedupAquarium: Int = 0

    @SerializedName("games_aquarium")
    val gamesAquarium: Int = 0

    @SerializedName("knife_kills_aquarium_MURDER_SHOWDOWN")
    val knifeKillsAquariumMurderShowdown: Int = 0

    @SerializedName("games_aquarium_MURDER_SHOWDOWN")
    val gamesAquariumMurderShowdown: Int = 0

    @SerializedName("kills_aquarium_MURDER_SHOWDOWN")
    val killsAquariumMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_aquarium_MURDER_SHOWDOWN")
    val coinsPickedupAquariumMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_aquarium_MURDER_CLASSIC")
    val coinsPickedupAquariumMurderClassic: Int = 0

    @SerializedName("games_aquarium_MURDER_CLASSIC")
    val gamesAquariumMurderClassic: Int = 0

    @SerializedName("wins_aquarium")
    val winsAquarium: Int = 0

    @SerializedName("wins_aquarium_MURDER_CLASSIC")
    val winsAquariumMurderClassic: Int = 0

    @SerializedName("deaths_aquarium_MURDER_CLASSIC")
    val deathsAquariumMurderClassic: Int = 0

    @SerializedName("coins_pickedup_san_peratico")
    val coinsPickedupSanPeratico: Int = 0

    @SerializedName("wins_san_peratico")
    val winsSanPeratico: Int = 0

    @SerializedName("wins_san_peratico_MURDER_CLASSIC")
    val winsSanPeraticoMurderClassic: Int = 0

    @SerializedName("games_san_peratico_MURDER_CLASSIC")
    val gamesSanPeraticoMurderClassic: Int = 0

    @SerializedName("coins_pickedup_san_peratico_MURDER_CLASSIC")
    val coinsPickedupSanPeraticoMurderClassic: Int = 0

    @SerializedName("detective_wins_san_peratico_MURDER_CLASSIC")
    val detectiveWinsSanPeraticoMurderClassic: Int = 0

    @SerializedName("detective_wins_san_peratico")
    val detectiveWinsSanPeratico: Int = 0

    @SerializedName("games_san_peratico")
    val gamesSanPeratico: Int = 0

    @SerializedName("kills_san_peratico")
    val killsSanPeratico: Int = 0

    @SerializedName("knife_kills_san_peratico_MURDER_CLASSIC")
    val knifeKillsSanPeraticoMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_san_peratico")
    val killsAsMurdererSanPeratico: Int = 0

    @SerializedName("knife_kills_san_peratico")
    val knifeKillsSanPeratico: Int = 0

    @SerializedName("deaths_san_peratico_MURDER_CLASSIC")
    val deathsSanPeraticoMurderClassic: Int = 0

    @SerializedName("kills_san_peratico_MURDER_CLASSIC")
    val killsSanPeraticoMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_san_peratico_MURDER_CLASSIC")
    val killsAsMurdererSanPeraticoMurderClassic: Int = 0

    @SerializedName("deaths_san_peratico")
    val deathsSanPeratico: Int = 0

    @SerializedName("quickjoin_uses_Aquarium")
    val quickjoinUsesAquarium: Int = 0

    @SerializedName("quickjoin_uses_San Peratico")
    val quickjoinUsesSanPeratico: Int = 0

    @SerializedName("knife_kills_aquarium_MURDER_CLASSIC")
    val knifeKillsAquariumMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_aquarium")
    val killsAsMurdererAquarium: Int = 0

    @SerializedName("kills_aquarium_MURDER_CLASSIC")
    val killsAquariumMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_aquarium_MURDER_CLASSIC")
    val killsAsMurdererAquariumMurderClassic: Int = 0

    @SerializedName("was_hero_aquarium_MURDER_CLASSIC")
    val wasHeroAquariumMurderClassic: Int = 0

    @SerializedName("bow_kills_aquarium_MURDER_CLASSIC")
    val bowKillsAquariumMurderClassic: Int = 0

    @SerializedName("was_hero_aquarium")
    val wasHeroAquarium: Int = 0

    @SerializedName("murderer_wins_aquarium_MURDER_CLASSIC")
    val murdererWinsAquariumMurderClassic: Int = 0

    @SerializedName("murderer_wins_aquarium")
    val murdererWinsAquarium: Int = 0

    @SerializedName("wins_aquarium_MURDER_SHOWDOWN")
    val winsAquariumMurderShowdown: Int = 0

    @SerializedName("wins_towerfall_MURDER_ASSASSINS")
    val winsTowerfallMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_transport_MURDER_ASSASSINS")
    val thrownKnifeKillsTransportMurderAssassins: Int = 0

    @SerializedName("total_time_survived_seconds_aquarium_MURDER_INFECTION")
    val totalTimeSurvivedSecondsAquariumMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_aquarium")
    val totalTimeSurvivedSecondsAquarium: Int = 0

    @SerializedName("kills_as_infected_aquarium")
    val killsAsInfectedAquarium: Int = 0

    @SerializedName("games_aquarium_MURDER_INFECTION")
    val gamesAquariumMurderInfection: Int = 0

    @SerializedName("kills_as_infected_aquarium_MURDER_INFECTION")
    val killsAsInfectedAquariumMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_aquarium")
    val killsAsSurvivorAquarium: Int = 0

    @SerializedName("kills_as_survivor_aquarium_MURDER_INFECTION")
    val killsAsSurvivorAquariumMurderInfection: Int = 0

    @SerializedName("thrown_knife_kills_san_peratico")
    val thrownKnifeKillsSanPeratico: Int = 0

    @SerializedName("thrown_knife_kills_san_peratico_MURDER_CLASSIC")
    val thrownKnifeKillsSanPeraticoMurderClassic: Int = 0

    @SerializedName("showdown_potg_aquarium_MURDER_SHOWDOWN")
    val showdownPotgAquariumMurderShowdown: Int = 0

    @SerializedName("showdown_potg_aquarium")
    val showdownPotgAquarium: Int = 0

    @SerializedName("knife_kills_san_peratico_MURDER_SHOWDOWN")
    val knifeKillsSanPeraticoMurderShowdown: Int = 0

    @SerializedName("bow_kills_san_peratico_MURDER_SHOWDOWN")
    val bowKillsSanPeraticoMurderShowdown: Int = 0

    @SerializedName("kills_san_peratico_MURDER_SHOWDOWN")
    val killsSanPeraticoMurderShowdown: Int = 0

    @SerializedName("bow_kills_san_peratico")
    val bowKillsSanPeratico: Int = 0

    @SerializedName("deaths_san_peratico_MURDER_SHOWDOWN")
    val deathsSanPeraticoMurderShowdown: Int = 0

    @SerializedName("wins_san_peratico_MURDER_SHOWDOWN")
    val winsSanPeraticoMurderShowdown: Int = 0

    @SerializedName("games_san_peratico_MURDER_SHOWDOWN")
    val gamesSanPeraticoMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_san_peratico_MURDER_SHOWDOWN")
    val coinsPickedupSanPeraticoMurderShowdown: Int = 0

    @SerializedName("was_hero_san_peratico_MURDER_CLASSIC")
    val wasHeroSanPeraticoMurderClassic: Int = 0

    @SerializedName("bow_kills_san_peratico_MURDER_CLASSIC")
    val bowKillsSanPeraticoMurderClassic: Int = 0

    @SerializedName("was_hero_san_peratico")
    val wasHeroSanPeratico: Int = 0

    @SerializedName("detective_wins_aquarium")
    val detectiveWinsAquarium: Int = 0

    @SerializedName("detective_wins_aquarium_MURDER_CLASSIC")
    val detectiveWinsAquariumMurderClassic: Int = 0

    @SerializedName("last_one_alive_aquarium")
    val lastOneAliveAquarium: Int = 0

    @SerializedName("last_one_alive_aquarium_MURDER_INFECTION")
    val lastOneAliveAquariumMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_san_peratico_MURDER_INFECTION")
    val totalTimeSurvivedSecondsSanPeraticoMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_san_peratico")
    val totalTimeSurvivedSecondsSanPeratico: Int = 0

    @SerializedName("survivor_wins_san_peratico")
    val survivorWinsSanPeratico: Int = 0

    @SerializedName("survivor_wins_san_peratico_MURDER_INFECTION")
    val survivorWinsSanPeraticoMurderInfection: Int = 0

    @SerializedName("games_san_peratico_MURDER_INFECTION")
    val gamesSanPeraticoMurderInfection: Int = 0

    @SerializedName("deaths_aquarium_MURDER_ASSASSINS")
    val deathsAquariumMurderAssassins: Int = 0

    @SerializedName("games_aquarium_MURDER_ASSASSINS")
    val gamesAquariumMurderAssassins: Int = 0

    @SerializedName("kills_as_survivor_san_peratico")
    val killsAsSurvivorSanPeratico: Int = 0

    @SerializedName("kills_as_survivor_san_peratico_MURDER_INFECTION")
    val killsAsSurvivorSanPeraticoMurderInfection: Int = 0

    @SerializedName("kills_aquarium_MURDER_ASSASSINS")
    val killsAquariumMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_aquarium_MURDER_ASSASSINS")
    val thrownKnifeKillsAquariumMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_aquarium_MURDER_ASSASSINS")
    val coinsPickedupAquariumMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_aquarium")
    val thrownKnifeKillsAquarium: Int = 0

    @SerializedName("kills_as_infected_san_peratico")
    val killsAsInfectedSanPeratico: Int = 0

    @SerializedName("kills_as_infected_san_peratico_MURDER_INFECTION")
    val killsAsInfectedSanPeraticoMurderInfection: Int = 0

    @SerializedName("thrown_knife_kills_aquarium_MURDER_CLASSIC")
    val thrownKnifeKillsAquariumMurderClassic: Int = 0

    @SerializedName("deaths_san_peratico_MURDER_INFECTION")
    val deathsSanPeraticoMurderInfection: Int = 0

    @SerializedName("coins_pickedup_san_peratico_MURDER_ASSASSINS")
    val coinsPickedupSanPeraticoMurderAssassins: Int = 0

    @SerializedName("knife_kills_san_peratico_MURDER_ASSASSINS")
    val knifeKillsSanPeraticoMurderAssassins: Int = 0

    @SerializedName("games_san_peratico_MURDER_ASSASSINS")
    val gamesSanPeraticoMurderAssassins: Int = 0

    @SerializedName("deaths_san_peratico_MURDER_ASSASSINS")
    val deathsSanPeraticoMurderAssassins: Int = 0

    @SerializedName("kills_san_peratico_MURDER_ASSASSINS")
    val killsSanPeraticoMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_san_peratico_MURDER_ASSASSINS")
    val thrownKnifeKillsSanPeraticoMurderAssassins: Int = 0

    @SerializedName("wins_san_peratico_MURDER_ASSASSINS")
    val winsSanPeraticoMurderAssassins: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_library_MURDER_CLASSIC")
    val quickestMurdererWinTimeSecondsLibraryMurderClassic: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_library")
    val quickestMurdererWinTimeSecondsLibrary: Int = 0

    @SerializedName("survivor_wins_aquarium")
    val survivorWinsAquarium: Int = 0

    @SerializedName("survivor_wins_aquarium_MURDER_INFECTION")
    val survivorWinsAquariumMurderInfection: Int = 0

    @SerializedName("wins_aquarium_MURDER_ASSASSINS")
    val winsAquariumMurderAssassins: Int = 0

    @SerializedName("knife_kills_aquarium_MURDER_ASSASSINS")
    val knifeKillsAquariumMurderAssassins: Int = 0

    @SerializedName("showdown_potg_san_peratico")
    val showdownPotgSanPeratico: Int = 0

    @SerializedName("showdown_potg_san_peratico_MURDER_SHOWDOWN")
    val showdownPotgSanPeraticoMurderShowdown: Int = 0

    @SerializedName("murderer_wins_san_peratico_MURDER_CLASSIC")
    val murdererWinsSanPeraticoMurderClassic: Int = 0

    @SerializedName("murderer_wins_san_peratico")
    val murdererWinsSanPeratico: Int = 0

    @SerializedName("quickjoin_uses_Cruise Ship")
    val quickjoinUsesCruiseShip: Int = 0

    @SerializedName("trap_kills_aquarium")
    val trapKillsAquarium: Int = 0

    @SerializedName("trap_kills_aquarium_MURDER_CLASSIC")
    val trapKillsAquariumMurderClassic: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_gold_rush")
    val quickestShowdownWinTimeSecondsGoldRush: Int = 0

    @SerializedName("quickest_showdown_win_time_seconds_gold_rush_MURDER_SHOWDOWN")
    val quickestShowdownWinTimeSecondsGoldRushMurderShowdown: Int = 0

    @SerializedName("deaths_widow's_den")
    val deathsWidowsDen: Int = 0

    @SerializedName("kills_widow's_den_MURDER_SHOWDOWN")
    val killsWidowsDenMurderShowdown: Int = 0

    @SerializedName("bow_kills_widow's_den_MURDER_SHOWDOWN")
    val bowKillsWidowsDenMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_widow's_den_MURDER_SHOWDOWN")
    val coinsPickedupWidowsDenMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_widow's_den")
    val coinsPickedupWidowsDen: Int = 0

    @SerializedName("deaths_widow's_den_MURDER_SHOWDOWN")
    val deathsWidowsDenMurderShowdown: Int = 0

    @SerializedName("bow_kills_widow's_den")
    val bowKillsWidowsDen: Int = 0

    @SerializedName("kills_widow's_den")
    val killsWidowsDen: Int = 0

    @SerializedName("games_darkfall_MURDER_CLASSIC")
    val gamesDarkfallMurderClassic: Int = 0

    @SerializedName("games_darkfall")
    val gamesDarkfall: Int = 0

    @SerializedName("deaths_darkfall_MURDER_CLASSIC")
    val deathsDarkfallMurderClassic: Int = 0

    @SerializedName("deaths_darkfall")
    val deathsDarkfall: Int = 0

    @SerializedName("wins_widow's_den_MURDER_CLASSIC")
    val winsWidowsDenMurderClassic: Int = 0

    @SerializedName("wins_widow's_den")
    val winsWidowsDen: Int = 0

    @SerializedName("games_widow's_den_MURDER_CLASSIC")
    val gamesWidowsDenMurderClassic: Int = 0

    @SerializedName("coins_pickedup_widow's_den_MURDER_CLASSIC")
    val coinsPickedupWidowsDenMurderClassic: Int = 0

    @SerializedName("games_widow's_den")
    val gamesWidowsDen: Int = 0

    @SerializedName("deaths_widow's_den_MURDER_CLASSIC")
    val deathsWidowsDenMurderClassic: Int = 0

    @SerializedName("wins_darkfall_MURDER_CLASSIC")
    val winsDarkfallMurderClassic: Int = 0

    @SerializedName("wins_darkfall")
    val winsDarkfall: Int = 0

    @SerializedName("coins_pickedup_darkfall_MURDER_CLASSIC")
    val coinsPickedupDarkfallMurderClassic: Int = 0

    @SerializedName("coins_pickedup_darkfall")
    val coinsPickedupDarkfall: Int = 0

    @SerializedName("kills_widow's_den_MURDER_CLASSIC")
    val killsWidowsDenMurderClassic: Int = 0

    @SerializedName("knife_kills_widow's_den_MURDER_CLASSIC")
    val knifeKillsWidowsDenMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_widow's_den")
    val killsAsMurdererWidowsDen: Int = 0

    @SerializedName("knife_kills_widow's_den")
    val knifeKillsWidowsDen: Int = 0

    @SerializedName("kills_as_murderer_widow's_den_MURDER_CLASSIC")
    val killsAsMurdererWidowsDenMurderClassic: Int = 0

    @SerializedName("bow_kills_widow's_den_MURDER_CLASSIC")
    val bowKillsWidowsDenMurderClassic: Int = 0

    @SerializedName("knife_kills_darkfall")
    val knifeKillsDarkfall: Int = 0

    @SerializedName("thrown_knife_kills_darkfall")
    val thrownKnifeKillsDarkfall: Int = 0

    @SerializedName("kills_darkfall_MURDER_CLASSIC")
    val killsDarkfallMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_darkfall")
    val killsAsMurdererDarkfall: Int = 0

    @SerializedName("kills_darkfall")
    val killsDarkfall: Int = 0

    @SerializedName("knife_kills_darkfall_MURDER_CLASSIC")
    val knifeKillsDarkfallMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_darkfall_MURDER_CLASSIC")
    val thrownKnifeKillsDarkfallMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_darkfall_MURDER_CLASSIC")
    val killsAsMurdererDarkfallMurderClassic: Int = 0

    @SerializedName("was_hero_widow's_den")
    val wasHeroWidowsDen: Int = 0

    @SerializedName("detective_wins_widow's_den_MURDER_CLASSIC")
    val detectiveWinsWidowsDenMurderClassic: Int = 0

    @SerializedName("was_hero_widow's_den_MURDER_CLASSIC")
    val wasHeroWidowsDenMurderClassic: Int = 0

    @SerializedName("detective_wins_widow's_den")
    val detectiveWinsWidowsDen: Int = 0

    @SerializedName("murderer_wins_darkfall_MURDER_CLASSIC")
    val murdererWinsDarkfallMurderClassic: Int = 0

    @SerializedName("murderer_wins_darkfall")
    val murdererWinsDarkfall: Int = 0

    @SerializedName("thrown_knife_kills_widow's_den_MURDER_CLASSIC")
    val thrownKnifeKillsWidowsDenMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_widow's_den")
    val thrownKnifeKillsWidowsDen: Int = 0

    @SerializedName("detective_wins_darkfall_MURDER_CLASSIC")
    val detectiveWinsDarkfallMurderClassic: Int = 0

    @SerializedName("detective_wins_darkfall")
    val detectiveWinsDarkfall: Int = 0

    @SerializedName("was_hero_darkfall_MURDER_CLASSIC")
    val wasHeroDarkfallMurderClassic: Int = 0

    @SerializedName("bow_kills_darkfall")
    val bowKillsDarkfall: Int = 0

    @SerializedName("was_hero_darkfall")
    val wasHeroDarkfall: Int = 0

    @SerializedName("bow_kills_darkfall_MURDER_CLASSIC")
    val bowKillsDarkfallMurderClassic: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_darkfall")
    val quickestMurdererWinTimeSecondsDarkfall: Int = 0

    @SerializedName("quickest_murderer_win_time_seconds_darkfall_MURDER_CLASSIC")
    val quickestMurdererWinTimeSecondsDarkfallMurderClassic: Int = 0

    @SerializedName("quickjoin_uses_Widow's Den")
    val quickjoinUsesWidowsDen: Int = 0

    @SerializedName("murderer_wins_widow's_den_MURDER_CLASSIC")
    val murdererWinsWidowsDenMurderClassic: Int = 0

    @SerializedName("murderer_wins_widow's_den")
    val murdererWinsWidowsDen: Int = 0

    @SerializedName("wins_darkfall_MURDER_SHOWDOWN")
    val winsDarkfallMurderShowdown: Int = 0

    @SerializedName("bow_kills_darkfall_MURDER_SHOWDOWN")
    val bowKillsDarkfallMurderShowdown: Int = 0

    @SerializedName("kills_darkfall_MURDER_SHOWDOWN")
    val killsDarkfallMurderShowdown: Int = 0

    @SerializedName("deaths_darkfall_MURDER_SHOWDOWN")
    val deathsDarkfallMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_darkfall_MURDER_SHOWDOWN")
    val coinsPickedupDarkfallMurderShowdown: Int = 0

    @SerializedName("games_darkfall_MURDER_SHOWDOWN")
    val gamesDarkfallMurderShowdown: Int = 0

    @SerializedName("quickjoin_uses_Darkfall")
    val quickjoinUsesDarkfall: Int = 0

    @SerializedName("knife_kills_darkfall_MURDER_SHOWDOWN")
    val knifeKillsDarkfallMurderShowdown: Int = 0

    @SerializedName("showdown_potg_darkfall")
    val showdownPotgDarkfall: Int = 0

    @SerializedName("showdown_potg_darkfall_MURDER_SHOWDOWN")
    val showdownPotgDarkfallMurderShowdown: Int = 0

    @SerializedName("games_widow's_den_MURDER_SHOWDOWN")
    val gamesWidowsDenMurderShowdown: Int = 0

    @SerializedName("showdown_potg_widow's_den")
    val showdownPotgWidowsDen: Int = 0

    @SerializedName("wins_widow's_den_MURDER_SHOWDOWN")
    val winsWidowsDenMurderShowdown: Int = 0

    @SerializedName("showdown_potg_widow's_den_MURDER_SHOWDOWN")
    val showdownPotgWidowsDenMurderShowdown: Int = 0

    @SerializedName("knife_kills_widow's_den_MURDER_SHOWDOWN")
    val knifeKillsWidowsDenMurderShowdown: Int = 0

    @SerializedName("knife_kills_widow's_den_MURDER_ASSASSINS")
    val knifeKillsWidowsDenMurderAssassins: Int = 0

    @SerializedName("kills_widow's_den_MURDER_ASSASSINS")
    val killsWidowsDenMurderAssassins: Int = 0

    @SerializedName("games_widow's_den_MURDER_ASSASSINS")
    val gamesWidowsDenMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_widow's_den_MURDER_ASSASSINS")
    val thrownKnifeKillsWidowsDenMurderAssassins: Int = 0

    @SerializedName("deaths_widow's_den_MURDER_ASSASSINS")
    val deathsWidowsDenMurderAssassins: Int = 0

    @SerializedName("deaths_darkfall_MURDER_ASSASSINS")
    val deathsDarkfallMurderAssassins: Int = 0

    @SerializedName("kills_darkfall_MURDER_ASSASSINS")
    val killsDarkfallMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_darkfall_MURDER_ASSASSINS")
    val thrownKnifeKillsDarkfallMurderAssassins: Int = 0

    @SerializedName("games_darkfall_MURDER_ASSASSINS")
    val gamesDarkfallMurderAssassins: Int = 0

    @SerializedName("total_time_survived_seconds_widow's_den")
    val totalTimeSurvivedSecondsWidowsDen: Int = 0

    @SerializedName("total_time_survived_seconds_widow's_den_MURDER_INFECTION")
    val totalTimeSurvivedSecondsWidowsDenMurderInfection: Int = 0

    @SerializedName("games_widow's_den_MURDER_INFECTION")
    val gamesWidowsDenMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_widow's_den")
    val killsAsSurvivorWidowsDen: Int = 0

    @SerializedName("kills_as_survivor_widow's_den_MURDER_INFECTION")
    val killsAsSurvivorWidowsDenMurderInfection: Int = 0

    @SerializedName("coins_pickedup_darkfall_MURDER_ASSASSINS")
    val coinsPickedupDarkfallMurderAssassins: Int = 0

    @SerializedName("knife_kills_darkfall_MURDER_ASSASSINS")
    val knifeKillsDarkfallMurderAssassins: Int = 0

    @SerializedName("wins_darkfall_MURDER_ASSASSINS")
    val winsDarkfallMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_widow's_den_MURDER_ASSASSINS")
    val coinsPickedupWidowsDenMurderAssassins: Int = 0

    @SerializedName("suicides_san_peratico")
    val suicidesSanPeratico: Int = 0

    @SerializedName("suicides_san_peratico_MURDER_CLASSIC")
    val suicidesSanPeraticoMurderClassic: Int = 0

    @SerializedName("quickjoin_uses_random")
    val quickjoinUsesRandom: Int = 0

    @SerializedName("suicides_ancient_tomb")
    val suicidesAncientTomb: Int = 0

    @SerializedName("suicides_ancient_tomb_MURDER_CLASSIC")
    val suicidesAncientTombMurderClassic: Int = 0

    @SerializedName("coins_pickedup_snowfall_MURDER_CLASSIC")
    val coinsPickedupSnowfallMurderClassic: Int = 0

    @SerializedName("games_snowfall_MURDER_CLASSIC")
    val gamesSnowfallMurderClassic: Int = 0

    @SerializedName("deaths_snowfall_MURDER_CLASSIC")
    val deathsSnowfallMurderClassic: Int = 0

    @SerializedName("wins_snowfall")
    val winsSnowfall: Int = 0

    @SerializedName("games_snowfall")
    val gamesSnowfall: Int = 0

    @SerializedName("deaths_snowfall")
    val deathsSnowfall: Int = 0

    @SerializedName("coins_pickedup_snowfall")
    val coinsPickedupSnowfall: Int = 0

    @SerializedName("wins_snowfall_MURDER_CLASSIC")
    val winsSnowfallMurderClassic: Int = 0

    @SerializedName("quickjoin_uses_Snowfall")
    val quickjoinUsesSnowfall: Int = 0

    @SerializedName("knife_kills_snowfall")
    val knifeKillsSnowfall: Int = 0

    @SerializedName("knife_kills_snowfall_MURDER_CLASSIC")
    val knifeKillsSnowfallMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_snowfall_MURDER_CLASSIC")
    val thrownKnifeKillsSnowfallMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_snowfall")
    val killsAsMurdererSnowfall: Int = 0

    @SerializedName("kills_as_murderer_snowfall_MURDER_CLASSIC")
    val killsAsMurdererSnowfallMurderClassic: Int = 0

    @SerializedName("kills_snowfall_MURDER_CLASSIC")
    val killsSnowfallMurderClassic: Int = 0

    @SerializedName("kills_snowfall")
    val killsSnowfall: Int = 0

    @SerializedName("thrown_knife_kills_snowfall")
    val thrownKnifeKillsSnowfall: Int = 0

    @SerializedName("bow_kills_snowfall_MURDER_CLASSIC")
    val bowKillsSnowfallMurderClassic: Int = 0

    @SerializedName("bow_kills_snowfall")
    val bowKillsSnowfall: Int = 0

    @SerializedName("detective_wins_snowfall")
    val detectiveWinsSnowfall: Int = 0

    @SerializedName("detective_wins_snowfall_MURDER_CLASSIC")
    val detectiveWinsSnowfallMurderClassic: Int = 0

    @SerializedName("was_hero_snowfall")
    val wasHeroSnowfall: Int = 0

    @SerializedName("was_hero_snowfall_MURDER_CLASSIC")
    val wasHeroSnowfallMurderClassic: Int = 0

    @SerializedName("bow_kills_snowfall_MURDER_SHOWDOWN")
    val bowKillsSnowfallMurderShowdown: Int = 0

    @SerializedName("kills_snowfall_MURDER_SHOWDOWN")
    val killsSnowfallMurderShowdown: Int = 0

    @SerializedName("knife_kills_snowfall_MURDER_SHOWDOWN")
    val knifeKillsSnowfallMurderShowdown: Int = 0

    @SerializedName("coins_pickedup_snowfall_MURDER_SHOWDOWN")
    val coinsPickedupSnowfallMurderShowdown: Int = 0

    @SerializedName("deaths_snowfall_MURDER_SHOWDOWN")
    val deathsSnowfallMurderShowdown: Int = 0

    @SerializedName("games_snowfall_MURDER_SHOWDOWN")
    val gamesSnowfallMurderShowdown: Int = 0

    @SerializedName("showdown_potg_snowfall")
    val showdownPotgSnowfall: Int = 0

    @SerializedName("showdown_potg_snowfall_MURDER_SHOWDOWN")
    val showdownPotgSnowfallMurderShowdown: Int = 0

    @SerializedName("wins_snowfall_MURDER_SHOWDOWN")
    val winsSnowfallMurderShowdown: Int = 0

    @SerializedName("murderer_wins_snowfall")
    val murdererWinsSnowfall: Int = 0

    @SerializedName("murderer_wins_snowfall_MURDER_CLASSIC")
    val murdererWinsSnowfallMurderClassic: Int = 0

    @SerializedName("deaths_snowfall_MURDER_ASSASSINS")
    val deathsSnowfallMurderAssassins: Int = 0

    @SerializedName("games_snowfall_MURDER_ASSASSINS")
    val gamesSnowfallMurderAssassins: Int = 0

    @SerializedName("total_time_survived_seconds_snowfall_MURDER_INFECTION")
    val totalTimeSurvivedSecondsSnowfallMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_snowfall")
    val totalTimeSurvivedSecondsSnowfall: Int = 0

    @SerializedName("kills_as_infected_snowfall_MURDER_INFECTION")
    val killsAsInfectedSnowfallMurderInfection: Int = 0

    @SerializedName("games_snowfall_MURDER_INFECTION")
    val gamesSnowfallMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_snowfall")
    val killsAsSurvivorSnowfall: Int = 0

    @SerializedName("kills_as_survivor_snowfall_MURDER_INFECTION")
    val killsAsSurvivorSnowfallMurderInfection: Int = 0

    @SerializedName("kills_as_infected_snowfall")
    val killsAsInfectedSnowfall: Int = 0

    @SerializedName("trap_kills_darkfall")
    val trapKillsDarkfall: Int = 0

    @SerializedName("trap_kills_darkfall_MURDER_CLASSIC")
    val trapKillsDarkfallMurderClassic: Int = 0

    @SerializedName("trap_kills_widow's_den_MURDER_CLASSIC")
    val trapKillsWidowsDenMurderClassic: Int = 0

    @SerializedName("trap_kills_widow's_den")
    val trapKillsWidowsDen: Int = 0

    @SerializedName("total_time_survived_seconds_darkfall_MURDER_INFECTION")
    val totalTimeSurvivedSecondsDarkfallMurderInfection: Int = 0

    @SerializedName("total_time_survived_seconds_darkfall")
    val totalTimeSurvivedSecondsDarkfall: Int = 0

    @SerializedName("kills_as_infected_darkfall_MURDER_INFECTION")
    val killsAsInfectedDarkfallMurderInfection: Int = 0

    @SerializedName("games_darkfall_MURDER_INFECTION")
    val gamesDarkfallMurderInfection: Int = 0

    @SerializedName("kills_as_infected_darkfall")
    val killsAsInfectedDarkfall: Int = 0

    @SerializedName("kills_as_survivor_darkfall_MURDER_INFECTION")
    val killsAsSurvivorDarkfallMurderInfection: Int = 0

    @SerializedName("kills_as_survivor_darkfall")
    val killsAsSurvivorDarkfall: Int = 0

    @SerializedName("detective_wins_library_MURDER_DOUBLE_UP")
    val detectiveWinsLibraryMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_library_MURDER_DOUBLE_UP")
    val bowKillsLibraryMurderDoubleUp: Int = 0

    @SerializedName("kills_library_MURDER_DOUBLE_UP")
    val killsLibraryMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_MURDER_DOUBLE_UP")
    val detectiveWinsMurderDoubleUp: Int = 0

    @SerializedName("kills_MURDER_DOUBLE_UP")
    val killsMurderDoubleUp: Int = 0

    @SerializedName("was_hero_library_MURDER_DOUBLE_UP")
    val wasHeroLibraryMurderDoubleUp: Int = 0

    @SerializedName("games_library_MURDER_DOUBLE_UP")
    val gamesLibraryMurderDoubleUp: Int = 0

    @SerializedName("wins_library_MURDER_DOUBLE_UP")
    val winsLibraryMurderDoubleUp: Int = 0

    @SerializedName("games_MURDER_DOUBLE_UP")
    val gamesMurderDoubleUp: Int = 0

    @SerializedName("was_hero_MURDER_DOUBLE_UP")
    val wasHeroMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_MURDER_DOUBLE_UP")
    val bowKillsMurderDoubleUp: Int = 0

    @SerializedName("wins_MURDER_DOUBLE_UP")
    val winsMurderDoubleUp: Int = 0

    @SerializedName("kills_cruise_ship_MURDER_DOUBLE_UP")
    val killsCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_cruise_ship_MURDER_DOUBLE_UP")
    val coinsPickedupCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_MURDER_DOUBLE_UP")
    val coinsPickedupMurderDoubleUp: Int = 0

    @SerializedName("was_hero_cruise_ship_MURDER_DOUBLE_UP")
    val wasHeroCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("wins_cruise_ship_MURDER_DOUBLE_UP")
    val winsCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_cruise_ship_MURDER_DOUBLE_UP")
    val bowKillsCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("games_headquarters_MURDER_DOUBLE_UP")
    val gamesHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_gold_rush_MURDER_DOUBLE_UP")
    val coinsPickedupGoldRushMurderDoubleUp: Int = 0

    @SerializedName("games_gold_rush_MURDER_DOUBLE_UP")
    val gamesGoldRushMurderDoubleUp: Int = 0

    @SerializedName("wins_gold_rush_MURDER_DOUBLE_UP")
    val winsGoldRushMurderDoubleUp: Int = 0

    @SerializedName("deaths_hypixel_world_MURDER_DOUBLE_UP")
    val deathsHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_hypixel_world_MURDER_DOUBLE_UP")
    val coinsPickedupHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("deaths_MURDER_DOUBLE_UP")
    val deathsMurderDoubleUp: Int = 0

    @SerializedName("wins_hypixel_world_MURDER_DOUBLE_UP")
    val winsHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("wins_headquarters_MURDER_DOUBLE_UP")
    val winsHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("deaths_headquarters_MURDER_DOUBLE_UP")
    val deathsHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_headquarters_MURDER_DOUBLE_UP")
    val coinsPickedupHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("games_hypixel_world_MURDER_DOUBLE_UP")
    val gamesHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_mountain_MURDER_DOUBLE_UP")
    val coinsPickedupMountainMurderDoubleUp: Int = 0

    @SerializedName("games_mountain_MURDER_DOUBLE_UP")
    val gamesMountainMurderDoubleUp: Int = 0

    @SerializedName("deaths_mountain_MURDER_DOUBLE_UP")
    val deathsMountainMurderDoubleUp: Int = 0

    @SerializedName("wins_mountain_MURDER_DOUBLE_UP")
    val winsMountainMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_aquarium_MURDER_DOUBLE_UP")
    val coinsPickedupAquariumMurderDoubleUp: Int = 0

    @SerializedName("games_aquarium_MURDER_DOUBLE_UP")
    val gamesAquariumMurderDoubleUp: Int = 0

    @SerializedName("deaths_aquarium_MURDER_DOUBLE_UP")
    val deathsAquariumMurderDoubleUp: Int = 0

    @SerializedName("wins_aquarium_MURDER_DOUBLE_UP")
    val winsAquariumMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_headquarters_MURDER_DOUBLE_UP")
    val bowKillsHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_headquarters_MURDER_DOUBLE_UP")
    val detectiveWinsHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("kills_headquarters_MURDER_DOUBLE_UP")
    val killsHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("was_hero_headquarters_MURDER_DOUBLE_UP")
    val wasHeroHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("wins_towerfall_MURDER_DOUBLE_UP")
    val winsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("deaths_towerfall_MURDER_DOUBLE_UP")
    val deathsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_towerfall_MURDER_DOUBLE_UP")
    val coinsPickedupTowerfallMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_MURDER_DOUBLE_UP")
    val killsAsMurdererMurderDoubleUp: Int = 0

    @SerializedName("kills_mountain_MURDER_DOUBLE_UP")
    val killsMountainMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_mountain_MURDER_DOUBLE_UP")
    val knifeKillsMountainMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_MURDER_DOUBLE_UP")
    val knifeKillsMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_mountain_MURDER_DOUBLE_UP")
    val killsAsMurdererMountainMurderDoubleUp: Int = 0

    @SerializedName("games_widow's_den_MURDER_DOUBLE_UP")
    val gamesWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("wins_hollywood_MURDER_DOUBLE_UP")
    val winsHollywoodMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_hollywood_MURDER_DOUBLE_UP")
    val coinsPickedupHollywoodMurderDoubleUp: Int = 0

    @SerializedName("games_hollywood_MURDER_DOUBLE_UP")
    val gamesHollywoodMurderDoubleUp: Int = 0

    @SerializedName("games_towerfall_MURDER_DOUBLE_UP")
    val gamesTowerfallMurderDoubleUp: Int = 0

    @SerializedName("kills_towerfall_MURDER_DOUBLE_UP")
    val killsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_towerfall_MURDER_DOUBLE_UP")
    val detectiveWinsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("was_hero_towerfall_MURDER_DOUBLE_UP")
    val wasHeroTowerfallMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_towerfall_MURDER_DOUBLE_UP")
    val bowKillsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_mountain_MURDER_DOUBLE_UP")
    val detectiveWinsMountainMurderDoubleUp: Int = 0

    @SerializedName("games_ancient_tomb_MURDER_DOUBLE_UP")
    val gamesAncientTombMurderDoubleUp: Int = 0

    @SerializedName("wins_ancient_tomb_MURDER_DOUBLE_UP")
    val winsAncientTombMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_ancient_tomb_MURDER_DOUBLE_UP")
    val coinsPickedupAncientTombMurderDoubleUp: Int = 0

    @SerializedName("deaths_ancient_tomb_MURDER_DOUBLE_UP")
    val deathsAncientTombMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_MURDER_DOUBLE_UP")
    val thrownKnifeKillsMurderDoubleUp: Int = 0

    @SerializedName("deaths_hollywood_MURDER_DOUBLE_UP")
    val deathsHollywoodMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_hollywood_MURDER_DOUBLE_UP")
    val bowKillsHollywoodMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_hollywood_MURDER_DOUBLE_UP")
    val killsAsMurdererHollywoodMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_hollywood_MURDER_DOUBLE_UP")
    val knifeKillsHollywoodMurderDoubleUp: Int = 0

    @SerializedName("kills_hollywood_MURDER_DOUBLE_UP")
    val killsHollywoodMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_hollywood_MURDER_DOUBLE_UP")
    val thrownKnifeKillsHollywoodMurderDoubleUp: Int = 0

    @SerializedName("deaths_gold_rush_MURDER_DOUBLE_UP")
    val deathsGoldRushMurderDoubleUp: Int = 0

    @SerializedName("games_cruise_ship_MURDER_DOUBLE_UP")
    val gamesCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_gold_rush_MURDER_DOUBLE_UP")
    val bowKillsGoldRushMurderDoubleUp: Int = 0

    @SerializedName("kills_gold_rush_MURDER_DOUBLE_UP")
    val killsGoldRushMurderDoubleUp: Int = 0

    @SerializedName("was_hero_gold_rush_MURDER_DOUBLE_UP")
    val wasHeroGoldRushMurderDoubleUp: Int = 0

    @SerializedName("deaths_cruise_ship_MURDER_DOUBLE_UP")
    val deathsCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_cruise_ship_MURDER_DOUBLE_UP")
    val detectiveWinsCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("deaths_library_MURDER_DOUBLE_UP")
    val deathsLibraryMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_library_MURDER_DOUBLE_UP")
    val coinsPickedupLibraryMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_gold_rush_MURDER_DOUBLE_UP")
    val detectiveWinsGoldRushMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_darkfall_MURDER_DOUBLE_UP")
    val coinsPickedupDarkfallMurderDoubleUp: Int = 0

    @SerializedName("wins_darkfall_MURDER_DOUBLE_UP")
    val winsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("games_darkfall_MURDER_DOUBLE_UP")
    val gamesDarkfallMurderDoubleUp: Int = 0

    @SerializedName("games_transport_MURDER_DOUBLE_UP")
    val gamesTransportMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_transport_MURDER_DOUBLE_UP")
    val coinsPickedupTransportMurderDoubleUp: Int = 0

    @SerializedName("wins_transport_MURDER_DOUBLE_UP")
    val winsTransportMurderDoubleUp: Int = 0

    @SerializedName("games_archives_MURDER_DOUBLE_UP")
    val gamesArchivesMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_archives_MURDER_DOUBLE_UP")
    val coinsPickedupArchivesMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_widow's_den_MURDER_DOUBLE_UP")
    val coinsPickedupWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("wins_widow's_den_MURDER_DOUBLE_UP")
    val winsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("wins_archives_MURDER_DOUBLE_UP")
    val winsArchivesMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_widow's_den_MURDER_DOUBLE_UP")
    val knifeKillsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("kills_widow's_den_MURDER_DOUBLE_UP")
    val killsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("deaths_widow's_den_MURDER_DOUBLE_UP")
    val deathsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_widow's_den_MURDER_DOUBLE_UP")
    val killsAsMurdererWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("kills_darkfall_MURDER_DOUBLE_UP")
    val killsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_darkfall_MURDER_DOUBLE_UP")
    val killsAsMurdererDarkfallMurderDoubleUp: Int = 0

    @SerializedName("deaths_darkfall_MURDER_DOUBLE_UP")
    val deathsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_darkfall_MURDER_DOUBLE_UP")
    val knifeKillsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("deaths_transport_MURDER_DOUBLE_UP")
    val deathsTransportMurderDoubleUp: Int = 0

    @SerializedName("kills_transport_MURDER_DOUBLE_UP")
    val killsTransportMurderDoubleUp: Int = 0

    @SerializedName("was_hero_transport_MURDER_DOUBLE_UP")
    val wasHeroTransportMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_transport_MURDER_DOUBLE_UP")
    val bowKillsTransportMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_san_peratico_MURDER_DOUBLE_UP")
    val coinsPickedupSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("wins_san_peratico_MURDER_DOUBLE_UP")
    val winsSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("deaths_san_peratico_MURDER_DOUBLE_UP")
    val deathsSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("games_san_peratico_MURDER_DOUBLE_UP")
    val gamesSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("kills_san_peratico_MURDER_DOUBLE_UP")
    val killsSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_san_peratico_MURDER_DOUBLE_UP")
    val bowKillsSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("suicides_aquarium")
    val suicidesAquarium: Int = 0

    @SerializedName("suicides_aquarium_MURDER_CLASSIC")
    val suicidesAquariumMurderClassic: Int = 0

    @SerializedName("was_hero_archives_MURDER_DOUBLE_UP")
    val wasHeroArchivesMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_archives_MURDER_DOUBLE_UP")
    val bowKillsArchivesMurderDoubleUp: Int = 0

    @SerializedName("deaths_archives_MURDER_DOUBLE_UP")
    val deathsArchivesMurderDoubleUp: Int = 0

    @SerializedName("kills_archives_MURDER_DOUBLE_UP")
    val killsArchivesMurderDoubleUp: Int = 0

    @SerializedName("was_hero_darkfall_MURDER_DOUBLE_UP")
    val wasHeroDarkfallMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_darkfall_MURDER_DOUBLE_UP")
    val bowKillsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_darkfall_MURDER_DOUBLE_UP")
    val detectiveWinsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_transport_MURDER_DOUBLE_UP")
    val detectiveWinsTransportMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_darkfall_MURDER_DOUBLE_UP")
    val thrownKnifeKillsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("was_hero_mountain_MURDER_DOUBLE_UP")
    val wasHeroMountainMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_mountain_MURDER_DOUBLE_UP")
    val bowKillsMountainMurderDoubleUp: Int = 0

    @SerializedName("trap_kills_MURDER_DOUBLE_UP")
    val trapKillsMurderDoubleUp: Int = 0

    @SerializedName("kills_aquarium_MURDER_DOUBLE_UP")
    val killsAquariumMurderDoubleUp: Int = 0

    @SerializedName("trap_kills_aquarium_MURDER_DOUBLE_UP")
    val trapKillsAquariumMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_archives_MURDER_DOUBLE_UP")
    val thrownKnifeKillsArchivesMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_archives_MURDER_DOUBLE_UP")
    val knifeKillsArchivesMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_archives_MURDER_DOUBLE_UP")
    val killsAsMurdererArchivesMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_MURDER_DOUBLE_UP")
    val murdererWinsMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_library_MURDER_DOUBLE_UP")
    val killsAsMurdererLibraryMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_library_MURDER_DOUBLE_UP")
    val murdererWinsLibraryMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_library_MURDER_DOUBLE_UP")
    val knifeKillsLibraryMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_widow's_den_MURDER_DOUBLE_UP")
    val bowKillsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("was_hero_widow's_den_MURDER_DOUBLE_UP")
    val wasHeroWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("quickjoin_uses_Archives Top Floor")
    val quickjoinUsesArchivesTopFloor: Int = 0

    @SerializedName("wins_archives_top_floor_MURDER_CLASSIC")
    val winsArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("games_archives_top_floor_MURDER_CLASSIC")
    val gamesArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("wins_archives_top_floor")
    val winsArchivesTopFloor: Int = 0

    @SerializedName("games_archives_top_floor")
    val gamesArchivesTopFloor: Int = 0

    @SerializedName("coins_pickedup_archives_top_floor_MURDER_CLASSIC")
    val coinsPickedupArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("coins_pickedup_archives_top_floor")
    val coinsPickedupArchivesTopFloor: Int = 0

    @SerializedName("deaths_archives_top_floor_MURDER_CLASSIC")
    val deathsArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("deaths_archives_top_floor")
    val deathsArchivesTopFloor: Int = 0

    @SerializedName("kills_archives_top_floor_MURDER_CLASSIC")
    val killsArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("bow_kills_archives_top_floor_MURDER_CLASSIC")
    val bowKillsArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("bow_kills_archives_top_floor")
    val bowKillsArchivesTopFloor: Int = 0

    @SerializedName("was_hero_archives_top_floor")
    val wasHeroArchivesTopFloor: Int = 0

    @SerializedName("kills_archives_top_floor")
    val killsArchivesTopFloor: Int = 0

    @SerializedName("detective_wins_archives_top_floor_MURDER_CLASSIC")
    val detectiveWinsArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("was_hero_archives_top_floor_MURDER_CLASSIC")
    val wasHeroArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("detective_wins_archives_top_floor")
    val detectiveWinsArchivesTopFloor: Int = 0

    @SerializedName("kills_as_murderer_archives_top_floor")
    val killsAsMurdererArchivesTopFloor: Int = 0

    @SerializedName("kills_as_murderer_archives_top_floor_MURDER_CLASSIC")
    val killsAsMurdererArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_archives_top_floor_MURDER_CLASSIC")
    val thrownKnifeKillsArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_archives_top_floor")
    val thrownKnifeKillsArchivesTopFloor: Int = 0

    @SerializedName("knife_kills_archives_top_floor")
    val knifeKillsArchivesTopFloor: Int = 0

    @SerializedName("knife_kills_archives_top_floor_MURDER_CLASSIC")
    val knifeKillsArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("games_archives_top_floor_MURDER_DOUBLE_UP")
    val gamesArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("deaths_archives_top_floor_MURDER_DOUBLE_UP")
    val deathsArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_archives_top_floor_MURDER_DOUBLE_UP")
    val coinsPickedupArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("wins_archives_top_floor_MURDER_DOUBLE_UP")
    val winsArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("was_hero_hollywood_MURDER_DOUBLE_UP")
    val wasHeroHollywoodMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_hollywood_MURDER_DOUBLE_UP")
    val detectiveWinsHollywoodMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_archives_top_floor_MURDER_DOUBLE_UP")
    val bowKillsArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("kills_archives_top_floor_MURDER_DOUBLE_UP")
    val killsArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_ancient_tomb_MURDER_DOUBLE_UP")
    val killsAsMurdererAncientTombMurderDoubleUp: Int = 0

    @SerializedName("kills_ancient_tomb_MURDER_DOUBLE_UP")
    val killsAncientTombMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_ancient_tomb_MURDER_DOUBLE_UP")
    val knifeKillsAncientTombMurderDoubleUp: Int = 0

    @SerializedName("was_hero_ancient_tomb_MURDER_DOUBLE_UP")
    val wasHeroAncientTombMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_ancient_tomb_MURDER_DOUBLE_UP")
    val bowKillsAncientTombMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_archives_MURDER_DOUBLE_UP")
    val detectiveWinsArchivesMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_hollywood_MURDER_DOUBLE_UP")
    val murdererWinsHollywoodMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_archives_top_floor")
    val murdererWinsArchivesTopFloor: Int = 0

    @SerializedName("murderer_wins_archives_top_floor_MURDER_CLASSIC")
    val murdererWinsArchivesTopFloorMurderClassic: Int = 0

    @SerializedName("games_easter_world_MURDER_CLASSIC")
    val gamesEasterWorldMurderClassic: Int = 0

    @SerializedName("bow_kills_easter_world_MURDER_CLASSIC")
    val bowKillsEasterWorldMurderClassic: Int = 0

    @SerializedName("was_hero_easter_world_MURDER_CLASSIC")
    val wasHeroEasterWorldMurderClassic: Int = 0

    @SerializedName("coins_pickedup_easter_world")
    val coinsPickedupEasterWorld: Int = 0

    @SerializedName("was_hero_easter_world")
    val wasHeroEasterWorld: Int = 0

    @SerializedName("detective_wins_easter_world")
    val detectiveWinsEasterWorld: Int = 0

    @SerializedName("detective_wins_easter_world_MURDER_CLASSIC")
    val detectiveWinsEasterWorldMurderClassic: Int = 0

    @SerializedName("kills_easter_world_MURDER_CLASSIC")
    val killsEasterWorldMurderClassic: Int = 0

    @SerializedName("wins_easter_world")
    val winsEasterWorld: Int = 0

    @SerializedName("wins_easter_world_MURDER_CLASSIC")
    val winsEasterWorldMurderClassic: Int = 0

    @SerializedName("coins_pickedup_easter_world_MURDER_CLASSIC")
    val coinsPickedupEasterWorldMurderClassic: Int = 0

    @SerializedName("kills_easter_world")
    val killsEasterWorld: Int = 0

    @SerializedName("bow_kills_easter_world")
    val bowKillsEasterWorld: Int = 0

    @SerializedName("games_easter_world")
    val gamesEasterWorld: Int = 0

    @SerializedName("deaths_easter_world_MURDER_CLASSIC")
    val deathsEasterWorldMurderClassic: Int = 0

    @SerializedName("deaths_easter_world")
    val deathsEasterWorld: Int = 0

    @SerializedName("quickjoin_uses_Easter World")
    val quickjoinUsesEasterWorld: Int = 0

    @SerializedName("knife_kills_easter_world_MURDER_CLASSIC")
    val knifeKillsEasterWorldMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_easter_world_MURDER_CLASSIC")
    val thrownKnifeKillsEasterWorldMurderClassic: Int = 0

    @SerializedName("kills_as_murderer_easter_world")
    val killsAsMurdererEasterWorld: Int = 0

    @SerializedName("thrown_knife_kills_easter_world")
    val thrownKnifeKillsEasterWorld: Int = 0

    @SerializedName("knife_kills_easter_world")
    val knifeKillsEasterWorld: Int = 0

    @SerializedName("kills_as_murderer_easter_world_MURDER_CLASSIC")
    val killsAsMurdererEasterWorldMurderClassic: Int = 0

    @SerializedName("murderer_wins_easter_world_MURDER_CLASSIC")
    val murdererWinsEasterWorldMurderClassic: Int = 0

    @SerializedName("murderer_wins_easter_world")
    val murdererWinsEasterWorld: Int = 0

    @SerializedName("was_hero_aquarium_MURDER_DOUBLE_UP")
    val wasHeroAquariumMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_aquarium_MURDER_DOUBLE_UP")
    val bowKillsAquariumMurderDoubleUp: Int = 0

    @SerializedName("kills_easter_world_MURDER_DOUBLE_UP")
    val killsEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("games_easter_world_MURDER_DOUBLE_UP")
    val gamesEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_easter_world_MURDER_DOUBLE_UP")
    val knifeKillsEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_easter_world_MURDER_DOUBLE_UP")
    val thrownKnifeKillsEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_easter_world_MURDER_DOUBLE_UP")
    val coinsPickedupEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_easter_world_MURDER_DOUBLE_UP")
    val murdererWinsEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_easter_world_MURDER_DOUBLE_UP")
    val killsAsMurdererEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("wins_easter_world_MURDER_DOUBLE_UP")
    val winsEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("deaths_easter_world_MURDER_DOUBLE_UP")
    val deathsEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_archives_top_floor_MURDER_DOUBLE_UP")
    val detectiveWinsArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("was_hero_archives_top_floor_MURDER_DOUBLE_UP")
    val wasHeroArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_san_peratico_MURDER_DOUBLE_UP")
    val detectiveWinsSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_ancient_tomb_MURDER_DOUBLE_UP")
    val detectiveWinsAncientTombMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_widow's_den_MURDER_DOUBLE_UP")
    val detectiveWinsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_aquarium_MURDER_DOUBLE_UP")
    val knifeKillsAquariumMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_aquarium_MURDER_DOUBLE_UP")
    val killsAsMurdererAquariumMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_aquarium_MURDER_DOUBLE_UP")
    val thrownKnifeKillsAquariumMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_aquarium_MURDER_DOUBLE_UP")
    val murdererWinsAquariumMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_archives_MURDER_DOUBLE_UP")
    val murdererWinsArchivesMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_easter_world_MURDER_DOUBLE_UP")
    val bowKillsEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_san_peratico_MURDER_DOUBLE_UP")
    val thrownKnifeKillsSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_san_peratico_MURDER_DOUBLE_UP")
    val knifeKillsSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_san_peratico_MURDER_DOUBLE_UP")
    val killsAsMurdererSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("trap_kills_darkfall_MURDER_DOUBLE_UP")
    val trapKillsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_easter_world_MURDER_DOUBLE_UP")
    val detectiveWinsEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("was_hero_easter_world_MURDER_DOUBLE_UP")
    val wasHeroEasterWorldMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_san_peratico_MURDER_DOUBLE_UP")
    val murdererWinsSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_mountain_MURDER_DOUBLE_UP")
    val thrownKnifeKillsMountainMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_mountain_MURDER_DOUBLE_UP")
    val murdererWinsMountainMurderDoubleUp: Int = 0

    @SerializedName("was_hero_san_peratico_MURDER_DOUBLE_UP")
    val wasHeroSanPeraticoMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_archives_top_floor_MURDER_DOUBLE_UP")
    val knifeKillsArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_archives_top_floor_MURDER_DOUBLE_UP")
    val thrownKnifeKillsArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_archives_top_floor_MURDER_DOUBLE_UP")
    val killsAsMurdererArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_darkfall_MURDER_DOUBLE_UP")
    val murdererWinsDarkfallMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_cruise_ship_MURDER_DOUBLE_UP")
    val thrownKnifeKillsCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_cruise_ship_MURDER_DOUBLE_UP")
    val murdererWinsCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_cruise_ship_MURDER_DOUBLE_UP")
    val killsAsMurdererCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_cruise_ship_MURDER_DOUBLE_UP")
    val knifeKillsCruiseShipMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_transport_MURDER_DOUBLE_UP")
    val thrownKnifeKillsTransportMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_transport_MURDER_DOUBLE_UP")
    val murdererWinsTransportMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_transport_MURDER_DOUBLE_UP")
    val killsAsMurdererTransportMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_transport_MURDER_DOUBLE_UP")
    val knifeKillsTransportMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_widow's_den_MURDER_DOUBLE_UP")
    val murdererWinsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_widow's_den_MURDER_DOUBLE_UP")
    val thrownKnifeKillsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("trap_kills_towerfall_MURDER_DOUBLE_UP")
    val trapKillsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_library_MURDER_DOUBLE_UP")
    val thrownKnifeKillsLibraryMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_headquarters_MURDER_DOUBLE_UP")
    val killsAsMurdererHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_headquarters_MURDER_DOUBLE_UP")
    val thrownKnifeKillsHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_headquarters_MURDER_DOUBLE_UP")
    val knifeKillsHeadquartersMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_ancient_tomb_MURDER_DOUBLE_UP")
    val murdererWinsAncientTombMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_ancient_tomb_MURDER_DOUBLE_UP")
    val thrownKnifeKillsAncientTombMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_archives_top_floor_MURDER_DOUBLE_UP")
    val murdererWinsArchivesTopFloorMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_aquarium_MURDER_DOUBLE_UP")
    val detectiveWinsAquariumMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_towerfall_MURDER_DOUBLE_UP")
    val knifeKillsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_towerfall_MURDER_DOUBLE_UP")
    val killsAsMurdererTowerfallMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_towerfall_MURDER_DOUBLE_UP")
    val murdererWinsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_towerfall_MURDER_DOUBLE_UP")
    val thrownKnifeKillsTowerfallMurderDoubleUp: Int = 0

    @SerializedName("trap_kills_widow's_den_MURDER_DOUBLE_UP")
    val trapKillsWidowsDenMurderDoubleUp: Int = 0

    @SerializedName("was_hero_hypixel_world_MURDER_DOUBLE_UP")
    val wasHeroHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_hypixel_world_MURDER_DOUBLE_UP")
    val detectiveWinsHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("kills_hypixel_world_MURDER_DOUBLE_UP")
    val killsHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_hypixel_world_MURDER_DOUBLE_UP")
    val bowKillsHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_hypixel_world_MURDER_DOUBLE_UP")
    val knifeKillsHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_hypixel_world_MURDER_DOUBLE_UP")
    val murdererWinsHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_hypixel_world_MURDER_DOUBLE_UP")
    val thrownKnifeKillsHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_hypixel_world_MURDER_DOUBLE_UP")
    val killsAsMurdererHypixelWorldMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_gold_rush_MURDER_DOUBLE_UP")
    val murdererWinsGoldRushMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_gold_rush_MURDER_DOUBLE_UP")
    val knifeKillsGoldRushMurderDoubleUp: Int = 0

    @SerializedName("thrown_knife_kills_gold_rush_MURDER_DOUBLE_UP")
    val thrownKnifeKillsGoldRushMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_gold_rush_MURDER_DOUBLE_UP")
    val killsAsMurdererGoldRushMurderDoubleUp: Int = 0

    @SerializedName("active_deathcry")
    val activeDeathcry: String = ""

    @SerializedName("coins_pickedup_archives_top_floor_MURDER_ASSASSINS")
    val coinsPickedupArchivesTopFloorMurderAssassins: Int = 0

    @SerializedName("wins_archives_top_floor_MURDER_ASSASSINS")
    val winsArchivesTopFloorMurderAssassins: Int = 0

    @SerializedName("games_archives_top_floor_MURDER_ASSASSINS")
    val gamesArchivesTopFloorMurderAssassins: Int = 0

    @SerializedName("knife_kills_archives_top_floor_MURDER_ASSASSINS")
    val knifeKillsArchivesTopFloorMurderAssassins: Int = 0

    @SerializedName("kills_archives_top_floor_MURDER_ASSASSINS")
    val killsArchivesTopFloorMurderAssassins: Int = 0

    @SerializedName("deaths_archives_top_floor_MURDER_ASSASSINS")
    val deathsArchivesTopFloorMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_archives_top_floor_MURDER_ASSASSINS")
    val thrownKnifeKillsArchivesTopFloorMurderAssassins: Int = 0

    @SerializedName("wins_widow's_den_MURDER_ASSASSINS")
    val winsWidowsDenMurderAssassins: Int = 0

    @SerializedName("wins_skyway_pier")
    val winsSkywayPier: Int = 0

    @SerializedName("wins_skyway_pier_MURDER_CLASSIC")
    val winsSkywayPierMurderClassic: Int = 0

    @SerializedName("coins_pickedup_skyway_pier")
    val coinsPickedupSkywayPier: Int = 0

    @SerializedName("games_skyway_pier_MURDER_CLASSIC")
    val gamesSkywayPierMurderClassic: Int = 0

    @SerializedName("coins_pickedup_skyway_pier_MURDER_CLASSIC")
    val coinsPickedupSkywayPierMurderClassic: Int = 0

    @SerializedName("games_skyway_pier")
    val gamesSkywayPier: Int = 0

    @SerializedName("quickjoin_uses_Skyway Pier")
    val quickjoinUsesSkywayPier: Int = 0

    @SerializedName("quickjoin_uses_San Peratico V2")
    val quickjoinUsesSanPeraticoV2: Int = 0

    @SerializedName("games_san_peratico_v2_MURDER_CLASSIC")
    val gamesSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("wins_san_peratico_v2")
    val winsSanPeraticoV2: Int = 0

    @SerializedName("kills_san_peratico_v2")
    val killsSanPeraticoV2: Int = 0

    @SerializedName("bow_kills_san_peratico_v2")
    val bowKillsSanPeraticoV2: Int = 0

    @SerializedName("wins_san_peratico_v2_MURDER_CLASSIC")
    val winsSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("kills_san_peratico_v2_MURDER_CLASSIC")
    val killsSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("coins_pickedup_san_peratico_v2_MURDER_CLASSIC")
    val coinsPickedupSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("games_san_peratico_v2")
    val gamesSanPeraticoV2: Int = 0

    @SerializedName("coins_pickedup_san_peratico_v2")
    val coinsPickedupSanPeraticoV2: Int = 0

    @SerializedName("was_hero_san_peratico_v2")
    val wasHeroSanPeraticoV2: Int = 0

    @SerializedName("bow_kills_san_peratico_v2_MURDER_CLASSIC")
    val bowKillsSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("was_hero_san_peratico_v2_MURDER_CLASSIC")
    val wasHeroSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("deaths_san_peratico_v2")
    val deathsSanPeraticoV2: Int = 0

    @SerializedName("deaths_san_peratico_v2_MURDER_CLASSIC")
    val deathsSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("deaths_skyway_pier")
    val deathsSkywayPier: Int = 0

    @SerializedName("deaths_skyway_pier_MURDER_CLASSIC")
    val deathsSkywayPierMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_san_peratico_v2")
    val thrownKnifeKillsSanPeraticoV2: Int = 0

    @SerializedName("kills_as_murderer_san_peratico_v2_MURDER_CLASSIC")
    val killsAsMurdererSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("murderer_wins_san_peratico_v2")
    val murdererWinsSanPeraticoV2: Int = 0

    @SerializedName("knife_kills_san_peratico_v2")
    val knifeKillsSanPeraticoV2: Int = 0

    @SerializedName("murderer_wins_san_peratico_v2_MURDER_CLASSIC")
    val murdererWinsSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_san_peratico_v2_MURDER_CLASSIC")
    val thrownKnifeKillsSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("knife_kills_san_peratico_v2_MURDER_CLASSIC")
    val knifeKillsSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("kills_as_murderer_san_peratico_v2")
    val killsAsMurdererSanPeraticoV2: Int = 0

    @SerializedName("bow_kills_skyway_pier")
    val bowKillsSkywayPier: Int = 0

    @SerializedName("was_hero_skyway_pier")
    val wasHeroSkywayPier: Int = 0

    @SerializedName("detective_wins_skyway_pier")
    val detectiveWinsSkywayPier: Int = 0

    @SerializedName("bow_kills_skyway_pier_MURDER_CLASSIC")
    val bowKillsSkywayPierMurderClassic: Int = 0

    @SerializedName("detective_wins_skyway_pier_MURDER_CLASSIC")
    val detectiveWinsSkywayPierMurderClassic: Int = 0

    @SerializedName("kills_skyway_pier_MURDER_CLASSIC")
    val killsSkywayPierMurderClassic: Int = 0

    @SerializedName("was_hero_skyway_pier_MURDER_CLASSIC")
    val wasHeroSkywayPierMurderClassic: Int = 0

    @SerializedName("kills_skyway_pier")
    val killsSkywayPier: Int = 0

    @SerializedName("trap_kills_skyway_pier")
    val trapKillsSkywayPier: Int = 0

    @SerializedName("trap_kills_skyway_pier_MURDER_CLASSIC")
    val trapKillsSkywayPierMurderClassic: Int = 0

    @SerializedName("detective_wins_san_peratico_v2")
    val detectiveWinsSanPeraticoV2: Int = 0

    @SerializedName("detective_wins_san_peratico_v2_MURDER_CLASSIC")
    val detectiveWinsSanPeraticoV2MurderClassic: Int = 0

    @SerializedName("wins_skyway_pier_MURDER_DOUBLE_UP")
    val winsSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_skyway_pier_MURDER_DOUBLE_UP")
    val bowKillsSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("games_skyway_pier_MURDER_DOUBLE_UP")
    val gamesSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("detective_wins_skyway_pier_MURDER_DOUBLE_UP")
    val detectiveWinsSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_skyway_pier_MURDER_DOUBLE_UP")
    val coinsPickedupSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("kills_skyway_pier_MURDER_DOUBLE_UP")
    val killsSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("was_hero_skyway_pier_MURDER_DOUBLE_UP")
    val wasHeroSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("bow_kills_san_peratico_v2_MURDER_DOUBLE_UP")
    val bowKillsSanPeraticoV2MurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_san_peratico_v2_MURDER_DOUBLE_UP")
    val coinsPickedupSanPeraticoV2MurderDoubleUp: Int = 0

    @SerializedName("kills_san_peratico_v2_MURDER_DOUBLE_UP")
    val killsSanPeraticoV2MurderDoubleUp: Int = 0

    @SerializedName("detective_wins_san_peratico_v2_MURDER_DOUBLE_UP")
    val detectiveWinsSanPeraticoV2MurderDoubleUp: Int = 0

    @SerializedName("wins_san_peratico_v2_MURDER_DOUBLE_UP")
    val winsSanPeraticoV2MurderDoubleUp: Int = 0

    @SerializedName("games_san_peratico_v2_MURDER_DOUBLE_UP")
    val gamesSanPeraticoV2MurderDoubleUp: Int = 0

    @SerializedName("was_hero_san_peratico_v2_MURDER_DOUBLE_UP")
    val wasHeroSanPeraticoV2MurderDoubleUp: Int = 0

    @SerializedName("knife_kills_skyway_pier")
    val knifeKillsSkywayPier: Int = 0

    @SerializedName("murderer_wins_skyway_pier")
    val murdererWinsSkywayPier: Int = 0

    @SerializedName("kills_as_murderer_skyway_pier_MURDER_CLASSIC")
    val killsAsMurdererSkywayPierMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_skyway_pier_MURDER_CLASSIC")
    val thrownKnifeKillsSkywayPierMurderClassic: Int = 0

    @SerializedName("knife_kills_skyway_pier_MURDER_CLASSIC")
    val knifeKillsSkywayPierMurderClassic: Int = 0

    @SerializedName("thrown_knife_kills_skyway_pier")
    val thrownKnifeKillsSkywayPier: Int = 0

    @SerializedName("kills_as_murderer_skyway_pier")
    val killsAsMurdererSkywayPier: Int = 0

    @SerializedName("murderer_wins_skyway_pier_MURDER_CLASSIC")
    val murdererWinsSkywayPierMurderClassic: Int = 0

    @SerializedName("suicides_mountain_MURDER_CLASSIC")
    val suicidesMountainMurderClassic: Int = 0

    @SerializedName("suicides_mountain")
    val suicidesMountain: Int = 0

    @SerializedName("trap_kills_skyway_pier_MURDER_DOUBLE_UP")
    val trapKillsSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("knife_kills_skyway_pier_MURDER_DOUBLE_UP")
    val knifeKillsSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("murderer_wins_skyway_pier_MURDER_DOUBLE_UP")
    val murdererWinsSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("kills_as_murderer_skyway_pier_MURDER_DOUBLE_UP")
    val killsAsMurdererSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("deaths_skyway_pier_MURDER_DOUBLE_UP")
    val deathsSkywayPierMurderDoubleUp: Int = 0

    @SerializedName("coins_pickedup_skyway_pier_MURDER_ASSASSINS")
    val coinsPickedupSkywayPierMurderAssassins: Int = 0

    @SerializedName("deaths_skyway_pier_MURDER_ASSASSINS")
    val deathsSkywayPierMurderAssassins: Int = 0

    @SerializedName("games_skyway_pier_MURDER_ASSASSINS")
    val gamesSkywayPierMurderAssassins: Int = 0

    @SerializedName("kills_skyway_pier_MURDER_ASSASSINS")
    val killsSkywayPierMurderAssassins: Int = 0

    @SerializedName("knife_kills_skyway_pier_MURDER_ASSASSINS")
    val knifeKillsSkywayPierMurderAssassins: Int = 0

    @SerializedName("coins_pickedup_san_peratico_v2_MURDER_ASSASSINS")
    val coinsPickedupSanPeraticoV2MurderAssassins: Int = 0

    @SerializedName("deaths_san_peratico_v2_MURDER_ASSASSINS")
    val deathsSanPeraticoV2MurderAssassins: Int = 0

    @SerializedName("games_san_peratico_v2_MURDER_ASSASSINS")
    val gamesSanPeraticoV2MurderAssassins: Int = 0

    @SerializedName("kills_san_peratico_v2_MURDER_ASSASSINS")
    val killsSanPeraticoV2MurderAssassins: Int = 0

    @SerializedName("knife_kills_san_peratico_v2_MURDER_ASSASSINS")
    val knifeKillsSanPeraticoV2MurderAssassins: Int = 0

    @SerializedName("wins_skyway_pier_MURDER_ASSASSINS")
    val winsSkywayPierMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_san_peratico_v2_MURDER_ASSASSINS")
    val thrownKnifeKillsSanPeraticoV2MurderAssassins: Int = 0

    @SerializedName("wins_san_peratico_v2_MURDER_ASSASSINS")
    val winsSanPeraticoV2MurderAssassins: Int = 0

    @SerializedName("bow_kills_cruise_ship_MURDER_ASSASSINS")
    val bowKillsCruiseShipMurderAssassins: Int = 0

    @SerializedName("thrown_knife_kills_skyway_pier_MURDER_ASSASSINS")
    val thrownKnifeKillsSkywayPierMurderAssassins: Int = 0

    @SerializedName("trap_kills_MURDER_ASSASSINS")
    val trapKillsMurderAssassins: Int = 0

    @SerializedName("trap_kills_towerfall_MURDER_ASSASSINS")
    val trapKillsTowerfallMurderAssassins: Int = 0

    @SerializedName("bow_kills_hollywood_MURDER_ASSASSINS")
    val bowKillsHollywoodMurderAssassins: Int = 0
}

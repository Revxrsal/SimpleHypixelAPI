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
 * Represents all the <i>Arcade</i> statistics of a player.
 */
class ArcadeStatistics {

    @SerializedName("monthly_coins_b")
    val monthlyCoinsB: Int = 0

    @SerializedName("weekly_coins_b")
    val weeklyCoinsB: Int = 0

    val coins: Int = 0

    @SerializedName("dec2016_achievements2")
    val dec2016Achievements2: Boolean = false

    @SerializedName("dec2016_achievements")
    val dec2016Achievements: Boolean = false

    @SerializedName("monthly_coins_a")
    val monthlyCoinsA: Int = 0

    @SerializedName("final_kills_mini_walls")
    val finalKillsMiniWalls: Int = 0

    @SerializedName("kills_mini_walls")
    val killsMiniWalls: Int = 0

    @SerializedName("deaths_mini_walls")
    val deathsMiniWalls: Int = 0

    @SerializedName("arrows_shot_mini_walls")
    val arrowsShotMiniWalls: Int = 0

    @SerializedName("weekly_coins_a")
    val weeklyCoinsA: Int = 0

    @SerializedName("wins_mini_walls")
    val winsMiniWalls: Int = 0

    @SerializedName("wither_damage_mini_walls")
    val witherDamageMiniWalls: Int = 0

    @SerializedName("miniwalls_activeKit")
    val miniwallsActivekit: String = ""

    @SerializedName("arrows_hit_mini_walls")
    val arrowsHitMiniWalls: Int = 0

    @SerializedName("wither_kills_mini_walls")
    val witherKillsMiniWalls: Int = 0

    @SerializedName("max_wave")
    val maxWave: Int = 0

    @SerializedName("time_stamp")
    val timeStamp: Int = 0

    @SerializedName("stamp_level")
    val stampLevel: Int = 0

    @SerializedName("sw_empire_kills")
    val swEmpireKills: Int = 0

    @SerializedName("sw_kills")
    val swKills: Int = 0

    @SerializedName("sw_weekly_kills_a")
    val swWeeklyKillsA: Int = 0

    @SerializedName("sw_deaths")
    val swDeaths: Int = 0

    @SerializedName("sw_monthly_kills_a")
    val swMonthlyKillsA: Int = 0

    @SerializedName("sw_shots_fired")
    val swShotsFired: Int = 0

    @SerializedName("poop_collected")
    val poopCollected: Int = 0

    @SerializedName("wins_farm_hunt")
    val winsFarmHunt: Int = 0

    @SerializedName("headshots_dayone")
    val headshotsDayone: Int = 0

    @SerializedName("kills_dayone")
    val killsDayone: Int = 0

    @SerializedName("wins_soccer")
    val winsSoccer: Int = 0

    @SerializedName("powerkicks_soccer")
    val powerkicksSoccer: Int = 0

    @SerializedName("goals_soccer")
    val goalsSoccer: Int = 0

    @SerializedName("best_round_zombies")
    val bestRoundZombies: Int = 0

    @SerializedName("players_revived_zombies")
    val playersRevivedZombies: Int = 0

    @SerializedName("deaths_zombies")
    val deathsZombies: Int = 0

    @SerializedName("times_knocked_down_zombies")
    val timesKnockedDownZombies: Int = 0

    @SerializedName("zombie_kills_zombies")
    val zombieKillsZombies: Int = 0

    @SerializedName("bullets_shot_zombies")
    val bulletsShotZombies: Int = 0

    @SerializedName("fastest_time_30_zombies")
    val fastestTime30Zombies: Int = 0

    @SerializedName("fastest_time_10_zombies_deadend_normal")
    val fastestTime10ZombiesDeadEndNormal: Int = 0

    @SerializedName("fastest_time_20_zombies")
    val fastestTime20Zombies: Int = 0

    @SerializedName("fastest_time_30_zombies_deadend_normal")
    val fastestTime30ZombiesDeadEndNormal: Int = 0

    @SerializedName("fastest_time_20_zombies_deadend_normal")
    val fastestTime20ZombiesDeadEndNormal: Int = 0

    @SerializedName("fastest_time_10_zombies")
    val fastestTime10Zombies: Int = 0

    @SerializedName("headshots_zombies")
    val headshotsZombies: Int = 0

    @SerializedName("doors_opened_zombies")
    val doorsOpenedZombies: Int = 0

    @SerializedName("bullets_hit_zombies")
    val bulletsHitZombies: Int = 0

    @SerializedName("fastest_time_10_zombies_badblood_normal")
    val fastestTime10ZombiesBadBloodNormal: Int = 0

    @SerializedName("fastest_time_20_zombies_badblood_normal")
    val fastestTime20ZombiesBadBloodNormal: Int = 0

    @SerializedName("fastest_time_30_zombies_badblood_normal")
    val fastestTime30ZombiesBadBloodNormal: Int = 0

    @SerializedName("wins_throw_out")
    val winsThrowOut: Int = 0

    @SerializedName("kills_throw_out")
    val killsThrowOut: Int = 0

    @SerializedName("deaths_throw_out")
    val deathsThrowOut: Int = 0

    @SerializedName("kicks_soccer")
    val kicksSoccer: Int = 0

    @SerializedName("rounds_simon_says")
    val roundsSimonSays: Int = 0

    @SerializedName("hitw_record_q")
    val hitwRecordQ: Int = 0

    @SerializedName("rounds_hole_in_the_wall")
    val roundsHoleInTheWall: Int = 0

    @SerializedName("kills_dragonwars2")
    val killsDragonwars2: Int = 0

    @SerializedName("hitw_record_f")
    val hitwRecordF: Int = 0

    @SerializedName("deaths_zombies_alienarcadium")
    val deathsZombiesAlienArcadium: Int = 0

    @SerializedName("total_rounds_survived_zombies_alienarcadium")
    val totalRoundsSurvivedZombiesAlienArcadium: Int = 0

    @SerializedName("total_rounds_survived_zombies")
    val totalRoundsSurvivedZombies: Int = 0

    @SerializedName("best_round_zombies_alienarcadium")
    val bestRoundZombiesAlienArcadium: Int = 0

    @SerializedName("best_round_zombies_alienarcadium_normal")
    val bestRoundZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("fastest_time_10_zombies_alienarcadium_normal")
    val fastestTime10ZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("rainbow_zombie_kills_zombies")
    val rainbowZombieKillsZombies: Int = 0

    @SerializedName("space_blaster_zombie_kills_zombies")
    val spaceBlasterZombieKillsZombies: Int = 0

    @SerializedName("windows_repaired_zombies_alienarcadium")
    val windowsRepairedZombiesAlienArcadium: Int = 0

    @SerializedName("times_knocked_down_zombies_alienarcadium")
    val timesKnockedDownZombiesAlienArcadium: Int = 0

    @SerializedName("zombie_kills_zombies_alienarcadium_normal")
    val zombieKillsZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("worm_small_zombie_kills_zombies")
    val wormSmallZombieKillsZombies: Int = 0

    @SerializedName("basic_zombie_kills_zombies")
    val basicZombieKillsZombies: Int = 0

    @SerializedName("windows_repaired_zombies_alienarcadium_normal")
    val windowsRepairedZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("worm_zombie_kills_zombies")
    val wormZombieKillsZombies: Int = 0

    @SerializedName("total_rounds_survived_zombies_alienarcadium_normal")
    val totalRoundsSurvivedZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("times_knocked_down_zombies_alienarcadium_normal")
    val timesKnockedDownZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("windows_repaired_zombies")
    val windowsRepairedZombies: Int = 0

    @SerializedName("sentinel_zombie_kills_zombies")
    val sentinelZombieKillsZombies: Int = 0

    @SerializedName("zombie_kills_zombies_alienarcadium")
    val zombieKillsZombiesAlienArcadium: Int = 0

    @SerializedName("pig_zombie_zombie_kills_zombies")
    val pigZombieZombieKillsZombies: Int = 0

    @SerializedName("deaths_zombies_alienarcadium_normal")
    val deathsZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("skeleton_zombie_kills_zombies")
    val skeletonZombieKillsZombies: Int = 0

    @SerializedName("space_grunt_zombie_kills_zombies")
    val spaceGruntZombieKillsZombies: Int = 0

    @SerializedName("blob_zombie_kills_zombies")
    val blobZombieKillsZombies: Int = 0

    @SerializedName("clown_zombie_kills_zombies")
    val clownZombieKillsZombies: Int = 0

    @SerializedName("doors_opened_zombies_alienarcadium")
    val doorsOpenedZombiesAlienArcadium: Int = 0

    @SerializedName("players_revived_zombies_alienarcadium")
    val playersRevivedZombiesAlienArcadium: Int = 0

    @SerializedName("doors_opened_zombies_alienarcadium_normal")
    val doorsOpenedZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("players_revived_zombies_alienarcadium_normal")
    val playersRevivedZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("magma_cube_zombie_kills_zombies")
    val magmaCubeZombieKillsZombies: Int = 0

    @SerializedName("deaths_zombies_deadend")
    val deathsZombiesDeadEnd: Int = 0

    @SerializedName("windows_repaired_zombies_deadend")
    val windowsRepairedZombiesDeadEnd: Int = 0

    @SerializedName("tnt_baby_zombie_kills_zombies")
    val tntBabyZombieKillsZombies: Int = 0

    @SerializedName("magma_zombie_kills_zombies")
    val magmaZombieKillsZombies: Int = 0

    @SerializedName("zombie_kills_zombies_deadend")
    val zombieKillsZombiesDeadEnd: Int = 0

    @SerializedName("total_rounds_survived_zombies_deadend")
    val totalRoundsSurvivedZombiesDeadEnd: Int = 0

    @SerializedName("fire_zombie_kills_zombies")
    val fireZombieKillsZombies: Int = 0

    @SerializedName("wolf_zombie_kills_zombies")
    val wolfZombieKillsZombies: Int = 0

    @SerializedName("empowered_zombie_kills_zombies")
    val empoweredZombieKillsZombies: Int = 0

    @SerializedName("doors_opened_zombies_deadend")
    val doorsOpenedZombiesDeadEnd: Int = 0

    @SerializedName("times_knocked_down_zombies_deadend")
    val timesKnockedDownZombiesDeadEnd: Int = 0

    @SerializedName("players_revived_zombies_deadend")
    val playersRevivedZombiesDeadEnd: Int = 0

    @SerializedName("best_round_zombies_deadend")
    val bestRoundZombiesDeadEnd: Int = 0

    @SerializedName("best_round_zombies_deadend_rip")
    val bestRoundZombiesDeadEndRIP: Int = 0

    @SerializedName("deaths_zombies_deadend_rip")
    val deathsZombiesDeadEndRIP: Int = 0

    @SerializedName("windows_repaired_zombies_deadend_rip")
    val windowsRepairedZombiesDeadEndRIP: Int = 0

    @SerializedName("times_knocked_down_zombies_deadend_rip")
    val timesKnockedDownZombiesDeadEndRIP: Int = 0

    @SerializedName("zombie_kills_zombies_deadend_rip")
    val zombieKillsZombiesDeadEndRIP: Int = 0

    @SerializedName("total_rounds_survived_zombies_deadend_rip")
    val totalRoundsSurvivedZombiesDeadEndRIP: Int = 0

    @SerializedName("doors_opened_zombies_deadend_rip")
    val doorsOpenedZombiesDeadEndRIP: Int = 0

    @SerializedName("players_revived_zombies_deadend_rip")
    val playersRevivedZombiesDeadEndRIP: Int = 0

    @SerializedName("fastest_time_10_zombies_deadend_rip")
    val fastestTime10ZombiesDeadEndRIP: Int = 0

    @SerializedName("inferno_zombie_kills_zombies")
    val infernoZombieKillsZombies: Int = 0

    @SerializedName("blaze_zombie_kills_zombies")
    val blazeZombieKillsZombies: Int = 0

    @SerializedName("tnt_zombie_kills_zombies")
    val tntZombieKillsZombies: Int = 0

    @SerializedName("fastest_time_30_zombies_deadend_rip")
    val fastestTime30ZombiesDeadEndRIP: Int = 0

    @SerializedName("fastest_time_20_zombies_deadend_rip")
    val fastestTime20ZombiesDeadEndRIP: Int = 0

    @SerializedName("wins_zombies")
    val winsZombies: Int = 0

    @SerializedName("wins_zombies_deadend")
    val winsZombiesDeadEnd: Int = 0

    @SerializedName("endermite_zombie_kills_zombies")
    val endermiteZombieKillsZombies: Int = 0

    @SerializedName("skelefish_zombie_kills_zombies")
    val skelefishZombieKillsZombies: Int = 0

    @SerializedName("guardian_zombie_kills_zombies")
    val guardianZombieKillsZombies: Int = 0

    @SerializedName("wins_zombies_deadend_rip")
    val winsZombiesDeadEndRIP: Int = 0

    @SerializedName("broodmother_zombie_kills_zombies")
    val broodmotherZombieKillsZombies: Int = 0

    @SerializedName("silverfish_zombie_kills_zombies")
    val silverfishZombieKillsZombies: Int = 0

    @SerializedName("ender_zombie_kills_zombies")
    val enderZombieKillsZombies: Int = 0

    @SerializedName("fastest_time_10_zombies_badblood_hard")
    val fastestTime10ZombiesBadBloodHard: Int = 0

    @SerializedName("best_round_zombies_badblood")
    val bestRoundZombiesBadBlood: Int = 0

    @SerializedName("best_round_zombies_badblood_hard")
    val bestRoundZombiesBadBloodHard: Int = 0

    @SerializedName("players_revived_zombies_badblood_hard")
    val playersRevivedZombiesBadBloodHard: Int = 0

    @SerializedName("total_rounds_survived_zombies_badblood")
    val totalRoundsSurvivedZombiesBadBlood: Int = 0

    @SerializedName("total_rounds_survived_zombies_badblood_hard")
    val totalRoundsSurvivedZombiesBadBloodHard: Int = 0

    @SerializedName("wither_zombie_zombie_kills_zombies")
    val witherZombieZombieKillsZombies: Int = 0

    @SerializedName("deaths_zombies_badblood")
    val deathsZombiesBadBlood: Int = 0

    @SerializedName("witch_zombie_kills_zombies")
    val witchZombieKillsZombies: Int = 0

    @SerializedName("zombie_kills_zombies_badblood_hard")
    val zombieKillsZombiesBadBloodHard: Int = 0

    @SerializedName("players_revived_zombies_badblood")
    val playersRevivedZombiesBadBlood: Int = 0

    @SerializedName("werewolf_zombie_kills_zombies")
    val werewolfZombieKillsZombies: Int = 0

    @SerializedName("family_twin_blue_zombie_kills_zombies")
    val familyTwinBlueZombieKillsZombies: Int = 0

    @SerializedName("times_knocked_down_zombies_badblood_hard")
    val timesKnockedDownZombiesBadBloodHard: Int = 0

    @SerializedName("family_twin_red_zombie_kills_zombies")
    val familyTwinRedZombieKillsZombies: Int = 0

    @SerializedName("slime_zombie_kills_zombies")
    val slimeZombieKillsZombies: Int = 0

    @SerializedName("windows_repaired_zombies_badblood_hard")
    val windowsRepairedZombiesBadBloodHard: Int = 0

    @SerializedName("king_slime_zombie_kills_zombies")
    val kingSlimeZombieKillsZombies: Int = 0

    @SerializedName("doors_opened_zombies_badblood_hard")
    val doorsOpenedZombiesBadBloodHard: Int = 0

    @SerializedName("doors_opened_zombies_badblood")
    val doorsOpenedZombiesBadBlood: Int = 0

    @SerializedName("slime_zombie_zombie_kills_zombies")
    val slimeZombieZombieKillsZombies: Int = 0

    @SerializedName("cave_spider_zombie_kills_zombies")
    val caveSpiderZombieKillsZombies: Int = 0

    @SerializedName("deaths_zombies_badblood_hard")
    val deathsZombiesBadBloodHard: Int = 0

    @SerializedName("times_knocked_down_zombies_badblood")
    val timesKnockedDownZombiesBadBlood: Int = 0

    @SerializedName("windows_repaired_zombies_badblood")
    val windowsRepairedZombiesBadBlood: Int = 0

    @SerializedName("zombie_kills_zombies_badblood")
    val zombieKillsZombiesBadBlood: Int = 0

    @SerializedName("fastest_time_20_zombies_badblood_hard")
    val fastestTime20ZombiesBadBloodHard: Int = 0

    @SerializedName("fastest_time_30_zombies_badblood_hard")
    val fastestTime30ZombiesBadBloodHard: Int = 0

    @SerializedName("wins_zombies_badblood_hard")
    val winsZombiesBadBloodHard: Int = 0

    @SerializedName("invisible_zombie_kills_zombies")
    val invisibleZombieKillsZombies: Int = 0

    @SerializedName("creeper_zombie_kills_zombies")
    val creeperZombieKillsZombies: Int = 0

    @SerializedName("wither_skeleton_zombie_kills_zombies")
    val witherSkeletonZombieKillsZombies: Int = 0

    @SerializedName("wins_zombies_badblood")
    val winsZombiesBadBlood: Int = 0

    @SerializedName("charged_creeper_zombie_kills_zombies")
    val chargedCreeperZombieKillsZombies: Int = 0

    @SerializedName("herobrine_minion_zombie_kills_zombies")
    val herobrineMinionZombieKillsZombies: Int = 0

    @SerializedName("best_round_zombies_deadend_hard")
    val bestRoundZombiesDeadEndHard: Int = 0

    @SerializedName("windows_repaired_zombies_deadend_hard")
    val windowsRepairedZombiesDeadEndHard: Int = 0

    @SerializedName("total_rounds_survived_zombies_deadend_hard")
    val totalRoundsSurvivedZombiesDeadEndHard: Int = 0

    @SerializedName("players_revived_zombies_deadend_hard")
    val playersRevivedZombiesDeadEndHard: Int = 0

    @SerializedName("deaths_zombies_deadend_hard")
    val deathsZombiesDeadEndHard: Int = 0

    @SerializedName("zombie_kills_zombies_deadend_hard")
    val zombieKillsZombiesDeadEndHard: Int = 0

    @SerializedName("times_knocked_down_zombies_deadend_hard")
    val timesKnockedDownZombiesDeadEndHard: Int = 0

    @SerializedName("fastest_time_20_zombies_deadend_hard")
    val fastestTime20ZombiesDeadEndHard: Int = 0

    @SerializedName("fastest_time_10_zombies_deadend_hard")
    val fastestTime10ZombiesDeadEndHard: Int = 0

    @SerializedName("doors_opened_zombies_deadend_hard")
    val doorsOpenedZombiesDeadEndHard: Int = 0

    @SerializedName("best_round_zombies_badblood_rip")
    val bestRoundZombiesBadBloodRIP: Int = 0

    @SerializedName("deaths_zombies_badblood_rip")
    val deathsZombiesBadBloodRIP: Int = 0

    @SerializedName("zombie_kills_zombies_badblood_rip")
    val zombieKillsZombiesBadBloodRIP: Int = 0

    @SerializedName("windows_repaired_zombies_badblood_rip")
    val windowsRepairedZombiesBadBloodRIP: Int = 0

    @SerializedName("times_knocked_down_zombies_badblood_rip")
    val timesKnockedDownZombiesBadBloodRIP: Int = 0

    @SerializedName("total_rounds_survived_zombies_badblood_rip")
    val totalRoundsSurvivedZombiesBadBloodRIP: Int = 0

    @SerializedName("fastest_time_10_zombies_badblood_rip")
    val fastestTime10ZombiesBadBloodRIP: Int = 0

    @SerializedName("wolf_pet_zombie_kills_zombies")
    val wolfPetZombieKillsZombies: Int = 0

    @SerializedName("doors_opened_zombies_badblood_rip")
    val doorsOpenedZombiesBadBloodRIP: Int = 0

    @SerializedName("players_revived_zombies_badblood_rip")
    val playersRevivedZombiesBadBloodRIP: Int = 0

    @SerializedName("best_round_zombies_badblood_normal")
    val bestRoundZombiesBadBloodNormal: Int = 0

    @SerializedName("zombie_kills_zombies_badblood_normal")
    val zombieKillsZombiesBadBloodNormal: Int = 0

    @SerializedName("doors_opened_zombies_badblood_normal")
    val doorsOpenedZombiesBadBloodNormal: Int = 0

    @SerializedName("times_knocked_down_zombies_badblood_normal")
    val timesKnockedDownZombiesBadBloodNormal: Int = 0

    @SerializedName("total_rounds_survived_zombies_badblood_normal")
    val totalRoundsSurvivedZombiesBadBloodNormal: Int = 0

    @SerializedName("windows_repaired_zombies_badblood_normal")
    val windowsRepairedZombiesBadBloodNormal: Int = 0

    @SerializedName("deaths_zombies_badblood_normal")
    val deathsZombiesBadBloodNormal: Int = 0

    @SerializedName("players_revived_zombies_badblood_normal")
    val playersRevivedZombiesBadBloodNormal: Int = 0

    @SerializedName("wins_zombies_deadend_normal")
    val winsZombiesDeadEndNormal: Int = 0

    @SerializedName("wins_zombies_deadend_hard")
    val winsZombiesDeadEndHard: Int = 0

    @SerializedName("wins_zombies_badblood_normal")
    val winsZombiesBadBloodNormal: Int = 0

    @SerializedName("fastest_time_20_zombies_alienarcadium_normal")
    val fastestTime20ZombiesAlienArcadiumNormal: Int = 0

    @SerializedName("giant_zombie_kills_zombies")
    val giantZombieKillsZombies: Int = 0

    @SerializedName("chgluglu_zombie_kills_zombies")
    val chglugluZombieKillsZombies: Int = 0

    @SerializedName("ghast_zombie_kills_zombies")
    val ghastZombieKillsZombies: Int = 0

    @SerializedName("mega_magma_zombie_kills_zombies")
    val megaMagmaZombieKillsZombies: Int = 0

    @SerializedName("iron_golem_zombie_kills_zombies")
    val ironGolemZombieKillsZombies: Int = 0

    @SerializedName("mega_blob_zombie_kills_zombies")
    val megaBlobZombieKillsZombies: Int = 0

    @SerializedName("family_father_zombie_kills_zombies")
    val familyFatherZombieKillsZombies: Int = 0

    @SerializedName("family_mother_zombie_kills_zombies")
    val familyMotherZombieKillsZombies: Int = 0

    @SerializedName("wither_zombie_kills_zombies")
    val witherZombieKillsZombies: Int = 0

    @SerializedName("family_daughter_zombie_kills_zombies")
    val familyDaughterZombieKillsZombies: Int = 0

    @SerializedName("fastest_time_30_zombies_deadend_hard")
    val fastestTime30ZombiesDeadEndHard: Int = 0

    @SerializedName("fastest_time_30_zombies_badblood_rip")
    val fastestTime30ZombiesBadBloodRIP: Int = 0

    @SerializedName("fastest_time_20_zombies_badblood_rip")
    val fastestTime20ZombiesBadBloodRIP: Int = 0

    @SerializedName("wins_zombies_badblood_rip")
    val winsZombiesBadBloodRIP: Int = 0

    @SerializedName("best_round_zombies_deadend_normal")
    val bestRoundZombiesDeadEndNormal: Int = 0

    @SerializedName("total_rounds_survived_zombies_deadend_normal")
    val totalRoundsSurvivedZombiesDeadEndNormal: Int = 0

    @SerializedName("players_revived_zombies_deadend_normal")
    val playersRevivedZombiesDeadEndNormal: Int = 0

    @SerializedName("zombie_kills_zombies_deadend_normal")
    val zombieKillsZombiesDeadEndNormal: Int = 0

    @SerializedName("times_knocked_down_zombies_deadend_normal")
    val timesKnockedDownZombiesDeadEndNormal: Int = 0

    @SerializedName("deaths_zombies_deadend_normal")
    val deathsZombiesDeadEndNormal: Int = 0

    @SerializedName("doors_opened_zombies_deadend_normal")
    val doorsOpenedZombiesDeadEndNormal: Int = 0

    @SerializedName("windows_repaired_zombies_deadend_normal")
    val windowsRepairedZombiesDeadEndNormal: Int = 0

    @SerializedName("the_old_one_zombie_kills_zombies")
    val theOldOneZombieKillsZombies: Int = 0

    @SerializedName("giant_rainbow_zombie_kills_zombies")
    val giantRainbowZombieKillsZombies: Int = 0

    @SerializedName("molten_zombie_kills_zombies")
    val moltenZombieKillsZombies: Int = 0

    @SerializedName("fire_lord_zombie_kills_zombies")
    val fireLordZombieKillsZombies: Int = 0

    @SerializedName("da_bomb_zombie_kills_zombies")
    val daBombZombieKillsZombies: Int = 0

    @SerializedName("herobrine_zombie_kills_zombies")
    val herobrineZombieKillsZombies: Int = 0

    @SerializedName("seeker_wins_hide_and_seek")
    val seekerWinsHideAndSeek: Int = 0

    @SerializedName("party_pooper_seeker_wins_hide_and_seek")
    val partyPooperSeekerWinsHideAndSeek: Int = 0

    @SerializedName("sw_game_wins")
    val swGameWins: Int = 0

    @SerializedName("sw_monthly_kills_b")
    val swMonthlyKillsB: Int = 0

    @SerializedName("sw_rebel_kills")
    val swRebelKills: Int = 0

    @SerializedName("melee_weapon")
    val meleeWeapon: String = ""

    val packages: List<Any> = Collections.emptyList()

    @SerializedName("wins_grinch")
    val winsGrinch: Int = 0

    @SerializedName("wins_dayone")
    val winsDayone: Int = 0
}

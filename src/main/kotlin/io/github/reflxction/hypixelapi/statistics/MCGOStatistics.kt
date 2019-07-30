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
 * Represents all the *Cops and Crims (MC:GO)* statistics of a player.
 */
class MCGOStatistics {

    @SerializedName("body_armor_cost")
    val bodyArmorCost: Int = 0

    @SerializedName("bombs_defused")
    val bombsDefused: Int = 0

    @SerializedName("bombs_planted")
    val bombsPlanted: Int = 0

    @SerializedName("bounty_hunter")
    val bountyHunter: Int = 0

    @SerializedName("carbine_cost_reduction")
    val carbineCostReduction: Int = 0

    @SerializedName("carbine_damage_increase")
    val carbineDamageIncrease: Int = 0

    @SerializedName("carbine_recoil_reduction")
    val carbineRecoilReduction: Int = 0

    @SerializedName("carbine_reload_speed_reduction")
    val carbineReloadSpeedReduction: Int = 0

    val coins: Int = 0

    @SerializedName("cop_kills")
    val copKills: Int = 0

    @SerializedName("criminal_kills")
    val criminalKills: Int = 0

    val deaths: Int = 0

    @SerializedName("game_wins")
    val gameWins: Int = 0

    @SerializedName("headshot_kills")
    val headshotKills: Int = 0

    val kills: Int = 0

    @SerializedName("knife_attack_delay")
    val knifeAttackDelay: Int = 0

    @SerializedName("knife_damage_increase")
    val knifeDamageIncrease: Int = 0

    @SerializedName("magnum_cost_reduction")
    val magnumCostReduction: Int = 0

    @SerializedName("magnum_damage_increase")
    val magnumDamageIncrease: Int = 0

    @SerializedName("magnum_recoil_reduction")
    val magnumRecoilReduction: Int = 0

    @SerializedName("magnum_reload_speed_reduction")
    val magnumReloadSpeedReduction: Int = 0

    val packages: List<String> = Collections.emptyList()

    @SerializedName("pistol_damage_increase")
    val pistolDamageIncrease: Int = 0

    @SerializedName("pistol_recoil_reduction")
    val pistolRecoilReduction: Int = 0

    @SerializedName("pistol_reload_speed_reduction")
    val pistolReloadSpeedReduction: Int = 0

    @SerializedName("pocket_change")
    val pocketChange: Int = 0

    @SerializedName("rifle_cost_reduction")
    val rifleCostReduction: Int = 0

    @SerializedName("rifle_damage_increase")
    val rifleDamageIncrease: Int = 0

    @SerializedName("rifle_recoil_reduction")
    val rifleRecoilReduction: Int = 0

    @SerializedName("rifle_reload_speed_reduction")
    val rifleReloadSpeedReduction: Int = 0

    @SerializedName("round_wins")
    val roundWins: Int = 0

    @SerializedName("selectedCreeperChestplateDev")
    val selectedcreeperchestplatedev: String = ""

    @SerializedName("selectedCreeperHelmetDev")
    val selectedcreeperhelmetdev: String = ""

    @SerializedName("selectedOcelotChestplateDev")
    val selectedocelotchestplatedev: String = ""

    @SerializedName("selectedOcelotHelmetDev")
    val selectedocelothelmetdev: String = ""

    @SerializedName("shots_fired")
    val shotsFired: Int = 0

    @SerializedName("smg_damage_increase")
    val smgDamageIncrease: Int = 0

    @SerializedName("smg_recoil_reduction")
    val smgRecoilReduction: Int = 0

    @SerializedName("smg_reload_speed_reduction")
    val smgReloadSpeedReduction: Int = 0

    @SerializedName("sniper_cost_reduction")
    val sniperCostReduction: Int = 0

    @SerializedName("strength_training")
    val strengthTraining: Int = 0

    @SerializedName("shotgun_damage_increase")
    val shotgunDamageIncrease: Int = 0

    @SerializedName("shotgun_recoil_reduction")
    val shotgunRecoilReduction: Int = 0

    @SerializedName("smg_cost_reduction")
    val smgCostReduction: Int = 0

    @SerializedName("shotgun_cost_reduction")
    val shotgunCostReduction: Int = 0

    @SerializedName("shotgun_reload_speed_reduction")
    val shotgunReloadSpeedReduction: Int = 0

    @SerializedName("selectedCarbineDev")
    val selectedcarbinedev: String = ""

    @SerializedName("selectedRifleDev")
    val selectedrifledev: String = ""

    @SerializedName("selectedPistolDev")
    val selectedpistoldev: String = ""

    @SerializedName("selectedMagnumDev")
    val selectedmagnumdev: String = ""

    @SerializedName("selectedSmgDev")
    val selectedsmgdev: String = ""

    @SerializedName("selectedShotgunDev")
    val selectedshotgundev: String = ""

    @SerializedName("selectedKnifeDev")
    val selectedknifedev: String = ""

    @SerializedName("monthly_kills_b")
    val monthlyKillsB: Int = 0

    @SerializedName("weekly_kills_b")
    val weeklyKillsB: Int = 0

    @SerializedName("weekly_kills_a")
    val weeklyKillsA: Int = 0

    @SerializedName("monthly_kills_a")
    val monthlyKillsA: Int = 0

    val mcgo: Map<String, Any> = Collections.emptyMap()

    @SerializedName("game_wins_temple")
    val gameWinsTemple: Int = 0

    @SerializedName("game_wins_alleyway")
    val gameWinsAlleyway: Int = 0

    @SerializedName("game_wins_carrier")
    val gameWinsCarrier: Int = 0

    @SerializedName("game_wins_overgrown")
    val gameWinsOvergrown: Int = 0

    @SerializedName("game_wins_atomic")
    val gameWinsAtomic: Int = 0

    @SerializedName("game_wins_sandstorm")
    val gameWinsSandstorm: Int = 0

    @SerializedName("deaths_deathmatch")
    val deathsDeathmatch: Int = 0

    @SerializedName("game_wins_deathmatch")
    val gameWinsDeathmatch: Int = 0

    @SerializedName("cop_kills_deathmatch")
    val copKillsDeathmatch: Int = 0

    @SerializedName("kills_deathmatch")
    val killsDeathmatch: Int = 0

    @SerializedName("criminal_kills_deathmatch")
    val criminalKillsDeathmatch: Int = 0

    @SerializedName("sniper_damage_increase")
    val sniperDamageIncrease: Int = 0

    @SerializedName("sniper_charge_bonus")
    val sniperChargeBonus: Int = 0

    @SerializedName("sniper_reload_speed_reduction")
    val sniperReloadSpeedReduction: Int = 0

    @SerializedName("show_lobby_prefix")
    val showLobbyPrefix: Boolean = false

    @SerializedName("selected_lobby_prefix")
    val selectedLobbyPrefix: String = ""

    @SerializedName("game_wins_reserve")
    val gameWinsReserve: Int = 0

    @SerializedName("game_wins_melon factory")
    val gameWinsMelonFactory: Int = 0

    @SerializedName("grenade_kills")
    val grenadeKills: Int = 0

    @SerializedName("grenadeKills")
    val grenadekills: Int = 0

    @SerializedName("setting_hints")
    val settingHints: Boolean = false

    @SerializedName("setting_animated_smoke")
    val settingAnimatedSmoke: Boolean = false

    @SerializedName("setting_sounds_headshot")
    val settingSoundsHeadshot: Boolean = false
}

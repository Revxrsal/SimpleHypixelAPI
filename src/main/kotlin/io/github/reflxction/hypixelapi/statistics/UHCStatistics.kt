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
 * Represents all the *UHC* statistics of a player.
 */
class UHCStatistics {

    val coins: Int = 0

    val deaths: Int = 0

    @SerializedName("equippedKit")
    val equippedkit: String = ""

    @SerializedName("heads_eaten")
    val headsEaten: Int = 0

    val kills: Int = 0

    val packages: List<Any> = Collections.emptyList()

    @SerializedName("perk_alchemy_line_a")
    val perkAlchemyLineA: Int = 0

    @SerializedName("perk_alchemy_line_b")
    val perkAlchemyLineB: Int = 0

    @SerializedName("perk_armorsmith_line_a")
    val perkArmorsmithLineA: Int = 0

    @SerializedName("perk_armorsmith_line_b")
    val perkArmorsmithLineB: Int = 0

    @SerializedName("perk_cooking_line_a")
    val perkCookingLineA: Int = 0

    @SerializedName("perk_cooking_line_b")
    val perkCookingLineB: Int = 0

    @SerializedName("perk_enchanting_line_a")
    val perkEnchantingLineA: Int = 0

    @SerializedName("perk_enchanting_line_b")
    val perkEnchantingLineB: Int = 0

    @SerializedName("perk_engineering_line_a")
    val perkEngineeringLineA: Int = 0

    @SerializedName("perk_engineering_line_b")
    val perkEngineeringLineB: Int = 0

    @SerializedName("perk_engineering_line_c")
    val perkEngineeringLineC: Int = 0

    @SerializedName("perk_survivalism_line_a")
    val perkSurvivalismLineA: Int = 0

    @SerializedName("perk_survivalism_line_c")
    val perkSurvivalismLineC: Int = 0

    @SerializedName("perk_weaponsmith_line_a")
    val perkWeaponsmithLineA: Int = 0

    @SerializedName("perk_weaponsmith_line_b")
    val perkWeaponsmithLineB: Int = 0

    @SerializedName("perk_weaponsmith_line_c")
    val perkWeaponsmithLineC: Int = 0

    val score: Int = 0

    val wins: Int = 0

    @SerializedName("perk_cooking_line_c")
    val perkCookingLineC: Int = 0

    @SerializedName("perk_armorsmith_line_c")
    val perkArmorsmithLineC: Int = 0

    @SerializedName("perk_enchanting_line_c")
    val perkEnchantingLineC: Int = 0

    @SerializedName("perk_engineering_prestige")
    val perkEngineeringPrestige: Int = 0

    @SerializedName("kit_LOOTER")
    val kitLooter: Int = 0

    @SerializedName("perk_bloodcraft_line_a")
    val perkBloodcraftLineA: Int = 0

    @SerializedName("perk_hunter_line_a")
    val perkHunterLineA: Int = 0

    @SerializedName("perk_survivalism_line_b")
    val perkSurvivalismLineB: Int = 0

    @SerializedName("kit_ARCHERY_TOOLS")
    val kitArcheryTools: Int = 0

    @SerializedName("perk_bloodcraft_line_c")
    val perkBloodcraftLineC: Int = 0

    @SerializedName("perk_bloodcraft_line_b")
    val perkBloodcraftLineB: Int = 0

    @SerializedName("perk_alchemy_line_c")
    val perkAlchemyLineC: Int = 0

    @SerializedName("perk_hunter_line_b")
    val perkHunterLineB: Int = 0

    @SerializedName("perk_hunter_line_c")
    val perkHunterLineC: Int = 0

    @SerializedName("kit_LUNCH_BOX")
    val kitLunchBox: Int = 0

    @SerializedName("monthly_kills_b")
    val monthlyKillsB1: Int = 0

    @SerializedName("monthly_wins_b")
    val monthlyWinsB1: Int = 0

    @SerializedName("perk_cooking_prestige")
    val perkCookingPrestige: Int = 0

    @SerializedName("monthly_kills_a")
    val monthlyKillsA1: Int = 0

    @SerializedName("monthly_wins_a")
    val monthlyWinsA1: Int = 0

    @SerializedName("perk_armorsmith_prestige")
    val perkArmorsmithPrestige: Int = 0

    @SerializedName("perk_weaponsmith_prestige")
    val perkWeaponsmithPrestige: Int = 0

    @SerializedName("kills_solo")
    val killsSolo: Int = 0

    @SerializedName("monthly_kills__solo_b")
    val monthlyKillsSoloB: Int = 0

    @SerializedName("deaths_solo")
    val deathsSolo: Int = 0

    @SerializedName("heads_eaten_solo")
    val headsEatenSolo: Int = 0

    @SerializedName("monthly_kills__a")
    val monthlyKillsA: Int = 0

    @SerializedName("monthly_wins__a")
    val monthlyWinsA: Int = 0

    @SerializedName("wins_solo")
    val winsSolo: Int = 0

    @SerializedName("monthly_kills__solo_a")
    val monthlyKillsSoloA: Int = 0

    @SerializedName("monthly_wins__solo_a")
    val monthlyWinsSoloA: Int = 0

    val cache3: Boolean = false

    @SerializedName("monthly_kills__b")
    val monthlyKillsB: Int = 0

    @SerializedName("monthly_wins__solo_b")
    val monthlyWinsSoloB: Int = 0

    @SerializedName("monthly_wins__b")
    val monthlyWinsB: Int = 0

    @SerializedName("perk_enchanting_prestige")
    val perkEnchantingPrestige: Int = 0

    @SerializedName("perk_alchemy_prestige")
    val perkAlchemyPrestige: Int = 0

    @SerializedName("kit_WORKING_TOOLS")
    val kitWorkingTools: Int = 0

    @SerializedName("perk_hunter_prestige")
    val perkHunterPrestige: Int = 0

    @SerializedName("perk_bloodcraft_prestige")
    val perkBloodcraftPrestige: Int = 0

    @SerializedName("perk_survivalism_prestige")
    val perkSurvivalismPrestige: Int = 0

    @SerializedName("kit_MAGIC_TOOLS")
    val kitMagicTools: Int = 0

    @SerializedName("clearup_achievement")
    val clearupAchievement: Boolean = false

    @SerializedName("kit_ECOLOGIST")
    val kitEcologist: Int = 0

    @SerializedName("kit_LEATHER_ARMOR")
    val kitLeatherArmor: Int = 0

    @SerializedName("perk_toolsmithing_line_a")
    val perkToolsmithingLineA: Int = 0

    @SerializedName("perk_toolsmithing_line_c")
    val perkToolsmithingLineC: Int = 0

    @SerializedName("perk_toolsmithing_line_b")
    val perkToolsmithingLineB: Int = 0

    @SerializedName("perk_toolsmithing_prestige")
    val perkToolsmithingPrestige: Int = 0

    @SerializedName("kit_FARMER")
    val kitFarmer: Int = 0

    @SerializedName("kit_HORSEMAN")
    val kitHorseman: Int = 0

    @SerializedName("perk_apprentice_line_a")
    val perkApprenticeLineA: Int = 0

    @SerializedName("perk_apprentice_line_b")
    val perkApprenticeLineB: Int = 0

    @SerializedName("perk_apprentice_line_c")
    val perkApprenticeLineC: Int = 0

    @SerializedName("wins_red vs blue")
    val winsRedVsBlue: Int = 0

    @SerializedName("deaths_red vs blue")
    val deathsRedVsBlue: Int = 0

    @SerializedName("heads_eaten_red vs blue")
    val headsEatenRedVsBlue: Int = 0

    @SerializedName("kills_red vs blue")
    val killsRedVsBlue: Int = 0

    @SerializedName("saved_stats")
    val savedStats: Boolean = false

    val wins2: Int = 0

    @SerializedName("wins_solo2")
    val winsSolo2: Int = 0

    @SerializedName("kills_solo2")
    val killsSolo2: Int = 0

    val kills2: Int = 0

    @SerializedName("kills_no diamonds")
    val killsNoDiamonds: Int = 0

    @SerializedName("deaths_no diamonds")
    val deathsNoDiamonds: Int = 0

    @SerializedName("heads_eaten_no diamonds")
    val headsEatenNoDiamonds: Int = 0

    @SerializedName("perk_invention_line_a")
    val perkInventionLineA: Int = 0

    @SerializedName("perk_invention_line_b")
    val perkInventionLineB: Int = 0

    @SerializedName("perk_invention_line_c")
    val perkInventionLineC: Int = 0

    @SerializedName("perk_invention_prestige")
    val perkInventionPrestige: Int = 0

    @SerializedName("kit_TRAPPER")
    val kitTrapper: Int = 0

    @SerializedName("teammate_damage")
    val teammateDamage: Boolean = false

    @SerializedName("ultimates_crafted")
    val ultimatesCrafted: Int = 0

    @SerializedName("extra_ultimates_crafted")
    val extraUltimatesCrafted: Int = 0

    @SerializedName("ultimates_crafted_solo")
    val ultimatesCraftedSolo: Int = 0

    @SerializedName("uhc_parkour_1")
    val uhcParkour1: Boolean = false

    @SerializedName("uhc_parkour_2")
    val uhcParkour2: Boolean = false
}

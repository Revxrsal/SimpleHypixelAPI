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
 * Represents all the *TNT Games* statistics of a player.
 */
class TNTGamesStatistics {

    @SerializedName("active_death_effect")
    val activeDeathEffect: String = ""

    @SerializedName("active_particle_effect")
    val activeParticleEffect: String = ""

    @SerializedName("bloodwizard_explode")
    val bloodwizardExplode: Int = 0

    @SerializedName("bloodwizard_regen")
    val bloodwizardRegen: Int = 0

    val coins: Int = 0

    @SerializedName("deaths_bowspleef")
    val deathsBowspleef: Int = 0

    @SerializedName("deaths_capture")
    val deathsCapture: Int = 0

    @SerializedName("doublejump_tntrun")
    val doublejumpTntrun: Int = 0

    @SerializedName("firewizard_explode")
    val firewizardExplode: Int = 0

    @SerializedName("firewizard_regen")
    val firewizardRegen: Int = 0

    @SerializedName("icewizard_explode")
    val icewizardExplode: Int = 0

    @SerializedName("icewizard_regen")
    val icewizardRegen: Int = 0

    @SerializedName("kills_capture")
    val killsCapture: Int = 0

    @SerializedName("kineticwizard_explode")
    val kineticwizardExplode: Int = 0

    @SerializedName("kineticwizard_regen")
    val kineticwizardRegen: Int = 0

    val packages: List<Any> = Collections.emptyList()

    @SerializedName("selected_hat")
    val selectedHat: String = ""

    @SerializedName("spleef_doublejump")
    val spleefDoublejump: Int = 0

    @SerializedName("spleef_repulse")
    val spleefRepulse: Int = 0

    @SerializedName("spleef_triple")
    val spleefTriple: Int = 0

    @SerializedName("tags_bowspleef")
    val tagsBowspleef: Int = 0

    @SerializedName("wins_bowspleef")
    val winsBowspleef: Int = 0

    @SerializedName("wins_capture")
    val winsCapture: Int = 0

    @SerializedName("wins_tntrun")
    val winsTntrun: Int = 0

    @SerializedName("witherwizard_explode")
    val witherwizardExplode: Int = 0

    @SerializedName("witherwizard_regen")
    val witherwizardRegen: Int = 0

    @SerializedName("capture_class")
    val captureClass: String = ""

    @SerializedName("assists_capture")
    val assistsCapture: Int = 0

    @SerializedName("record_tntrun")
    val recordTntrun: Int = 0

    @SerializedName("votes_Mars")
    val votesMars: Int = 0

    @SerializedName("votes_Node")
    val votesNode: Int = 0

    @SerializedName("votes_Tallgate")
    val votesTallgate: Int = 0

    @SerializedName("votes_Twinspire")
    val votesTwinspire: Int = 0

    @SerializedName("votes_Wizards (A)")
    val votesWizardsA: Int = 0

    @SerializedName("votes_The Vale")
    val votesTheVale: Int = 0

    @SerializedName("votes_Wizards (C)")
    val votesWizardsC: Int = 0

    @SerializedName("votes_Wizards (B)")
    val votesWizardsB: Int = 0

    @SerializedName("votes_Crystalline")
    val votesCrystalline: Int = 0

    @SerializedName("votes_Totum")
    val votesTotum: Int = 0

    @SerializedName("votes_Greenbelt")
    val votesGreenbelt: Int = 0

    @SerializedName("record_pvprun")
    val recordPvprun: Int = 0

    @SerializedName("kills_pvprun")
    val killsPvprun: Int = 0

    @SerializedName("new_kineticwizard_explode")
    val newKineticwizardExplode: Int = 0

    @SerializedName("new_spleef_tripleshot")
    val newSpleefTripleshot: Int = 0

    @SerializedName("new_icewizard_regen")
    val newIcewizardRegen: Int = 0

    @SerializedName("new_tntag_speedy")
    val newTntagSpeedy: Int = 0

    @SerializedName("new_firewizard_regen")
    val newFirewizardRegen: Int = 0

    @SerializedName("new_spleef_double_jumps")
    val newSpleefDoubleJumps: Int = 0

    @SerializedName("new_icewizard_explode")
    val newIcewizardExplode: Int = 0

    @SerializedName("new_witherwizard_regen")
    val newWitherwizardRegen: Int = 0

    @SerializedName("new_witherwizard_explode")
    val newWitherwizardExplode: Int = 0

    @SerializedName("new_bloodwizard_explode")
    val newBloodwizardExplode: Int = 0

    @SerializedName("new_kineticwizard_regen")
    val newKineticwizardRegen: Int = 0

    @SerializedName("new_pvprun_double_jumps")
    val newPvprunDoubleJumps: Int = 0

    @SerializedName("new_spleef_repulsor")
    val newSpleefRepulsor: Int = 0

    @SerializedName("new_firewizard_explode")
    val newFirewizardExplode: Int = 0

    @SerializedName("new_bloodwizard_regen")
    val newBloodwizardRegen: Int = 0

    @SerializedName("new_tntrun_double_jumps")
    val newTntrunDoubleJumps: Int = 0

    @SerializedName("wizards_selected_class")
    val wizardsSelectedClass: String = ""

    @SerializedName("new_icewizard_deaths")
    val newIcewizardDeaths: Int = 0

    @SerializedName("new_icewizard_assists")
    val newIcewizardAssists: Int = 0

    @SerializedName("new_icewizard_kills")
    val newIcewizardKills: Int = 0

    val winstreak: Int = 0

    @SerializedName("run_potions_splashed_on_players")
    val runPotionsSplashedOnPlayers: Int = 0

    @SerializedName("deaths_tntrun")
    val deathsTntrun: Int = 0

    @SerializedName("tag_blastprotection")
    val tagBlastprotection: Int = 0

    @SerializedName("new_icewizard_prestige_field")
    val newIcewizardPrestigeField: String = ""

    @SerializedName("new_kineticwizard_prestige_field")
    val newKineticwizardPrestigeField: String = ""

    @SerializedName("new_bloodwizard_prestige_field")
    val newBloodwizardPrestigeField: String = ""

    @SerializedName("new_witherwizard_prestige_field")
    val newWitherwizardPrestigeField: String = ""

    @SerializedName("new_toxicwizard_regen")
    val newToxicwizardRegen: Int = 0

    @SerializedName("new_toxicwizard_explode")
    val newToxicwizardExplode: Int = 0

    @SerializedName("new_double_jump_effect")
    val newDoubleJumpEffect: String = ""

    @SerializedName("new_toxicwizard_assists")
    val newToxicwizardAssists: Int = 0

    @SerializedName("new_toxicwizard_kills")
    val newToxicwizardKills: Int = 0

    @SerializedName("new_kineticwizard_kills")
    val newKineticwizardKills: Int = 0

    @SerializedName("new_kineticwizard_assists")
    val newKineticwizardAssists: Int = 0

    @SerializedName("new_kineticwizard_deaths")
    val newKineticwizardDeaths: Int = 0

    @SerializedName("new_bloodwizard_assists")
    val newBloodwizardAssists: Int = 0

    @SerializedName("new_bloodwizard_kills")
    val newBloodwizardKills: Int = 0

    @SerializedName("new_toxicwizard_deaths")
    val newToxicwizardDeaths: Int = 0

    @SerializedName("new_bloodwizard_deaths")
    val newBloodwizardDeaths: Int = 0

    @SerializedName("deaths_pvprun")
    val deathsPvprun: Int = 0

    val wins: Int = 0

    @SerializedName("new_toxicwizard_prestige_field")
    val newToxicwizardPrestigeField: String = ""

    @SerializedName("new_icewizard_regen_legacy")
    val newIcewizardRegenLegacy: Int = 0

    @SerializedName("new_tntrun_double_jumps_legacy")
    val newTntrunDoubleJumpsLegacy: Int = 0

    @SerializedName("new_spleef_double_jumps_legacy")
    val newSpleefDoubleJumpsLegacy: Int = 0

    @SerializedName("new_witherwizard_regen_legacy")
    val newWitherwizardRegenLegacy: Int = 0

    @SerializedName("new_spleef_tripleshot_legacy")
    val newSpleefTripleshotLegacy: Int = 0

    @SerializedName("new_firewizard_regen_legacy")
    val newFirewizardRegenLegacy: Int = 0

    @SerializedName("new_toxicwizard_regen_legacy")
    val newToxicwizardRegenLegacy: Int = 0

    @SerializedName("new_firewizard_explode_legacy")
    val newFirewizardExplodeLegacy: Int = 0

    @SerializedName("new_witherwizard_explode_legacy")
    val newWitherwizardExplodeLegacy: Int = 0

    @SerializedName("new_toxicwizard_explode_legacy")
    val newToxicwizardExplodeLegacy: Int = 0

    @SerializedName("new_pvprun_double_jumps_legacy")
    val newPvprunDoubleJumpsLegacy: Int = 0

    @SerializedName("new_bloodwizard_explode_legacy")
    val newBloodwizardExplodeLegacy: Int = 0

    @SerializedName("new_kineticwizard_regen_legacy")
    val newKineticwizardRegenLegacy: Int = 0

    @SerializedName("new_bloodwizard_regen_legacy")
    val newBloodwizardRegenLegacy: Int = 0

    @SerializedName("new_kineticwizard_explode_legacy")
    val newKineticwizardExplodeLegacy: Int = 0

    @SerializedName("new_icewizard_explode_legacy")
    val newIcewizardExplodeLegacy: Int = 0

    @SerializedName("new_spleef_repulsor_legacy")
    val newSpleefRepulsorLegacy: Int = 0

    @SerializedName("kills_tntag")
    val killsTntag: Int = 0

    @SerializedName("points_capture")
    val pointsCapture: Int = 0

    @SerializedName("new_tntrun_speed_potions")
    val newTntrunSpeedPotions: Int = 0

    @SerializedName("new_selected_hat")
    val newSelectedHat: String = ""
}

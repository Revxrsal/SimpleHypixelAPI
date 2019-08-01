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
 * Represents all the *Warlords* statistics of a player.
 */
@StatisticName("Battleground")
class WarlordsStatistics {

    val assists: Int = 0

    @SerializedName("berserker_plays")
    val berserkerPlays: Int = 0

    @SerializedName("broken_inventory")
    val brokenInventory: Int = 0

    @SerializedName("chosen_class")
    val chosenClass: String = ""

    val coins: Int = 0

    val crafted: Int = 0

    @SerializedName("crafted_epic")
    val craftedEpic: Int = 0

    val damage: Int = 0

    @SerializedName("damage_berserker")
    val damageBerserker: Int = 0

    @SerializedName("damage_defender")
    val damageDefender: Int = 0

    @SerializedName("damage_prevented")
    val damagePrevented: Int = 0

    @SerializedName("damage_prevented_berserker")
    val damagePreventedBerserker: Int = 0

    @SerializedName("damage_prevented_defender")
    val damagePreventedDefender: Int = 0

    @SerializedName("damage_prevented_warrior")
    val damagePreventedWarrior: Int = 0

    @SerializedName("damage_taken")
    val damageTaken: Int = 0

    @SerializedName("damage_warrior")
    val damageWarrior: Int = 0

    val deaths: Int = 0

    @SerializedName("defender_plays")
    val defenderPlays: Int = 0

    @SerializedName("flag_conquer_self")
    val flagConquerSelf: Int = 0

    @SerializedName("flag_conquer_team")
    val flagConquerTeam: Int = 0

    val heal: Int = 0

    @SerializedName("heal_berserker")
    val healBerserker: Int = 0

    @SerializedName("heal_defender")
    val healDefender: Int = 0

    @SerializedName("heal_warrior")
    val healWarrior: Int = 0

    val hints: Boolean = false

    val kills: Int = 0

    @SerializedName("life_leeched")
    val lifeLeeched: Int = 0

    @SerializedName("life_leeched_berserker")
    val lifeLeechedBerserker: Int = 0

    @SerializedName("life_leeched_warrior")
    val lifeLeechedWarrior: Int = 0

    val losses: Int = 0

    @SerializedName("losses_berserker")
    val lossesBerserker: Int = 0

    @SerializedName("losses_defender")
    val lossesDefender: Int = 0

    @SerializedName("losses_warrior")
    val lossesWarrior: Int = 0

    @SerializedName("mage_spec")
    val mageSpec: String = ""

    @SerializedName("magic_dust")
    val magicDust: Int = 0

    val packages: List<Any> = Collections.emptyList()

    @SerializedName("paladin_spec")
    val paladinSpec: String = ""

    val repaired: Int = 0

    @SerializedName("repaired_common")
    val repairedCommon: Int = 0

    @SerializedName("repaired_epic")
    val repairedEpic: Int = 0

    @SerializedName("repaired_rare")
    val repairedRare: Int = 0

    @SerializedName("salvaged_dust_reward")
    val salvagedDustReward: Int = 0

    @SerializedName("salvaged_shards_reward")
    val salvagedShardsReward: Int = 0

    @SerializedName("salvaged_weapons")
    val salvagedWeapons: Int = 0

    @SerializedName("salvaged_weapons_common")
    val salvagedWeaponsCommon: Int = 0

    @SerializedName("salvaged_weapons_rare")
    val salvagedWeaponsRare: Int = 0

    @SerializedName("selected_mount")
    val selectedMount: String = ""

    @SerializedName("upgrade_random")
    val upgradeRandom: Int = 0

    @SerializedName("upgrade_random_epic")
    val upgradeRandomEpic: Int = 0

    @SerializedName("void_shards")
    val voidShards: Int = 0

    @SerializedName("warrior_cooldown")
    val warriorCooldown: Int = 0

    @SerializedName("warrior_critchance")
    val warriorCritchance: Int = 0

    @SerializedName("warrior_critmultiplier")
    val warriorCritmultiplier: Int = 0

    @SerializedName("warrior_energy")
    val warriorEnergy: Int = 0

    @SerializedName("warrior_health")
    val warriorHealth: Int = 0

    @SerializedName("warrior_plays")
    val warriorPlays: Int = 0

    @SerializedName("warrior_skill1")
    val warriorSkill1: Int = 0

    @SerializedName("warrior_skill2")
    val warriorSkill2: Int = 0

    @SerializedName("warrior_skill3")
    val warriorSkill3: Int = 0

    @SerializedName("warrior_skill4")
    val warriorSkill4: Int = 0

    @SerializedName("warrior_skill5")
    val warriorSkill5: Int = 0

    @SerializedName("warrior_spec")
    val warriorSpec: String = ""

    @SerializedName("weapon_inventory")
    val weaponInventory: List<Any> = Collections.emptyList()

    @SerializedName("win_streak")
    val winStreak: Int = 0

    val wins: Int = 0

    @SerializedName("wins_berserker")
    val winsBerserker: Int = 0

    @SerializedName("wins_blu")
    val winsBlu: Int = 0

    @SerializedName("wins_capturetheflag")
    val winsCapturetheflag: Int = 0

    @SerializedName("wins_capturetheflag_blu")
    val winsCapturetheflagBlu: Int = 0

    @SerializedName("wins_capturetheflag_red")
    val winsCapturetheflagRed: Int = 0

    @SerializedName("wins_defender")
    val winsDefender: Int = 0

    @SerializedName("wins_domination")
    val winsDomination: Int = 0

    @SerializedName("wins_domination_blu")
    val winsDominationBlu: Int = 0

    @SerializedName("wins_domination_red")
    val winsDominationRed: Int = 0

    @SerializedName("wins_red")
    val winsRed: Int = 0

    @SerializedName("wins_warrior")
    val winsWarrior: Int = 0

    @SerializedName("salvaged_weapons_epic")
    val salvagedWeaponsEpic: Int = 0

    @SerializedName("heal_mage")
    val healMage: Int = 0

    @SerializedName("damage_pyromancer")
    val damagePyromancer: Int = 0

    @SerializedName("damage_prevented_mage")
    val damagePreventedMage: Int = 0

    @SerializedName("heal_pyromancer")
    val healPyromancer: Int = 0

    @SerializedName("damage_prevented_pyromancer")
    val damagePreventedPyromancer: Int = 0

    @SerializedName("pyromancer_plays")
    val pyromancerPlays: Int = 0

    @SerializedName("wins_pyromancer")
    val winsPyromancer: Int = 0

    @SerializedName("wins_mage")
    val winsMage: Int = 0

    @SerializedName("damage_mage")
    val damageMage: Int = 0

    @SerializedName("mage_plays")
    val magePlays: Int = 0

    @SerializedName("upgrade_crafted")
    val upgradeCrafted: Int = 0

    @SerializedName("upgrade_crafted_epic")
    val upgradeCraftedEpic: Int = 0

    @SerializedName("reroll_epic")
    val rerollEpic: Int = 0

    val reroll: Int = 0

    @SerializedName("repaired_legendary")
    val repairedLegendary: Int = 0

    @SerializedName("salvaged_weapons_legendary")
    val salvagedWeaponsLegendary: Int = 0

    @SerializedName("crafted_legendary")
    val craftedLegendary: Int = 0

    @SerializedName("losses_mage")
    val lossesMage: Int = 0

    @SerializedName("losses_pyromancer")
    val lossesPyromancer: Int = 0

    @SerializedName("losses_avenger")
    val lossesAvenger: Int = 0

    @SerializedName("damage_avenger")
    val damageAvenger: Int = 0

    @SerializedName("avenger_plays")
    val avengerPlays: Int = 0

    @SerializedName("damage_paladin")
    val damagePaladin: Int = 0

    @SerializedName("paladin_plays")
    val paladinPlays: Int = 0

    @SerializedName("losses_paladin")
    val lossesPaladin: Int = 0

    @SerializedName("heal_paladin")
    val healPaladin: Int = 0

    @SerializedName("heal_avenger")
    val healAvenger: Int = 0

    @SerializedName("damage_prevented_paladin")
    val damagePreventedPaladin: Int = 0

    @SerializedName("damage_prevented_avenger")
    val damagePreventedAvenger: Int = 0

    @SerializedName("wins_paladin")
    val winsPaladin: Int = 0

    @SerializedName("wins_avenger")
    val winsAvenger: Int = 0

    @SerializedName("reroll_legendary")
    val rerollLegendary: Int = 0

    @SerializedName("afk_warned")
    val afkWarned: Int = 0

    val penalty: Int = 0

    @SerializedName("cryomancer_plays")
    val cryomancerPlays: Int = 0

    @SerializedName("wins_cryomancer")
    val winsCryomancer: Int = 0

    @SerializedName("heal_cryomancer")
    val healCryomancer: Int = 0

    @SerializedName("damage_prevented_cryomancer")
    val damagePreventedCryomancer: Int = 0

    @SerializedName("damage_cryomancer")
    val damageCryomancer: Int = 0

    @SerializedName("upgrade_crafted_legendary")
    val upgradeCraftedLegendary: Int = 0

    @SerializedName("damage_prevented_aquamancer")
    val damagePreventedAquamancer: Int = 0

    @SerializedName("wins_aquamancer")
    val winsAquamancer: Int = 0

    @SerializedName("damage_aquamancer")
    val damageAquamancer: Int = 0

    @SerializedName("aquamancer_plays")
    val aquamancerPlays: Int = 0

    @SerializedName("heal_aquamancer")
    val healAquamancer: Int = 0

    @SerializedName("losses_aquamancer")
    val lossesAquamancer: Int = 0

    @SerializedName("shaman_spec")
    val shamanSpec: String = ""

    @SerializedName("play_streak")
    val playStreak: Int = 0

    val hotkeymode: Boolean = false

    @SerializedName("damage_shaman")
    val damageShaman: Int = 0

    @SerializedName("damage_prevented_earthwarden")
    val damagePreventedEarthwarden: Int = 0

    @SerializedName("damage_earthwarden")
    val damageEarthwarden: Int = 0

    @SerializedName("earthwarden_plays")
    val earthwardenPlays: Int = 0

    @SerializedName("shaman_plays")
    val shamanPlays: Int = 0

    @SerializedName("damage_prevented_shaman")
    val damagePreventedShaman: Int = 0

    @SerializedName("heal_shaman")
    val healShaman: Int = 0

    @SerializedName("heal_earthwarden")
    val healEarthwarden: Int = 0

    @SerializedName("wins_shaman")
    val winsShaman: Int = 0

    @SerializedName("wins_earthwarden")
    val winsEarthwarden: Int = 0

    @SerializedName("heal_thunderlord")
    val healThunderlord: Int = 0

    @SerializedName("thunderlord_plays")
    val thunderlordPlays: Int = 0

    @SerializedName("damage_thunderlord")
    val damageThunderlord: Int = 0

    @SerializedName("losses_thunderlord")
    val lossesThunderlord: Int = 0

    @SerializedName("losses_shaman")
    val lossesShaman: Int = 0

    @SerializedName("damage_prevented_thunderlord")
    val damagePreventedThunderlord: Int = 0

    @SerializedName("wins_thunderlord")
    val winsThunderlord: Int = 0

    @SerializedName("losses_earthwarden")
    val lossesEarthwarden: Int = 0

    @SerializedName("crusader_plays")
    val crusaderPlays: Int = 0

    @SerializedName("heal_crusader")
    val healCrusader: Int = 0

    @SerializedName("wins_crusader")
    val winsCrusader: Int = 0

    @SerializedName("damage_crusader")
    val damageCrusader: Int = 0

    @SerializedName("damage_prevented_crusader")
    val damagePreventedCrusader: Int = 0

    @SerializedName("wins_teamdeathmatch")
    val winsTeamdeathmatch: Int = 0

    @SerializedName("wins_teamdeathmatch_a")
    val winsTeamdeathmatchA: Int = 0

    @SerializedName("wins_teamdeathmatch_blu")
    val winsTeamdeathmatchBlu: Int = 0

    @SerializedName("wins_teamdeathmatch_red")
    val winsTeamdeathmatchRed: Int = 0

    @SerializedName("shaman_skill1")
    val shamanSkill1: Int = 0

    @SerializedName("shaman_skill3")
    val shamanSkill3: Int = 0

    @SerializedName("shaman_skill2")
    val shamanSkill2: Int = 0

    @SerializedName("shaman_skill4")
    val shamanSkill4: Int = 0

    @SerializedName("shaman_skill5")
    val shamanSkill5: Int = 0

    @SerializedName("shaman_critmultiplier")
    val shamanCritmultiplier: Int = 0

    @SerializedName("shaman_energy")
    val shamanEnergy: Int = 0

    @SerializedName("shaman_critchance")
    val shamanCritchance: Int = 0

    @SerializedName("wins_teamdeathmatch_b")
    val winsTeamdeathmatchB: Int = 0

    @SerializedName("crafted_rare")
    val craftedRare: Int = 0

    @SerializedName("wins_protector")
    val winsProtector: Int = 0

    @SerializedName("heal_protector")
    val healProtector: Int = 0

    @SerializedName("protector_plays")
    val protectorPlays: Int = 0

    @SerializedName("damage_prevented_protector")
    val damagePreventedProtector: Int = 0

    @SerializedName("damage_protector")
    val damageProtector: Int = 0

    @SerializedName("paladin_skill5")
    val paladinSkill5: Int = 0

    @SerializedName("paladin_skill4")
    val paladinSkill4: Int = 0

    @SerializedName("paladin_skill3")
    val paladinSkill3: Int = 0

    @SerializedName("paladin_skill1")
    val paladinSkill1: Int = 0

    @SerializedName("paladin_skill2")
    val paladinSkill2: Int = 0

    @SerializedName("paladin_energy")
    val paladinEnergy: Int = 0

    @SerializedName("paladin_critmultiplier")
    val paladinCritmultiplier: Int = 0

    @SerializedName("losses_protector")
    val lossesProtector: Int = 0

    @SerializedName("paladin_health")
    val paladinHealth: Int = 0

    @SerializedName("paladin_cooldown")
    val paladinCooldown: Int = 0

    @SerializedName("paladin_critchance")
    val paladinCritchance: Int = 0

    @SerializedName("losses_crusader")
    val lossesCrusader: Int = 0

    @SerializedName("reroll_common")
    val rerollCommon: Int = 0

    @SerializedName("losses_cryomancer")
    val lossesCryomancer: Int = 0

    @SerializedName("upgrade_random_legendary")
    val upgradeRandomLegendary: Int = 0

    @SerializedName("warrior_armor_selection")
    val warriorArmorSelection: Int = 0

    @SerializedName("warrior_helmet_selection")
    val warriorHelmetSelection: Int = 0

    @SerializedName("paladin_helmet_selection")
    val paladinHelmetSelection: Int = 0

    @SerializedName("paladin_armor_selection")
    val paladinArmorSelection: Int = 0

    @SerializedName("shaman_armor_selection")
    val shamanArmorSelection: Int = 0

    @SerializedName("shaman_helmet_selection")
    val shamanHelmetSelection: Int = 0

    @SerializedName("shaman_cooldown")
    val shamanCooldown: Int = 0

    @SerializedName("mage_armor_selection")
    val mageArmorSelection: Int = 0

    @SerializedName("shaman_health")
    val shamanHealth: Int = 0

    @SerializedName("wins_capturetheflag_b")
    val winsCapturetheflagB: Int = 0

    @SerializedName("wins_domination_b")
    val winsDominationB: Int = 0

    @SerializedName("wins_capturetheflag_a")
    val winsCapturetheflagA: Int = 0

    @SerializedName("wins_domination_a")
    val winsDominationA: Int = 0

    @SerializedName("reward_inventory")
    val rewardInventory: Int = 0

    @SerializedName("mage_skill1")
    val mageSkill1: Int = 0

    @SerializedName("mage_skill3")
    val mageSkill3: Int = 0

    @SerializedName("mage_skill4")
    val mageSkill4: Int = 0

    @SerializedName("mage_skill5")
    val mageSkill5: Int = 0

    @SerializedName("mage_skill2")
    val mageSkill2: Int = 0

    @SerializedName("mage_health")
    val mageHealth: Int = 0

    @SerializedName("mage_energy")
    val mageEnergy: Int = 0

    @SerializedName("mage_cooldown")
    val mageCooldown: Int = 0

    @SerializedName("mage_critchance")
    val mageCritchance: Int = 0

    @SerializedName("mage_critmultiplier")
    val mageCritmultiplier: Int = 0

    @SerializedName("mage_helmet_selection")
    val mageHelmetSelection: Int = 0

    @SerializedName("unlock_crafted_legendary")
    val unlockCraftedLegendary: Int = 0

    @SerializedName("unlock_crafted")
    val unlockCrafted: Int = 0

    @SerializedName("unlock_playstreak")
    val unlockPlaystreak: Int = 0

    @SerializedName("unlock_playstreak_legendary")
    val unlockPlaystreakLegendary: Int = 0

    val autostrikemode: Boolean = false

    @SerializedName("kills_capturetheflag")
    val killsCapturetheflag: Int = 0

    @SerializedName("kills_teamdeathmatch")
    val killsTeamdeathmatch: Int = 0

    @SerializedName("kills_domination")
    val killsDomination: Int = 0

    @SerializedName("total_domination_score")
    val totalDominationScore: Int = 0

    @SerializedName("bound_weapon")
    val boundWeapon: Map<String, Any> = Collections.emptyMap()

    @SerializedName("flag_returns")
    val flagReturns: Int = 0

    @SerializedName("mvp_count")
    val mvpCount: Int = 0

    @SerializedName("dom_point_captures")
    val domPointCaptures: Int = 0

    @SerializedName("dom_point_defends")
    val domPointDefends: Int = 0

    val prestiged: List<Any> = Collections.emptyList()

    @SerializedName("powerups_collected")
    val powerupsCollected: Int = 0

    @SerializedName("hide_prestige")
    val hidePrestige: Boolean = false

    val energyPowerups: Boolean = false

    @SerializedName("chat_option_kill_feed")
    val chatOptionKillFeed: String = ""

    @SerializedName("chat_option_misc")
    val chatOptionMisc: String = ""

    @SerializedName("current_weapon")
    val currentWeapon: Int = 0

    @SerializedName("revenant_plays")
    val revenantPlays: Int = 0

    @SerializedName("heal_revenant")
    val healRevenant: Int = 0

    @SerializedName("damage_prevented_revenant")
    val damagePreventedRevenant: Int = 0

    @SerializedName("damage_revenant")
    val damageRevenant: Int = 0

    @SerializedName("losses_revenant")
    val lossesRevenant: Int = 0

    @SerializedName("damage_prevented_spiritguard")
    val damagePreventedSpiritguard: Int = 0

    @SerializedName("damage_spiritguard")
    val damageSpiritguard: Int = 0

    @SerializedName("heal_spiritguard")
    val healSpiritguard: Int = 0

    @SerializedName("wins_spiritguard")
    val winsSpiritguard: Int = 0

    @SerializedName("damage_delayed")
    val damageDelayed: Int = 0

    @SerializedName("spiritguard_plays")
    val spiritguardPlays: Int = 0

    @SerializedName("damage_delayed_shaman")
    val damageDelayedShaman: Int = 0

    @SerializedName("damage_delayed_spiritguard")
    val damageDelayedSpiritguard: Int = 0

    @SerializedName("wins_revenant")
    val winsRevenant: Int = 0

    val privategames: Map<String, Any> = Collections.emptyMap()

    @SerializedName("upgrade_playstreak_legendary")
    val upgradePlaystreakLegendary: Int = 0

    @SerializedName("upgrade_playstreak")
    val upgradePlaystreak: Int = 0

    @SerializedName("losses_spiritguard")
    val lossesSpiritguard: Int = 0

    @SerializedName("chat_option_damage")
    val chatOptionDamage: String = ""
}

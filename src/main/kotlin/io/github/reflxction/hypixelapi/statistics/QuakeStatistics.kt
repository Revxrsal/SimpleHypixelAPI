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
 * Represents all the *Quake* statistics of a player.
 */
class QuakeStatistics {

    val barrel: String = ""

    val case: String = ""

    val coins: Int = 0

    val deaths: Int = 0

    val kills: Int = 0

    val killsound: String = ""

    val killstreaks: Int = 0

    val muzzle: String = ""

    @SerializedName("null")
    val _null: String = ""

    val packages: List<Any> = Collections.emptyList()

    val sight: String = ""

    val trigger: String = ""

    val wins: Int = 0

    @SerializedName("wins_teams")
    val winsTeams: Int = 0

    @SerializedName("kills_teams")
    val killsTeams: Int = 0

    @SerializedName("deaths_teams")
    val deathsTeams: Int = 0

    @SerializedName("killstreaks_teams")
    val killStreaksTeams: Int = 0

    @SerializedName("instantRespawn")
    val instantRespawn: Boolean = false

    @SerializedName("monthly_kills_b")
    val monthlyKillsB: Int = 0

    @SerializedName("weekly_kills_b")
    val weeklyKillsB: Int = 0

    @SerializedName("weekly_kills_a")
    val weeklykillsA: Int = 0

    @SerializedName("monthly_kills_a")
    val monthlyKillsA: Int = 0

    @SerializedName("dash_cooldown")
    val dashCooldown: String = ""

    @SerializedName("dash_power")
    val dashPower: String = ""

    @SerializedName("showKillPrefix")
    val showKillPrefix: Boolean = false

    @SerializedName("compass_selected")
    val compassSelected: Boolean = false

    @SerializedName("enable_sound")
    val enableSound: Boolean = false

    @SerializedName("highest_killstreak")
    val highestKillStreak: Int = 0

    val headshots: Int = 0

    @SerializedName("distance_travelled")
    val distanceTravelled: Int = 0

    @SerializedName("shots_fired")
    val shotsFired: Int = 0

    @SerializedName("kills_since_update_feb_2017")
    val killsSinceUpdateFeb2017: Int = 0

    @SerializedName("distance_travelled_teams")
    val distanceTravelledTeams: Int = 0

    @SerializedName("kills_since_update_feb_2017_teams")
    val killsSinceUpdateFeb2017Teams: Int = 0

    @SerializedName("shots_fired_teams")
    val shotsFiredTeams: Int = 0

    @SerializedName("showDashCooldown")
    val showDashCooldown: Boolean = false

    @SerializedName("headshots_teams")
    val headshotsTeams: Int = 0

    @SerializedName("kills_timeattack")
    val killsTimeAttack: Int = 0

    @SerializedName("kills_dm_teams")
    val killsDmTeams: Int = 0

    @SerializedName("kills_dm")
    val killsDm: Int = 0

    @SerializedName("votes_Martian")
    val votesMartian: Int = 0

    @SerializedName("votes_null")
    val votesNull: Int = 0

    @SerializedName("votes_Apex")
    val votesApex: Int = 0

    @SerializedName("alternative_gun_cooldown_indicator")
    val alternativeGunCooldownIndicator: Boolean = false

    @SerializedName("votes_Mines")
    val votesMines: Int = 0

    @SerializedName("votes_Lost World")
    val votesLostWorld: Int = 0

    @SerializedName("votes_Sero")
    val votesSero: Int = 0

    @SerializedName("votes_DigSite")
    val votesDigsite: Int = 0

    @SerializedName("votes_Forgotten")
    val votesForgotten: Int = 0

    @SerializedName("votes_Fryst")
    val votesFryst: Int = 0

    @SerializedName("votes_Town")
    val votesTown: Int = 0

    @SerializedName("votes_DigSite2")
    val votesDigsite2: Int = 0

    @SerializedName("votes_Demonic")
    val votesDemonic: Int = 0

    @SerializedName("votes_Faarah")
    val votesFaarah: Int = 0

    @SerializedName("votes_Cold_War")
    val votesColdwar: Int = 0

    @SerializedName("votes_Apex II")
    val votesApexii: Int = 0

    @SerializedName("votes_Library")
    val votesLibrary: Int = 0

    @SerializedName("votes_Karunesh")
    val votesKarunesh: Int = 0

    @SerializedName("votes_Ancient")
    val votesAncient: Int = 0

    @SerializedName("votes_Sunken")
    val votesSunken: Int = 0

    @SerializedName("messageOthers' Kills/deaths")
    val messageOthersKillsDeaths: Boolean = false

    @SerializedName("messageYour Deaths")
    val messageyourdeaths: Boolean = false

    @SerializedName("messageCoin Messages")
    val messagecoinmessages: Boolean = false

    @SerializedName("messageYour Kills")
    val messageyourkills: Boolean = false

    @SerializedName("messageKillstreaks")
    val messagekillstreaks: Boolean = false

    @SerializedName("messagePowerup Collections")
    val messagepowerupcollections: Boolean = false

    @SerializedName("messageMulti-kills")
    val messageMultiKills: Boolean = false

    val beam: String = ""

    @SerializedName("votes_WoodStone")
    val votesWoodStone: Int = 0

    @SerializedName("selectedKillPrefix")
    val selectedKillPrefix: String = ""

    val hat: String = ""
}

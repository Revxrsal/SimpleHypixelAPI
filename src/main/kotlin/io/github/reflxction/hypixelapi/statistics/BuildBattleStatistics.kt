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
 * Represents all the *Build Battle* statistics of a player.
 */
class BuildBattleStatistics {

    @SerializedName("wins_teams_normal")
    val winsTeamsNormal: Int = 0

    @SerializedName("wins_solo_normal")
    val winsSoloNormal: Int = 0

    val wins: Int = 0

    val packages: List<String> = Collections.emptyList()

    @SerializedName("games_played")
    val gamesPlayed: Int = 0

    val score: Int = 0

    val coins: Int = 0

    @SerializedName("monthly_coins_a")
    val monthlyCoinsA: Int = 0

    @SerializedName("weekly_coins_b")
    val weeklyCoinsB: Int = 0

    @SerializedName("correct_guesses")
    val correctGuesses: Int = 0

    @SerializedName("buildbattle_loadout")
    val buildbattleLoadout: List<String> = Collections.emptyList()

    @SerializedName("votes_Igloo")
    val votesIgloo: Int = 0

    @SerializedName("total_votes")
    val totalVotes: Int = 0

    @SerializedName("votes_Clock")
    val votesClock: Int = 0

    @SerializedName("wins_solo_pro")
    val winsSoloPro: Int = 0

    @SerializedName("votes_Mushroom")
    val votesMushroom: Int = 0

    @SerializedName("votes_Toys")
    val votesToys: Int = 0

    @SerializedName("last_purchased_song")
    val lastPurchasedSong: String = ""

    @SerializedName("super_votes")
    val superVotes: Int = 0

    @SerializedName("wins_guess_the_build")
    val winsGuessTheBuild: Int = 0

    @SerializedName("votes_Christmas tree")
    val votesChristmasTree: Int = 0

    @SerializedName("votes_Candy Cane")
    val votesCandyCane: Int = 0

    @SerializedName("votes_Santa")
    val votesSanta: Int = 0

    @SerializedName("votes_Lighthouse")
    val votesLighthouse: Int = 0

    @SerializedName("votes_Sandcastle")
    val votesSandcastle: Int = 0

    @SerializedName("votes_Pool")
    val votesPool: Int = 0

    @SerializedName("votes_Turtle")
    val votesTurtle: Int = 0

    @SerializedName("votes_Pyramid")
    val votesPyramid: Int = 0

    @SerializedName("votes_Banana")
    val votesBanana: Int = 0

    @SerializedName("votes_Pineapple")
    val votesPineapple: Int = 0

    @SerializedName("votes_Waterfall")
    val votesWaterfall: Int = 0

    @SerializedName("votes_Snowman")
    val votesSnowman: Int = 0

    @SerializedName("votes_Medieval")
    val votesMedieval: Int = 0

    @SerializedName("votes_Aquarium")
    val votesAquarium: Int = 0

    @SerializedName("votes_Harbor")
    val votesHarbor: Int = 0

    @SerializedName("votes_Arcade")
    val votesArcade: Int = 0

    @SerializedName("votes_Starry Night")
    val votesStarryNight: Int = 0

    @SerializedName("votes_Tower")
    val votesTower: Int = 0

    @SerializedName("votes_Gingerbread")
    val votesGingerbread: Int = 0

    @SerializedName("votes_Fantasy")
    val votesFantasy: Int = 0

    @SerializedName("votes_Farm")
    val votesFarm: Int = 0

    @SerializedName("votes_Island")
    val votesIsland: Int = 0

    @SerializedName("votes_Park")
    val votesPark: Int = 0

    @SerializedName("votes_Train")
    val votesTrain: Int = 0

    @SerializedName("votes_Cake")
    val votesCake: Int = 0

    @SerializedName("votes_Library")
    val votesLibrary: Int = 0

    @SerializedName("votes_Balloon")
    val votesBalloon: Int = 0

    @SerializedName("votes_Laboratory")
    val votesLaboratory: Int = 0

    @SerializedName("votes_Monument")
    val votesMonument: Int = 0

    @SerializedName("votes_Stick")
    val votesStick: Int = 0

    @SerializedName("votes_Cup")
    val votesCup: Int = 0

    @SerializedName("votes_Fireplace")
    val votesFireplace: Int = 0

    @SerializedName("votes_Football")
    val votesFootball: Int = 0

    @SerializedName("weekly_coins_a")
    val weeklyCoinsA: Int = 0

    @SerializedName("votes_Fishing Rod")
    val votesFishingRod: Int = 0

    @SerializedName("votes_Snowflake")
    val votesSnowflake: Int = 0

    @SerializedName("votes_Computer")
    val votesComputer: Int = 0

    @SerializedName("votes_Top hat")
    val votesTopHat: Int = 0

    @SerializedName("votes_Windmill")
    val votesWindmill: Int = 0

    @SerializedName("votes_Elf")
    val votesElf: Int = 0

    @SerializedName("teams_most_points")
    val teamsMostPoints: Int = 0

    @SerializedName("monthly_coins_b")
    val monthlyCoinsB: Int = 0

    val music: Boolean = false

    @SerializedName("votes_Rainbow")
    val votesRainbow: Int = 0

    @SerializedName("wins_halloween")
    val winsHalloween: Int = 0

    @SerializedName("votes_Flower")
    val votesFlower: Int = 0

    @SerializedName("new_victory_dance")
    val newVictoryDance: String = ""

    @SerializedName("votes_Money")
    val votesMoney: Int = 0

    @SerializedName("votes_Wizard")
    val votesWizard: Int = 0

    @SerializedName("votes_Foot")
    val votesFoot: Int = 0

    @SerializedName("votes_Maze")
    val votesMaze: Int = 0

    @SerializedName("votes_Ring")
    val votesRing: Int = 0

    @SerializedName("selected_backdrop")
    val selectedBackdrop: String = ""

    @SerializedName("new_selected_hat")
    val newSelectedHat: String = ""

    @SerializedName("new_suit")
    val newSuit: String = ""

    @SerializedName("active_movement_trail")
    val activeMovementTrail: String = ""
}

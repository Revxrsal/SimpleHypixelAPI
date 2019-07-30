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
package io.github.reflxction.hypixelapi.player;

import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.statistics.*;

import java.lang.reflect.Type;

/**
 * Contains all the game statistics for the player
 */
public interface GameStatistics {

    /**
     * Returns the value associated with the specified key. This method can be used to access values dynamically
     *
     * @param gameType Type of the game to fetch statistic from
     * @param key      Key of the value
     * @param type     Type of the value (for automatic deserializing). See {@link com.google.gson.reflect.TypeToken}
     * @param <T>      Object reference
     * @return The specified object associated with the key
     */
    <T> T get(GameType gameType, String key, Type type);

    /**
     * Returns the <i>Quake</i> statistics for the player
     *
     * @return The Quake statistics
     */
    QuakeStatistics getQuakeStatistics();

    /**
     * Returns the <i>Walls</i> statistics for the player
     *
     * @return The Walls statistics
     */
    WallsStatistics getWallsStatistics();

    /**
     * Returns the <i>Paintball</i> statistics for the player
     *
     * @return The Paintball statistics
     */
    PaintballStatistics getPaintballStatistics();

    /**
     * Returns the <i>Blitz Survival Games</i> statistics for the player
     *
     * @return The Blitz Survival Games statistics
     */
    BlitzStatistics getBlitzStatistics();


    /**
     * Returns the <i>TNT Games</i> statistics for the player
     *
     * @return The TNT Games statistics
     */
    TNTGamesStatistics getTNTGamesStatistics();

    /**
     * Returns the <i>VampireZ</i> statistics for the player
     *
     * @return The VampireZ statistics
     */
    VampireZStatistics getVampireZStatistics();

    /**
     * Returns the <i>Mega Walls</i> statistics for the player
     *
     * @return The Mega Walls statistics
     */
    MegaWallsStatistics getMegaWallsStatistics();

    /**
     * Returns the <i>Arcade</i> statistics for the player
     *
     * @return The Arcade statistics
     */
    ArcadeStatistics getArcadeStatistics();

    /**
     * Returns the <i>Cops and Crims</i> statistics for the player
     *
     * @return The Cops and Crims statistics
     */
    MCGOStatistics getCopsAndCrimsStatistics();

    /**
     * Returns the <i>UHC</i> statistics for the player
     *
     * @return The UHC statistics
     */
    UHCStatistics getUHCStatistics();

    /**
     * Returns the <i>Warlords</i> statistics for the player
     *
     * @return The Warlords statistics
     */
    WarlordsStatistics getWarlordsStatistics();

    /**
     * Returns the <i>Super Smash Heroes</i> statistics for the player
     *
     * @return The Super Smash Heroes statistics
     */
    SuperSmashStatistics getSuperSmashStatistics();

    /**
     * Returns the <i>Turbo Kart Racers</i> statistics for the player
     *
     * @return The Turbo Kart Racers statistics
     */
    TKRStatistics getTurboKartRacersStatistics();

    /**
     * Returns the <i>SkyWars</i> statistics for the player
     *
     * @return The SkyWars statistics
     */
    SkywarsStatistics getSkywarsStatistics();

    /**
     * Returns the <i>Crazy Walls</i> statistics for the player
     *
     * @return The Crazy Walls statistics
     */
    CrazyWallsStatistics getCrazyWallsStatistics();

    /**
     * Returns the <i>Speed UHC</i> statistics for the player
     *
     * @return The Speed UHC statistics
     */
    SpeedUHCStatistics getSpeedUHCStatistics();

    /*
     **
     * Returns the <i>Arena Brawl</i> statistics for the player
     *
     * @return The Classic Games statistics
     */
    ArenaStatistics getArenaBrawlStatistics();

    /**
     * Returns the <i>Bedwars</i> statistics for the player
     *
     * @return The Bedwars statistics
     */
    BedwarsStatistics getBedwarsStatistics();

    /**
     * Returns the <i>Murder Mystery</i> statistics for the player
     *
     * @return The Murder Mystery statistics
     */
    MurderMysteryStatistics getMurderMysteryStatistics();

    /**
     * Returns the <i>Build Battle</i> statistics for the player
     *
     * @return The Build Battle statistics
     */
    BuildBattleStatistics getBuildBattleStatistics();

    /**
     * Returns the <i>Duels</i> statistics for the player
     *
     * @return The Duels statistics
     */
    DuelsStatistics getDuelsStatistics();

}

/*
 * * Copyright 2019 github.com/ReflxctionDev
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
package io.github.reflxction.hypixelapi.core.implementation.player;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.player.GameStatistics;
import io.github.reflxction.hypixelapi.statistics.*;

import java.lang.reflect.Type;

import static io.github.reflxction.hypixelapi.core.adapters.GsonProfiles.MAIN;

/**
 * Class implementation for {@link GameStatistics}
 */
public class GameStatisticsImpl implements GameStatistics {

    protected JsonObject parent;

    @SerializedName("SkyWars")
    private SkywarsStatistics skywars;

    @SerializedName("SuperSmash")
    private SuperSmashStatistics superSmash;

    @SerializedName("Arcade")
    private ArcadeStatistics arcade;

    @SerializedName("GingerBread")
    private TKRStatistics tkr;

    @SerializedName("UHC")
    private UHCStatistics uhc;

    @SerializedName("Walls3")
    private MegaWallsStatistics megaWalls;

    @SerializedName("TrueCombat")
    private CrazyWallsStatistics crazyWalls;

    @SerializedName("TNTGames")
    private TNTGamesStatistics tntGames;

    @SerializedName("VampireZ")
    private VampireZStatistics vampireZ;

    @SerializedName("SpeedUHC")
    private SpeedUHCStatistics speedUHC;

    @SerializedName("HungerGames")
    private BlitzStatistics blitz;

    @SerializedName("Battleground")
    private WarlordsStatistics warlords;

    @SerializedName("Quake")
    private QuakeStatistics quake;

    @SerializedName("MCGO")
    private MCGOStatistics copsAndCrims;

    @SerializedName("Paintball")
    private PaintballStatistics paintball;

    @SerializedName("Walls")
    private WallsStatistics walls;

    @SerializedName("Arena")
    private ArenaStatistics arenaBrawl;

    @SerializedName("Bedwars")
    private BedwarsStatistics bedwars;

    @SerializedName("MurderMystery")
    private MurderMysteryStatistics murderMystery;

    @SerializedName("Duels")
    private DuelsStatistics duels;

    @SerializedName("BuildBattle")
    private BuildBattleStatistics buildBattle;

    /**
     * Returns the value associated with the specified key. This method can be used to access values dynamically
     *
     * @param gameType Type of the game to fetch statistic from
     * @param key      Key of the value
     * @param type     Type of the value (for automatic deserializing). See {@link TypeToken}
     * @return The specified object associated with the key
     */
    @Override
    public <T> T get(GameType gameType, String key, Type type) {
        return MAIN.fromJson(parent.get(gameType.getDbName()).getAsJsonObject().get(key), type);
    }

    /**
     * Returns the <i>Quake</i> statistics for the player
     *
     * @return The Quake statistics
     */
    @Override
    public QuakeStatistics getQuakeStatistics() {
        return quake;
    }

    /**
     * Returns the <i>Walls</i> statistics for the player
     *
     * @return The Walls statistics
     */
    @Override
    public WallsStatistics getWallsStatistics() {
        return walls;
    }

    /**
     * Returns the <i>Paintball</i> statistics for the player
     *
     * @return The Paintball statistics
     */
    @Override
    public PaintballStatistics getPaintballStatistics() {
        return paintball;
    }

    /**
     * Returns the <i>Blitz Survival Games</i> statistics for the player
     *
     * @return The Blitz Survival Games statistics
     */
    @Override
    public BlitzStatistics getBlitzStatistics() {
        return blitz;
    }

    /**
     * Returns the <i>TNT Games</i> statistics for the player
     *
     * @return The TNT Games statistics
     */
    @Override
    public TNTGamesStatistics getTNTGamesStatistics() {
        return tntGames;
    }

    /**
     * Returns the <i>VampireZ</i> statistics for the player
     *
     * @return The VampireZ statistics
     */
    @Override
    public VampireZStatistics getVampireZStatistics() {
        return vampireZ;
    }

    /**
     * Returns the <i>Mega Walls</i> statistics for the player
     *
     * @return The Mega Walls statistics
     */
    @Override
    public MegaWallsStatistics getMegaWallsStatistics() {
        return megaWalls;
    }

    /**
     * Returns the <i>Arcade</i> statistics for the player
     *
     * @return The Arcade statistics
     */
    @Override
    public ArcadeStatistics getArcadeStatistics() {
        return arcade;
    }

    /**
     * Returns the <i>Cops and Crims</i> statistics for the player
     *
     * @return The Cops and Crims statistics
     */
    @Override
    public MCGOStatistics getCopsAndCrimsStatistics() {
        return copsAndCrims;
    }

    /**
     * Returns the <i>UHC</i> statistics for the player
     *
     * @return The UHC statistics
     */
    @Override
    public UHCStatistics getUHCStatistics() {
        return uhc;
    }

    /**
     * Returns the <i>Warlords</i> statistics for the player
     *
     * @return The Warlords statistics
     */
    @Override
    public WarlordsStatistics getWarlordsStatistics() {
        return warlords;
    }

    /**
     * Returns the <i>Super Smash Heroes</i> statistics for the player
     *
     * @return The Super Smash Heroes statistics
     */
    @Override
    public SuperSmashStatistics getSuperSmashStatistics() {
        return superSmash;
    }

    /**
     * Returns the <i>Turbo Kart Racers</i> statistics for the player
     *
     * @return The Turbo Kart Racers statistics
     */
    @Override
    public TKRStatistics getTurboKartRacersStatistics() {
        return tkr;
    }

    /**
     * Returns the <i>SkyWars</i> statistics for the player
     *
     * @return The SkyWars statistics
     */
    @Override
    public SkywarsStatistics getSkywarsStatistics() {
        return skywars;
    }

    /**
     * Returns the <i>Crazy Walls</i> statistics for the player
     *
     * @return The Crazy Walls statistics
     */
    @Override
    public CrazyWallsStatistics getCrazyWallsStatistics() {
        return crazyWalls;
    }

    /**
     * Returns the <i>Speed UHC</i> statistics for the player
     *
     * @return The Speed UHC statistics
     */
    @Override
    public SpeedUHCStatistics getSpeedUHCStatistics() {
        return speedUHC;
    }

    /**
     * Returns the <i>Classic Games</i> statistics for the player
     *
     * @return The Classic Games statistics
     */
    @Override
    public ArenaStatistics getArenaBrawlStatistics() {
        return arenaBrawl;
    }

    /**
     * Returns the <i>Bedwars</i> statistics for the player
     *
     * @return The Bedwars statistics
     */
    @Override
    public BedwarsStatistics getBedwarsStatistics() {
        return bedwars;
    }

    /**
     * Returns the <i>Murder Mystery</i> statistics for the player
     *
     * @return The Murder Mystery statistics
     */
    @Override
    public MurderMysteryStatistics getMurderMysteryStatistics() {
        return murderMystery;
    }

    /**
     * Returns the <i>Build Battle</i> statistics for the player
     *
     * @return The Build Battle statistics
     */
    @Override
    public BuildBattleStatistics getBuildBattleStatistics() {
        return buildBattle;
    }

    /**
     * Returns the <i>Duels</i> statistics for the player
     *
     * @return The Duels statistics
     */
    @Override
    public DuelsStatistics getDuelsStatistics() {
        return duels;
    }

    /**
     * Sets the parent {@link JsonObject} to allow convenient calls to {@link #get(GameType, String, Type)}
     *
     * @param parent Parent JSON object to set
     * @return This object
     */
    public GameStatistics withParent(JsonObject parent) {
        this.parent = parent;
        return this;
    }

}

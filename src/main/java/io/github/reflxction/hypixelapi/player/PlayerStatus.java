/*
 * * Copyright 2019-2020 github.com/ReflxctionDev
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
import org.jetbrains.annotations.Nullable;

/**
 * Represents the response returned in the {@code status} endpoint
 */
public interface PlayerStatus {

    /**
     * Returns whether is the player currently online or not
     *
     * @return Whether is the player online or not
     */
    boolean isOnline();

    /**
     * Returns the game type the player is in right now.
     * <p>
     * If the player is in the main lobby, {@link GameType#MAIN_LOBBY} is returned.
     * <p>
     * If {@link #isOnline()} is {@code false}, this will return {@code null}.
     *
     * @return The game type the player is in right now
     */
    @Nullable
    GameType getGameType();

    /**
     * Returns the mode of the game they are playing. For example, {@code "solo_insane"} would be
     * returned if they are playing Skywars Solo Insane.
     * <p>
     * If the player is in lobby, {@code "LOBBY"} is returned
     * <p>
     * If {@link #isOnline()} is {@code false}, this will return {@code null}.
     *
     * @return The game mode
     */
    @Nullable
    String getMode();

    /**
     * Returns the map they are playing. This method will return {@code null} if they are not
     * playing in a minigame (lobby), or are in SkyBlock for example.
     *
     * @return The map.
     */
    @Nullable
    String getMap();

}

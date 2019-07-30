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
package io.github.reflxction.hypixelapi.core.implementation.game;

import io.github.reflxction.hypixelapi.game.FinishedParkour;

import java.util.Date;

/**
 * Class implementation for {@link FinishedParkour}
 */
public class FinishedParkourImpl implements FinishedParkour {

    private Date timeStart;

    private long timeTook;

    /**
     * Returns the time the player started this parkour
     *
     * @return The time the player started this parkour
     */
    @Override
    public Date getStartingTime() {
        return timeStart;
    }

    /**
     * Returns the time this parkour took to be finished, in milliseconds.
     *
     * @return The time this parkour took to be finished
     */
    @Override
    public long getTimeTook() {
        return timeTook;
    }
}

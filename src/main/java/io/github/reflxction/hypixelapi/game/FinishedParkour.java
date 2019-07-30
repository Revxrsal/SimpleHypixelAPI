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
package io.github.reflxction.hypixelapi.game;

import java.util.Date;

/**
 * Represents a parkour which was finished
 */
public interface FinishedParkour {

    /**
     * Returns the time the player started this parkour
     *
     * @return The time the player started this parkour
     */
    Date getStartingTime();

    /**
     * Returns the time this parkour took to be finished, in milliseconds.
     *
     * @return The time this parkour took to be finished
     */
    long getTimeTook();

}

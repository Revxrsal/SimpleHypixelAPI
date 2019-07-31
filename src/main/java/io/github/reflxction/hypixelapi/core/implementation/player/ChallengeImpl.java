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
package io.github.reflxction.hypixelapi.core.implementation.player;

import io.github.reflxction.hypixelapi.player.Challenge;

import java.util.Map;

/**
 * Class implementation for {@link Challenge}
 */
public class ChallengeImpl implements Challenge {

    private Map<String, Integer> finished;

    /**
     * Returns a map of finished challenges
     *
     * @return A map of finished challenges
     */
    @Override
    public Map<String, Integer> getFinished() {
        return finished;
    }

    @Override
    public String toString() {
        return "ChallengeImpl{" +
                "finished=" + finished +
                '}';
    }
}

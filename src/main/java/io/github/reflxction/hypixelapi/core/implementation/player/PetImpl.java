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

import io.github.reflxction.hypixelapi.player.Pet;

/**
 * Class implementation for {@link Pet}
 */
public class PetImpl implements Pet {

    private String name;

    /**
     * Returns the name of the pet
     *
     * @return The name of the pet
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PetImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}

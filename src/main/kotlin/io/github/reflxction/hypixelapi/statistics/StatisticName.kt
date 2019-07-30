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

/**
 * An annotation to indicate that a ~~statistic class name~~ is different than what is named in the Hypixel API.
 *
 * For example, it will indicate that the game **Gingerbread** is **Turbo Kart Racers**. This is to clear up
 * confusion due to ambiguous naming in the Hypixel API.
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class StatisticName(

        /**
         * Represents the raw Hypixel API name in which the class is related to
         *
         * @return The Hypixel API name
         */
        val value: String

)

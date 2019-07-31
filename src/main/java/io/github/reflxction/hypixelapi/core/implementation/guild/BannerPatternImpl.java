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
package io.github.reflxction.hypixelapi.core.implementation.guild;

import com.google.gson.annotations.SerializedName;
import io.github.reflxction.hypixelapi.guild.BannerPattern;

/**
 * Class implementation for {@link BannerPattern}
 */
public class BannerPatternImpl implements BannerPattern {

    @SerializedName("Pattern")
    private String pattern;

    @SerializedName("Color")
    private String color;

    /**
     * Returns the pattern of the banner
     *
     * @return Pattern of the banner
     */
    @Override
    public String getPattern() {
        return pattern;
    }

    /**
     * Returns the banner's color
     *
     * @return The banner's color
     */
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "BannerPatternImpl{" +
                "pattern='" + pattern + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

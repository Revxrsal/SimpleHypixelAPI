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
import io.github.reflxction.hypixelapi.guild.GuildBanner;

import java.util.List;

/**
 * Class implementation for {@link GuildBanner}
 */
public class GuildBannerImpl implements GuildBanner {

    @SerializedName("Base")
    private String base;

    @SerializedName("Patterns")
    private List<BannerPattern> patterns;

    /**
     * Returns the base of the banner
     *
     * @return The banner base
     */
    @Override
    public String getBase() {
        return base;
    }

    /**
     * Returns the banner patterns
     *
     * @return The banner patterns
     */
    @Override
    public List<BannerPattern> getPatterns() {
        return patterns;
    }

    @Override
    public String toString() {
        return "GuildBannerImpl{" +
                "base='" + base + '\'' +
                ", patterns=" + patterns +
                '}';
    }
}

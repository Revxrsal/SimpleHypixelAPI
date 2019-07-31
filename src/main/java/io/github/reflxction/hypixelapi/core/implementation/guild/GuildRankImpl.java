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
import io.github.reflxction.hypixelapi.guild.GuildRank;

import java.util.Date;

/**
 * Class implementation for {@link GuildRank}
 */
public class GuildRankImpl implements GuildRank {

    private String name;

    @SerializedName("default")
    private boolean default_;

    private String tag;

    private Date created;

    private int priority;

    /**
     * Returns the name of the rank
     *
     * @return The name of the rank
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Whether is the rank default or not (members get it automatically)
     *
     * @return Whether is the rank default or not
     */
    @Override
    public boolean isDefault() {
        return default_;
    }

    /**
     * Returns the tag of the rank
     *
     * @return The tag of the rank
     */
    @Override
    public String getTag() {
        return tag;
    }

    /**
     * Returns the creation date of this rank
     *
     * @return The creation date of this rank
     */
    @Override
    public Date getCreationDate() {
        return created;
    }

    /**
     * Returns the priority of the rank (in /guild list and /guild online).
     *
     * @return The rank priority
     */
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "GuildRankImpl{" +
                "name='" + name + '\'' +
                ", default_=" + default_ +
                ", tag='" + tag + '\'' +
                ", created=" + created +
                ", priority=" + priority +
                '}';
    }
}

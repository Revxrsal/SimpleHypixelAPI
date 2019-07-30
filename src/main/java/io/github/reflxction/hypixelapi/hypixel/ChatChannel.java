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
package io.github.reflxction.hypixelapi.hypixel;

import com.google.gson.annotations.SerializedName;

/**
 * Contains the last channel the player had set
 */
public enum ChatChannel {

    /**
     * Represents the public chat
     */
    ALL,

    /**
     * Represents the Guild chat
     */
    GUILD,

    /**
     * Represents the Party chat
     */
    PARTY,

    /**
     * Represents the chat when you open a private message with someone
     */
    @SerializedName("PM")
    PRIVATE_MESSAGE

}

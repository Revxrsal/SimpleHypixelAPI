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

import com.google.gson.annotations.SerializedName;
import io.github.reflxction.hypixelapi.player.Friend;

import java.util.Date;
import java.util.UUID;

/**
 * Class implementation for {@link Friend}
 */
public class FriendImpl implements Friend {

    @SerializedName("_id")
    private String id;

    @SerializedName("uuidSender")
    private UUID sender;

    @SerializedName("uuidReceiver")
    private UUID receiver;

    @SerializedName("started")
    private Date startedDate;

    /**
     * Returns the ID of the friendship
     *
     * @return The friendship ID
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Returns the UUID of the request sender
     *
     * @return The UUID of the request sender
     */
    @Override
    public UUID getSender() {
        return sender;
    }

    /**
     * Returns the UUID of the request receiver
     *
     * @return The UUID of the request receiver
     */
    @Override
    public UUID getReceiver() {
        return receiver;
    }

    /**
     * Returns the date that this friendship started at
     *
     * @return The date that this friendship started at
     */
    @Override
    public Date getStartedDate() {
        return startedDate;
    }
}

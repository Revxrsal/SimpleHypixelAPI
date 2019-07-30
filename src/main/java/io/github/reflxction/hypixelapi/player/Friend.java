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
package io.github.reflxction.hypixelapi.player;

import java.util.Date;
import java.util.UUID;

/**
 * Represents a friend
 */
public interface Friend {

    /**
     * Returns the ID of the friendship
     *
     * @return The friendship ID
     */
    String getId();

    /**
     * Returns the UUID of the request sender
     *
     * @return The UUID of the request sender
     */
    UUID getSender();

    /**
     * Returns the UUID of the request receiver
     *
     * @return The UUID of the request receiver
     */
    UUID getReceiver();

    /**
     * Returns the date that this friendship started at
     *
     * @return The date that this friendship started at
     */
    Date getStartedDate();

}

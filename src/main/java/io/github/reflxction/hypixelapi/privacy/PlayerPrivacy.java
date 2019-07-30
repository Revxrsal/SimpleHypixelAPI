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
package io.github.reflxction.hypixelapi.privacy;

/**
 * Contains the privacy settings for the player
 */
public interface PlayerPrivacy {

    /**
     * Whether does the player allow people to send friend requests or not
     *
     * @return Whether does the player allow people to send friend requests or not
     */
    boolean allowFriendRequests();

    /**
     * Returns the privacy setting for getting a guild invite
     *
     * @return The privacy setting for getting a guild invite
     */
    PrivacyLevel getGuildInvitePrivacy();

    /**
     * Returns the privacy setting for getting a party invite
     *
     * @return The privacy setting for getting a party invite
     */
    PrivacyLevel getPartyInvitePrivacy();

    /**
     * Returns the privacy setting for receiving private messages
     *
     * @return The privacy setting for receiving private messages
     */
    PrivacyLevel getPrivateMessagePrivacy();

    /**
     * Returns the privacy setting for receiving friend requests
     *
     * @return The privacy setting for receiving friend requests
     */
    PrivacyLevel getFriendRequestPrivacy();

    /**
     * Whether is the guild chat visible for the player or not
     *
     * @return Whether is the guild chat visible for the player or not
     */
    boolean getGuildChatVisibility();

    /**
     * Returns the player visibility (???)
     * @return The player visibility
     */
    boolean getPlayerVisibility();

}

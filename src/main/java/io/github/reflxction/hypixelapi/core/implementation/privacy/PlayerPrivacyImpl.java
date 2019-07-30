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
package io.github.reflxction.hypixelapi.core.implementation.privacy;

import io.github.reflxction.hypixelapi.privacy.PlayerPrivacy;
import io.github.reflxction.hypixelapi.privacy.PrivacyLevel;

/**
 * Class implementation for {@link PlayerPrivacy}
 */
public class PlayerPrivacyImpl implements PlayerPrivacy {

    private boolean allowFriendRequests;

    private PrivacyLevel guildInvitePrivacy;

    private PrivacyLevel partyInvitePrivacy;

    private PrivacyLevel privateMessagePrivacy;

    private PrivacyLevel friendRequestPrivacy;

    private boolean guildChatVisibility;

    private boolean playerVisibility;

    /**
     * Whether does the player allow people to send friend requests or not
     *
     * @return Whether does the player allow people to send friend requests or not
     */
    @Override
    public boolean allowFriendRequests() {
        return allowFriendRequests;
    }

    /**
     * Returns the privacy setting for getting a guild invite
     *
     * @return The privacy setting for getting a guild invite
     */
    @Override
    public PrivacyLevel getGuildInvitePrivacy() {
        return guildInvitePrivacy;
    }

    /**
     * Returns the privacy setting for getting a party invite
     *
     * @return The privacy setting for getting a party invite
     */
    @Override
    public PrivacyLevel getPartyInvitePrivacy() {
        return partyInvitePrivacy;
    }

    /**
     * Returns the privacy setting for receiving private messages
     *
     * @return The privacy setting for receiving private messages
     */
    @Override
    public PrivacyLevel getPrivateMessagePrivacy() {
        return privateMessagePrivacy;
    }

    /**
     * Returns the privacy setting for receiving friend requests
     *
     * @return The privacy setting for receiving friend requests
     */
    @Override
    public PrivacyLevel getFriendRequestPrivacy() {
        return friendRequestPrivacy;
    }

    /**
     * Whether is the guild chat visible for the player or not
     *
     * @return Whether is the guild chat visible for the player or not
     */
    @Override
    public boolean getGuildChatVisibility() {
        return guildChatVisibility;
    }

    /**
     * Returns the player visibility (???)
     *
     * @return The player visibility
     */
    @Override
    public boolean getPlayerVisibility() {
        return playerVisibility;
    }
}

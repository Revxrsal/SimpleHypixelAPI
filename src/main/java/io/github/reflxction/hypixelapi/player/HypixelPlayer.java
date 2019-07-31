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

import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.core.utils.PetType;
import io.github.reflxction.hypixelapi.hypixel.AchievementTotem;
import io.github.reflxction.hypixelapi.hypixel.ChatChannel;
import io.github.reflxction.hypixelapi.hypixel.GiftingMeta;
import io.github.reflxction.hypixelapi.hypixel.HousingMeta;
import io.github.reflxction.hypixelapi.privacy.PlayerPrivacy;
import io.github.reflxction.hypixelapi.game.FinishedParkour;
import io.github.reflxction.hypixelapi.game.Tournament;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Represents a Hypixel player. Contains all the exposed data about the player method in the API.
 */
public interface HypixelPlayer {

    /**
     * Returns the Hypixel ID for the player
     *
     * @return The ID for the player
     */
    String getId();

    /**
     * Returns the player's UUID
     *
     * @return The player UUID
     */
    UUID getUUID();

    /**
     * Returns the player name. This is <i>lowercase</i>! For actual case, use {@link HypixelPlayer#getDisplayName()}
     *
     * @return The player's name in lowercase.
     * @see #getDisplayName()
     */
    String getName();

    /**
     * Returns the player's regular display name. This is the case-formatted name.
     *
     * @return The player's display name
     * @see #getName()
     */
    String getDisplayName();

    /**
     * Returns the first login for the player
     *
     * @return The player's first login
     */
    Date getFirstLogin();

    /**
     * Returns the last login for the player
     *
     * @return The player's last login
     */
    Date getLastLogin();

    /**
     * Returns the name history for the player
     *
     * @return The player's name history
     * @see #getNameHistoryLower()
     */
    List<String> getNameHistory();

    /**
     * Returns the name history for the player in <i>lowercase</i>.
     *
     * @return The player's name history in lowercase.
     */
    List<String> getNameHistoryLower();

    /**
     * Returns the one time achievements completed by the player, e.g "general_youtuber" which is
     * when you meet a YouTuber in a lobby
     *
     * @return The 1 time achievements
     */
    List<String> getAchievementsOneTime();

    /**
     * Returns all the game statistics for this player
     *
     * @return The player's game statistics
     */
    GameStatistics getStatistics();

    /**
     * Returns all the achievements the player has completed so far.
     *
     * @return The completed achievements
     */
    Map<String, Integer> getAchievements();

    /**
     * Returns the global Hypixel network experience.
     *
     * @return The Hypixel network experience
     */
    long getNetworkExp();

    /**
     * ???
     *
     * @return ???
     */
    Date getFlashingSalePopup();

    /**
     * ???
     *
     * @return ???
     */
    int getFlashingSalePoppedUp();

    /**
     * ???
     *
     * @return ???
     */
    int getFlashingSaleOpens();

    /**
     * Returns the last version that the player used to log in to the network. For example, "1.8.9".
     *
     * @return The last version the player connected with
     */
    String getLastVersionPlayed();

    //boolean hasFoundVladToBeHere();

    /**
     * Whether the player has linked their game account with their forum account or not
     *
     * @return Whether the player linked their game account with their forum account or not.
     */
    boolean hasWebsiteSet();

    /**
     * Returns the total karma the player has gained.
     *
     * @return The total karma the player has gained.
     */
    long getKarma();

    /**
     * Returns a list of UUIDs of the pending friend requests for the player (People who sent this player a request).
     *
     * @return A list of UUIDs of people who sent this player a request which has not been accepted yet.
     */
    List<UUID> getFriendRequests();

    /**
     * Returns the pet consumables
     *
     * @return The pet consumables
     */
    Map<String, Integer> getPetConsumables();

    /**
     * Returns the vanity meta for the player
     *
     * @return The vanity meta
     */
    VanityMeta getVanityMeta();

    /**
     * ???
     *
     * @return ???
     */
    Date getLastAdSenseGenerateTime();

    /**
     * Returns the gifting mete for the player
     *
     * @return The gifting meta
     */
    GiftingMeta getGiftingMeta();

    /**
     * Returns the fortune buff
     *
     * @return The fortune buff
     */
    int getFortuneBuff();

    /**
     * Returns the housing meta for the player
     *
     * @return The housing meta
     */
    HousingMeta getHousingMeta();

    /**
     * Returns the last time the player has claimed a reward
     *
     * @return The last time the player has claimed a reward.
     */
    Date getLastClaimedReward();

    /**
     * Returns the total rewards the player has claimed
     *
     * @return The total rewards that were claimed by the player
     */
    int getTotalRewards();

    /**
     * Returns the total daily rewards claimed by the player.
     *
     * @return The total daily rewards claimed by the player.
     */
    int getTotalDailyRewards();

    /**
     * Returns the current streak of claiming the daily rewards
     *
     * @return The current daily streak of claiming daily rewards.
     */
    int getRewardStreak();

    /**
     * ???
     *
     * @return ???
     */
    int getRewardScore();

    /**
     * Returns the highest streak of claiming daily rewards
     *
     * @return The highest streak of claiming daily rewards.
     */
    int getRewardHighScore();

    /**
     * Returns the privacy settings for the player
     *
     * @return The privacy settings
     */
    PlayerPrivacy getPrivacySettings();

    /**
     * Returns the chat channel the player was talking in
     *
     * @return The chat channel
     */
    ChatChannel getChannel();

    /**
     * Returns the total Grinch gifts found by the player
     *
     * @return The Grinch gifts found by the player
     */
    int getGrinchGiftsFound();

    /**
     * Whether the player started Santa's Quest or not
     *
     * @return Whether the player started Santa's Quest or not
     */
    boolean hasStartedSantaQuest();

    /**
     * Whether is the player online or not
     *
     * @return Whether is the player online or not
     */
    boolean isOnline();

    /**
     * Whether to show the tip holograms or not (???)
     *
     * @return Whether to show the tip holograms or not
     */
    boolean showTipHolograms();

    /**
     * Whether is the action bar activated for the TNT Tag game
     *
     * @return Whether the action bar is activated for the TNT Tag game
     */
    boolean showTntTagActionBarInfo();

    /**
     * Whether is the action bar activated for the TNT Wizards game
     *
     * @return Whether the action bar is activated for the TNT Wizards game
     */
    boolean showTntWizardsActionBarInfo();

    /**
     * Whether to show cooldown in TNT wizards or not
     *
     * @return Whether to show cooldown in TNT wizards or not
     */
    boolean showWizardsCooldownNotifications();

    /**
     * Whether is the action bar activated for the TNT Run game
     *
     * @return Whether the action bar is activated for the TNT Run game
     */
    boolean showTntRunActionBarInfo();

    /**
     * Returns a map of all the finished parkours. The string is the lobby name, e.g "Prototype", and the list
     * is all the times the player has finished that parkour, which contains the starting time and the time
     * took to finish the parkour (ms).
     *
     * @return The finished parkours
     */
    Map<String, List<FinishedParkour>> getParkourCompletions();

    /**
     * Returns the last time the quick join feature was used (/play commands)
     *
     * @return The last time the quick join feature was used
     */
    Date getQuickJoinTimestamp();

    /**
     * Returns the total times quick join was used
     *
     * @return The total times quick join was used
     */
    int getTotalQuickJoinUses();

    /**
     * Returns the voting of the player
     *
     * @return Player's voting
     */
    PlayerVoting getVoting();

    /**
     * Returns the last time the player logged out
     *
     * @return The last time the player logged out
     */
    Date getLastLogout();

    /**
     * Returns the player's new package rank.
     *
     * @return The player's new package rank
     */
    PlayerRank getNewPackageRank();

    /**
     * Returns the time the player upgraded their rank to VIP
     *
     * @return The time the player upgraded their rank to VIP
     */
    Date getVipUpgradeTime();

    /**
     * Returns the time the player upgraded their rank to VIP+
     *
     * @return The time the player upgraded their rank to VIP+
     */
    Date getVipPlusUpgradeTime();

    /**
     * Returns the pet statistics of the player
     *
     * @return The pet statistics
     */
    Map<PetType, Pet> getPetStatistics();

    /**
     * Returns a map of the quests the player has finished in total, where the key is the quest name and the value
     * is the quest object.
     *
     * @return The quests the player has completed
     */
    Map<String, HypixelQuest> getQuests();

    /**
     * Returns the social media set for the player
     *
     * @return The player's social media
     */
    SocialMedia getSocialMedia();

    /**
     * Returns the type of the current pet
     *
     * @return The type of the current pet
     */
    PetType getCurrentPet();

    /**
     * Returns the network update book version (???). For example, "v0.75"
     *
     * @return The network update book version.
     */
    String getNetworkUpdateBook();

    /**
     * ???
     *
     * @return ???
     */
    Map<String, Date> getAchievementRewardsNew();

    /**
     * ???
     *
     * @return ???
     */
    List<String> getAchievementsTracking();

    /**
     * Returns a map of all the finished challenges, String parameter being the challenge name, and the {@link Challenge}
     * is the challenge data
     *
     * @return A map of all the finished challenges
     */
    Map<String, Challenge> getChallenges();

    /**
     * Returns a map of all the checkpoints. The string parameter is the lobby name, e.g "Duels", and the Map of {@link String} and
     * {@link Integer} represents the checkpoint number and its time, e.g "0" has time 8514 in milliseconds.
     *
     * @return A map of checkpoints
     */
    Map<String, Map<String, Integer>> getParkourCheckpoints();

    /**
     * Returns the name of the current cloak selected for the player
     *
     * @return The name of the currently selected cloak.
     */
    String getCurrentCloak();

    /**
     * ???
     *
     * @return ???
     */
    Map<String, Date> getUpdateBookDelays();

    /**
     * ???
     *
     * @return ???
     */
    Map<String, String> getUpdateBooks();

    /**
     * Returns the total achievement points the player has gathered
     *
     * @return The total achievement points the player has gathered
     */
    long getAchievementPoints();

    /**
     * Returns the achievement totem for the player
     *
     * @return The player's achievement totem
     */
    AchievementTotem getAchievementTotem();

    /**
     * Returns the tournament data exposed in the API, such as the first lobby join, total earned tributes, etc.
     *
     * @return The tournament data
     */
    Tournament getTournament();

    /**
     * Returns when was the last Hytale advertisement the player received
     *
     * @return The date of the last Hytale advertisement
     */
    Date getLastHytaleId();

    /**
     * Returns the most recent game type the player played
     *
     * @return The most recent game type the player played
     */
    GameType getMostRecentGameType();

}

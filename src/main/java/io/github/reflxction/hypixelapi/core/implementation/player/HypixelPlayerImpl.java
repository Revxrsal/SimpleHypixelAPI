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
import io.github.reflxction.hypixelapi.core.implementation.game.TournamentImpl;
import io.github.reflxction.hypixelapi.core.implementation.hypixel.AchievementTotemImpl;
import io.github.reflxction.hypixelapi.core.implementation.hypixel.GiftingMetaImpl;
import io.github.reflxction.hypixelapi.core.implementation.hypixel.HousingMetaImpl;
import io.github.reflxction.hypixelapi.core.implementation.privacy.PlayerPrivacyImpl;
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.core.utils.PetType;
import io.github.reflxction.hypixelapi.game.FinishedParkour;
import io.github.reflxction.hypixelapi.game.Tournament;
import io.github.reflxction.hypixelapi.hypixel.AchievementTotem;
import io.github.reflxction.hypixelapi.hypixel.ChatChannel;
import io.github.reflxction.hypixelapi.hypixel.GiftingMeta;
import io.github.reflxction.hypixelapi.hypixel.HousingMeta;
import io.github.reflxction.hypixelapi.player.*;
import io.github.reflxction.hypixelapi.privacy.PlayerPrivacy;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Class implementation for {@link HypixelPlayer}
 */
public class HypixelPlayerImpl implements HypixelPlayer {

    @SerializedName("_id")
    private String id;

    @SerializedName("displayname")
    private String displayName;

    @SerializedName("playername")
    private String playerName;

    private UUID uuid;

    private Date firstLogin;

    private Date lastLogin;

    private List<String> knownAliases;
    private List<String> knownAliasesLower;

    private List<String> achievementsOneTime, achievementsTracking;

    @SerializedName("stats")
    private GameStatistics statistics;

    private Map<String, Integer> achievements;

    private long networkExp;

    private Date flashingSalePopup;
    private int flashingSalePoppedUp, flashingSaleOpens;

    @SerializedName("mcVersionRp")
    private String lastMinecraftVersion;

    private boolean websiteSet;

    private long karma;

    private List<UUID> friendRequestsUuid;

    private Map<String, Integer> petConsumables;

    private VanityMetaImpl vanityMeta;

    private Date lastAdsenseGenerateTime;

    private GiftingMetaImpl giftingMeta;

    private int fortuneBuff;

    private HousingMetaImpl housingMeta;

    private Date lastClaimedReward;

    private int totalRewards, totalDailyRewards;

    private int rewardStreak, rewardScore, rewardHighScore;

    private PlayerPrivacyImpl settings;

    private ChatChannel channel;

    @SerializedName("gifts_grinch")
    private int grinchGifts;

    @SerializedName("SANTA_QUEST_STARTED")
    private boolean santaQuestStarted;

    private boolean show_tip_holograms, show_tnttag_actionbar_info, show_wizards_actionbar_info, show_wizards_cooldown_notifications, show_tntrun_actionbar_info;

    private Map<String, List<FinishedParkour>> parkourCompletions;

    @SerializedName("quickjoin_timestamp")
    private Date quickJoinTimestamp;

    @SerializedName("quickjoin_uses")
    private int quickJoinUses;

    private PlayerVotingImpl voting;

    private Date lastLogout;

    private PlayerRank newPackageRank;

    @SerializedName("levelUp_VIP")
    private Date vipUpgrade;

    @SerializedName("levelUp_VIP_PLUS")
    private Date vipPlusUpgrade;

    private Map<PetType, Pet> petStats;

    private Map<String, HypixelQuest> quests;

    private SocialMediaImpl socialMedia;

    private PetType currentPet;

    @SerializedName("network_update_book")
    private String networkBookUpdate;

    private Map<String, Date> achievementsRewardNew;

    private Map<String, Challenge> challenges;

    private Map<String, Map<String, Integer>> parkourCheckpointBests;

    private String currentCloak;

    @SerializedName("update_book_delays")
    private Map<String, Date> updateBookDelays;

    @SerializedName("update_books")
    private Map<String, String> updateBooks;

    private int achievementPoints;

    private AchievementTotemImpl achievementTotem;

    private TournamentImpl tourney;

    private Date lastHytaleAd;

    private GameType mostRecentGameType;

    /**
     * Returns the Hypixel ID for the player
     *
     * @return The ID for the player
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Returns the player's UUID
     *
     * @return The player UUID
     */
    @Override
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Returns the player name. This is <i>lowercase</i>! For actual case, use {@link HypixelPlayer#getDisplayName()}
     *
     * @return The player's name in lowercase.
     * @see #getDisplayName()
     */
    @Override
    public String getName() {
        return playerName;
    }

    /**
     * Returns the player's regular display name. This is the case-formatted name.
     *
     * @return The player's display name
     * @see #getName()
     */
    @Override
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Returns the first login for the player
     *
     * @return The player's first login
     */
    @Override
    public Date getFirstLogin() {
        return firstLogin;
    }

    /**
     * Returns the last login for the player
     *
     * @return The player's last login
     */
    @Override
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * Returns the name history for the player
     *
     * @return The player's name history
     * @see #getNameHistoryLower()
     */
    @Override
    public List<String> getNameHistory() {
        return knownAliases;
    }

    /**
     * Returns the name history for the player in <i>lowercase</i>.
     *
     * @return The player's name history in lowercase.
     */
    @Override
    public List<String> getNameHistoryLower() {
        return knownAliasesLower;
    }

    /**
     * Returns the one time achievements completed by the player, e.g "general_youtuber" which is
     * when you meet a YouTuber in a lobby
     *
     * @return The 1 time achievements
     */
    @Override
    public List<String> getAchievementsOneTime() {
        return achievementsOneTime;
    }

    /**
     * Returns all the game statistics for this player
     *
     * @return The player's game statistics
     */
    @Override
    public GameStatistics getStatistics() {
        return statistics;
    }

    /**
     * Returns all the achievements the player has completed so far.
     *
     * @return The completed achievements
     */
    @Override
    public Map<String, Integer> getAchievements() {
        return achievements;
    }

    /**
     * Returns the global Hypixel network experience.
     *
     * @return The Hypixel network experience
     */
    @Override
    public long getNetworkExp() {
        return networkExp;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public Date getFlashingSalePopup() {
        return flashingSalePopup;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public int getFlashingSalePoppedUp() {
        return flashingSalePoppedUp;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public int getFlashingSaleOpens() {
        return flashingSaleOpens;
    }

    /**
     * Returns the last version that the player used to log in to the network. For example, "1.8.9".
     *
     * @return The last version the player connected with
     */
    @Override
    public String getLastVersionPlayed() {
        return lastMinecraftVersion;
    }

    /**
     * Whether the player has linked their game account with their forum account or not
     *
     * @return Whether the player linked their game account with their forum account or not.
     */
    @Override
    public boolean hasWebsiteSet() {
        return websiteSet;
    }

    /**
     * Returns the total karma the player has gained.
     *
     * @return The total karma the player has gained.
     */
    @Override
    public long getKarma() {
        return karma;
    }

    /**
     * Returns a list of UUIDs of the pending friend requests for the player (People who sent this player a request).
     *
     * @return A list of UUIDs of people who sent this player a request which has not been accepted yet.
     */
    @Override
    public List<UUID> getFriendRequests() {
        return friendRequestsUuid;
    }

    /**
     * Returns the pet consumables
     *
     * @return The pet consumables
     */
    @Override
    public Map<String, Integer> getPetConsumables() {
        return petConsumables;
    }

    /**
     * Returns the vanity meta for the player
     *
     * @return The vanity meta
     */
    @Override
    public VanityMeta getVanityMeta() {
        return vanityMeta;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public Date getLastAdSenseGenerateTime() {
        return lastAdsenseGenerateTime;
    }

    /**
     * Returns the gifting mete for the player
     *
     * @return The gifting meta
     */
    @Override
    public GiftingMeta getGiftingMeta() {
        return giftingMeta;
    }

    /**
     * Returns the fortune buff
     *
     * @return The fortune buff
     */
    @Override
    public int getFortuneBuff() {
        return fortuneBuff;
    }

    /**
     * Returns the housing meta for the player
     *
     * @return The housing meta
     */
    @Override
    public HousingMeta getHousingMeta() {
        return housingMeta;
    }

    /**
     * Returns the last time the player has claimed a reward
     *
     * @return The last time the player has claimed a reward.
     */
    @Override
    public Date getLastClaimedReward() {
        return lastClaimedReward;
    }

    /**
     * Returns the total rewards the player has claimed
     *
     * @return The total rewards that were claimed by the player
     */
    @Override
    public int getTotalRewards() {
        return totalRewards;
    }

    /**
     * Returns the total daily rewards claimed by the player.
     *
     * @return The total daily rewards claimed by the player.
     */
    @Override
    public int getTotalDailyRewards() {
        return totalDailyRewards;
    }

    /**
     * Returns the current streak of claiming the daily rewards
     *
     * @return The current daily streak of claiming daily rewards.
     */
    @Override
    public int getRewardStreak() {
        return rewardStreak;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public int getRewardScore() {
        return rewardScore;
    }

    /**
     * Returns the highest streak of claiming daily rewards
     *
     * @return The highest streak of claiming daily rewards.
     */
    @Override
    public int getRewardHighScore() {
        return rewardHighScore;
    }

    /**
     * Returns the privacy settings for the player
     *
     * @return The privacy settings
     */
    @Override
    public PlayerPrivacy getPrivacySettings() {
        return settings;
    }

    /**
     * Returns the chat channel the player was talking in
     *
     * @return The chat channel
     */
    @Override
    public ChatChannel getChannel() {
        return channel;
    }

    /**
     * Returns the total Grinch gifts found by the player
     *
     * @return The Grinch gifts found by the player
     */
    @Override
    public int getGrinchGiftsFound() {
        return grinchGifts;
    }

    /**
     * Whether the player started Santa's Quest or not
     *
     * @return Whether the player started Santa's Quest or not
     */
    @Override
    public boolean hasStartedSantaQuest() {
        return santaQuestStarted;
    }

    /**
     * Whether is the player online or not
     *
     * @return Whether is the player online or not
     */
    @Override
    public boolean isOnline() {
        return lastLogout.before(lastLogin);
    }

    /**
     * Whether to show the tip holograms or not (???)
     *
     * @return Whether to show the tip holograms or not
     */
    @Override
    public boolean showTipHolograms() {
        return show_tip_holograms;
    }

    /**
     * Whether is the action bar activated for the TNT Tag game
     *
     * @return Whether the action bar is activated for the TNT Tag game
     */
    @Override
    public boolean showTntTagActionBarInfo() {
        return show_tnttag_actionbar_info;
    }

    /**
     * Whether is the action bar activated for the TNT Wizards game
     *
     * @return Whether the action bar is activated for the TNT Wizards game
     */
    @Override
    public boolean showTntWizardsActionBarInfo() {
        return show_wizards_actionbar_info;
    }

    /**
     * Whether to show cooldown in TNT wizards or not
     *
     * @return Whether to show cooldown in TNT wizards or not
     */
    @Override
    public boolean showWizardsCooldownNotifications() {
        return show_wizards_cooldown_notifications;
    }

    /**
     * Whether is the action bar activated for the TNT Run game
     *
     * @return Whether the action bar is activated for the TNT Run game
     */
    @Override
    public boolean showTntRunActionBarInfo() {
        return show_tntrun_actionbar_info;
    }

    /**
     * Returns a map of all the finished parkours. The string is the lobby name, e.g "Prototype", and the list
     * is all the times the player has finished that parkour, which contains the starting time and the time
     * took to finish the parkour (ms).
     *
     * @return The finished parkours
     */
    @Override
    public Map<String, List<FinishedParkour>> getParkourCompletions() {
        return parkourCompletions;
    }

    /**
     * Returns the last time the quick join feature was used (/play commands)
     *
     * @return The last time the quick join feature was used
     */
    @Override
    public Date getQuickJoinTimestamp() {
        return quickJoinTimestamp;
    }

    /**
     * Returns the total times quick join was used
     *
     * @return The total times quick join was used
     */
    @Override
    public int getTotalQuickJoinUses() {
        return quickJoinUses;
    }

    /**
     * Returns the voting of the player
     *
     * @return Player's voting
     */
    @Override
    public PlayerVoting getVoting() {
        return voting;
    }

    /**
     * Returns the last time the player logged out
     *
     * @return The last time the player logged out
     */
    @Override
    public Date getLastLogout() {
        return lastLogout;
    }

    /**
     * Returns the player's new package rank.
     *
     * @return The player's new package rank
     */
    @Override
    public PlayerRank getNewPackageRank() {
        return newPackageRank;
    }

    /**
     * Returns the time the player upgraded their rank to VIP
     *
     * @return The time the player upgraded their rank to VIP
     */
    @Override
    public Date getVipUpgradeTime() {
        return vipUpgrade;
    }

    /**
     * Returns the time the player upgraded their rank to VIP+
     *
     * @return The time the player upgraded their rank to VIP+
     */
    @Override
    public Date getVipPlusUpgradeTime() {
        return vipPlusUpgrade;
    }

    /**
     * Returns the pet statistics of the player
     *
     * @return The pet statistics
     */
    @Override
    public Map<PetType, Pet> getPetStatistics() {
        return petStats;
    }

    /**
     * Returns a map of the quests the player has finished in total, where the key is the quest name and the value
     * is the quest object.
     *
     * @return The quests the player has completed
     */
    @Override
    public Map<String, HypixelQuest> getQuests() {
        return quests;
    }

    /**
     * Returns the social media set for the player
     *
     * @return The player's social media
     */
    @Override
    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    /**
     * Returns the type of the current pet
     *
     * @return The type of the current pet
     */
    @Override
    public PetType getCurrentPet() {
        return currentPet;
    }

    /**
     * Returns the network update book version (???). For example, "v0.75"
     *
     * @return The network update book version.
     */
    @Override
    public String getNetworkUpdateBook() {
        return networkBookUpdate;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public Map<String, Date> getAchievementRewardsNew() {
        return achievementsRewardNew;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public List<String> getAchievementsTracking() {
        return achievementsTracking;
    }

    /**
     * Returns a map of all the finished challenges, String parameter being the challenge name, and the {@link Challenge}
     * is the challenge data
     *
     * @return A map of all the finished challenges
     */
    @Override
    public Map<String, Challenge> getChallenges() {
        return challenges;
    }

    /**
     * Returns a map of all the checkpoints. The string parameter is the lobby name, e.g "Duels", and the Map of {@link String} and
     * {@link Integer} represents the checkpoint number and its time, e.g "0" has time 8514 in milliseconds.
     *
     * @return A map of checkpoints
     */
    @Override
    public Map<String, Map<String, Integer>> getParkourCheckpoints() {
        return parkourCheckpointBests;
    }

    /**
     * Returns the name of the current cloak selected for the player
     *
     * @return The name of the currently selected cloak.
     */
    @Override
    public String getCurrentCloak() {
        return currentCloak;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public Map<String, Date> getUpdateBookDelays() {
        return updateBookDelays;
    }

    /**
     * ???
     *
     * @return ???
     */
    @Override
    public Map<String, String> getUpdateBooks() {
        return updateBooks;
    }

    /**
     * Returns the total achievement points the player has gathered
     *
     * @return The total achievement points the player has gathered
     */
    @Override
    public long getAchievementPoints() {
        return achievementPoints;
    }

    /**
     * Returns the achievement totem for the player
     *
     * @return The player's achievement totem
     */
    @Override
    public AchievementTotem getAchievementTotem() {
        return achievementTotem;
    }

    /**
     * Returns the tournament data exposed in the API, such as the first lobby join, total earned tributes, etc.
     *
     * @return The tournament data
     */
    @Override
    public Tournament getTournament() {
        return tourney;
    }

    /**
     * Returns when was the last Hytale advertisement the player received
     *
     * @return The date of the last Hytale advertisement
     */
    @Override
    public Date getLastHytaleId() {
        return lastHytaleAd;
    }

    /**
     * Returns the most recent game type the player played
     *
     * @return The most recent game type the player played
     */
    @Override
    public GameType getMostRecentGameType() {
        return mostRecentGameType;
    }

    @Override
    public String toString() {
        return "HypixelPlayerImpl{" +
                "id='" + id + '\'' +
                ", displayName='" + displayName + '\'' +
                ", playerName='" + playerName + '\'' +
                ", uuid=" + uuid +
                ", firstLogin=" + firstLogin +
                ", lastLogin=" + lastLogin +
                ", knownAliases=" + knownAliases +
                ", knownAliasesLower=" + knownAliasesLower +
                ", achievementsOneTime=" + achievementsOneTime +
                ", achievementsTracking=" + achievementsTracking +
                ", achievements=" + achievements +
                ", networkExp=" + networkExp +
                ", flashingSalePopup=" + flashingSalePopup +
                ", flashingSalePoppedUp=" + flashingSalePoppedUp +
                ", flashingSaleOpens=" + flashingSaleOpens +
                ", lastMinecraftVersion='" + lastMinecraftVersion + '\'' +
                ", websiteSet=" + websiteSet +
                ", karma=" + karma +
                ", friendRequestsUuid=" + friendRequestsUuid +
                ", petConsumables=" + petConsumables +
                ", vanityMeta=" + vanityMeta +
                ", lastAdsenseGenerateTime=" + lastAdsenseGenerateTime +
                ", giftingMeta=" + giftingMeta +
                ", fortuneBuff=" + fortuneBuff +
                ", housingMeta=" + housingMeta +
                ", lastClaimedReward=" + lastClaimedReward +
                ", totalRewards=" + totalRewards +
                ", totalDailyRewards=" + totalDailyRewards +
                ", rewardStreak=" + rewardStreak +
                ", rewardScore=" + rewardScore +
                ", rewardHighScore=" + rewardHighScore +
                ", settings=" + settings +
                ", channel=" + channel +
                ", grinchGifts=" + grinchGifts +
                ", santaQuestStarted=" + santaQuestStarted +
                ", show_tip_holograms=" + show_tip_holograms +
                ", show_tnttag_actionbar_info=" + show_tnttag_actionbar_info +
                ", show_wizards_actionbar_info=" + show_wizards_actionbar_info +
                ", show_wizards_cooldown_notifications=" + show_wizards_cooldown_notifications +
                ", show_tntrun_actionbar_info=" + show_tntrun_actionbar_info +
                ", parkourCompletions=" + parkourCompletions +
                ", quickJoinTimestamp=" + quickJoinTimestamp +
                ", quickJoinUses=" + quickJoinUses +
                ", voting=" + voting +
                ", lastLogout=" + lastLogout +
                ", newPackageRank=" + newPackageRank +
                ", vipUpgrade=" + vipUpgrade +
                ", vipPlusUpgrade=" + vipPlusUpgrade +
                ", petStats=" + petStats +
                ", quests=" + quests +
                ", socialMedia=" + socialMedia +
                ", currentPet=" + currentPet +
                ", networkBookUpdate='" + networkBookUpdate + '\'' +
                ", achievementsRewardNew=" + achievementsRewardNew +
                ", challenges=" + challenges +
                ", parkourCheckpointBests=" + parkourCheckpointBests +
                ", currentCloak='" + currentCloak + '\'' +
                ", updateBookDelays=" + updateBookDelays +
                ", updateBooks=" + updateBooks +
                ", achievementPoints=" + achievementPoints +
                ", achievementTotem=" + achievementTotem +
                ", tourney=" + tourney +
                ", lastHytaleAd=" + lastHytaleAd +
                ", mostRecentGameType=" + mostRecentGameType +
                '}';
    }
}

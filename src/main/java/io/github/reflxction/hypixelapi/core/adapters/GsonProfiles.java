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
package io.github.reflxction.hypixelapi.core.adapters;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import io.github.reflxction.hypixelapi.core.implementation.game.FinishedParkourImpl;
import io.github.reflxction.hypixelapi.core.implementation.game.TournamentDataImpl;
import io.github.reflxction.hypixelapi.core.implementation.guild.BannerPatternImpl;
import io.github.reflxction.hypixelapi.core.implementation.guild.GuildMemberImpl;
import io.github.reflxction.hypixelapi.core.implementation.guild.GuildRankImpl;
import io.github.reflxction.hypixelapi.core.implementation.player.ChallengeImpl;
import io.github.reflxction.hypixelapi.core.implementation.player.GameStatisticsImpl;
import io.github.reflxction.hypixelapi.core.implementation.player.HypixelQuestImpl;
import io.github.reflxction.hypixelapi.core.implementation.player.PetImpl;
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.core.utils.PetType;
import io.github.reflxction.hypixelapi.game.FinishedParkour;
import io.github.reflxction.hypixelapi.guild.BannerPattern;
import io.github.reflxction.hypixelapi.guild.GuildMember;
import io.github.reflxction.hypixelapi.guild.GuildRank;
import io.github.reflxction.hypixelapi.hypixel.HousingSettings;
import io.github.reflxction.hypixelapi.player.*;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Contains a couple of GSON profiles used by the deserializers
 * <p>
 * ! WARNING ! UGLY CODE !
 */
public interface GsonProfiles {

    Gson ADAPTER_HELPER = new GsonBuilder()
            .registerTypeAdapter(Date.class, new DateAdapter())
            .registerTypeAdapter(UUID.class, new UUIDAdapter()).create();

    Gson MAIN = new GsonBuilder()
            .serializeNulls()
            .excludeFieldsWithModifiers(Modifier.PROTECTED)
            //.registerTypeAdapterFactory(new LenientTypeAdapterFactory())
            .registerTypeAdapter(Date.class, new DateAdapter())
            .registerTypeAdapter(PlayerRank.class, new PlayerRankAdapter())
            .registerTypeAdapter(HousingSettings.class, new HousingSettingsAdapter())

            .registerTypeAdapter(new TypeToken<Map<String, TournamentDataImpl>>() {
            }.getType(), new TournamentDataAdapter())

            .registerTypeAdapter(new TypeToken<List<BannerPattern>>() {
            }.getType(), (JsonDeserializer<List<BannerPattern>>) (json, typeOfT, context) -> {
                Type type = new TypeToken<List<BannerPatternImpl>>() {
                }.getType();
                return ADAPTER_HELPER.fromJson(json, type);
            })
            .registerTypeAdapter(GameStatistics.class, (JsonDeserializer<GameStatistics>) (json, typeOfT, context) -> ADAPTER_HELPER.fromJson(json, GameStatisticsImpl.class).withParent((JsonObject) json))
            .registerTypeAdapter(new TypeToken<Map<String, List<FinishedParkour>>>() {
            }.getType(), (JsonDeserializer<Map<String, List<FinishedParkour>>>) (json, typeOfT, context) -> {
                Type type = new TypeToken<Map<String, List<FinishedParkourImpl>>>() {
                }.getType();
                return ADAPTER_HELPER.fromJson(json, type);
            })

            .registerTypeAdapter(new TypeToken<Map<PetType, Pet>>() {
            }.getType(), (JsonDeserializer<Map<PetType, Pet>>) (json, typeOfT, context) -> {
                Type type = new TypeToken<Map<PetType, PetImpl>>() {
                }.getType();
                try {
                    return ADAPTER_HELPER.fromJson(json, type);
                } catch (JsonSyntaxException e) {
                    return Collections.emptyMap();
                }
            })

            .registerTypeAdapter(new TypeToken<List<GuildMember>>() {
            }.getType(), (JsonDeserializer<List<GuildMember>>) (json, typeOfT, context) -> {
                Type type = new TypeToken<List<GuildMemberImpl>>() {
                }.getType();
                return ADAPTER_HELPER.fromJson(json, type);
            })

            .registerTypeAdapter(new TypeToken<List<GuildRank>>() {
            }.getType(), (JsonDeserializer<List<GuildRank>>) (json, typeOfT, context) -> {
                Type type = new TypeToken<List<GuildRankImpl>>() {
                }.getType();
                return ADAPTER_HELPER.fromJson(json, type);
            })

            .registerTypeAdapter(new TypeToken<Map<String, HypixelQuest>>() {
            }.getType(), (JsonDeserializer<Map<String, HypixelQuest>>) (json, typeOfT, context) -> {
                Type type = new TypeToken<Map<String, HypixelQuestImpl>>() {
                }.getType();
                return ADAPTER_HELPER.fromJson(json, type);
            })

            .registerTypeAdapter(new TypeToken<Map<String, Challenge>>() {
            }.getType(), (JsonDeserializer<Map<String, Challenge>>) (json, typeOfT, context) -> {
                Type type = new TypeToken<Map<String, ChallengeImpl>>() {
                }.getType();
                return ADAPTER_HELPER.fromJson(json, type);
            })

            .registerTypeAdapter(new TypeToken<List<Date>>() {
            }.getType(), (JsonDeserializer<List<Date>>) (json, typeOfT, context) -> {
                JsonArray array = json.getAsJsonArray();
                Type type = new TypeToken<List<Map<String, Date>>>() {
                }.getType();
                List<Map<String, Date>> dateMap = ADAPTER_HELPER.fromJson(array, type);
                List<Date> date = new LinkedList<>();
                dateMap.forEach(stringDateMap -> date.add(stringDateMap.get("time")));
                return date;
            })

            .registerTypeAdapter(GameType.class, (JsonDeserializer<GameType>) (json, typeOfT, context) -> {
                try {
                    return GameType.fromId(json.getAsInt());
                } catch (NumberFormatException e) {
                    try {
                        return GameType.valueOf(json.getAsString());
                    } catch (IllegalArgumentException ex) {
                        return GameType.UNKNOWN;
                    }
                }
            })

            .registerTypeAdapter(UUID.class, new UUIDAdapter())
            .create();

}

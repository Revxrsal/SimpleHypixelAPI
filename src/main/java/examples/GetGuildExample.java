/*
 * * Copyright 2019 github.com/ReflxctionDev
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
package examples;


import io.github.reflxction.hypixelapi.HypixelAPI;
import io.github.reflxction.hypixelapi.guild.Guild;
import io.github.reflxction.hypixelapi.guild.GuildRank;

import java.io.IOException;

public class GetGuildExample {

    private static final HypixelAPI API = HypixelAPI.create("31f966e6-bd4d-4800-b85e-b036d1134abf");

    public static void main(String[] args) throws IOException {
        try {
            String guildID = API.getGuildId("BEASTS Only"); // The ID of the guild. This can be inputted in:
            Guild guild = API.getGuild(guildID); // Fetch the guild from the ID
            System.out.println("Guild name: " + guild.getName());
            System.out.println("Guild experience: " + guild.getExperience());
            System.out.println("Guild ranks: ");
            for (GuildRank rank : guild.getRanks()) {
                System.out.println("Rank name: " + rank.getName());
                System.out.println("Created at: " + rank.getCreationDate());
            }
        } finally {
            HypixelAPI.shutdown(); // May throw IOException
        }
    }

}

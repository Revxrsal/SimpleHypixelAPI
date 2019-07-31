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
import io.github.reflxction.hypixelapi.core.utils.ILeveling;
import io.github.reflxction.hypixelapi.player.HypixelPlayer;
import io.github.reflxction.hypixelapi.statistics.SkywarsStatistics;

import java.io.IOException;
import java.util.UUID;

public class GetPlayerByUUIDExample {

    private static final HypixelAPI API = HypixelAPI.create("31f966e6-bd4d-4800-b85e-b036d1134abf");

    public static void main(String[] args) throws IOException {
        try {
            HypixelPlayer player = API.getPlayer(UUID.fromString("b876ec32-e396-476b-a115-8438d83c67d4")); // Technoblade
            System.out.println("Name: " + player.getDisplayName());
            System.out.println("Network level: " + ILeveling.getLevel(player.getNetworkExp()));
            System.out.println("Karma: " + player.getKarma());

            // Statistics example
            SkywarsStatistics skywars = player.getStatistics().getSkywarsStatistics();
            System.out.println("SkyWars kills: " + skywars.getKills());
            System.out.println("SkyWars deaths: " + skywars.getDeaths());
        } finally {
            HypixelAPI.shutdown();
        }
    }

}

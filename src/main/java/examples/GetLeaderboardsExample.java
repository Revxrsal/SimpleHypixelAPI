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
import io.github.reflxction.hypixelapi.core.utils.GameType;
import io.github.reflxction.hypixelapi.game.Leaderboard;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GetLeaderboardsExample {

    private static final HypixelAPI API = HypixelAPI.create("31f966e6-bd4d-4800-b85e-b036d1134abf");

    public static void main(String[] args) throws IOException {
        try {
            Map<GameType, List<Leaderboard>> leaderboards = API.getLeaderboards();
            List<Leaderboard> murderMysteryLeaderboards = leaderboards.get(GameType.MURDER_MYSTERY);
            for (Leaderboard leaderboard : murderMysteryLeaderboards) {
                System.out.println("Prefix: " + leaderboard.getPrefix());
                System.out.println("Title: " + leaderboard.getTitle());
                System.out.println("Leads: " + leaderboard.getLeaders());
            }
        } finally {
            HypixelAPI.shutdown();
        }
    }

}

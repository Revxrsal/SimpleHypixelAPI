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
import io.github.reflxction.hypixelapi.hypixel.Booster;

import java.io.IOException;
import java.util.List;

public class GetBoosterExample {

    private static final HypixelAPI API = HypixelAPI.create("31f966e6-bd4d-4800-b85e-b036d1134abf");

    public static void main(String[] args) throws IOException {
        try {
            List<Booster> boosters = API.getBoosters();
            for (Booster booster : boosters) {
                System.out.println("Booster game: " + booster.getGameType());
                System.out.println("Activated at: " + booster.getActivationDate());
                System.out.println("Booster multiplier: " + booster.getMultiplier());
                System.out.println("Booster owner: " + booster.getPurchaserUUID());
            }
        } finally {
            HypixelAPI.shutdown();
        }
    }

}

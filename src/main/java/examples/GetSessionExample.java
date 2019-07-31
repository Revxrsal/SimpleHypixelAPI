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
import io.github.reflxction.hypixelapi.player.Session;

import java.io.IOException;
import java.util.UUID;

public class GetSessionExample {

    private static final HypixelAPI API = HypixelAPI.create("31f966e6-bd4d-4800-b85e-b036d1134abf");

    public static void main(String[] args) throws IOException {
        try {
            Session session = API.getSession(UUID.fromString("dfbd02a4-6be1-4153-a203-aed7204d35b"));
            System.out.println("Session ID: " + session.getId());
            System.out.println("Game type: " + session.getCurrentGameType());
        } finally {
            HypixelAPI.shutdown();
        }
    }

}

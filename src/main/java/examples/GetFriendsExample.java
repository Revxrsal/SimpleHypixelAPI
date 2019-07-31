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
import io.github.reflxction.hypixelapi.player.Friend;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class GetFriendsExample {

    private static final HypixelAPI API = HypixelAPI.create("31f966e6-bd4d-4800-b85e-b036d1134abf");

    public static void main(String[] args) throws IOException {
        try {
            List<Friend> friends = API.getFriends(UUID.fromString("abd3e676-f320-44f9-9021-043a2b31c38"));
            for (Friend friend : friends) {
                System.out.println("Request sender: " + friend.getSender());
                System.out.println("Friendship date: " + friend.getStartedDate());
            }
        } finally {
            HypixelAPI.shutdown();
        }
    }

}

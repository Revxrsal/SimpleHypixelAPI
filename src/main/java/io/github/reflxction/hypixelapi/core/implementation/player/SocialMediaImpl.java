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

import io.github.reflxction.hypixelapi.player.SocialMedia;
import io.github.reflxction.hypixelapi.player.SocialMediaType;

import java.util.Map;

/**
 * Class implementation for {@link SocialMedia}
 */
public class SocialMediaImpl implements SocialMedia {

    private Map<SocialMediaType, String> links;

    private boolean prompt;

    /**
     * Returns a map of the social media type and its link assigned.
     *
     * @return A map of the social media type and its link
     */
    @Override
    public Map<SocialMediaType, String> getLinks() {
        return links;
    }

    /**
     * Whether is the social media prompt or not
     *
     * @return Whether is the social media prompt or not
     */
    @Override
    public boolean isPrompt() {
        return prompt;
    }
}

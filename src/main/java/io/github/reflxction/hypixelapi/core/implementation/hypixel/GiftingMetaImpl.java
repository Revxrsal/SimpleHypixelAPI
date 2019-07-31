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
package io.github.reflxction.hypixelapi.core.implementation.hypixel;

import io.github.reflxction.hypixelapi.hypixel.GiftingMeta;

import java.util.List;

/**
 * Class implementation for {@link GiftingMeta}
 */
public class GiftingMetaImpl implements GiftingMeta {

    private int realBundlesReceived;

    private int bundlesReceived;

    private int giftsGiven;

    private int bundlesGiven;

    private int realBundlesGiven;

    private List<String> milestones;

    /**
     * Returns the amount of real bundles received
     *
     * @return The real bundles received
     */
    @Override
    public int getRealBundlesReceived() {
        return realBundlesReceived;
    }

    /**
     * Returns the amount of bundles received
     *
     * @return The amount of bundles received
     */
    @Override
    public int getBundlesReceived() {
        return bundlesReceived;
    }

    /**
     * Returns the amount of gifts given
     *
     * @return The amount of given gifts
     */
    @Override
    public int getGiftsGiven() {
        return giftsGiven;
    }

    /**
     * Returns the amount of bundles given
     *
     * @return The amount of given bundles
     */
    @Override
    public int getBundlesGiven() {
        return bundlesGiven;
    }

    /**
     * Returns the amount of real bundles given
     *
     * @return The amount of real bundles given
     */
    @Override
    public int getRealBundlesGiven() {
        return realBundlesGiven;
    }

    /**
     * Returns the player milestones in gifting
     *
     * @return The milestones
     */
    @Override
    public List<String> getMilestones() {
        return milestones;
    }

    @Override
    public String toString() {
        return "GiftingMetaImpl{" +
                "realBundlesReceived=" + realBundlesReceived +
                ", bundlesReceived=" + bundlesReceived +
                ", giftsGiven=" + giftsGiven +
                ", bundlesGiven=" + bundlesGiven +
                ", realBundlesGiven=" + realBundlesGiven +
                ", milestones=" + milestones +
                '}';
    }
}

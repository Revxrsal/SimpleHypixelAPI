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
package io.github.reflxction.hypixelapi.hypixel;

/**
 * Contains all WatchDog statistics exposed in the API
 */
public interface WatchdogStatistics {

    /**
     * Returns watchdog bans in the last minute
     *
     * @return WatchDog bans in the last minute
     */
    int getWatchDogBansInLastMinute();

    /**
     * Returns the staff bans in the last day
     *
     * @return Staff bans in the last day
     */
    int getStaffBansInLastDay();

    /**
     * Returns the total watchdog bans so far
     *
     * @return The total watchdog bans
     */
    int getTotalWatchDogBans();

    /**
     * Returns watchdog's bans in the last day
     *
     * @return WatchDog's bans in the last day
     */
    int getWatchDogBansInLastDay();

    /**
     * Returns the total staff bans so far
     *
     * @return The total staff bans
     */
    int getTotalStaffBans();

}

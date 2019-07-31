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

import com.google.gson.annotations.SerializedName;
import io.github.reflxction.hypixelapi.hypixel.WatchdogStatistics;

/**
 * Class implementation for {@link WatchdogStatistics}
 */
public class WatchdogStatisticsImpl implements WatchdogStatistics {

    @SerializedName("watchdog_lastMinute")
    private int watchdogBansInLastMinute;

    @SerializedName("staff_rollingDaily")
    private int staffBansInLastDay;

    @SerializedName("watchdog_total")
    private int watchdogTotal;

    @SerializedName("watchdog_rollingDaily")
    private int watchdogBansInLastDay;

    @SerializedName("staff_total")
    private int staffTotal;

    /**
     * Returns watchdog bans in the last minute
     *
     * @return WatchDog bans in the last minute
     */
    @Override
    public int getWatchDogBansInLastMinute() {
        return watchdogBansInLastMinute;
    }

    /**
     * Returns the staff bans in the last day
     *
     * @return Staff bans in the last day
     */
    @Override
    public int getStaffBansInLastDay() {
        return staffBansInLastDay;
    }

    /**
     * Returns the total watchdog bans so far
     *
     * @return The total watchdog bans
     */
    @Override
    public int getTotalWatchDogBans() {
        return watchdogTotal;
    }

    /**
     * Returns watchdog's bans in the last day
     *
     * @return WatchDog's bans in the last day
     */
    @Override
    public int getWatchDogBansInLastDay() {
        return watchdogBansInLastDay;
    }

    /**
     * Returns the total staff bans so far
     *
     * @return The total staff bans
     */
    @Override
    public int getTotalStaffBans() {
        return staffTotal;
    }

    @Override
    public String toString() {
        return "WatchdogStatisticsImpl{" +
                "watchdogBansInLastMinute=" + watchdogBansInLastMinute +
                ", staffBansInLastDay=" + staffBansInLastDay +
                ", watchdogTotal=" + watchdogTotal +
                ", watchdogBansInLastDay=" + watchdogBansInLastDay +
                ", staffTotal=" + staffTotal +
                '}';
    }
}

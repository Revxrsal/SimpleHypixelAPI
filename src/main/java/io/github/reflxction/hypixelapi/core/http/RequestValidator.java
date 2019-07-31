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
package io.github.reflxction.hypixelapi.core.http;

import com.google.gson.JsonObject;
import io.github.reflxction.hypixelapi.core.exceptions.HypixelAPIException;
import io.github.reflxction.hypixelapi.core.exceptions.InvalidKeyException;
import io.github.reflxction.hypixelapi.core.exceptions.RequestThrottleException;

import java.util.function.Predicate;

/**
 * A simple utility for validating requests
 */
public class RequestValidator {

    private static final String INVALID_KEY = "Invalid API key!";

    /**
     * Returns the given JSON object if the request was successful, or throws the given exception
     * if the request was unsuccessful
     *
     * @param key          API key to validate
     * @param <T>          The API exception
     * @param predicate    Another criteria that must be met in order for the request to success
     * @param object       The JSON object to test
     * @param apiException The exception to throw
     * @return The given JSON object
     */
    public static <T extends HypixelAPIException> JsonObject isSuccessful(String key, JsonObject object, T apiException, Predicate<JsonObject> predicate) {
        boolean success = object.get("success").getAsBoolean();
        if (!success && object.get("cause").getAsString().equals(INVALID_KEY))
            throw new InvalidKeyException(key);
        if (object.has("throttle") && object.get("throttle").getAsBoolean())
            throw new RequestThrottleException("You have passed the API throttle limit!");
        if (!success || (predicate != null && !predicate.test(object)))
            throw apiException;
        return object;
    }
}

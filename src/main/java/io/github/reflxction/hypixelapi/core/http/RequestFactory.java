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

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.github.reflxction.hypixelapi.core.exceptions.FriendsNotFoundException;
import io.github.reflxction.hypixelapi.core.exceptions.GuildNotFoundException;
import io.github.reflxction.hypixelapi.core.exceptions.InvalidPlayerSessionException;
import io.github.reflxction.hypixelapi.core.exceptions.PlayerNotFoundException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

import static io.github.reflxction.hypixelapi.core.adapters.GsonProfiles.MAIN;

/**
 * The class which handles all HTTP requests
 */
public class RequestFactory {

    /**
     * The HTTP client for requests
     */
    private static final CloseableHttpAsyncClient CLIENT = HttpAsyncClientBuilder.create().build();

    public static final AtomicBoolean STARTED = new AtomicBoolean(false);

    private static final BasicResponseHandler RESPONSE_HANDLER = new BasicResponseHandler();

    /**
     * The API key
     */
    private String key;

    /**
     * Initiates a new request factory
     *
     * @param key API key
     */
    public RequestFactory(String key) {
        start();
        this.key = key;
    }

    /**
     * Sends a GET request to the given URL and returns the response
     *
     * @param url Endpoint URL to send to
     * @return The response text
     */
    private String send(String url) {
        try {
            HttpUriRequest request = RequestBuilder.create("GET")
                    .setUri(url)
                    .addHeader("content-type", "application/json")
                    .build();
            Future<HttpResponse> future = CLIENT.execute(request, null);
            HttpResponse response = future.get();
            String responseText = RESPONSE_HANDLER.handleResponse(response);
            EntityUtils.consume(response.getEntity());
            return responseText;
        } catch (InterruptedException | ExecutionException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Closes the HTTP request client. This must be called on application shutdown to avoid using extra resources, keeping
     * in mind that the client is asynchronous
     *
     * @throws IOException Any I/O exceptions when closing the request client
     */
    public static void close() throws IOException {
        CLIENT.close();
    }

    /**
     * Constructs a JsonObject from the given string
     *
     * @param json JSON to construct from
     * @return The JSON object
     */
    private JsonObject construct(String json) {
        return MAIN.fromJson(json, JsonElement.class).getAsJsonObject();
    }

    /**
     * Returns the JSON response of <i>boosters</i> request method
     *
     * @return The JSON response
     */
    public JsonObject getBoosters() {
        String response = send(EndpointReference.getBoostersEndpoint(key));
        return construct(response);
    }

    /**
     * Returns the JSON response of <i>findGuild</i> request method
     *
     * @param guildName Guild to find
     * @return The JSON response
     */
    public JsonObject getFindGuild(String guildName) {
        String response = send(EndpointReference.getFindGuildEndpoint(key, guildName));
        return RequestValidator.isSuccessful(key, construct(response), new GuildNotFoundException(guildName),
                object -> !object.get("guild").isJsonNull());
    }

    /**
     * Returns the JSON response of <i>friends</i> request method
     *
     * @param uuid UUID to fetch from
     * @return The JSON response
     */
    public JsonObject getFriends(String uuid) {
        String response = send(EndpointReference.getFriendsEndpoint(key, uuid));
        return RequestValidator.isSuccessful(key, construct(response), new FriendsNotFoundException(uuid),
                object -> object.get("records").getAsJsonArray().size() != 0);
    }

    /**
     * Returns the JSON response of <i>guild</i> request method
     *
     * @param id ID of the guild
     * @return The JSON response
     */
    public JsonObject getGuild(String id) {
        String response = send(EndpointReference.getGuildEndpoint(key, id));
        return RequestValidator.isSuccessful(key, construct(response), new GuildNotFoundException(id),
                object -> !object.get("guild").isJsonNull());
    }

    /**
     * Returns the JSON response of <i>key</i> request method
     *
     * @return The JSON response
     */
    public JsonObject getKey() {
        String response = send(EndpointReference.getKeyEndpoint(key));
        return construct(response);
    }

    /**
     * Returns the JSON response of <i>leaderboards</i> request method
     *
     * @return The JSON response
     */
    public JsonObject getLeaderboards() {
        String response = send(EndpointReference.getLeaderboardsEndpoint(key));
        return construct(response);
    }

    /**
     * Returns the JSON response of <i>player</i> request method which takes name as a parameter
     *
     * @param name Name of the player
     * @return The JSON response
     */
    public JsonObject getPlayerByName(String name) {
        String response = send(EndpointReference.getPlayerByNameEndpoint(key, name));
        return RequestValidator.isSuccessful(key, construct(response), new PlayerNotFoundException(name),
                object -> !object.get("player").isJsonNull());
    }

    /**
     * Returns the JSON response of <i>findGuild</i> request method which takes uuid as a parameter
     *
     * @param uuid UUID of the player
     * @return The JSON response
     */
    public JsonObject getPlayerByUUID(String uuid) {
        String response = send(EndpointReference.getPlayerByUUIDEndpoint(key, uuid));
        return RequestValidator.isSuccessful(key, construct(response), new PlayerNotFoundException(uuid),
                object -> !object.get("player").isJsonNull());
    }

    /**
     * Returns the JSON response of <i>playerCount</i> request method
     *
     * @return The JSON response
     */
    public JsonObject getPlayerCount() {
        String response = send(EndpointReference.getPlayerCountEndpoint(key));
        return construct(response);
    }

    /**
     * Returns the JSON response of <i>session</i> request method
     *
     * @param uuid UUID of the player
     * @return The JSON response
     */
    public JsonObject getSession(String uuid) {
        String response = send(EndpointReference.getSessionEndpoint(key, uuid));
        return RequestValidator.isSuccessful(key, construct(response), new InvalidPlayerSessionException(uuid),
                object -> !object.get("session").isJsonNull());
    }

    /**
     * Returns the JSON response of <i>watchdogstats</i> request method
     *
     * @return The JSON response
     */
    public JsonObject getWatchdogStats() {
        String response = send(EndpointReference.getWatchdogEndpoint(key));
        return construct(response);
    }

    /**
     * Starts the request client
     */
    private static void start() {
        if (!STARTED.get()) {
            CLIENT.start(); // Start the client since it's asynchronous
            STARTED.set(true);
        }
    }

}
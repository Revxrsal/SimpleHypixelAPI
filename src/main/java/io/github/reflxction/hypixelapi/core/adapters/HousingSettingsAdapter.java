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
package io.github.reflxction.hypixelapi.core.adapters;

import com.google.gson.*;
import io.github.reflxction.hypixelapi.core.implementation.hypixel.HousingSettingsImpl;
import io.github.reflxction.hypixelapi.hypixel.HousingSettings;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;

/**
 * A specific deserialization strategy to {@link HousingSettings}
 */
public class HousingSettingsAdapter implements JsonDeserializer<HousingSettings> {

    /**
     * Gson invokes this call-back method during deserialization when it encounters a field of the
     * specified type.
     * <p>In the implementation of this call-back method, you should consider invoking
     * {@link JsonDeserializationContext#deserialize(JsonElement, Type)} method to create objects
     * for any non-trivial field of the returned object. However, you should never invoke it on the
     * the same type passing {@code json} since that will cause an infinite loop (Gson will call your
     * call-back method again).
     *
     * @param json    The Json data being deserialized
     * @param typeOfT The type of the Object to deserialize to
     * @param context Json context
     * @return a deserialized object of the specified type typeOfT which is a subclass of {@code T}
     * @throws JsonParseException if json is not in the expected format of {@code typeofT}
     */
    @Override
    public HousingSettings deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject object = json.getAsJsonObject();
        try {
            boolean border = Boolean.parseBoolean(StringUtils.replace(object.get("BORDER").getAsString(), "BooleanState-", ""));
            int visibility = Integer.parseInt(StringUtils.replace(object.get("VISIBILITY").getAsString(), "IntegerState-", ""));
            return new HousingSettingsImpl(border, visibility);

        } catch (NullPointerException e) {
            return new HousingSettingsImpl(false, 0);
        }
    }
}

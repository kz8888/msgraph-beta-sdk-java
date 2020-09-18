// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AgreementFileLocalization;
import com.microsoft.graph.models.extensions.AgreementFileProperties;
import com.microsoft.graph.requests.extensions.AgreementFileLocalizationCollectionResponse;
import com.microsoft.graph.requests.extensions.AgreementFileLocalizationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File.
 */
public class AgreementFile extends AgreementFileProperties implements IJsonBackedObject {


    /**
     * The Localizations.
     * 
     */
    @SerializedName("localizations")
    @Expose
    public AgreementFileLocalizationCollectionPage localizations;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("localizations")) {
            final AgreementFileLocalizationCollectionResponse response = new AgreementFileLocalizationCollectionResponse();
            if (json.has("localizations@odata.nextLink")) {
                response.nextLink = json.get("localizations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("localizations").toString(), JsonObject[].class);
            final AgreementFileLocalization[] array = new AgreementFileLocalization[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AgreementFileLocalization.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            localizations = new AgreementFileLocalizationCollectionPage(response, null);
        }
    }
}

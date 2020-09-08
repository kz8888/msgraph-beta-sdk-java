// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TermsExpiration;
import com.microsoft.graph.models.extensions.AgreementAcceptance;
import com.microsoft.graph.models.extensions.AgreementFile;
import com.microsoft.graph.models.extensions.AgreementFileLocalization;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionResponse;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionPage;
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
 * The class for the Agreement.
 */
public class Agreement extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Per Device Acceptance Required.
     * 
     */
    @SerializedName("isPerDeviceAcceptanceRequired")
    @Expose
    public Boolean isPerDeviceAcceptanceRequired;

    /**
     * The Is Viewing Before Acceptance Required.
     * 
     */
    @SerializedName("isViewingBeforeAcceptanceRequired")
    @Expose
    public Boolean isViewingBeforeAcceptanceRequired;

    /**
     * The Terms Expiration.
     * 
     */
    @SerializedName("termsExpiration")
    @Expose
    public TermsExpiration termsExpiration;

    /**
     * The User Reaccept Required Frequency.
     * 
     */
    @SerializedName("userReacceptRequiredFrequency")
    @Expose
    public javax.xml.datatype.Duration userReacceptRequiredFrequency;

    /**
     * The Acceptances.
     * 
     */
    public AgreementAcceptanceCollectionPage acceptances;

    /**
     * The File.
     * 
     */
    @SerializedName("file")
    @Expose
    public AgreementFile file;

    /**
     * The Files.
     * 
     */
    public AgreementFileLocalizationCollectionPage files;


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


        if (json.has("acceptances")) {
            final AgreementAcceptanceCollectionResponse response = new AgreementAcceptanceCollectionResponse();
            if (json.has("acceptances@odata.nextLink")) {
                response.nextLink = json.get("acceptances@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("acceptances").toString(), JsonObject[].class);
            final AgreementAcceptance[] array = new AgreementAcceptance[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AgreementAcceptance.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            acceptances = new AgreementAcceptanceCollectionPage(response, null);
        }

        if (json.has("files")) {
            final AgreementFileLocalizationCollectionResponse response = new AgreementFileLocalizationCollectionResponse();
            if (json.has("files@odata.nextLink")) {
                response.nextLink = json.get("files@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("files").toString(), JsonObject[].class);
            final AgreementFileLocalization[] array = new AgreementFileLocalization[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AgreementFileLocalization.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            files = new AgreementFileLocalizationCollectionPage(response, null);
        }
    }
}

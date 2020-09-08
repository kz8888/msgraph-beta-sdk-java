// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Acceptance Status.
 */
public class TermsAndConditionsAcceptanceStatus extends Entity implements IJsonBackedObject {


    /**
     * The Accepted Date Time.
     * DateTime when the terms were last accepted by the user.
     */
    @SerializedName("acceptedDateTime")
    @Expose
    public java.util.Calendar acceptedDateTime;

    /**
     * The Accepted Version.
     * Most recent version number of the T&amp;C accepted by the user.
     */
    @SerializedName("acceptedVersion")
    @Expose
    public Integer acceptedVersion;

    /**
     * The User Display Name.
     * Display name of the user whose acceptance the entity represents.
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Principal Name.
     * The userPrincipalName of the User that accepted the term.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Terms And Conditions.
     * Navigation link to the terms and conditions that are assigned.
     */
    @SerializedName("termsAndConditions")
    @Expose
    public TermsAndConditions termsAndConditions;


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

    }
}

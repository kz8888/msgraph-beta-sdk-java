// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.InsightIdentity;
import com.microsoft.graph.models.extensions.ResourceReference;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sharing Detail.
 */
public class SharingDetail implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Shared By.
     * The user who shared the document.
     */
    @SerializedName("sharedBy")
    @Expose
    public InsightIdentity sharedBy;

    /**
     * The Shared Date Time.
     * The date and time the file was last shared. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName("sharedDateTime")
    @Expose
    public java.util.Calendar sharedDateTime;

    /**
     * The Sharing Reference.
     * 
     */
    @SerializedName("sharingReference")
    @Expose
    public ResourceReference sharingReference;

    /**
     * The Sharing Subject.
     * The subject with which the document was shared.
     */
    @SerializedName("sharingSubject")
    @Expose
    public String sharingSubject;

    /**
     * The Sharing Type.
     * Determines the way the document was shared, can be by a 'Link', 'Attachment', 'Group', 'Site'.
     */
    @SerializedName("sharingType")
    @Expose
    public String sharingType;


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

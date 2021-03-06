// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User State Summary.
 */
public class DeviceConfigurationUserStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Compliant User Count.
     * Number of compliant users
     */
    @SerializedName(value = "compliantUserCount", alternate = {"CompliantUserCount"})
    @Expose
    public Integer compliantUserCount;

    /**
     * The Conflict User Count.
     * Number of conflict users
     */
    @SerializedName(value = "conflictUserCount", alternate = {"ConflictUserCount"})
    @Expose
    public Integer conflictUserCount;

    /**
     * The Error User Count.
     * Number of error users
     */
    @SerializedName(value = "errorUserCount", alternate = {"ErrorUserCount"})
    @Expose
    public Integer errorUserCount;

    /**
     * The Non Compliant User Count.
     * Number of NonCompliant users
     */
    @SerializedName(value = "nonCompliantUserCount", alternate = {"NonCompliantUserCount"})
    @Expose
    public Integer nonCompliantUserCount;

    /**
     * The Not Applicable User Count.
     * Number of not applicable users
     */
    @SerializedName(value = "notApplicableUserCount", alternate = {"NotApplicableUserCount"})
    @Expose
    public Integer notApplicableUserCount;

    /**
     * The Remediated User Count.
     * Number of remediated users
     */
    @SerializedName(value = "remediatedUserCount", alternate = {"RemediatedUserCount"})
    @Expose
    public Integer remediatedUserCount;

    /**
     * The Unknown User Count.
     * Number of unknown users
     */
    @SerializedName(value = "unknownUserCount", alternate = {"UnknownUserCount"})
    @Expose
    public Integer unknownUserCount;


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

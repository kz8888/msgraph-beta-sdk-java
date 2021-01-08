// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.GroupPolicyOperationStatus;
import com.microsoft.graph.models.generated.GroupPolicyOperationType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Operation.
 */
public class GroupPolicyOperation extends Entity implements IJsonBackedObject {


    /**
     * The Last Modified Date Time.
     * The date and time the entity was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Operation Status.
     * The group policy operation status. Possible values are: unknown, inProgress, success, failed.
     */
    @SerializedName(value = "operationStatus", alternate = {"OperationStatus"})
    @Expose
    public GroupPolicyOperationStatus operationStatus;

    /**
     * The Operation Type.
     * The type of group policy operation. Possible values are: none, upload, uploadNewVersion, addLanguageFiles, removeLanguageFiles, updateLanguageFiles, remove.
     */
    @SerializedName(value = "operationType", alternate = {"OperationType"})
    @Expose
    public GroupPolicyOperationType operationType;

    /**
     * The Status Details.
     * The group policy operation status detail.
     */
    @SerializedName(value = "statusDetails", alternate = {"StatusDetails"})
    @Expose
    public String statusDetails;


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

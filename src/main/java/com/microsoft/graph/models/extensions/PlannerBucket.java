// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.models.extensions.PlannerDelta;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Bucket.
 */
public class PlannerBucket extends PlannerDelta implements IJsonBackedObject {


    /**
     * The Name.
     * Name of the bucket.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Order Hint.
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    @SerializedName(value = "orderHint", alternate = {"OrderHint"})
    @Expose
	@Nullable
    public String orderHint;

    /**
     * The Plan Id.
     * Plan ID to which the bucket belongs.
     */
    @SerializedName(value = "planId", alternate = {"PlanId"})
    @Expose
	@Nullable
    public String planId;

    /**
     * The Tasks.
     * Read-only. Nullable. The collection of tasks in the bucket.
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
	@Nullable
    public PlannerTaskCollectionPage tasks;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks").toString(), PlannerTaskCollectionPage.class);
        }
    }
}

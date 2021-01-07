// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RoleSummaryStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Summary.
 */
public class PrivilegedRoleSummary extends Entity implements IJsonBackedObject {


    /**
     * The Elevated Count.
     * 
     */
    @SerializedName(value = "elevatedCount", alternate = {"ElevatedCount"})
    @Expose
	@Nullable
    public Integer elevatedCount;

    /**
     * The Managed Count.
     * 
     */
    @SerializedName(value = "managedCount", alternate = {"ManagedCount"})
    @Expose
	@Nullable
    public Integer managedCount;

    /**
     * The Mfa Enabled.
     * 
     */
    @SerializedName(value = "mfaEnabled", alternate = {"MfaEnabled"})
    @Expose
	@Nullable
    public Boolean mfaEnabled;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public RoleSummaryStatus status;

    /**
     * The Users Count.
     * 
     */
    @SerializedName(value = "usersCount", alternate = {"UsersCount"})
    @Expose
	@Nullable
    public Integer usersCount;


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

    }
}

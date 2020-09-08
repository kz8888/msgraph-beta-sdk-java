// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mailbox Usage Detail.
 */
public class MailboxUsageDetail extends Entity implements IJsonBackedObject {


    /**
     * The Created Date.
     * 
     */
    @SerializedName("createdDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly createdDate;

    /**
     * The Deleted Date.
     * 
     */
    @SerializedName("deletedDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly deletedDate;

    /**
     * The Deleted Item Count.
     * 
     */
    @SerializedName("deletedItemCount")
    @Expose
    public Long deletedItemCount;

    /**
     * The Deleted Item Size In Bytes.
     * 
     */
    @SerializedName("deletedItemSizeInBytes")
    @Expose
    public Long deletedItemSizeInBytes;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName("isDeleted")
    @Expose
    public Boolean isDeleted;

    /**
     * The Issue Warning Quota In Bytes.
     * 
     */
    @SerializedName("issueWarningQuotaInBytes")
    @Expose
    public Long issueWarningQuotaInBytes;

    /**
     * The Item Count.
     * 
     */
    @SerializedName("itemCount")
    @Expose
    public Long itemCount;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName("lastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly lastActivityDate;

    /**
     * The Prohibit Send Quota In Bytes.
     * 
     */
    @SerializedName("prohibitSendQuotaInBytes")
    @Expose
    public Long prohibitSendQuotaInBytes;

    /**
     * The Prohibit Send Receive Quota In Bytes.
     * 
     */
    @SerializedName("prohibitSendReceiveQuotaInBytes")
    @Expose
    public Long prohibitSendReceiveQuotaInBytes;

    /**
     * The Report Period.
     * 
     */
    @SerializedName("reportPeriod")
    @Expose
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Storage Used In Bytes.
     * 
     */
    @SerializedName("storageUsedInBytes")
    @Expose
    public Long storageUsedInBytes;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


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

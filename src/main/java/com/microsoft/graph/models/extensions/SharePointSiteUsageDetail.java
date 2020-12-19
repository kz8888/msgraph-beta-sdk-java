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
 * The class for the Share Point Site Usage Detail.
 */
public class SharePointSiteUsageDetail extends Entity implements IJsonBackedObject {


    /**
     * The Active File Count.
     * 
     */
    @SerializedName(value = "activeFileCount", alternate = {"ActiveFileCount"})
    @Expose
    public Long activeFileCount;

    /**
     * The File Count.
     * 
     */
    @SerializedName(value = "fileCount", alternate = {"FileCount"})
    @Expose
    public Long fileCount;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName(value = "isDeleted", alternate = {"IsDeleted"})
    @Expose
    public Boolean isDeleted;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName(value = "lastActivityDate", alternate = {"LastActivityDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly lastActivityDate;

    /**
     * The Owner Display Name.
     * 
     */
    @SerializedName(value = "ownerDisplayName", alternate = {"OwnerDisplayName"})
    @Expose
    public String ownerDisplayName;

    /**
     * The Owner Principal Name.
     * 
     */
    @SerializedName(value = "ownerPrincipalName", alternate = {"OwnerPrincipalName"})
    @Expose
    public String ownerPrincipalName;

    /**
     * The Page View Count.
     * 
     */
    @SerializedName(value = "pageViewCount", alternate = {"PageViewCount"})
    @Expose
    public Long pageViewCount;

    /**
     * The Report Period.
     * 
     */
    @SerializedName(value = "reportPeriod", alternate = {"ReportPeriod"})
    @Expose
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Root Web Template.
     * 
     */
    @SerializedName(value = "rootWebTemplate", alternate = {"RootWebTemplate"})
    @Expose
    public String rootWebTemplate;

    /**
     * The Site Id.
     * 
     */
    @SerializedName(value = "siteId", alternate = {"SiteId"})
    @Expose
    public java.util.UUID siteId;

    /**
     * The Site Url.
     * 
     */
    @SerializedName(value = "siteUrl", alternate = {"SiteUrl"})
    @Expose
    public String siteUrl;

    /**
     * The Storage Allocated In Bytes.
     * 
     */
    @SerializedName(value = "storageAllocatedInBytes", alternate = {"StorageAllocatedInBytes"})
    @Expose
    public Long storageAllocatedInBytes;

    /**
     * The Storage Used In Bytes.
     * 
     */
    @SerializedName(value = "storageUsedInBytes", alternate = {"StorageUsedInBytes"})
    @Expose
    public Long storageUsedInBytes;

    /**
     * The Visited Page Count.
     * 
     */
    @SerializedName(value = "visitedPageCount", alternate = {"VisitedPageCount"})
    @Expose
    public Long visitedPageCount;


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

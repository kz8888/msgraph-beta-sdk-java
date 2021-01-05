// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.FileHash;
import com.microsoft.graph.models.extensions.MalwareState;
import com.microsoft.graph.models.extensions.SecurityVendorInformation;
import com.microsoft.graph.models.extensions.VulnerabilityState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Security Profile.
 */
public class FileSecurityProfile extends Entity implements IJsonBackedObject {


    /**
     * The Activity Group Names.
     * 
     */
    @SerializedName(value = "activityGroupNames", alternate = {"ActivityGroupNames"})
    @Expose
    public java.util.List<String> activityGroupNames;

    /**
     * The Azure Subscription Id.
     * 
     */
    @SerializedName(value = "azureSubscriptionId", alternate = {"AzureSubscriptionId"})
    @Expose
    public String azureSubscriptionId;

    /**
     * The Azure Tenant Id.
     * 
     */
    @SerializedName(value = "azureTenantId", alternate = {"AzureTenantId"})
    @Expose
    public String azureTenantId;

    /**
     * The Certificate Thumbprint.
     * 
     */
    @SerializedName(value = "certificateThumbprint", alternate = {"CertificateThumbprint"})
    @Expose
    public String certificateThumbprint;

    /**
     * The Extensions.
     * 
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
    public java.util.List<String> extensions;

    /**
     * The File Type.
     * 
     */
    @SerializedName(value = "fileType", alternate = {"FileType"})
    @Expose
    public String fileType;

    /**
     * The First Seen Date Time.
     * 
     */
    @SerializedName(value = "firstSeenDateTime", alternate = {"FirstSeenDateTime"})
    @Expose
    public java.util.Calendar firstSeenDateTime;

    /**
     * The Hashes.
     * 
     */
    @SerializedName(value = "hashes", alternate = {"Hashes"})
    @Expose
    public java.util.List<FileHash> hashes;

    /**
     * The Last Seen Date Time.
     * 
     */
    @SerializedName(value = "lastSeenDateTime", alternate = {"LastSeenDateTime"})
    @Expose
    public java.util.Calendar lastSeenDateTime;

    /**
     * The Malware States.
     * 
     */
    @SerializedName(value = "malwareStates", alternate = {"MalwareStates"})
    @Expose
    public java.util.List<MalwareState> malwareStates;

    /**
     * The Names.
     * 
     */
    @SerializedName(value = "names", alternate = {"Names"})
    @Expose
    public java.util.List<String> names;

    /**
     * The Risk Score.
     * 
     */
    @SerializedName(value = "riskScore", alternate = {"RiskScore"})
    @Expose
    public String riskScore;

    /**
     * The Size.
     * 
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
    public Long size;

    /**
     * The Tags.
     * 
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
    public java.util.List<String> tags;

    /**
     * The Vendor Information.
     * 
     */
    @SerializedName(value = "vendorInformation", alternate = {"VendorInformation"})
    @Expose
    public SecurityVendorInformation vendorInformation;

    /**
     * The Vulnerability States.
     * 
     */
    @SerializedName(value = "vulnerabilityStates", alternate = {"VulnerabilityStates"})
    @Expose
    public java.util.List<VulnerabilityState> vulnerabilityStates;


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

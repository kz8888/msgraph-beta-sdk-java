// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PrinterCapabilities;
import com.microsoft.graph.models.extensions.PrinterDefaults;
import com.microsoft.graph.models.extensions.PrinterLocation;
import com.microsoft.graph.models.extensions.PrinterStatus;
import com.microsoft.graph.models.extensions.PrintJob;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PrintJobCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Base.
 */
public class PrinterBase extends Entity implements IJsonBackedObject {


    /**
     * The Capabilities.
     * 
     */
    @SerializedName(value = "capabilities", alternate = {"Capabilities"})
    @Expose
    public PrinterCapabilities capabilities;

    /**
     * The Defaults.
     * 
     */
    @SerializedName(value = "defaults", alternate = {"Defaults"})
    @Expose
    public PrinterDefaults defaults;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Is Accepting Jobs.
     * 
     */
    @SerializedName(value = "isAcceptingJobs", alternate = {"IsAcceptingJobs"})
    @Expose
    public Boolean isAcceptingJobs;

    /**
     * The Location.
     * 
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
    public PrinterLocation location;

    /**
     * The Manufacturer.
     * 
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
    public String manufacturer;

    /**
     * The Model.
     * 
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
    public String model;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public PrinterStatus status;

    /**
     * The Jobs.
     * 
     */
    @SerializedName(value = "jobs", alternate = {"Jobs"})
    @Expose
    public PrintJobCollectionPage jobs;


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


        if (json.has("jobs")) {
            jobs = serializer.deserializeObject(json.get("jobs").toString(), PrintJobCollectionPage.class);
        }
    }
}

// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PrintConnector;
import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.models.extensions.PrintTaskTrigger;
import com.microsoft.graph.models.extensions.PrinterBase;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.PrinterShareCollectionPage;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer.
 */
public class Printer extends PrinterBase implements IJsonBackedObject {


    /**
     * The Accepting Jobs.
     * 
     */
    @SerializedName(value = "acceptingJobs", alternate = {"AcceptingJobs"})
    @Expose
    public Boolean acceptingJobs;

    /**
     * The Has Physical Device.
     * 
     */
    @SerializedName(value = "hasPhysicalDevice", alternate = {"HasPhysicalDevice"})
    @Expose
    public Boolean hasPhysicalDevice;

    /**
     * The Is Shared.
     * 
     */
    @SerializedName(value = "isShared", alternate = {"IsShared"})
    @Expose
    public Boolean isShared;

    /**
     * The Registered Date Time.
     * 
     */
    @SerializedName(value = "registeredDateTime", alternate = {"RegisteredDateTime"})
    @Expose
    public java.util.Calendar registeredDateTime;

    /**
     * The Connectors.
     * 
     */
    public PrintConnectorCollectionPage connectors;

    /**
     * The Share.
     * 
     */
    @SerializedName(value = "share", alternate = {"Share"})
    @Expose
    public PrinterShare share;

    /**
     * The Shares.
     * 
     */
    public PrinterShareCollectionPage shares;

    /**
     * The Task Triggers.
     * 
     */
    @SerializedName(value = "taskTriggers", alternate = {"TaskTriggers"})
    @Expose
    public PrintTaskTriggerCollectionPage taskTriggers;


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


        if (json.has("connectors")) {
            connectors = serializer.deserializeObject(json.get("connectors").toString(), PrintConnectorCollectionPage.class);
        }

        if (json.has("shares")) {
            shares = serializer.deserializeObject(json.get("shares").toString(), PrinterShareCollectionPage.class);
        }

        if (json.has("taskTriggers")) {
            taskTriggers = serializer.deserializeObject(json.get("taskTriggers").toString(), PrintTaskTriggerCollectionPage.class);
        }
    }
}

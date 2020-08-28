// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PrinterDefaults;
import com.microsoft.graph.models.extensions.PrinterLocation;
import com.microsoft.graph.models.extensions.PrinterCapabilities;
import com.microsoft.graph.models.extensions.PrinterStatus;
import com.microsoft.graph.models.extensions.PrintJob;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PrintJobCollectionResponse;
import com.microsoft.graph.requests.extensions.PrintJobCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Base.
 */
public class PrinterBase extends Entity implements IJsonBackedObject {


    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Manufacturer.
     * 
     */
    @SerializedName("manufacturer")
    @Expose
    public String manufacturer;

    /**
     * The Model.
     * 
     */
    @SerializedName("model")
    @Expose
    public String model;

    /**
     * The Is Accepting Jobs.
     * 
     */
    @SerializedName("isAcceptingJobs")
    @Expose
    public Boolean isAcceptingJobs;

    /**
     * The Defaults.
     * 
     */
    @SerializedName("defaults")
    @Expose
    public PrinterDefaults defaults;

    /**
     * The Location.
     * 
     */
    @SerializedName("location")
    @Expose
    public PrinterLocation location;

    /**
     * The Capabilities.
     * 
     */
    @SerializedName("capabilities")
    @Expose
    public PrinterCapabilities capabilities;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public PrinterStatus status;

    /**
     * The Jobs.
     * 
     */
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
            final PrintJobCollectionResponse response = new PrintJobCollectionResponse();
            if (json.has("jobs@odata.nextLink")) {
                response.nextLink = json.get("jobs@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("jobs").toString(), JsonObject[].class);
            final PrintJob[] array = new PrintJob[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PrintJob.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            jobs = new PrintJobCollectionPage(response, null);
        }
    }
}
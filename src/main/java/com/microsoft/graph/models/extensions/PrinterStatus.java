// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PrinterProcessingStateDetail;
import com.microsoft.graph.models.generated.PrinterProcessingState;
import com.microsoft.graph.models.generated.PrinterProcessingStateReason;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Status.
 */
public class PrinterStatus implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Details.
     * 
     */
    @SerializedName(value = "details", alternate = {"Details"})
    @Expose
    public java.util.List<PrinterProcessingStateDetail> details;

    /**
     * The Processing State.
     * 
     */
    @SerializedName(value = "processingState", alternate = {"ProcessingState"})
    @Expose
    public PrinterProcessingState processingState;

    /**
     * The Processing State Description.
     * 
     */
    @SerializedName(value = "processingStateDescription", alternate = {"ProcessingStateDescription"})
    @Expose
    public String processingStateDescription;

    /**
     * The Processing State Reasons.
     * 
     */
    @SerializedName(value = "processingStateReasons", alternate = {"ProcessingStateReasons"})
    @Expose
    public java.util.List<PrinterProcessingStateReason> processingStateReasons;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public PrinterProcessingState state;


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

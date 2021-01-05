// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SynchronizationError;
import com.microsoft.graph.models.generated.SynchronizationTaskExecutionResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Task Execution.
 */
public class SynchronizationTaskExecution implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Activity Identifier.
     * 
     */
    @SerializedName(value = "activityIdentifier", alternate = {"ActivityIdentifier"})
    @Expose
    public String activityIdentifier;

    /**
     * The Count Entitled.
     * 
     */
    @SerializedName(value = "countEntitled", alternate = {"CountEntitled"})
    @Expose
    public Long countEntitled;

    /**
     * The Count Entitled For Provisioning.
     * 
     */
    @SerializedName(value = "countEntitledForProvisioning", alternate = {"CountEntitledForProvisioning"})
    @Expose
    public Long countEntitledForProvisioning;

    /**
     * The Count Escrowed.
     * 
     */
    @SerializedName(value = "countEscrowed", alternate = {"CountEscrowed"})
    @Expose
    public Long countEscrowed;

    /**
     * The Count Escrowed Raw.
     * 
     */
    @SerializedName(value = "countEscrowedRaw", alternate = {"CountEscrowedRaw"})
    @Expose
    public Long countEscrowedRaw;

    /**
     * The Count Exported.
     * 
     */
    @SerializedName(value = "countExported", alternate = {"CountExported"})
    @Expose
    public Long countExported;

    /**
     * The Count Exports.
     * 
     */
    @SerializedName(value = "countExports", alternate = {"CountExports"})
    @Expose
    public Long countExports;

    /**
     * The Count Imported.
     * 
     */
    @SerializedName(value = "countImported", alternate = {"CountImported"})
    @Expose
    public Long countImported;

    /**
     * The Count Imported Deltas.
     * 
     */
    @SerializedName(value = "countImportedDeltas", alternate = {"CountImportedDeltas"})
    @Expose
    public Long countImportedDeltas;

    /**
     * The Count Imported Reference Deltas.
     * 
     */
    @SerializedName(value = "countImportedReferenceDeltas", alternate = {"CountImportedReferenceDeltas"})
    @Expose
    public Long countImportedReferenceDeltas;

    /**
     * The Error.
     * 
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
    public SynchronizationError error;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public SynchronizationTaskExecutionResult state;

    /**
     * The Time Began.
     * 
     */
    @SerializedName(value = "timeBegan", alternate = {"TimeBegan"})
    @Expose
    public java.util.Calendar timeBegan;

    /**
     * The Time Ended.
     * 
     */
    @SerializedName(value = "timeEnded", alternate = {"TimeEnded"})
    @Expose
    public java.util.Calendar timeEnded;


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

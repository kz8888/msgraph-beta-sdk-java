// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WellknownListName;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.TodoTask;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.TodoTaskCollectionResponse;
import com.microsoft.graph.requests.extensions.TodoTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task List.
 */
public class TodoTaskList extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Owner.
     * 
     */
    @SerializedName("isOwner")
    @Expose
    public Boolean isOwner;

    /**
     * The Is Shared.
     * 
     */
    @SerializedName("isShared")
    @Expose
    public Boolean isShared;

    /**
     * The Wellknown List Name.
     * 
     */
    @SerializedName("wellknownListName")
    @Expose
    public WellknownListName wellknownListName;

    /**
     * The Extensions.
     * 
     */
    @SerializedName("extensions")
    @Expose
    public ExtensionCollectionPage extensions;

    /**
     * The Tasks.
     * 
     */
    @SerializedName("tasks")
    @Expose
    public TodoTaskCollectionPage tasks;


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


        if (json.has("extensions")) {
            final ExtensionCollectionResponse response = new ExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("tasks")) {
            final TodoTaskCollectionResponse response = new TodoTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final TodoTask[] array = new TodoTask[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TodoTask.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new TodoTaskCollectionPage(response, null);
        }
    }
}

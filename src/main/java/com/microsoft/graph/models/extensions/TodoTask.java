// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.generated.Importance;
import com.microsoft.graph.models.extensions.PatternedRecurrence;
import com.microsoft.graph.models.generated.TaskStatus;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.LinkedResource;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task.
 */
public class TodoTask extends Entity implements IJsonBackedObject {


    /**
     * The Body.
     * 
     */
    @SerializedName("body")
    @Expose
    public ItemBody body;

    /**
     * The Body Last Modified Date Time.
     * 
     */
    @SerializedName("bodyLastModifiedDateTime")
    @Expose
    public java.util.Calendar bodyLastModifiedDateTime;

    /**
     * The Completed Date Time.
     * 
     */
    @SerializedName("completedDateTime")
    @Expose
    public DateTimeTimeZone completedDateTime;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Due Date Time.
     * 
     */
    @SerializedName("dueDateTime")
    @Expose
    public DateTimeTimeZone dueDateTime;

    /**
     * The Importance.
     * 
     */
    @SerializedName("importance")
    @Expose
    public Importance importance;

    /**
     * The Is Reminder On.
     * 
     */
    @SerializedName("isReminderOn")
    @Expose
    public Boolean isReminderOn;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Recurrence.
     * 
     */
    @SerializedName("recurrence")
    @Expose
    public PatternedRecurrence recurrence;

    /**
     * The Reminder Date Time.
     * 
     */
    @SerializedName("reminderDateTime")
    @Expose
    public DateTimeTimeZone reminderDateTime;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public TaskStatus status;

    /**
     * The Title.
     * 
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Extensions.
     * 
     */
    @SerializedName("extensions")
    @Expose
    public ExtensionCollectionPage extensions;

    /**
     * The Linked Resources.
     * 
     */
    @SerializedName("linkedResources")
    @Expose
    public LinkedResourceCollectionPage linkedResources;


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

        if (json.has("linkedResources")) {
            final LinkedResourceCollectionResponse response = new LinkedResourceCollectionResponse();
            if (json.has("linkedResources@odata.nextLink")) {
                response.nextLink = json.get("linkedResources@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("linkedResources").toString(), JsonObject[].class);
            final LinkedResource[] array = new LinkedResource[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), LinkedResource.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            linkedResources = new LinkedResourceCollectionPage(response, null);
        }
    }
}

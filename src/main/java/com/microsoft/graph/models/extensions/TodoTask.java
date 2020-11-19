// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.generated.Importance;
import com.microsoft.graph.models.extensions.PatternedRecurrence;
import com.microsoft.graph.models.generated.TaskStatus;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.LinkedResource;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task.
 */
public class TodoTask extends Entity implements IJsonBackedObject {


    /**
     * The Body.
     * The task body that typically contains information about the task.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
    public ItemBody body;

    /**
     * The Body Last Modified Date Time.
     * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    @SerializedName(value = "bodyLastModifiedDateTime", alternate = {"BodyLastModifiedDateTime"})
    @Expose
    public java.util.Calendar bodyLastModifiedDateTime;

    /**
     * The Completed Date Time.
     * The date in the specified time zone that the task was finished.
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
    public DateTimeTimeZone completedDateTime;

    /**
     * The Created Date Time.
     * The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Due Date Time.
     * The date in the specified time zone that the task is to be finished.
     */
    @SerializedName(value = "dueDateTime", alternate = {"DueDateTime"})
    @Expose
    public DateTimeTimeZone dueDateTime;

    /**
     * The Importance.
     * The importance of the task. Possible values are: low, normal, high.
     */
    @SerializedName(value = "importance", alternate = {"Importance"})
    @Expose
    public Importance importance;

    /**
     * The Is Reminder On.
     * Set to true if an alert is set to remind the user of the task.
     */
    @SerializedName(value = "isReminderOn", alternate = {"IsReminderOn"})
    @Expose
    public Boolean isReminderOn;

    /**
     * The Last Modified Date Time.
     * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Recurrence.
     * The recurrence pattern for the task.
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
    public PatternedRecurrence recurrence;

    /**
     * The Reminder Date Time.
     * The date and time for a reminder alert of the task to occur.
     */
    @SerializedName(value = "reminderDateTime", alternate = {"ReminderDateTime"})
    @Expose
    public DateTimeTimeZone reminderDateTime;

    /**
     * The Status.
     * Indicates the state or progress of the task. Possible values are: notStarted, inProgress, completed, waitingOnOthers, deferred.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public TaskStatus status;

    /**
     * The Title.
     * A brief description of the task.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
    public String title;

    /**
     * The Extensions.
     * The collection of open extensions defined for the task. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
    public ExtensionCollectionPage extensions;

    /**
     * The Linked Resources.
     * A collection of resources linked to the task.
     */
    @SerializedName(value = "linkedResources", alternate = {"LinkedResources"})
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
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }

        if (json.has("linkedResources")) {
            linkedResources = serializer.deserializeObject(json.get("linkedResources").toString(), LinkedResourceCollectionPage.class);
        }
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.NotificationTemplateBrandingOptions;
import com.microsoft.graph.models.extensions.LocalizedNotificationMessage;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Message Template.
 */
public class NotificationMessageTemplate extends Entity implements IJsonBackedObject {


    /**
     * The Branding Options.
     * The Message Template Branding Options. Branding is defined in the Intune Admin Console. Possible values are: none, includeCompanyLogo, includeCompanyName, includeContactInformation.
     */
    @SerializedName("brandingOptions")
    @Expose
    public EnumSet<NotificationTemplateBrandingOptions> brandingOptions;

    /**
     * The Default Locale.
     * The default locale to fallback onto when the requested locale is not available.
     */
    @SerializedName("defaultLocale")
    @Expose
    public String defaultLocale;

    /**
     * The Display Name.
     * Display name for the Notification Message Template.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Localized Notification Messages.
     * The list of localized messages for this Notification Message Template.
     */
    public LocalizedNotificationMessageCollectionPage localizedNotificationMessages;


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


        if (json.has("localizedNotificationMessages")) {
            final LocalizedNotificationMessageCollectionResponse response = new LocalizedNotificationMessageCollectionResponse();
            if (json.has("localizedNotificationMessages@odata.nextLink")) {
                response.nextLink = json.get("localizedNotificationMessages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("localizedNotificationMessages").toString(), JsonObject[].class);
            final LocalizedNotificationMessage[] array = new LocalizedNotificationMessage[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), LocalizedNotificationMessage.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            localizedNotificationMessages = new LocalizedNotificationMessageCollectionPage(response, null);
        }
    }
}

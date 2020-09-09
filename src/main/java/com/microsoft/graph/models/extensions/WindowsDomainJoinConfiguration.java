// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Domain Join Configuration.
 */
public class WindowsDomainJoinConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Active Directory Domain Name.
     * Active Directory domain name to join.
     */
    @SerializedName("activeDirectoryDomainName")
    @Expose
    public String activeDirectoryDomainName;

    /**
     * The Computer Name Static Prefix.
     * Fixed prefix to be used for computer name.
     */
    @SerializedName("computerNameStaticPrefix")
    @Expose
    public String computerNameStaticPrefix;

    /**
     * The Computer Name Suffix Random Char Count.
     * Dynamically generated characters used as suffix for computer name. Valid values 3 to 14
     */
    @SerializedName("computerNameSuffixRandomCharCount")
    @Expose
    public Integer computerNameSuffixRandomCharCount;

    /**
     * The Organizational Unit.
     * Organizational unit (OU) where the computer account will be created. If this parameter is NULL, the well known computer object container will be used as published in the domain.
     */
    @SerializedName("organizationalUnit")
    @Expose
    public String organizationalUnit;

    /**
     * The Network Access Configurations.
     * Reference to device configurations required for network connectivity
     */
    public DeviceConfigurationCollectionPage networkAccessConfigurations;


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


        if (json.has("networkAccessConfigurations")) {
            final DeviceConfigurationCollectionResponse response = new DeviceConfigurationCollectionResponse();
            if (json.has("networkAccessConfigurations@odata.nextLink")) {
                response.nextLink = json.get("networkAccessConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("networkAccessConfigurations").toString(), JsonObject[].class);
            final DeviceConfiguration[] array = new DeviceConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            networkAccessConfigurations = new DeviceConfigurationCollectionPage(response, null);
        }
    }
}

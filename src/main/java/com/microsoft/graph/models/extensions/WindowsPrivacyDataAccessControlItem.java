// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsPrivacyDataAccessLevel;
import com.microsoft.graph.models.generated.WindowsPrivacyDataCategory;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Privacy Data Access Control Item.
 */
public class WindowsPrivacyDataAccessControlItem extends Entity implements IJsonBackedObject {


    /**
     * The Access Level.
     * This indicates an access level for the privacy data category to which the specified application will be given to.
     */
    @SerializedName(value = "accessLevel", alternate = {"AccessLevel"})
    @Expose
    public WindowsPrivacyDataAccessLevel accessLevel;

    /**
     * The App Display Name.
     * The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
    public String appDisplayName;

    /**
     * The App Package Family Name.
     * The Package Family Name of a Windows app. When set, the access level applies to the specified application.
     */
    @SerializedName(value = "appPackageFamilyName", alternate = {"AppPackageFamilyName"})
    @Expose
    public String appPackageFamilyName;

    /**
     * The Data Category.
     * This indicates a privacy data category to which the specific access control will apply.
     */
    @SerializedName(value = "dataCategory", alternate = {"DataCategory"})
    @Expose
    public WindowsPrivacyDataCategory dataCategory;


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

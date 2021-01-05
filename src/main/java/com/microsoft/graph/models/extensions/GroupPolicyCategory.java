// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Category.
 */
public class GroupPolicyCategory extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The string id of the category's display name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Is Root.
     * Defines if the category is a root category
     */
    @SerializedName(value = "isRoot", alternate = {"IsRoot"})
    @Expose
    public Boolean isRoot;

    /**
     * The Last Modified Date Time.
     * The date and time the entity was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Children.
     * The children categories
     */
    public GroupPolicyCategoryCollectionPage children;

    /**
     * The Definition File.
     * The id of the definition file the category came from
     */
    @SerializedName(value = "definitionFile", alternate = {"DefinitionFile"})
    @Expose
    public GroupPolicyDefinitionFile definitionFile;

    /**
     * The Definitions.
     * The immediate GroupPolicyDefinition children of the category
     */
    public GroupPolicyDefinitionCollectionPage definitions;

    /**
     * The Parent.
     * The parent category
     */
    @SerializedName(value = "parent", alternate = {"Parent"})
    @Expose
    public GroupPolicyCategory parent;


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


        if (json.has("children")) {
            children = serializer.deserializeObject(json.get("children").toString(), GroupPolicyCategoryCollectionPage.class);
        }

        if (json.has("definitions")) {
            definitions = serializer.deserializeObject(json.get("definitions").toString(), GroupPolicyDefinitionCollectionPage.class);
        }
    }
}

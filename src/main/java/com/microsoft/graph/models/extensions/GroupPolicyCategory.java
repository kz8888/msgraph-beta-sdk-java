// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Category.
 */
public class GroupPolicyCategory extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The string id of the category's display name
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Root.
     * Defines if the category is a root category
     */
    @SerializedName("isRoot")
    @Expose
    public Boolean isRoot;

    /**
     * The Last Modified Date Time.
     * The date and time the entity was last modified.
     */
    @SerializedName("lastModifiedDateTime")
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
    @SerializedName("definitionFile")
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
    @SerializedName("parent")
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
            final GroupPolicyCategoryCollectionResponse response = new GroupPolicyCategoryCollectionResponse();
            if (json.has("children@odata.nextLink")) {
                response.nextLink = json.get("children@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("children").toString(), JsonObject[].class);
            final GroupPolicyCategory[] array = new GroupPolicyCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            children = new GroupPolicyCategoryCollectionPage(response, null);
        }

        if (json.has("definitions")) {
            final GroupPolicyDefinitionCollectionResponse response = new GroupPolicyDefinitionCollectionResponse();
            if (json.has("definitions@odata.nextLink")) {
                response.nextLink = json.get("definitions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("definitions").toString(), JsonObject[].class);
            final GroupPolicyDefinition[] array = new GroupPolicyDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupPolicyDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            definitions = new GroupPolicyDefinitionCollectionPage(response, null);
        }
    }
}

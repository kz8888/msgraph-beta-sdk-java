// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import com.microsoft.graph.models.extensions.AccessPackageResourceRole;
import com.microsoft.graph.models.extensions.AccessPackageResourceScope;
import com.microsoft.graph.models.extensions.AccessPackageSubject;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Resource Role.
 */
public class AccessPackageAssignmentResourceRole extends Entity implements IJsonBackedObject {


    /**
     * The Origin Id.
     * 
     */
    @SerializedName(value = "originId", alternate = {"OriginId"})
    @Expose
	@Nullable
    public String originId;

    /**
     * The Origin System.
     * 
     */
    @SerializedName(value = "originSystem", alternate = {"OriginSystem"})
    @Expose
	@Nullable
    public String originSystem;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The Access Package Assignments.
     * 
     */
    @SerializedName(value = "accessPackageAssignments", alternate = {"AccessPackageAssignments"})
    @Expose
	@Nullable
    public AccessPackageAssignmentCollectionPage accessPackageAssignments;

    /**
     * The Access Package Resource Role.
     * 
     */
    @SerializedName(value = "accessPackageResourceRole", alternate = {"AccessPackageResourceRole"})
    @Expose
	@Nullable
    public AccessPackageResourceRole accessPackageResourceRole;

    /**
     * The Access Package Resource Scope.
     * 
     */
    @SerializedName(value = "accessPackageResourceScope", alternate = {"AccessPackageResourceScope"})
    @Expose
	@Nullable
    public AccessPackageResourceScope accessPackageResourceScope;

    /**
     * The Access Package Subject.
     * 
     */
    @SerializedName(value = "accessPackageSubject", alternate = {"AccessPackageSubject"})
    @Expose
	@Nullable
    public AccessPackageSubject accessPackageSubject;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("accessPackageAssignments")) {
            accessPackageAssignments = serializer.deserializeObject(json.get("accessPackageAssignments").toString(), AccessPackageAssignmentCollectionPage.class);
        }
    }
}

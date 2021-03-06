// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppScope;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment.
 */
public class UnifiedRoleAssignment extends Entity implements IJsonBackedObject {


    /**
     * The App Scope Id.
     * Id of the app specific scope when the assignment scope is app specific. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use '/' for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.
     */
    @SerializedName(value = "appScopeId", alternate = {"AppScopeId"})
    @Expose
    public String appScopeId;

    /**
     * The Condition.
     * 
     */
    @SerializedName(value = "condition", alternate = {"Condition"})
    @Expose
    public String condition;

    /**
     * The Directory Scope Id.
     * Id of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     */
    @SerializedName(value = "directoryScopeId", alternate = {"DirectoryScopeId"})
    @Expose
    public String directoryScopeId;

    /**
     * The Principal Id.
     * Objectid of the principal to which the assignment is granted.
     */
    @SerializedName(value = "principalId", alternate = {"PrincipalId"})
    @Expose
    public String principalId;

    /**
     * The Resource Scope.
     * The scope at which the unifiedRoleAssignment applies. This is '/' for service-wide. DO NOT USE. This property will be deprecated soon.
     */
    @SerializedName(value = "resourceScope", alternate = {"ResourceScope"})
    @Expose
    public String resourceScope;

    /**
     * The Role Definition Id.
     * ID of the unifiedRoleDefinition the assignment is for. Read only.
     */
    @SerializedName(value = "roleDefinitionId", alternate = {"RoleDefinitionId"})
    @Expose
    public String roleDefinitionId;

    /**
     * The App Scope.
     * 
     */
    @SerializedName(value = "appScope", alternate = {"AppScope"})
    @Expose
    public AppScope appScope;

    /**
     * The Directory Scope.
     * 
     */
    @SerializedName(value = "directoryScope", alternate = {"DirectoryScope"})
    @Expose
    public DirectoryObject directoryScope;

    /**
     * The Principal.
     * 
     */
    @SerializedName(value = "principal", alternate = {"Principal"})
    @Expose
    public DirectoryObject principal;

    /**
     * The Role Definition.
     * 
     */
    @SerializedName(value = "roleDefinition", alternate = {"RoleDefinition"})
    @Expose
    public UnifiedRoleDefinition roleDefinition;


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

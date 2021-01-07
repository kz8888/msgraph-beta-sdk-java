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
import com.microsoft.graph.models.generated.SecurityBaselineComplianceState;
import com.microsoft.graph.models.extensions.SecurityBaselineSettingState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.SecurityBaselineSettingStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline State.
 */
public class SecurityBaselineState extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The display name of the security baseline
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Security Baseline Template Id.
     * The security baseline template id
     */
    @SerializedName(value = "securityBaselineTemplateId", alternate = {"SecurityBaselineTemplateId"})
    @Expose
	@Nullable
    public String securityBaselineTemplateId;

    /**
     * The State.
     * Security baseline compliance state
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public SecurityBaselineComplianceState state;

    /**
     * The User Principal Name.
     * User Principal Name
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The Setting States.
     * The security baseline state for different settings for a device
     */
    @SerializedName(value = "settingStates", alternate = {"SettingStates"})
    @Expose
	@Nullable
    public SecurityBaselineSettingStateCollectionPage settingStates;


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


        if (json.has("settingStates")) {
            settingStates = serializer.deserializeObject(json.get("settingStates").toString(), SecurityBaselineSettingStateCollectionPage.class);
        }
    }
}

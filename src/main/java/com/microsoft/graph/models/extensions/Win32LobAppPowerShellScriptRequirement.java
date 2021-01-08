// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Win32LobAppPowerShellScriptDetectionType;
import com.microsoft.graph.models.generated.RunAsAccountType;
import com.microsoft.graph.models.extensions.Win32LobAppRequirement;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Power Shell Script Requirement.
 */
public class Win32LobAppPowerShellScriptRequirement extends Win32LobAppRequirement implements IJsonBackedObject {


    /**
     * The Detection Type.
     * The detection type for script output
     */
    @SerializedName(value = "detectionType", alternate = {"DetectionType"})
    @Expose
	@Nullable
    public Win32LobAppPowerShellScriptDetectionType detectionType;

    /**
     * The Display Name.
     * The unique display name for this rule
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Enforce Signature Check.
     * A value indicating whether signature check is enforced
     */
    @SerializedName(value = "enforceSignatureCheck", alternate = {"EnforceSignatureCheck"})
    @Expose
	@Nullable
    public Boolean enforceSignatureCheck;

    /**
     * The Run As32Bit.
     * A value indicating whether this script should run as 32-bit
     */
    @SerializedName(value = "runAs32Bit", alternate = {"RunAs32Bit"})
    @Expose
	@Nullable
    public Boolean runAs32Bit;

    /**
     * The Run As Account.
     * Indicates the type of execution context the script runs in.
     */
    @SerializedName(value = "runAsAccount", alternate = {"RunAsAccount"})
    @Expose
	@Nullable
    public RunAsAccountType runAsAccount;

    /**
     * The Script Content.
     * The base64 encoded script content to detect Win32 Line of Business (LoB) app
     */
    @SerializedName(value = "scriptContent", alternate = {"ScriptContent"})
    @Expose
	@Nullable
    public String scriptContent;


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

    }
}

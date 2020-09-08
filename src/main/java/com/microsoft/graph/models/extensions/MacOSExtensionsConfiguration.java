// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MacOSKernelExtension;
import com.microsoft.graph.models.extensions.MacOSSystemExtension;
import com.microsoft.graph.models.extensions.MacOSSystemExtensionTypeMapping;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSExtensions Configuration.
 */
public class MacOSExtensionsConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Kernel Extension Allowed Team Identifiers.
     * All kernel extensions validly signed by the team identifiers in this list will be allowed to load.
     */
    @SerializedName("kernelExtensionAllowedTeamIdentifiers")
    @Expose
    public java.util.List<String> kernelExtensionAllowedTeamIdentifiers;

    /**
     * The Kernel Extension Overrides Allowed.
     * If set to true, users can approve additional kernel extensions not explicitly allowed by configurations profiles.
     */
    @SerializedName("kernelExtensionOverridesAllowed")
    @Expose
    public Boolean kernelExtensionOverridesAllowed;

    /**
     * The Kernel Extensions Allowed.
     * A list of kernel extensions that will be allowed to load. . This collection can contain a maximum of 500 elements.
     */
    @SerializedName("kernelExtensionsAllowed")
    @Expose
    public java.util.List<MacOSKernelExtension> kernelExtensionsAllowed;

    /**
     * The System Extensions Allowed.
     * Gets or sets a list of allowed macOS system extensions. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("systemExtensionsAllowed")
    @Expose
    public java.util.List<MacOSSystemExtension> systemExtensionsAllowed;

    /**
     * The System Extensions Allowed Team Identifiers.
     * Gets or sets a list of allowed team identifiers. Any system extension signed with any of the specified team identifiers will be approved.
     */
    @SerializedName("systemExtensionsAllowedTeamIdentifiers")
    @Expose
    public java.util.List<String> systemExtensionsAllowedTeamIdentifiers;

    /**
     * The System Extensions Allowed Types.
     * Gets or sets a list of allowed macOS system extension types. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("systemExtensionsAllowedTypes")
    @Expose
    public java.util.List<MacOSSystemExtensionTypeMapping> systemExtensionsAllowedTypes;

    /**
     * The System Extensions Block Override.
     * Gets or sets whether to allow the user to approve additional system extensions not explicitly allowed by configuration profiles.
     */
    @SerializedName("systemExtensionsBlockOverride")
    @Expose
    public Boolean systemExtensionsBlockOverride;


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

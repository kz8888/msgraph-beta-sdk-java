// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Win32LobAppRuleOperator;
import com.microsoft.graph.models.extensions.Win32LobAppRule;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Product Code Rule.
 */
public class Win32LobAppProductCodeRule extends Win32LobAppRule implements IJsonBackedObject {


    /**
     * The Product Code.
     * The product code of the app.
     */
    @SerializedName(value = "productCode", alternate = {"ProductCode"})
    @Expose
	@Nullable
    public String productCode;

    /**
     * The Product Version.
     * The product version comparison value.
     */
    @SerializedName(value = "productVersion", alternate = {"ProductVersion"})
    @Expose
	@Nullable
    public String productVersion;

    /**
     * The Product Version Operator.
     * The product version comparison operator. Possible values are: notConfigured, equal, notEqual, greaterThan, greaterThanOrEqual, lessThan, lessThanOrEqual.
     */
    @SerializedName(value = "productVersionOperator", alternate = {"ProductVersionOperator"})
    @Expose
	@Nullable
    public Win32LobAppRuleOperator productVersionOperator;


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

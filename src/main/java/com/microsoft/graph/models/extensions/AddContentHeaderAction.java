// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ContentAlignment;
import com.microsoft.graph.models.extensions.InformationProtectionAction;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add Content Header Action.
 */
public class AddContentHeaderAction extends InformationProtectionAction implements IJsonBackedObject {


    /**
     * The Alignment.
     * 
     */
    @SerializedName(value = "alignment", alternate = {"Alignment"})
    @Expose
	@Nullable
    public ContentAlignment alignment;

    /**
     * The Font Color.
     * 
     */
    @SerializedName(value = "fontColor", alternate = {"FontColor"})
    @Expose
	@Nullable
    public String fontColor;

    /**
     * The Font Name.
     * 
     */
    @SerializedName(value = "fontName", alternate = {"FontName"})
    @Expose
	@Nullable
    public String fontName;

    /**
     * The Font Size.
     * 
     */
    @SerializedName(value = "fontSize", alternate = {"FontSize"})
    @Expose
	@Nullable
    public Integer fontSize;

    /**
     * The Margin.
     * 
     */
    @SerializedName(value = "margin", alternate = {"Margin"})
    @Expose
	@Nullable
    public Integer margin;

    /**
     * The Text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public String text;

    /**
     * The Ui Element Name.
     * 
     */
    @SerializedName(value = "uiElementName", alternate = {"UiElementName"})
    @Expose
	@Nullable
    public String uiElementName;


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

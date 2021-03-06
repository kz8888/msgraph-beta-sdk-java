// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.LanguageProficiencyLevel;
import com.microsoft.graph.models.extensions.ItemFacet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Language Proficiency.
 */
public class LanguageProficiency extends ItemFacet implements IJsonBackedObject {


    /**
     * The Display Name.
     * Contains the long-form name for the language.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Proficiency.
     * 
     */
    @SerializedName(value = "proficiency", alternate = {"Proficiency"})
    @Expose
    public LanguageProficiencyLevel proficiency;

    /**
     * The Reading.
     * Represents the users reading comprehension for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     */
    @SerializedName(value = "reading", alternate = {"Reading"})
    @Expose
    public LanguageProficiencyLevel reading;

    /**
     * The Spoken.
     * Represents the users spoken proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     */
    @SerializedName(value = "spoken", alternate = {"Spoken"})
    @Expose
    public LanguageProficiencyLevel spoken;

    /**
     * The Tag.
     * Contains the four-character BCP47 name for the language (en-US, no-NB, en-AU).
     */
    @SerializedName(value = "tag", alternate = {"Tag"})
    @Expose
    public String tag;

    /**
     * The Written.
     * Represents the users written proficiency for the language represented by the object. Possible values are: elementary, conversational, limitedWorking, professionalWorking, fullProfessional, nativeOrBilingual, unknownFutureValue.
     */
    @SerializedName(value = "written", alternate = {"Written"})
    @Expose
    public LanguageProficiencyLevel written;


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

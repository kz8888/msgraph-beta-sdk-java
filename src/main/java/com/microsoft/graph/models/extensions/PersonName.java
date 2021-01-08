// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.YomiPersonName;
import com.microsoft.graph.models.extensions.ItemFacet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Name.
 */
public class PersonName extends ItemFacet implements IJsonBackedObject {


    /**
     * The Display Name.
     * Provides an ordered rendering of firstName and lastName depending on the locale of the user or their device.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The First.
     * First name of the user.
     */
    @SerializedName(value = "first", alternate = {"First"})
    @Expose
    public String first;

    /**
     * The Initials.
     * Initials of the user.
     */
    @SerializedName(value = "initials", alternate = {"Initials"})
    @Expose
    public String initials;

    /**
     * The Language Tag.
     * Contains the name for the language (en-US, no-NB, en-AU) following IETF BCP47 format.
     */
    @SerializedName(value = "languageTag", alternate = {"LanguageTag"})
    @Expose
    public String languageTag;

    /**
     * The Last.
     * Last name of the user.
     */
    @SerializedName(value = "last", alternate = {"Last"})
    @Expose
    public String last;

    /**
     * The Maiden.
     * Maiden name of the user.
     */
    @SerializedName(value = "maiden", alternate = {"Maiden"})
    @Expose
    public String maiden;

    /**
     * The Middle.
     * Middle name of the user.
     */
    @SerializedName(value = "middle", alternate = {"Middle"})
    @Expose
    public String middle;

    /**
     * The Nickname.
     * Nickname of the user.
     */
    @SerializedName(value = "nickname", alternate = {"Nickname"})
    @Expose
    public String nickname;

    /**
     * The Pronunciation.
     * Guidance on how to pronounce the users name.
     */
    @SerializedName(value = "pronunciation", alternate = {"Pronunciation"})
    @Expose
    public YomiPersonName pronunciation;

    /**
     * The Suffix.
     * Designators used after the users name (eg: PhD.)
     */
    @SerializedName(value = "suffix", alternate = {"Suffix"})
    @Expose
    public String suffix;

    /**
     * The Title.
     * Honorifics used to prefix a users name (eg: Dr, Sir, Madam, Mrs.)
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
    public String title;


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

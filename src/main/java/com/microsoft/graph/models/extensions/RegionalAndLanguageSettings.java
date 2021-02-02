// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.LocaleInfo;
import com.microsoft.graph.models.extensions.RegionalFormatOverrides;
import com.microsoft.graph.models.extensions.TranslationPreferences;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Regional And Language Settings.
 */
public class RegionalAndLanguageSettings extends Entity implements IJsonBackedObject {


    /**
     * The Authoring Languages.
     * Prioritized list of languages the user reads and authors in.Returned by default. Not nullable.
     */
    @SerializedName(value = "authoringLanguages", alternate = {"AuthoringLanguages"})
    @Expose
    public java.util.List<LocaleInfo> authoringLanguages;

    /**
     * The Default Display Language.
     * The  user's preferred user interface language (menus, buttons, ribbons, warning messages) for Microsoft web applications.Returned by default. Not nullable.
     */
    @SerializedName(value = "defaultDisplayLanguage", alternate = {"DefaultDisplayLanguage"})
    @Expose
    public LocaleInfo defaultDisplayLanguage;

    /**
     * The Default Regional Format.
     * The locale that drives the default date, time, and calendar formatting.Returned by default.
     */
    @SerializedName(value = "defaultRegionalFormat", alternate = {"DefaultRegionalFormat"})
    @Expose
    public LocaleInfo defaultRegionalFormat;

    /**
     * The Default Speech Input Language.
     * The language a user expected to use as input for text to speech scenarios.Returned by default.
     */
    @SerializedName(value = "defaultSpeechInputLanguage", alternate = {"DefaultSpeechInputLanguage"})
    @Expose
    public LocaleInfo defaultSpeechInputLanguage;

    /**
     * The Default Translation Language.
     * The language a user expects to have documents, emails, and messages translated into.Returned by default.
     */
    @SerializedName(value = "defaultTranslationLanguage", alternate = {"DefaultTranslationLanguage"})
    @Expose
    public LocaleInfo defaultTranslationLanguage;

    /**
     * The Regional Format Overrides.
     * Allows a user to override their defaultRegionalFormat with field specific formats.Returned by default.
     */
    @SerializedName(value = "regionalFormatOverrides", alternate = {"RegionalFormatOverrides"})
    @Expose
    public RegionalFormatOverrides regionalFormatOverrides;

    /**
     * The Translation Preferences.
     * 
     */
    @SerializedName(value = "translationPreferences", alternate = {"TranslationPreferences"})
    @Expose
    public TranslationPreferences translationPreferences;


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

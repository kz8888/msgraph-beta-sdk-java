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
import com.microsoft.graph.models.extensions.AppListItem;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Single Sign On Settings.
 */
public class IosSingleSignOnSettings implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allowed Apps List.
     * List of app identifiers that are allowed to use this login. If this field is omitted, the login applies to all applications on the device. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "allowedAppsList", alternate = {"AllowedAppsList"})
    @Expose
	@Nullable
    public java.util.List<AppListItem> allowedAppsList;

    /**
     * The Allowed Urls.
     * List of HTTP URLs that must be matched in order to use this login. With iOS 9.0 or later, a wildcard characters may be used.
     */
    @SerializedName(value = "allowedUrls", alternate = {"AllowedUrls"})
    @Expose
	@Nullable
    public java.util.List<String> allowedUrls;

    /**
     * The Display Name.
     * The display name of login settings shown on the receiving device.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Kerberos Principal Name.
     * A Kerberos principal name. If not provided, the user is prompted for one during profile installation.
     */
    @SerializedName(value = "kerberosPrincipalName", alternate = {"KerberosPrincipalName"})
    @Expose
	@Nullable
    public String kerberosPrincipalName;

    /**
     * The Kerberos Realm.
     * A Kerberos realm name. Case sensitive.
     */
    @SerializedName(value = "kerberosRealm", alternate = {"KerberosRealm"})
    @Expose
	@Nullable
    public String kerberosRealm;


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

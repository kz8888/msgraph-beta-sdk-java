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
import com.microsoft.graph.models.extensions.PostalAddressType;
import com.microsoft.graph.models.extensions.Currency;
import com.microsoft.graph.models.extensions.PaymentMethod;
import com.microsoft.graph.models.extensions.PaymentTerm;
import com.microsoft.graph.models.extensions.Picture;
import com.microsoft.graph.models.extensions.ShipmentMethod;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PictureCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Customer.
 */
public class Customer extends Entity implements IJsonBackedObject {


    /**
     * The Address.
     * 
     */
    @SerializedName(value = "address", alternate = {"Address"})
    @Expose
	@Nullable
    public PostalAddressType address;

    /**
     * The Blocked.
     * 
     */
    @SerializedName(value = "blocked", alternate = {"Blocked"})
    @Expose
	@Nullable
    public String blocked;

    /**
     * The Currency Code.
     * 
     */
    @SerializedName(value = "currencyCode", alternate = {"CurrencyCode"})
    @Expose
	@Nullable
    public String currencyCode;

    /**
     * The Currency Id.
     * 
     */
    @SerializedName(value = "currencyId", alternate = {"CurrencyId"})
    @Expose
	@Nullable
    public java.util.UUID currencyId;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Email.
     * 
     */
    @SerializedName(value = "email", alternate = {"Email"})
    @Expose
	@Nullable
    public String email;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public String number;

    /**
     * The Payment Method Id.
     * 
     */
    @SerializedName(value = "paymentMethodId", alternate = {"PaymentMethodId"})
    @Expose
	@Nullable
    public java.util.UUID paymentMethodId;

    /**
     * The Payment Terms Id.
     * 
     */
    @SerializedName(value = "paymentTermsId", alternate = {"PaymentTermsId"})
    @Expose
	@Nullable
    public java.util.UUID paymentTermsId;

    /**
     * The Phone Number.
     * 
     */
    @SerializedName(value = "phoneNumber", alternate = {"PhoneNumber"})
    @Expose
	@Nullable
    public String phoneNumber;

    /**
     * The Shipment Method Id.
     * 
     */
    @SerializedName(value = "shipmentMethodId", alternate = {"ShipmentMethodId"})
    @Expose
	@Nullable
    public java.util.UUID shipmentMethodId;

    /**
     * The Tax Area Display Name.
     * 
     */
    @SerializedName(value = "taxAreaDisplayName", alternate = {"TaxAreaDisplayName"})
    @Expose
	@Nullable
    public String taxAreaDisplayName;

    /**
     * The Tax Area Id.
     * 
     */
    @SerializedName(value = "taxAreaId", alternate = {"TaxAreaId"})
    @Expose
	@Nullable
    public java.util.UUID taxAreaId;

    /**
     * The Tax Liable.
     * 
     */
    @SerializedName(value = "taxLiable", alternate = {"TaxLiable"})
    @Expose
	@Nullable
    public Boolean taxLiable;

    /**
     * The Tax Registration Number.
     * 
     */
    @SerializedName(value = "taxRegistrationNumber", alternate = {"TaxRegistrationNumber"})
    @Expose
	@Nullable
    public String taxRegistrationNumber;

    /**
     * The Type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The Website.
     * 
     */
    @SerializedName(value = "website", alternate = {"Website"})
    @Expose
	@Nullable
    public String website;

    /**
     * The Currency.
     * 
     */
    @SerializedName(value = "currency", alternate = {"Currency"})
    @Expose
	@Nullable
    public Currency currency;

    /**
     * The Payment Method.
     * 
     */
    @SerializedName(value = "paymentMethod", alternate = {"PaymentMethod"})
    @Expose
	@Nullable
    public PaymentMethod paymentMethod;

    /**
     * The Payment Term.
     * 
     */
    @SerializedName(value = "paymentTerm", alternate = {"PaymentTerm"})
    @Expose
	@Nullable
    public PaymentTerm paymentTerm;

    /**
     * The Picture.
     * 
     */
    @SerializedName(value = "picture", alternate = {"Picture"})
    @Expose
	@Nullable
    public PictureCollectionPage picture;

    /**
     * The Shipment Method.
     * 
     */
    @SerializedName(value = "shipmentMethod", alternate = {"ShipmentMethod"})
    @Expose
	@Nullable
    public ShipmentMethod shipmentMethod;


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


        if (json.has("picture")) {
            picture = serializer.deserializeObject(json.get("picture").toString(), PictureCollectionPage.class);
        }
    }
}

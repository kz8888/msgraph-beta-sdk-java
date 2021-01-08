// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aged Accounts Payable.
 */
public class AgedAccountsPayable extends Entity implements IJsonBackedObject {


    /**
     * The Aged As Of Date.
     * 
     */
    @SerializedName(value = "agedAsOfDate", alternate = {"AgedAsOfDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly agedAsOfDate;

    /**
     * The Balance Due.
     * 
     */
    @SerializedName(value = "balanceDue", alternate = {"BalanceDue"})
    @Expose
	@Nullable
    public java.math.BigDecimal balanceDue;

    /**
     * The Currency Code.
     * 
     */
    @SerializedName(value = "currencyCode", alternate = {"CurrencyCode"})
    @Expose
	@Nullable
    public String currencyCode;

    /**
     * The Current Amount.
     * 
     */
    @SerializedName(value = "currentAmount", alternate = {"CurrentAmount"})
    @Expose
	@Nullable
    public java.math.BigDecimal currentAmount;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Period1Amount.
     * 
     */
    @SerializedName(value = "period1Amount", alternate = {"Period1Amount"})
    @Expose
	@Nullable
    public java.math.BigDecimal period1Amount;

    /**
     * The Period2Amount.
     * 
     */
    @SerializedName(value = "period2Amount", alternate = {"Period2Amount"})
    @Expose
	@Nullable
    public java.math.BigDecimal period2Amount;

    /**
     * The Period3Amount.
     * 
     */
    @SerializedName(value = "period3Amount", alternate = {"Period3Amount"})
    @Expose
	@Nullable
    public java.math.BigDecimal period3Amount;

    /**
     * The Period Length Filter.
     * 
     */
    @SerializedName(value = "periodLengthFilter", alternate = {"PeriodLengthFilter"})
    @Expose
	@Nullable
    public String periodLengthFilter;

    /**
     * The Vendor Number.
     * 
     */
    @SerializedName(value = "vendorNumber", alternate = {"VendorNumber"})
    @Expose
	@Nullable
    public String vendorNumber;


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

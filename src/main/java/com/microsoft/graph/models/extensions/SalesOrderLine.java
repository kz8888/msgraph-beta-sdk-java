// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Account;
import com.microsoft.graph.models.extensions.Item;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Order Line.
 */
public class SalesOrderLine extends Entity implements IJsonBackedObject {


    /**
     * The Account Id.
     * 
     */
    @SerializedName(value = "accountId", alternate = {"AccountId"})
    @Expose
    public java.util.UUID accountId;

    /**
     * The Amount Excluding Tax.
     * 
     */
    @SerializedName(value = "amountExcludingTax", alternate = {"AmountExcludingTax"})
    @Expose
    public java.math.BigDecimal amountExcludingTax;

    /**
     * The Amount Including Tax.
     * 
     */
    @SerializedName(value = "amountIncludingTax", alternate = {"AmountIncludingTax"})
    @Expose
    public java.math.BigDecimal amountIncludingTax;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Discount Amount.
     * 
     */
    @SerializedName(value = "discountAmount", alternate = {"DiscountAmount"})
    @Expose
    public java.math.BigDecimal discountAmount;

    /**
     * The Discount Applied Before Tax.
     * 
     */
    @SerializedName(value = "discountAppliedBeforeTax", alternate = {"DiscountAppliedBeforeTax"})
    @Expose
    public Boolean discountAppliedBeforeTax;

    /**
     * The Discount Percent.
     * 
     */
    @SerializedName(value = "discountPercent", alternate = {"DiscountPercent"})
    @Expose
    public java.math.BigDecimal discountPercent;

    /**
     * The Document Id.
     * 
     */
    @SerializedName(value = "documentId", alternate = {"DocumentId"})
    @Expose
    public java.util.UUID documentId;

    /**
     * The Invoice Discount Allocation.
     * 
     */
    @SerializedName(value = "invoiceDiscountAllocation", alternate = {"InvoiceDiscountAllocation"})
    @Expose
    public java.math.BigDecimal invoiceDiscountAllocation;

    /**
     * The Invoiced Quantity.
     * 
     */
    @SerializedName(value = "invoicedQuantity", alternate = {"InvoicedQuantity"})
    @Expose
    public java.math.BigDecimal invoicedQuantity;

    /**
     * The Invoice Quantity.
     * 
     */
    @SerializedName(value = "invoiceQuantity", alternate = {"InvoiceQuantity"})
    @Expose
    public java.math.BigDecimal invoiceQuantity;

    /**
     * The Item Id.
     * 
     */
    @SerializedName(value = "itemId", alternate = {"ItemId"})
    @Expose
    public java.util.UUID itemId;

    /**
     * The Line Type.
     * 
     */
    @SerializedName(value = "lineType", alternate = {"LineType"})
    @Expose
    public String lineType;

    /**
     * The Net Amount.
     * 
     */
    @SerializedName(value = "netAmount", alternate = {"NetAmount"})
    @Expose
    public java.math.BigDecimal netAmount;

    /**
     * The Net Amount Including Tax.
     * 
     */
    @SerializedName(value = "netAmountIncludingTax", alternate = {"NetAmountIncludingTax"})
    @Expose
    public java.math.BigDecimal netAmountIncludingTax;

    /**
     * The Net Tax Amount.
     * 
     */
    @SerializedName(value = "netTaxAmount", alternate = {"NetTaxAmount"})
    @Expose
    public java.math.BigDecimal netTaxAmount;

    /**
     * The Quantity.
     * 
     */
    @SerializedName(value = "quantity", alternate = {"Quantity"})
    @Expose
    public java.math.BigDecimal quantity;

    /**
     * The Sequence.
     * 
     */
    @SerializedName(value = "sequence", alternate = {"Sequence"})
    @Expose
    public Integer sequence;

    /**
     * The Shipment Date.
     * 
     */
    @SerializedName(value = "shipmentDate", alternate = {"ShipmentDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly shipmentDate;

    /**
     * The Shipped Quantity.
     * 
     */
    @SerializedName(value = "shippedQuantity", alternate = {"ShippedQuantity"})
    @Expose
    public java.math.BigDecimal shippedQuantity;

    /**
     * The Ship Quantity.
     * 
     */
    @SerializedName(value = "shipQuantity", alternate = {"ShipQuantity"})
    @Expose
    public java.math.BigDecimal shipQuantity;

    /**
     * The Tax Code.
     * 
     */
    @SerializedName(value = "taxCode", alternate = {"TaxCode"})
    @Expose
    public String taxCode;

    /**
     * The Tax Percent.
     * 
     */
    @SerializedName(value = "taxPercent", alternate = {"TaxPercent"})
    @Expose
    public java.math.BigDecimal taxPercent;

    /**
     * The Total Tax Amount.
     * 
     */
    @SerializedName(value = "totalTaxAmount", alternate = {"TotalTaxAmount"})
    @Expose
    public java.math.BigDecimal totalTaxAmount;

    /**
     * The Unit Of Measure Id.
     * 
     */
    @SerializedName(value = "unitOfMeasureId", alternate = {"UnitOfMeasureId"})
    @Expose
    public java.util.UUID unitOfMeasureId;

    /**
     * The Unit Price.
     * 
     */
    @SerializedName(value = "unitPrice", alternate = {"UnitPrice"})
    @Expose
    public java.math.BigDecimal unitPrice;

    /**
     * The Account.
     * 
     */
    @SerializedName(value = "account", alternate = {"Account"})
    @Expose
    public Account account;

    /**
     * The Item.
     * 
     */
    @SerializedName(value = "item", alternate = {"Item"})
    @Expose
    public Item item;


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

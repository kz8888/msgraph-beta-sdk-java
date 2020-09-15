// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PostalAddressType;
import com.microsoft.graph.models.extensions.Currency;
import com.microsoft.graph.models.extensions.PurchaseInvoiceLine;
import com.microsoft.graph.models.extensions.Vendor;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineCollectionResponse;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice.
 */
public class PurchaseInvoice extends Entity implements IJsonBackedObject {


    /**
     * The Buy From Address.
     * 
     */
    @SerializedName("buyFromAddress")
    @Expose
    public PostalAddressType buyFromAddress;

    /**
     * The Currency Code.
     * 
     */
    @SerializedName("currencyCode")
    @Expose
    public String currencyCode;

    /**
     * The Currency Id.
     * 
     */
    @SerializedName("currencyId")
    @Expose
    public java.util.UUID currencyId;

    /**
     * The Discount Amount.
     * 
     */
    @SerializedName("discountAmount")
    @Expose
    public java.math.BigDecimal discountAmount;

    /**
     * The Discount Applied Before Tax.
     * 
     */
    @SerializedName("discountAppliedBeforeTax")
    @Expose
    public Boolean discountAppliedBeforeTax;

    /**
     * The Due Date.
     * 
     */
    @SerializedName("dueDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly dueDate;

    /**
     * The Invoice Date.
     * 
     */
    @SerializedName("invoiceDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly invoiceDate;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Number.
     * 
     */
    @SerializedName("number")
    @Expose
    public String number;

    /**
     * The Pay To Address.
     * 
     */
    @SerializedName("payToAddress")
    @Expose
    public PostalAddressType payToAddress;

    /**
     * The Pay To Contact.
     * 
     */
    @SerializedName("payToContact")
    @Expose
    public String payToContact;

    /**
     * The Pay To Name.
     * 
     */
    @SerializedName("payToName")
    @Expose
    public String payToName;

    /**
     * The Pay To Vendor Id.
     * 
     */
    @SerializedName("payToVendorId")
    @Expose
    public java.util.UUID payToVendorId;

    /**
     * The Pay To Vendor Number.
     * 
     */
    @SerializedName("payToVendorNumber")
    @Expose
    public String payToVendorNumber;

    /**
     * The Prices Include Tax.
     * 
     */
    @SerializedName("pricesIncludeTax")
    @Expose
    public Boolean pricesIncludeTax;

    /**
     * The Ship To Address.
     * 
     */
    @SerializedName("shipToAddress")
    @Expose
    public PostalAddressType shipToAddress;

    /**
     * The Ship To Contact.
     * 
     */
    @SerializedName("shipToContact")
    @Expose
    public String shipToContact;

    /**
     * The Ship To Name.
     * 
     */
    @SerializedName("shipToName")
    @Expose
    public String shipToName;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public String status;

    /**
     * The Total Amount Excluding Tax.
     * 
     */
    @SerializedName("totalAmountExcludingTax")
    @Expose
    public java.math.BigDecimal totalAmountExcludingTax;

    /**
     * The Total Amount Including Tax.
     * 
     */
    @SerializedName("totalAmountIncludingTax")
    @Expose
    public java.math.BigDecimal totalAmountIncludingTax;

    /**
     * The Total Tax Amount.
     * 
     */
    @SerializedName("totalTaxAmount")
    @Expose
    public java.math.BigDecimal totalTaxAmount;

    /**
     * The Vendor Id.
     * 
     */
    @SerializedName("vendorId")
    @Expose
    public java.util.UUID vendorId;

    /**
     * The Vendor Invoice Number.
     * 
     */
    @SerializedName("vendorInvoiceNumber")
    @Expose
    public String vendorInvoiceNumber;

    /**
     * The Vendor Name.
     * 
     */
    @SerializedName("vendorName")
    @Expose
    public String vendorName;

    /**
     * The Vendor Number.
     * 
     */
    @SerializedName("vendorNumber")
    @Expose
    public String vendorNumber;

    /**
     * The Currency.
     * 
     */
    @SerializedName("currency")
    @Expose
    public Currency currency;

    /**
     * The Purchase Invoice Lines.
     * 
     */
    @SerializedName("purchaseInvoiceLines")
    @Expose
    public PurchaseInvoiceLineCollectionPage purchaseInvoiceLines;

    /**
     * The Vendor.
     * 
     */
    @SerializedName("vendor")
    @Expose
    public Vendor vendor;


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


        if (json.has("purchaseInvoiceLines")) {
            final PurchaseInvoiceLineCollectionResponse response = new PurchaseInvoiceLineCollectionResponse();
            if (json.has("purchaseInvoiceLines@odata.nextLink")) {
                response.nextLink = json.get("purchaseInvoiceLines@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("purchaseInvoiceLines").toString(), JsonObject[].class);
            final PurchaseInvoiceLine[] array = new PurchaseInvoiceLine[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PurchaseInvoiceLine.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            purchaseInvoiceLines = new PurchaseInvoiceLineCollectionPage(response, null);
        }
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Customer;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Customer Payment.
 */
public class CustomerPayment extends Entity implements IJsonBackedObject {


    /**
     * The Amount.
     * 
     */
    @SerializedName("amount")
    @Expose
    public java.math.BigDecimal amount;

    /**
     * The Applies To Invoice Id.
     * 
     */
    @SerializedName("appliesToInvoiceId")
    @Expose
    public java.util.UUID appliesToInvoiceId;

    /**
     * The Applies To Invoice Number.
     * 
     */
    @SerializedName("appliesToInvoiceNumber")
    @Expose
    public String appliesToInvoiceNumber;

    /**
     * The Comment.
     * 
     */
    @SerializedName("comment")
    @Expose
    public String comment;

    /**
     * The Contact Id.
     * 
     */
    @SerializedName("contactId")
    @Expose
    public String contactId;

    /**
     * The Customer Id.
     * 
     */
    @SerializedName("customerId")
    @Expose
    public java.util.UUID customerId;

    /**
     * The Customer Number.
     * 
     */
    @SerializedName("customerNumber")
    @Expose
    public String customerNumber;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Document Number.
     * 
     */
    @SerializedName("documentNumber")
    @Expose
    public String documentNumber;

    /**
     * The External Document Number.
     * 
     */
    @SerializedName("externalDocumentNumber")
    @Expose
    public String externalDocumentNumber;

    /**
     * The Journal Display Name.
     * 
     */
    @SerializedName("journalDisplayName")
    @Expose
    public String journalDisplayName;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Line Number.
     * 
     */
    @SerializedName("lineNumber")
    @Expose
    public Integer lineNumber;

    /**
     * The Posting Date.
     * 
     */
    @SerializedName("postingDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly postingDate;

    /**
     * The Customer.
     * 
     */
    @SerializedName("customer")
    @Expose
    public Customer customer;


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

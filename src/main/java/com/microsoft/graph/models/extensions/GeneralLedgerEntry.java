// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Account;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the General Ledger Entry.
 */
public class GeneralLedgerEntry extends Entity implements IJsonBackedObject {


    /**
     * The Account Id.
     * 
     */
    @SerializedName("accountId")
    @Expose
    public java.util.UUID accountId;

    /**
     * The Account Number.
     * 
     */
    @SerializedName("accountNumber")
    @Expose
    public String accountNumber;

    /**
     * The Credit Amount.
     * 
     */
    @SerializedName("creditAmount")
    @Expose
    public java.math.BigDecimal creditAmount;

    /**
     * The Debit Amount.
     * 
     */
    @SerializedName("debitAmount")
    @Expose
    public java.math.BigDecimal debitAmount;

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
     * The Document Type.
     * 
     */
    @SerializedName("documentType")
    @Expose
    public String documentType;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Posting Date.
     * 
     */
    @SerializedName("postingDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly postingDate;

    /**
     * The Account.
     * 
     */
    @SerializedName("account")
    @Expose
    public Account account;


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

// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Air Print Destination.
 */
public class AirPrintDestination implements IJsonBackedObject {

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
     * The Force Tls.
     * If true AirPrint connections are secured by Transport Layer Security (TLS). Default is false. Available in iOS 11.0 and later.
     */
    @SerializedName(value = "forceTls", alternate = {"ForceTls"})
    @Expose
	@Nullable
    public Boolean forceTls;

    /**
     * The Ip Address.
     * The IP Address of the AirPrint destination.
     */
    @SerializedName(value = "ipAddress", alternate = {"IpAddress"})
    @Expose
	@Nullable
    public String ipAddress;

    /**
     * The Port.
     * The listening port of the AirPrint destination. If this key is not specified AirPrint will use the default port. Available in iOS 11.0 and later.
     */
    @SerializedName(value = "port", alternate = {"Port"})
    @Expose
	@Nullable
    public Integer port;

    /**
     * The Resource Path.
     * The Resource Path associated with the printer. This corresponds to the rp parameter of the _ipps.tcp Bonjour record. For example: printers/Canon_MG5300_series, printers/Xerox_Phaser_7600, ipp/print, Epson_IPP_Printer.
     */
    @SerializedName(value = "resourcePath", alternate = {"ResourcePath"})
    @Expose
	@Nullable
    public String resourcePath;


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

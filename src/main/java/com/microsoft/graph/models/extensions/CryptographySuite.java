// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AuthenticationTransformConstant;
import com.microsoft.graph.models.generated.VpnEncryptionAlgorithmType;
import com.microsoft.graph.models.generated.DiffieHellmanGroup;
import com.microsoft.graph.models.generated.VpnIntegrityAlgorithmType;
import com.microsoft.graph.models.generated.PerfectForwardSecrecyGroup;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cryptography Suite.
 */
public class CryptographySuite implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Authentication Transform Constants.
     * Authentication Transform Constants
     */
    @SerializedName(value = "authenticationTransformConstants", alternate = {"AuthenticationTransformConstants"})
    @Expose
    public AuthenticationTransformConstant authenticationTransformConstants;

    /**
     * The Cipher Transform Constants.
     * Cipher Transform Constants
     */
    @SerializedName(value = "cipherTransformConstants", alternate = {"CipherTransformConstants"})
    @Expose
    public VpnEncryptionAlgorithmType cipherTransformConstants;

    /**
     * The Dh Group.
     * Diffie Hellman Group
     */
    @SerializedName(value = "dhGroup", alternate = {"DhGroup"})
    @Expose
    public DiffieHellmanGroup dhGroup;

    /**
     * The Encryption Method.
     * Encryption Method
     */
    @SerializedName(value = "encryptionMethod", alternate = {"EncryptionMethod"})
    @Expose
    public VpnEncryptionAlgorithmType encryptionMethod;

    /**
     * The Integrity Check Method.
     * Integrity Check Method
     */
    @SerializedName(value = "integrityCheckMethod", alternate = {"IntegrityCheckMethod"})
    @Expose
    public VpnIntegrityAlgorithmType integrityCheckMethod;

    /**
     * The Pfs Group.
     * Perfect Forward Secrecy Group
     */
    @SerializedName(value = "pfsGroup", alternate = {"PfsGroup"})
    @Expose
    public PerfectForwardSecrecyGroup pfsGroup;


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

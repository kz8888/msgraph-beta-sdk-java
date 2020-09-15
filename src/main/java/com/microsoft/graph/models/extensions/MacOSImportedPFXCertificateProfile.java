// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.IntendedPurpose;
import com.microsoft.graph.models.extensions.ManagedDeviceCertificateState;
import com.microsoft.graph.models.extensions.MacOSCertificateProfileBase;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSImported PFXCertificate Profile.
 */
public class MacOSImportedPFXCertificateProfile extends MacOSCertificateProfileBase implements IJsonBackedObject {


    /**
     * The Intended Purpose.
     * Intended Purpose of the Certificate Profile - which could be Unassigned, SmimeEncryption, SmimeSigning etc.
     */
    @SerializedName("intendedPurpose")
    @Expose
    public IntendedPurpose intendedPurpose;

    /**
     * The Managed Device Certificate States.
     * Certificate state for devices
     */
    @SerializedName("managedDeviceCertificateStates")
    @Expose
    public ManagedDeviceCertificateStateCollectionPage managedDeviceCertificateStates;


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


        if (json.has("managedDeviceCertificateStates")) {
            final ManagedDeviceCertificateStateCollectionResponse response = new ManagedDeviceCertificateStateCollectionResponse();
            if (json.has("managedDeviceCertificateStates@odata.nextLink")) {
                response.nextLink = json.get("managedDeviceCertificateStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDeviceCertificateStates").toString(), JsonObject[].class);
            final ManagedDeviceCertificateState[] array = new ManagedDeviceCertificateState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDeviceCertificateState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDeviceCertificateStates = new ManagedDeviceCertificateStateCollectionPage(response, null);
        }
    }
}

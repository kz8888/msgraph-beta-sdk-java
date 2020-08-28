// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsHelloForBusinessPinUsage;
import com.microsoft.graph.models.generated.Enablement;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Windows Hello For Business Configuration.
 */
public class DeviceEnrollmentWindowsHelloForBusinessConfiguration extends DeviceEnrollmentConfiguration implements IJsonBackedObject {


    /**
     * The Pin Minimum Length.
     * Not yet documented
     */
    @SerializedName("pinMinimumLength")
    @Expose
    public Integer pinMinimumLength;

    /**
     * The Pin Maximum Length.
     * Not yet documented
     */
    @SerializedName("pinMaximumLength")
    @Expose
    public Integer pinMaximumLength;

    /**
     * The Pin Uppercase Characters Usage.
     * Not yet documented. Possible values are: allowed, required, disallowed.
     */
    @SerializedName("pinUppercaseCharactersUsage")
    @Expose
    public WindowsHelloForBusinessPinUsage pinUppercaseCharactersUsage;

    /**
     * The Pin Lowercase Characters Usage.
     * Not yet documented. Possible values are: allowed, required, disallowed.
     */
    @SerializedName("pinLowercaseCharactersUsage")
    @Expose
    public WindowsHelloForBusinessPinUsage pinLowercaseCharactersUsage;

    /**
     * The Pin Special Characters Usage.
     * Not yet documented. Possible values are: allowed, required, disallowed.
     */
    @SerializedName("pinSpecialCharactersUsage")
    @Expose
    public WindowsHelloForBusinessPinUsage pinSpecialCharactersUsage;

    /**
     * The State.
     * Not yet documented. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName("state")
    @Expose
    public Enablement state;

    /**
     * The Security Device Required.
     * Not yet documented
     */
    @SerializedName("securityDeviceRequired")
    @Expose
    public Boolean securityDeviceRequired;

    /**
     * The Unlock With Biometrics Enabled.
     * Not yet documented
     */
    @SerializedName("unlockWithBiometricsEnabled")
    @Expose
    public Boolean unlockWithBiometricsEnabled;

    /**
     * The Remote Passport Enabled.
     * Not yet documented
     */
    @SerializedName("remotePassportEnabled")
    @Expose
    public Boolean remotePassportEnabled;

    /**
     * The Pin Previous Block Count.
     * Not yet documented
     */
    @SerializedName("pinPreviousBlockCount")
    @Expose
    public Integer pinPreviousBlockCount;

    /**
     * The Pin Expiration In Days.
     * Not yet documented
     */
    @SerializedName("pinExpirationInDays")
    @Expose
    public Integer pinExpirationInDays;

    /**
     * The Enhanced Biometrics State.
     * Not yet documented. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName("enhancedBiometricsState")
    @Expose
    public Enablement enhancedBiometricsState;

    /**
     * The Security Key For Sign In.
     * Security key for Sign In provides the capacity for remotely turning ON/OFF Windows Hello Sercurity Keyl Not configured will honor configurations done on the clinet.
     */
    @SerializedName("securityKeyForSignIn")
    @Expose
    public Enablement securityKeyForSignIn;


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
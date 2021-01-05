// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ManagedAppRemediationAction;
import com.microsoft.graph.models.generated.ManagedAppDataEncryptionType;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Protection.
 */
public class IosManagedAppProtection extends TargetedManagedAppProtection implements IJsonBackedObject {


    /**
     * The Allowed Ios Device Models.
     * Semicolon seperated list of device models allowed, as a string, for the managed app to work.
     */
    @SerializedName(value = "allowedIosDeviceModels", alternate = {"AllowedIosDeviceModels"})
    @Expose
    public String allowedIosDeviceModels;

    /**
     * The App Action If Ios Device Model Not Allowed.
     * Defines a managed app behavior, either block or wipe, if the specified device model is not allowed.
     */
    @SerializedName(value = "appActionIfIosDeviceModelNotAllowed", alternate = {"AppActionIfIosDeviceModelNotAllowed"})
    @Expose
    public ManagedAppRemediationAction appActionIfIosDeviceModelNotAllowed;

    /**
     * The App Data Encryption Type.
     * Type of encryption which should be used for data in a managed app. Possible values are: useDeviceSettings, afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
     */
    @SerializedName(value = "appDataEncryptionType", alternate = {"AppDataEncryptionType"})
    @Expose
    public ManagedAppDataEncryptionType appDataEncryptionType;

    /**
     * The Custom Browser Protocol.
     * A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     */
    @SerializedName(value = "customBrowserProtocol", alternate = {"CustomBrowserProtocol"})
    @Expose
    public String customBrowserProtocol;

    /**
     * The Custom Dialer App Protocol.
     * Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     */
    @SerializedName(value = "customDialerAppProtocol", alternate = {"CustomDialerAppProtocol"})
    @Expose
    public String customDialerAppProtocol;

    /**
     * The Deployed App Count.
     * Count of apps to which the current policy is deployed.
     */
    @SerializedName(value = "deployedAppCount", alternate = {"DeployedAppCount"})
    @Expose
    public Integer deployedAppCount;

    /**
     * The Disable Protection Of Managed Outbound Open In Data.
     * Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps.
     */
    @SerializedName(value = "disableProtectionOfManagedOutboundOpenInData", alternate = {"DisableProtectionOfManagedOutboundOpenInData"})
    @Expose
    public Boolean disableProtectionOfManagedOutboundOpenInData;

    /**
     * The Exempted App Protocols.
     * Apps in this list will be exempt from the policy and will be able to receive data from managed apps.
     */
    @SerializedName(value = "exemptedAppProtocols", alternate = {"ExemptedAppProtocols"})
    @Expose
    public java.util.List<KeyValuePair> exemptedAppProtocols;

    /**
     * The Face Id Blocked.
     * Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
     */
    @SerializedName(value = "faceIdBlocked", alternate = {"FaceIdBlocked"})
    @Expose
    public Boolean faceIdBlocked;

    /**
     * The Filter Open In To Only Managed Apps.
     * Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False.
     */
    @SerializedName(value = "filterOpenInToOnlyManagedApps", alternate = {"FilterOpenInToOnlyManagedApps"})
    @Expose
    public Boolean filterOpenInToOnlyManagedApps;

    /**
     * The Minimum Required Sdk Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName(value = "minimumRequiredSdkVersion", alternate = {"MinimumRequiredSdkVersion"})
    @Expose
    public String minimumRequiredSdkVersion;

    /**
     * The Minimum Wipe Sdk Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName(value = "minimumWipeSdkVersion", alternate = {"MinimumWipeSdkVersion"})
    @Expose
    public String minimumWipeSdkVersion;

    /**
     * The Protect Inbound Data From Unknown Sources.
     * Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps.
     */
    @SerializedName(value = "protectInboundDataFromUnknownSources", alternate = {"ProtectInboundDataFromUnknownSources"})
    @Expose
    public Boolean protectInboundDataFromUnknownSources;

    /**
     * The Third Party Keyboards Blocked.
     * Defines if third party keyboards are allowed while accessing a managed app
     */
    @SerializedName(value = "thirdPartyKeyboardsBlocked", alternate = {"ThirdPartyKeyboardsBlocked"})
    @Expose
    public Boolean thirdPartyKeyboardsBlocked;

    /**
     * The Apps.
     * List of apps to which the policy is deployed.
     */
    @SerializedName(value = "apps", alternate = {"Apps"})
    @Expose
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Deployment Summary.
     * Navigation property to deployment summary of the configuration.
     */
    @SerializedName(value = "deploymentSummary", alternate = {"DeploymentSummary"})
    @Expose
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


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


        if (json.has("apps")) {
            apps = serializer.deserializeObject(json.get("apps").toString(), ManagedMobileAppCollectionPage.class);
        }
    }
}

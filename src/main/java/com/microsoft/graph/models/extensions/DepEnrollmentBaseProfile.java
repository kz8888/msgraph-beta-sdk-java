// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EnrollmentProfile;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Enrollment Base Profile.
 */
public class DepEnrollmentBaseProfile extends EnrollmentProfile implements IJsonBackedObject {


    /**
     * The Apple Id Disabled.
     * Indicates if Apple id setup pane is disabled
     */
    @SerializedName(value = "appleIdDisabled", alternate = {"AppleIdDisabled"})
    @Expose
    public Boolean appleIdDisabled;

    /**
     * The Apple Pay Disabled.
     * Indicates if Apple pay setup pane is disabled
     */
    @SerializedName(value = "applePayDisabled", alternate = {"ApplePayDisabled"})
    @Expose
    public Boolean applePayDisabled;

    /**
     * The Configuration Web Url.
     * URL for setup assistant login
     */
    @SerializedName(value = "configurationWebUrl", alternate = {"ConfigurationWebUrl"})
    @Expose
    public Boolean configurationWebUrl;

    /**
     * The Device Name Template.
     * Sets a literal or name pattern.
     */
    @SerializedName(value = "deviceNameTemplate", alternate = {"DeviceNameTemplate"})
    @Expose
    public String deviceNameTemplate;

    /**
     * The Diagnostics Disabled.
     * Indicates if diagnostics setup pane is disabled
     */
    @SerializedName(value = "diagnosticsDisabled", alternate = {"DiagnosticsDisabled"})
    @Expose
    public Boolean diagnosticsDisabled;

    /**
     * The Display Tone Setup Disabled.
     * Indicates if displaytone setup screen is disabled
     */
    @SerializedName(value = "displayToneSetupDisabled", alternate = {"DisplayToneSetupDisabled"})
    @Expose
    public Boolean displayToneSetupDisabled;

    /**
     * The Is Default.
     * Indicates if this is the default profile
     */
    @SerializedName(value = "isDefault", alternate = {"IsDefault"})
    @Expose
    public Boolean isDefault;

    /**
     * The Is Mandatory.
     * Indicates if the profile is mandatory
     */
    @SerializedName(value = "isMandatory", alternate = {"IsMandatory"})
    @Expose
    public Boolean isMandatory;

    /**
     * The Location Disabled.
     * Indicates if Location service setup pane is disabled
     */
    @SerializedName(value = "locationDisabled", alternate = {"LocationDisabled"})
    @Expose
    public Boolean locationDisabled;

    /**
     * The Privacy Pane Disabled.
     * Indicates if privacy screen is disabled
     */
    @SerializedName(value = "privacyPaneDisabled", alternate = {"PrivacyPaneDisabled"})
    @Expose
    public Boolean privacyPaneDisabled;

    /**
     * The Profile Removal Disabled.
     * Indicates if the profile removal option is disabled
     */
    @SerializedName(value = "profileRemovalDisabled", alternate = {"ProfileRemovalDisabled"})
    @Expose
    public Boolean profileRemovalDisabled;

    /**
     * The Restore Blocked.
     * Indicates if Restore setup pane is blocked
     */
    @SerializedName(value = "restoreBlocked", alternate = {"RestoreBlocked"})
    @Expose
    public Boolean restoreBlocked;

    /**
     * The Screen Time Screen Disabled.
     * Indicates if screen timeout setup is disabled
     */
    @SerializedName(value = "screenTimeScreenDisabled", alternate = {"ScreenTimeScreenDisabled"})
    @Expose
    public Boolean screenTimeScreenDisabled;

    /**
     * The Siri Disabled.
     * Indicates if siri setup pane is disabled
     */
    @SerializedName(value = "siriDisabled", alternate = {"SiriDisabled"})
    @Expose
    public Boolean siriDisabled;

    /**
     * The Supervised Mode Enabled.
     * Supervised mode, True to enable, false otherwise. See https://docs.microsoft.com/en-us/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     */
    @SerializedName(value = "supervisedModeEnabled", alternate = {"SupervisedModeEnabled"})
    @Expose
    public Boolean supervisedModeEnabled;

    /**
     * The Support Department.
     * Support department information
     */
    @SerializedName(value = "supportDepartment", alternate = {"SupportDepartment"})
    @Expose
    public String supportDepartment;

    /**
     * The Support Phone Number.
     * Support phone number
     */
    @SerializedName(value = "supportPhoneNumber", alternate = {"SupportPhoneNumber"})
    @Expose
    public String supportPhoneNumber;

    /**
     * The Terms And Conditions Disabled.
     * Indicates if 'Terms and Conditions' setup pane is disabled
     */
    @SerializedName(value = "termsAndConditionsDisabled", alternate = {"TermsAndConditionsDisabled"})
    @Expose
    public Boolean termsAndConditionsDisabled;

    /**
     * The Touch Id Disabled.
     * Indicates if touch id setup pane is disabled
     */
    @SerializedName(value = "touchIdDisabled", alternate = {"TouchIdDisabled"})
    @Expose
    public Boolean touchIdDisabled;


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

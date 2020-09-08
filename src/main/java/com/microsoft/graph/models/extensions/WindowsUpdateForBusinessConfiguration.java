// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AutomaticUpdateMode;
import com.microsoft.graph.models.generated.AutoRestartNotificationDismissalMethod;
import com.microsoft.graph.models.generated.WindowsUpdateType;
import com.microsoft.graph.models.generated.WindowsDeliveryOptimizationMode;
import com.microsoft.graph.models.extensions.WindowsUpdateInstallScheduleType;
import com.microsoft.graph.models.generated.PrereleaseFeatures;
import com.microsoft.graph.models.generated.WindowsUpdateNotificationDisplayOption;
import com.microsoft.graph.models.generated.WindowsUpdateForBusinessUpdateWeeks;
import com.microsoft.graph.models.generated.Enablement;
import com.microsoft.graph.models.extensions.WindowsUpdateState;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.requests.extensions.WindowsUpdateStateCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsUpdateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration.
 */
public class WindowsUpdateForBusinessConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Automatic Update Mode.
     * Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl.
     */
    @SerializedName("automaticUpdateMode")
    @Expose
    public AutomaticUpdateMode automaticUpdateMode;

    /**
     * The Auto Restart Notification Dismissal.
     * Specify the method by which the auto-restart required notification is dismissed
     */
    @SerializedName("autoRestartNotificationDismissal")
    @Expose
    public AutoRestartNotificationDismissalMethod autoRestartNotificationDismissal;

    /**
     * The Business Ready Updates Only.
     * Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
     */
    @SerializedName("businessReadyUpdatesOnly")
    @Expose
    public WindowsUpdateType businessReadyUpdatesOnly;

    /**
     * The Deadline For Feature Updates In Days.
     * Number of days before feature updates are installed automatically with valid range from 2 to 30 days
     */
    @SerializedName("deadlineForFeatureUpdatesInDays")
    @Expose
    public Integer deadlineForFeatureUpdatesInDays;

    /**
     * The Deadline For Quality Updates In Days.
     * Number of days before quality updates are installed automatically with valid range from 2 to 30 days
     */
    @SerializedName("deadlineForQualityUpdatesInDays")
    @Expose
    public Integer deadlineForQualityUpdatesInDays;

    /**
     * The Deadline Grace Period In Days.
     * Number of days after deadline  until restarts occur automatically with valid range from 0 to 7 days
     */
    @SerializedName("deadlineGracePeriodInDays")
    @Expose
    public Integer deadlineGracePeriodInDays;

    /**
     * The Delivery Optimization Mode.
     * Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     */
    @SerializedName("deliveryOptimizationMode")
    @Expose
    public WindowsDeliveryOptimizationMode deliveryOptimizationMode;

    /**
     * The Drivers Excluded.
     * Exclude Windows update Drivers
     */
    @SerializedName("driversExcluded")
    @Expose
    public Boolean driversExcluded;

    /**
     * The Engaged Restart Deadline In Days.
     * Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days
     */
    @SerializedName("engagedRestartDeadlineInDays")
    @Expose
    public Integer engagedRestartDeadlineInDays;

    /**
     * The Engaged Restart Snooze Schedule In Days.
     * Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days
     */
    @SerializedName("engagedRestartSnoozeScheduleInDays")
    @Expose
    public Integer engagedRestartSnoozeScheduleInDays;

    /**
     * The Engaged Restart Transition Schedule In Days.
     * Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days
     */
    @SerializedName("engagedRestartTransitionScheduleInDays")
    @Expose
    public Integer engagedRestartTransitionScheduleInDays;

    /**
     * The Feature Updates Deferral Period In Days.
     * Defer Feature Updates by these many days
     */
    @SerializedName("featureUpdatesDeferralPeriodInDays")
    @Expose
    public Integer featureUpdatesDeferralPeriodInDays;

    /**
     * The Feature Updates Paused.
     * Pause Feature Updates
     */
    @SerializedName("featureUpdatesPaused")
    @Expose
    public Boolean featureUpdatesPaused;

    /**
     * The Feature Updates Pause Expiry Date Time.
     * Feature Updates Pause Expiry datetime
     */
    @SerializedName("featureUpdatesPauseExpiryDateTime")
    @Expose
    public java.util.Calendar featureUpdatesPauseExpiryDateTime;

    /**
     * The Feature Updates Pause Start Date.
     * Feature Updates Pause start date. This property is read-only.
     */
    @SerializedName("featureUpdatesPauseStartDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly featureUpdatesPauseStartDate;

    /**
     * The Feature Updates Rollback Start Date Time.
     * Feature Updates Rollback Start datetime
     */
    @SerializedName("featureUpdatesRollbackStartDateTime")
    @Expose
    public java.util.Calendar featureUpdatesRollbackStartDateTime;

    /**
     * The Feature Updates Rollback Window In Days.
     * The number of days after a Feature Update for which a rollback is valid
     */
    @SerializedName("featureUpdatesRollbackWindowInDays")
    @Expose
    public Integer featureUpdatesRollbackWindowInDays;

    /**
     * The Feature Updates Will Be Rolled Back.
     * Specifies whether to rollback Feature Updates on the next device check in
     */
    @SerializedName("featureUpdatesWillBeRolledBack")
    @Expose
    public Boolean featureUpdatesWillBeRolledBack;

    /**
     * The Installation Schedule.
     * Installation schedule
     */
    @SerializedName("installationSchedule")
    @Expose
    public WindowsUpdateInstallScheduleType installationSchedule;

    /**
     * The Microsoft Update Service Allowed.
     * Allow Microsoft Update Service
     */
    @SerializedName("microsoftUpdateServiceAllowed")
    @Expose
    public Boolean microsoftUpdateServiceAllowed;

    /**
     * The Postpone Reboot Until After Deadline.
     * Specifies if the device should wait until deadline for rebooting outside of active hours
     */
    @SerializedName("postponeRebootUntilAfterDeadline")
    @Expose
    public Boolean postponeRebootUntilAfterDeadline;

    /**
     * The Prerelease Features.
     * The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
     */
    @SerializedName("prereleaseFeatures")
    @Expose
    public PrereleaseFeatures prereleaseFeatures;

    /**
     * The Quality Updates Deferral Period In Days.
     * Defer Quality Updates by these many days
     */
    @SerializedName("qualityUpdatesDeferralPeriodInDays")
    @Expose
    public Integer qualityUpdatesDeferralPeriodInDays;

    /**
     * The Quality Updates Paused.
     * Pause Quality Updates
     */
    @SerializedName("qualityUpdatesPaused")
    @Expose
    public Boolean qualityUpdatesPaused;

    /**
     * The Quality Updates Pause Expiry Date Time.
     * Quality Updates Pause Expiry datetime
     */
    @SerializedName("qualityUpdatesPauseExpiryDateTime")
    @Expose
    public java.util.Calendar qualityUpdatesPauseExpiryDateTime;

    /**
     * The Quality Updates Pause Start Date.
     * Quality Updates Pause start date. This property is read-only.
     */
    @SerializedName("qualityUpdatesPauseStartDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly qualityUpdatesPauseStartDate;

    /**
     * The Quality Updates Rollback Start Date Time.
     * Quality Updates Rollback Start datetime
     */
    @SerializedName("qualityUpdatesRollbackStartDateTime")
    @Expose
    public java.util.Calendar qualityUpdatesRollbackStartDateTime;

    /**
     * The Quality Updates Will Be Rolled Back.
     * Specifies whether to rollback Quality Updates on the next device check in
     */
    @SerializedName("qualityUpdatesWillBeRolledBack")
    @Expose
    public Boolean qualityUpdatesWillBeRolledBack;

    /**
     * The Schedule Imminent Restart Warning In Minutes.
     * Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes).
     */
    @SerializedName("scheduleImminentRestartWarningInMinutes")
    @Expose
    public Integer scheduleImminentRestartWarningInMinutes;

    /**
     * The Schedule Restart Warning In Hours.
     * Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours).
     */
    @SerializedName("scheduleRestartWarningInHours")
    @Expose
    public Integer scheduleRestartWarningInHours;

    /**
     * The Skip Checks Before Restart.
     * Set to skip all check before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc. 
     */
    @SerializedName("skipChecksBeforeRestart")
    @Expose
    public Boolean skipChecksBeforeRestart;

    /**
     * The Update Notification Level.
     * Specifies what Windows Update notifications users see.
     */
    @SerializedName("updateNotificationLevel")
    @Expose
    public WindowsUpdateNotificationDisplayOption updateNotificationLevel;

    /**
     * The Update Weeks.
     * Scheduled the update installation on the weeks of the month
     */
    @SerializedName("updateWeeks")
    @Expose
    public EnumSet<WindowsUpdateForBusinessUpdateWeeks> updateWeeks;

    /**
     * The User Pause Access.
     * Specifies whether to enable end user???s access to pause software updates.
     */
    @SerializedName("userPauseAccess")
    @Expose
    public Enablement userPauseAccess;

    /**
     * The User Windows Update Scan Access.
     * Specifies whether to disable user???s access to scan Windows Update.
     */
    @SerializedName("userWindowsUpdateScanAccess")
    @Expose
    public Enablement userWindowsUpdateScanAccess;

    /**
     * The Device Update States.
     * Windows update for business configuration device states.
     */
    public WindowsUpdateStateCollectionPage deviceUpdateStates;


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


        if (json.has("deviceUpdateStates")) {
            final WindowsUpdateStateCollectionResponse response = new WindowsUpdateStateCollectionResponse();
            if (json.has("deviceUpdateStates@odata.nextLink")) {
                response.nextLink = json.get("deviceUpdateStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceUpdateStates").toString(), JsonObject[].class);
            final WindowsUpdateState[] array = new WindowsUpdateState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsUpdateState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceUpdateStates = new WindowsUpdateStateCollectionPage(response, null);
        }
    }
}

// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
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
import com.microsoft.graph.requests.extensions.WindowsUpdateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration.
 */
public class WindowsUpdateForBusinessConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Automatic Update Mode.
     * Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl, windowsDefault.
     */
    @SerializedName(value = "automaticUpdateMode", alternate = {"AutomaticUpdateMode"})
    @Expose
    public AutomaticUpdateMode automaticUpdateMode;

    /**
     * The Auto Restart Notification Dismissal.
     * Specify the method by which the auto-restart required notification is dismissed. Possible values are: notConfigured, automatic, user.
     */
    @SerializedName(value = "autoRestartNotificationDismissal", alternate = {"AutoRestartNotificationDismissal"})
    @Expose
    public AutoRestartNotificationDismissalMethod autoRestartNotificationDismissal;

    /**
     * The Business Ready Updates Only.
     * Determines which branch devices will receive their updates from. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
     */
    @SerializedName(value = "businessReadyUpdatesOnly", alternate = {"BusinessReadyUpdatesOnly"})
    @Expose
    public WindowsUpdateType businessReadyUpdatesOnly;

    /**
     * The Deadline For Feature Updates In Days.
     * Number of days before feature updates are installed automatically with valid range from 2 to 30 days
     */
    @SerializedName(value = "deadlineForFeatureUpdatesInDays", alternate = {"DeadlineForFeatureUpdatesInDays"})
    @Expose
    public Integer deadlineForFeatureUpdatesInDays;

    /**
     * The Deadline For Quality Updates In Days.
     * Number of days before quality updates are installed automatically with valid range from 2 to 30 days
     */
    @SerializedName(value = "deadlineForQualityUpdatesInDays", alternate = {"DeadlineForQualityUpdatesInDays"})
    @Expose
    public Integer deadlineForQualityUpdatesInDays;

    /**
     * The Deadline Grace Period In Days.
     * Number of days after deadline  until restarts occur automatically with valid range from 0 to 7 days
     */
    @SerializedName(value = "deadlineGracePeriodInDays", alternate = {"DeadlineGracePeriodInDays"})
    @Expose
    public Integer deadlineGracePeriodInDays;

    /**
     * The Delivery Optimization Mode.
     * Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
     */
    @SerializedName(value = "deliveryOptimizationMode", alternate = {"DeliveryOptimizationMode"})
    @Expose
    public WindowsDeliveryOptimizationMode deliveryOptimizationMode;

    /**
     * The Drivers Excluded.
     * Exclude Windows update Drivers
     */
    @SerializedName(value = "driversExcluded", alternate = {"DriversExcluded"})
    @Expose
    public Boolean driversExcluded;

    /**
     * The Engaged Restart Deadline In Days.
     * Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days
     */
    @SerializedName(value = "engagedRestartDeadlineInDays", alternate = {"EngagedRestartDeadlineInDays"})
    @Expose
    public Integer engagedRestartDeadlineInDays;

    /**
     * The Engaged Restart Snooze Schedule In Days.
     * Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days
     */
    @SerializedName(value = "engagedRestartSnoozeScheduleInDays", alternate = {"EngagedRestartSnoozeScheduleInDays"})
    @Expose
    public Integer engagedRestartSnoozeScheduleInDays;

    /**
     * The Engaged Restart Transition Schedule In Days.
     * Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days
     */
    @SerializedName(value = "engagedRestartTransitionScheduleInDays", alternate = {"EngagedRestartTransitionScheduleInDays"})
    @Expose
    public Integer engagedRestartTransitionScheduleInDays;

    /**
     * The Feature Updates Deferral Period In Days.
     * Defer Feature Updates by these many days
     */
    @SerializedName(value = "featureUpdatesDeferralPeriodInDays", alternate = {"FeatureUpdatesDeferralPeriodInDays"})
    @Expose
    public Integer featureUpdatesDeferralPeriodInDays;

    /**
     * The Feature Updates Paused.
     * Pause Feature Updates
     */
    @SerializedName(value = "featureUpdatesPaused", alternate = {"FeatureUpdatesPaused"})
    @Expose
    public Boolean featureUpdatesPaused;

    /**
     * The Feature Updates Pause Expiry Date Time.
     * Feature Updates Pause Expiry datetime
     */
    @SerializedName(value = "featureUpdatesPauseExpiryDateTime", alternate = {"FeatureUpdatesPauseExpiryDateTime"})
    @Expose
    public java.util.Calendar featureUpdatesPauseExpiryDateTime;

    /**
     * The Feature Updates Pause Start Date.
     * Feature Updates Pause start date. This property is read-only.
     */
    @SerializedName(value = "featureUpdatesPauseStartDate", alternate = {"FeatureUpdatesPauseStartDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly featureUpdatesPauseStartDate;

    /**
     * The Feature Updates Rollback Start Date Time.
     * Feature Updates Rollback Start datetime
     */
    @SerializedName(value = "featureUpdatesRollbackStartDateTime", alternate = {"FeatureUpdatesRollbackStartDateTime"})
    @Expose
    public java.util.Calendar featureUpdatesRollbackStartDateTime;

    /**
     * The Feature Updates Rollback Window In Days.
     * The number of days after a Feature Update for which a rollback is valid
     */
    @SerializedName(value = "featureUpdatesRollbackWindowInDays", alternate = {"FeatureUpdatesRollbackWindowInDays"})
    @Expose
    public Integer featureUpdatesRollbackWindowInDays;

    /**
     * The Feature Updates Will Be Rolled Back.
     * Specifies whether to rollback Feature Updates on the next device check in
     */
    @SerializedName(value = "featureUpdatesWillBeRolledBack", alternate = {"FeatureUpdatesWillBeRolledBack"})
    @Expose
    public Boolean featureUpdatesWillBeRolledBack;

    /**
     * The Installation Schedule.
     * Installation schedule
     */
    @SerializedName(value = "installationSchedule", alternate = {"InstallationSchedule"})
    @Expose
    public WindowsUpdateInstallScheduleType installationSchedule;

    /**
     * The Microsoft Update Service Allowed.
     * Allow Microsoft Update Service
     */
    @SerializedName(value = "microsoftUpdateServiceAllowed", alternate = {"MicrosoftUpdateServiceAllowed"})
    @Expose
    public Boolean microsoftUpdateServiceAllowed;

    /**
     * The Postpone Reboot Until After Deadline.
     * Specifies if the device should wait until deadline for rebooting outside of active hours
     */
    @SerializedName(value = "postponeRebootUntilAfterDeadline", alternate = {"PostponeRebootUntilAfterDeadline"})
    @Expose
    public Boolean postponeRebootUntilAfterDeadline;

    /**
     * The Prerelease Features.
     * The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
     */
    @SerializedName(value = "prereleaseFeatures", alternate = {"PrereleaseFeatures"})
    @Expose
    public PrereleaseFeatures prereleaseFeatures;

    /**
     * The Quality Updates Deferral Period In Days.
     * Defer Quality Updates by these many days
     */
    @SerializedName(value = "qualityUpdatesDeferralPeriodInDays", alternate = {"QualityUpdatesDeferralPeriodInDays"})
    @Expose
    public Integer qualityUpdatesDeferralPeriodInDays;

    /**
     * The Quality Updates Paused.
     * Pause Quality Updates
     */
    @SerializedName(value = "qualityUpdatesPaused", alternate = {"QualityUpdatesPaused"})
    @Expose
    public Boolean qualityUpdatesPaused;

    /**
     * The Quality Updates Pause Expiry Date Time.
     * Quality Updates Pause Expiry datetime
     */
    @SerializedName(value = "qualityUpdatesPauseExpiryDateTime", alternate = {"QualityUpdatesPauseExpiryDateTime"})
    @Expose
    public java.util.Calendar qualityUpdatesPauseExpiryDateTime;

    /**
     * The Quality Updates Pause Start Date.
     * Quality Updates Pause start date. This property is read-only.
     */
    @SerializedName(value = "qualityUpdatesPauseStartDate", alternate = {"QualityUpdatesPauseStartDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly qualityUpdatesPauseStartDate;

    /**
     * The Quality Updates Rollback Start Date Time.
     * Quality Updates Rollback Start datetime
     */
    @SerializedName(value = "qualityUpdatesRollbackStartDateTime", alternate = {"QualityUpdatesRollbackStartDateTime"})
    @Expose
    public java.util.Calendar qualityUpdatesRollbackStartDateTime;

    /**
     * The Quality Updates Will Be Rolled Back.
     * Specifies whether to rollback Quality Updates on the next device check in
     */
    @SerializedName(value = "qualityUpdatesWillBeRolledBack", alternate = {"QualityUpdatesWillBeRolledBack"})
    @Expose
    public Boolean qualityUpdatesWillBeRolledBack;

    /**
     * The Schedule Imminent Restart Warning In Minutes.
     * Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes).
     */
    @SerializedName(value = "scheduleImminentRestartWarningInMinutes", alternate = {"ScheduleImminentRestartWarningInMinutes"})
    @Expose
    public Integer scheduleImminentRestartWarningInMinutes;

    /**
     * The Schedule Restart Warning In Hours.
     * Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours).
     */
    @SerializedName(value = "scheduleRestartWarningInHours", alternate = {"ScheduleRestartWarningInHours"})
    @Expose
    public Integer scheduleRestartWarningInHours;

    /**
     * The Skip Checks Before Restart.
     * Set to skip all check before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc.
     */
    @SerializedName(value = "skipChecksBeforeRestart", alternate = {"SkipChecksBeforeRestart"})
    @Expose
    public Boolean skipChecksBeforeRestart;

    /**
     * The Update Notification Level.
     * Specifies what Windows Update notifications users see. Possible values are: notConfigured, defaultNotifications, restartWarningsOnly, disableAllNotifications.
     */
    @SerializedName(value = "updateNotificationLevel", alternate = {"UpdateNotificationLevel"})
    @Expose
    public WindowsUpdateNotificationDisplayOption updateNotificationLevel;

    /**
     * The Update Weeks.
     * Scheduled the update installation on the weeks of the month. Possible values are: userDefined, firstWeek, secondWeek, thirdWeek, fourthWeek, everyWeek.
     */
    @SerializedName(value = "updateWeeks", alternate = {"UpdateWeeks"})
    @Expose
    public EnumSet<WindowsUpdateForBusinessUpdateWeeks> updateWeeks;

    /**
     * The User Pause Access.
     * Specifies whether to enable end user’s access to pause software updates. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "userPauseAccess", alternate = {"UserPauseAccess"})
    @Expose
    public Enablement userPauseAccess;

    /**
     * The User Windows Update Scan Access.
     * Specifies whether to disable user’s access to scan Windows Update. Possible values are: notConfigured, enabled, disabled.
     */
    @SerializedName(value = "userWindowsUpdateScanAccess", alternate = {"UserWindowsUpdateScanAccess"})
    @Expose
    public Enablement userWindowsUpdateScanAccess;

    /**
     * The Device Update States.
     * Windows update for business configuration device states.
     */
    @SerializedName(value = "deviceUpdateStates", alternate = {"DeviceUpdateStates"})
    @Expose
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
            deviceUpdateStates = serializer.deserializeObject(json.get("deviceUpdateStates").toString(), WindowsUpdateStateCollectionPage.class);
        }
    }
}

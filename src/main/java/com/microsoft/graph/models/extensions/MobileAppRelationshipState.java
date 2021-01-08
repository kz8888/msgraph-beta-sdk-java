// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ResultantAppState;
import com.microsoft.graph.models.generated.ResultantAppStateDetail;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Relationship State.
 */
public class MobileAppRelationshipState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Device Id.
     * The corresponding device id.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
    public String deviceId;

    /**
     * The Error Code.
     * The error code for install or uninstall failures of target app.
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
    public Integer errorCode;

    /**
     * The Install State.
     * The install state of the app of target app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable.
     */
    @SerializedName(value = "installState", alternate = {"InstallState"})
    @Expose
    public ResultantAppState installState;

    /**
     * The Install State Detail.
     * The install state detail of the app. Possible values are: noAdditionalDetails, dependencyFailedToInstall, dependencyWithRequirementsNotMet, dependencyPendingReboot, dependencyWithAutoInstallDisabled, iosAppStoreUpdateFailedToInstall, vppAppHasUpdateAvailable, userRejectedUpdate, seeInstallErrorCode, autoInstallDisabled, managedAppNoLongerPresent, userRejectedInstall, userIsNotLoggedIntoAppStore, seeUninstallErrorCode, pendingReboot, installingDependencies, contentDownloaded, powerShellScriptRequirementNotMet, registryRequirementNotMet, fileSystemRequirementNotMet, platformNotApplicable, minimumCpuSpeedNotMet, minimumLogicalProcessorCountNotMet, minimumPhysicalMemoryNotMet, minimumOsVersionNotMet, minimumDiskSpaceNotMet, processorArchitectureNotApplicable.
     */
    @SerializedName(value = "installStateDetail", alternate = {"InstallStateDetail"})
    @Expose
    public ResultantAppStateDetail installStateDetail;

    /**
     * The Source Ids.
     * The collection of source mobile app's ids.
     */
    @SerializedName(value = "sourceIds", alternate = {"SourceIds"})
    @Expose
    public java.util.List<String> sourceIds;

    /**
     * The Target Display Name.
     * The related target app's display name.
     */
    @SerializedName(value = "targetDisplayName", alternate = {"TargetDisplayName"})
    @Expose
    public String targetDisplayName;

    /**
     * The Target Id.
     * The related target app's id.
     */
    @SerializedName(value = "targetId", alternate = {"TargetId"})
    @Expose
    public String targetId;

    /**
     * The Target Last Sync Date Time.
     * The last sync time of the target app.
     */
    @SerializedName(value = "targetLastSyncDateTime", alternate = {"TargetLastSyncDateTime"})
    @Expose
    public java.util.Calendar targetLastSyncDateTime;


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

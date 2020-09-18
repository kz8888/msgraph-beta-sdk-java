// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementCachedReportConfiguration;
import com.microsoft.graph.models.extensions.DeviceManagementExportJob;
import com.microsoft.graph.models.extensions.DeviceManagementReportSchedule;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports.
 */
public class DeviceManagementReports extends Entity implements IJsonBackedObject {


    /**
     * The Cached Report Configurations.
     * Entity representing the configuration of a cached report
     */
    @SerializedName("cachedReportConfigurations")
    @Expose
    public DeviceManagementCachedReportConfigurationCollectionPage cachedReportConfigurations;

    /**
     * The Export Jobs.
     * Entity representing a job to export a report
     */
    @SerializedName("exportJobs")
    @Expose
    public DeviceManagementExportJobCollectionPage exportJobs;

    /**
     * The Report Schedules.
     * Entity representing a schedule for which reports are delivered
     */
    @SerializedName("reportSchedules")
    @Expose
    public DeviceManagementReportScheduleCollectionPage reportSchedules;


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


        if (json.has("cachedReportConfigurations")) {
            final DeviceManagementCachedReportConfigurationCollectionResponse response = new DeviceManagementCachedReportConfigurationCollectionResponse();
            if (json.has("cachedReportConfigurations@odata.nextLink")) {
                response.nextLink = json.get("cachedReportConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("cachedReportConfigurations").toString(), JsonObject[].class);
            final DeviceManagementCachedReportConfiguration[] array = new DeviceManagementCachedReportConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementCachedReportConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            cachedReportConfigurations = new DeviceManagementCachedReportConfigurationCollectionPage(response, null);
        }

        if (json.has("exportJobs")) {
            final DeviceManagementExportJobCollectionResponse response = new DeviceManagementExportJobCollectionResponse();
            if (json.has("exportJobs@odata.nextLink")) {
                response.nextLink = json.get("exportJobs@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("exportJobs").toString(), JsonObject[].class);
            final DeviceManagementExportJob[] array = new DeviceManagementExportJob[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementExportJob.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            exportJobs = new DeviceManagementExportJobCollectionPage(response, null);
        }

        if (json.has("reportSchedules")) {
            final DeviceManagementReportScheduleCollectionResponse response = new DeviceManagementReportScheduleCollectionResponse();
            if (json.has("reportSchedules@odata.nextLink")) {
                response.nextLink = json.get("reportSchedules@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("reportSchedules").toString(), JsonObject[].class);
            final DeviceManagementReportSchedule[] array = new DeviceManagementReportSchedule[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementReportSchedule.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            reportSchedules = new DeviceManagementReportScheduleCollectionPage(response, null);
        }
    }
}

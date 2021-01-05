// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementReportSchedule;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportScheduleCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Report Schedule Collection Page.
 */
public class DeviceManagementReportScheduleCollectionPage extends BaseCollectionPage<DeviceManagementReportSchedule, IDeviceManagementReportScheduleCollectionRequestBuilder> implements IDeviceManagementReportScheduleCollectionPage {

    /**
     * A collection page for DeviceManagementReportSchedule
     *
     * @param response the serialized DeviceManagementReportScheduleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementReportScheduleCollectionPage(final DeviceManagementReportScheduleCollectionResponse response, final IDeviceManagementReportScheduleCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}

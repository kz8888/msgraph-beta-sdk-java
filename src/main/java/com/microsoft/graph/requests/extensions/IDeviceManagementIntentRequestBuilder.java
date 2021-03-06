// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.models.extensions.DeviceManagementIntentAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementSettingInstance;
import com.microsoft.graph.models.extensions.DeviceManagementSettingComparison;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceSettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Intent Request Builder.
 */
public interface IDeviceManagementIntentRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementIntentRequest instance
     */
    IDeviceManagementIntentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementIntentRequest instance
     */
    IDeviceManagementIntentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceManagementIntentAssignmentCollectionRequestBuilder assignments();

    IDeviceManagementIntentAssignmentRequestBuilder assignments(final String id);

    IDeviceManagementIntentSettingCategoryCollectionRequestBuilder categories();

    IDeviceManagementIntentSettingCategoryRequestBuilder categories(final String id);

    IDeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder deviceSettingStateSummaries();

    IDeviceManagementIntentDeviceSettingStateSummaryRequestBuilder deviceSettingStateSummaries(final String id);

    IDeviceManagementIntentDeviceStateCollectionRequestBuilder deviceStates();

    IDeviceManagementIntentDeviceStateRequestBuilder deviceStates(final String id);

    /**
     * Gets the request builder for DeviceManagementIntentDeviceStateSummary
     *
     * @return the IDeviceManagementIntentDeviceStateSummaryRequestBuilder instance
     */
    IDeviceManagementIntentDeviceStateSummaryRequestBuilder deviceStateSummary();

    IDeviceManagementSettingInstanceCollectionRequestBuilder settings();

    IDeviceManagementSettingInstanceRequestBuilder settings(final String id);

    IDeviceManagementIntentUserStateCollectionRequestBuilder userStates();

    IDeviceManagementIntentUserStateRequestBuilder userStates(final String id);

    /**
     * Gets the request builder for DeviceManagementIntentUserStateSummary
     *
     * @return the IDeviceManagementIntentUserStateSummaryRequestBuilder instance
     */
    IDeviceManagementIntentUserStateSummaryRequestBuilder userStateSummary();
    IDeviceManagementIntentAssignRequestBuilder assign(final java.util.List<DeviceManagementIntentAssignment> assignments);
    IDeviceManagementIntentCreateCopyRequestBuilder createCopy(final String displayName);
    IDeviceManagementIntentMigrateToTemplateRequestBuilder migrateToTemplate(final String newTemplateId, final Boolean preserveCustomValues);
    IDeviceManagementIntentUpdateSettingsRequestBuilder updateSettings(final java.util.List<DeviceManagementSettingInstance> settings);

    IDeviceManagementIntentCompareCollectionRequestBuilder compare(final String templateId);

}
// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.extensions.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.extensions.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration Reference Request.
 */
public interface IDeviceConfigurationReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super DeviceConfiguration> callback);

    DeviceConfiguration delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceConfigurationReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceConfigurationReferenceRequest expand(final String value);

    /**
     * Puts the DeviceConfiguration
     *
     * @param srcDeviceConfiguration the DeviceConfiguration to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(DeviceConfiguration srcDeviceConfiguration, final ICallback<? super DeviceConfiguration> callback);

    /**
     * Puts the DeviceConfiguration
     *
     * @param srcDeviceConfiguration the DeviceConfiguration to PUT
     * @return the DeviceConfiguration
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    DeviceConfiguration put(DeviceConfiguration srcDeviceConfiguration) throws ClientException;
}

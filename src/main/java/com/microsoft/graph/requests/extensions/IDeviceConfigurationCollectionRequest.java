// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.models.extensions.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.extensions.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration Collection Request.
 */
public interface IDeviceConfigurationCollectionRequest {

    void get(final ICallback<IDeviceConfigurationCollectionPage> callback);

    IDeviceConfigurationCollectionPage get() throws ClientException;

    void post(final DeviceConfiguration newDeviceConfiguration, final ICallback<DeviceConfiguration> callback);

    DeviceConfiguration post(final DeviceConfiguration newDeviceConfiguration) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceConfigurationCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceConfigurationCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceConfigurationCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IDeviceConfigurationCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IDeviceConfigurationCollectionRequest skipToken(String skipToken);
}

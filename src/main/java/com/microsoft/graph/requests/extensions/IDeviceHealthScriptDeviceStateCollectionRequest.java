// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.models.extensions.DeviceHealthScriptDeviceState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Device State Collection Request.
 */
public interface IDeviceHealthScriptDeviceStateCollectionRequest {

    void get(final ICallback<IDeviceHealthScriptDeviceStateCollectionPage> callback);

    IDeviceHealthScriptDeviceStateCollectionPage get() throws ClientException;

    void post(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState, final ICallback<DeviceHealthScriptDeviceState> callback);

    DeviceHealthScriptDeviceState post(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceHealthScriptDeviceStateCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceHealthScriptDeviceStateCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceHealthScriptDeviceStateCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IDeviceHealthScriptDeviceStateCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IDeviceHealthScriptDeviceStateCollectionRequest skipToken(String skipToken);
}

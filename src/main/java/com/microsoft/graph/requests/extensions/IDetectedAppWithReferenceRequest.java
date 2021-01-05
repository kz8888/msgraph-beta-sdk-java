// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Detected App With Reference Request.
 */
public interface IDetectedAppWithReferenceRequest extends IHttpRequest {

    void post(final DetectedApp newDetectedApp, final IJsonBackedObject payload, final ICallback<? super DetectedApp> callback);

    DetectedApp post(final DetectedApp newDetectedApp, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super DetectedApp> callback);

    DetectedApp get() throws ClientException;

	void delete(final ICallback<? super DetectedApp> callback);

	void delete() throws ClientException;

	void patch(final DetectedApp sourceDetectedApp, final ICallback<? super DetectedApp> callback);

	DetectedApp patch(final DetectedApp sourceDetectedApp) throws ClientException;

    IDetectedAppWithReferenceRequest select(final String value);

    IDetectedAppWithReferenceRequest expand(final String value);

}

// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Metric With Reference Request.
 */
public interface IUserExperienceAnalyticsMetricWithReferenceRequest extends IHttpRequest {

    void post(final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric, final IJsonBackedObject payload, final ICallback<? super UserExperienceAnalyticsMetric> callback);

    UserExperienceAnalyticsMetric post(final UserExperienceAnalyticsMetric newUserExperienceAnalyticsMetric, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super UserExperienceAnalyticsMetric> callback);

    UserExperienceAnalyticsMetric get() throws ClientException;

	void delete(final ICallback<? super UserExperienceAnalyticsMetric> callback);

	void delete() throws ClientException;

	void patch(final UserExperienceAnalyticsMetric sourceUserExperienceAnalyticsMetric, final ICallback<? super UserExperienceAnalyticsMetric> callback);

	UserExperienceAnalyticsMetric patch(final UserExperienceAnalyticsMetric sourceUserExperienceAnalyticsMetric) throws ClientException;

    IUserExperienceAnalyticsMetricWithReferenceRequest select(final String value);

    IUserExperienceAnalyticsMetricWithReferenceRequest expand(final String value);

}

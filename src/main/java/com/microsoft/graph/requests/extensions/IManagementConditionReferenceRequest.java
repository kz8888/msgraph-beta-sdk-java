// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Management Condition Reference Request.
 */
public interface IManagementConditionReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super ManagementCondition> callback);

    ManagementCondition delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagementConditionReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagementConditionReferenceRequest expand(final String value);

    /**
     * Puts the ManagementCondition
     *
     * @param srcManagementCondition the ManagementCondition to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(ManagementCondition srcManagementCondition, final ICallback<? super ManagementCondition> callback);

    /**
     * Puts the ManagementCondition
     *
     * @param srcManagementCondition the ManagementCondition to PUT
     * @return the ManagementCondition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    ManagementCondition put(ManagementCondition srcManagementCondition) throws ClientException;
}

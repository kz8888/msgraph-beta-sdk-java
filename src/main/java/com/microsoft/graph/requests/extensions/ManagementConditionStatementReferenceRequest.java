// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.ManagementConditionExpressionString;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.requests.extensions.IManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Reference Request.
 */
public class ManagementConditionStatementReferenceRequest extends BaseRequest implements IManagementConditionStatementReferenceRequest {

    /**
     * The request for the ManagementConditionStatement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionStatementReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementConditionStatement.class);
    }

    public void delete(final ICallback<? super ManagementConditionStatement> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagementConditionStatement delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagementConditionStatementReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagementConditionStatementReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagementConditionStatementReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagementConditionStatementReferenceRequest)this;
    }
    /**
     * Puts the ManagementConditionStatement
     *
     * @param srcManagementConditionStatement the ManagementConditionStatement reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagementConditionStatement srcManagementConditionStatement, final ICallback<? super ManagementConditionStatement> callback) {
        send(HttpMethod.PUT, callback, srcManagementConditionStatement);
    }

    /**
     * Puts the ManagementConditionStatement
     *
     * @param srcManagementConditionStatement the ManagementConditionStatement reference to PUT
     * @return the ManagementConditionStatement
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagementConditionStatement put(ManagementConditionStatement srcManagementConditionStatement) throws ClientException {
        return send(HttpMethod.PUT, srcManagementConditionStatement);
    }
}

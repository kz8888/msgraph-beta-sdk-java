// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.ManagementConditionExpressionString;
import com.microsoft.graph.models.generated.DevicePlatformType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.ReferenceRequestBody;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Collection Reference Request.
 */
public class ManagementConditionStatementCollectionReferenceRequest extends BaseCollectionRequest<ManagementConditionStatementCollectionResponse, IManagementConditionStatementCollectionPage> implements IManagementConditionStatementCollectionReferenceRequest {

    /**
     * The request builder for this collection of ManagementConditionStatement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionStatementCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementConditionStatementCollectionResponse.class, IManagementConditionStatementCollectionPage.class);
    }

    public void post(final ManagementConditionStatement newManagementConditionStatement, final ICallback<ManagementConditionStatement> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/managementConditionStatements/" + newManagementConditionStatement.id);
        new ManagementConditionStatementWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagementConditionStatement, body, callback);
    }

    public ManagementConditionStatement post(final ManagementConditionStatement newManagementConditionStatement) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/managementConditionStatements/" + newManagementConditionStatement.id);
        return new ManagementConditionStatementWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newManagementConditionStatement, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagementConditionStatementCollectionReferenceRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagementConditionStatementCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagementConditionStatementCollectionReferenceRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagementConditionStatementCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagementConditionStatementCollectionReferenceRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ManagementConditionStatementCollectionReferenceRequest)this;
    }
}

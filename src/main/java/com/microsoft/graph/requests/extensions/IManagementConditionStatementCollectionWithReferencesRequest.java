// Template Source: IBaseEntityCollectionWithReferencesRequest.java.tt
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

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Management Condition Statement Collection With References Request.
 */
public interface IManagementConditionStatementCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IManagementConditionStatementCollectionWithReferencesPage> callback);

    IManagementConditionStatementCollectionWithReferencesPage get() throws ClientException;

    IManagementConditionStatementCollectionWithReferencesRequest expand(final String value);
    
    IManagementConditionStatementCollectionWithReferencesRequest select(final String value);

    IManagementConditionStatementCollectionWithReferencesRequest top(final int value);

}

// Template Source: IBaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Category Collection With References Request.
 */
public interface IGroupPolicyCategoryCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IGroupPolicyCategoryCollectionWithReferencesPage> callback);

    IGroupPolicyCategoryCollectionWithReferencesPage get() throws ClientException;

    IGroupPolicyCategoryCollectionWithReferencesRequest expand(final String value);
    
    IGroupPolicyCategoryCollectionWithReferencesRequest select(final String value);

    IGroupPolicyCategoryCollectionWithReferencesRequest top(final int value);

}

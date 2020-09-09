// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ApplicationTemplate;
import com.microsoft.graph.models.extensions.ApplicationServicePrincipal;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Application Template Collection Request.
 */
public interface IApplicationTemplateCollectionRequest {

    void get(final ICallback<IApplicationTemplateCollectionPage> callback);

    IApplicationTemplateCollectionPage get() throws ClientException;

    void post(final ApplicationTemplate newApplicationTemplate, final ICallback<ApplicationTemplate> callback);

    ApplicationTemplate post(final ApplicationTemplate newApplicationTemplate) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IApplicationTemplateCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IApplicationTemplateCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IApplicationTemplateCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IApplicationTemplateCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IApplicationTemplateCollectionRequest skipToken(String skipToken);
}

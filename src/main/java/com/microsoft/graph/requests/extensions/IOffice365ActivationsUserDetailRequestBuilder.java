// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationsUserDetail;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office365Activations User Detail Request Builder.
 */
public interface IOffice365ActivationsUserDetailRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IOffice365ActivationsUserDetailRequest instance
     */
    IOffice365ActivationsUserDetailRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IOffice365ActivationsUserDetailRequest instance
     */
    IOffice365ActivationsUserDetailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


}
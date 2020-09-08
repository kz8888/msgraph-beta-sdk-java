// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.AuthenticationMethod;
import com.microsoft.graph.models.extensions.PasswordResetResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Authentication Method Collection Request.
 */
public interface IAuthenticationMethodCollectionRequest {

    void get(final ICallback<IAuthenticationMethodCollectionPage> callback);

    IAuthenticationMethodCollectionPage get() throws ClientException;

    void post(final AuthenticationMethod newAuthenticationMethod, final ICallback<AuthenticationMethod> callback);

    AuthenticationMethod post(final AuthenticationMethod newAuthenticationMethod) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAuthenticationMethodCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAuthenticationMethodCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAuthenticationMethodCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IAuthenticationMethodCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IAuthenticationMethodCollectionRequest skipToken(String skipToken);
}

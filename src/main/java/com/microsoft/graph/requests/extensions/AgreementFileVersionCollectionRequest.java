// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AgreementFileLocalization;
import com.microsoft.graph.models.extensions.AgreementFileVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.AgreementFileVersionCollectionResponse;
import com.microsoft.graph.requests.extensions.AgreementFileVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementFileVersionCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File Version Collection Request.
 */
public class AgreementFileVersionCollectionRequest extends BaseEntityCollectionRequest<AgreementFileVersion, AgreementFileVersionCollectionResponse, AgreementFileVersionCollectionPage> {

    /**
     * The request builder for this collection of AgreementFileVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementFileVersionCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgreementFileVersionCollectionResponse.class, AgreementFileVersionCollectionPage.class, AgreementFileVersionCollectionRequestBuilder.class);
    }

    /**
     * Creates a new AgreementFileVersion
     * @param newAgreementFileVersion the AgreementFileVersion to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final AgreementFileVersion newAgreementFileVersion, @Nonnull final ICallback<? super AgreementFileVersion> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AgreementFileVersionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAgreementFileVersion, callback);
    }

    /**
     * Creates a new AgreementFileVersion
     * @param newAgreementFileVersion the AgreementFileVersion to create
     * @return the newly created object
     */
    @Nonnull
    public AgreementFileVersion post(@Nonnull final AgreementFileVersion newAgreementFileVersion) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AgreementFileVersionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAgreementFileVersion);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public AgreementFileVersionCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}


// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Terms And Conditions With Reference Request.
 */
public interface ITermsAndConditionsWithReferenceRequest extends IHttpRequest {

    void post(final TermsAndConditions newTermsAndConditions, final IJsonBackedObject payload, final ICallback<? super TermsAndConditions> callback);

    TermsAndConditions post(final TermsAndConditions newTermsAndConditions, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super TermsAndConditions> callback);

    TermsAndConditions get() throws ClientException;

	void delete(final ICallback<? super TermsAndConditions> callback);

	void delete() throws ClientException;

	void patch(final TermsAndConditions sourceTermsAndConditions, final ICallback<? super TermsAndConditions> callback);

	TermsAndConditions patch(final TermsAndConditions sourceTermsAndConditions) throws ClientException;

    ITermsAndConditionsWithReferenceRequest select(final String value);

    ITermsAndConditionsWithReferenceRequest expand(final String value);

}

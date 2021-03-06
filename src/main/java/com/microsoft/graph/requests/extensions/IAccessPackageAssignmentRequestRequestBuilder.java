// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentRequest;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Assignment Request Request Builder.
 */
public interface IAccessPackageAssignmentRequestRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageAssignmentRequestRequest instance
     */
    IAccessPackageAssignmentRequestRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageAssignmentRequestRequest instance
     */
    IAccessPackageAssignmentRequestRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for AccessPackage
     *
     * @return the IAccessPackageWithReferenceRequestBuilder instance
     */
    IAccessPackageWithReferenceRequestBuilder accessPackage();

    /**
     * Gets the request builder for AccessPackageAssignment
     *
     * @return the IAccessPackageAssignmentRequestBuilder instance
     */
    IAccessPackageAssignmentRequestBuilder accessPackageAssignment();

    /**
     * Gets the request builder for AccessPackageSubject
     *
     * @return the IAccessPackageSubjectRequestBuilder instance
     */
    IAccessPackageSubjectRequestBuilder requestor();
    IAccessPackageAssignmentRequestCancelRequestBuilder cancel();

}
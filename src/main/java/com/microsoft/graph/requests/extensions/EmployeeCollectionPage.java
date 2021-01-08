// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Employee;
import com.microsoft.graph.requests.extensions.EmployeeCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.EmployeeCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Employee Collection Page.
 */
public class EmployeeCollectionPage extends BaseCollectionPage<Employee, EmployeeCollectionRequestBuilder> {

    /**
     * A collection page for Employee
     *
     * @param response the serialized EmployeeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EmployeeCollectionPage(@Nonnull final EmployeeCollectionResponse response, @Nonnull final EmployeeCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Employee
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EmployeeCollectionPage(@Nonnull final java.util.List<Employee> pageContents, @Nullable final EmployeeCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

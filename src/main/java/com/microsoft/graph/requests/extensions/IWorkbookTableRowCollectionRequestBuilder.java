// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookTableRow;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookTableRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowAddRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowItemAtRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Row Collection Request Builder.
 */
public interface IWorkbookTableRowCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWorkbookTableRowCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWorkbookTableRowCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookTableRowRequestBuilder byId(final String id);

    IWorkbookTableRowAddRequestBuilder add(final Integer index, final com.google.gson.JsonElement values);
    IWorkbookTableRowCountRequestBuilder count();
    IWorkbookTableRowItemAtRequestBuilder itemAt(final Integer index);
}

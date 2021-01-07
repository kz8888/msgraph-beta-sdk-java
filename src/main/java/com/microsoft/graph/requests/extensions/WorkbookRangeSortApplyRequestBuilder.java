// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookRangeSortApplyRequest;
import com.microsoft.graph.models.extensions.WorkbookRangeSort;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.WorkbookRangeSortApplyParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Sort Apply Request Builder.
 */
public class WorkbookRangeSortApplyRequestBuilder extends BaseActionRequestBuilder<WorkbookRangeSort> {

    private WorkbookRangeSortApplyParameterSet body;
    /**
     * The request builder for this WorkbookRangeSortApply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookRangeSortApplyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookRangeSortApplyParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookRangeSortApplyRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeSortApplyRequest instance
     */
    @Nonnull
    public WorkbookRangeSortApplyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookRangeSortApplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeSortApplyRequest instance
     */
    @Nonnull
    public WorkbookRangeSortApplyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRangeSortApplyRequest request = new WorkbookRangeSortApplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}

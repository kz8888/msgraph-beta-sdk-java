// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookFilter;
import com.microsoft.graph.models.extensions.WorkbookFilterCriteria;
import com.microsoft.graph.models.extensions.WorkbookIcon;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Filter Request Builder.
 */
public interface IWorkbookFilterRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookFilterRequest instance
     */
    IWorkbookFilterRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookFilterRequest instance
     */
    IWorkbookFilterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookFilterApplyRequestBuilder apply(final WorkbookFilterCriteria criteria);
    IWorkbookFilterApplyBottomItemsFilterRequestBuilder applyBottomItemsFilter(final Integer count);
    IWorkbookFilterApplyBottomPercentFilterRequestBuilder applyBottomPercentFilter(final Integer percent);
    IWorkbookFilterApplyCellColorFilterRequestBuilder applyCellColorFilter(final String color);
    IWorkbookFilterApplyCustomFilterRequestBuilder applyCustomFilter(final String criteria1, final String criteria2, final String oper);
    IWorkbookFilterApplyDynamicFilterRequestBuilder applyDynamicFilter(final String criteria);
    IWorkbookFilterApplyFontColorFilterRequestBuilder applyFontColorFilter(final String color);
    IWorkbookFilterApplyIconFilterRequestBuilder applyIconFilter(final WorkbookIcon icon);
    IWorkbookFilterApplyTopItemsFilterRequestBuilder applyTopItemsFilter(final Integer count);
    IWorkbookFilterApplyTopPercentFilterRequestBuilder applyTopPercentFilter(final Integer percent);
    IWorkbookFilterApplyValuesFilterRequestBuilder applyValuesFilter(final com.google.gson.JsonElement values);
    IWorkbookFilterClearRequestBuilder clear();

}
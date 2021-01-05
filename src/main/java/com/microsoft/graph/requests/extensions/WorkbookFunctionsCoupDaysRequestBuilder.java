// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCoupDaysRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCoupDaysRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Coup Days Request Builder.
 */
public class WorkbookFunctionsCoupDaysRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsCoupDaysRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCoupDays
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param frequency the frequency
     * @param basis the basis
     */
    public WorkbookFunctionsCoupDaysRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("frequency", frequency);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsCoupDaysRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCoupDaysRequest instance
     */
    public IWorkbookFunctionsCoupDaysRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsCoupDaysRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCoupDaysRequest instance
     */
    public IWorkbookFunctionsCoupDaysRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsCoupDaysRequest request = new WorkbookFunctionsCoupDaysRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("frequency")) {
            request.body.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}

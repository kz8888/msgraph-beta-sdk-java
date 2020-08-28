// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintTaskTrigger;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Task Trigger Collection Request.
 */
public interface IPrintTaskTriggerCollectionRequest {

    void get(final ICallback<IPrintTaskTriggerCollectionPage> callback);

    IPrintTaskTriggerCollectionPage get() throws ClientException;

    void post(final PrintTaskTrigger newPrintTaskTrigger, final ICallback<PrintTaskTrigger> callback);

    PrintTaskTrigger post(final PrintTaskTrigger newPrintTaskTrigger) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintTaskTriggerCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintTaskTriggerCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IPrintTaskTriggerCollectionRequest top(final int value);

}
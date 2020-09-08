// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InformationProtectionLabel;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.LabelingOptions;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import com.microsoft.graph.models.extensions.ClassificationResult;
import com.microsoft.graph.models.extensions.DowngradeJustification;
import com.microsoft.graph.models.extensions.InformationProtectionContentLabel;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Request.
 */
public class InformationProtectionLabelRequest extends BaseRequest implements IInformationProtectionLabelRequest {
	
    /**
     * The request for the InformationProtectionLabel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionLabelRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InformationProtectionLabel.class);
    }

    /**
     * Gets the InformationProtectionLabel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<InformationProtectionLabel> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the InformationProtectionLabel from the service
     *
     * @return the InformationProtectionLabel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InformationProtectionLabel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<InformationProtectionLabel> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this InformationProtectionLabel with a source
     *
     * @param sourceInformationProtectionLabel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final InformationProtectionLabel sourceInformationProtectionLabel, final ICallback<InformationProtectionLabel> callback) {
        send(HttpMethod.PATCH, callback, sourceInformationProtectionLabel);
    }

    /**
     * Patches this InformationProtectionLabel with a source
     *
     * @param sourceInformationProtectionLabel the source object with updates
     * @return the updated InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InformationProtectionLabel patch(final InformationProtectionLabel sourceInformationProtectionLabel) throws ClientException {
        return send(HttpMethod.PATCH, sourceInformationProtectionLabel);
    }

    /**
     * Creates a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final InformationProtectionLabel newInformationProtectionLabel, final ICallback<InformationProtectionLabel> callback) {
        send(HttpMethod.POST, callback, newInformationProtectionLabel);
    }

    /**
     * Creates a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the new object to create
     * @return the created InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InformationProtectionLabel post(final InformationProtectionLabel newInformationProtectionLabel) throws ClientException {
        return send(HttpMethod.POST, newInformationProtectionLabel);
    }

    /**
     * Creates a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final InformationProtectionLabel newInformationProtectionLabel, final ICallback<InformationProtectionLabel> callback) {
        send(HttpMethod.PUT, callback, newInformationProtectionLabel);
    }

    /**
     * Creates a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the object to create/update
     * @return the created InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InformationProtectionLabel put(final InformationProtectionLabel newInformationProtectionLabel) throws ClientException {
        return send(HttpMethod.PUT, newInformationProtectionLabel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IInformationProtectionLabelRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (InformationProtectionLabelRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IInformationProtectionLabelRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (InformationProtectionLabelRequest)this;
     }

}


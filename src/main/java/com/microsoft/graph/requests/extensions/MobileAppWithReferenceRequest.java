// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import com.microsoft.graph.models.extensions.MobileAppRelationship;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.MobileAppRelationshipState;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App With Reference Request.
 */
public class MobileAppWithReferenceRequest extends BaseRequest implements IMobileAppWithReferenceRequest {

    /**
     * The request for the MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileApp.class);
    }

    public void post(final MobileApp newMobileApp, final IJsonBackedObject payload, final ICallback<MobileApp> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public MobileApp post(final MobileApp newMobileApp, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newMobileApp;
        }
        return null;
    }

    public void get(final ICallback<MobileApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public MobileApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<MobileApp> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final MobileApp sourceMobileApp, final ICallback<MobileApp> callback) {
		send(HttpMethod.PATCH, callback, sourceMobileApp);
	}

	public MobileApp patch(final MobileApp sourceMobileApp) throws ClientException {
		return send(HttpMethod.PATCH, sourceMobileApp);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileAppWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IMobileAppWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileAppWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MobileAppWithReferenceRequest)this;
    }
}
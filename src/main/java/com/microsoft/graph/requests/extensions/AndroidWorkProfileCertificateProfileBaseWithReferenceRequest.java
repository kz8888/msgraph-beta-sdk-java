// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidWorkProfileTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidWorkProfileTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Certificate Profile Base With Reference Request.
 */
public class AndroidWorkProfileCertificateProfileBaseWithReferenceRequest extends BaseRequest implements IAndroidWorkProfileCertificateProfileBaseWithReferenceRequest {

    /**
     * The request for the AndroidWorkProfileCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileCertificateProfileBaseWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileCertificateProfileBase.class);
    }

    public void post(final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase, final IJsonBackedObject payload, final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public AndroidWorkProfileCertificateProfileBase post(final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newAndroidWorkProfileCertificateProfileBase;
        }
        return null;
    }

    public void get(final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public AndroidWorkProfileCertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final AndroidWorkProfileCertificateProfileBase sourceAndroidWorkProfileCertificateProfileBase, final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback) {
		send(HttpMethod.PATCH, callback, sourceAndroidWorkProfileCertificateProfileBase);
	}

	public AndroidWorkProfileCertificateProfileBase patch(final AndroidWorkProfileCertificateProfileBase sourceAndroidWorkProfileCertificateProfileBase) throws ClientException {
		return send(HttpMethod.PATCH, sourceAndroidWorkProfileCertificateProfileBase);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidWorkProfileCertificateProfileBaseWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAndroidWorkProfileCertificateProfileBaseWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidWorkProfileCertificateProfileBaseWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidWorkProfileCertificateProfileBaseWithReferenceRequest)this;
    }
}

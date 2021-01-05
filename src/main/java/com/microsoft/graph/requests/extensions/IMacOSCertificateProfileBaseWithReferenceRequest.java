// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSCertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MacOSCertificateProfileBase;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSCertificate Profile Base With Reference Request.
 */
public interface IMacOSCertificateProfileBaseWithReferenceRequest extends IHttpRequest {

    void post(final MacOSCertificateProfileBase newMacOSCertificateProfileBase, final IJsonBackedObject payload, final ICallback<? super MacOSCertificateProfileBase> callback);

    MacOSCertificateProfileBase post(final MacOSCertificateProfileBase newMacOSCertificateProfileBase, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super MacOSCertificateProfileBase> callback);

    MacOSCertificateProfileBase get() throws ClientException;

	void delete(final ICallback<? super MacOSCertificateProfileBase> callback);

	void delete() throws ClientException;

	void patch(final MacOSCertificateProfileBase sourceMacOSCertificateProfileBase, final ICallback<? super MacOSCertificateProfileBase> callback);

	MacOSCertificateProfileBase patch(final MacOSCertificateProfileBase sourceMacOSCertificateProfileBase) throws ClientException;

    IMacOSCertificateProfileBaseWithReferenceRequest select(final String value);

    IMacOSCertificateProfileBaseWithReferenceRequest expand(final String value);

}

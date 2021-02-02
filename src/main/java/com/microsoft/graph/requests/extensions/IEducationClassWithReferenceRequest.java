// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.requests.extensions.IEducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Class With Reference Request.
 */
public interface IEducationClassWithReferenceRequest extends IHttpRequest {

    void post(final EducationClass newEducationClass, final IJsonBackedObject payload, final ICallback<? super EducationClass> callback);

    EducationClass post(final EducationClass newEducationClass, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super EducationClass> callback);

    EducationClass get() throws ClientException;

	void delete(final ICallback<? super EducationClass> callback);

	void delete() throws ClientException;

	void patch(final EducationClass sourceEducationClass, final ICallback<? super EducationClass> callback);

	EducationClass patch(final EducationClass sourceEducationClass) throws ClientException;

    IEducationClassWithReferenceRequest select(final String value);

    IEducationClassWithReferenceRequest expand(final String value);

}

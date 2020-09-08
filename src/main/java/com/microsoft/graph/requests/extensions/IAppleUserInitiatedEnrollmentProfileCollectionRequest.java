// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.AppleUserInitiatedEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Apple User Initiated Enrollment Profile Collection Request.
 */
public interface IAppleUserInitiatedEnrollmentProfileCollectionRequest {

    void get(final ICallback<IAppleUserInitiatedEnrollmentProfileCollectionPage> callback);

    IAppleUserInitiatedEnrollmentProfileCollectionPage get() throws ClientException;

    void post(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile, final ICallback<AppleUserInitiatedEnrollmentProfile> callback);

    AppleUserInitiatedEnrollmentProfile post(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAppleUserInitiatedEnrollmentProfileCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAppleUserInitiatedEnrollmentProfileCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAppleUserInitiatedEnrollmentProfileCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IAppleUserInitiatedEnrollmentProfileCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IAppleUserInitiatedEnrollmentProfileCollectionRequest skipToken(String skipToken);
}

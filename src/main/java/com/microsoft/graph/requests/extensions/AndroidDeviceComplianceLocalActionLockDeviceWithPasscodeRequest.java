// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidDeviceComplianceLocalActionLockDeviceWithPasscode;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Compliance Local Action Lock Device With Passcode Request.
 */
public class AndroidDeviceComplianceLocalActionLockDeviceWithPasscodeRequest extends BaseRequest<AndroidDeviceComplianceLocalActionLockDeviceWithPasscode> {
	
    /**
     * The request for the AndroidDeviceComplianceLocalActionLockDeviceWithPasscode
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceComplianceLocalActionLockDeviceWithPasscodeRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceComplianceLocalActionLockDeviceWithPasscode.class);
    }

    /**
     * Gets the AndroidDeviceComplianceLocalActionLockDeviceWithPasscode from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AndroidDeviceComplianceLocalActionLockDeviceWithPasscode> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidDeviceComplianceLocalActionLockDeviceWithPasscode from the service
     *
     * @return the AndroidDeviceComplianceLocalActionLockDeviceWithPasscode from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDeviceWithPasscode get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AndroidDeviceComplianceLocalActionLockDeviceWithPasscode> callback) {
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
     * Patches this AndroidDeviceComplianceLocalActionLockDeviceWithPasscode with a source
     *
     * @param sourceAndroidDeviceComplianceLocalActionLockDeviceWithPasscode the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AndroidDeviceComplianceLocalActionLockDeviceWithPasscode sourceAndroidDeviceComplianceLocalActionLockDeviceWithPasscode, @Nonnull final ICallback<? super AndroidDeviceComplianceLocalActionLockDeviceWithPasscode> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidDeviceComplianceLocalActionLockDeviceWithPasscode);
    }

    /**
     * Patches this AndroidDeviceComplianceLocalActionLockDeviceWithPasscode with a source
     *
     * @param sourceAndroidDeviceComplianceLocalActionLockDeviceWithPasscode the source object with updates
     * @return the updated AndroidDeviceComplianceLocalActionLockDeviceWithPasscode
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDeviceWithPasscode patch(@Nonnull final AndroidDeviceComplianceLocalActionLockDeviceWithPasscode sourceAndroidDeviceComplianceLocalActionLockDeviceWithPasscode) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceComplianceLocalActionLockDeviceWithPasscode);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionLockDeviceWithPasscode with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AndroidDeviceComplianceLocalActionLockDeviceWithPasscode newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode, @Nonnull final ICallback<? super AndroidDeviceComplianceLocalActionLockDeviceWithPasscode> callback) {
        send(HttpMethod.POST, callback, newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionLockDeviceWithPasscode with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode the new object to create
     * @return the created AndroidDeviceComplianceLocalActionLockDeviceWithPasscode
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDeviceWithPasscode post(@Nonnull final AndroidDeviceComplianceLocalActionLockDeviceWithPasscode newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionLockDeviceWithPasscode with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AndroidDeviceComplianceLocalActionLockDeviceWithPasscode newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode, @Nonnull final ICallback<? super AndroidDeviceComplianceLocalActionLockDeviceWithPasscode> callback) {
        send(HttpMethod.PUT, callback, newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionLockDeviceWithPasscode with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode the object to create/update
     * @return the created AndroidDeviceComplianceLocalActionLockDeviceWithPasscode
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDeviceWithPasscode put(@Nonnull final AndroidDeviceComplianceLocalActionLockDeviceWithPasscode newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceComplianceLocalActionLockDeviceWithPasscode);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidDeviceComplianceLocalActionLockDeviceWithPasscodeRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AndroidDeviceComplianceLocalActionLockDeviceWithPasscodeRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


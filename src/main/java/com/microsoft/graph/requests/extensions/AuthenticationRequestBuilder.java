// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.requests.extensions.IEmailAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmailAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IFido2AuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFido2AuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ILongRunningOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILongRunningOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.LongRunningOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LongRunningOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordlessMicrosoftAuthenticatorAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPasswordAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PasswordAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PasswordAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPhoneAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPhoneAuthenticationMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Request Builder.
 */
public class AuthenticationRequestBuilder extends BaseRequestBuilder implements IAuthenticationRequestBuilder {

    /**
     * The request builder for the Authentication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAuthenticationRequest instance
     */
    public IAuthenticationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAuthenticationRequest instance
     */
    public IAuthenticationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AuthenticationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEmailAuthenticationMethodCollectionRequestBuilder emailMethods() {
        return new EmailAuthenticationMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("emailMethods"), getClient(), null);
    }

    public IEmailAuthenticationMethodRequestBuilder emailMethods(final String id) {
        return new EmailAuthenticationMethodRequestBuilder(getRequestUrlWithAdditionalSegment("emailMethods") + "/" + id, getClient(), null);
    }
    public IFido2AuthenticationMethodCollectionRequestBuilder fido2Methods() {
        return new Fido2AuthenticationMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("fido2Methods"), getClient(), null);
    }

    public IFido2AuthenticationMethodRequestBuilder fido2Methods(final String id) {
        return new Fido2AuthenticationMethodRequestBuilder(getRequestUrlWithAdditionalSegment("fido2Methods") + "/" + id, getClient(), null);
    }
    public IAuthenticationMethodCollectionRequestBuilder methods() {
        return new AuthenticationMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("methods"), getClient(), null);
    }

    public IAuthenticationMethodRequestBuilder methods(final String id) {
        return new AuthenticationMethodRequestBuilder(getRequestUrlWithAdditionalSegment("methods") + "/" + id, getClient(), null);
    }
    public ILongRunningOperationCollectionRequestBuilder operations() {
        return new LongRunningOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    public ILongRunningOperationRequestBuilder operations(final String id) {
        return new LongRunningOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    public IPasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder passwordlessMicrosoftAuthenticatorMethods() {
        return new PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("passwordlessMicrosoftAuthenticatorMethods"), getClient(), null);
    }

    public IPasswordlessMicrosoftAuthenticatorAuthenticationMethodRequestBuilder passwordlessMicrosoftAuthenticatorMethods(final String id) {
        return new PasswordlessMicrosoftAuthenticatorAuthenticationMethodRequestBuilder(getRequestUrlWithAdditionalSegment("passwordlessMicrosoftAuthenticatorMethods") + "/" + id, getClient(), null);
    }
    public IPasswordAuthenticationMethodCollectionRequestBuilder passwordMethods() {
        return new PasswordAuthenticationMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("passwordMethods"), getClient(), null);
    }

    public IPasswordAuthenticationMethodRequestBuilder passwordMethods(final String id) {
        return new PasswordAuthenticationMethodRequestBuilder(getRequestUrlWithAdditionalSegment("passwordMethods") + "/" + id, getClient(), null);
    }
    public IPhoneAuthenticationMethodCollectionRequestBuilder phoneMethods() {
        return new PhoneAuthenticationMethodCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("phoneMethods"), getClient(), null);
    }

    public IPhoneAuthenticationMethodRequestBuilder phoneMethods(final String id) {
        return new PhoneAuthenticationMethodRequestBuilder(getRequestUrlWithAdditionalSegment("phoneMethods") + "/" + id, getClient(), null);
    }
}

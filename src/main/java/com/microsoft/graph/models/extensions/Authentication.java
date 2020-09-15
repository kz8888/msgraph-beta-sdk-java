// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EmailAuthenticationMethod;
import com.microsoft.graph.models.extensions.Fido2AuthenticationMethod;
import com.microsoft.graph.models.extensions.AuthenticationMethod;
import com.microsoft.graph.models.extensions.MicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.extensions.SoftwareOathAuthenticationMethod;
import com.microsoft.graph.models.extensions.LongRunningOperation;
import com.microsoft.graph.models.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.extensions.PasswordAuthenticationMethod;
import com.microsoft.graph.models.extensions.PhoneAuthenticationMethod;
import com.microsoft.graph.models.extensions.SecurityQuestionAuthenticationMethod;
import com.microsoft.graph.models.extensions.TemporaryAccessPassAuthenticationMethod;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.AuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.SoftwareOathAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.SoftwareOathAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.LongRunningOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.LongRunningOperationCollectionPage;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.PasswordAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.PasswordAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.SecurityQuestionAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.SecurityQuestionAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication.
 */
public class Authentication extends Entity implements IJsonBackedObject {


    /**
     * The Email Methods.
     * 
     */
    @SerializedName("emailMethods")
    @Expose
    public EmailAuthenticationMethodCollectionPage emailMethods;

    /**
     * The Fido2Methods.
     * 
     */
    @SerializedName("fido2Methods")
    @Expose
    public Fido2AuthenticationMethodCollectionPage fido2Methods;

    /**
     * The Methods.
     * 
     */
    @SerializedName("methods")
    @Expose
    public AuthenticationMethodCollectionPage methods;

    /**
     * The Microsoft Authenticator Methods.
     * 
     */
    @SerializedName("microsoftAuthenticatorMethods")
    @Expose
    public MicrosoftAuthenticatorAuthenticationMethodCollectionPage microsoftAuthenticatorMethods;

    /**
     * The Oath Methods.
     * 
     */
    @SerializedName("oathMethods")
    @Expose
    public SoftwareOathAuthenticationMethodCollectionPage oathMethods;

    /**
     * The Operations.
     * 
     */
    @SerializedName("operations")
    @Expose
    public LongRunningOperationCollectionPage operations;

    /**
     * The Passwordless Microsoft Authenticator Methods.
     * 
     */
    @SerializedName("passwordlessMicrosoftAuthenticatorMethods")
    @Expose
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage passwordlessMicrosoftAuthenticatorMethods;

    /**
     * The Password Methods.
     * 
     */
    @SerializedName("passwordMethods")
    @Expose
    public PasswordAuthenticationMethodCollectionPage passwordMethods;

    /**
     * The Phone Methods.
     * 
     */
    @SerializedName("phoneMethods")
    @Expose
    public PhoneAuthenticationMethodCollectionPage phoneMethods;

    /**
     * The Security Question Methods.
     * 
     */
    @SerializedName("securityQuestionMethods")
    @Expose
    public SecurityQuestionAuthenticationMethodCollectionPage securityQuestionMethods;

    /**
     * The Temporary Access Pass Methods.
     * 
     */
    @SerializedName("temporaryAccessPassMethods")
    @Expose
    public TemporaryAccessPassAuthenticationMethodCollectionPage temporaryAccessPassMethods;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("emailMethods")) {
            final EmailAuthenticationMethodCollectionResponse response = new EmailAuthenticationMethodCollectionResponse();
            if (json.has("emailMethods@odata.nextLink")) {
                response.nextLink = json.get("emailMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("emailMethods").toString(), JsonObject[].class);
            final EmailAuthenticationMethod[] array = new EmailAuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EmailAuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            emailMethods = new EmailAuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("fido2Methods")) {
            final Fido2AuthenticationMethodCollectionResponse response = new Fido2AuthenticationMethodCollectionResponse();
            if (json.has("fido2Methods@odata.nextLink")) {
                response.nextLink = json.get("fido2Methods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("fido2Methods").toString(), JsonObject[].class);
            final Fido2AuthenticationMethod[] array = new Fido2AuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Fido2AuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            fido2Methods = new Fido2AuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("methods")) {
            final AuthenticationMethodCollectionResponse response = new AuthenticationMethodCollectionResponse();
            if (json.has("methods@odata.nextLink")) {
                response.nextLink = json.get("methods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("methods").toString(), JsonObject[].class);
            final AuthenticationMethod[] array = new AuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            methods = new AuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("microsoftAuthenticatorMethods")) {
            final MicrosoftAuthenticatorAuthenticationMethodCollectionResponse response = new MicrosoftAuthenticatorAuthenticationMethodCollectionResponse();
            if (json.has("microsoftAuthenticatorMethods@odata.nextLink")) {
                response.nextLink = json.get("microsoftAuthenticatorMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("microsoftAuthenticatorMethods").toString(), JsonObject[].class);
            final MicrosoftAuthenticatorAuthenticationMethod[] array = new MicrosoftAuthenticatorAuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MicrosoftAuthenticatorAuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            microsoftAuthenticatorMethods = new MicrosoftAuthenticatorAuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("oathMethods")) {
            final SoftwareOathAuthenticationMethodCollectionResponse response = new SoftwareOathAuthenticationMethodCollectionResponse();
            if (json.has("oathMethods@odata.nextLink")) {
                response.nextLink = json.get("oathMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("oathMethods").toString(), JsonObject[].class);
            final SoftwareOathAuthenticationMethod[] array = new SoftwareOathAuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SoftwareOathAuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            oathMethods = new SoftwareOathAuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("operations")) {
            final LongRunningOperationCollectionResponse response = new LongRunningOperationCollectionResponse();
            if (json.has("operations@odata.nextLink")) {
                response.nextLink = json.get("operations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("operations").toString(), JsonObject[].class);
            final LongRunningOperation[] array = new LongRunningOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), LongRunningOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            operations = new LongRunningOperationCollectionPage(response, null);
        }

        if (json.has("passwordlessMicrosoftAuthenticatorMethods")) {
            final PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionResponse response = new PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionResponse();
            if (json.has("passwordlessMicrosoftAuthenticatorMethods@odata.nextLink")) {
                response.nextLink = json.get("passwordlessMicrosoftAuthenticatorMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("passwordlessMicrosoftAuthenticatorMethods").toString(), JsonObject[].class);
            final PasswordlessMicrosoftAuthenticatorAuthenticationMethod[] array = new PasswordlessMicrosoftAuthenticatorAuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PasswordlessMicrosoftAuthenticatorAuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            passwordlessMicrosoftAuthenticatorMethods = new PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("passwordMethods")) {
            final PasswordAuthenticationMethodCollectionResponse response = new PasswordAuthenticationMethodCollectionResponse();
            if (json.has("passwordMethods@odata.nextLink")) {
                response.nextLink = json.get("passwordMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("passwordMethods").toString(), JsonObject[].class);
            final PasswordAuthenticationMethod[] array = new PasswordAuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PasswordAuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            passwordMethods = new PasswordAuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("phoneMethods")) {
            final PhoneAuthenticationMethodCollectionResponse response = new PhoneAuthenticationMethodCollectionResponse();
            if (json.has("phoneMethods@odata.nextLink")) {
                response.nextLink = json.get("phoneMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("phoneMethods").toString(), JsonObject[].class);
            final PhoneAuthenticationMethod[] array = new PhoneAuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PhoneAuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            phoneMethods = new PhoneAuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("securityQuestionMethods")) {
            final SecurityQuestionAuthenticationMethodCollectionResponse response = new SecurityQuestionAuthenticationMethodCollectionResponse();
            if (json.has("securityQuestionMethods@odata.nextLink")) {
                response.nextLink = json.get("securityQuestionMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("securityQuestionMethods").toString(), JsonObject[].class);
            final SecurityQuestionAuthenticationMethod[] array = new SecurityQuestionAuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SecurityQuestionAuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            securityQuestionMethods = new SecurityQuestionAuthenticationMethodCollectionPage(response, null);
        }

        if (json.has("temporaryAccessPassMethods")) {
            final TemporaryAccessPassAuthenticationMethodCollectionResponse response = new TemporaryAccessPassAuthenticationMethodCollectionResponse();
            if (json.has("temporaryAccessPassMethods@odata.nextLink")) {
                response.nextLink = json.get("temporaryAccessPassMethods@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("temporaryAccessPassMethods").toString(), JsonObject[].class);
            final TemporaryAccessPassAuthenticationMethod[] array = new TemporaryAccessPassAuthenticationMethod[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TemporaryAccessPassAuthenticationMethod.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            temporaryAccessPassMethods = new TemporaryAccessPassAuthenticationMethodCollectionPage(response, null);
        }
    }
}

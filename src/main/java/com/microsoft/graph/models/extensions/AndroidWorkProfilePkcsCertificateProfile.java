// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.generated.CertificateStore;
import com.microsoft.graph.models.extensions.CustomSubjectAlternativeName;
import com.microsoft.graph.models.extensions.ManagedDeviceCertificateState;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCertificateProfileBase;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Pkcs Certificate Profile.
 */
public class AndroidWorkProfilePkcsCertificateProfile extends AndroidWorkProfileCertificateProfileBase implements IJsonBackedObject {


    /**
     * The Certificate Store.
     * Target store certificate
     */
    @SerializedName(value = "certificateStore", alternate = {"CertificateStore"})
    @Expose
	@Nullable
    public CertificateStore certificateStore;

    /**
     * The Certificate Template Name.
     * PKCS Certificate Template Name
     */
    @SerializedName(value = "certificateTemplateName", alternate = {"CertificateTemplateName"})
    @Expose
	@Nullable
    public String certificateTemplateName;

    /**
     * The Certification Authority.
     * PKCS Certification Authority
     */
    @SerializedName(value = "certificationAuthority", alternate = {"CertificationAuthority"})
    @Expose
	@Nullable
    public String certificationAuthority;

    /**
     * The Certification Authority Name.
     * PKCS Certification Authority Name
     */
    @SerializedName(value = "certificationAuthorityName", alternate = {"CertificationAuthorityName"})
    @Expose
	@Nullable
    public String certificationAuthorityName;

    /**
     * The Custom Subject Alternative Names.
     * Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "customSubjectAlternativeNames", alternate = {"CustomSubjectAlternativeNames"})
    @Expose
	@Nullable
    public java.util.List<CustomSubjectAlternativeName> customSubjectAlternativeNames;

    /**
     * The Subject Alternative Name Format String.
     * Custom String that defines the AAD Attribute.
     */
    @SerializedName(value = "subjectAlternativeNameFormatString", alternate = {"SubjectAlternativeNameFormatString"})
    @Expose
	@Nullable
    public String subjectAlternativeNameFormatString;

    /**
     * The Subject Name Format String.
     * Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     */
    @SerializedName(value = "subjectNameFormatString", alternate = {"SubjectNameFormatString"})
    @Expose
	@Nullable
    public String subjectNameFormatString;

    /**
     * The Managed Device Certificate States.
     * Certificate state for devices
     */
    @SerializedName(value = "managedDeviceCertificateStates", alternate = {"ManagedDeviceCertificateStates"})
    @Expose
	@Nullable
    public ManagedDeviceCertificateStateCollectionPage managedDeviceCertificateStates;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("managedDeviceCertificateStates")) {
            managedDeviceCertificateStates = serializer.deserializeObject(json.get("managedDeviceCertificateStates").toString(), ManagedDeviceCertificateStateCollectionPage.class);
        }
    }
}

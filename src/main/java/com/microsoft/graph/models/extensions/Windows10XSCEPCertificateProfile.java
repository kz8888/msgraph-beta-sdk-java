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
import com.microsoft.graph.models.generated.CertificateValidityPeriodScale;
import com.microsoft.graph.models.extensions.ExtendedKeyUsage;
import com.microsoft.graph.models.generated.HashAlgorithms;
import com.microsoft.graph.models.generated.KeySize;
import com.microsoft.graph.models.generated.KeyStorageProviderOption;
import com.microsoft.graph.models.generated.KeyUsages;
import com.microsoft.graph.models.extensions.Windows10XCustomSubjectAlternativeName;
import com.microsoft.graph.models.extensions.Windows10XCertificateProfile;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10XSCEPCertificate Profile.
 */
public class Windows10XSCEPCertificateProfile extends Windows10XCertificateProfile implements IJsonBackedObject {


    /**
     * The Certificate Store.
     * Target store certificate
     */
    @SerializedName(value = "certificateStore", alternate = {"CertificateStore"})
    @Expose
	@Nullable
    public CertificateStore certificateStore;

    /**
     * The Certificate Validity Period Scale.
     * Scale for the Certificate Validity Period
     */
    @SerializedName(value = "certificateValidityPeriodScale", alternate = {"CertificateValidityPeriodScale"})
    @Expose
	@Nullable
    public CertificateValidityPeriodScale certificateValidityPeriodScale;

    /**
     * The Certificate Validity Period Value.
     * Value for the Certificate Validity Period
     */
    @SerializedName(value = "certificateValidityPeriodValue", alternate = {"CertificateValidityPeriodValue"})
    @Expose
	@Nullable
    public Integer certificateValidityPeriodValue;

    /**
     * The Extended Key Usages.
     * Extended Key Usage (EKU) settings.
     */
    @SerializedName(value = "extendedKeyUsages", alternate = {"ExtendedKeyUsages"})
    @Expose
	@Nullable
    public java.util.List<ExtendedKeyUsage> extendedKeyUsages;

    /**
     * The Hash Algorithm.
     * SCEP Hash Algorithm.
     */
    @SerializedName(value = "hashAlgorithm", alternate = {"HashAlgorithm"})
    @Expose
	@Nullable
    public java.util.List<EnumSet<HashAlgorithms>> hashAlgorithm;

    /**
     * The Key Size.
     * SCEP Key Size.
     */
    @SerializedName(value = "keySize", alternate = {"KeySize"})
    @Expose
	@Nullable
    public KeySize keySize;

    /**
     * The Key Storage Provider.
     * Key Storage Provider (KSP)
     */
    @SerializedName(value = "keyStorageProvider", alternate = {"KeyStorageProvider"})
    @Expose
	@Nullable
    public KeyStorageProviderOption keyStorageProvider;

    /**
     * The Key Usage.
     * SCEP Key Usage.
     */
    @SerializedName(value = "keyUsage", alternate = {"KeyUsage"})
    @Expose
	@Nullable
    public EnumSet<KeyUsages> keyUsage;

    /**
     * The Renewal Threshold Percentage.
     * Certificate renewal threshold percentage
     */
    @SerializedName(value = "renewalThresholdPercentage", alternate = {"RenewalThresholdPercentage"})
    @Expose
	@Nullable
    public Integer renewalThresholdPercentage;

    /**
     * The Root Certificate Id.
     * Trusted Root Certificate ID
     */
    @SerializedName(value = "rootCertificateId", alternate = {"RootCertificateId"})
    @Expose
	@Nullable
    public java.util.UUID rootCertificateId;

    /**
     * The Scep Server Urls.
     * SCEP Server Url(s).
     */
    @SerializedName(value = "scepServerUrls", alternate = {"ScepServerUrls"})
    @Expose
	@Nullable
    public java.util.List<String> scepServerUrls;

    /**
     * The Subject Alternative Name Formats.
     * Custom AAD Attributes.
     */
    @SerializedName(value = "subjectAlternativeNameFormats", alternate = {"SubjectAlternativeNameFormats"})
    @Expose
	@Nullable
    public java.util.List<Windows10XCustomSubjectAlternativeName> subjectAlternativeNameFormats;

    /**
     * The Subject Name Format String.
     * Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US
     */
    @SerializedName(value = "subjectNameFormatString", alternate = {"SubjectNameFormatString"})
    @Expose
	@Nullable
    public String subjectNameFormatString;


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

    }
}

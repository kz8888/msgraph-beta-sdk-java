// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CertificateValidityPeriodScale;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Edu Certificate Settings.
 */
public class IosEduCertificateSettings implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Cert File Name.
     * File name to display in UI.
     */
    @SerializedName(value = "certFileName", alternate = {"CertFileName"})
    @Expose
	@Nullable
    public String certFileName;

    /**
     * The Certificate Template Name.
     * PKCS Certificate Template Name.
     */
    @SerializedName(value = "certificateTemplateName", alternate = {"CertificateTemplateName"})
    @Expose
	@Nullable
    public String certificateTemplateName;

    /**
     * The Certificate Validity Period Scale.
     * Scale for the Certificate Validity Period.
     */
    @SerializedName(value = "certificateValidityPeriodScale", alternate = {"CertificateValidityPeriodScale"})
    @Expose
	@Nullable
    public CertificateValidityPeriodScale certificateValidityPeriodScale;

    /**
     * The Certificate Validity Period Value.
     * Value for the Certificate Validity Period.
     */
    @SerializedName(value = "certificateValidityPeriodValue", alternate = {"CertificateValidityPeriodValue"})
    @Expose
	@Nullable
    public Integer certificateValidityPeriodValue;

    /**
     * The Certification Authority.
     * PKCS Certification Authority.
     */
    @SerializedName(value = "certificationAuthority", alternate = {"CertificationAuthority"})
    @Expose
	@Nullable
    public String certificationAuthority;

    /**
     * The Certification Authority Name.
     * PKCS Certification Authority Name.
     */
    @SerializedName(value = "certificationAuthorityName", alternate = {"CertificationAuthorityName"})
    @Expose
	@Nullable
    public String certificationAuthorityName;

    /**
     * The Renewal Threshold Percentage.
     * Certificate renewal threshold percentage. Valid values 1 to 99
     */
    @SerializedName(value = "renewalThresholdPercentage", alternate = {"RenewalThresholdPercentage"})
    @Expose
	@Nullable
    public Integer renewalThresholdPercentage;

    /**
     * The Trusted Root Certificate.
     * Trusted Root Certificate.
     */
    @SerializedName(value = "trustedRootCertificate", alternate = {"TrustedRootCertificate"})
    @Expose
	@Nullable
    public byte[] trustedRootCertificate;


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

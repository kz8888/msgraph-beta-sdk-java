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
import com.microsoft.graph.models.extensions.AssignmentReviewSettings;
import com.microsoft.graph.models.extensions.AccessPackageQuestion;
import com.microsoft.graph.models.extensions.ApprovalSettings;
import com.microsoft.graph.models.extensions.RequestorSettings;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.models.extensions.AccessPackageCatalog;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Policy.
 */
public class AccessPackageAssignmentPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Access Package Id.
     * 
     */
    @SerializedName(value = "accessPackageId", alternate = {"AccessPackageId"})
    @Expose
	@Nullable
    public String accessPackageId;

    /**
     * The Access Review Settings.
     * 
     */
    @SerializedName(value = "accessReviewSettings", alternate = {"AccessReviewSettings"})
    @Expose
	@Nullable
    public AssignmentReviewSettings accessReviewSettings;

    /**
     * The Can Extend.
     * 
     */
    @SerializedName(value = "canExtend", alternate = {"CanExtend"})
    @Expose
	@Nullable
    public Boolean canExtend;

    /**
     * The Created By.
     * 
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public String createdBy;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Duration In Days.
     * 
     */
    @SerializedName(value = "durationInDays", alternate = {"DurationInDays"})
    @Expose
	@Nullable
    public Integer durationInDays;

    /**
     * The Expiration Date Time.
     * 
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar expirationDateTime;

    /**
     * The Modified By.
     * 
     */
    @SerializedName(value = "modifiedBy", alternate = {"ModifiedBy"})
    @Expose
	@Nullable
    public String modifiedBy;

    /**
     * The Modified Date Time.
     * 
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar modifiedDateTime;

    /**
     * The Questions.
     * 
     */
    @SerializedName(value = "questions", alternate = {"Questions"})
    @Expose
	@Nullable
    public java.util.List<AccessPackageQuestion> questions;

    /**
     * The Request Approval Settings.
     * 
     */
    @SerializedName(value = "requestApprovalSettings", alternate = {"RequestApprovalSettings"})
    @Expose
	@Nullable
    public ApprovalSettings requestApprovalSettings;

    /**
     * The Requestor Settings.
     * 
     */
    @SerializedName(value = "requestorSettings", alternate = {"RequestorSettings"})
    @Expose
	@Nullable
    public RequestorSettings requestorSettings;

    /**
     * The Access Package.
     * 
     */
    @SerializedName(value = "accessPackage", alternate = {"AccessPackage"})
    @Expose
	@Nullable
    public AccessPackage accessPackage;

    /**
     * The Access Package Catalog.
     * 
     */
    @SerializedName(value = "accessPackageCatalog", alternate = {"AccessPackageCatalog"})
    @Expose
	@Nullable
    public AccessPackageCatalog accessPackageCatalog;


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

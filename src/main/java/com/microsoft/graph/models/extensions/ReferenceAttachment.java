// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ReferenceAttachmentPermission;
import com.microsoft.graph.models.generated.ReferenceAttachmentProvider;
import com.microsoft.graph.models.extensions.Attachment;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Reference Attachment.
 */
public class ReferenceAttachment extends Attachment implements IJsonBackedObject {


    /**
     * The Is Folder.
     * 
     */
    @SerializedName(value = "isFolder", alternate = {"IsFolder"})
    @Expose
    public Boolean isFolder;

    /**
     * The Permission.
     * 
     */
    @SerializedName(value = "permission", alternate = {"Permission"})
    @Expose
    public ReferenceAttachmentPermission permission;

    /**
     * The Preview Url.
     * 
     */
    @SerializedName(value = "previewUrl", alternate = {"PreviewUrl"})
    @Expose
    public String previewUrl;

    /**
     * The Provider Type.
     * 
     */
    @SerializedName(value = "providerType", alternate = {"ProviderType"})
    @Expose
    public ReferenceAttachmentProvider providerType;

    /**
     * The Source Url.
     * 
     */
    @SerializedName(value = "sourceUrl", alternate = {"SourceUrl"})
    @Expose
    public String sourceUrl;

    /**
     * The Thumbnail Url.
     * 
     */
    @SerializedName(value = "thumbnailUrl", alternate = {"ThumbnailUrl"})
    @Expose
    public String thumbnailUrl;


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

    }
}

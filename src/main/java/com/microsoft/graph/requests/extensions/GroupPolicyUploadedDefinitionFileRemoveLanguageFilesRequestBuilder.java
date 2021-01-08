// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedDefinitionFile;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedLanguageFile;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File Remove Language Files Request Builder.
 */
public class GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequestBuilder extends BaseActionRequestBuilder<GroupPolicyUploadedDefinitionFile> {

    private GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet body;
    /**
     * The request builder for this GroupPolicyUploadedDefinitionFileRemoveLanguageFiles
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest instance
     */
    @Nonnull
    public GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest instance
     */
    @Nonnull
    public GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest request = new GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}

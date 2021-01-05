// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.LocaleInfo;
import com.microsoft.graph.models.extensions.TimeZoneInformation;
import com.microsoft.graph.models.generated.TimeZoneStandard;
import com.microsoft.graph.requests.extensions.IOutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Request Builder.
 */
public class OutlookUserRequestBuilder extends BaseRequestBuilder implements IOutlookUserRequestBuilder {

    /**
     * The request builder for the OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IOutlookUserRequest instance
     */
    public IOutlookUserRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOutlookUserRequest instance
     */
    public IOutlookUserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OutlookUserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IOutlookCategoryCollectionRequestBuilder masterCategories() {
        return new OutlookCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("masterCategories"), getClient(), null);
    }

    public IOutlookCategoryRequestBuilder masterCategories(final String id) {
        return new OutlookCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("masterCategories") + "/" + id, getClient(), null);
    }
    public IOutlookTaskFolderCollectionRequestBuilder taskFolders() {
        return new OutlookTaskFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taskFolders"), getClient(), null);
    }

    public IOutlookTaskFolderRequestBuilder taskFolders(final String id) {
        return new OutlookTaskFolderRequestBuilder(getRequestUrlWithAdditionalSegment("taskFolders") + "/" + id, getClient(), null);
    }
    public IOutlookTaskGroupCollectionRequestBuilder taskGroups() {
        return new OutlookTaskGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taskGroups"), getClient(), null);
    }

    public IOutlookTaskGroupRequestBuilder taskGroups(final String id) {
        return new OutlookTaskGroupRequestBuilder(getRequestUrlWithAdditionalSegment("taskGroups") + "/" + id, getClient(), null);
    }
    public IOutlookTaskCollectionRequestBuilder tasks() {
        return new OutlookTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    public IOutlookTaskRequestBuilder tasks(final String id) {
        return new OutlookTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }

    public IOutlookUserSupportedLanguagesCollectionRequestBuilder supportedLanguages() {
        return new OutlookUserSupportedLanguagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedLanguages"), getClient(), null);
    }

    public IOutlookUserSupportedTimeZonesCollectionRequestBuilder supportedTimeZones() {
        return new OutlookUserSupportedTimeZonesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedTimeZones"), getClient(), null);
    }

    public IOutlookUserSupportedTimeZonesCollectionRequestBuilder supportedTimeZones(final TimeZoneStandard timeZoneStandard) {
        return new OutlookUserSupportedTimeZonesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedTimeZones"), getClient(), null, timeZoneStandard);
    }
}

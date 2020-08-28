// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IpSecurityProfile;
import com.microsoft.graph.requests.extensions.IIpSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IpSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.IpSecurityProfileCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ip Security Profile Collection Page.
 */
public class IpSecurityProfileCollectionPage extends BaseCollectionPage<IpSecurityProfile, IIpSecurityProfileCollectionRequestBuilder> implements IIpSecurityProfileCollectionPage {

    /**
     * A collection page for IpSecurityProfile
     *
     * @param response the serialized IpSecurityProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IpSecurityProfileCollectionPage(final IpSecurityProfileCollectionResponse response, final IIpSecurityProfileCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PersonCertification;
import com.microsoft.graph.requests.extensions.IPersonCertificationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCertificationCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCertificationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Certification Collection Page.
 */
public class PersonCertificationCollectionPage extends BaseCollectionPage<PersonCertification, IPersonCertificationCollectionRequestBuilder> implements IPersonCertificationCollectionPage {

    /**
     * A collection page for PersonCertification
     *
     * @param response the serialized PersonCertificationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PersonCertificationCollectionPage(final PersonCertificationCollectionResponse response, final IPersonCertificationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.TiIndicator;
import com.microsoft.graph.models.extensions.ResultInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITiIndicatorRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionRequest;
import com.microsoft.graph.requests.extensions.ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorSubmitTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorUpdateTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ti Indicator Collection Request Builder.
 */
public interface ITiIndicatorCollectionRequestBuilder extends IRequestBuilder {

    ITiIndicatorCollectionRequest buildRequest();

    ITiIndicatorCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ITiIndicatorRequestBuilder byId(final String id);


    ITiIndicatorDeleteTiIndicatorsCollectionRequestBuilder deleteTiIndicators(final java.util.List<String> value);

    ITiIndicatorDeleteTiIndicatorsByExternalIdCollectionRequestBuilder deleteTiIndicatorsByExternalId(final java.util.List<String> value);

    ITiIndicatorSubmitTiIndicatorsCollectionRequestBuilder submitTiIndicators(final java.util.List<TiIndicator> value);

    ITiIndicatorUpdateTiIndicatorsCollectionRequestBuilder updateTiIndicators(final java.util.List<TiIndicator> value);
}

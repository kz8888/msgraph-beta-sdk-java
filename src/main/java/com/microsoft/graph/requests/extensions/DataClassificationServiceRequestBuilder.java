// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.ContentClassification;
import com.microsoft.graph.models.extensions.ExactMatchClassificationResult;
import com.microsoft.graph.requests.extensions.IExactMatchDataStoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchDataStoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchDataStoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchDataStoreRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.FileClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.FileClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.JobResponseBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.JobResponseBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.TextClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TextClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitiveTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitiveTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.SensitiveTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SensitiveTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitivityLabelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitivityLabelRequestBuilder;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SensitivityLabelRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Classification Service Request Builder.
 */
public class DataClassificationServiceRequestBuilder extends BaseRequestBuilder implements IDataClassificationServiceRequestBuilder {

    /**
     * The request builder for the DataClassificationService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataClassificationServiceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDataClassificationServiceRequest instance
     */
    public IDataClassificationServiceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDataClassificationServiceRequest instance
     */
    public IDataClassificationServiceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DataClassificationServiceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IExactMatchDataStoreCollectionRequestBuilder exactMatchDataStores() {
        return new ExactMatchDataStoreCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exactMatchDataStores"), getClient(), null);
    }

    public IExactMatchDataStoreRequestBuilder exactMatchDataStores(final String id) {
        return new ExactMatchDataStoreRequestBuilder(getRequestUrlWithAdditionalSegment("exactMatchDataStores") + "/" + id, getClient(), null);
    }
    public IFileClassificationRequestCollectionRequestBuilder classifyFile() {
        return new FileClassificationRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("classifyFile"), getClient(), null);
    }

    public IFileClassificationRequestRequestBuilder classifyFile(final String id) {
        return new FileClassificationRequestRequestBuilder(getRequestUrlWithAdditionalSegment("classifyFile") + "/" + id, getClient(), null);
    }
    public IJobResponseBaseCollectionRequestBuilder classifyFileJobs() {
        return new JobResponseBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("classifyFileJobs"), getClient(), null);
    }

    public IJobResponseBaseRequestBuilder classifyFileJobs(final String id) {
        return new JobResponseBaseRequestBuilder(getRequestUrlWithAdditionalSegment("classifyFileJobs") + "/" + id, getClient(), null);
    }
    public ITextClassificationRequestCollectionRequestBuilder classifyText() {
        return new TextClassificationRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("classifyText"), getClient(), null);
    }

    public ITextClassificationRequestRequestBuilder classifyText(final String id) {
        return new TextClassificationRequestRequestBuilder(getRequestUrlWithAdditionalSegment("classifyText") + "/" + id, getClient(), null);
    }
    public IJobResponseBaseCollectionRequestBuilder classifyTextJobs() {
        return new JobResponseBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("classifyTextJobs"), getClient(), null);
    }

    public IJobResponseBaseRequestBuilder classifyTextJobs(final String id) {
        return new JobResponseBaseRequestBuilder(getRequestUrlWithAdditionalSegment("classifyTextJobs") + "/" + id, getClient(), null);
    }
    public IJobResponseBaseCollectionRequestBuilder evaluateDlpPoliciesJobs() {
        return new JobResponseBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("evaluateDlpPoliciesJobs"), getClient(), null);
    }

    public IJobResponseBaseRequestBuilder evaluateDlpPoliciesJobs(final String id) {
        return new JobResponseBaseRequestBuilder(getRequestUrlWithAdditionalSegment("evaluateDlpPoliciesJobs") + "/" + id, getClient(), null);
    }
    public IJobResponseBaseCollectionRequestBuilder evaluateLabelJobs() {
        return new JobResponseBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("evaluateLabelJobs"), getClient(), null);
    }

    public IJobResponseBaseRequestBuilder evaluateLabelJobs(final String id) {
        return new JobResponseBaseRequestBuilder(getRequestUrlWithAdditionalSegment("evaluateLabelJobs") + "/" + id, getClient(), null);
    }
    public IJobResponseBaseCollectionRequestBuilder jobs() {
        return new JobResponseBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("jobs"), getClient(), null);
    }

    public IJobResponseBaseRequestBuilder jobs(final String id) {
        return new JobResponseBaseRequestBuilder(getRequestUrlWithAdditionalSegment("jobs") + "/" + id, getClient(), null);
    }
    public IJobResponseBaseCollectionRequestBuilder labelsAndPoliciesEvaluationJobs() {
        return new JobResponseBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("labelsAndPoliciesEvaluationJobs"), getClient(), null);
    }

    public IJobResponseBaseRequestBuilder labelsAndPoliciesEvaluationJobs(final String id) {
        return new JobResponseBaseRequestBuilder(getRequestUrlWithAdditionalSegment("labelsAndPoliciesEvaluationJobs") + "/" + id, getClient(), null);
    }
    public ISensitiveTypeCollectionRequestBuilder sensitiveTypes() {
        return new SensitiveTypeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sensitiveTypes"), getClient(), null);
    }

    public ISensitiveTypeRequestBuilder sensitiveTypes(final String id) {
        return new SensitiveTypeRequestBuilder(getRequestUrlWithAdditionalSegment("sensitiveTypes") + "/" + id, getClient(), null);
    }
    public ISensitivityLabelCollectionRequestBuilder sensitivityLabels() {
        return new SensitivityLabelCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sensitivityLabels"), getClient(), null);
    }

    public ISensitivityLabelRequestBuilder sensitivityLabels(final String id) {
        return new SensitivityLabelRequestBuilder(getRequestUrlWithAdditionalSegment("sensitivityLabels") + "/" + id, getClient(), null);
    }
    public IExactMatchUploadAgentCollectionRequestBuilder exactMatchUploadAgents() {
        return new ExactMatchUploadAgentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exactMatchUploadAgents"), getClient(), null);
    }

    public IExactMatchUploadAgentRequestBuilder exactMatchUploadAgents(final String id) {
        return new ExactMatchUploadAgentRequestBuilder(getRequestUrlWithAdditionalSegment("exactMatchUploadAgents") + "/" + id, getClient(), null);
    }

    public IDataClassificationServiceClassifyExactMatchesRequestBuilder classifyExactMatches(final String text, final String timeoutInMs, final java.util.List<String> sensitiveTypeIds, final java.util.List<ContentClassification> contentClassifications) {
        return new DataClassificationServiceClassifyExactMatchesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.classifyExactMatches"), getClient(), null, text, timeoutInMs, sensitiveTypeIds, contentClassifications);
    }
}

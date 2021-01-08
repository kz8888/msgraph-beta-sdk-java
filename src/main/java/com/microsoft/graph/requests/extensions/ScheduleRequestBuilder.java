// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.requests.extensions.OfferShiftRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OfferShiftRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.SchedulingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchedulingGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeCardCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeCardRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.ScheduleShareParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Request Builder.
 */
public class ScheduleRequestBuilder extends BaseRequestBuilder<Schedule> {

    /**
     * The request builder for the Schedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScheduleRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ScheduleRequest instance
     */
    @Nonnull
    public ScheduleRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ScheduleRequest instance
     */
    @Nonnull
    public ScheduleRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ScheduleRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the OfferShiftRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OfferShiftRequestCollectionRequestBuilder offerShiftRequests() {
        return new OfferShiftRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("offerShiftRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the OfferShiftRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OfferShiftRequestRequestBuilder offerShiftRequests(@Nonnull final String id) {
        return new OfferShiftRequestRequestBuilder(getRequestUrlWithAdditionalSegment("offerShiftRequests") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OpenShiftChangeRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequestBuilder openShiftChangeRequests() {
        return new OpenShiftChangeRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("openShiftChangeRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the OpenShiftChangeRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OpenShiftChangeRequestRequestBuilder openShiftChangeRequests(@Nonnull final String id) {
        return new OpenShiftChangeRequestRequestBuilder(getRequestUrlWithAdditionalSegment("openShiftChangeRequests") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OpenShift collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OpenShiftCollectionRequestBuilder openShifts() {
        return new OpenShiftCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("openShifts"), getClient(), null);
    }

    /**
     * Gets a request builder for the OpenShift item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OpenShiftRequestBuilder openShifts(@Nonnull final String id) {
        return new OpenShiftRequestBuilder(getRequestUrlWithAdditionalSegment("openShifts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SchedulingGroup collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SchedulingGroupCollectionRequestBuilder schedulingGroups() {
        return new SchedulingGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("schedulingGroups"), getClient(), null);
    }

    /**
     * Gets a request builder for the SchedulingGroup item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SchedulingGroupRequestBuilder schedulingGroups(@Nonnull final String id) {
        return new SchedulingGroupRequestBuilder(getRequestUrlWithAdditionalSegment("schedulingGroups") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Shift collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ShiftCollectionRequestBuilder shifts() {
        return new ShiftCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("shifts"), getClient(), null);
    }

    /**
     * Gets a request builder for the Shift item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ShiftRequestBuilder shifts(@Nonnull final String id) {
        return new ShiftRequestBuilder(getRequestUrlWithAdditionalSegment("shifts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SwapShiftsChangeRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SwapShiftsChangeRequestCollectionRequestBuilder swapShiftsChangeRequests() {
        return new SwapShiftsChangeRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("swapShiftsChangeRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the SwapShiftsChangeRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SwapShiftsChangeRequestRequestBuilder swapShiftsChangeRequests(@Nonnull final String id) {
        return new SwapShiftsChangeRequestRequestBuilder(getRequestUrlWithAdditionalSegment("swapShiftsChangeRequests") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TimeCard collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TimeCardCollectionRequestBuilder timeCards() {
        return new TimeCardCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timeCards"), getClient(), null);
    }

    /**
     * Gets a request builder for the TimeCard item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TimeCardRequestBuilder timeCards(@Nonnull final String id) {
        return new TimeCardRequestBuilder(getRequestUrlWithAdditionalSegment("timeCards") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TimeOffReason collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TimeOffReasonCollectionRequestBuilder timeOffReasons() {
        return new TimeOffReasonCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffReasons"), getClient(), null);
    }

    /**
     * Gets a request builder for the TimeOffReason item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TimeOffReasonRequestBuilder timeOffReasons(@Nonnull final String id) {
        return new TimeOffReasonRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffReasons") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TimeOffRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TimeOffRequestCollectionRequestBuilder timeOffRequests() {
        return new TimeOffRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the TimeOffRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TimeOffRequestRequestBuilder timeOffRequests(@Nonnull final String id) {
        return new TimeOffRequestRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffRequests") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TimeOff collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TimeOffCollectionRequestBuilder timesOff() {
        return new TimeOffCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timesOff"), getClient(), null);
    }

    /**
     * Gets a request builder for the TimeOff item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TimeOffRequestBuilder timesOff(@Nonnull final String id) {
        return new TimeOffRequestBuilder(getRequestUrlWithAdditionalSegment("timesOff") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ScheduleShareRequestBuilder share(@Nonnull final ScheduleShareParameterSet parameters) {
        return new ScheduleShareRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.share"), getClient(), null, parameters);
    }
}

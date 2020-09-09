// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Request.
 */
public class EventRequest extends BaseRequest implements IEventRequest {
	
    /**
     * The request for the Event
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Event.class);
    }

    /**
     * Gets the Event from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Event> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Event from the service
     *
     * @return the Event from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Event get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Event> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Event with a source
     *
     * @param sourceEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Event sourceEvent, final ICallback<Event> callback) {
        send(HttpMethod.PATCH, callback, sourceEvent);
    }

    /**
     * Patches this Event with a source
     *
     * @param sourceEvent the source object with updates
     * @return the updated Event
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Event patch(final Event sourceEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourceEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Event newEvent, final ICallback<Event> callback) {
        send(HttpMethod.POST, callback, newEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the new object to create
     * @return the created Event
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Event post(final Event newEvent) throws ClientException {
        return send(HttpMethod.POST, newEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Event newEvent, final ICallback<Event> callback) {
        send(HttpMethod.PUT, callback, newEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the object to create/update
     * @return the created Event
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Event put(final Event newEvent) throws ClientException {
        return send(HttpMethod.PUT, newEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEventRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EventRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEventRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EventRequest)this;
     }

}


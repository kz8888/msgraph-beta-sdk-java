// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Person;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Person Request.
 */
public interface IPersonRequest extends IHttpRequest {

    /**
     * Gets the Person from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Person> callback);

    /**
     * Gets the Person from the service
     *
     * @return the Person from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Person get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Person> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Person with a source
     *
     * @param sourcePerson the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Person sourcePerson, final ICallback<Person> callback);

    /**
     * Patches this Person with a source
     *
     * @param sourcePerson the source object with updates
     * @return the updated Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Person patch(final Person sourcePerson) throws ClientException;

    /**
     * Posts a Person with a new object
     *
     * @param newPerson the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Person newPerson, final ICallback<Person> callback);

    /**
     * Posts a Person with a new object
     *
     * @param newPerson the new object to create
     * @return the created Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Person post(final Person newPerson) throws ClientException;

    /**
     * Posts a Person with a new object
     *
     * @param newPerson the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Person newPerson, final ICallback<Person> callback);

    /**
     * Posts a Person with a new object
     *
     * @param newPerson the object to create/update
     * @return the created Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Person put(final Person newPerson) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPersonRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPersonRequest expand(final String value);

}


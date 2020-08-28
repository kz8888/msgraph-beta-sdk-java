// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.EvaluateDynamicMembershipResult;
import com.microsoft.graph.models.extensions.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Request Builder.
 */
public class GroupRequestBuilder extends BaseRequestBuilder implements IGroupRequestBuilder {

    /**
     * The request builder for the Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IGroupRequest instance
     */
    public IGroupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGroupRequest instance
     */
    public IGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    public IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder members() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder members(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder membersWithLicenseErrors() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder membersWithLicenseErrors(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMembers() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMembers(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    public IDirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdOnBehalfOf"), getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder owners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    public IDirectorySettingCollectionRequestBuilder settings() {
        return new DirectorySettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    public IDirectorySettingRequestBuilder settings(final String id) {
        return new DirectorySettingRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }
    public IEndpointCollectionRequestBuilder endpoints() {
        return new EndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("endpoints"), getClient(), null);
    }

    public IEndpointRequestBuilder endpoints(final String id) {
        return new EndpointRequestBuilder(getRequestUrlWithAdditionalSegment("endpoints") + "/" + id, getClient(), null);
    }
    public IResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants() {
        return new ResourceSpecificPermissionGrantCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrants"), getClient(), null);
    }

    public IResourceSpecificPermissionGrantRequestBuilder permissionGrants(final String id) {
        return new ResourceSpecificPermissionGrantRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrants") + "/" + id, getClient(), null);
    }
    public IConversationCollectionRequestBuilder conversations() {
        return new ConversationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("conversations"), getClient(), null);
    }

    public IConversationRequestBuilder conversations(final String id) {
        return new ConversationRequestBuilder(getRequestUrlWithAdditionalSegment("conversations") + "/" + id, getClient(), null);
    }
    public IProfilePhotoCollectionRequestBuilder photos() {
        return new ProfilePhotoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("photos"), getClient(), null);
    }

    public IProfilePhotoRequestBuilder photos(final String id) {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photos") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionRequestBuilder acceptedSenders() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("acceptedSenders"), getClient(), null);
    }

    public IDirectoryObjectRequestBuilder acceptedSenders(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("acceptedSenders") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionRequestBuilder rejectedSenders() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rejectedSenders"), getClient(), null);
    }

    public IDirectoryObjectRequestBuilder rejectedSenders(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("rejectedSenders") + "/" + id, getClient(), null);
    }
    public IConversationThreadCollectionRequestBuilder threads() {
        return new ConversationThreadCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("threads"), getClient(), null);
    }

    public IConversationThreadRequestBuilder threads(final String id) {
        return new ConversationThreadRequestBuilder(getRequestUrlWithAdditionalSegment("threads") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Calendar
     *
     * @return the ICalendarRequestBuilder instance
     */
    public ICalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    public IEventCollectionRequestBuilder calendarView() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView"), getClient(), null);
    }

    public IEventRequestBuilder calendarView(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView") + "/" + id, getClient(), null);
    }
    public IEventCollectionRequestBuilder events() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    public IEventRequestBuilder events(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the IProfilePhotoRequestBuilder instance
     */
    public IProfilePhotoRequestBuilder photo() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    public IDriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    public IDriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    public ISiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    public ISiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }
    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupLifecyclePolicies"), getClient(), null);
    }

    public IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id) {
        return new GroupLifecyclePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("groupLifecyclePolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PlannerGroup
     *
     * @return the IPlannerGroupRequestBuilder instance
     */
    public IPlannerGroupRequestBuilder planner() {
        return new PlannerGroupRequestBuilder(getRequestUrlWithAdditionalSegment("planner"), getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    public IOnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    /**
     * Gets the request builder for Team
     *
     * @return the ITeamRequestBuilder instance
     */
    public ITeamRequestBuilder team() {
        return new TeamRequestBuilder(getRequestUrlWithAdditionalSegment("team"), getClient(), null);
    }

    public IGroupEvaluateDynamicMembershipRequestBuilder evaluateDynamicMembership(final String memberId) {
        return new GroupEvaluateDynamicMembershipRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.evaluateDynamicMembership"), getClient(), null, memberId);
    }

    public IGroupValidatePropertiesRequestBuilder validateProperties(final String displayName, final String mailNickname, final java.util.UUID onBehalfOfUserId) {
        return new GroupValidatePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateProperties"), getClient(), null, displayName, mailNickname, onBehalfOfUserId);
    }

    public IGroupCheckGrantedPermissionsForAppCollectionRequestBuilder checkGrantedPermissionsForApp() {
        return new GroupCheckGrantedPermissionsForAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkGrantedPermissionsForApp"), getClient(), null);
    }

    public IGroupAssignLicenseRequestBuilder assignLicense(final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        return new GroupAssignLicenseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignLicense"), getClient(), null, addLicenses, removeLicenses);
    }

    public IGroupSubscribeByMailRequestBuilder subscribeByMail() {
        return new GroupSubscribeByMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subscribeByMail"), getClient(), null);
    }

    public IGroupUnsubscribeByMailRequestBuilder unsubscribeByMail() {
        return new GroupUnsubscribeByMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unsubscribeByMail"), getClient(), null);
    }

    public IGroupAddFavoriteRequestBuilder addFavorite() {
        return new GroupAddFavoriteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addFavorite"), getClient(), null);
    }

    public IGroupRemoveFavoriteRequestBuilder removeFavorite() {
        return new GroupRemoveFavoriteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeFavorite"), getClient(), null);
    }

    public IGroupResetUnseenCountRequestBuilder resetUnseenCount() {
        return new GroupResetUnseenCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetUnseenCount"), getClient(), null);
    }

    public IGroupRenewRequestBuilder renew() {
        return new GroupRenewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.renew"), getClient(), null);
    }
}
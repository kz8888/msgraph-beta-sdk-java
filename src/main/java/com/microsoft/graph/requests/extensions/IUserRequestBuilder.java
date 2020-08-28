// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.generated.MailTipsType;
import com.microsoft.graph.models.extensions.MailTips;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.extensions.ConvertIdResult;
import com.microsoft.graph.models.extensions.Reminder;
import com.microsoft.graph.models.extensions.EmailAddress;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementData;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.models.extensions.ManagedDeviceSummarizedAppState;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.ILicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IMailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMailFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppIntentAndStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppIntentAndStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IInferenceClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemInsightsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IPresenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserTeamworkRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Request Builder.
 */
public interface IUserRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IUserRequest instance
     */
    IUserRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IUserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for UserAnalytics
     *
     * @return the IUserAnalyticsRequestBuilder instance
     */
    IUserAnalyticsRequestBuilder analytics();

    /**
     * Gets the request builder for InformationProtection
     *
     * @return the IInformationProtectionRequestBuilder instance
     */
    IInformationProtectionRequestBuilder informationProtection();

    IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments();

    IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder createdObjects();

    IDirectoryObjectWithReferenceRequestBuilder createdObjects(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder directReports();

    IDirectoryObjectWithReferenceRequestBuilder directReports(final String id);

    ILicenseDetailsCollectionRequestBuilder licenseDetails();

    ILicenseDetailsRequestBuilder licenseDetails(final String id);

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    IDirectoryObjectWithReferenceRequestBuilder manager();

    IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf();

    IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder ownedDevices();

    IDirectoryObjectWithReferenceRequestBuilder ownedDevices(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects();

    IDirectoryObjectWithReferenceRequestBuilder ownedObjects(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder registeredDevices();

    IDirectoryObjectWithReferenceRequestBuilder registeredDevices(final String id);

    IScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberOf();

    IScopedRoleMembershipRequestBuilder scopedRoleMemberOf(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id);

    /**
     * Gets the request builder for OutlookUser
     *
     * @return the IOutlookUserRequestBuilder instance
     */
    IOutlookUserRequestBuilder outlook();

    IMessageCollectionRequestBuilder messages();

    IMessageRequestBuilder messages(final String id);

    IGroupCollectionRequestBuilder joinedGroups();

    IGroupRequestBuilder joinedGroups(final String id);

    IMailFolderCollectionRequestBuilder mailFolders();

    IMailFolderRequestBuilder mailFolders(final String id);

    /**
     * Gets the request builder for Calendar
     *
     * @return the ICalendarRequestBuilder instance
     */
    ICalendarRequestBuilder calendar();

    ICalendarCollectionRequestBuilder calendars();

    ICalendarRequestBuilder calendars(final String id);

    ICalendarGroupCollectionRequestBuilder calendarGroups();

    ICalendarGroupRequestBuilder calendarGroups(final String id);

    IEventCollectionRequestBuilder calendarView();

    IEventRequestBuilder calendarView(final String id);

    IEventCollectionRequestBuilder events();

    IEventRequestBuilder events(final String id);

    IPersonCollectionRequestBuilder people();

    IPersonRequestBuilder people(final String id);

    IContactCollectionRequestBuilder contacts();

    IContactRequestBuilder contacts(final String id);

    IContactFolderCollectionRequestBuilder contactFolders();

    IContactFolderRequestBuilder contactFolders(final String id);

    /**
     * Gets the request builder for InferenceClassification
     *
     * @return the IInferenceClassificationRequestBuilder instance
     */
    IInferenceClassificationRequestBuilder inferenceClassification();

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the IProfilePhotoRequestBuilder instance
     */
    IProfilePhotoRequestBuilder photo();

    IProfilePhotoCollectionRequestBuilder photos();

    IProfilePhotoRequestBuilder photos(final String id);

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    IDriveRequestBuilder drive();

    IDriveCollectionRequestBuilder drives();

    IDriveRequestBuilder drives(final String id);

    ISiteCollectionWithReferencesRequestBuilder followedSites();

    ISiteWithReferenceRequestBuilder followedSites(final String id);

    IExtensionCollectionRequestBuilder extensions();

    IExtensionRequestBuilder extensions(final String id);

    IApprovalCollectionRequestBuilder approvals();

    IApprovalRequestBuilder approvals(final String id);

    IAppConsentRequestCollectionRequestBuilder appConsentRequestsForApproval();

    IAppConsentRequestRequestBuilder appConsentRequestsForApproval(final String id);

    IAccessReviewInstanceCollectionRequestBuilder pendingAccessReviewInstances();

    IAccessReviewInstanceRequestBuilder pendingAccessReviewInstances(final String id);

    IAgreementAcceptanceCollectionWithReferencesRequestBuilder agreementAcceptances();

    IAgreementAcceptanceWithReferenceRequestBuilder agreementAcceptances(final String id);

    IDeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations();

    IDeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(final String id);

    IManagedDeviceCollectionRequestBuilder managedDevices();

    IManagedDeviceRequestBuilder managedDevices(final String id);

    IManagedAppRegistrationCollectionWithReferencesRequestBuilder managedAppRegistrations();

    IManagedAppRegistrationWithReferenceRequestBuilder managedAppRegistrations(final String id);

    IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder windowsInformationProtectionDeviceRegistrations();

    IWindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder windowsInformationProtectionDeviceRegistrations(final String id);

    IDeviceManagementTroubleshootingEventCollectionRequestBuilder deviceManagementTroubleshootingEvents();

    IDeviceManagementTroubleshootingEventRequestBuilder deviceManagementTroubleshootingEvents(final String id);

    IMobileAppIntentAndStateCollectionRequestBuilder mobileAppIntentAndStates();

    IMobileAppIntentAndStateRequestBuilder mobileAppIntentAndStates(final String id);

    IMobileAppTroubleshootingEventCollectionRequestBuilder mobileAppTroubleshootingEvents();

    IMobileAppTroubleshootingEventRequestBuilder mobileAppTroubleshootingEvents(final String id);

    INotificationCollectionRequestBuilder notifications();

    INotificationRequestBuilder notifications(final String id);

    /**
     * Gets the request builder for PlannerUser
     *
     * @return the IPlannerUserRequestBuilder instance
     */
    IPlannerUserRequestBuilder planner();

    /**
     * Gets the request builder for ItemInsights
     *
     * @return the IItemInsightsRequestBuilder instance
     */
    IItemInsightsRequestBuilder insights();

    /**
     * Gets the request builder for UserSettings
     *
     * @return the IUserSettingsRequestBuilder instance
     */
    IUserSettingsRequestBuilder settings();

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    IOnenoteRequestBuilder onenote();

    /**
     * Gets the request builder for Profile
     *
     * @return the IProfileRequestBuilder instance
     */
    IProfileRequestBuilder profile();

    IUserActivityCollectionRequestBuilder activities();

    IUserActivityRequestBuilder activities(final String id);

    IDeviceCollectionRequestBuilder devices();

    IDeviceRequestBuilder devices(final String id);

    IOnlineMeetingCollectionRequestBuilder onlineMeetings();

    IOnlineMeetingRequestBuilder onlineMeetings(final String id);

    /**
     * Gets the request builder for Presence
     *
     * @return the IPresenceRequestBuilder instance
     */
    IPresenceRequestBuilder presence();

    /**
     * Gets the request builder for Authentication
     *
     * @return the IAuthenticationRequestBuilder instance
     */
    IAuthenticationRequestBuilder authentication();

    IChatCollectionRequestBuilder chats();

    IChatRequestBuilder chats(final String id);

    ITeamCollectionRequestBuilder joinedTeams();

    ITeamRequestBuilder joinedTeams(final String id);

    /**
     * Gets the request builder for UserTeamwork
     *
     * @return the IUserTeamworkRequestBuilder instance
     */
    IUserTeamworkRequestBuilder teamwork();
    IUserAssignLicenseRequestBuilder assignLicense(final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses);
    IUserChangePasswordRequestBuilder changePassword(final String currentPassword, final String newPassword);
    IUserInvalidateAllRefreshTokensRequestBuilder invalidateAllRefreshTokens();
    IUserRevokeSignInSessionsRequestBuilder revokeSignInSessions();
    IUserReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment();
    IUserFindMeetingTimesRequestBuilder findMeetingTimes(final java.util.List<AttendeeBase> attendees, final LocationConstraint locationConstraint, final TimeConstraint timeConstraint, final javax.xml.datatype.Duration meetingDuration, final Integer maxCandidates, final Boolean isOrganizerOptional, final Boolean returnSuggestionReasons, final Double minimumAttendeePercentage);
    IUserSendMailRequestBuilder sendMail(final Message message, final Boolean saveToSentItems);

    IUserGetMailTipsCollectionRequestBuilder getMailTips(final java.util.List<String> emailAddresses, final EnumSet<MailTipsType> mailTipsOptions);

    IUserTranslateExchangeIdsCollectionRequestBuilder translateExchangeIds(final java.util.List<String> inputIds, final ExchangeIdFormat targetIdType, final ExchangeIdFormat sourceIdType);
    IUserRemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement();
    IUserWipeManagedAppRegistrationByDeviceTagRequestBuilder wipeManagedAppRegistrationByDeviceTag(final String deviceTag);
    IUserWipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag(final String deviceTag);
    IUserWipeAndBlockManagedAppsRequestBuilder wipeAndBlockManagedApps();
    IUserUnblockManagedAppsRequestBuilder unblockManagedApps();
    IUserExportPersonalDataRequestBuilder exportPersonalData(final String storageLocation);

    IUserReminderViewCollectionRequestBuilder reminderView(final String startDateTime, final String endDateTime);

    IUserFindRoomsCollectionRequestBuilder findRooms();

    IUserFindRoomsCollectionRequestBuilder findRooms(final String roomList);

    IUserFindRoomListsCollectionRequestBuilder findRoomLists();
    IUserExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData();
    IUserExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData(final Integer skip, final Integer top);

    IUserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder getEffectiveDeviceEnrollmentConfigurations();

    IUserGetLoggedOnManagedDevicesCollectionRequestBuilder getLoggedOnManagedDevices();

    IUserGetManagedAppDiagnosticStatusesCollectionRequestBuilder getManagedAppDiagnosticStatuses();

    IUserGetManagedAppPoliciesCollectionRequestBuilder getManagedAppPolicies();
    IUserIsManagedAppUserBlockedRequestBuilder isManagedAppUserBlocked();

    IUserGetManagedDevicesWithAppFailuresCollectionRequestBuilder getManagedDevicesWithAppFailures();

    IUserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder getManagedDevicesWithFailedOrPendingApps();

}
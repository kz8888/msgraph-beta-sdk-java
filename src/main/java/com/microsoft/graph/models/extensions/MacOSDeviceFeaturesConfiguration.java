// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MacOSAssociatedDomainsItem;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.MacOSLaunchItem;
import com.microsoft.graph.models.extensions.IpRange;
import com.microsoft.graph.models.generated.MacOSContentCachingClientPolicy;
import com.microsoft.graph.models.generated.MacOSContentCachingParentSelectionPolicy;
import com.microsoft.graph.models.generated.MacOSContentCachingPeerPolicy;
import com.microsoft.graph.models.generated.MacOSContentCachingType;
import com.microsoft.graph.models.extensions.MacOSSingleSignOnExtension;
import com.microsoft.graph.models.extensions.SingleSignOnExtension;
import com.microsoft.graph.models.extensions.MacOSCertificateProfileBase;
import com.microsoft.graph.models.extensions.AppleDeviceFeaturesConfigurationBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSDevice Features Configuration.
 */
public class MacOSDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements IJsonBackedObject {


    /**
     * The Admin Show Host Info.
     * Whether to show admin host information on the login window.
     */
    @SerializedName(value = "adminShowHostInfo", alternate = {"AdminShowHostInfo"})
    @Expose
    public Boolean adminShowHostInfo;

    /**
     * The App Associated Domains.
     * Gets or sets a list that maps apps to their associated domains. Application identifiers must be unique. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "appAssociatedDomains", alternate = {"AppAssociatedDomains"})
    @Expose
    public java.util.List<MacOSAssociatedDomainsItem> appAssociatedDomains;

    /**
     * The Associated Domains.
     * DEPRECATED: use appAssociatedDomains instead. Gets or sets a list that maps apps to their associated domains. The key should match the app's ID, and the value should be a string in the form of 'service:domain' where domain is a fully qualified hostname (e.g. webcredentials:example.com). This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "associatedDomains", alternate = {"AssociatedDomains"})
    @Expose
    public java.util.List<KeyValuePair> associatedDomains;

    /**
     * The Authorized Users List Hidden.
     * Whether to show the name and password dialog or a list of users on the login window.
     */
    @SerializedName(value = "authorizedUsersListHidden", alternate = {"AuthorizedUsersListHidden"})
    @Expose
    public Boolean authorizedUsersListHidden;

    /**
     * The Authorized Users List Hide Admin Users.
     * Whether to hide admin users in the authorized users list on the login window.
     */
    @SerializedName(value = "authorizedUsersListHideAdminUsers", alternate = {"AuthorizedUsersListHideAdminUsers"})
    @Expose
    public Boolean authorizedUsersListHideAdminUsers;

    /**
     * The Authorized Users List Hide Local Users.
     * Whether to show only network and system users in the authorized users list on the login window.
     */
    @SerializedName(value = "authorizedUsersListHideLocalUsers", alternate = {"AuthorizedUsersListHideLocalUsers"})
    @Expose
    public Boolean authorizedUsersListHideLocalUsers;

    /**
     * The Authorized Users List Hide Mobile Accounts.
     * Whether to hide mobile users in the authorized users list on the login window.
     */
    @SerializedName(value = "authorizedUsersListHideMobileAccounts", alternate = {"AuthorizedUsersListHideMobileAccounts"})
    @Expose
    public Boolean authorizedUsersListHideMobileAccounts;

    /**
     * The Authorized Users List Include Network Users.
     * Whether to show network users in the authorized users list on the login window.
     */
    @SerializedName(value = "authorizedUsersListIncludeNetworkUsers", alternate = {"AuthorizedUsersListIncludeNetworkUsers"})
    @Expose
    public Boolean authorizedUsersListIncludeNetworkUsers;

    /**
     * The Authorized Users List Show Other Managed Users.
     * Whether to show other users in the authorized users list on the login window.
     */
    @SerializedName(value = "authorizedUsersListShowOtherManagedUsers", alternate = {"AuthorizedUsersListShowOtherManagedUsers"})
    @Expose
    public Boolean authorizedUsersListShowOtherManagedUsers;

    /**
     * The Auto Launch Items.
     * List of applications, files, folders, and other items to launch when the user logs in. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "autoLaunchItems", alternate = {"AutoLaunchItems"})
    @Expose
    public java.util.List<MacOSLaunchItem> autoLaunchItems;

    /**
     * The Console Access Disabled.
     * Whether the Other user will disregard use of the `&amp;gt;console&amp;gt; special user name.
     */
    @SerializedName(value = "consoleAccessDisabled", alternate = {"ConsoleAccessDisabled"})
    @Expose
    public Boolean consoleAccessDisabled;

    /**
     * The Content Caching Block Deletion.
     * Prevents content caches from purging content to free up disk space for other apps.
     */
    @SerializedName(value = "contentCachingBlockDeletion", alternate = {"ContentCachingBlockDeletion"})
    @Expose
    public Boolean contentCachingBlockDeletion;

    /**
     * The Content Caching Client Listen Ranges.
     * A list of custom IP ranges content caches will use to listen for clients. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "contentCachingClientListenRanges", alternate = {"ContentCachingClientListenRanges"})
    @Expose
    public java.util.List<IpRange> contentCachingClientListenRanges;

    /**
     * The Content Caching Client Policy.
     * Determines the method in which content caching servers will listen for clients. Possible values are: notConfigured, clientsInLocalNetwork, clientsWithSamePublicIpAddress, clientsInCustomLocalNetworks, clientsInCustomLocalNetworksWithFallback.
     */
    @SerializedName(value = "contentCachingClientPolicy", alternate = {"ContentCachingClientPolicy"})
    @Expose
    public MacOSContentCachingClientPolicy contentCachingClientPolicy;

    /**
     * The Content Caching Data Path.
     * The path to the directory used to store cached content. The value must be (or end with) /Library/Application Support/Apple/AssetCache/Data
     */
    @SerializedName(value = "contentCachingDataPath", alternate = {"ContentCachingDataPath"})
    @Expose
    public String contentCachingDataPath;

    /**
     * The Content Caching Disable Connection Sharing.
     * Disables internet connection sharing.
     */
    @SerializedName(value = "contentCachingDisableConnectionSharing", alternate = {"ContentCachingDisableConnectionSharing"})
    @Expose
    public Boolean contentCachingDisableConnectionSharing;

    /**
     * The Content Caching Enabled.
     * Enables content caching and prevents it from being disabled by the user.
     */
    @SerializedName(value = "contentCachingEnabled", alternate = {"ContentCachingEnabled"})
    @Expose
    public Boolean contentCachingEnabled;

    /**
     * The Content Caching Force Connection Sharing.
     * Forces internet connection sharing. contentCachingDisableConnectionSharing overrides this setting.
     */
    @SerializedName(value = "contentCachingForceConnectionSharing", alternate = {"ContentCachingForceConnectionSharing"})
    @Expose
    public Boolean contentCachingForceConnectionSharing;

    /**
     * The Content Caching Keep Awake.
     * Prevent the device from sleeping if content caching is enabled.
     */
    @SerializedName(value = "contentCachingKeepAwake", alternate = {"ContentCachingKeepAwake"})
    @Expose
    public Boolean contentCachingKeepAwake;

    /**
     * The Content Caching Log Client Identities.
     * Enables logging of IP addresses and ports of clients that request cached content.
     */
    @SerializedName(value = "contentCachingLogClientIdentities", alternate = {"ContentCachingLogClientIdentities"})
    @Expose
    public Boolean contentCachingLogClientIdentities;

    /**
     * The Content Caching Max Size Bytes.
     * The maximum number of bytes of disk space that will be used for the content cache. A value of 0 (default) indicates unlimited disk space.
     */
    @SerializedName(value = "contentCachingMaxSizeBytes", alternate = {"ContentCachingMaxSizeBytes"})
    @Expose
    public Integer contentCachingMaxSizeBytes;

    /**
     * The Content Caching Parents.
     * A list of IP addresses representing parent content caches.
     */
    @SerializedName(value = "contentCachingParents", alternate = {"ContentCachingParents"})
    @Expose
    public java.util.List<String> contentCachingParents;

    /**
     * The Content Caching Parent Selection Policy.
     * Determines the method in which content caching servers will select parents if multiple are present. Possible values are: notConfigured, roundRobin, firstAvailable, urlPathHash, random, stickyAvailable.
     */
    @SerializedName(value = "contentCachingParentSelectionPolicy", alternate = {"ContentCachingParentSelectionPolicy"})
    @Expose
    public MacOSContentCachingParentSelectionPolicy contentCachingParentSelectionPolicy;

    /**
     * The Content Caching Peer Filter Ranges.
     * A list of custom IP ranges content caches will use to query for content from peers caches. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "contentCachingPeerFilterRanges", alternate = {"ContentCachingPeerFilterRanges"})
    @Expose
    public java.util.List<IpRange> contentCachingPeerFilterRanges;

    /**
     * The Content Caching Peer Listen Ranges.
     * A list of custom IP ranges content caches will use to listen for peer caches. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "contentCachingPeerListenRanges", alternate = {"ContentCachingPeerListenRanges"})
    @Expose
    public java.util.List<IpRange> contentCachingPeerListenRanges;

    /**
     * The Content Caching Peer Policy.
     * Determines the method in which content caches peer with other caches. Possible values are: notConfigured, peersInLocalNetwork, peersWithSamePublicIpAddress, peersInCustomLocalNetworks.
     */
    @SerializedName(value = "contentCachingPeerPolicy", alternate = {"ContentCachingPeerPolicy"})
    @Expose
    public MacOSContentCachingPeerPolicy contentCachingPeerPolicy;

    /**
     * The Content Caching Port.
     * Sets the port used for content caching. If the value is 0, a random available port will be selected. Valid values 0 to 65535
     */
    @SerializedName(value = "contentCachingPort", alternate = {"ContentCachingPort"})
    @Expose
    public Integer contentCachingPort;

    /**
     * The Content Caching Public Ranges.
     * A list of custom IP ranges that Apple's content caching service should use to match clients to content caches. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "contentCachingPublicRanges", alternate = {"ContentCachingPublicRanges"})
    @Expose
    public java.util.List<IpRange> contentCachingPublicRanges;

    /**
     * The Content Caching Show Alerts.
     * Display content caching alerts as system notifications.
     */
    @SerializedName(value = "contentCachingShowAlerts", alternate = {"ContentCachingShowAlerts"})
    @Expose
    public Boolean contentCachingShowAlerts;

    /**
     * The Content Caching Type.
     * Determines what type of content is allowed to be cached by Apple's content caching service. Possible values are: notConfigured, userContentOnly, sharedContentOnly.
     */
    @SerializedName(value = "contentCachingType", alternate = {"ContentCachingType"})
    @Expose
    public MacOSContentCachingType contentCachingType;

    /**
     * The Login Window Text.
     * Custom text to be displayed on the login window.
     */
    @SerializedName(value = "loginWindowText", alternate = {"LoginWindowText"})
    @Expose
    public String loginWindowText;

    /**
     * The Log Out Disabled While Logged In.
     * Whether the Log Out menu item on the login window will be disabled while the user is logged in.
     */
    @SerializedName(value = "logOutDisabledWhileLoggedIn", alternate = {"LogOutDisabledWhileLoggedIn"})
    @Expose
    public Boolean logOutDisabledWhileLoggedIn;

    /**
     * The Mac OSSingle Sign On Extension.
     * Gets or sets a single sign-on extension profile.
     */
    @SerializedName(value = "macOSSingleSignOnExtension", alternate = {"MacOSSingleSignOnExtension"})
    @Expose
    public MacOSSingleSignOnExtension macOSSingleSignOnExtension;

    /**
     * The Power Off Disabled While Logged In.
     * Whether the Power Off menu item on the login window will be disabled while the user is logged in.
     */
    @SerializedName(value = "powerOffDisabledWhileLoggedIn", alternate = {"PowerOffDisabledWhileLoggedIn"})
    @Expose
    public Boolean powerOffDisabledWhileLoggedIn;

    /**
     * The Restart Disabled.
     * Whether to hide the Restart button item on the login window.
     */
    @SerializedName(value = "restartDisabled", alternate = {"RestartDisabled"})
    @Expose
    public Boolean restartDisabled;

    /**
     * The Restart Disabled While Logged In.
     * Whether the Restart menu item on the login window will be disabled while the user is logged in.
     */
    @SerializedName(value = "restartDisabledWhileLoggedIn", alternate = {"RestartDisabledWhileLoggedIn"})
    @Expose
    public Boolean restartDisabledWhileLoggedIn;

    /**
     * The Screen Lock Disable Immediate.
     * Whether to disable the immediate screen lock functions.
     */
    @SerializedName(value = "screenLockDisableImmediate", alternate = {"ScreenLockDisableImmediate"})
    @Expose
    public Boolean screenLockDisableImmediate;

    /**
     * The Shut Down Disabled.
     * Whether to hide the Shut Down button item on the login window.
     */
    @SerializedName(value = "shutDownDisabled", alternate = {"ShutDownDisabled"})
    @Expose
    public Boolean shutDownDisabled;

    /**
     * The Shut Down Disabled While Logged In.
     * Whether the Shut Down menu item on the login window will be disabled while the user is logged in.
     */
    @SerializedName(value = "shutDownDisabledWhileLoggedIn", alternate = {"ShutDownDisabledWhileLoggedIn"})
    @Expose
    public Boolean shutDownDisabledWhileLoggedIn;

    /**
     * The Single Sign On Extension.
     * Gets or sets a single sign-on extension profile. Deprecated: use MacOSSingleSignOnExtension instead.
     */
    @SerializedName(value = "singleSignOnExtension", alternate = {"SingleSignOnExtension"})
    @Expose
    public SingleSignOnExtension singleSignOnExtension;

    /**
     * The Sleep Disabled.
     * Whether to hide the Sleep menu item on the login window.
     */
    @SerializedName(value = "sleepDisabled", alternate = {"SleepDisabled"})
    @Expose
    public Boolean sleepDisabled;

    /**
     * The Single Sign On Extension Pkinit Certificate.
     * PKINIT Certificate for the authentication with single sign-on extensions.
     */
    @SerializedName(value = "singleSignOnExtensionPkinitCertificate", alternate = {"SingleSignOnExtensionPkinitCertificate"})
    @Expose
    public MacOSCertificateProfileBase singleSignOnExtensionPkinitCertificate;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

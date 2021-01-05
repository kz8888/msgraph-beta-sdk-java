// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.StateManagementSetting;
import com.microsoft.graph.models.generated.WindowsFirewallRuleInterfaceTypes;
import com.microsoft.graph.models.generated.WindowsFirewallRuleNetworkProfileTypes;
import com.microsoft.graph.models.generated.WindowsFirewallRuleTrafficDirectionType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Firewall Rule.
 */
public class WindowsFirewallRule implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Action.
     * The action the rule enforces. If not specified, the default is Allowed.
     */
    @SerializedName(value = "action", alternate = {"Action"})
    @Expose
    public StateManagementSetting action;

    /**
     * The Description.
     * The description of the rule.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name of the rule. Does not need to be unique.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Edge Traversal.
     * Indicates whether edge traversal is enabled or disabled for this rule. The EdgeTraversal setting indicates that specific inbound traffic is allowed to tunnel through NATs and other edge devices using the Teredo tunneling technology. In order for this setting to work correctly, the application or service with the inbound firewall rule needs to support IPv6. The primary application of this setting allows listeners on the host to be globally addressable through a Teredo IPv6 address. New rules have the EdgeTraversal property disabled by default.
     */
    @SerializedName(value = "edgeTraversal", alternate = {"EdgeTraversal"})
    @Expose
    public StateManagementSetting edgeTraversal;

    /**
     * The File Path.
     * The full file path of an app that's affected by the firewall rule.
     */
    @SerializedName(value = "filePath", alternate = {"FilePath"})
    @Expose
    public String filePath;

    /**
     * The Interface Types.
     * The interface types of the rule.
     */
    @SerializedName(value = "interfaceTypes", alternate = {"InterfaceTypes"})
    @Expose
    public EnumSet<WindowsFirewallRuleInterfaceTypes> interfaceTypes;

    /**
     * The Local Address Ranges.
     * List of local addresses covered by the rule. Default is any address. Valid tokens include:&amp;lt;ul&amp;gt;&amp;lt;li&amp;gt;"*" indicates any local address. If present, this must be the only token included.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;A valid IPv6 address.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;An IPv4 address range in the format of "start address - end address" with no spaces included.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;An IPv6 address range in the format of "start address - end address" with no spaces included.&amp;lt;/li&amp;gt;&amp;lt;/ul&amp;gt;
     */
    @SerializedName(value = "localAddressRanges", alternate = {"LocalAddressRanges"})
    @Expose
    public java.util.List<String> localAddressRanges;

    /**
     * The Local Port Ranges.
     * List of local port ranges. For example, "100-120", "200", "300-320". If not specified, the default is All.
     */
    @SerializedName(value = "localPortRanges", alternate = {"LocalPortRanges"})
    @Expose
    public java.util.List<String> localPortRanges;

    /**
     * The Local User Authorizations.
     * Specifies the list of authorized local users for the app container. This is a string in Security Descriptor Definition Language (SDDL) format.
     */
    @SerializedName(value = "localUserAuthorizations", alternate = {"LocalUserAuthorizations"})
    @Expose
    public String localUserAuthorizations;

    /**
     * The Package Family Name.
     * The package family name of a Microsoft Store application that's affected by the firewall rule.
     */
    @SerializedName(value = "packageFamilyName", alternate = {"PackageFamilyName"})
    @Expose
    public String packageFamilyName;

    /**
     * The Profile Types.
     * Specifies the profiles to which the rule belongs. If not specified, the default is All.
     */
    @SerializedName(value = "profileTypes", alternate = {"ProfileTypes"})
    @Expose
    public EnumSet<WindowsFirewallRuleNetworkProfileTypes> profileTypes;

    /**
     * The Protocol.
     * 0-255 number representing the IP protocol (TCP = 6, UDP = 17). If not specified, the default is All. Valid values 0 to 255
     */
    @SerializedName(value = "protocol", alternate = {"Protocol"})
    @Expose
    public Integer protocol;

    /**
     * The Remote Address Ranges.
     * List of tokens specifying the remote addresses covered by the rule. Tokens are case insensitive. Default is any address. Valid tokens include:&amp;lt;ul&amp;gt;&amp;lt;li&amp;gt;"*" indicates any remote address. If present, this must be the only token included.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"Defaultgateway"&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"DHCP"&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"DNS"&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"WINS"&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"Intranet" (supported on Windows versions 1809+)&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"RmtIntranet" (supported on Windows versions 1809+)&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"Internet" (supported on Windows versions 1809+)&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"Ply2Renders" (supported on Windows versions 1809+)&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;"LocalSubnet" indicates any local address on the local subnet.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;A valid IPv6 address.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;An IPv4 address range in the format of "start address - end address" with no spaces included.&amp;lt;/li&amp;gt;&amp;lt;li&amp;gt;An IPv6 address range in the format of "start address - end address" with no spaces included.&amp;lt;/li&amp;gt;&amp;lt;/ul&amp;gt;
     */
    @SerializedName(value = "remoteAddressRanges", alternate = {"RemoteAddressRanges"})
    @Expose
    public java.util.List<String> remoteAddressRanges;

    /**
     * The Remote Port Ranges.
     * List of remote port ranges. For example, "100-120", "200", "300-320". If not specified, the default is All.
     */
    @SerializedName(value = "remotePortRanges", alternate = {"RemotePortRanges"})
    @Expose
    public java.util.List<String> remotePortRanges;

    /**
     * The Service Name.
     * The name used in cases when a service, not an application, is sending or receiving traffic.
     */
    @SerializedName(value = "serviceName", alternate = {"ServiceName"})
    @Expose
    public String serviceName;

    /**
     * The Traffic Direction.
     * The traffic direction that the rule is enabled for. If not specified, the default is Out.
     */
    @SerializedName(value = "trafficDirection", alternate = {"TrafficDirection"})
    @Expose
    public WindowsFirewallRuleTrafficDirectionType trafficDirection;


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

// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AppleVpnAlwaysOnConfiguration;
import com.microsoft.graph.models.extensions.IosVpnSecurityAssociationParameters;
import com.microsoft.graph.models.generated.VpnClientAuthenticationType;
import com.microsoft.graph.models.generated.VpnDeadPeerDetectionRate;
import com.microsoft.graph.models.generated.VpnLocalIdentifier;
import com.microsoft.graph.models.generated.VpnServerCertificateType;
import com.microsoft.graph.models.extensions.IosVpnConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Iosik Ev2Vpn Configuration.
 */
public class IosikEv2VpnConfiguration extends IosVpnConfiguration implements IJsonBackedObject {


    /**
     * The Allow Default Child Security Association Parameters.
     * Allows the use of child security association parameters by setting all parameters to the device's default unless explicitly specified.
     */
    @SerializedName(value = "allowDefaultChildSecurityAssociationParameters", alternate = {"AllowDefaultChildSecurityAssociationParameters"})
    @Expose
	@Nullable
    public Boolean allowDefaultChildSecurityAssociationParameters;

    /**
     * The Allow Default Security Association Parameters.
     * Allows the use of security association parameters by setting all parameters to the device's default unless explicitly specified.
     */
    @SerializedName(value = "allowDefaultSecurityAssociationParameters", alternate = {"AllowDefaultSecurityAssociationParameters"})
    @Expose
	@Nullable
    public Boolean allowDefaultSecurityAssociationParameters;

    /**
     * The Always On Configuration.
     * AlwaysOn Configuration
     */
    @SerializedName(value = "alwaysOnConfiguration", alternate = {"AlwaysOnConfiguration"})
    @Expose
	@Nullable
    public AppleVpnAlwaysOnConfiguration alwaysOnConfiguration;

    /**
     * The Child Security Association Parameters.
     * Child Security Association Parameters
     */
    @SerializedName(value = "childSecurityAssociationParameters", alternate = {"ChildSecurityAssociationParameters"})
    @Expose
	@Nullable
    public IosVpnSecurityAssociationParameters childSecurityAssociationParameters;

    /**
     * The Client Authentication Type.
     * Type of Client Authentication the VPN client will use.
     */
    @SerializedName(value = "clientAuthenticationType", alternate = {"ClientAuthenticationType"})
    @Expose
	@Nullable
    public VpnClientAuthenticationType clientAuthenticationType;

    /**
     * The Dead Peer Detection Rate.
     * Determine how often to check if a peer connection is still active. 
     */
    @SerializedName(value = "deadPeerDetectionRate", alternate = {"DeadPeerDetectionRate"})
    @Expose
	@Nullable
    public VpnDeadPeerDetectionRate deadPeerDetectionRate;

    /**
     * The Disable Mobility And Multihoming.
     * Disable MOBIKE
     */
    @SerializedName(value = "disableMobilityAndMultihoming", alternate = {"DisableMobilityAndMultihoming"})
    @Expose
	@Nullable
    public Boolean disableMobilityAndMultihoming;

    /**
     * The Disable Redirect.
     * Disable Redirect
     */
    @SerializedName(value = "disableRedirect", alternate = {"DisableRedirect"})
    @Expose
	@Nullable
    public Boolean disableRedirect;

    /**
     * The Enable Always On Configuration.
     * Determines if Always on VPN is enabled
     */
    @SerializedName(value = "enableAlwaysOnConfiguration", alternate = {"EnableAlwaysOnConfiguration"})
    @Expose
	@Nullable
    public Boolean enableAlwaysOnConfiguration;

    /**
     * The Enable Certificate Revocation Check.
     * Enables a best-effort revocation check; server response timeouts will not cause it to fail
     */
    @SerializedName(value = "enableCertificateRevocationCheck", alternate = {"EnableCertificateRevocationCheck"})
    @Expose
	@Nullable
    public Boolean enableCertificateRevocationCheck;

    /**
     * The Enable EAP.
     * Enables EAP only authentication
     */
    @SerializedName(value = "enableEAP", alternate = {"EnableEAP"})
    @Expose
	@Nullable
    public Boolean enableEAP;

    /**
     * The Enable Perfect Forward Secrecy.
     * Enable Perfect Forward Secrecy (PFS).
     */
    @SerializedName(value = "enablePerfectForwardSecrecy", alternate = {"EnablePerfectForwardSecrecy"})
    @Expose
	@Nullable
    public Boolean enablePerfectForwardSecrecy;

    /**
     * The Enable Use Internal Subnet Attributes.
     * Enable Use Internal Subnet Attributes.
     */
    @SerializedName(value = "enableUseInternalSubnetAttributes", alternate = {"EnableUseInternalSubnetAttributes"})
    @Expose
	@Nullable
    public Boolean enableUseInternalSubnetAttributes;

    /**
     * The Local Identifier.
     * Method of identifying the client that is trying to connect via VPN. 
     */
    @SerializedName(value = "localIdentifier", alternate = {"LocalIdentifier"})
    @Expose
	@Nullable
    public VpnLocalIdentifier localIdentifier;

    /**
     * The Mtu Size In Bytes.
     * Maximum transmission unit. Valid values 1 to 65536
     */
    @SerializedName(value = "mtuSizeInBytes", alternate = {"MtuSizeInBytes"})
    @Expose
	@Nullable
    public Integer mtuSizeInBytes;

    /**
     * The Remote Identifier.
     * Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN
     */
    @SerializedName(value = "remoteIdentifier", alternate = {"RemoteIdentifier"})
    @Expose
	@Nullable
    public String remoteIdentifier;

    /**
     * The Security Association Parameters.
     * Security Association Parameters
     */
    @SerializedName(value = "securityAssociationParameters", alternate = {"SecurityAssociationParameters"})
    @Expose
	@Nullable
    public IosVpnSecurityAssociationParameters securityAssociationParameters;

    /**
     * The Server Certificate Common Name.
     * Common name of the IKEv2 Server Certificate used in Server Authentication
     */
    @SerializedName(value = "serverCertificateCommonName", alternate = {"ServerCertificateCommonName"})
    @Expose
	@Nullable
    public String serverCertificateCommonName;

    /**
     * The Server Certificate Issuer Common Name.
     * Issuer Common name of the IKEv2 Server Certificate issuer used in Authentication
     */
    @SerializedName(value = "serverCertificateIssuerCommonName", alternate = {"ServerCertificateIssuerCommonName"})
    @Expose
	@Nullable
    public String serverCertificateIssuerCommonName;

    /**
     * The Server Certificate Type.
     * The type of certificate the VPN server will present to the VPN client for authentication.
     */
    @SerializedName(value = "serverCertificateType", alternate = {"ServerCertificateType"})
    @Expose
	@Nullable
    public VpnServerCertificateType serverCertificateType;

    /**
     * The Shared Secret.
     * Used when Shared Secret Authentication is selected
     */
    @SerializedName(value = "sharedSecret", alternate = {"SharedSecret"})
    @Expose
	@Nullable
    public String sharedSecret;

    /**
     * The Tls Maximum Version.
     * The maximum TLS version to be used with EAP-TLS authentication
     */
    @SerializedName(value = "tlsMaximumVersion", alternate = {"TlsMaximumVersion"})
    @Expose
	@Nullable
    public String tlsMaximumVersion;

    /**
     * The Tls Minimum Version.
     * The minimum TLS version to be used with EAP-TLS authentication
     */
    @SerializedName(value = "tlsMinimumVersion", alternate = {"TlsMinimumVersion"})
    @Expose
	@Nullable
    public String tlsMinimumVersion;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

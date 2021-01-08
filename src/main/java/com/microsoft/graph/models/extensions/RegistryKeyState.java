// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RegistryHive;
import com.microsoft.graph.models.generated.RegistryOperation;
import com.microsoft.graph.models.generated.RegistryValueType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Registry Key State.
 */
public class RegistryKeyState implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Hive.
     * A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     */
    @SerializedName(value = "hive", alternate = {"Hive"})
    @Expose
	@Nullable
    public RegistryHive hive;

    /**
     * The Key.
     * Current (i.e. changed) registry key (excludes HIVE).
     */
    @SerializedName(value = "key", alternate = {"Key"})
    @Expose
	@Nullable
    public String key;

    /**
     * The Old Key.
     * Previous (i.e. before changed) registry key (excludes HIVE).
     */
    @SerializedName(value = "oldKey", alternate = {"OldKey"})
    @Expose
	@Nullable
    public String oldKey;

    /**
     * The Old Value Data.
     * Previous (i.e. before changed) registry key value data (contents).
     */
    @SerializedName(value = "oldValueData", alternate = {"OldValueData"})
    @Expose
	@Nullable
    public String oldValueData;

    /**
     * The Old Value Name.
     * Previous (i.e. before changed) registry key value name.
     */
    @SerializedName(value = "oldValueName", alternate = {"OldValueName"})
    @Expose
	@Nullable
    public String oldValueName;

    /**
     * The Operation.
     * Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     */
    @SerializedName(value = "operation", alternate = {"Operation"})
    @Expose
	@Nullable
    public RegistryOperation operation;

    /**
     * The Process Id.
     * Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     */
    @SerializedName(value = "processId", alternate = {"ProcessId"})
    @Expose
	@Nullable
    public Integer processId;

    /**
     * The Value Data.
     * Current (i.e. changed) registry key value data (contents).
     */
    @SerializedName(value = "valueData", alternate = {"ValueData"})
    @Expose
	@Nullable
    public String valueData;

    /**
     * The Value Name.
     * Current (i.e. changed) registry key value name
     */
    @SerializedName(value = "valueName", alternate = {"ValueName"})
    @Expose
	@Nullable
    public String valueName;

    /**
     * The Value Type.
     * Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     */
    @SerializedName(value = "valueType", alternate = {"ValueType"})
    @Expose
	@Nullable
    public RegistryValueType valueType;


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

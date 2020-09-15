// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.SensitivityLabelTarget;
import com.microsoft.graph.models.generated.ApplicationMode;
import com.microsoft.graph.models.extensions.LabelPolicy;
import com.microsoft.graph.models.extensions.AutoLabeling;
import com.microsoft.graph.models.extensions.LabelActionBase;
import com.microsoft.graph.models.extensions.SensitivityLabel;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionResponse;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Label.
 */
public class SensitivityLabel extends Entity implements IJsonBackedObject {


    /**
     * The Applicable To.
     * 
     */
    @SerializedName("applicableTo")
    @Expose
    public EnumSet<SensitivityLabelTarget> applicableTo;

    /**
     * The Application Mode.
     * 
     */
    @SerializedName("applicationMode")
    @Expose
    public ApplicationMode applicationMode;

    /**
     * The Assigned Policies.
     * 
     */
    @SerializedName("assignedPolicies")
    @Expose
    public java.util.List<LabelPolicy> assignedPolicies;

    /**
     * The Auto Labeling.
     * 
     */
    @SerializedName("autoLabeling")
    @Expose
    public AutoLabeling autoLabeling;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Is Default.
     * 
     */
    @SerializedName("isDefault")
    @Expose
    public Boolean isDefault;

    /**
     * The Is Endpoint Protection Enabled.
     * 
     */
    @SerializedName("isEndpointProtectionEnabled")
    @Expose
    public Boolean isEndpointProtectionEnabled;

    /**
     * The Label Actions.
     * 
     */
    @SerializedName("labelActions")
    @Expose
    public java.util.List<LabelActionBase> labelActions;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Priority.
     * 
     */
    @SerializedName("priority")
    @Expose
    public Integer priority;

    /**
     * The Tool Tip.
     * 
     */
    @SerializedName("toolTip")
    @Expose
    public String toolTip;

    /**
     * The Sublabels.
     * 
     */
    @SerializedName("sublabels")
    @Expose
    public SensitivityLabelCollectionPage sublabels;


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


        if (json.has("sublabels")) {
            final SensitivityLabelCollectionResponse response = new SensitivityLabelCollectionResponse();
            if (json.has("sublabels@odata.nextLink")) {
                response.nextLink = json.get("sublabels@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sublabels").toString(), JsonObject[].class);
            final SensitivityLabel[] array = new SensitivityLabel[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SensitivityLabel.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sublabels = new SensitivityLabelCollectionPage(response, null);
        }
    }
}

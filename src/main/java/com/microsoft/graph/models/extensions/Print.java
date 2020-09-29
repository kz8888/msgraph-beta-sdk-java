// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PrintSettings;
import com.microsoft.graph.models.extensions.PrintConnector;
import com.microsoft.graph.models.extensions.PrintOperation;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.PrintService;
import com.microsoft.graph.models.extensions.PrintTaskDefinition;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.PrintOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.PrintOperationCollectionPage;
import com.microsoft.graph.requests.extensions.PrinterCollectionResponse;
import com.microsoft.graph.requests.extensions.PrinterCollectionPage;
import com.microsoft.graph.requests.extensions.PrinterShareCollectionResponse;
import com.microsoft.graph.requests.extensions.PrinterShareCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootCollectionResponse;
import com.microsoft.graph.requests.extensions.ReportRootCollectionPage;
import com.microsoft.graph.requests.extensions.PrintServiceCollectionResponse;
import com.microsoft.graph.requests.extensions.PrintServiceCollectionPage;
import com.microsoft.graph.requests.extensions.PrintTaskDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.PrintTaskDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print.
 */
public class Print implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Settings.
     * 
     */
    @SerializedName("settings")
    @Expose
    public PrintSettings settings;

    /**
     * The Connectors.
     * 
     */
    @SerializedName("connectors")
    @Expose
    public PrintConnectorCollectionPage connectors;

    /**
     * The Operations.
     * 
     */
    @SerializedName("operations")
    @Expose
    public PrintOperationCollectionPage operations;

    /**
     * The Printers.
     * 
     */
    @SerializedName("printers")
    @Expose
    public PrinterCollectionPage printers;

    /**
     * The Printer Shares.
     * 
     */
    @SerializedName("printerShares")
    @Expose
    public PrinterShareCollectionPage printerShares;

    /**
     * The Reports.
     * 
     */
    @SerializedName("reports")
    @Expose
    public ReportRootCollectionPage reports;

    /**
     * The Services.
     * 
     */
    @SerializedName("services")
    @Expose
    public PrintServiceCollectionPage services;

    /**
     * The Shares.
     * 
     */
    @SerializedName("shares")
    @Expose
    public PrinterShareCollectionPage shares;

    /**
     * The Task Definitions.
     * 
     */
    @SerializedName("taskDefinitions")
    @Expose
    public PrintTaskDefinitionCollectionPage taskDefinitions;


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


        if (json.has("connectors")) {
            final PrintConnectorCollectionResponse response = new PrintConnectorCollectionResponse();
            if (json.has("connectors@odata.nextLink")) {
                response.nextLink = json.get("connectors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("connectors").toString(), JsonObject[].class);
            final PrintConnector[] array = new PrintConnector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PrintConnector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            connectors = new PrintConnectorCollectionPage(response, null);
        }

        if (json.has("operations")) {
            final PrintOperationCollectionResponse response = new PrintOperationCollectionResponse();
            if (json.has("operations@odata.nextLink")) {
                response.nextLink = json.get("operations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("operations").toString(), JsonObject[].class);
            final PrintOperation[] array = new PrintOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PrintOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            operations = new PrintOperationCollectionPage(response, null);
        }

        if (json.has("printers")) {
            final PrinterCollectionResponse response = new PrinterCollectionResponse();
            if (json.has("printers@odata.nextLink")) {
                response.nextLink = json.get("printers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("printers").toString(), JsonObject[].class);
            final Printer[] array = new Printer[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Printer.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            printers = new PrinterCollectionPage(response, null);
        }

        if (json.has("printerShares")) {
            final PrinterShareCollectionResponse response = new PrinterShareCollectionResponse();
            if (json.has("printerShares@odata.nextLink")) {
                response.nextLink = json.get("printerShares@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("printerShares").toString(), JsonObject[].class);
            final PrinterShare[] array = new PrinterShare[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PrinterShare.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            printerShares = new PrinterShareCollectionPage(response, null);
        }

        if (json.has("reports")) {
            final ReportRootCollectionResponse response = new ReportRootCollectionResponse();
            if (json.has("reports@odata.nextLink")) {
                response.nextLink = json.get("reports@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("reports").toString(), JsonObject[].class);
            final ReportRoot[] array = new ReportRoot[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ReportRoot.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            reports = new ReportRootCollectionPage(response, null);
        }

        if (json.has("services")) {
            final PrintServiceCollectionResponse response = new PrintServiceCollectionResponse();
            if (json.has("services@odata.nextLink")) {
                response.nextLink = json.get("services@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("services").toString(), JsonObject[].class);
            final PrintService[] array = new PrintService[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PrintService.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            services = new PrintServiceCollectionPage(response, null);
        }

        if (json.has("shares")) {
            final PrinterShareCollectionResponse response = new PrinterShareCollectionResponse();
            if (json.has("shares@odata.nextLink")) {
                response.nextLink = json.get("shares@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("shares").toString(), JsonObject[].class);
            final PrinterShare[] array = new PrinterShare[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PrinterShare.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            shares = new PrinterShareCollectionPage(response, null);
        }

        if (json.has("taskDefinitions")) {
            final PrintTaskDefinitionCollectionResponse response = new PrintTaskDefinitionCollectionResponse();
            if (json.has("taskDefinitions@odata.nextLink")) {
                response.nextLink = json.get("taskDefinitions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("taskDefinitions").toString(), JsonObject[].class);
            final PrintTaskDefinition[] array = new PrintTaskDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PrintTaskDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            taskDefinitions = new PrintTaskDefinitionCollectionPage(response, null);
        }
    }
}

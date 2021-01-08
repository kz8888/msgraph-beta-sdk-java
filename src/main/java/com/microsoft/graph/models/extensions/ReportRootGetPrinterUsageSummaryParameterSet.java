// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.PrinterUsageSummary;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Printer Usage Summary Parameter Set.
 */
public class ReportRootGetPrinterUsageSummaryParameterSet {
    /**
     * The printer Id.
     * 
     */
    @SerializedName(value = "printerId", alternate = {"PrinterId"})
    @Expose
	@Nullable
    public String printerId;

    /**
     * The period Start.
     * 
     */
    @SerializedName(value = "periodStart", alternate = {"PeriodStart"})
    @Expose
	@Nullable
    public java.util.Calendar periodStart;

    /**
     * The period End.
     * 
     */
    @SerializedName(value = "periodEnd", alternate = {"PeriodEnd"})
    @Expose
	@Nullable
    public java.util.Calendar periodEnd;


    /**
     * Instiaciates a new ReportRootGetPrinterUsageSummaryParameterSet
     */
    public ReportRootGetPrinterUsageSummaryParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetPrinterUsageSummaryParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetPrinterUsageSummaryParameterSet(@Nonnull final ReportRootGetPrinterUsageSummaryParameterSetBuilder builder) {
        this.printerId = builder.printerId;
        this.periodStart = builder.periodStart;
        this.periodEnd = builder.periodEnd;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetPrinterUsageSummaryParameterSetBuilder newBuilder() {
        return new ReportRootGetPrinterUsageSummaryParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetPrinterUsageSummaryParameterSet
     */
    public static final class ReportRootGetPrinterUsageSummaryParameterSetBuilder {
        /**
         * The printerId parameter value
         */
        @Nullable
        protected String printerId;
        /**
         * Sets the PrinterId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetPrinterUsageSummaryParameterSetBuilder withPrinterId(@Nullable final String val) {
            this.printerId = val;
            return this;
        }
        /**
         * The periodStart parameter value
         */
        @Nullable
        protected java.util.Calendar periodStart;
        /**
         * Sets the PeriodStart
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetPrinterUsageSummaryParameterSetBuilder withPeriodStart(@Nullable final java.util.Calendar val) {
            this.periodStart = val;
            return this;
        }
        /**
         * The periodEnd parameter value
         */
        @Nullable
        protected java.util.Calendar periodEnd;
        /**
         * Sets the PeriodEnd
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetPrinterUsageSummaryParameterSetBuilder withPeriodEnd(@Nullable final java.util.Calendar val) {
            this.periodEnd = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetPrinterUsageSummaryParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetPrinterUsageSummaryParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetPrinterUsageSummaryParameterSet build() {
            return new ReportRootGetPrinterUsageSummaryParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.printerId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("printerId", printerId));
        }
        if(this.periodStart != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
        }
        if(this.periodEnd != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
        }
        return result;
    }
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

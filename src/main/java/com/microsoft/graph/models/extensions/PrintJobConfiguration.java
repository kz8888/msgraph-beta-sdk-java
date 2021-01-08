// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PrintColorMode;
import com.microsoft.graph.models.generated.PrintDuplexMode;
import com.microsoft.graph.models.generated.PrinterFeedOrientation;
import com.microsoft.graph.models.generated.PrintFinishing;
import com.microsoft.graph.models.extensions.PrintMargin;
import com.microsoft.graph.models.generated.PrintMultipageLayout;
import com.microsoft.graph.models.generated.PrintOrientation;
import com.microsoft.graph.models.extensions.IntegerRange;
import com.microsoft.graph.models.generated.PrintQuality;
import com.microsoft.graph.models.generated.PrintScaling;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Configuration.
 */
public class PrintJobConfiguration implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Collate.
     * Whether the printer should collate pages wehen printing multiple copies of a multi-page document.
     */
    @SerializedName(value = "collate", alternate = {"Collate"})
    @Expose
    public Boolean collate;

    /**
     * The Color Mode.
     * The color mode the printer should use to print the job. Valid values are described in the table below. Read-only.
     */
    @SerializedName(value = "colorMode", alternate = {"ColorMode"})
    @Expose
    public PrintColorMode colorMode;

    /**
     * The Copies.
     * The number of copies that should be printed. Read-only.
     */
    @SerializedName(value = "copies", alternate = {"Copies"})
    @Expose
    public Integer copies;

    /**
     * The Dpi.
     * The resolution to use when printing the job, expressed in dots per inch (DPI). Read-only.
     */
    @SerializedName(value = "dpi", alternate = {"Dpi"})
    @Expose
    public Integer dpi;

    /**
     * The Duplex Mode.
     * The duplex mode the printer should use when printing the job. Valid values are described in the table below. Read-only.
     */
    @SerializedName(value = "duplexMode", alternate = {"DuplexMode"})
    @Expose
    public PrintDuplexMode duplexMode;

    /**
     * The Feed Orientation.
     * The orientation to use when feeding media into the printer. Valid values are described in the following table. Read-only.
     */
    @SerializedName(value = "feedOrientation", alternate = {"FeedOrientation"})
    @Expose
    public PrinterFeedOrientation feedOrientation;

    /**
     * The Finishings.
     * Finishing processes to use when printing.
     */
    @SerializedName(value = "finishings", alternate = {"Finishings"})
    @Expose
    public java.util.List<PrintFinishing> finishings;

    /**
     * The Fit Pdf To Page.
     * 
     */
    @SerializedName(value = "fitPdfToPage", alternate = {"FitPdfToPage"})
    @Expose
    public Boolean fitPdfToPage;

    /**
     * The Input Bin.
     * The input bin (tray) to use when printing. See the printer's capabilities for a list of supported input bins.
     */
    @SerializedName(value = "inputBin", alternate = {"InputBin"})
    @Expose
    public String inputBin;

    /**
     * The Margin.
     * The margin settings to use when printing.
     */
    @SerializedName(value = "margin", alternate = {"Margin"})
    @Expose
    public PrintMargin margin;

    /**
     * The Media Size.
     * The media sizeto use when printing. Supports standard size names for ISO and ANSI media sizes, along with any custom sizes supported by the associated printer.
     */
    @SerializedName(value = "mediaSize", alternate = {"MediaSize"})
    @Expose
    public String mediaSize;

    /**
     * The Media Type.
     * The default media (such as paper) type to print the document on. Valid values are described in the following table.
     */
    @SerializedName(value = "mediaType", alternate = {"MediaType"})
    @Expose
    public String mediaType;

    /**
     * The Multipage Layout.
     * The direction to lay out pages when multiple pages are being printed per sheet. Valid values are described in the following table.
     */
    @SerializedName(value = "multipageLayout", alternate = {"MultipageLayout"})
    @Expose
    public PrintMultipageLayout multipageLayout;

    /**
     * The Orientation.
     * The orientation setting the printer should use when printing the job. Valid values are described in the following table.
     */
    @SerializedName(value = "orientation", alternate = {"Orientation"})
    @Expose
    public PrintOrientation orientation;

    /**
     * The Output Bin.
     * The output bin to place completed prints into. See the printer's capabilities for a list of supported output bins.
     */
    @SerializedName(value = "outputBin", alternate = {"OutputBin"})
    @Expose
    public String outputBin;

    /**
     * The Page Ranges.
     * The page ranges to print. Read-only.
     */
    @SerializedName(value = "pageRanges", alternate = {"PageRanges"})
    @Expose
    public java.util.List<IntegerRange> pageRanges;

    /**
     * The Pages Per Sheet.
     * The number of document pages to print on each sheet.
     */
    @SerializedName(value = "pagesPerSheet", alternate = {"PagesPerSheet"})
    @Expose
    public Integer pagesPerSheet;

    /**
     * The Quality.
     * The print quality to use when printing the job. Valid values are described in the table below. Read-only.
     */
    @SerializedName(value = "quality", alternate = {"Quality"})
    @Expose
    public PrintQuality quality;

    /**
     * The Scaling.
     * Specifies how the printer should scale the document data to fit the requested media. Valid values are described in the following table.
     */
    @SerializedName(value = "scaling", alternate = {"Scaling"})
    @Expose
    public PrintScaling scaling;


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

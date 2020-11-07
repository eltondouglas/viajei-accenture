package com.accenture.gama.viajei.model.amadeus;

import com.accenture.gama.viajei.model.amadeus.enuns.CabinType;
import com.google.gson.annotations.SerializedName;

public class FareDetailsBySegment  {
    private String segmentId;
    private CabinType cabin;
    private String fareBasis;
    @SerializedName("class")
    private String segmentClass;
    private IncludedCheckedBags includedCheckedBags;

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public CabinType getCabin() {
        return cabin;
    }

    public void setCabin(CabinType cabin) {
        this.cabin = cabin;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public String getSegmentClass() {
        return segmentClass;
    }

    public void setSegmentClass(String segmentClass) {
        this.segmentClass = segmentClass;
    }

    public IncludedCheckedBags getIncludedCheckedBags() {
        return includedCheckedBags;
    }

    public void setIncludedCheckedBags(IncludedCheckedBags includedCheckedBags) {
        this.includedCheckedBags = includedCheckedBags;
    }

    
}

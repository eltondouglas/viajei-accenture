package com.accenture.gama.viajei.entities;

public class FareDetailsBySegment {
    private String segmentId;
    private String cabin;
    private String fareBasis;
    private String segmentClass;
    private IncludedCheckedBags includedCheckedBags;

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
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

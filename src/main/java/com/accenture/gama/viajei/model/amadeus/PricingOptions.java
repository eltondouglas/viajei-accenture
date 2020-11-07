package com.accenture.gama.viajei.model.amadeus;

public class PricingOptions {
    private boolean includedCheckedBagsOnly;
    private String[] fareType;
    private String[] corporateCodes;
    private boolean refundableFare;
    private boolean noRestrictionFare;
    private boolean noPenaltyFare;

    public boolean isIncludedCheckedBagsOnly() {
        return includedCheckedBagsOnly;
    }

    public void setIncludedCheckedBagsOnly(boolean includedCheckedBagsOnly) {
        this.includedCheckedBagsOnly = includedCheckedBagsOnly;
    }

    public String[] getFareType() {
        return fareType;
    }

    public void setFareType(String[] fareType) {
        this.fareType = fareType;
    }

    public String[] getCorporateCodes() {
        return corporateCodes;
    }

    public void setCorporateCodes(String[] corporateCodes) {
        this.corporateCodes = corporateCodes;
    }

    public boolean isRefundableFare() {
        return refundableFare;
    }

    public void setRefundableFare(boolean refundableFare) {
        this.refundableFare = refundableFare;
    }

    public boolean isNoRestrictionFare() {
        return noRestrictionFare;
    }

    public void setNoRestrictionFare(boolean noRestrictionFare) {
        this.noRestrictionFare = noRestrictionFare;
    }

    public boolean isNoPenaltyFare() {
        return noPenaltyFare;
    }

    public void setNoPenaltyFare(boolean noPenaltyFare) {
        this.noPenaltyFare = noPenaltyFare;
    }

    
}

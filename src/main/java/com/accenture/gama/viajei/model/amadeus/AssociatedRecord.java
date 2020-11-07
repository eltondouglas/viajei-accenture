package com.accenture.gama.viajei.model.amadeus;

public class AssociatedRecord {
    private String reference;
    private String creationDateTime;
    private String originSystemCode;
    private String flightOfferId;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getOriginSystemCode() {
        return originSystemCode;
    }

    public void setOriginSystemCode(String originSystemCode) {
        this.originSystemCode = originSystemCode;
    }

    public String getFlightOfferId() {
        return flightOfferId;
    }

    public void setFlightOfferId(String flightOfferId) {
        this.flightOfferId = flightOfferId;
    }
}

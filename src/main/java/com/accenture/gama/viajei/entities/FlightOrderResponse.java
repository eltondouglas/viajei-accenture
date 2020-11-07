package com.accenture.gama.viajei.entities;

public class FlightOrderResponse {
    private String type;
    private String id;
    private String queuingOfficeId;
    private AssociatedRecord[] associatedRecords;
    private TravelerResponse[] travelers;
    private FlightOfferSearchResponse[] flightOffers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQueuingOfficeId() {
        return queuingOfficeId;
    }

    public void setQueuingOfficeId(String queuingOfficeId) {
        this.queuingOfficeId = queuingOfficeId;
    }

    public AssociatedRecord[] getAssociatedRecords() {
        return associatedRecords;
    }

    public void setAssociatedRecords(AssociatedRecord[] associatedRecords) {
        this.associatedRecords = associatedRecords;
    }

    public TravelerResponse[] getTravelers() {
        return travelers;
    }

    public void setTravelers(TravelerResponse[] travelers) {
        this.travelers = travelers;
    }

    public FlightOfferSearchResponse[] getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(FlightOfferSearchResponse[] flightOffers) {
        this.flightOffers = flightOffers;
    }

    
}

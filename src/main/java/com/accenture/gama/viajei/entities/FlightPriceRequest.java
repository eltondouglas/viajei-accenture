package com.accenture.gama.viajei.entities;

public class FlightPriceRequest {
    private String type;
    private FlightOfferSearchRequest[] flightOffers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlightOfferSearchRequest[] getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(FlightOfferSearchRequest[] flightOffers) {
        this.flightOffers = flightOffers;
    }
}

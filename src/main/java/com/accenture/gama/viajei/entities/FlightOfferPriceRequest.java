package com.accenture.gama.viajei.entities;

public class FlightOfferPriceRequest {
    private String type;
    private FlightOfferRequest flightOffers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlightOfferRequest getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(FlightOfferRequest flightOffers) {
        this.flightOffers = flightOffers;
    }
}

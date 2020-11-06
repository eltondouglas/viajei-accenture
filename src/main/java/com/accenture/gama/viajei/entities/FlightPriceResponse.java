package com.accenture.gama.viajei.entities;

public class FlightPriceResponse{
    private String type;
    private FlightOfferSearchResponse[] flightOffers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlightOfferSearchResponse[] getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(FlightOfferSearchResponse[] flightOffers) {
        this.flightOffers = flightOffers;
    }

    
}

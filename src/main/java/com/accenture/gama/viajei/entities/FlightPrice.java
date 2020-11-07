package com.accenture.gama.viajei.entities;

public class FlightPrice{
    private String type;
    private FlightOfferSearch[] flightOffers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlightOfferSearch[] getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(FlightOfferSearch[] flightOffers) {
        this.flightOffers = flightOffers;
    }

    
}

package com.accenture.gama.viajei.model.amadeus;

public class FlightPrice{
    private String type = "flight-price";
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

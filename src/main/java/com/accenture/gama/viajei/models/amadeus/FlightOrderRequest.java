package com.accenture.gama.viajei.models.amadeus;


public class FlightOrderRequest {
    private FlightPrice flightPrice;
    private Traveler[] travelers;

    public FlightPrice getFlightPrice() {
        return flightPrice;
    }

    public void setlightPrice(FlightPrice flightOfferSearchs) {
        this.flightPrice = flightOfferSearchs;
    }

    public Traveler[] getTravelers() {
        return travelers;
    }

    public void setTravelers(Traveler[] travelers) {
        this.travelers = travelers;
    }

    
}

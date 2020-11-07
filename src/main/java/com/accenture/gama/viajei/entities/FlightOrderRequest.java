package com.accenture.gama.viajei.entities;


public class FlightOrderRequest {
    private FlightPrice flightPrice;
    private TravelerResponse[] travelers;

    public FlightPrice getFlightPrice() {
        return flightPrice;
    }

    public void setlightPrice(FlightPrice flightOfferSearchs) {
        this.flightPrice = flightOfferSearchs;
    }

    public TravelerResponse[] getTravelers() {
        return travelers;
    }

    public void setTravelers(TravelerResponse[] travelers) {
        this.travelers = travelers;
    }

    
}

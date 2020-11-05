package com.accenture.gama.viajei.entities;


public class FlightOrderRequest {
    private FlightOfferSearchResponse[] flightOfferSearchs;
    private TravelerRequest[] travelers;

    public FlightOfferSearchResponse[] getFlightOfferSearchs() {
        return flightOfferSearchs;
    }

    public void setFlightOfferSearchs(FlightOfferSearchResponse[] flightOfferSearchs) {
        this.flightOfferSearchs = flightOfferSearchs;
    }

    public TravelerRequest[] getTravelers() {
        return travelers;
    }

    public void setTravelers(TravelerRequest[] travelers) {
        this.travelers = travelers;
    }

    
}

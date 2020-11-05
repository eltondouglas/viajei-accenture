package com.accenture.gama.viajei.entities;

import com.amadeus.resources.Traveler;

public class FlightOrderRequest {
    private FlightOfferSearchResponse[] flightOfferSearchs;
    private Traveler[] travelers;

    public FlightOfferSearchResponse[] getFlightOfferSearchs() {
        return flightOfferSearchs;
    }

    public void setFlightOfferSearchs(FlightOfferSearchResponse[] flightOfferSearchs) {
        this.flightOfferSearchs = flightOfferSearchs;
    }

    public Traveler[] getTravelers() {
        return travelers;
    }

    public void setTravelers(Traveler[] travelers) {
        this.travelers = travelers;
    }

    
}

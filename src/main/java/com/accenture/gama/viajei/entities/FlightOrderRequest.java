package com.accenture.gama.viajei.entities;


public class FlightOrderRequest {
    private FlightPriceResponse flightPrice;
    private TravelerResponse[] travelers;

    public FlightPriceResponse getFlightPrice() {
        return flightPrice;
    }

    public void setlightPrice(FlightPriceResponse flightOfferSearchs) {
        this.flightPrice = flightOfferSearchs;
    }

    public TravelerResponse[] getTravelers() {
        return travelers;
    }

    public void setTravelers(TravelerResponse[] travelers) {
        this.travelers = travelers;
    }

    
}

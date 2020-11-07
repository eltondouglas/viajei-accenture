package com.accenture.gama.viajei.models.amadeus;

import javax.validation.constraints.NotNull;

public class FlightPriceRequest {
    @NotNull(message = "Flight Offers are required")
    private FlightOfferSearch[] flightOffers;
    
    public FlightOfferSearch[] getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(FlightOfferSearch[] flightOffers) {
        this.flightOffers = flightOffers;
    }
}

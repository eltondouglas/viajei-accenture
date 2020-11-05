package com.accenture.gama.viajei.entities;

import com.amadeus.resources.FlightPrice;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value = {"bookingRequirements","response"})
public class FlightPriceResponse extends FlightPrice {

    @Override
    public FlightOfferSearchResponse[] getFlightOffers() {
        return (FlightOfferSearchResponse[]) super.getFlightOffers();
    }
}

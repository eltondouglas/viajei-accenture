package com.accenture.gama.viajei.entities;

import com.amadeus.resources.FlightOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"response"})
public class FlightOrderResponse extends FlightOrder {
    @Override
    public FlightOfferSearchResponse[] getFlightOffers() {
        return (FlightOfferSearchResponse[]) super.getFlightOffers();
    }
}

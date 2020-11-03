package com.accenture.gama.viajei.service;

import java.time.LocalDate;

import com.accenture.gama.viajei.entities.FlightOfferRequest;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightOfferSearchService {

    @Autowired
    private Amadeus amadeus;

    public FlightOfferSearch[] getFlightOffersPrice(String originLocationCode, String destinationLocationCode,
            LocalDate departureDate, LocalDate returnDate, int adults) throws ResponseException {
        return amadeus.shopping.flightOffersSearch.get(Params.with("originLocationCode", originLocationCode)
                .and("destinationLocationCode", destinationLocationCode).and("departureDate", departureDate)
                .and("returnDate", returnDate).and("adults", adults).and("currencyCode", "BRL").and("max", 1).and("includedAirlineCodes", "n/a"));
    }

    public FlightOfferSearch[] getFlightOffersPrice(FlightOfferRequest flightOffers) throws ResponseException {
        String json = new Gson().toJson(flightOffers);
        return this.amadeus.shopping.flightOffersSearch.post(json);
    }

}

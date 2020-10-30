package com.accenture.gama.viajei.service;

import java.time.LocalDate;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightOfferSearchService {
    
    @Autowired
    private Amadeus amadeus;

    public FlightOfferSearch[] getFlightOffersPrice(String originLocationCode, String destinationLocationCode, LocalDate departureDate, LocalDate returnDate, int adults) {
        try {
            FlightOfferSearch[] flightOfferSearchs = amadeus.shopping.flightOffersSearch
                    .get(Params.with("originLocationCode", originLocationCode).and("destinationLocationCode", destinationLocationCode)
                            .and("departureDate", departureDate).and("returnDate", returnDate).and("adults", adults));
            return flightOfferSearchs;
        } catch (ResponseException e) {
            e.printStackTrace();
        }
        return new FlightOfferSearch[]{};
    }

}

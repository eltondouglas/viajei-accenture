package com.accenture.gama.viajei.controllers.amadeus;

import com.accenture.gama.viajei.entities.FlightOfferRequest;
import com.accenture.gama.viajei.service.FlightOfferSearchService;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight-offers-prices")
public class FlightOfferSearchController {

    @Autowired
    private FlightOfferSearchService amadeusService;

    @PostMapping
    public FlightOfferSearch[] getFlightOffersPrice(@RequestBody FlightOfferRequest flightOffers) throws ResponseException {
        return this.amadeusService.getFlightOffersPrice(flightOffers);
    }

}

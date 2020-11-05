package com.accenture.gama.viajei.controllers.amadeus.shopping;

import com.accenture.gama.viajei.entities.FlightOfferRequest;
import com.accenture.gama.viajei.service.amadeus.shopping.FlightOfferSearchService;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightPrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping/flight-offers")
public class FlightOfferSearchController {

    @Autowired
    private FlightOfferSearchService amadeusService;

    @PostMapping
    public FlightOfferSearch[] getFlightOffers(@RequestBody FlightOfferRequest flightOffers) throws ResponseException {
        return this.amadeusService.getFlightOffers(flightOffers);
    }

    @PostMapping("/pricing")
    public FlightPrice getFlightOffersPrice(@RequestBody FlightOfferSearch flightOffers) throws ResponseException {
            return this.amadeusService.getFlightOffersPrice(flightOffers);
    }

}

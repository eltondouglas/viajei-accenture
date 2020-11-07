package com.accenture.gama.viajei.controllers.amadeus;

import com.accenture.gama.viajei.entities.FlightOfferSearchRequest;
import com.accenture.gama.viajei.entities.FlightOfferSearch;
import com.accenture.gama.viajei.entities.FlightOrderRequest;
import com.accenture.gama.viajei.entities.FlightOrder;
import com.accenture.gama.viajei.entities.FlightPrice;
import com.accenture.gama.viajei.service.amadeus.FlightOfferSearchService;
import com.amadeus.exceptions.ResponseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flight-offers")
public class FlightOfferSearchController {

    @Autowired
    private FlightOfferSearchService amadeusService;

    @PostMapping("/shopping")
    public FlightOfferSearch[] getFlightOffers(@RequestBody FlightOfferSearchRequest flightOffersRequest)
            throws ResponseException {
        return this.amadeusService.getFlightOffers(flightOffersRequest);
    }

    @PostMapping("/pricing")
    public FlightPrice getFlightOffersPrice(@RequestBody FlightOfferSearch[] flightOffers)
            throws ResponseException {
        return this.amadeusService.getFlightOffersPrice(flightOffers);
    }

    @PostMapping("/booking")
    public FlightOrder creatFlightOrder(@RequestBody FlightOrderRequest flightOrderRequest) throws ResponseException {
        return this.amadeusService.creatFlightOrder(flightOrderRequest);
    }

}

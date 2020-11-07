package com.accenture.gama.viajei.controllers.amadeus;

import com.accenture.gama.viajei.model.amadeus.FlightOfferSearch;
import com.accenture.gama.viajei.model.amadeus.FlightOfferSearchRequest;
import com.accenture.gama.viajei.model.amadeus.FlightOrder;
import com.accenture.gama.viajei.model.amadeus.FlightOrderRequest;
import com.accenture.gama.viajei.model.amadeus.FlightPrice;
import com.accenture.gama.viajei.model.amadeus.FlightPriceRequest;
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
    public FlightPrice getFlightOffersPrice(@RequestBody FlightPriceRequest flightOffers)
            throws ResponseException {
        return this.amadeusService.getFlightOffersPrice(flightOffers);
    }

    @PostMapping("/booking")
    public FlightOrder creatFlightOrder(@RequestBody FlightOrderRequest flightOrderRequest) throws ResponseException {
        return this.amadeusService.creatFlightOrder(flightOrderRequest);
    }

}

package com.accenture.gama.viajei.controllers.amadeus.shopping;

import com.accenture.gama.viajei.entities.FlightOfferRequest;
import com.accenture.gama.viajei.entities.FlightOfferSearchRequest;
import com.accenture.gama.viajei.entities.FlightOfferSearchResponse;
import com.accenture.gama.viajei.entities.FlightOrderRequest;
import com.accenture.gama.viajei.entities.FlightOrderResponse;
import com.accenture.gama.viajei.entities.FlightPricingResponse;
import com.accenture.gama.viajei.service.amadeus.shopping.FlightOfferSearchService;
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
    public FlightOfferSearchResponse[] getFlightOffers(@RequestBody FlightOfferRequest flightOffersRequest)
            throws ResponseException {
        return this.amadeusService.getFlightOffers(flightOffersRequest);
    }

    @PostMapping("/pricing")
    public FlightPricingResponse getFlightOffersPrice(@RequestBody FlightOfferSearchRequest[] flightOffers)
            throws ResponseException {
        return this.amadeusService.getFlightOffersPrice(flightOffers);
    }

    @PostMapping("/booking")
    public FlightOrderResponse creatFlightOrder(@RequestBody FlightOrderRequest flightOrderRequest) throws ResponseException {
        return this.amadeusService.creatFlightOrder(flightOrderRequest);
    }

}

package com.accenture.gama.viajei.controllers.amadeus;

import com.accenture.gama.viajei.model.amadeus.FlightOfferSearch;
import com.accenture.gama.viajei.model.amadeus.FlightOfferSearchRequest;
import com.accenture.gama.viajei.model.amadeus.FlightPrice;
import com.accenture.gama.viajei.model.amadeus.FlightPriceRequest;
import com.accenture.gama.viajei.service.amadeus.FlightOfferSearchService;
import com.amadeus.exceptions.ResponseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("shopping")
@Api(description = "Operations pertaining to booking Flight Offers")
@ApiImplicitParams(value = @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header"))
public class ShoppingFlightOfferSearchController {

    @Autowired
    private FlightOfferSearchService amadeusService;

    @ApiOperation(value = "View a flight offers list")
    @PostMapping("/flight-offers")
    public FlightOfferSearch[] getFlightOffers(@RequestBody FlightOfferSearchRequest flightOffersRequest)
            throws ResponseException {
        return this.amadeusService.getFlightOffers(flightOffersRequest);
    }

    @ApiOperation(value = "View a flight offers price list")
    @PostMapping("flight-offers/pricing")
    public FlightPrice getFlightOffersPrice(@RequestBody FlightPriceRequest flightOffers)
            throws ResponseException {
        return this.amadeusService.getFlightOffersPrice(flightOffers);
    }

}

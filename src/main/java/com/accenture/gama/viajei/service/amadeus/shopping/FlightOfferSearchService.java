package com.accenture.gama.viajei.service.amadeus.shopping;

import com.accenture.gama.viajei.entities.FlightOfferRequest;
import com.accenture.gama.viajei.entities.FlightOfferSearchResponse;
import com.accenture.gama.viajei.entities.FlightOrderResponse;
import com.accenture.gama.viajei.entities.FlightOrderRequest;
import com.accenture.gama.viajei.entities.FlightPricingResponse;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.FlightOrder;
import com.amadeus.resources.FlightPrice;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightOfferSearchService {

    @Autowired
    private Amadeus amadeus;

    @Autowired
    private Gson gson;

    public FlightOfferSearchResponse[] getFlightOffers(FlightOfferRequest flightOffers) throws ResponseException {
        try {
            FlightOfferSearch[] flightOfferSearchs = this.amadeus.shopping.flightOffersSearch
                    .post(this.gson.toJson(flightOffers));
            return this.gson.fromJson(this.gson.toJson(flightOfferSearchs), FlightOfferSearchResponse[].class);
        } catch (ResponseException e) {
            e.printStackTrace();
            throw new ResponseException(e.getResponse());
        }

    }

    public FlightPricingResponse getFlightOffersPrice(FlightOfferSearch[] flightOffers) throws ResponseException {
        try {
            FlightPrice flightPrice = amadeus.shopping.flightOffersSearch.pricing.post(flightOffers,
                    Params.with("include", "detailed-fare-rules").and("forceClass", "false"));
            return this.gson.fromJson(this.gson.toJson(flightPrice), FlightPricingResponse.class);

        } catch (ResponseException e) {
            e.printStackTrace();
            throw new ResponseException(e.getResponse());
        }
    }

    public FlightOrderResponse creatFlightOrder(FlightOrderRequest flightOrderRequest) throws ResponseException {
        try {
            FlightOrder flightOrder = amadeus.booking.flightOrders.post(flightOrderRequest.getFlightOfferSearchs(),
                    flightOrderRequest.getTravelers());
            return this.gson.fromJson(this.gson.toJson(flightOrder), FlightOrderResponse.class);
        } catch (ResponseException e) {
            e.printStackTrace();
            throw new ResponseException(e.getResponse());
        }
    }

}

package com.accenture.gama.viajei.service.amadeus;

import com.accenture.gama.viajei.model.amadeus.FlightOfferSearch;
import com.accenture.gama.viajei.model.amadeus.FlightOfferSearchRequest;
import com.accenture.gama.viajei.model.amadeus.FlightOrder;
import com.accenture.gama.viajei.model.amadeus.FlightOrderRequest;
import com.accenture.gama.viajei.model.amadeus.FlightPrice;
import com.accenture.gama.viajei.model.amadeus.FlightPriceRequest;
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Traveler;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightOfferSearchService {

    @Autowired
    private Amadeus amadeus;

    @Autowired
    private Gson gson;

    public FlightOfferSearch[] getFlightOffers(FlightOfferSearchRequest flightOffers) throws ResponseException {
        try {
            com.amadeus.resources.FlightOfferSearch[] flightOfferSearchs = this.amadeus.shopping.flightOffersSearch
                    .post(this.gson.toJson(flightOffers));
            return this.gson.fromJson(this.gson.toJson(flightOfferSearchs), FlightOfferSearch[].class);
        } catch (ResponseException e) {
            e.printStackTrace();
            throw new ResponseException(e.getResponse());
        }

    }

    public FlightPrice getFlightOffersPrice(FlightPriceRequest flightPriceRequest) throws ResponseException {
        try {
            com.amadeus.resources.FlightOfferSearch[] flightOfferSearchs = this.gson.fromJson(this.gson.toJson(flightPriceRequest.getFlightOffers()), com.amadeus.resources.FlightOfferSearch[].class);
            com.amadeus.resources.FlightPrice flightPrice = amadeus.shopping.flightOffersSearch.pricing.post(flightOfferSearchs,
                    Params.with("include", "detailed-fare-rules").and("forceClass", "false"));
            return this.gson.fromJson(this.gson.toJson(flightPrice), FlightPrice.class);

        } catch (ResponseException e) {
            e.printStackTrace();
            throw new ResponseException(e.getResponse());
        }
    }

    public FlightOrder creatFlightOrder(FlightOrderRequest flightOrderRequest) throws ResponseException {
        try {
            Traveler[] travelers = this.gson.fromJson(this.gson.toJson(flightOrderRequest.getTravelers()), Traveler[].class);
            com.amadeus.resources.FlightPrice flightPrice =  this.gson.fromJson(this.gson.toJson(flightOrderRequest.getFlightPrice()), com.amadeus.resources.FlightPrice.class);
            com.amadeus.resources.FlightOrder flightOrder = amadeus.booking.flightOrders.post(flightPrice, travelers);
            return this.gson.fromJson(this.gson.toJson(flightOrder), FlightOrder.class);
        } catch (ResponseException e) {
            e.printStackTrace();
            throw new ResponseException(e.getResponse());
        }
    }

	public FlightOrder getFlightOrderById(String flightOrderId) throws ResponseException {
        com.amadeus.resources.FlightOrder flightOrder = amadeus.booking.flightOrder(flightOrderId).get();
        return this.gson.fromJson(this.gson.toJson(flightOrder), FlightOrder.class);
    }
    
    public FlightOrder deleteFlightOrderById(String flightOrderId) throws ResponseException {
        com.amadeus.resources.FlightOrder flightOrder = amadeus.booking.flightOrder(flightOrderId).delete();
        return this.gson.fromJson(this.gson.toJson(flightOrder), FlightOrder.class);
	}

}

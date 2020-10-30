package com.accenture.gama.viajei.controller;

import java.time.LocalDate;

import com.accenture.gama.viajei.service.FlightOfferSearchService;
import com.amadeus.resources.FlightOfferSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FlightOfferSearchController {

    @Autowired
    private FlightOfferSearchService amadeusService;

    @GetMapping("/flight-offers-price")
    public FlightOfferSearch[] getFlightOffersPrice(@RequestParam String originLocationCode,
            @RequestParam String destinationLocationCode, @RequestParam String departureDate,
            @RequestParam String returnDate, @RequestParam int adults) {
        return this.amadeusService.getFlightOffersPrice(originLocationCode, destinationLocationCode, LocalDate.parse(departureDate),
                LocalDate.parse(returnDate), adults);
    }

}

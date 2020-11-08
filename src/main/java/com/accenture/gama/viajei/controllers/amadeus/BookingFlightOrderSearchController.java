package com.accenture.gama.viajei.controllers.amadeus;

import com.accenture.gama.viajei.model.amadeus.FlightOrder;
import com.accenture.gama.viajei.model.amadeus.FlightOrderRequest;
import com.accenture.gama.viajei.service.amadeus.FlightOfferSearchService;
import com.amadeus.exceptions.ResponseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("booking")
@Api(description = "Operations pertaining to booking Flight Orders")
public class BookingFlightOrderSearchController {

	@Autowired
	private FlightOfferSearchService amadeusService;

	@ApiOperation(value = "View a flight orders list")
	@PostMapping("/flight-orders/{viajante}")
	public FlightOrder creatFlightOrder(@PathVariable("viajante") Integer viajante,
			@RequestBody FlightOrderRequest flightOrderRequest) throws ResponseException {
		return this.amadeusService.creatFlightOrder(viajante, flightOrderRequest);
	}

	@ApiOperation(value = "View a flight orders by id")
	@GetMapping("/flight-orders/{flightOrderId}")
	FlightOrder getFlightOrder(@PathVariable String flightOrderId) throws ResponseException {
		return this.amadeusService.getFlightOrderById(flightOrderId);
	}

	@ApiOperation(value = "Delete a flight orders by id")
	@DeleteMapping("/flight-orders/{flightOrderId}")
	FlightOrder deleteFlightOrder(@PathVariable String flightOrderId) throws ResponseException {
		return this.amadeusService.deleteFlightOrderById(flightOrderId);
	}

}

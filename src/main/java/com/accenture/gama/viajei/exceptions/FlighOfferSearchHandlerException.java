package com.accenture.gama.viajei.exceptions;

import com.amadeus.exceptions.ResponseException;
import com.google.gson.JsonObject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * FlighOfferSearchHandlerException
 */
@RestControllerAdvice
public class FlighOfferSearchHandlerException {

    @ExceptionHandler({ResponseException.class})
    public ResponseEntity<JsonObject> handlerResponseException(ResponseException ex) {
        return new ResponseEntity<>(ex.getResponse().getResult(), HttpStatus.resolve(ex.getResponse().getStatusCode()));
    }
    
}
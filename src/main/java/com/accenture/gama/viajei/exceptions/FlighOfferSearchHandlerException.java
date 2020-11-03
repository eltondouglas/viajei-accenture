package com.accenture.gama.viajei.exceptions;

import com.amadeus.exceptions.ResponseException;

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
    public ResponseEntity<String> handlerMethodArgumentNotValid(ResponseException ex) {
        int statusCode = ex.getResponse().getStatusCode();
        System.out.println("Status Code: "+statusCode);
        return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.resolve(statusCode));
    }
    
}
package com.accenture.gama.viajei.models.amadeus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.accenture.gama.viajei.models.amadeus.enuns.BookingPaymentStatus;

public class FlightOrder {
    private String type = "flight-order";
    private String id;
    private String queuingOfficeId;
    private AssociatedRecord[] associatedRecords;
    private Traveler[] travelers;
    private FlightOfferSearch[] flightOffers;
    @Enumerated(EnumType.STRING)
    private BookingPaymentStatus bookingPaymentStatus = BookingPaymentStatus.PENDING_PAYMENT;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQueuingOfficeId() {
        return queuingOfficeId;
    }

    public void setQueuingOfficeId(String queuingOfficeId) {
        this.queuingOfficeId = queuingOfficeId;
    }

    public AssociatedRecord[] getAssociatedRecords() {
        return associatedRecords;
    }

    public void setAssociatedRecords(AssociatedRecord[] associatedRecords) {
        this.associatedRecords = associatedRecords;
    }

    public Traveler[] getTravelers() {
        return travelers;
    }

    public void setTravelers(Traveler[] travelers) {
        this.travelers = travelers;
    }

    public FlightOfferSearch[] getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(FlightOfferSearch[] flightOffers) {
        this.flightOffers = flightOffers;
    }

    public BookingPaymentStatus getBookingPaymentStatus() {
        return bookingPaymentStatus;
    }

    public void setBookingPaymentStatus(BookingPaymentStatus bookingPaymentStatus) {
        this.bookingPaymentStatus = bookingPaymentStatus;
    }

    
}

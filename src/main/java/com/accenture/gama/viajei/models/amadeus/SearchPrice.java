package com.accenture.gama.viajei.models.amadeus;

import com.accenture.gama.viajei.models.amadeus.enuns.CurrencyCode;

public class SearchPrice {
    private CurrencyCode currency;
    private Double total;
    private Double base;
    private Fee[] fees;
    private Double grandTotal;

    public CurrencyCode getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyCode currency) {
        this.currency = currency;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Fee[] getFees() {
        return fees;
    }

    public void setFees(Fee[] fees) {
        this.fees = fees;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    
}

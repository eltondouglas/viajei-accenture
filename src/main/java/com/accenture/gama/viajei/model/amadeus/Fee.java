package com.accenture.gama.viajei.model.amadeus;

import com.accenture.gama.viajei.model.amadeus.enuns.FeeType;

public class Fee {
    private Double amount;
    private FeeType type;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public FeeType getType() {
        return type;
    }

    public void setType(FeeType type) {
        this.type = type;
    }

    
}

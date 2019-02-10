package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String nameOfCountry;

    public Country(BigDecimal peopleQuantity, String nameOfCountry) {
        this.peopleQuantity = peopleQuantity;
        this.nameOfCountry = nameOfCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }
}

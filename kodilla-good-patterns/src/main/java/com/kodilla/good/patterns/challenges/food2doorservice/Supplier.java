package com.kodilla.good.patterns.challenges.food2doorservice;

public class Supplier {

    private String name ;
    private String city ;
    private String street;

    public Supplier(String name, String city, String street) {
        this.name = name;
        this.city = city;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}

package com.kodilla.good.patterns.challenges.flightservice;

public class FlightService {

    public static void main(String[] args ){

        FlightListRetriever flightListRetriever = new FlightListRetriever();
        FlightList flightList = flightListRetriever.retriever();
        FlightSearch flightSearch = new FlightSearch(flightList);

        flightSearch.searchAllFlightsFrom("Wroclaw");
        System.out.println();
        flightSearch.searchAllFlightsTo("Wroclaw");
        System.out.println();
        flightSearch.searchFlightsThruOtherCity("Krakow");
    }
}

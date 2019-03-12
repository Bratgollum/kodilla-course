package com.kodilla.good.patterns.challenges.flightservice;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    final private List<Flight> flightsList = new ArrayList<>();

    public List<Flight> addToFlightList(Flight flight){
        flightsList.add(flight);
        return flightsList;
    }
    public List<Flight> getFlightsList() {
        return flightsList;
    }
}

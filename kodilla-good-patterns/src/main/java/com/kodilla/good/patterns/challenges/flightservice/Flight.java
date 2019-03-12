package com.kodilla.good.patterns.challenges.flightservice;

import java.util.Objects;

public class Flight {

    private String flightFrom;
    private String flightTo;
    private String flightThru;
    private boolean directFlight;
    private String departureTime;
    private String arrivalTime;

    public Flight(String flightFrom, String flightTo, String flightThru, boolean directFlight,
                  String departureTime, String arrivalTime) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightThru = flightThru;
        this.directFlight = directFlight;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Flight(String flightFrom, String flightTo, boolean directFlight, String departureTime, String arrivalTime) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.directFlight = directFlight;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }



    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightThru() {
        return flightThru;
    }

    public boolean isDirectFlight() {
        return directFlight;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return directFlight == flight.directFlight &&
                Objects.equals(flightFrom, flight.flightFrom) &&
                Objects.equals(flightTo, flight.flightTo) &&
                Objects.equals(flightThru, flight.flightThru) &&
                Objects.equals(departureTime, flight.departureTime) &&
                Objects.equals(arrivalTime, flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, flightTo, flightThru, directFlight, departureTime, arrivalTime);
    }
}

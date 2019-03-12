package com.kodilla.good.patterns.challenges.flightservice;

import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightSearch {

    final private FlightList flightList;

    public FlightSearch(FlightList flightList){
               this.flightList = flightList;
    }

    public void searchAllFlightsFrom(String nameOfAirport){
        boolean flightName = flightList.getFlightsList().stream().anyMatch(flight -> flight.getFlightFrom()
                   .toUpperCase().equalsIgnoreCase(nameOfAirport));
        if(flightName){
            System.out.println("All flights from " + nameOfAirport + " go to:");
            String Destinations = flightList.getFlightsList().stream()
                    .filter(n -> n.getFlightFrom().equalsIgnoreCase(nameOfAirport))
                    .map(n -> n.getFlightTo() + " at " + n.getArrivalTime())
                    .collect(Collectors.joining("\n"));
            System.out.println(Destinations);
        } else {System.out.println("No Flights found ");}
    }
    public void searchAllFlightsTo(String nameOfAirport){
        boolean flightName = flightList.getFlightsList().stream().anyMatch(flight -> flight.getFlightTo().toUpperCase()
                .equalsIgnoreCase(nameOfAirport));
        if(flightName) {
            System.out.println("All flights to " + nameOfAirport + " go from:");
            String Destinations = flightList.getFlightsList().stream()
                    .filter(n -> n.getFlightTo().equalsIgnoreCase(nameOfAirport))
                    .map(n -> n.getFlightFrom() + " at " + n.getDepartureTime())
                    .collect(Collectors.joining("\n"));
            System.out.println(Destinations);
        }else { System.out.println("No Flights found ");}
    }
    public void searchFlightsThruOtherCity(String nameOfAirport){
        boolean flightName = flightList.getFlightsList().stream().anyMatch(flight -> flight.getFlightThru().toUpperCase()
                .equalsIgnoreCase(nameOfAirport));
        if(flightName){
            System.out.println("All flights thru " + nameOfAirport + " go from :");
            String Destinations = flightList.getFlightsList().stream()
                    .filter(n -> n.getFlightThru().equalsIgnoreCase(nameOfAirport))
                    .map(n -> n.getFlightFrom() +" to " + n.getFlightTo() + " at " + n.getArrivalTime())
                    .collect(Collectors.joining("\n"));
            System.out.println(Destinations);
        } else {System.out.println("No Flights found thru "+nameOfAirport+".");}
    }
}






package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    private Flight flight01 = new Flight("Torronto Airport ", "Heathrow Airport");
    private Flight flight02 = new Flight("Chicago Airport ", "Warszawa Airport");
    private Flight flight03 = new Flight("New York Airport ", "Budapeszt Airport");
    private Flight flight04 = new Flight("Dortmund Airport ", "Amsterdam Airport");
    private Flight flight05 = new Flight("Frankfurt Airport ", "Madryt Airport");
    private Flight flight06 = new Flight("Krakow Airport ", "Berlin Airport");
    private Flight flight07 = new Flight("Los Angeles  Airport ", "Zurych Airport");

    //private HashMap<String , Boolean> flightList ;
    private boolean permissionToLand;


    public void findFlight(Flight flight)  {

        HashMap<String, Boolean> flightList = new HashMap<>();

        flightList.put(flight01.getArrivalAirport(), permissionToLand = true);
        flightList.put(flight02.getArrivalAirport(), permissionToLand = false);
        flightList.put(flight03.getArrivalAirport(), permissionToLand = true);
        flightList.put(flight04.getArrivalAirport(), permissionToLand = false);
        flightList.put(flight05.getArrivalAirport(), permissionToLand = true);
        flightList.put(flight06.getArrivalAirport(), permissionToLand = false);
        flightList.put(flight07.getArrivalAirport(), permissionToLand = true);

        for (Map.Entry<String, Boolean> entry : flightList.entrySet()) {


                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    if (entry.getValue() == true) {
                        System.out.println("Flight from " + flight.getDepartureAirport() +
                                " to " + flight.getArrivalAirport() + " has permission to land");
                    } else {
                        System.out.println("Flight from " + flight.getDepartureAirport() +
                                " to " + flight.getArrivalAirport() + " has NO permission to land");
                    }
                }else {
                    new RouteNotFoundException();
                }            }

            }
        }








package com.kodilla.exception.test;

public class ThirdChallenge {

    public static void main(String[] args ){

        Flight flight67 = new Flight("Dortmund Airport " , "Amsterdam Airport");

        Flight flight666 = new Flight("Legnica ", "Wroclaw" );

        FlightSearch flightSearch = new FlightSearch();


           // flightSearch.findFlight(flight67);
           try {
               System.out.println("Flight 67 :");
               flightSearch.findFlight(flight67);
               System.out.println("Flight 666 :");
               flightSearch.findFlight(flight666);
               throw new RouteNotFoundException();
           }catch (RouteNotFoundException e ){

               System.out.println("Not found");

           }



    }
}

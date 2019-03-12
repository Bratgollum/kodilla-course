package com.kodilla.good.patterns.challenges.flightservice;

public class FlightListRetriever {

    public FlightList retriever(){

        Flight wroclaw01 = new Flight("Wroclaw","Gdansk", "no", true , "12:45",
                                    "13:45");
        Flight wroclaw02 = new Flight("Wroclaw","Krakow", "no",true , "15:45",
                                    "16:45");
        Flight wroclaw03 = new Flight("Wroclaw","Poznan", "no",true , "16:45",
                                    "17:45");
        Flight wroclaw04 = new Flight("Wroclaw","Warszawa", "no",true , "17:45",
                                    "18:45");
        Flight poznan01 = new Flight("Poznan","Gdansk", "no",true , "09:45",
                                    "10:45");
        Flight poznan02 = new Flight("Poznan","Wroclaw", "no",true , "11:45",
                                    "12:45");
        Flight poznan03 = new Flight("Poznan","Krakow", "no",true , "10:45",
                                    "11:45");
        Flight poznan04 = new Flight("Poznan","Warszawa", "no",true , "12:45",
                                    "13:45");
        Flight gdansk01 = new Flight("Gdansk","Wroclaw","Krakow",
                                     false,"11:00", "13:00");
        Flight gdansk02 = new Flight("Gdansk","Wroclaw","Poznan",
                                     false,"12:00", "14:00");
        Flight gdansk03 = new Flight("Gdansk","Warszawa","no",
                                     true,"11:00", "12:00");
        FlightList list = new FlightList();
        list.addToFlightList(wroclaw01);
        list.addToFlightList(wroclaw02);
        list.addToFlightList(wroclaw03);
        list.addToFlightList(wroclaw04);
        list.addToFlightList(poznan01);
        list.addToFlightList(poznan02);
        list.addToFlightList(poznan03);
        list.addToFlightList(poznan04);
        list.addToFlightList(gdansk01);
        list.addToFlightList(gdansk02);
        list.addToFlightList(gdansk03);

        return list;


    }
}

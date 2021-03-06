package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }


    public static void main( String[] args ){

        MovieStore movieStore = new MovieStore();
       /* Map<String, List<String>> listTitles = new HashMap<>();
            listTitles.putAll(movieStore.getMovies());*/
        /*for(Map.Entry<String,List<String>> list : listTitles.entrySet()){
                list.getValue().stream().forEach(n -> {System.out.print(n+ "! ");});*/


      String name =  movieStore.getMovies().entrySet().stream()
               .flatMap( n-> n.getValue().stream())
               .collect(Collectors.joining("! "));

      System.out.print(name);


        }
    }



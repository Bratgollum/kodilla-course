package com.kodilla.patterns.builder.bicmac;

import java.util.ArrayList;
import java.util.List;

public final class Bicmac {
     private final boolean isBumWithSesam;
     private final int numbersOfSteaksInBurger;
     private  final List<String> ingredients;

     public static class BicmacBuilder{
         private  boolean isBumWithSesam;
         private  int numbersOfSteaksInBurger;
         private   List<String> ingedients = new ArrayList<>();

         public BicmacBuilder isBumWithSesam(boolean isBumWithSesam){
             this.isBumWithSesam = isBumWithSesam;
             return  this;
         }
         public BicmacBuilder numbersOfSteaksInBurger(int numbersOfSteaksInBurger){
             this.numbersOfSteaksInBurger = numbersOfSteaksInBurger;
             return this;
         }
         public BicmacBuilder ingredient(String ingredient){
             ingedients.add(ingredient);
             return this;
         }
         public Bicmac build(){
             return  new Bicmac(isBumWithSesam,numbersOfSteaksInBurger,ingedients);
         }
     }
    private Bicmac(boolean isBumWithSesam, int numbersOfSteaksInBurger, List<String> ingedient) {
        this.isBumWithSesam = isBumWithSesam;
        this.numbersOfSteaksInBurger = numbersOfSteaksInBurger;
        this.ingredients = ingedient;
    }
    public boolean isBumWithSesam() {
        return isBumWithSesam;
    }
    public int getNumbersOfSteaksInBurger() {
        return numbersOfSteaksInBurger;
    }
    public List<String> getIngedient() {
        return ingredients;
    }
    @Override
    public String toString() {
        return "Bicmac: \n" +
                "Is bum with sesam = " + isBumWithSesam +
                "\nNumber of steaks inside a burger = " + numbersOfSteaksInBurger +
                "\nIngredients = " + ingredients;
    }
}

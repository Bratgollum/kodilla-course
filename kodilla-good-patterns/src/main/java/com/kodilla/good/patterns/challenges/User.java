package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String surname;
    private String city;
    private String street;

    public User(String name, String surname, String city, String street) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String userInformations(){

        return "Name: "+ name  +" Surname : "+surname+"\n"
                +"Adress : "+street+","+city+".";
    }


}

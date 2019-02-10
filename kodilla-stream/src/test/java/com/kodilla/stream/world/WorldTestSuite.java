package com.kodilla.stream.world;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        //Creating Countrys
        Country  poland =  new Country( new BigDecimal ("40000000"),"Poland");
        Country  usa =     new Country(new BigDecimal ("110000000"),"USA");
        Country  england = new Country(new BigDecimal ("60000000"),"England");
        Country  france =  new Country(new BigDecimal ("80000000"),"France");
        Country  china =   new Country(new BigDecimal ("90000000"),"China");
        Country  canada =  new Country(new BigDecimal ("120000000"),"Canada");
        Country  india =   new Country(new BigDecimal ("3000000000"),"India");
        Country  korea =   new Country(new BigDecimal ("800000000"),"Korea");
        Country  belgium = new Country(new BigDecimal ("70000000"),"Belgium");
        Country  germany = new Country(new BigDecimal ("50000000"),"Germany");
        Country  mongol =  new Country(new BigDecimal ("1000000000"),"Mongol");
        Country  russia =  new Country(new BigDecimal ("1120000000"),"Russia");
        Country  niger =   new Country(new BigDecimal ("1090000000"),"Niger");
        Country  egypt =   new Country(new BigDecimal ("750000000"),"Egypt");
        //Creating Continents
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");
        Continent afrika = new Continent("Afrika");
        //Assigning countrys to the each particular Continent
        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(belgium);
        europe.addCountry(germany);
        europe.addCountry(england);
             northAmerica.addCountry(usa);
             northAmerica.addCountry(canada);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(korea);
        asia.addCountry(mongol);
        asia.addCountry(russia);
             afrika.addCountry(niger);
             afrika.addCountry(egypt);
        ///Creating World and assigning continents to it
        World world = new World();
        world.addContinent(europe);
        world.addContinent(afrika);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //When
        world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("8380000000");
        Assert.assertEquals(expectedPeopleQuantity,world.getPeopleQuantity());
    }
}
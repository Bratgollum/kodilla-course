package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bicmac.Bicmac;
import org.junit.Assert;
import org.junit.Test;

public class BiigmacTestSuite {

    @Test
    public void testBigmacNew(){
        //Given
        Bicmac bicmac = new Bicmac.BicmacBuilder()
                .isBumWithSesam(true)
                .numbersOfSteaksInBurger(4)
                .ingredient("Salat")
                .ingredient("Onion")
                .ingredient("Cheese")
                .build();
        //When
        System.out.println(bicmac);
        int howMannyIngredients = bicmac.getIngedient().size();
        //Then
        Assert.assertEquals(true,bicmac.isBumWithSesam());
        Assert.assertEquals(3,howMannyIngredients);
    }
}

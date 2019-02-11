package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAvaraghe() {
        //Given

        int[] numbers = new int[20];
        for (int n = 0; n < 20; n++) {

            numbers[n] = n+1;


        }
        //when
       double expectedResult  = 10.5;

        //Then
        Assert.assertEquals(expectedResult,ArrayOperations.getAverage(numbers),0.001);







    }
    }



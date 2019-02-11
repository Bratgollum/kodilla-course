package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAvaraghe() {
        //Given
        int i = 1;
        int[] numbers = new int[20];
        for (int n = 0; n < 20; n++) {

            numbers[n] = i;
            i++;

        }
        //when
       double expectedResult  = 10.5;

        //Then
        Assert.assertEquals(expectedResult,ArrayOperations.getAverage(numbers),0.001);







    }
    }



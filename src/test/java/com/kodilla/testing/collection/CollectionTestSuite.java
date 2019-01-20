package com.kodilla.testing.collection;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        OddNumbersExterminator numbers = new OddNumbersExterminator();
        //When
        System.out.println("Testing OddNumbersExtreminator Clas when the list is empty");
        numbers.exterminate(list);
        //Then
        Assert.assertEquals(0,list.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        // Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < 10 ; i++){
            list.add(i);
        }
        System.out.println("List has "+ list.size()+ " Numbers");

        OddNumbersExterminator numbers = new OddNumbersExterminator();
        //When
        numbers.exterminate(list);
        System.out.println("Testing exterminating Odds numbers from the list ");
        int result = list.size();
        //Then
        Assert.assertEquals(10, list.size());
    }
}

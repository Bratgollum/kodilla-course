package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public  void exterminate(ArrayList<Integer> numbers){
        for(Integer even : numbers){
            int test = numbers.get(even);
            if(test%2==0 ){
                evenNumbers.add(test);
            }
        }
        System.out.println("After extermination Odds Numbers List has : "+ evenNumbers.size()+" even Numbers left");
        for(Integer even : evenNumbers){
            System.out.println(even);
        }
    }


}

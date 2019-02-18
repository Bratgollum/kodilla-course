package com.kodilla.exception.test;

public class ExpectionHandling  {

    public static void main(String[] args ){

        SecondChallenge secondChallenge = new SecondChallenge();


        try{ System.out.println(
            secondChallenge.probablyIWillThrowException(1.25,0.25));
        } catch (Exception e){
            System.out.println("Something gone wrong ");
        }
        finally {
            System.out.println("Exception Handled ");
        }


    }
}

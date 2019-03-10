package com.kodilla.good.patterns.challenges.food2doorservice;

import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OrderService {

   public  boolean order(Supplier supplier, ProductList productList){
       if(supplier.equals(supplier) && productList.getListOfProducts().equals(productList.getListOfProducts())){
           String productNames = productList.getListOfProducts().stream().map(product -> product.getNameOfProduct())
                                 .collect(Collectors.joining(" , "));
           System.out.println("Supplier : "+supplier.getName()+ "\nNumber of Products " + productList.getListOfProducts().size()+
                              "\nProducts : " + productNames);
           return true;
       }else {
           System.out.println("Order is not ready to sent. ");
           return false;
       }
   }
}

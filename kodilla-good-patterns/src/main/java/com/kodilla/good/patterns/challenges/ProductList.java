package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product>  listOfProducts;

      public List<Product> addProductToTheList(Product product){
        listOfProducts = new ArrayList<>();
        listOfProducts.add(product);
        return listOfProducts;
      }
      public List<Product> getListOfProducts(){
        return listOfProducts;
      }
}

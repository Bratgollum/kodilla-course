package com.kodilla.good.patterns.challenges.food2doorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {


    private List<Product> listOfProducts = new ArrayList<>();

    public List<Product> addProductToTheList(Product product){
        listOfProducts.add(product);
        return listOfProducts;
    }
    public List<Product> getListOfProducts(){
        return this.listOfProducts;
    }



    }


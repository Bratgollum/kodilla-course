package com.kodilla.good.patterns.challenges.food2doorservice;

public class Product {

    private String nameOfProduct;
    private String typeOfProduct;
    private int quantityOfProduct;

    public Product(String nameOfProduct, String typeOfProduct, int quantityOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.typeOfProduct = typeOfProduct;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
}

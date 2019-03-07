package com.kodilla.good.patterns.challenges;

public class Product {

    private String nameOfProduct;
    private String typeOfProduct;
    private double prizeOfProduct;
    private int quantityOfProduct;

    public Product(String nameOfProduct, String typeOfProduct, double prizeOfProduct, int quantityOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.typeOfProduct = typeOfProduct;
        this.prizeOfProduct = prizeOfProduct;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public double getPrizeOfProduct() {
        return prizeOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
}

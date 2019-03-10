package com.kodilla.good.patterns.challenges.food2doorservice;

public class OrderRequest {

    private Supplier supplier;
    private ProductList productList;

    public OrderRequest(Supplier supplier, ProductList productList) {
        this.supplier = supplier;
        this.productList = productList;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public ProductList getProductList() {
        return productList;
    }
}

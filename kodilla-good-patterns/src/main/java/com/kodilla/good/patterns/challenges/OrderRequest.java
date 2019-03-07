package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private ProductList productList;

    public OrderRequest(ProductList productList) {
        this.productList = productList;
    }

    public OrderRequest(User user, ProductList productList) {
        this.user = user;
        this.productList = productList;
    }
    public User getUser() {return user;}

    public ProductList getProductList() {
        return this.productList;}
}

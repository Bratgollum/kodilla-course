package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {




    public OrderRequest retrieve(){

        User user = new User("Jan","Kowalski","Wroclaw","Sienkiewicza");

        Product product01 = new Product("Akkg","Headphones", 237,1);
        Product product02 = new Product("PS4", "Game Consol", 159.50,1);
        Product product03 = new Product("Samsung Tv","Tv-Led ", 200,1);

        ProductList productList = new ProductList();
        productList.addProductToTheList(product01);
        productList.addProductToTheList(product02);
        productList.addProductToTheList(product03);

        return new OrderRequest(user,productList);
    }
}

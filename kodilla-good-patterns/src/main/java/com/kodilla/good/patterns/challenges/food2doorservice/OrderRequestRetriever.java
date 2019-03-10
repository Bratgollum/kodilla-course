package com.kodilla.good.patterns.challenges.food2doorservice;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        Supplier supplier = new Supplier("Zygmunt","Warszawa","Legnicka");

        Product product01 = new Product("Milk","Liquid",10);
        Product product02 = new Product("Honey", "Liquid", 15);
        Product product03 = new Product("Chockolate ","Sweet ", 20);

        ProductList productList = new ProductList();
        productList.addProductToTheList(product01);
        productList.addProductToTheList(product02);
        productList.addProductToTheList(product03);

        return new OrderRequest(supplier,productList);
    }

    public OrderRequest retrive01() {

         Supplier supplier2 = new Supplier("Leszek","Nowa Wies","wiejska");

         Product product01 = new Product("Beef","Meat",10);
         Product product02 = new Product("Corn", "Seeds", 15);
         Product product03 = new Product("Carrot","Vegatables", 20);

         ProductList productList2 = new ProductList();
         productList2.addProductToTheList(product01);
         productList2.addProductToTheList(product02);
         productList2.addProductToTheList(product03);

         return new OrderRequest(supplier2,productList2);


    }
}

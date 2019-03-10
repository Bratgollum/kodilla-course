package com.kodilla.good.patterns.challenges.food2doorservice.glutenfreeshop;

import com.kodilla.good.patterns.challenges.food2doorservice.OrderReprository;
import com.kodilla.good.patterns.challenges.food2doorservice.ProductList;
import com.kodilla.good.patterns.challenges.food2doorservice.Supplier;

public class GlutenFreeShopOrderReprository extends OrderReprository {
    private String producentName = "GlutenFreeShop";
    @Override
    public boolean orderToSent(Supplier supplier, ProductList productList) {
        System.out.println("Producent : "+producentName);
        return super.orderToSent(supplier, productList);
    }
}

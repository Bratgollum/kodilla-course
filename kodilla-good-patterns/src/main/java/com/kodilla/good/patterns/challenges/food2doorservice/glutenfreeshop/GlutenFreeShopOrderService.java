package com.kodilla.good.patterns.challenges.food2doorservice.glutenfreeshop;

import com.kodilla.good.patterns.challenges.food2doorservice.OrderService;
import com.kodilla.good.patterns.challenges.food2doorservice.ProductList;
import com.kodilla.good.patterns.challenges.food2doorservice.Supplier;

public class GlutenFreeShopOrderService extends OrderService {
    private String producentName = "GlutenFreeShop";
    @Override
    public boolean order(Supplier supplier, ProductList productList) {
        System.out.println("Producent : "+producentName);
        return super.order(supplier, productList);
    }
}

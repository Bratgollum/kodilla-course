package com.kodilla.good.patterns.challenges.food2doorservice.healthyshop;

import com.kodilla.good.patterns.challenges.food2doorservice.OrderReprository;
import com.kodilla.good.patterns.challenges.food2doorservice.ProductList;
import com.kodilla.good.patterns.challenges.food2doorservice.Supplier;

public class HealthyShopOrderReprository extends OrderReprository {
    private String producentName = "HealthyShop";
    @Override
    public boolean orderToSent(Supplier supplier, ProductList productList) {
        System.out.println("Producent : "+producentName);
        return super.orderToSent(supplier, productList);
    }
}

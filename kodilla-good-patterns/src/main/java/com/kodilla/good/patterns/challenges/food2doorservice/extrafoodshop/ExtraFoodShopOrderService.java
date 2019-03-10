package com.kodilla.good.patterns.challenges.food2doorservice.extrafoodshop;

import com.kodilla.good.patterns.challenges.food2doorservice.OrderService;
import com.kodilla.good.patterns.challenges.food2doorservice.ProductList;
import com.kodilla.good.patterns.challenges.food2doorservice.Supplier;

public class ExtraFoodShopOrderService extends OrderService {

    private String producentName = "ExtraFoodShop";

    @Override
    public boolean order(Supplier supplier, ProductList productList) {
        System.out.println("Producent : "+producentName);
        return super.order(supplier, productList);
    }
}

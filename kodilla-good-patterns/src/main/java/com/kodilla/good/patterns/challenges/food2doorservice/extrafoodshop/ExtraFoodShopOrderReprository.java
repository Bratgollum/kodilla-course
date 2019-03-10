package com.kodilla.good.patterns.challenges.food2doorservice.extrafoodshop;

import com.kodilla.good.patterns.challenges.food2doorservice.OrderReprository;
import com.kodilla.good.patterns.challenges.food2doorservice.ProductList;
import com.kodilla.good.patterns.challenges.food2doorservice.Supplier;

public class ExtraFoodShopOrderReprository extends OrderReprository {

    private String producentName = "ExtraFoodShop";

    @Override
    public boolean orderToSent(Supplier supplier, ProductList productList) {
        System.out.println("Producent : "+producentName);
        return super.orderToSent(supplier, productList);
    }
}

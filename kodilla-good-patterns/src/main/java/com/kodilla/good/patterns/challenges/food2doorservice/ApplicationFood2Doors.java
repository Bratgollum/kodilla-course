package com.kodilla.good.patterns.challenges.food2doorservice;

import com.kodilla.good.patterns.challenges.food2doorservice.extrafoodshop.ExtraFoodShopInfService;
import com.kodilla.good.patterns.challenges.food2doorservice.extrafoodshop.ExtraFoodShopOrderReprository;
import com.kodilla.good.patterns.challenges.food2doorservice.extrafoodshop.ExtraFoodShopOrderService;
import com.kodilla.good.patterns.challenges.food2doorservice.glutenfreeshop.GlutenFreeShopInfoService;
import com.kodilla.good.patterns.challenges.food2doorservice.glutenfreeshop.GlutenFreeShopOrderReprository;
import com.kodilla.good.patterns.challenges.food2doorservice.glutenfreeshop.GlutenFreeShopOrderService;
import com.kodilla.good.patterns.challenges.food2doorservice.healthyshop.HealthyShopInfoService;
import com.kodilla.good.patterns.challenges.food2doorservice.healthyshop.HealthyShopOrderReprository;
import com.kodilla.good.patterns.challenges.food2doorservice.healthyshop.HealthyShopOrderService;

public class ApplicationFood2Doors {

    public static void main(String[] args ){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest1 = orderRequestRetriever.retrieve();
        OrderRequest orderRequest2 = orderRequestRetriever.retrive01();

        ProducentOrderService extraFoodShop = new ProducentOrderService(new ExtraFoodShopInfService(),
                                              new ExtraFoodShopOrderService(),new ExtraFoodShopOrderReprository() );
                              extraFoodShop.process(orderRequest1);
        System.out.println();
        ProducentOrderService glutenFreeShop = new ProducentOrderService(new GlutenFreeShopInfoService(),
                                               new GlutenFreeShopOrderService(), new GlutenFreeShopOrderReprository());
                              glutenFreeShop.process(orderRequest2);
        System.out.println();
        ProducentOrderService healthyShop = new ProducentOrderService(new HealthyShopInfoService(),
                                             new HealthyShopOrderService(), new HealthyShopOrderReprository());
                              healthyShop.process(orderRequest1);

    }
}

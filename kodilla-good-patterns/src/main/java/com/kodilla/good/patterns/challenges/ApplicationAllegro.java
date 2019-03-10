package com.kodilla.good.patterns.challenges;

public class ApplicationAllegro {

    public static void main(String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new AllegroInformationService(),
                                                                          new AllegroOrderService(),
                                                                          new AllegroOrderRepository() );
        productOrderService.process(orderRequest);





    }
}

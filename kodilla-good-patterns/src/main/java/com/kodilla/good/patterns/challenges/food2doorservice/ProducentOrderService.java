package com.kodilla.good.patterns.challenges.food2doorservice;

public class ProducentOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderReprository orderReprository;

    public ProducentOrderService(final InformationService informationService, final OrderService orderService, final OrderReprository orderReprository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderReprository = orderReprository;
    }

    public OrderConfirm process(OrderRequest orderRequest){
        boolean isSent = orderService.order(orderRequest.getSupplier(),orderRequest.getProductList());

        if(isSent && orderRequest.getProductList().getListOfProducts().size() > 0){
            informationService.supplierInformation(orderRequest.getSupplier());
            orderReprository.orderToSent(orderRequest.getSupplier(), orderRequest.getProductList());
            System.out.println("Order has been sent. ");
            return new OrderConfirm(orderRequest.getSupplier(), true);
            }
        else {
            System.out.println("Order has been not sent. ");
            return  new OrderConfirm(orderRequest.getSupplier(), false );
        }

    }


}

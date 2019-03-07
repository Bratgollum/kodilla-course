package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderConfirm process(final OrderRequest orderRequest){
        boolean isSent = orderService.order(orderRequest.getUser(), orderRequest.getProductList());

        try {
            if (isSent && orderRequest.getProductList().getListOfProducts().size() > 0) {
                informationService.userInformation(orderRequest.getUser());
                orderRepository.orderToSent(orderRequest.getUser(), orderRequest.getProductList());
                System.out.println("Order Succeed ");
                return new OrderConfirm(orderRequest.getUser(), true);
            } else {
                return new OrderConfirm(orderRequest.getUser(), false);
            }
        }catch (NullPointerException e ){
            System.out.println("Order Fail");
            return new OrderConfirm(orderRequest.getUser(), false);
        }

    }

}

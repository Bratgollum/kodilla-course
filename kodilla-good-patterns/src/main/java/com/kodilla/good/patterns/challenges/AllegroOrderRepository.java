package com.kodilla.good.patterns.challenges;

public class AllegroOrderRepository implements OrderRepository {
    public AllegroOrderRepository() {
    }

    @Override
    public boolean orderToSent(User user, ProductList productList) {
        return true;
    }
}

package com.kodilla.good.patterns.challenges.food2doorservice;

public class OrderConfirm {

    public Supplier supplier;
    public boolean isSent;

    public OrderConfirm(Supplier supplier, boolean isSent) {
        this.supplier = supplier;
        this.isSent = isSent;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isSent() {
        return isSent;
    }
}

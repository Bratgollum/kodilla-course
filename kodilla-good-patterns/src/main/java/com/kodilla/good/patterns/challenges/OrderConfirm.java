package com.kodilla.good.patterns.challenges;

public class OrderConfirm {
    public User user;
    public boolean isSent;

    public OrderConfirm(final User user, final boolean isSent){
        this.user = user;
        this.isSent = isSent;
    }

    public User getUser() {return user;}

    public boolean isSent() {return isSent;}
}

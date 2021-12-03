package com.learning.designPatterns.abstractactory;

public class LoggedInNSOShoppingCart implements ShopCart {
    @Override
    public void shopType() {
        System.out.println("LoggedIn NSO Cart");
    }
}

package com.learning.designPatterns.abstractactory;

public class LoggedInNSEShoppingCart implements ShopCart {
    @Override
    public void shopType() {
        System.out.println("LoggedIn NSE Cart");
    }
}

package com.learning.designPatterns.abstractactory;

public class LoggedInXUPShoppingCart implements ShopCart {
    @Override
    public void shopType() {
        System.out.println("LoggedIn XUP Cart");
    }
}

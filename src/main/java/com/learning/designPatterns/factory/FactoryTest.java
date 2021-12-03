package com.learning.designPatterns.factory;

public class FactoryTest {

    public static void main(String[] args) {
        CartFactory factory = new CartFactory();

        ShoppingCart nseShoppingCart = factory.getNSEShoppingCart();
        ShoppingCart nsoShoppingCart = factory.getNSOShoppingCart();
        ShoppingCart xupShoppingCart = factory.getXUPShoppingCart();
    }
}

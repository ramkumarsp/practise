package com.learning.designPatterns.factory;

public class CartFactory {

    public ShoppingCart getNSEShoppingCart() {
        return new NSEShoppingCart();
    }

    public ShoppingCart getNSOShoppingCart() {
        return new NSOShoppingCart();
    }

    public  ShoppingCart getXUPShoppingCart() {
        return new XUPShoppingCart();
    }
}

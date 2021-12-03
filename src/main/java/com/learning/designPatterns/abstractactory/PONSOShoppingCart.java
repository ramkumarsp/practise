package com.learning.designPatterns.abstractactory;

public class PONSOShoppingCart implements ShopCart {
    @Override
    public void shopType() {
        System.out.println("PO NSO Cart");
    }
}

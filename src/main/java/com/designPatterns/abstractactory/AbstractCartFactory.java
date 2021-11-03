package com.designPatterns.abstractactory;

public abstract class AbstractCartFactory {
    public abstract ShopCart getShopCartObject(String shopCartType);
}

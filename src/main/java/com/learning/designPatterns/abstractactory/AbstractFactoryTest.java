package com.learning.designPatterns.abstractactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractCartFactory factory = new ALPFactory();
        ShopCart shopCart = factory.getShopCartObject("NSE");
        shopCart.shopType();
        shopCart = factory.getShopCartObject("NSO");
        shopCart.shopType();
        shopCart = factory.getShopCartObject("XUP");
        shopCart.shopType();
        factory = new POFactory();
        shopCart = factory.getShopCartObject("NSE");
        shopCart.shopType();
        shopCart = factory.getShopCartObject("NSO");
        shopCart.shopType();
        shopCart = factory.getShopCartObject("XUP");
        shopCart.shopType();
        factory = new LoggedInFactory();
        shopCart = factory.getShopCartObject("NSE");
        shopCart.shopType();
        shopCart = factory.getShopCartObject("NSO");
        shopCart.shopType();
        shopCart = factory.getShopCartObject("XUP");
        shopCart.shopType();
    }
}

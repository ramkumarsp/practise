package com.learning.designPatterns.abstractactory;

public class LoggedInFactory extends AbstractCartFactory{
    public ShopCart getShopCartObject(String shopCartType){
        if(shopCartType.contains("NSE")) {
            return new LoggedInNSEShoppingCart();
        } else if(shopCartType.contains("NSO")) {
            return new LoggedInNSOShoppingCart();
        } else if (shopCartType. contains("XUP")) {
            return new LoggedInXUPShoppingCart();
        } else {
            return null;
        }
    }
}

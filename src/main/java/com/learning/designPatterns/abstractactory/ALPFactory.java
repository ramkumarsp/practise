package com.learning.designPatterns.abstractactory;

public class ALPFactory extends AbstractCartFactory{
    public ShopCart getShopCartObject(String shopCartType){
        if(shopCartType.contains("NSE")) {
            return new ALPNSEShoppingCart();
        } else if(shopCartType.contains("NSO")) {
            return new ALPNSOShoppingCart();
        } else if (shopCartType. contains("XUP")) {
            return new ALPXUPShoppingCart();
        } else {
            return null;
        }
    }
}

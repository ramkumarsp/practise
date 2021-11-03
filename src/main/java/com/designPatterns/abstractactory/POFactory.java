package com.designPatterns.abstractactory;

public class POFactory extends AbstractCartFactory{
    public ShopCart getShopCartObject(String shopCartType){
        if(shopCartType.contains("NSE")) {
            return new PONSEShoppingCart();
        } else if(shopCartType.contains("NSO")) {
            return new PONSOShoppingCart();
        } else if (shopCartType. contains("XUP")) {
            return new POXUPShoppingCart();
        } else {
            return null;
        }
    }
}

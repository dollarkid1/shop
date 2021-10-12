package com.ecommerce.shop.data.model;

public enum Currency {
    NGN("Naira"), USD("Dollar"),
    SGD("Singapore Dollar"),
    GBP("British Pounds"), CFA("Frans"),
    GHC("Ghana Cedis");

    private String name;
    Currency(String s){
        this.name = s;
    }
    private String getName(){
        return this.name;
    }

}

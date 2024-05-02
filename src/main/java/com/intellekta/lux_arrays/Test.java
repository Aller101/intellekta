/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

/**
 *
 * @author alekseynesterov
 */
public class Test {
    
    public static void main(String[] args) {
        Customer c1 = new CardCustomer("Alex", 11, 56790);
        
        System.out.println(c1.getDiscountSize());
        System.out.println(c1.getPurchaseCount());
        c1.customerInfo();
        
        Shop shop = new Shop();
//        shop.printShopSummary();
        Shop.createShopInfo();
    }
    
}

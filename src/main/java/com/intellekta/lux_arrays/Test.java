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
        Customer c2 = new CashCustomer("Alex", 4, 8990);
        
        
        Shop shop = Shop.createShopInfo();
        
        shop.printShopSummary();
        
       

    }
    
}

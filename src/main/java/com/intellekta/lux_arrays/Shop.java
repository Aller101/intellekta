/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alekseynesterov
 */
public class Shop {

    private Customer shopCustomers;

    public void printShopSummary() {
        
        shopCustomers.customerInfo();
//        for (Customer cmr : shopCustomers) {
//            cmr.customerInfo();
//        }
    }

    public static Customer createShopInfo() {
        System.out.println("Shop data:");
        Scanner keyboard = new Scanner(System.in);
        byte type = keyboard.nextByte();
        String name = keyboard.next();
        int purchaseCount = keyboard.nextInt();
        int numberOfDocOrCard = keyboard.nextInt();
        keyboard.close();
        System.out.println("exit");
        Customer newCustomer;

        if (type == 1) {
            newCustomer = new CashCustomer(name, purchaseCount, numberOfDocOrCard);
        }else{
            newCustomer = new CardCustomer(name, purchaseCount, numberOfDocOrCard);
            
        }

        return newCustomer;
    }
}

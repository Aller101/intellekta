/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alekseynesterov
 */
public class Test {

    public static void main(String[] args) {
        Customer c1 = new CardCustomer("Alex", 11, "");
        Customer c2 = new CashCustomer("Alex", 4, "");
        
        c2.customerInfo();
        c1.customerInfo();

        Shop shop = Shop.createShopInfo();
        
        shop.printShopSummary();
        
        


//        DecimalFormat df = new DecimalFormat("#### ######");
//        int a = 1234567891;
//        String s = "1234567891";
//        System.out.printf("\s%d",a);


//        Scanner scanner = new Scanner("1,abc,45,fd vc,123").useDelimiter(",");
//        while (scanner.hasNext()) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                System.out.println("Int value: " + number);
//            } else {
//                String token = scanner.next();
//                System.out.println("String value: " + token);
//            }
//        }
//        scanner.close();
    }

}

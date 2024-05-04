/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alekseynesterov
 */
public class Shop {

    private List<Customer> shopCustomers;

    public void printShopSummary() {

//        shopCustomers.customerInfo();
        for (Customer cmr : shopCustomers) {
            cmr.customerInfo();
        }
    }

    public static Shop createShopInfo() {
        System.out.println("Shop data:");

        String s1 = "2,Alex,3,,1212";
        String s2 = "1,Oleg,7,2323,";
        String s3 = "2,Misha,90,,3434";
//        String s4 = "exit";
        String s5 = s1 +"\\n"+ s2+"\\n" + s3;
        Shop shop = new Shop();
        shop.shopCustomers = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("exit")){
                System.out.println("exit");
                break;
            }

            byte type;
            String name;
            int purchaseCount;
            int documentNumber;
            int cardNumber;
            Customer newCustomer;
            try (Scanner lineScanner = new Scanner(input).useDelimiter(",")) {
                type = lineScanner.nextByte();
                name = lineScanner.next();
                purchaseCount = lineScanner.nextInt();
                if(lineScanner.hasNextInt()){
                    documentNumber = lineScanner.nextInt();
                }else{
                    lineScanner.next();
                    documentNumber = 0;
                }   if(lineScanner.hasNextInt()){
                    cardNumber = lineScanner.nextInt();
                }else{
                    
                    cardNumber = 0;
                }   
                
                System.out.println(type);
                System.out.println(name);
                System.out.println(purchaseCount);
                System.out.println(documentNumber);
                System.out.println(cardNumber);
                
            }
            
            if (type == 1) {
                newCustomer = new CashCustomer(name, purchaseCount, documentNumber);
            } else {
                newCustomer = new CardCustomer(name, purchaseCount, cardNumber);

            }
            shop.shopCustomers.add(newCustomer);
                      
        }
        scanner.close();
        
        return shop;
    }
}

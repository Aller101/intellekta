/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author alekseynesterov
 */
public class Shop {

    private List<Customer> shopCustomers;

    public void printShopSummary() {
        for (Customer cmr : shopCustomers) {
            cmr.customerInfo();
        }
    }

    public static Shop createShopInfo() {
        System.out.println("Shop data:");

        Shop shop = new Shop();
        shop.shopCustomers = new ArrayList<>();

        String s1 = "1,Tola,3,1234 123456,";
        String s2 = "2,Kata,16,,1234567890987654";
        String s3 = "2,Jora,16,,1234567890987654";
        String s4 = "1,Mishka,7,,1234567890987654";
        String s5 = "exit";
        String s6 = s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5;
//        Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(s6);

        while (true) {

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("exit");
                break;
            }

            int type;
            String name;
            int purchaseCount;
            String documentNumber;
            String cardNumber;
            Customer newCustomer;
            try (Scanner lineScanner = new Scanner(input).useDelimiter(",")) {

                type = checkHasNextInt(lineScanner);
                name = checkHasNext(lineScanner);
                purchaseCount = checkHasNextInt(lineScanner);
                documentNumber = checkHasNext(lineScanner);
                cardNumber = checkHasNext(lineScanner);

            }
            if (type == 1) {
                newCustomer = new CashCustomer(name, purchaseCount, documentNumber);
                shop.shopCustomers.add(newCustomer);
            } else if (type == 2) {
                newCustomer = new CardCustomer(name, purchaseCount, cardNumber);
                shop.shopCustomers.add(newCustomer);
            }
        }
        scanner.close();
        return shop;
    }

    //проверка int:
    //есть что читать (если читать нечего - возвращает 0, каретка не двигается), 
    //если есть что читать - возвращает значение int 
    //или двигает каретку и возвращает 0
    public static int checkHasNextInt(Scanner scanner) {
        if (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next();
                return 0;
            }
        } else {
            return 0;
        }
    }

    //проверка String:
    //есть что читать (если читать нечего - возвращает "", каретка не двигается), 
    //если есть что читать - возвращает значение String 
    //или двигает каретку и возвращает ""
    public static String checkHasNext(Scanner scanner) {
        if (scanner.hasNext()) {
            if (scanner.hasNext()) {

                return scanner.next();
            } else {
                scanner.next();
                return "";
            }
        } else {
            return "";
        }
    }

  

   
}

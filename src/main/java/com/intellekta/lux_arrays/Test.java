/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.lux_arrays;

import java.util.Scanner;

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

//        Scanner scan = new Scanner(",,").useDelimiter(",");
//        System.out.println(scan.nextLine());
        
//        System.out.println(s);




//        Scanner input = new Scanner("Люблю тебя, Петра творенье,\n" +
//               "Люблю твой строгий, стройный вид,\n" +
//               "Невы державное теченье,\n" +
//               "Береговой ее гранит");
//        
//        String s = input.nextLine();
//        
//        System.out.println(s);

    }
    
}

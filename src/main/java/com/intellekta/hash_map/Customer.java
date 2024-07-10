/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.hash_map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alekseynesterov
 */
public class Customer {

    class Client {

        private int id;

        private String name;

        private String phoneNumber;

        private double amountOfPurchases;

        public Client(int id, String name, String phoneNumber, double amountOfPurchases) {
            this.id = id>0?id:0;
            this.name = (name == null || name.isEmpty())?"noname":name;
            this.phoneNumber = (phoneNumber == null || phoneNumber.isEmpty())?"0":phoneNumber;
            this.amountOfPurchases = amountOfPurchases>0?amountOfPurchases:0;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public double getAmountOfPurchases() {
            return amountOfPurchases;
        } 

    }

    public static Map<Integer, Client> load(Client[] clents) {
        Map<Integer, Client> list = new HashMap<>();
        for (Client c : clents) {
            list.put(c.getId(), c);
        }
        return list;
    }
    
    public static Client getById(Map<Integer, Client> clients, int id){
        return clients.get(id);
    }

}

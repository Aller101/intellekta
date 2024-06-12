/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.streams.task_2;

import java.util.ArrayList;

/**
 *
 * @author alekseynesterov
 */
public class Test {
    public static String path = "src/main/java/com/intellekta/streams/task_2/clients/";
    
    public static void main(String[] args) {
        ArrayList<Client> list;
        ArrayList<Client> list2;
        ArrayList<Client> list3 = new ArrayList<>();
        list = ImportClients.createClients(path);
        ImportClients.cardsToClients(list, path);
        System.out.println("");
        list2 = ImportClients.cardsToClients(path);
        for(Client c:list2){
            System.out.println(c);
        }
        System.out.println("");
        ImportClients.checkImport(list2);
    }
}

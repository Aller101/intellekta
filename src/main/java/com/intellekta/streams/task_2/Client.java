/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.streams.task_2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alekseynesterov
 */
public class Client implements Serializable{
    
    private String name;
    
    private ContactPerson contactPerson;
    
    private ArrayList<Requisite> requisite;

    public Client(String name, ContactPerson contactPerson, ArrayList<Requisite> requisite) {
        this.name = name;
        this.contactPerson = contactPerson;
        this.requisite = requisite;
    }

    public Client(String line) {
        String[] param = line.split(";");
        this.name = param[0];
        this.contactPerson = new ContactPerson(param[1]);
        this.requisite = new ArrayList<>();
        for(String item:param[2].split(",", -1)){
            Requisite req = new Requisite(item);
            this.requisite.add(req);
        }
    }
    
    

    public String getName() {
        return name;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public ArrayList<Requisite> getRequisite() {
        return requisite;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", contactPerson=" + contactPerson + ", requisite=" + requisite + '}';
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.streams.task_2;

import java.io.Serializable;

/**
 *
 * @author alekseynesterov
 */
class ContactPerson implements Serializable {

    private String name;

    private String email;

    private String phone;

    public ContactPerson(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public ContactPerson(String line) {
        String[] data = line.split(",", -1);
        this.email = data[1];
        this.name = data[0];
        this.phone = data[2];
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "ContactPerson{" + "name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }
    

}

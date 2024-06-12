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
class Requisite implements Serializable {

    private String name;

    private String value;

    public Requisite(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Requisite(String line) {
        String[] data = line.split(":", -1);
        this.name = data[0];
        this.value = data[1];
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Requisite{" + "name=" + name + ", value=" + value + '}';
    }
    
    

}

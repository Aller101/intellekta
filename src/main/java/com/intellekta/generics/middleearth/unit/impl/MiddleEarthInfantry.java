/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit.impl;

import com.intellekta.generics.middleearth.unit.Infantry;
import com.intellekta.generics.middleearth.unit.MiddleEarthUnit;

/**
 *
 * @author alekseynesterov
 */
public class MiddleEarthInfantry implements Infantry, MiddleEarthUnit {

    private String name;

    public MiddleEarthInfantry(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MiddleEarthInfantry{" + "name=" + name + '}';
    }

}

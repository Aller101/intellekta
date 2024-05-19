/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit.impl;

import com.intellekta.generics.middleearth.unit.Infantry;
import com.intellekta.generics.middleearth.unit.MordorUnit;

/**
 *
 * @author alekseynesterov
 */
public class MordorInfantry implements Infantry, MordorUnit {

    private String name;

    public MordorInfantry(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MordorInfantry{" + "name=" + name + '}';
    }

}

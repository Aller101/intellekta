/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit.impl;

import com.intellekta.generics.middleearth.unit.Cavalry;
import com.intellekta.generics.middleearth.unit.MordorUnit;

/**
 *
 * @author alekseynesterov
 */
public class MordorCavalry implements MordorUnit, Cavalry {

    private String name;

    public MordorCavalry(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MordorCavalry{" + "name=" + name + '}';
    }

}

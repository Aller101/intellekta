/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit.mordorunit.impl;

import com.intellekta.generics.middleearth.unit.AbstractUnitCavalry;
import com.intellekta.generics.middleearth.unit.Cavalry;
import com.intellekta.generics.middleearth.unit.mordorunit.Orc;
import java.util.Random;

/**
 *
 * @author alekseynesterov
 */
public class UrukHai extends AbstractUnitCavalry implements Orc, Cavalry{
    
    public UrukHai(String name) {
        super(name, new Random().nextInt(10, 12+1));
        this.warg = new Warg();
    }
    
}

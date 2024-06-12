/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit.middleearthunit.impl;

import com.intellekta.generics.middleearth.unit.AbstractUnitCavalry;
import com.intellekta.generics.middleearth.unit.Cavalry;
import com.intellekta.generics.middleearth.unit.middleearthunit.MiddleEarthUnit;
import java.util.Random;

/**
 *
 * @author alekseynesterov
 */
public class Wizard extends AbstractUnitCavalry implements MiddleEarthUnit, Cavalry{
    
    public Wizard(String name) {
        super(name, 20);
        this.horse = new Horse();
    }
    
}

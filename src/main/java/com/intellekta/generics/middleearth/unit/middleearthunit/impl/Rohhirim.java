/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit.middleearthunit.impl;

import com.intellekta.generics.middleearth.unit.AbstractUnitCavalry;
import com.intellekta.generics.middleearth.unit.Cavalry;
import com.intellekta.generics.middleearth.unit.middleearthunit.Human;
import java.util.Random;


/**
 *
 * @author alekseynesterov
 */
public class Rohhirim extends AbstractUnitCavalry implements Human, Cavalry{

    public Rohhirim(String name) {
        super(name, new Random().nextInt(7, 8+1));
        this.horse = new Horse();
    }
    
    
}

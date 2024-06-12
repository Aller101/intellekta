/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit.middleearthunit.impl;

import com.intellekta.generics.middleearth.unit.AbstractUnit;
import com.intellekta.generics.middleearth.unit.Infantry;
import com.intellekta.generics.middleearth.unit.middleearthunit.MiddleEarthUnit;
import java.util.Random;

/**
 *
 * @author alekseynesterov
 */
public class Elf extends AbstractUnit implements MiddleEarthUnit, Infantry{
    
    public Elf(String name) {
        super(name, new Random().nextInt(4,7+1));
    }
    
}

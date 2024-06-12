/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit.mordorunit.impl;

import com.intellekta.generics.middleearth.unit.AbstractUnit;
import com.intellekta.generics.middleearth.unit.Infantry;
import com.intellekta.generics.middleearth.unit.mordorunit.MordorUnit;
import java.util.Random;

/**
 *
 * @author alekseynesterov
 */
public class Goblin extends AbstractUnit implements MordorUnit, Infantry{
    
    public Goblin(String name) {
        super(name, new Random().nextInt(2, 5+1));
    }
    
}

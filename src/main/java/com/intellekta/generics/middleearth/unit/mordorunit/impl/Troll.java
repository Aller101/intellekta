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
public class Troll extends AbstractUnit implements MordorUnit, Infantry{
    
    public Troll(String name) {
        super(name, new Random().nextInt(11, 15+1));
    }
    
}

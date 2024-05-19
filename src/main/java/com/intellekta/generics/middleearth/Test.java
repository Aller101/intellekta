/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth;

import com.intellekta.generics.middleearth.unit.Cavalry;
import com.intellekta.generics.middleearth.unit.MiddleEarthUnit;
import com.intellekta.generics.middleearth.unit.MordorUnit;
import com.intellekta.generics.middleearth.unit.Unit;
import com.intellekta.generics.middleearth.unit.impl.MiddleEarthCavalry;
import com.intellekta.generics.middleearth.unit.impl.MiddleEarthInfantry;
import com.intellekta.generics.middleearth.unit.impl.MordorCavalry;
import com.intellekta.generics.middleearth.unit.impl.MordorInfantry;

/**
 *
 * @author alekseynesterov
 */
public class Test{
    public static void main(String[] args) {
        
        MiddleEarthUnit u1 = new MiddleEarthCavalry("Stepa");
        MiddleEarthUnit u2 = new MiddleEarthCavalry("Fedia");
        MiddleEarthUnit u3 = new MiddleEarthInfantry("Kostia");
        
        MordorUnit u4 = new MordorCavalry("Shreak");
        MordorUnit u5 = new MordorInfantry("Fiona");
        MordorUnit u6 = new MordorInfantry("Ogr");
        
        Army<MiddleEarthUnit> army1 = new Army<>(MiddleEarthUnit.class);
        army1.recruit(u1);
        army1.recruit(u2);
        army1.recruit(u3);
        
        
//        System.out.println(army1.getArmy());
//        army1.print();
//        System.out.println(army1.getRandomUnit(u1));
//        System.out.println(army1.getRandomUnit());
        army1.release(u2);
        army1.print();
        
        
   
    }
    
}



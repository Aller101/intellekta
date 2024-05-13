/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth;

import com.intellekta.generics.middleearth.unit.MordorUnit;
import com.intellekta.generics.middleearth.unit.MiddleEarthUnit;

/**
 *
 * @author alekseynesterov
 */
public class Test {
    public static void main(String[] args) {
        Army<MiddleEarthUnit> army1 = new Army();
        Army army2 = new Army();
        
        MiddleEarthUnit man1 = new MiddleEarthUnit("mr. Vasia");
        MiddleEarthUnit man2 = new MiddleEarthUnit("mr. Kolia");
        
        MordorUnit orc1 = new MordorUnit("ogr. ick");
        MordorUnit orc2 = new MordorUnit("ogr. Fiona");
        
//        army1.recruit(new Cavalry<>(orc1));
        
        Cavalry<MiddleEarthUnit> c1 = new Cavalry(new MiddleEarthUnit("mr. Oleg"));
//        Cavalry<MordorUnit> c2 = new Cavalry<>(new MiddleEarthUnit("mr. Tim"));
        Cavalry<MiddleEarthUnit> c3 = new Cavalry<>(new MiddleEarthUnit("mr. Yasha"));
        Cavalry<MordorUnit> c4 = new Cavalry<>(new MordorUnit("ogr. Shrek"));
        Cavalry<MiddleEarthUnit> c5 = new Cavalry<>(null);
        
        
        Infantry<MiddleEarthUnit> i1 = new Infantry<>(man1);
//        Cavalry<MiddleEarthUnit> c6 = new Cavalry<>(orc2);
        
        army1.recruit(c1);
//        army1.recruit(c2);
        army1.recruit(c3);
//        army1.recruit(c4);
        army1.recruit(c5);
        army1.recruit(i1);
//        army1.recruit(c6);
//        army1.recruit(middleEarthUnit);
        
//        System.out.println(army1.getCavalry());
//        System.out.println(army1.getInfantry());
        
        
        
        army1.print();
        
//        army1.release("Shrek");
        army1.print();
        
        MiddleEarthUnit m = army1.getRandomUnit();
        MiddleEarthUnit m2 = army1.getRandomUnit(c3);
        System.out.println(m);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth;

import com.intellekta.generics.middleearth.unit.middleearthunit.MiddleEarthUnit;
import com.intellekta.generics.middleearth.unit.middleearthunit.impl.Elf;
import com.intellekta.generics.middleearth.unit.middleearthunit.impl.Rohhirim;
import com.intellekta.generics.middleearth.unit.middleearthunit.impl.Wizard;
import com.intellekta.generics.middleearth.unit.middleearthunit.impl.WoodenElf;
import com.intellekta.generics.middleearth.unit.mordorunit.MordorUnit;
import com.intellekta.generics.middleearth.unit.mordorunit.impl.Goblin;
import com.intellekta.generics.middleearth.unit.mordorunit.impl.Troll;
import com.intellekta.generics.middleearth.unit.mordorunit.impl.UrukHai;


/**
 *
 * @author alekseynesterov
 */
public class Test{
    public static void main(String[] args) {
        
        Rohhirim rohhirim = new Rohhirim("Eomer");
        Wizard wizard = new Wizard("Gandalf");
        Elf elf = new Elf("Legolas");
        WoodenElf woodenElf = new WoodenElf("Fangorn");
        
        Goblin goblin = new Goblin("Muzgash");
        UrukHai urukHai = new UrukHai("Shagrat");
        Troll troll = new Troll("Troll");
        
        
        
        
        Army armyOfFriends = new Army(MiddleEarthUnit.class);
        Army armyOfEnemies = new Army(MordorUnit.class);
        
        armyOfFriends.recruit(rohhirim);
        armyOfFriends.recruit(wizard);
        armyOfFriends.recruit(elf);
        armyOfFriends.recruit(woodenElf);
        
        armyOfEnemies.recruit(goblin);
        armyOfEnemies.recruit(troll);
        armyOfEnemies.recruit(urukHai);
        
        
        
        armyOfFriends.print();
        System.out.println("");
        armyOfEnemies.print();
        System.out.println("");
        
        rohhirim.strike(urukHai);
        System.out.println(urukHai.warg.isAlive());
        rohhirim.strike(urukHai);
        System.out.println(urukHai.isAlive());
        System.out.println("");
        
        System.out.println(troll.toString());
        rohhirim.strike(troll);
        System.out.println(troll.isAlive());
        System.out.println("");
        
        goblin.strike(rohhirim);
        System.out.println(rohhirim.isAlive());
        System.out.println(rohhirim.toString());
        System.out.println(rohhirim.horse.getPower());
        System.out.println("");
        goblin.strike(rohhirim);
        System.out.println(rohhirim.isAlive());
        System.out.println(rohhirim.toString());
        System.out.println(rohhirim.horse.getPower());
        System.out.println("");
        goblin.strike(rohhirim);
        System.out.println(rohhirim.isAlive());
        System.out.println(rohhirim.toString());
        System.out.println(rohhirim.horse.getPower());
        armyOfFriends.print();
        armyOfEnemies.print();

   
    }
    
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit;

import java.util.Random;

/**
 *
 * @author alekseynesterov
 */
public abstract class AbstractUnitCavalry extends AbstractUnit {

    public Horse horse = null;
    public Warg warg = null;

    public AbstractUnitCavalry(String name, int power) {
        super(name, power);
    }

    @Override
    public int getPower() {
        if (horse != null && horse.isAlive()) {
            return super.getPower() + horse.getPower();
        } else if (warg != null && warg.isAlive()) {
            return super.getPower() + warg.getPower();
        }
        return super.getPower();
    }

    @Override
    public void damage(int damage) {
        if (horse != null && horse.isAlive()) {
            horse.damage(damage);
        } else if (warg != null && warg.isAlive()) {
            warg.damage(damage);
        } else {
            super.damage(damage);
        }
    }

    @Override
    public <T extends AbstractUnit> void strike(T unit) {
        unit.damage(this.getPower());
    }

    public class Horse extends AbstractUnit {

        public Horse() {
            super("", new Random().nextInt(4, 5 + 1));
        }

    }

    public class Warg extends AbstractUnit {

        public Warg() {
            super("", new Random().nextInt(4, 7 + 1));
        }

    }

}

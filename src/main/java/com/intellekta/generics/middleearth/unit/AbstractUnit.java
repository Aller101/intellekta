/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth.unit;

/**
 *
 * @author alekseynesterov
 */
public abstract class AbstractUnit implements Unit {

    private String name;

    private int power;

    public AbstractUnit(String name, int power) {
        this.name = (name == null || name.isEmpty()) ? super.toString() : name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void damage(int damage) {
        if (damage < 0 || !this.isAlive()) {
            return;
        }
        if (this.power > damage) {
            this.power -= damage;
        } else {
            this.power = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return power > 0;
    }

    public <T extends AbstractUnit> void strike(T unit) {
        unit.damage(this.getPower());
    }

    @Override
    public String toString() {
        return String.format("%s %s has power %d", this.getClass().getSimpleName(), name, power);
    }

}

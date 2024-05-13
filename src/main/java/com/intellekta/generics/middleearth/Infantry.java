/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth;

import com.intellekta.generics.middleearth.unit.Unit;

/**
 *
 * @author alekseynesterov
 */
public class Infantry<T extends Unit> {

    private final T unit;

    public Infantry(T t) {
        this.unit = t;
    }

    public T getUnit() {
        return unit;
    }

    public String getName() {
        return unit.getName();
    }

    @Override
    public String toString() {
        return "Infantry{" + "unit=" + unit + '}';
    }

}

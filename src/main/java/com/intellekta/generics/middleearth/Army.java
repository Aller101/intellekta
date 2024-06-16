/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth;

import com.intellekta.generics.middleearth.unit.Infantry;
import com.intellekta.generics.middleearth.unit.Cavalry;
import com.intellekta.generics.middleearth.unit.Unit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author alekseynesterov
 */
public class Army<T extends Unit> {

    private ArrayList<Cavalry> cavalry = new ArrayList<>();
    private ArrayList<Infantry> infantry = new ArrayList<>();

    private Class<T> type;

    public Army(Class<T> type) {
        this.type = type;
    }

    public Class<T> getType() {
        return type;
    }

    public ArrayList<Cavalry> getCavalry() {
        return cavalry;
    }

    public ArrayList<Infantry> getInfantry() {
        return infantry;
    }

    //возвращает список всех войнов (в последовательности:
    //сначала вся кавалерия, затем вся пехота)
    public ArrayList<T> getArmy() {
        ArrayList<T> list = new ArrayList<>();
        for (Cavalry c : cavalry) {
            list.add((T) c);
        }
        for (Infantry i : infantry) {
            list.add((T) i);
        }
        return list;
    }

    //метод для найма кавалерии и пехоты
    public boolean recruit(T unit) {
        if (type.isInstance(unit)) {
            if (unit instanceof Cavalry) {
                if ((unit != null)
//                        && (!unit..isBlank())
                        ) {
                    cavalry.add((Cavalry) unit);
                    return true;
                } else {
                    return false;
                }
            } else if (unit instanceof Infantry) {
                if ((unit != null)
//                        && (!unit.getName().isBlank())
                        ) {
                    infantry.add((Infantry) unit);
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;
    }

    public void print() {

        String nl = System.getProperty("line.separator");
        for (Cavalry c : cavalry) {
            System.out.printf("%s%s", c, nl);
        }
        for (Infantry i : infantry) {
            System.out.printf("%s%s", i, nl);
        }
    }

    public boolean release(T unit) {
        if(unit instanceof Cavalry){
            return cavalry.remove(unit);
        }else if(unit instanceof Infantry){
            return infantry.remove(unit);
        }
        return false;
    }

    //метод для получения случайного воина из армии
    public T getRandomUnit() {
        List<T> list = this.getArmy();
        if (!list.isEmpty()) {
            Random random = new Random();
            return list.get(random.nextInt(list.size()));
        } else {
            return null;
        }
    }

    //перегруженный метод для получения случайного воина из армии,
    //тип которого указан в параметрах к методу
    public T getRandomUnit(T unit) {
        if (unit instanceof Cavalry) {
            if (!cavalry.isEmpty()) {
                Random random = new Random();
                return (T) cavalry.get(random.nextInt(cavalry.size()));
            } else {
                return null;
            }
        } else if (unit instanceof Infantry) {
            if (!infantry.isEmpty()) {
                Random random = new Random();
                return (T) infantry.get(random.nextInt(infantry.size()));
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Army{" + "cavalry=" + cavalry + ", infantry=" + infantry + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth;

import com.intellekta.generics.middleearth.unit.Unit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author alekseynesterov
 */
public class Army<T extends Unit> {

    private List<Cavalry<T>> cavalry = new ArrayList<>();
    private List<Infantry<T>> infantry = new ArrayList<>();

    public List<Cavalry<T>> getCavalry() {
        return cavalry;
    }

    public List<Infantry<T>> getInfantry() {
        return infantry;
    }

    //возвращает список всех войнов (в последовательности:
    //сначала вся кавалерия, затем вся пехота)
    public List<T> getArmy() {
        List<T> list = new ArrayList<>();
        for (Cavalry<T> c : cavalry) {
            list.add(c.getUnit());
        }
        for (Infantry<T> i : infantry) {
            list.add(i.getUnit());
        }
        return list;
    }

    //метод для найма кавалерии
    public boolean recruit(Cavalry<T> c) {
        if ((c.getUnit() != null)
                && (!c.getName().isBlank())) {
            cavalry.add(c);
            return true;
        } else {
            return false;
        }
    }

    //метод для найма пехоты
    public boolean recruit(Infantry<T> i) {
        if ((i.getUnit() != null)
                && (!i.getName().isBlank())) {
            infantry.add(i);
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        for (Cavalry<T> c : cavalry) {
            System.out.println(c);
        }
        for (Infantry<T> i : infantry) {
            System.out.println(i);
        }
    }

    public boolean release(T t) {
        String name = t.getName();
        for (Cavalry<T> c : cavalry) {
            if (c.getUnit().getName().equals(name)) {
                cavalry.remove(c);
                return true;
            }
        }
        for (Infantry<T> i : infantry) {
            if (i.getUnit().getName().equals(name)) {
                infantry.remove(i);
                return true;
            }
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
    public T getRandomUnit(Cavalry<T> t) {
        
        List<Cavalry<T>> listCavalrys = this.getCavalry();
        if (!listCavalrys.isEmpty()) {
            Random random = new Random();
            return listCavalrys.get(random.nextInt(listCavalrys.size())).getUnit();
        } else {
            return null;
        }
    }
    
    //перегруженный метод для получения случайного воина из армии,
    //тип которого указан в параметрах к методу
    public T getRandomUnit(Infantry<T> t) {
        
        List<Infantry<T>> listInfantrys = this.getInfantry();
        if (!listInfantrys.isEmpty()) {
            Random random = new Random();
            return listInfantrys.get(random.nextInt(listInfantrys.size())).getUnit();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Army{" + "cavalry=" + cavalry + ", infantry=" + infantry + '}';
    }

}

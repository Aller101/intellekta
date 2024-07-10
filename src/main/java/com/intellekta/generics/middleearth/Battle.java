/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.generics.middleearth;

import com.intellekta.generics.middleearth.unit.AbstractUnit;
import com.intellekta.generics.middleearth.unit.Unit;
import com.intellekta.generics.middleearth.unit.middleearthunit.MiddleEarthUnit;
import com.intellekta.generics.middleearth.unit.middleearthunit.impl.Elf;
import com.intellekta.generics.middleearth.unit.middleearthunit.impl.Rohhirim;
import com.intellekta.generics.middleearth.unit.middleearthunit.impl.Wizard;
import com.intellekta.generics.middleearth.unit.middleearthunit.impl.WoodenElf;
import com.intellekta.generics.middleearth.unit.mordorunit.MordorUnit;
import com.intellekta.generics.middleearth.unit.mordorunit.impl.Goblin;
import com.intellekta.generics.middleearth.unit.mordorunit.impl.Troll;
import com.intellekta.generics.middleearth.unit.mordorunit.impl.UrukHai;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author alekseynesterov
 */
public class Battle {

    private static final int MAX_ARMY_SIZE = 10;
    private static final int MIN_ARMY_SIZE = 8;
    private static final Random random = new Random();

    private static int indexOfSolder = 0;
    private static int sizeFirstArmy = 0;
    //после первого создания армии переменная "sizeFirstArmy" меняться не будет
    private static boolean sizeOfArmyWasChanged = false;

    public static void fight() {
        Army armyOfEnemies = new Army(MordorUnit.class);
        createArmy(armyOfEnemies);
        armyOfEnemies.print();

        Army armyOfFriends = new Army(MiddleEarthUnit.class);
        createArmy(armyOfFriends);
        armyOfFriends.print();

        fight(armyOfEnemies, armyOfFriends);
    }

    public static <T extends AbstractUnit> void fight(Army<T> armyOne, Army<T> armyTwo) {

        System.out.println("phase 1");
        // maybe or?
        while (!armyOne.getCavalry().isEmpty() && !armyTwo.getCavalry().isEmpty()) {
            startBattle(armyOne.getRandomUnit((T) armyOne.getCavalry().get(0)),
                    armyTwo.getRandomUnit((T) armyTwo.getCavalry().get(0)));

            checkAndDeleteDeadSoldiers(armyOne);
            checkAndDeleteDeadSoldiers(armyTwo);
        }

        System.out.println((!armyOne.getCavalry().isEmpty() ? armyOne.getType().getSimpleName() : armyTwo.getType().getSimpleName()) + " is winning in 1 phase");

        //можно вывести кавалерию...
        if (!armyOne.getCavalry().isEmpty()) {
            printResults(armyOne.getCavalry());
        } else {
            printResults(armyTwo.getCavalry());
        }

        System.out.println("phase 2");
        while (!armyOne.getInfantry().isEmpty() && !armyTwo.getInfantry().isEmpty()) {
            startBattle(armyOne.getRandomUnit((T) armyOne.getInfantry().get(0)),
                    armyTwo.getRandomUnit((T) armyTwo.getInfantry().get(0)));

            checkAndDeleteDeadSoldiers(armyOne);
            checkAndDeleteDeadSoldiers(armyTwo);
        }
        System.out.println((!armyOne.getInfantry().isEmpty() ? armyOne.getType().getSimpleName() : armyTwo.getType().getSimpleName()) + " is winning in 2 phase");

        //можно вывести пеших войнов...
        if(!armyOne.getInfantry().isEmpty()){
            printResults(armyOne.getInfantry());
        }else{
            printResults(armyTwo.getInfantry());
        }
        
        System.out.println("phase 3");

        while (!armyOne.getArmy().isEmpty() && !armyTwo.getArmy().isEmpty()) {
            startBattle(armyOne.getRandomUnit((T) armyOne.getRandomUnit()),
                    armyTwo.getRandomUnit((T) armyTwo.getRandomUnit()));

            checkAndDeleteDeadSoldiers(armyOne);
            checkAndDeleteDeadSoldiers(armyTwo);
        }
        System.out.println((!armyOne.getArmy().isEmpty() ? armyOne.getType().getSimpleName() : armyTwo.getType().getSimpleName()) + " is winning in 3 phase");
        if(!armyOne.getArmy().isEmpty()){
            printResults(armyOne.getArmy());
        }else{
            printResults(armyTwo.getArmy());
        }

    }

    //создаем армию
    public static <T extends Unit> void createArmy(Army<T> army) {

        int sizeOfArmy = 0;
        if (sizeFirstArmy == 0) {
            sizeOfArmy = random.nextInt(MIN_ARMY_SIZE, MAX_ARMY_SIZE);
        } else {
            //если армия уже есть - создем новую больше или меньше первой армии на 20%
            sizeOfArmy = random.nextInt((int) (sizeFirstArmy * 0.80), (int) (sizeFirstArmy * 1.2));
            sizeOfArmyWasChanged = true;
        }

        if (army.getType().getSimpleName().equals("MordorUnit")) {
            for (int i = 0; i < sizeOfArmy; i++) {
                army.recruit((T) createUnit(true));
            }
        } else if (army.getType().getSimpleName().equals("MiddleEarthUnit")) {
            for (int i = 0; i < sizeOfArmy; i++) {
                army.recruit((T) createUnit(false));
            }
            //создает волшебника или не создает
            if (random.nextBoolean()) {
                army.recruit((T) new Wizard("<Gendalf" + indexOfSolder++ + ">"));
            }

        } else {
            System.out.println("Какой тип армии?");
            System.out.println(army.getType());
        }
        indexOfSolder = 0;

        if (!sizeOfArmyWasChanged) {
            sizeFirstArmy = sizeOfArmy;
        }
    }

    //создаем война
    private static <T extends Unit> Unit createUnit(boolean isMordor) {

        if (isMordor) {
            return switch (random.nextInt(1, 4)) {
                case 1 ->
                    new Goblin("<" + indexOfSolder++ + ">");
                case 2 ->
                    new Troll("<" + indexOfSolder++ + ">");
                case 3 ->
                    new UrukHai("<" + indexOfSolder++ + ">");
                default ->
                    null;
            };
        } else {
            return switch (random.nextInt(1, 4)) {
                case 1 ->
                    new Elf("<" + indexOfSolder++ + ">");
                case 2 ->
                    new Rohhirim("<" + indexOfSolder++ + ">");
                case 3 ->
                    new WoodenElf("<" + indexOfSolder++ + ">");
                default ->
                    null;
            };
        }
    }

    public static <T extends AbstractUnit> void startBattle(T u1, T u2) {
        //проверяем живы ли войны
        if (u1.isAlive() && u2.isAlive()) {

            //выбераем кто первый бьет
            if (random.nextBoolean()) {
                System.out.println(u1.toString() + " strikes " + u2.toString());
                u1.strike(u2);
                System.out.println(u1.toString() + (u2.isAlive() ? " does not kill " : " kills ") + u2.toString());

                //если живой - бьет в ответ 
                if (u2.isAlive()) {

                    System.out.println(u2.toString() + " strikes back " + u1.toString());
                    u2.strike(u1);
                    System.out.println(u2.toString() + (u1.isAlive() ? " does not kill " : " kills ") + u1.toString());
                }
            } else {
                System.out.println(u2.toString() + " strikes " + u1.toString());
                u2.strike(u1);
                System.out.println(u2.toString() + (u1.isAlive() ? " does not kill " : " kills ") + u1.toString());

                //если живой - бьет в ответ 
                if (u1.isAlive()) {

                    System.out.println(u1.toString() + " strikes back " + u2.toString());
                    u1.strike(u2);
                    System.out.println(u1.toString() + (u2.isAlive() ? " does not kill " : " kills ") + u2.toString());
                }
            }
        }
    }

    //проходимся по армии и удаляем погибших войнов
    public static <T extends Unit> void checkAndDeleteDeadSoldiers(Army<T> army) {
        Iterator iterator = army.getArmy().iterator();
        while (iterator.hasNext()) {
            AbstractUnit unit = (AbstractUnit) iterator.next();
            if (!unit.isAlive()) {
                army.release((T) unit);
            }
        }
    }

    //wildcards
    //выводит выживших солдат
    public static void printResults(ArrayList<?> list) {
        Iterator iterator = list.iterator();
        System.out.print("Surviving soldiers: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "; ");
        }
        System.out.println("");

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.stack_dequeue_linkedList;



/**
 *
 * @author alekseynesterov
 */
public class Test {
    public static void main(String[] args) {
        Subsystem sub1 = new MySubsystem("ComponentA", 1, new Subsystem[]{});
        Subsystem sub2 = new MySubsystem("ComponentA", 2, new Subsystem[]{sub1});
        Subsystem sub3 = new MySubsystem("ComponentB", 1, new Subsystem[]{sub1});
        Subsystem sub4 = new MySubsystem("ComponentC", 1, new Subsystem[]{sub2, sub3});
        
        Installer installer = new Installer("MainComponent", 1, new Subsystem[]{sub4});
        installer.setUp();

//        installer.setUpTest();

    }
}

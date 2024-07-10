/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.stack_dequeue_linkedList;


/**
 *
 * @author alekseynesterov
 */
public class MySubsystem implements Subsystem {
    private String name;
    private int version;
    private Subsystem[] prerequisites;

    public MySubsystem(String name, int version, Subsystem[] prerequisites) {
        this.name = name;
        this.version = version;
        this.prerequisites = prerequisites;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getVersion() {
        return version;
    }

    @Override
    public void install() {
        System.out.println(name + " version " + version + " installed successfully");
    }

    @Override
    public Subsystem[] getPrerequisites() {
        return prerequisites;
    }
}

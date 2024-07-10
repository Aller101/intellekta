/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.stack_dequeue_linkedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author alekseynesterov
 */
public class Installer implements Subsystem {

    private String name;

    private int version;

    private Subsystem[] prerequisites;

    private Queue<Subsystem> installationQueue = new LinkedList<>();

    @Override
    public void install() {
        String separator = System.getProperty("line.separator");
        System.out.printf("%s version %d installed successfully %s",
                this.getName(), this.getVersion(), separator);
    }

    public Installer() {
        this.name = "noname";
        this.version = 1;
    }

    public Installer(String name, int version, Subsystem[] prerequisites) {
        this.name = name;
        this.version = version;
        this.prerequisites = prerequisites;
    }

    public void setUp() {
        Queue<Subsystem> plan = setUpPlan();
        while (!plan.isEmpty()) {
            Subsystem subsystem = plan.poll();
            subsystem.install();
        }
    }

    private Queue<Subsystem> setUpPlan() {
        installationQueue.clear();
        try {
            LinkedList<Subsystem> stack = new LinkedList<>();
            topologicalSort(this, stack);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

            //Возвращаем пустую очередь если что-то не так
            return new LinkedList<>();
        }
        return installationQueue;
    }

    private void topologicalSort(Subsystem subsystem, LinkedList<Subsystem> stack) {
        if (subsystem == null) {
            throw new IllegalArgumentException("SetUp plan calculation failed.");
        }

        if (stack.contains(subsystem)) {
            throw new IllegalArgumentException("SetUp plan calculation failed."
                    + " Wrong prerequisite description at "+
                    subsystem.getName() + " "+ subsystem.getVersion()+ ".");
        }

        stack.push(subsystem);
        for (Subsystem prereq : subsystem.getPrerequisites()) {
            topologicalSort(prereq, stack);
        }
        stack.pop();

        //Проверяем, есть ли этот subsystem уже в installationQueue
        for (Subsystem s : installationQueue) {
            if (s.getName().equals(subsystem.getName()) && s.getVersion() == subsystem.getVersion()) {
                return;
            }
        }
        installationQueue.add(subsystem);
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
    public Subsystem[] getPrerequisites() {
        return prerequisites;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Installer installer = (Installer) obj;
        return version == installer.version && name.equals(installer.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + version;
        return result;
    }
    
}

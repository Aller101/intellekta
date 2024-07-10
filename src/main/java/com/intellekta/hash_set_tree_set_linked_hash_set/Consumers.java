/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.hash_set_tree_set_linked_hash_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author alekseynesterov
 */
public class Consumers {

    private HashSet<Consumer> consumers;

    public Consumers() {
        if (consumers == null) {
            consumers = new HashSet<>();
        }
    }

    public Consumers(List<Consumer>[] arrayOfLists) {
        if (consumers == null) {
            consumers = new HashSet<>();
        }
        for (List<Consumer> list : arrayOfLists) {
            consumers.addAll(list);
        }
    }

    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public List<Consumer> getConsumers() {
        return List.copyOf(consumers);
    }

}

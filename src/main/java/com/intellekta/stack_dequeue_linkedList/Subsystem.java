/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta.stack_dequeue_linkedList;

/**
 *
 * @author alekseynesterov
 */
public interface Subsystem {
    
    String getName();
    
    int getVersion();
    
    void install();
    
    Subsystem[] getPrerequisites();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intellekta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alekseynesterov
 */

public class CinemaApplicationRun {
    
    
    public static void main(String[] args) {
        
        ArrayList<Viewer> lists = new ArrayList<>(List.of(
                
                new Viewer("Ola", 12, 3),
                new Viewer("Kola", 13, 33),
                new Viewer("Tolia", 38, 12),
                new Viewer("Sam", 56, 76),
                new Viewer("Tanuxa", 47, 7)
                
        ));

        System.out.println(ViewerStatistics.averageAge(lists));
    }
    
    
}
